package comexample.actionbarnew;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Selection extends ActionBarActivity{
	TextView tv1,tv2;
	 ShareActionProvider sap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);
        tv1=(TextView) findViewById(R.id.textView1);
        tv2=(TextView) findViewById(R.id.textView2);
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
		 // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prgmenu, menu);
        MenuItem sharetext=menu.findItem(R.id.share_);
        sap=(ShareActionProvider) MenuItemCompat.getActionProvider(sharetext);
         sap.setShareIntent(getshareIntent());
       
        return true;
    }
    private Intent getshareIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT,tv1.getText().toString() );
        //intent.putExtra(Intent.EXTRA_TEXT,tv2.getText().toString() );
        return intent;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
        case R.id.share_:
			
         return true;   
        default:
            return super.onOptionsItemSelected(item);
    	}
    }

}
