package com.lyna.www.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onClickRadioButton(View view) {

        int id = view.getId();
        String text = ((RadioButton)view).getText().toString();
        switch (id) {
            case R.id.radioButton1:
            case R.id.radioButton2:
                text += "-" + ((RadioButton)view).isChecked();
                textView.setText(text);
                break;
            default:
                text = "Nothing!";
        }

    }
}
