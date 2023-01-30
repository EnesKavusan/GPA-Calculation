package com.example.gpahesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et, et2, et3, et4, et5, et6, et7, et8;
    TextView tv;
    Button bt;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        et3=findViewById(R.id.editTextTextPersonName3);
        et4=findViewById(R.id.editTextTextPersonName4);
        et5=findViewById(R.id.editTextTextPersonName5);
        et6=findViewById(R.id.editTextTextPersonName6);
        et7=findViewById(R.id.editTextTextPersonName7);
        et8=findViewById(R.id.editTextTextPersonName8);
        tv=findViewById(R.id.textView6);
        bt=findViewById(R.id.button);

 bt.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         float toplamkredi = Float.parseFloat(et.getText().toString()) + Float.parseFloat(et3.getText().toString()) + Float.parseFloat(et5.getText().toString()) + Float.parseFloat(et7.getText().toString());
         System.out.println(toplamkredi);
         float d1tpk = 0,d2tpk = 0,d3tpk = 0,d4tpk = 0,tumderslerkredi = 0,sonuc = 0;

         switch (et2.getText().toString()){
             case "A":
                 d1tpk = Float.parseFloat(et.getText().toString()) * 4;
                 System.out.println(d1tpk);
                 break;
             case "A-":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 3.70);
                 break;
             case "B+":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 3.30);
                 break;
             case "B":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 3);
                 break;
             case "B-":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 2.70);
                 break;
             case "C+":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 2.30);
                 break;
             case "C":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 2);
                 break;
             case "C-":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 1.70);
                 break;
             case "D+":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 1.30);
                 break;
             case "D":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 1);
                 break;
             case "D-":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 0.70);
                 break;
             case "F":
                 d1tpk = (float) (Float.parseFloat(et.getText().toString()) * 0);
                 break;
         }

         switch (et4.getText().toString()){
             case "A":
                 d2tpk = Float.parseFloat(et3.getText().toString()) * 4;
                 System.out.println(d2tpk);
                 break;
             case "A-":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 3.70);
                 break;
             case "B+":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 3.30);
                 break;
             case "B":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 3);
                 break;
             case "B-":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 2.70);
                 break;
             case "C+":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 2.30);
                 break;
             case "C":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 2);
                 break;
             case "C-":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 1.70);
                 break;
             case "D+":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 1.30);
                 break;
             case "D":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 1);
                 break;
             case "D-":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 0.70);
                 break;
             case "F":
                 d2tpk = (float) (Float.parseFloat(et3.getText().toString()) * 0);
                 break;
         }

         switch (et6.getText().toString()){
             case "A":
                 d3tpk = Float.parseFloat(et5.getText().toString()) * 4;
                 System.out.println(d3tpk);
                 break;
             case "A-":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 3.70);
                 break;
             case "B+":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 3.30);
                 break;
             case "B":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 3);
                 break;
             case "B-":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 2.70);
                 break;
             case "C+":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 2.30);
                 break;
             case "C":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 2);
                 break;
             case "C-":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 1.70);
                 break;
             case "D+":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 1.30);
                 break;
             case "D":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 1);
                 break;
             case "D-":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 0.70);
                 break;
             case "F":
                 d3tpk = (float) (Float.parseFloat(et5.getText().toString()) * 0);
                 break;
         }

         switch (et8.getText().toString()){
             case "A":
                 d4tpk = Float.parseFloat(et7.getText().toString()) * 4;
                 System.out.println(d4tpk);
                 break;
             case "A-":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 3.70);
                 break;
             case "B+":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 3.30);
                 break;
             case "B":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 3);
                 break;
             case "B-":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 2.70);
                 break;
             case "C+":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 2.30);
                 break;
             case "C":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 2);
                 break;
             case "C-":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 1.70);
                 break;
             case "D+":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 1.30);
                 break;
             case "D":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 1);
                 break;
             case "D-":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 0.70);
                 break;
             case "F":
                 d4tpk = (float) (Float.parseFloat(et7.getText().toString()) * 0);
                 break;
         }


         tumderslerkredi = d1tpk + d2tpk + d3tpk + d4tpk;
         sonuc = tumderslerkredi/toplamkredi;
         System.out.println(tumderslerkredi);

         tv.setText("GPA = "+sonuc);



     }
 });


    }
}