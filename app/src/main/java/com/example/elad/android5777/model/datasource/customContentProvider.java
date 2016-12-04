package com.example.elad.android5777.model.datasource;

import java.lang.Exception;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.elad.android5777.model.backend.DB_Manager;
import com.example.elad.android5777.model.entities.Business;

/**
 * Created by Elad on 26/11/2016.
 */

public class customContentProvider extends ContentProvider {
    static final String TAG = "customContentProvider";
    static final String AUTHORITY = "content://com.example.elad.android5777";
    public static final Uri CONTENT_URI = Uri.parse(AUTHORITY);

    DB_Manager db = DBManagerFactory.getManager();


    @Override
    public boolean onCreate() {
        Log.d(TAG, "onCreate");
        return true;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Log.d(TAG, "query");
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        Log.d(TAG, "getType");
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values)
    {
        Log.d(TAG, "insert");
        String table = uri.getPath().substring(1);
        if(table.equalsIgnoreCase("User")) {
            db.addUser(values);
        }
        if(table.equalsIgnoreCase("Business")) {
            db.addBusiness(values);
        }
        if(table.equalsIgnoreCase("Active")) {
            db.addActivity(values);
        }
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Log.d(TAG, "delete");
        String table = uri.getPath().substring(1);
        if(table.equalsIgnoreCase("Business")) {
            //db.addBusiness(values);
            return 0;
        }
        if(table.equalsIgnoreCase("Active")) {
            //db.addActivity(values);
            return 0;
        }
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Log.d(TAG, "update");
        return 0;
    }
}
