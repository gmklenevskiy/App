package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rock = (TextView) findViewById(R.id.rock_category);
        rock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        TextView pop = (TextView) findViewById(R.id.pop_category);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this,PopActivity.class);
                startActivity(popIntent);
            }
        });

        TextView hipHop = (TextView) findViewById(R.id.hip_hop_category);
        hipHop.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                Intent hipHopIntent = new Intent(MainActivity.this,HipHopActivity.class);
                startActivity(hipHopIntent);
            }
        });

        TextView electronic = (TextView) findViewById(R.id.electronic_category);
        electronic.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                Intent electronicIntent = new Intent(MainActivity.this,ElectronicActivity.class);
                startActivity(electronicIntent);
            }
        });
    }
}
