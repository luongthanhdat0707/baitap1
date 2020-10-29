package com.example.bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtkq;
    EditText edtsoa, edtsob;
    Button btnkq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtkq = findViewById(R.id.textviewkq);
        edtsoa = findViewById(R.id.editsoa);
        edtsob = findViewById(R.id.editsob);
        btnkq = findViewById(R.id.buttonkq);

        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtsoa.getText().toString());
                int b = Integer.parseInt(edtsob.getText().toString());
                int Tong = a + b;
                txtkq.setText(Tong + "");
            }
        });
    }
}
