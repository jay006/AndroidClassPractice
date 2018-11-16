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

public class FragmentOne extends Fragment {

    public FragmentOne() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        Button btn = v.findViewById(R.id.fragBtnOne);
        btn.setOnClickListener(view->{
            Toast.makeText(getContext(),"This is frgament One",Toast.LENGTH_SHORT).show();
        });
        return v;
    }
}
