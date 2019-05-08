package com.e.checkbox_basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.androidCheckBox);  //Android checkbox
        c1.setOnClickListener(this);

        c2=findViewById(R.id.javaCheckBox);     //java checkbox
        c2.setOnClickListener(this);

        c3=findViewById(R.id.phpCheckBox);      //php checkbox
        c3.setOnClickListener(this);

        c4=findViewById(R.id.pythonCheckBox);   //python checkbox
        c4.setOnClickListener(this);

        c5=findViewById(R.id.unityCheckBox);    //unity 3D checkbox
        c5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.androidCheckBox:
                if (c1.isChecked())
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
                break;

            case R.id.javaCheckBox:
                if (c2.isChecked())
                    Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
                break;

            case R.id.phpCheckBox:
                if (c3.isChecked())
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_LONG).show();
                break;

            case R.id.pythonCheckBox:
                if (c4.isChecked())
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_LONG).show();
                break;

            case R.id.unityCheckBox:
                if (c5.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
