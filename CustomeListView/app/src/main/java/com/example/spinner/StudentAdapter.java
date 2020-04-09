package com.example.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentAdapter extends BaseAdapter {
    public Context context;
    List<Student> list ;
    int layout;

    public StudentAdapter(Context context, List<Student> list, int layout) {
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
        TextView tvTen = convertView.findViewById(R.id.tvname);
        TextView tvLop = convertView.findViewById(R.id.tvclass);
        tvTen.setText(list.get(position).getTen());
        tvLop.setText(list.get(position).getLop());

        ImageView img = convertView.findViewById(R.id.avatar);
        img.setImageResource(R.drawable.ic_launcher_background);
        return convertView;
    }
}
