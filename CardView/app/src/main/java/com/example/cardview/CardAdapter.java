package com.example.cardview;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.effect.EffectFactory;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.cardview.R.color.cardview_dark_background;
import static com.example.cardview.R.color.colorAccent;

public class CardAdapter extends BaseAdapter{
    List<Card> list;

    public CardAdapter(List<Card> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.carditem,parent,false);
        CircleImageView imgavatar = view.findViewById(R.id.imgavatar);
        TextView tvname = view.findViewById(R.id.tvName);
        TextView tvuni=view.findViewById(R.id.tvUniversity);
        TextView tvpopular = view.findViewById(R.id.tvPopular);
        TextView tvlike = view.findViewById(R.id.tvLike);
        TextView tvrank = view.findViewById(R.id.tvRanking);
        LinearLayout layoutbgr = view.findViewById(R.id.layoutbgr);
        Card card = list.get(position);
        imgavatar.setImageResource(card.getAvatar());
        tvname.setText(card.getName());
        tvuni.setText(card.getUniversity());
        tvpopular.setText(String.valueOf(card.getPopularity()));
        tvlike.setText(String.valueOf(card.getLike()));
        tvrank.setText(String.valueOf(card.getRank()));
        if(card.getBackground()==1){
            layoutbgr.setBackgroundResource(R.drawable.border1);
        }
        else if(card.getBackground()==2){
            layoutbgr.setBackgroundResource(R.drawable.border2);
        }
        else{
            layoutbgr.setBackgroundResource(R.drawable.border3);
        }
        view.setBottom(0);
        return view;
    }
}
