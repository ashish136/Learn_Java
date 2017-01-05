package notprogram;

import comexample.actionbarnew.*;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class array extends ActionBarActivity implements OnQueryTextListener,OnItemClickListener {
	 ListView lv;
	 ArrayAdapter<String> ad;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(comexample.actionbarnew.R.layout.arraylist);
        lv=(ListView) findViewById(comexample.actionbarnew.R.id.listView1);
        ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(comexample.actionbarnew.R.array.arrayprg));
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	 getMenuInflater().inflate(comexample.actionbarnew.R.menu.main, menu);
        MenuItem mv=menu.findItem(comexample.actionbarnew.R.id.action_search);
        SearchView sv=(SearchView) MenuItemCompat.getActionView(mv);
        sv.setOnQueryTextListener(this);
         return true;
    }
    
	@Override
	public boolean onQueryTextChange(String newtext) {
		ad.getFilter().filter(newtext);
		return true;
	}


	@Override
	public boolean onQueryTextSubmit(String newtext) {
	   return false;
	}

	public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
		TextView clickedview=(TextView) view;
		 if(clickedview.getText().toString().equals("Binary Search" ))
			startActivity(new Intent(array.this,Binary_.class));
		else if(clickedview.getText().toString().equals("Bubble Sort" ))
			startActivity(new Intent(array.this,Bubblesort.class));
		else if(clickedview.getText().toString().equals("Selection sort" ))
			startActivity(new Intent(array.this,Selection.class));
		else if(clickedview.getText().toString().equals("sum of array elements" ))
			startActivity(new Intent(array.this,Arrsum.class));
		else if(clickedview.getText().toString().equals("Linear search" ))
			startActivity(new Intent(array.this,Linear.class));
		else if(clickedview.getText().toString().equals("input & display array" ))
			startActivity(new Intent(array.this,Indelarr.class));
		else if(clickedview.getText().toString().equals("Merge array" ))
			startActivity(new Intent(array.this,Mergearr.class));
		else if(clickedview.getText().toString().equals("Delete array element" ))
			startActivity(new Intent(array.this,Mergearr.class));
	}
		
		     }
		



