package com.tetblocks.mythread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void start(View v)
    {

        new Thread(){

            @Override
            public void run() {

                int i=0;

                try
                {

                    while (i<10)
                    {
                        sleep(1000);
                        Log.d("",i+"");
                        i++;
                    }

                }
                catch (Exception ed)
                {
                    System.out.println("Error code 10:"+ed);
                }
            }
        }.start();
        Toast.makeText(this,"Thread is started.",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}