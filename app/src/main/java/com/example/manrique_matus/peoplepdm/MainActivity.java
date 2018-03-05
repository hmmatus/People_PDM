package com.example.manrique_matus.peoplepdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Creo los atributos de la clase
    public int cantidad=0;
    TextView contador;
    Button btn_1;
    Button btn_2;
    ImageView img;
//La clase onCreate que levantaa la vistaa del xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancio las variables dentro del onCreate

        contador=(TextView)findViewById(R.id.contador);
        btn_1=(Button)findViewById(R.id.add);
        btn_2=(Button)findViewById(R.id.reset);
        img=(ImageView)findViewById(R.id.momazo);

        //setOnClickListener genera que al dar click en el boton se aejecute la funcion onClick dentro de esta
        //HEY LISTEN BEACH, descifra el codigo y te ganas un punto en el labo :v
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
