package com.example.goldenteamproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public static  final String DBNAME = "Login.db";

    public DBHelper( Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create table users (email TEXT Primary key,username TEXT ,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop table if exists users");
    }


    public boolean insertData(String email,String userName,String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("email",email);
        contentValues.put("username",userName);
        contentValues.put("password",password);
        long  result = MyDB.insert("users",null,contentValues);
        if (result == -1) return false;
        else
            return true;
    }
    public boolean checkemail(String email){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where email = ?",new String[]{email});
        if (cursor.getCount() > 0){
            return true;
        }else {
            return false;
        }
    }

    public List<User> getEveryOne(){
        List<User> returnList = new ArrayList<>();
        String queryString = "SELECT * FROM users";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString,null);
        if (cursor.moveToFirst()){
            do {
                String customerEmail= cursor.getString(0);
                String customerUserName= cursor.getString(1);
                String  customerPass= cursor.getString(2);
                User newCusomerModel = new User(customerPass,customerUserName,customerEmail);
                returnList.add(newCusomerModel);
            }while (cursor.moveToNext());

        }else {}
        cursor.close();
        db.close();

        return returnList;
    }






    public List<User> getName(String email){
        List<User> returnList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String queryString = "select * from users where email = ?";

        Cursor cursor = db.rawQuery(queryString,new String[]{email});
        if (cursor.moveToFirst()){
            do {
                String customerEmail= cursor.getString(0);
                String customerUserName= cursor.getString(1);
                String  customerPass= cursor.getString(2);
                User newCusomerModel = new User(customerPass,customerUserName,customerEmail);
                returnList.add(newCusomerModel);
            }while (cursor.moveToNext());

        }else {}
        cursor.close();
        db.close();

        return returnList;
    }










    public boolean checkemailpassword(String email,String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where email=? and password = ?",new String[]{email,password});
        if (cursor.getCount() > 0 ){
            return true;
        }else {
            return false;
        }
    }

}

