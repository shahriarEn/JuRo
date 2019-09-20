package com.boldTeam.JuRo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoChaleleng extends Fragment {

    ImageView imageView , back;
    Challenge challenge;
    TextView tvInfo,tvName;
    OnChangeFragment onChangeFragmen;

    public FragmentInfoChaleleng(Challenge challenge, OnChangeFragment onChangeFragment) {
        this.challenge = challenge;
        this.onChangeFragmen = onChangeFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_info_chaleleng, container, false);
        findViews(view);

        initViews();
        return view;
    }

    private void initViews() {
        imageView.setImageBitmap(challenge.image);
        tvInfo.setText(challenge.info);
        tvName.setText(challenge.name);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onChangeFragmen.changeChallenge(0,null);
            }
        });

    }

    private void findViews(View view) {
        back=view.findViewById(R.id.FChallenges_back);
        imageView=view.findViewById(R.id.FShowSummary_image);
        tvInfo=view.findViewById(R.id.FChallenges_info);
        tvName=view.findViewById(R.id.asdasfd);
    }

}
