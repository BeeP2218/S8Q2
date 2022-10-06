package com.example.s8q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp1;
    TimePicker tp1;
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp1=(DatePicker) findViewById(R.id.datePicker);
        tp1=(TimePicker) findViewById(R.id.timePicker);
        b1=(Button) findViewById(R.id.button);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);

        t1.setText("Date is-"+getCurrentDate());
        t2.setText("Time is-"+getCurrentTime());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Changed Date is-"+getCurrentDate());
                t2.setText("Changed Time is-"+getCurrentTime());
            }
        });
    }
    public String getCurrentDate(){
        StringBuilder sb=new StringBuilder();
        sb.append((dp1.getMonth()+1)+"/");
        sb.append(dp1.getDayOfMonth()+"/");
        sb.append(dp1.getYear());
        return sb.toString();
    }

    public String getCurrentTime(){
        StringBuilder sb2=new StringBuilder();
        sb2.append(tp1.getCurrentHour()+":");
        sb2.append(tp1.getCurrentMinute());
        return sb2.toString();
    }
}