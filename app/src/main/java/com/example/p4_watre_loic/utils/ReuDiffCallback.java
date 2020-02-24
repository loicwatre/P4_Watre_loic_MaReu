package com.example.p4_watre_loic.utils;

import java.util.List;
import androidx.recyclerview.widget.DiffUtil;

import com.example.p4_watre_loic.réu.Reu;

public class ReuDiffCallback extends DiffUtil.Callback{

    private final List<Reu> oldReunions;
    private final List<Reu> newReunions;

    public ReuDiffCallback(List<Reu> newReunions, List<Reu> oldReunions) {
        this.newReunions = newReunions;
        this.oldReunions = oldReunions;
    }

    @Override
    public int getOldListSize() {
        return oldReunions.size();
    }

    @Override
    public int getNewListSize() {
        return newReunions.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldReunions.get(oldItemPosition).getName() == newReunions.get(newItemPosition).getName() ;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldReunions.get(oldItemPosition).equals(newReunions.get(newItemPosition));
    }
}