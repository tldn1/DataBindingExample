package com.atiscom.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.atiscom.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    DisplayTextModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        model = new DisplayTextModel();
        model.editText.set("");
        model.textView.set("EditText text will appear here");
        binding.setModel(model);

    }

    public void displayText(View view) {
        model.textView.set(model.editText.get());
    }
}
