package myapplication.sairamkrishna.example.com.moono.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import myapplication.sairamkrishna.example.com.moono.R;

/**
 * Created by Eng AhmedAyman on 4/22/2016.
 */
public class VideoAdapter extends BaseAdapter{

    Context context ;

    List<String> titles;

    public VideoAdapter(Context context, List<String> titles) {
        this.context = context;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return titles.size();
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
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.video_item,null);
        }
        ImageView image = (ImageView) convertView.findViewById(R.id.video_image);
        TextView title = (TextView) convertView.findViewById(R.id.video_title);
        title.setText(titles.get(position));



        return convertView;
    }
}
