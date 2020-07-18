package com.example.hackathon_tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginc extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8;
    Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginc);
        b1=findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(Loginc.this,Bookp.class);
                Bundle bundle = new Bundle();

                bundle.putString("p1","first");
                intent.putExtras(bundle);

startActivity(intent);
            }
        });

        b2=findViewById(R.id.button12);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","second");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b3=findViewById(R.id.button18);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","third");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b4=findViewById(R.id.button24);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","fourth");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b5=findViewById(R.id.button30);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","fivth");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b6=findViewById(R.id.button36);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","sixth");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b7=findViewById(R.id.button42);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","seventh");
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        b8=findViewById(R.id.button5);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Loginc.this,Bookp.class);        Bundle bundle = new Bundle();

                bundle.putString("p1","eight");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    profile=findViewById(R.id.profile);
        Bundle bundle = getIntent().getExtras();
        final String stuff = bundle.getString("l2");
    profile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
Intent intent=new Intent(getApplicationContext(),Prooo.class);
            Bundle bundle = new Bundle();

            bundle.putString("l3",stuff);


            intent.putExtras(bundle);
startActivity(intent);
        }
    });
    }
}
