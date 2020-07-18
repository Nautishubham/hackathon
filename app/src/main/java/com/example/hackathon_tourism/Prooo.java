package com.example.hackathon_tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Prooo extends AppCompatActivity {
    TextView j1, j2, j3;
    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mydb = new DatabaseHelper(this);
        setContentView(R.layout.activity_prooo);
        Bundle bundle = getIntent().getExtras();
        String stuff = bundle.getString("l3");
        j1 = findViewById(R.id.textView18);
        j2 = findViewById(R.id.textView24);
      //  j3 = findViewById(R.id.textView25);

        Cursor res = mydb.getalldata();

        if (res.getCount() == 0) {

            Toast.makeText(getApplicationContext(), "Some Problem", Toast.LENGTH_LONG).show();
            return;
        }

        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            if (stuff.equals(res.getString(0))) {
                j1.setText(res.getString(0));
                j2.setText(res.getString(2));
                j3.setText(res.getString(3));
            } else {
                Toast.makeText(getApplicationContext(), "Some Problem", Toast.LENGTH_LONG).show();
            }

        }
    }
}
