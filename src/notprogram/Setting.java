package notprogram;

import notprogram.CustomListAdapter;

import comexample.actionbarnew.R;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class Setting extends ActionBarActivity{
	 ListView lv;
	 CustomListAdapter cla;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar ab=getSupportActionBar();
		ab.hide();
		setContentView(R.layout.setting);
		lv=(ListView) findViewById(comexample.actionbarnew.R.id.listView1);
		cla=new CustomListAdapter(this,getResources().getStringArray(comexample.actionbarnew.R.array.setting),getResources().getStringArray(comexample.actionbarnew.R.array.setting2));
        lv.setAdapter(cla);
	}

}
