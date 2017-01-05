package notprogram;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

    private String[] stringArray;
    private String[] sa;
    private Context mContext;
    private LayoutInflater inflator;
    int checkbox;
    /**
     * 
     * @param context
     * @param stringArray
     */
     public CustomListAdapter(Context  context, String[] stringArray, String[] sa) 
    {
        this.mContext=context;
        this.stringArray=stringArray;
        this.sa=sa;
        this.inflator= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount()
    {
        return stringArray.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        final MainListHolder mHolder;
        View v = convertView;
        if (convertView == null)
        {
            mHolder = new MainListHolder();
            v = inflator.inflate(android.R.layout.two_line_list_item, null);
            mHolder.txt1= (TextView) v.findViewById(android.R.id.text1);
            mHolder.txt2= (TextView) v.findViewById(android.R.id.text2);
            v.setTag(mHolder);
        } 
        else
        {
            mHolder = (MainListHolder) v.getTag();
        }
        mHolder.txt1.setText(stringArray[position]);
        mHolder.txt2.setText(sa[position]);

        mHolder.txt1.setTextSize(18);
        mHolder.txt1.setTextColor(Color.BLACK);
        mHolder.txt1.setPadding(15, 20, 15, 3);
        mHolder.txt2.setTextSize(12);
        mHolder.txt2.setTextColor(Color.GRAY);
        mHolder.txt2.setPadding(15, 3, 15, 20);
        //mHolder.image.setImageResource(R.drawable.icon);


        return v;
    }
    class MainListHolder 
    {
        private TextView txt1;
        private TextView txt2;

    }
	



}
