package com.example.p4_watre_loic.ui.réu_list;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import com.example.p4_watre_loic.R;
import com.example.p4_watre_loic.base.BaseActivity;
import com.example.p4_watre_loic.réu.Reu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends BaseActivity implements MaReuAdapter.Listener {


    // FOR DESIGN ---
    RecyclerView recyclerView;
    FloatingActionButton fab;

    // FOR DATA ---
    private MaReuAdapter adapter;

// OVERRIDE ---

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureFab();
        configureRecyclerView();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

// CONFIGURATION ---

    private void configureRecyclerView() {
        recyclerView = findViewById(R.id.activity_list_reu_rv);
        adapter = new MaReuAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    private void configureFab() {
        fab = findViewById(R.id.activity_list_reu_fab);
        fab.setOnClickListener(v -> {
            Intent reunion = new Intent(MainActivity.this, New_Reu.class);
            startActivity(reunion);
        });
    }

    private void loadData() {
        adapter.updateList(getReuRepository().getReunions());
    }

// ACTIONS ---

    @Override
    public void onClickDelete(Reu reu) {
        Log.d(MainActivity.class.getName(), "User tries to delete a item.");
        getReuRepository().deleteReu(reu);
        loadData();
    }
}
