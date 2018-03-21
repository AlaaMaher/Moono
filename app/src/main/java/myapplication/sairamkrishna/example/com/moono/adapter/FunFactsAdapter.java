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
 * Created by Eng AhmedAyman on 4/23/2016.
 */
public class FunFactsAdapter  extends BaseAdapter{


    Context context ;
    String [] funFacts ;
    Integer [] images ;

    public FunFactsAdapter(Context context, String[] funFacts , Integer [] i ) {
        this.context = context;
        this.funFacts = funFacts;
        this.images = i ;
    }

    @Override
    public int getCount() {
        return funFacts.length;
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
        TextView textView ;
        if(convertView == null)
       {
        convertView = LayoutInflater.from(context).inflate(R.layout.facts_item,null);
       }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_fact);
        Picasso.with(context).load(images[position]).into(imageView);

        textView = (TextView)convertView.findViewById(R.id.fun_fact_text);
        textView.setText(funFacts [position]);

        return convertView;
    }
}
