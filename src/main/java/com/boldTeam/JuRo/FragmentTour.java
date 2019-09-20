package com.boldTeam.JuRo;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTour extends Fragment {

    ImageView imageView;
    RecyclerView recyclerView;
    TextView tvInfo,tvStart;
    ImageView back;
    Tour tour;
    OnChangeFragment onChangeFragment;

    public FragmentTour(Tour tour, OnChangeFragment onChangeFragment) {
        this.tour=tour;
        this.onChangeFragment=onChangeFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tour, container, false);

        findViews(view);

        initViews();

        setListeners();

        return view;
    }

    private void initViews() {
        tvInfo.setText(tour.info);
        imageView.setImageBitmap(tour.image);
        initRv();
    }

    private void initRv() {
//        AdapterRvChallengeSu adapter=new AdapterRvChallengeSu(tour.challenges,onChangeFragment);
        AdapterRvChallenge adapter = new AdapterRvChallenge(tour.challenges,onChangeFragment);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
    }

    private void setListeners() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeFragment.changeChallenge(-1,null);
            }
        });
        tvStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ActivityChallenges.class);
                intent.putExtra("tourId",1);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.alpha_in,R.anim.alpha_out);
                getActivity().finish();
            }
        });
    }

    private void findViews(View view) {
        imageView=view.findViewById(R.id.FShowSummary_image);
        tvStart=view.findViewById(R.id.FChallenges_start);
        back=view.findViewById(R.id.FChallenges_back);
        tvInfo=view.findViewById(R.id.FChallenges_info);
        recyclerView=view.findViewById(R.id.FChallenges_rv);
    }
}
