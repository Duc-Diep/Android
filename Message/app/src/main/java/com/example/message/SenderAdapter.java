package com.example.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SenderAdapter extends BaseAdapter {
    public Context context;
    List<Sender> list;
    int layout;

    public SenderAdapter(Context context, List<Sender> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
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
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        CircleImageView imgavatar = convertView.findViewById(R.id.avatar);
        TextView tvname = convertView.findViewById(R.id.tvname);
        TextView tvmess = convertView.findViewById(R.id.tvmessage);
        imgavatar.setImageResource(list.get(position).getAvatar());
        tvname.setText(list.get(position).getName());
        tvmess.setText(list.get(position).getMesage());
        return convertView;
    }
}
