package com.example.p4_watre_loic.ui.réu_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p4_watre_loic.R;
import com.example.p4_watre_loic.réu.Reu;
import com.example.p4_watre_loic.utils.ReuDiffCallback;

import java.util.ArrayList;
import java.util.List;

public class MaReuAdapter extends RecyclerView.Adapter<Fragment_List> {

    // FOR DATA ---
    private List<Reu> reus = new ArrayList<>();

    // FOR CALLBACK ---
    private final Listener callback;
    public interface Listener {
        void onClickDelete(Reu reu);
    }

    public MaReuAdapter(Listener callback) {
        this.callback = callback;
    }

    @NonNull
    @Override
    public Fragment_List onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_fragment__list, parent,false);
        return new Fragment_List(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Fragment_List holder, int position) {
        holder.bind(reus.get(position), callback);
    }

    @Override
    public int getItemCount() {
        return reus.size();
    }

    // PUBLIC API ---

    public void updateList(List<Reu> newList) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new ReuDiffCallback(newList, this.reus));
        this.reus = new ArrayList<>(newList);
        diffResult.dispatchUpdatesTo(this);
    }
}
