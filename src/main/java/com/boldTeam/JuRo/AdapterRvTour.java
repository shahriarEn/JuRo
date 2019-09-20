package com.boldTeam.JuRo;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class AdapterRvTour extends RecyclerView.Adapter<AdapterRvTour.Holder> {

    ArrayList<Tour> tours;
    Activity activity;

    public AdapterRvTour (ArrayList<Tour> tours,Activity activity){
        this.tours=tours;
        this.activity=activity;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_tour,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tvName.setText(tours.get(position).name);
        holder.tvStart.setText("شروع: "+tours.get(position).start);
        holder.tvEnd.setText("پایان: "+tours.get(position).end);
        holder.tvScore.setText("امتیاز "+tours.get(position).score);
        holder.imageView.setImageBitmap(tours.get(position).image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity, ActivityChallenge.class);
                intent.putExtra("tourId",tours.get(position).id);
                activity.startActivity(intent);
                activity.overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
                activity.finish();
                //TODO: go to challanges
            }
        });
    }

    @Override
    public int getItemCount() {
        return tours.size();
    }

    public void swap(ArrayList<Tour> tours){
        this.tours=tours;
        notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView tvName , tvStart , tvEnd , tvScore;
        ImageView imageView;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.itemRvTour_image);
            tvName=itemView.findViewById(R.id.itemRvTour_name);
            tvStart=itemView.findViewById(R.id.itemRvTour_start);
            tvScore=itemView.findViewById(R.id.itemRvTour_score);
            tvEnd=itemView.findViewById(R.id.itemRvTour_end);
        }
    }
}
