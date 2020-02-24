package com.example.p4_watre_loic.ui.réu_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.p4_watre_loic.R;

public class New_Reu extends AppCompatActivity {

    ImageView past;


    private void configurepast() {

        past = (ImageView) findViewById(R.id.activity_new_reu_returnbutton);
        setContentView(findViewById(R.id.activity_new_reu_returnbutton));
        past.setOnClickListener(v -> {
            Intent retour = new Intent(New_Reu.this, MainActivity.class);
            startActivity(retour);
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__reu);
    }

    public void ChangeActivity(View view) {

        EditText entername = findViewById(R.id.activity_new_reu_entername);
        String entername1 = entername.getText().toString();

        EditText enterhour = findViewById(R.id.activity_new_reu_enterhour);
        String enterhour1 = enterhour.getText().toString();

        EditText enterroom = findViewById(R.id.activity_new_reu_enterroom);
        String enterroom1 = enterroom.getText().toString();

        EditText enteremail = findViewById(R.id.activity_new_reu_enteremail);
        String enteremail1 = enteremail.getText().toString();

        ImageButton validation = (ImageButton) findViewById(R.id.activity_new_reu_validebutton);
        validation.setOnClickListener(v -> {
            Intent valide = new Intent(this, MainActivity.class);

            valide.putExtra("entername",entername1);
            valide.putExtra("enterhour",enterhour1);
            valide.putExtra("enterroom",enterroom1);
            valide.putExtra("enter email",enteremail1);

            startActivity(valide);
        });
    }
}