package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MinorActivity extends AppCompatActivity {

    TextView tvShowInput;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor);

        initViewElement();

        Intent it = this.getIntent();
        if (it != null){
            Bundle bundle = it.getExtras();
            if (bundle != null){
                String inputStr = bundle.getString("input");
                if(inputStr  != null && !inputStr.equals("")){
                    tvShowInput.setText(inputStr);
                }
            }
        }
        btnReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                //finish current activity
                finish();
            }
        });
    }

    private void initViewElement(){
        btnReturn = (Button) findViewById(R.id.btnReturn);
        tvShowInput = (TextView) findViewById(R.id.tvShowInput);
    }
}
