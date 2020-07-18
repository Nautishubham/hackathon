package com.example.hackathon_tourism;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "login.db";
    public static final String TABLE_NAME = "login_table";
    public static final String COL_1 = "username";
    public static final String COL_2 = "password";
    public static final String COL_3 = "phone";
    public static final String COL_4 = "country";



    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(username TEXT PRIMARY KEY,password TEXT,phone TEXT,country TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE  IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public boolean insertdata(String uname, String pword,String phone,String country) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contactvalue = new ContentValues();
        contactvalue.put(COL_1, uname);
        contactvalue.put(COL_2, pword);
        contactvalue.put(COL_3, phone);
        contactvalue.put(COL_4, country);

        long result = db.insert(TABLE_NAME, null, contactvalue);
        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }

    public Cursor getalldata() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updatedata(String user, String passw)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues con = new ContentValues();
        con.put(COL_1, user);
        con.put(COL_2, passw);
        db.update(TABLE_NAME, con, "username= ?", new String[]{user});
        return true;
    }
    public Integer deletedata(String user)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"username = ?",new String[]{user});

    }
}
