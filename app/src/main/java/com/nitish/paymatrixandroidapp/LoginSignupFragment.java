package com.nitish.paymatrixandroidapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginSignupFragment extends Fragment {

    private Button button;
    private TextView t1,t2,t3,t4,t5;
    private EditText et1,et2,et3,et4,et5;
    public LoginSignupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_signup, container, false);
        String str=getArguments().getString("text");

        t1=view.findViewById(R.id.name_text_view);
        t2=view.findViewById(R.id.mobile_text_view);
        t3=view.findViewById(R.id.email_mobile_text_view);
        t4=view.findViewById(R.id.email_text_view);
        t5=view.findViewById(R.id.password_text_view);

        et1=view.findViewById(R.id.editText1);
        et2=view.findViewById(R.id.editText2);
        et3=view.findViewById(R.id.editText3);
        et4=view.findViewById(R.id.editText4);
        et5=view.findViewById(R.id.editText5);

        if(str.equals("LOGIN"))
        {
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            t4.setVisibility(View.GONE);
            et1.setVisibility(View.GONE);
            et2.setVisibility(View.GONE);
            et4.setVisibility(View.GONE);
        }
        else
        {
            t3.setVisibility(View.GONE);
            et3.setVisibility(View.GONE);
        }
        button=view.findViewById(R.id.submit_button);
        button.setText(str);

        return view;
    }

    public void login(View v){
        new LoginActivity().login(v);
    }

}
