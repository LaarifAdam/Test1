package com.example.adam.test1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerToCheckBox();
    }

    public void onButtonClick(View v) {

        TextView s = (TextView) findViewById(R.id.textView);


        StringBuffer ch1 = new StringBuffer();
        int r;
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);

        EditText e1 = (EditText) findViewById(R.id.n1);
        EditText e2 = (EditText) findViewById(R.id.n2);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());


        if (c1.isChecked()) {
            r = num1 + num2;
            ch1.append("summ is checked  \n  Result is");
            c2.setChecked(false);
            c3.setChecked(false);

        } else if (c2.isChecked()) {
            r = num1 - num2;
            ch1.append("sub is checked  \n  Result is");
            c1.setChecked(false);
            c3.setChecked(false);
        } else {
            r = num1 * num2;
            ch1.append("multiplication is checked \n  Result is");
            c1.setChecked(false);
            c2.setChecked(false);
        }


        Toast.makeText(this, ch1.append(Integer.toString(r)), Toast.LENGTH_LONG).show();
        s.setText(Integer.toString(r));
    }

    public void addListnerToCheckBox() {
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "summ is checked", LENGTH_SHORT).show();
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sub is checked", LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Multiplication is checked", LENGTH_SHORT).show();
            }
        });
    }
    public void rdOnClick(View view) {
        Toast.makeText(MainActivity.this, "butt1 is checked", LENGTH_SHORT).show();
    }
}
// some changes here are okey
