package com.example.apradhan.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private String[] horlabels = {"2700", "2750", "2800", "2850","2900","2950","3000","3050","3100"};
    private String[] verlabels = {"500", "1000", "1500", "2000"};
    private GraphView graph;
    private FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        graph = new GraphView(this, new float[0], "cse535assignment1", horlabels, verlabels,true);
    }

    public void runGraph(View view) {
        fl = (FrameLayout) findViewById(R.id.graphic);
        fl.addView(graph);

    }
}
