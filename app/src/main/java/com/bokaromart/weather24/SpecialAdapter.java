package com.bokaromart.weather24;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ashdey on 9/13/15.
 */
public class SpecialAdapter extends BaseAdapter {
    //Defining the background color of rows. The row will alternate between green light and green dark.
    private int[] colors = new int[] { 0xff669900, 0xAAffffff };
    private LayoutInflater mInflater;

    //The variable that will hold our text data to be tied to list.
    private List data;

    static class ViewHolder {
        TextView text;
    }

    public SpecialAdapter(Context context, List items) {
        mInflater = LayoutInflater.from(context);
        this.data = items;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //A view to hold each row in the list
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

// A ViewHolder keeps references to children views to avoid unneccessary calls
// to findViewById() on each row.
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_row, null);

            holder = new ViewHolder();
            holder.text = (TextView) convertView.findViewById(R.id.headline);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // Bind the data efficiently with the holder.
        holder.text.setText(data.get(position).toString());

        //Set the background color depending of  odd/even colorPos result
        int colorPos = position % colors.length;
        convertView.setBackgroundColor(colors[colorPos]);


        return convertView;
    }
}
