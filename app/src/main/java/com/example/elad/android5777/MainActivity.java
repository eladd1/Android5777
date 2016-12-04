package com.example.elad.android5777;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.elad.android5777.model.datasource.customContentProvider;

import java.net.URI;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customContentProvider myProvider = new customContentProvider();
        ContentValues tempCP = new ContentValues();
        tempCP.put("id", 15);
        tempCP.put("name", "David");
        tempCP.put("password", "123456");
        myProvider.onCreate();
        try {
            myProvider.insert(new Uri("content://com.example.elad.android5777/Users"), tempCP);
        }
