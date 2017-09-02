package com.example.nn0lumesther.mygpcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {
    float gp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view){
        float gp;
        int unitLoad;
        int loadGrade;
        int loadGrade1;
        int loadGrade2;
        int loadGrade3;
        int loadGrade4;
        int loadGrade5;
        int loadGrade6;
        int loadGrade7;
        int loadGrade8;
        int loadGrade9;
        int loadGrade10;
        int loadGrade11;
        int loadGrade12;
        int loadGrade13;
        int loadGrade14;
        int loadGrade15;


        EditText name = (EditText) findViewById(R.id.nameTv);
        String nameTv = name.getText().toString();

        Spinner level = (Spinner) findViewById(R.id.levelTv);
        String levelTv = level.getSelectedItem().toString();

        Spinner semester = (Spinner) findViewById(R.id.semesterTv);
        String semesterTv = semester.getSelectedItem().toString();

        //to get the value of the edit text of grades
        Spinner load1 = (Spinner) findViewById(R.id.grade_one);
        int loadEdit = Integer.parseInt(load1.getSelectedItem().toString());

        Spinner load2 = (Spinner) findViewById(R.id.grade_two);
        int loadEdit2 = Integer.parseInt(load2.getSelectedItem().toString());

        Spinner load3 = (Spinner) findViewById(R.id.grade_three);
        int loadEdit3 = Integer.parseInt(load3.getSelectedItem().toString());

        Spinner load4 = (Spinner) findViewById(R.id.grade_four);
        int loadEdit4 = Integer.parseInt(load4.getSelectedItem().toString());

        Spinner load5 = (Spinner) findViewById(R.id.grade_five);
        int loadEdit5 = Integer.parseInt(load5.getSelectedItem().toString());

        Spinner load6 = (Spinner) findViewById(R.id.grade_six);
        int loadEdit6 = Integer.parseInt(load6.getSelectedItem().toString());

        Spinner load7 = (Spinner) findViewById(R.id.grade_seven);
        int loadEdit7 = Integer.parseInt(load7.getSelectedItem().toString());

        Spinner load8 = (Spinner) findViewById(R.id.grade_eight);
        int loadEdit8 = Integer.parseInt(load8.getSelectedItem().toString());

        Spinner load9 = (Spinner) findViewById(R.id.grade_nine);
        int loadEdit9 = Integer.parseInt(load9.getSelectedItem().toString());

        Spinner load10 = (Spinner) findViewById(R.id.grade_ten);
        int loadEdit10 = Integer.parseInt(load10.getSelectedItem().toString());

        Spinner load11 = (Spinner) findViewById(R.id.grade_eleven);
        int loadEdit11 = Integer.parseInt(load11.getSelectedItem().toString());

        Spinner load12 = (Spinner) findViewById(R.id.grade_twelve);
        int loadEdit12 = Integer.parseInt(load12.getSelectedItem().toString());

        Spinner load13 = (Spinner) findViewById(R.id.grade_thirteen);
        int loadEdit13 = Integer.parseInt(load13.getSelectedItem().toString());

        Spinner load14 = (Spinner) findViewById(R.id.grade_fourteen);
        int loadEdit14 = Integer.parseInt(load14.getSelectedItem().toString());

        Spinner load15 = (Spinner) findViewById(R.id.grade_fifteen);
        int loadEdit15 = Integer.parseInt(load15.getSelectedItem().toString());

        //to get the value of the spinner
        Spinner grade1Spinner = (Spinner) findViewById(R.id.spinner3);
        int grade1 = Integer.parseInt(grade1Spinner.getSelectedItem().toString());

        Spinner grade2Spinner = (Spinner) findViewById(R.id.spinner4);
        int grade2 = Integer.parseInt(grade2Spinner.getSelectedItem().toString());

        Spinner grade3Spinner = (Spinner) findViewById(R.id.spinner5);
        int grade3 = Integer.parseInt(grade3Spinner.getSelectedItem().toString());

        Spinner grade4Spinner = (Spinner) findViewById(R.id.spinner6);
        int grade4 = Integer.parseInt(grade4Spinner.getSelectedItem().toString());

        Spinner grade5Spinner = (Spinner) findViewById(R.id.spinner7);
        int grade5 = Integer.parseInt(grade5Spinner.getSelectedItem().toString());

        Spinner grade6Spinner = (Spinner) findViewById(R.id.spinner8);
        int grade6 = Integer.parseInt(grade6Spinner.getSelectedItem().toString());

        Spinner grade7Spinner = (Spinner) findViewById(R.id.spinner9);
       int grade7 = Integer.parseInt(grade7Spinner.getSelectedItem().toString());

        Spinner grade8Spinner = (Spinner) findViewById(R.id.spinner10);
        int grade8 = Integer.parseInt(grade8Spinner.getSelectedItem().toString());

        Spinner grade9Spinner = (Spinner) findViewById(R.id.spinner11);
        int grade9 = Integer.parseInt(grade9Spinner.getSelectedItem().toString());

        Spinner grade10Spinner = (Spinner) findViewById(R.id.spinner12);
        int grade10 = Integer.parseInt(grade10Spinner.getSelectedItem().toString());

        Spinner grade11Spinner = (Spinner) findViewById(R.id.spinner13);
        int grade11 = Integer.parseInt(grade11Spinner.getSelectedItem().toString());

        Spinner grade12Spinner = (Spinner) findViewById(R.id.spinner14);
        int grade12 = Integer.parseInt(grade12Spinner.getSelectedItem().toString());

        Spinner grade13Spinner = (Spinner) findViewById(R.id.spinner15);
        int grade13 = Integer.parseInt(grade13Spinner.getSelectedItem().toString());

        Spinner grade14Spinner = (Spinner) findViewById(R.id.spinner16);
        int grade14 = Integer.parseInt(grade14Spinner.getSelectedItem().toString());

        Spinner grade15Spinner = (Spinner) findViewById(R.id.spinner17);
        int grade15 = Integer.parseInt(grade15Spinner.getSelectedItem().toString());


        unitLoad = loadEdit + loadEdit2 + loadEdit3 + loadEdit4 + loadEdit5 + loadEdit6 +
                loadEdit7 + loadEdit8 + loadEdit9 + loadEdit10 + loadEdit11 + loadEdit12 +
                loadEdit13 + loadEdit14 + loadEdit15;

        loadGrade1 = loadEdit * grade1;
        loadGrade2 = loadEdit2 * grade2;
        loadGrade3 = loadEdit3 * grade3;
        loadGrade4 = loadEdit4 * grade4;
        loadGrade5 = loadEdit5 * grade5;
        loadGrade6 = loadEdit6 * grade6;
        loadGrade7 = loadEdit7 * grade7;
        loadGrade8 = loadEdit8 * grade8;
        loadGrade9 = loadEdit9 * grade9;
        loadGrade10 = loadEdit10 * grade10;
        loadGrade11 = loadEdit11 * grade11;
        loadGrade12 = loadEdit12 * grade12;
        loadGrade13 = loadEdit13 * grade13;
        loadGrade14 = loadEdit14 * grade14;
        loadGrade15 = loadEdit15 * grade15;


        loadGrade = loadGrade1 + loadGrade2 + loadGrade3 + loadGrade4 + loadGrade5 + loadGrade6 +
                loadGrade7 + loadGrade8 + loadGrade9 + loadGrade10 + loadGrade11 + loadGrade12 +
                loadGrade13 + loadGrade14 + loadGrade15;
        gp = loadGrade / (float)unitLoad;


     Intent intent = new Intent(this, calculate.class);
     intent.putExtra("names", nameTv);
        intent.putExtra("levels", levelTv);
        intent.putExtra("semesters", semesterTv);
        intent.putExtra("cgpa", gp);
if (gp < 2){
    intent.putExtra("comment",getString(R.string.comment_info2));
}else if(gp < 3){
    intent.putExtra("comment",getString(R.string.comment_info1));
}else if(gp < 4){
    intent.putExtra("comment",getString(R.string.comment_info3));
}else if(gp > 4){
    intent.putExtra("comment",getString(R.string.comment_info4));
}

        startActivity(intent);

    }


    /** Context context = getApplicationContext();
        CharSequence text = "Your gp is: " + "gp";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);**/
 }

