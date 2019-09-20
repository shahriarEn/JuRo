package com.boldTeam.JuRo;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ActivityMain extends Activity {

    LinearLayout tabMain , tabAccount;
    int numPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        initViews();
    }

    private void initViews() {
        tabMain.setSelected(true);

        setFragment();

//        setListiners();
    }

    private void setListiners() {
        tabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabMain.setSelected(true);
                tabAccount.setSelected(false);
            }
        });
        tabAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tabAccount.setSelected(true);
                tabMain.setSelected(false);
            }
        });
    }

    private void setFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (numPage){
            case 0:
                ft.replace(R.id.AMain_frame, new FragmentMain());
                ft.commit();
                break;
            case 1:
                //TODO: CREATE PROFILE
//                ft.replace(R.id.AMain_frame, new FragmentAccount());
//                ft.commit();
                break;
        }
    }

    private void findViews() {
        tabAccount=findViewById(R.id.AMain_tab_account);
        tabMain=findViewById(R.id.AMain_tab_main);
    }
}
