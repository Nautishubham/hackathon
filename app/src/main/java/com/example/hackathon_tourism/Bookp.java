package com.example.hackathon_tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Bookp extends AppCompatActivity {
TextView nametext,locationtec,status,rate,phone,rating;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookp);
        iv=findViewById(R.id.iop);
        nametext=findViewById(R.id.Nametext);locationtec=findViewById(R.id.Locationtex);status=findViewById(R.id.Statustext);rate=findViewById(R.id.RateText);
        phone=findViewById(R.id.PhoneText);
        rating=findViewById(R.id.Rating);
        Bundle bundle = getIntent().getExtras();
        String stuff = bundle.getString("p1");

        if(stuff.equals("first")){
            nametext.setText("shubham");
            iv.setImageDrawable(this.getDrawable(R.drawable.cu));
            locationtec.setText("shimla");
            status.setText("available");
            phone.setText("9897512806");
            rate.setText("500 Rs/Day");
            rating.setText("2.3");
        }
        else if(stuff.equals("second")){
            nametext.setText("Anurag");
            iv.setImageDrawable(this.getDrawable(R.drawable.hu));
            locationtec.setText("shimla");
            status.setText("available");
            phone.setText("9411189471");
            rate.setText("600 Rs/Day");
            rating.setText("4.3"); }
        else if(stuff.equals("third")){
            nametext.setText("Priyanshu");
            iv.setImageDrawable(this.getDrawable(R.drawable.gu));
            locationtec.setText("Mussoorie");
            status.setText("Unavailable");
            phone.setText("7862999999");
            rate.setText("100 Rs/Day");
            rating.setText("4.3");}
        else if(stuff.equals("fourth")){
            nametext.setText("Aaditya");
            iv.setImageDrawable(this.getDrawable(R.drawable.du));
            locationtec.setText("Mussoorie");
            status.setText("available");
            phone.setText("32442323423");
            rate.setText("300 Rs/Day");
            rating.setText("5.3");}
        else if(stuff.equals("fivth")){
            nametext.setText("Raaj");
            iv.setImageDrawable(this.getDrawable(R.drawable.eu));
            locationtec.setText("Dhanolti");
            status.setText("available");
            phone.setText("97772806");
            rate.setText("500 Rs/Day");
            rating.setText("1.3");}
        else if(stuff.equals("sixth")){
            nametext.setText("Aadil");
            iv.setImageDrawable(this.getDrawable(R.drawable.fu));
            locationtec.setText("Dhanolti");
            status.setText("available");
            phone.setText("9897512806");
            rate.setText("600 Rs/Day");
            rating.setText("5.3");}
        else if(stuff.equals("seventh")){
            nametext.setText("shubham");
            iv.setImageDrawable(this.getDrawable(R.drawable.au));
            locationtec.setText("shimla");
            status.setText("available");
            phone.setText("9897512806");
            rate.setText("500 Rs/Day");
            rating.setText("2.3");}
        else if(stuff.equals("eight")){
            nametext.setText("Shanya");
            iv.setImageDrawable(this.getDrawable(R.drawable.bu));
            locationtec.setText("shimla");
            status.setText("available");
            phone.setText("9897512806");
            rate.setText("11500 Rs/Day");
            rating.setText("5.0");}

    }
}
