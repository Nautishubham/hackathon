package com.example.hackathon_tourism;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
TextView bu;
DatabaseHelper mydb;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       user=findViewById(R.id.usernameL);
        mydb=new DatabaseHelper(this);
       pass=findViewById(R.id.passwordL);
        login=findViewById(R.id.login);
        bu=findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(MainActivity.this,Selection.class);
                Bundle bundle = new Bundle();

                bundle.putString("l1",user.getText().toString());
                intent.putExtras(bundle);

startActivity(intent);
            }
        });
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(MainActivity.this,Register.class);
startActivity(intent);
            }
        });

    }
    public void showmessage(String titile,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(titile);
        builder.setMessage(message);
        builder.show();
    }
}
