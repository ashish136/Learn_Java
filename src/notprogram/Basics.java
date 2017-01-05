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
public class Basics extends ActionBarActivity implements OnQueryTextListener,OnItemClickListener {
	 ListView lv;
	 ArrayAdapter<String> ad;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(comexample.actionbarnew.R.layout.basics);
        lv=(ListView) findViewById(comexample.actionbarnew.R.id.listView1);
        ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(comexample.actionbarnew.R.array.basicprg));
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
		if(clickedview.getText().toString().equals("Print a string" ))
			startActivity(new Intent(Basics.this,Hello.class));
		else if(clickedview.getText().toString().equals("if example"))
			startActivity(new Intent(Basics.this,Largest.class));
		else if(clickedview.getText().toString().equals("nestedif example" ))
			startActivity(new Intent(Basics.this,Nestedif.class));
		else if(clickedview.getText().toString().equals("if else if ladder" ))
			startActivity(new Intent(Basics.this,Ladder_.class));
		else if(clickedview.getText().toString().equals("for loop example" ))
			startActivity(new Intent(Basics.this,For.class));
		else if(clickedview.getText().toString().equals("while loop example" ))
			startActivity(new Intent(Basics.this,While_.class));
		else if(clickedview.getText().toString().equals("dowhile loop example" ))
			startActivity(new Intent(Basics.this,Dowhile_.class));
		else if(clickedview.getText().toString().equals("Switch case example" ))
			startActivity(new Intent(Basics.this,Switch_.class));
		
	}
		
		     }
		

