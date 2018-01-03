package com.timedo.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button1.setOnClickListener(click);
        button2.setOnClickListener(click);
        button3.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener() {


        Fragment fr;

        @Override
        public void onClick(View view) {



            switch (view.getId()){

                case R.id.button1:

                    fr = new FragmentOneActivity();

                    break;

                case R.id.button2:

                    fr = new FragmentTwoActivity();
                    break;
                case R.id.button3:

                    fr = new FragmentThreeActivity();
                    break;



            }

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();




        }
    };


}
