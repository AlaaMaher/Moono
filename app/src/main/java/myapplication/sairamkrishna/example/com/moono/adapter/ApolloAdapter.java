package myapplication.sairamkrishna.example.com.moono.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import myapplication.sairamkrishna.example.com.moono.R;

/**
 * Created by Eng AhmedAyman on 4/24/2016.
 */

public  class  ApolloAdapter  extends BaseAdapter{

    String [] titles ;
    Integer [] images ;
    Context context;
    public ApolloAdapter(String[] titles, Integer[] images, Context context) {
        this.titles = titles;
        this.images = images;
        this.context = context;
    }
    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {  convertView = LayoutInflater.from(context).inflate(R.layout.apollo_item,null);

        }

        TextView title = (TextView)convertView.findViewById(R.id.apollo_title);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.apollo_image);
        Picasso.with(context).load(images[position]).into(imageView);
        title.setText(titles[position]);

        return convertView;
    }
}