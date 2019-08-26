package com.example.aplikasihitungtugas2pwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class rumus extends AppCompatActivity implements View.OnClickListener {

    EditText edtd1, edtd2, edts1;
    double rumus1;
    double rumus2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);

        edtd1 = findViewById(R.id.edit_d1);
        edtd2 = findViewById(R.id.edit_d2);
        edts1= findViewById(R.id.edit_s1);

        Button btn = findViewById(R.id.btn_2);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_2) {
            if (edtd1.getText().toString().equals("")) {
                rumus1 = 0;
            } else {
                rumus1 = 1/2 * Double.parseDouble(edtd2.getText().toString())*Double.parseDouble(edtd2.getText().toString());
            }
            if (edts1.getText().toString().equals("")) {
                rumus2 = 0;
            } else {
                rumus2 = 4 *Double.parseDouble(edts1.getText().toString());
            }

            Intent intent = new Intent(rumus.this, result.class);
            intent.putExtra("result1", rumus1);
            intent.putExtra("result2", rumus2);
            startActivity(intent);

        }
    }
}