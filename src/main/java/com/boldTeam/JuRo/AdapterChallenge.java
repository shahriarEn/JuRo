package com.boldTeam.JuRo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class AdapterChallenge extends RecyclerView.Adapter<AdapterChallenge.Holder> {
    ArrayList<Challenge> challenges;
    SharedPreferences.Editor edit;
    Activity activity;
    public AdapterChallenge(ArrayList<Challenge> challenges, SharedPreferences.Editor edit, Activity activity) {
        this.challenges=challenges;
        this.edit=edit;
        this.activity=activity;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_challenge2,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.tvName.setText(challenges.get(i).name);
        holder.tvState.setText(challenges.get(i).state);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.putInt("current",challenges.get(i).id);
                edit.commit();
                activity.startActivity(new Intent(activity,UnityPlayerActivity.class));
                activity.overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
                activity.finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return challenges.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvState;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.itemRvChallenge_name);
            tvState=itemView.findViewById(R.id.itemRvChallenge_state);
        }
    }
}
