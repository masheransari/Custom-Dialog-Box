package com.example.expansion.customdialogbox;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 6/8/2017.
 */

public class CustomDialog extends Dialog{

    int layoutRes;//The layout file
    Context context;
    public CustomDialog(Context context) {
        super(context);
        this.context = context;
    }
    public CustomDialog(Context context,int resLayout){
        super(context);
        this.context = context;
        this.layoutRes=resLayout;
    }
    public CustomDialog(Context context, int theme,int resLayout){
        super(context, theme);
        this.context = context;
        this.layoutRes=resLayout;
    }
    private CustomAdapter customAdapter;
    private ArrayList<customVariable> variables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layoutRes);
        fillArrayList();
        TextView cancel = (TextView)findViewById(R.id.cancel);
        customAdapter = new CustomAdapter(this.getContext(),variables);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(customAdapter);
        TextView textView = (TextView)findViewById(R.id.outletCount);
        textView.setText((variables.size()+1)+" Outlet");
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                CustomDialog customDialog = getContext();
                
            }
        });

    }

    private void fillArrayList(){
        variables = new ArrayList<>();
        variables.add(new customVariable("Clifton","No. 8 Clifton, Plot N Block"));
        variables.add(new customVariable("M. Ali Society","M. Ali Society"));
        variables.add(new customVariable("BMCHS",""));
        variables.add(new customVariable("Shaheen Shenwari","Gulshan Iqbal Block Pata Nhe"));
        variables.add(new customVariable("Tayabi","Main Hussainabad"));
        variables.add(new customVariable("Zahid Nehari","Saddar, Burns Road"));
        variables.add(new customVariable("This is Temp","This is Temp Address."));
        variables.add(new customVariable("This is Temp",""));
    }
}
