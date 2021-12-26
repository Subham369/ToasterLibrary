package com.example.toasterlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.toasterdisplay.Toaster;

public class MainActivity extends AppCompatActivity {

    TextView tv_view;
    EditText edtText;
    Button btn_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_view=findViewById(R.id.tv_view);
        edtText=findViewById(R.id.edtText);
        btn_display=findViewById(R.id.btn_display);

        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= Toaster.ToastDisplay(MainActivity.this,edtText.getText().toString());
                tv_view.setText(str);
            }
        });


    }
}