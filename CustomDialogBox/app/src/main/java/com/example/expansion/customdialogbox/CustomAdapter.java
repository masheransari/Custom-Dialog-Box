package com.example.expansion.customdialogbox;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 6/8/2017.
 */

public class CustomAdapter extends BaseAdapter {
    private ArrayList<customVariable> arrayList;
    private Context context;

    public CustomAdapter(Context context, ArrayList<customVariable> variables) {
        this.context = context;
        this.arrayList = variables;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        return null;
        View v = view;
        final customVariable customVariable = arrayList.get(i);
        if (v == null) {
            v = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }
        TextView town = (TextView) v.findViewById(R.id.townid);
        TextView towndetail = (TextView) v.findViewById(R.id.townDetailid);

        town.setText(customVariable.getTown());
        if (customVariable.getTownDetail().equals("") || TextUtils.isEmpty(customVariable.getTownDetail())) {
            towndetail.setText("....");

        } else {
            towndetail.setText(customVariable.getTownDetail());
        }
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+customVariable.getTown(), Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
