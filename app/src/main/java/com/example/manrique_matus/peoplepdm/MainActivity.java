package com.example.manrique_matus.peoplepdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public int cantidad=0;
    TextView contador;
    Button btn_1;
    Button btn_2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=(TextView)findViewById(R.id.contador);
        btn_1=(Button)findViewById(R.id.add);
        btn_2=(Button)findViewById(R.id.reset);
        img=(ImageView)findViewById(R.id.momazo);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidad++;
                contador.setText(""+cantidad);
                if(cantidad>5) img.setVisibility(View.VISIBLE);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidad=0;
                contador.setText(""+cantidad);
                img.setVisibility(View.INVISIBLE);
            }
        });
    }

}
