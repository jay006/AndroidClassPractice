package com.example.joker.androidclasspractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentTwo extends Fragment {

    public FragmentTwo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        Button btn = v.findViewById(R.id.fragBtnTwo);
        btn.setOnClickListener(view->{
            Toast.makeText(getContext(),"This is frgament Two",Toast.LENGTH_SHORT).show();
        });
        return v;
    }

}
