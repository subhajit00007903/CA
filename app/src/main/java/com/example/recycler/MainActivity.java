package com.example.recycler;


import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ArrayList
    ArrayList<ContactModel> arrayContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Initialised rv
        RecyclerView rv  = findViewById(R.id.recyclerContact);
        //set Lay Out Manager
        rv.setLayoutManager(new LinearLayoutManager(this));

        //Creating Contact Model Object

        ContactModel model = new ContactModel(R.drawable.img_1,"A","123456789");
        arrayContact.add(model);

        arrayContact.add(new ContactModel(R.drawable.img_2,"B","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_3,"C","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_4,"D","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_5,"E","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_2,"F","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_4,"G","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_3,"H","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_2,"I","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_6,"J","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_5,"K","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_2,"L","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_1,"M","123456987"));
        arrayContact.add(new ContactModel(R.drawable.img_3,"N","123456987"));
        //set Adapter
        RecyclerContactAdapter adpter = new RecyclerContactAdapter(this,arrayContact);
        rv.setAdapter(adpter);





    }
}