package com.boldTeam.JuRo;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentChallenges extends Fragment {

    ArrayList<Challenge> challenges;
    OnChangeFragment onChangeFragment;
    int tourId;

    ImageView back ;
    TextView tvTourName , tvNoChallenge;
    RecyclerView recyclerView;

    public FragmentChallenges(OnChangeFragment onChangeFragment, ArrayList<Challenge> challenges , int tourId) {
        this.challenges=challenges;
        this.onChangeFragment=onChangeFragment;
        this.tourId=tourId;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_challenges, container, false);;

        findViews(view);

        initViews();

        return view;
    }

    private void initViews() {
        switch (tourId){
            case 1:
                tvTourName.setText("چالش مشهد گردی");
                break;
            case 2:
                tvTourName.setText("چالش تهران گردی");
                break;
            case 3:
                tvTourName.setText("چالش اصفهان گردی");
                break;
        }

        initRv();
        setListeners();
    }

    private void setListeners() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeFragment.changeChallenge(-1,null);
            }
        });
    }

    private void initRv() {
        if (challenges.size()==0){
            recyclerView.setVisibility(View.GONE);
            tvNoChallenge.setVisibility(View.VISIBLE);
        }else{
            recyclerView.setVisibility(View.VISIBLE);
            tvNoChallenge.setVisibility(View.GONE);
            AdapterRvChallenge adapter=new AdapterRvChallenge(challenges,onChangeFragment);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        }
    }

    private void findViews(View view) {
        tvNoChallenge=view.findViewById(R.id.FShowChalleng_noChallenge);
        back=view.findViewById(R.id.FShowChalleng_back);
        recyclerView=view.findViewById(R.id.FShowChalleng_rv);
        tvTourName=view.findViewById(R.id.FShowChalleng_challenge);
    }

}
