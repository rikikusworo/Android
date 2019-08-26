package com.example.aplikasihitungtugas2pwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView kd1, kd2, ks1 ;
    String jd1, jd2, js1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btn = findViewById(R.id.btn_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(result.this, MainActivity.class);
                startActivity(intent);
            }
        });

        kd1 = findViewById(R.id.d1);
        jd1 = String.valueOf(getIntent().getDoubleExtra("result1", 0));
        kd1.setText(jd1);

        ks1 = findViewById(R.id.edit_s1);
        js1 = String.valueOf(getIntent().getDoubleExtra("result2", 0));
        ks1.setText(js1);

    }
}
