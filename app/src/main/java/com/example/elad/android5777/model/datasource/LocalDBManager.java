package com.example.elad.android5777.model.datasource;

import android.content.ContentResolver;
import android.content.ContentValues;

import com.example.elad.android5777.model.backend.DB_Manager;
import com.example.elad.android5777.model.entities.Active;
import com.example.elad.android5777.model.entities.Business;
import com.example.elad.android5777.model.entities.KindOfAction;
import com.example.elad.android5777.model.entities.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Elad on 26/11/2016.
 */

public class LocalDBManager implements DB_Manager {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Business> businesses = new ArrayList<>();
    private ArrayList<Active> activities = new ArrayList<>();
    private boolean businessUpdate = false;
    private boolean activitiesUpdate = false;
    private boolean usersUpdate = false;

    Date localUpdate;
    private static final String TAG = "LocalDBManager";

    @Override
    public void addUser(ContentValues obj) {
        usersUpdate = true;
        users.add(new User(
                obj.getAsInteger("id"),
                obj.getAsString("name"),
                obj.getAsString("password")
        ));
    }

    @Override
    public void addBusiness(ContentValues obj) {
        businessUpdate = true;
        businesses.add(new Business(
                obj.getAsInteger("id"),
                obj.getAsString("name"),
                obj.getAsString("address"),
                obj.getAsString("phone"),
                obj.getAsString("email"),
                obj.getAsString("website")
        ));
    }

    @Override
    public void addActivity(ContentValues obj) {
        activitiesUpdate = true;
        /*
        activities.add(new Active(
                KindOfAction.TRAVEL_AGENCY,
                obj.getAsString("country"),
                obj.getAs("start"),
                obj.getAs("end"),
                obj.getAsDouble("price"),
                obj.getAsString("description"),
                obj.getAsInteger("businessId")
        ));
        */
    }

    @Override
    public boolean isAdded() {
        return activitiesUpdate&&businessUpdate;
    }

    @Override
    public Collection<User> getUsers() {
        return users;
    }

    @Override
    public Collection<Business> getBusinesses() {
        return businesses;
    }

    @Override
    public Collection<Active> getActivities() {
        return activities;
    }

    @Override
    public void checkForChanges() {

    }
}
