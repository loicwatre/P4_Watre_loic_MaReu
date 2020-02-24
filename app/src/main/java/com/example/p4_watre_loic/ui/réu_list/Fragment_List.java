package com.example.p4_watre_loic.ui.réu_list;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p4_watre_loic.R;
import com.example.p4_watre_loic.réu.Reu;

public class Fragment_List extends RecyclerView.ViewHolder {

// FOR DESIGN ---
private TextView reuname;
private TextView hour;
private TextView room;
private TextView email;
private ImageButton deleteButton;

public Fragment_List (@NonNull View itemView) {
        super(itemView);
        reuname = itemView.findViewById(R.id.item_list_reu_reuname);
        hour = itemView.findViewById(R.id.item_list_reu_hour);
        room = itemView.findViewById(R.id.item_list_reu_room);
        email = itemView.findViewById(R.id.item_list_reu_email);
        deleteButton = itemView.findViewById(R.id.item_list_reu_delete_button);
        }

public void bind(final Reu reu, MaReuAdapter.Listener callback) {
        reuname.setText(reu.getName());
        hour.setText(reu.getHeure());
        room.setText(reu.getLieu());
        email.setText(reu.getEmail());
        deleteButton.setOnClickListener(view -> callback.onClickDelete(reu));
        }
}
