package com.example.nn0lumesther.mygpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculate extends AppCompatActivity {

    TextView tvName;
    TextView tvLevel;
    TextView tvSemester;
    TextView tvCgpa;
    TextView tvComment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        tvName = (TextView)findViewById(R.id.tvName);
        tvLevel = (TextView)findViewById(R.id.tvLevel);
        tvSemester = (TextView)findViewById(R.id.tvSemester);
        tvCgpa = (TextView)findViewById(R.id.tvCgpa);
        tvComment = (TextView)findViewById(R.id.tvComment);

        Intent intent = getIntent();
        String names = intent.getStringExtra("names");
        String levels = intent.getStringExtra("levels");
        String semesters = intent.getStringExtra("semesters");
        float cgpa = intent.getFloatExtra("cgpa", 0f);
        String comment = intent.getStringExtra("comment");


        tvName.setText("Name: " + names );
        tvLevel.setText("Level: " + levels);
        tvSemester.setText("Semester: " + semesters);
        tvCgpa.setText("CGPA: " + "\n" + cgpa);
        tvComment.setText("Comment: " + "\n" + comment);
}
}