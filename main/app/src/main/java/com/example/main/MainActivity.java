package com.example.main;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; // 開新頁面用或轉移用的
import android.os.Bundle; // 頁面轉移帶參數用的
import android.view.View; // 頁面上的instance
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etInputBox;
    Button btnSubmit;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 設定對應的 Layout 頁面

        initViewElement();
        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Bundle bundle = new Bundle();
                bundle.putString("input", etInputBox.getText().toString());

                //初始化Intent物件
                Intent it = new Intent();

                //傳遞參數
                it.putExtras(bundle);

                //從MainActivity 到 MinorActivity
                it.setClass(MainActivity.this, MinorActivity.class); //轉移頁面
                startActivity(it);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                etInputBox.setText("");
            }
        });
    }
    private void initViewElement(){
        // R class 是 aapt 工具自動生成的 Class，它通過資源ID來取得資源。
        // https://reurl.cc/jgol3p

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnClear = (Button) findViewById(R.id.btnClear);
        etInputBox = (EditText) findViewById(R.id.etInputBox);

    }
}