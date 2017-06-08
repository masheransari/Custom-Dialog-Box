package com.example.expansion.customdialogbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private CustomAdapter customAdapter;
//    private ArrayList<customVariable> variables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        fillArrayList();
//        customAdapter = new CustomAdapter(this,variables);
//        ListView listView = (ListView)findViewById(R.id.list);
//        listView.setAdapter(customAdapter);
//        TextView textView = (TextView)findViewById(R.id.outletCount);
//        textView.setText((variables.size()+1)+" Outlet");
        CustomDialog dialog=new CustomDialog(this, R.style.customDialog, R.layout.customlayout);
        dialog.show();
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
//    private void fillArrayList(){
//        variables = new ArrayList<>();
//        variables.add(new customVariable("Clifton","No. 8 Clifton, Plot N Block"));
//        variables.add(new customVariable("M. Ali Society","M. Ali Society"));
//        variables.add(new customVariable("BMCHS",""));
//        variables.add(new customVariable("Shaheen Shenwari","Gulshan Iqbal Block Pata Nhe"));
//        variables.add(new customVariable("Tayabi","Main Hussainabad"));
//        variables.add(new customVariable("Zahid Nehari","Saddar, Burns Road"));
//        variables.add(new customVariable("This is Temp","This is Temp Address."));
//        variables.add(new customVariable("This is Temp",""));
//    }
}
