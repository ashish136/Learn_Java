package notprogram;

import comexample.actionbarnew.MainActivity;

import comexample.actionbarnew.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.PopupMenu.OnMenuItemClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Topic extends ActionBarActivity implements OnClickListener, android.view.MenuItem.OnMenuItemClickListener{
	Button basic,array,matrix,all;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(comexample.actionbarnew.R.layout.topic);
	 basic=(Button) findViewById(R.id.button1);
	 array=(Button) findViewById(R.id.button2);
	 matrix=(Button) findViewById(R.id.button3);
	 all=(Button) findViewById(R.id.button4);
	basic.setOnClickListener(this);
	array.setOnClickListener(this);
	matrix.setOnClickListener(this);
	all.setOnClickListener(this);
	}
	 public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	    	 getMenuInflater().inflate(R.menu.topic_menu, menu);
	    	 MenuItem setting=menu.findItem(R.id.action_settings);
	    	 setting.setOnMenuItemClickListener(this);
	    	 return true;
	 }
	@Override
	public void onClick(View v) {
		if(v.equals(basic))
			startActivity(new Intent(Topic.this,Basics.class));
		else if(v.equals(array))
			startActivity(new Intent(Topic.this,array.class));
		else if(v.equals(matrix))
			startActivity(new Intent(Topic.this,Matrix.class));
		else if(v.equals(all))
			startActivity(new Intent(Topic.this,MainActivity.class));
	}
	@Override
	public boolean onMenuItemClick(MenuItem mi) {
		startActivity(new Intent(Topic.this,Setting.class));
		return false;
	}

}
