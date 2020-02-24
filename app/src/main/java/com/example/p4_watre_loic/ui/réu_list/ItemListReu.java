package com.example.p4_watre_loic.ui.réu_list;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p4_watre_loic.R;

public class ItemListReu extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_reu);

        //TODO Intents for view next new reunions adds
        Intent name = getIntent();
        if (name != null) {
            String entername1 = "";
            if (name.hasExtra("entername")) {
                entername1 = name.getStringExtra("entername");
            }

            TextView textView = findViewById(R.id.activity_new_reu_name);
            textView.setText(entername1);
        }

        Intent hour = getIntent();
        if (hour != null) {
            String enterhour1 = "";
            if (hour.hasExtra("enterhour")) {
                enterhour1 = hour.getStringExtra("enterhour");
            }

            TextView textView = findViewById(R.id.activity_new_reu_enterhour);
            textView.setText(enterhour1);
        }

        Intent room = getIntent();
        if (room != null) {
            String enterroom1 = "";
            if (room.hasExtra("enterroom")) {
                enterroom1 = room.getStringExtra("enterroom");
            }

            TextView textView = findViewById(R.id.activity_new_reu_enterhour);
            textView.setText(enterroom1);
        }

        Intent mail = getIntent();
        if (mail != null) {
            String enteremail1 = "";
            if (mail.hasExtra("enter email")) {
                enteremail1 = mail.getStringExtra("enter email");
            }

            TextView textView = findViewById(R.id.activity_new_reu_enterhour);
            textView.setText(enteremail1);
        }
    }
}
