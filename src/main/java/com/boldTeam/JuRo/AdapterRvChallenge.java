package com.boldTeam.JuRo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class AdapterRvChallenge extends RecyclerView.Adapter<AdapterRvChallenge.Holder> {
    ArrayList<Challenge> challenges;
    OnChangeFragment onChangeFragment;

    public AdapterRvChallenge (ArrayList<Challenge> challenges,OnChangeFragment onChangeFragment){
        this.challenges=challenges;
        this.onChangeFragment=onChangeFragment;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_challenge,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tvName.setText(challenges.get(position).name);
        holder.tvInfo.setText(challenges.get(position).info);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeFragment.changeChallenge(1,challenges.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return challenges.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView tvName , tvInfo ;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.itemRvTour_name);
            tvInfo=itemView.findViewById(R.id.itemRvTour_start);
        }
    }
}
