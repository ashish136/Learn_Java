package notprogram;

import comexample.actionbarnew.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

public class Start_activity extends ActionBarActivity {
	ActionBar ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ab=getSupportActionBar();
		ab.hide();
		setContentView(R.layout.start_activity);
	    new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Start_activity.this,Topic.class);
                startActivity(i);
            }
        }, 2000);
		
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prgmenu, menu);
        return true;
    }
}
