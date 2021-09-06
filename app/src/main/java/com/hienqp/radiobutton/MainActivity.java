package com.hienqp.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupTIME;
    RadioButton radioButtonMORNING;
    RadioButton radioButtonNOON;
    RadioButton radioButtonAFTERNOON;

    Button buttonConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupTIME = (RadioGroup) findViewById(R.id.radioGroup_THOIGIAN);

        radioButtonMORNING = (RadioButton) findViewById(R.id.radioButton_SANG);
        radioButtonNOON = (RadioButton) findViewById(R.id.radioButton_TRUA);
        radioButtonAFTERNOON = (RadioButton) findViewById(R.id.radioButton_CHIEU);

        buttonConfirm = (Button) findViewById(R.id.button_XACNHAN);

        radioGroupTIME.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId : id của radioButton con
                switch (checkedId) {
                    case R.id.radioButton_SANG:
                        Toast.makeText(MainActivity.this, "Bạn đã chọn Sáng", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton_TRUA:
                        Toast.makeText(MainActivity.this, "Bạn đã chọn Trưa", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton_CHIEU:
                        Toast.makeText(MainActivity.this, "Bạn đã chọn Chiều", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonMORNING.isChecked()) {
                    Toast.makeText(MainActivity.this, radioButtonMORNING.getText(), Toast.LENGTH_SHORT).show();
                }
                if (radioButtonNOON.isChecked()) {
                    Toast.makeText(MainActivity.this, radioButtonNOON.getText(), Toast.LENGTH_SHORT).show();
                }
                if (radioButtonAFTERNOON.isChecked()) {
                    Toast.makeText(MainActivity.this, radioButtonAFTERNOON.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}