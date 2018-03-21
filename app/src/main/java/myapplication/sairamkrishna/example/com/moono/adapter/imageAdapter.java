package myapplication.sairamkrishna.example.com.moono.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import myapplication.sairamkrishna.example.com.moono.R;

/**
 * Created by Eng AhmedAyman on 4/22/2016.
 */
public class imageAdapter extends BaseAdapter {

    Context context;
Integer [] images ;

    public imageAdapter(Context context, Integer [] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
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
     {  convertView = LayoutInflater.from(context).inflate(R.layout.image_item,null);
     }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_item);
    imageView.setImageResource(images[position]);

return convertView;
    }
}
