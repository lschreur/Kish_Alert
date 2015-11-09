package edu.kishwaukeecollege.kishalert;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Aaron on 11/4/2015.
 */
public class database extends SQLiteOpenHelper{
    public database(Context context){
        super(context,"data",null,1);
    }
    private void createDB(){
        //SQLiteDatabase DB = SQLiteDatabase.openOrCreateDatabase("KishDatabase",Context.MODE_PRIVATE,null);
    }
    //This is ran when the database is created and opened
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
