package comexample.actionbarnew;


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
public class MainActivity extends ActionBarActivity implements OnQueryTextListener,OnItemClickListener {
	 ListView lv;
	 ArrayAdapter<String> ad;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.listView1);
        ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.programmes));
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	 getMenuInflater().inflate(R.menu.main, menu);
        MenuItem mv=menu.findItem(R.id.action_search);
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
			startActivity(new Intent(MainActivity.this,Hello.class));
		else if(clickedview.getText().toString().equals("if example"))
			startActivity(new Intent(MainActivity.this,Largest.class));
		else if(clickedview.getText().toString().equals("nestedif example" ))
			startActivity(new Intent(MainActivity.this,Nestedif.class));
		else if(clickedview.getText().toString().equals("if else if ladder" ))
			startActivity(new Intent(MainActivity.this,Ladder_.class));
		else if(clickedview.getText().toString().equals("for loop example" ))
			startActivity(new Intent(MainActivity.this,For.class));
		else if(clickedview.getText().toString().equals("while loop example" ))
			startActivity(new Intent(MainActivity.this,While_.class));
		else if(clickedview.getText().toString().equals("dowhile loop example" ))
			startActivity(new Intent(MainActivity.this,Dowhile_.class));
		else if(clickedview.getText().toString().equals("Switch case example" ))
			startActivity(new Intent(MainActivity.this,Switch_.class));
		else if(clickedview.getText().toString().equals("Binary Search" ))
			startActivity(new Intent(MainActivity.this,Binary_.class));
		else if(clickedview.getText().toString().equals("Bubble Sort" ))
			startActivity(new Intent(MainActivity.this,Bubblesort.class));
		else if(clickedview.getText().toString().equals("ASCII to char & char to ASCII" ))
			startActivity(new Intent(MainActivity.this,Converter_.class));
		else if(clickedview.getText().toString().equals("Selection sort" ))
			startActivity(new Intent(MainActivity.this,Selection.class));
		else if(clickedview.getText().toString().equals("sum of array elements" ))
			startActivity(new Intent(MainActivity.this,Arrsum.class));
		else if(clickedview.getText().toString().equals("Linear search" ))
			startActivity(new Intent(MainActivity.this,Linear.class));
		else if(clickedview.getText().toString().equals("input & display array" ))
			startActivity(new Intent(MainActivity.this,Indelarr.class));
		else if(clickedview.getText().toString().equals("Merge array" ))
			startActivity(new Intent(MainActivity.this,Mergearr.class));
		else if(clickedview.getText().toString().equals("Selection sort" ))
			startActivity(new Intent(MainActivity.this,Selection.class));
		else if(clickedview.getText().toString().equals("sum of array elements" ))
			startActivity(new Intent(MainActivity.this,Arrsum.class));
		else if(clickedview.getText().toString().equals("Linear search" ))
			startActivity(new Intent(MainActivity.this,Linear.class));
		else if(clickedview.getText().toString().equals("input & display array" ))
			startActivity(new Intent(MainActivity.this,Indelarr.class));
		else if(clickedview.getText().toString().equals("Merge array" ))
			startActivity(new Intent(MainActivity.this,Mergearr.class));
		else if(clickedview.getText().toString().equals("Delete array element" ))
			startActivity(new Intent(MainActivity.this,Mergearr.class));
		else if(clickedview.getText().toString().equals("Input & Display Matrix" ))
			startActivity(new Intent(MainActivity.this,Indismatrix.class));
		else if(clickedview.getText().toString().equals("Add matrix"))
			startActivity(new Intent(MainActivity.this,Addmatrix.class));
		else if(clickedview.getText().toString().equals("Multiply Matrix" ))
			startActivity(new Intent(MainActivity.this,Multiplymatrix.class));
		else if(clickedview.getText().toString().equals("Transpose" ))
			startActivity(new Intent(MainActivity.this,Transpose.class));
		     }
		
}