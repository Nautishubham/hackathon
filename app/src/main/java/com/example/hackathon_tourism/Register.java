package com.example.hackathon_tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
Button register;
DatabaseHelper mydb;
EditText pass,cnfpass,user,phone,country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        pass=findViewById(R.id.passwordL);
        mydb=new DatabaseHelper(this);
        cnfpass=findViewById(R.id.cnf_pass);
user=findViewById(R.id.username1);
phone=findViewById(R.id.phone);
country=findViewById(R.id.country);
        register=findViewById(R.id.button2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().equals(cnfpass.getText().toString())) {
                    boolean iinsert = mydb.insertdata(user.getText().toString(), pass.getText().toString(),phone.getText().toString(),country.getText().toString());

                    if (iinsert == true) {
                        Toast.makeText(Register.this, "Register Successfully....", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(Register.this, "Not Register ..", Toast.LENGTH_LONG).show();
                    }
                }else {Toast.makeText(Register.this, "PASSWORD DOES NOT MATCH", Toast.LENGTH_LONG).show();}
            }
        });


    }
        }
