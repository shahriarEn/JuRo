package com.boldTeam.JuRo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

class AdapterRvChallengeSu extends RecyclerView.Adapter<AdapterRvChallengeSu.Holder> {
    ArrayList<Challenge> challenges;
    OnChangeFragment onChangeFragment;

    public AdapterRvChallengeSu(ArrayList<Challenge> challenges, OnChangeFragment onChangeFragment) {
        this.challenges=challenges;
        this.onChangeFragment=onChangeFragment;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_challenge,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return challenges.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
