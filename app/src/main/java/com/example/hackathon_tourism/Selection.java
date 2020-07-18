package com.example.hackathon_tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Selection extends AppCompatActivity {
Spinner spiiner;
Button b1;
    private String[] state= {"Andra Pradesh","Arunachal Pradesh","Assam","Bihar","Haryana","Himachal Pradesh", "Jammu and Kashmir", "Jharkhand","Karnataka", "Kerala","Tamil Nadu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        final String stuff = bundle.getString("l1");
        setContentView(R.layout.activity_selection);
        spiiner=findViewById(R.id.spinner123);
      //  b1=findViewById(R.id.Search);ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this,  R.layout.my_spinner_textview, state);
        //adapter_state.setDropDownViewResource(R.layout.my_spinner_textview);

     //   spiiner.setAdapter(adapter_state);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Selection.this,Loginc.class);
                Bundle bundle = new Bundle();

                bundle.putString("l2",stuff);


                intent.putExtras(bundle);
startActivity(intent);
            }
        });


    }
}
