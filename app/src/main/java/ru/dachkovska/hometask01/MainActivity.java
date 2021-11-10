package ru.dachkovska.hometask01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intent2=new Intent(this,ThirdActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}