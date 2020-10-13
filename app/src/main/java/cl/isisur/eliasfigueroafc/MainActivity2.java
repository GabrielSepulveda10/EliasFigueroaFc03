package cl.isisur.eliasfigueroafc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button MiBotonA,MiBotonB,MiBotonC,MiBotonD,MiBotonE, MiBotonF;
    private TextView MiTvPrueba;
    private Button MiBoton;
    private Intent MiIntentD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MiBoton = (Button) findViewById(R.id.btAceptar);
        String MiNombre=getIntent().getStringExtra("MiNombre1");
        final Context context =getApplicationContext();
        Toast mensaje =Toast.makeText(context,"Mi Nombre es : "+MiNombre,Toast.LENGTH_SHORT);
        mensaje.show();
        MiBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MiIntent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(MiIntent);
            }
        });



        MiBotonA= (Button) findViewById(R.id.btModuloA);
        MiBotonB= (Button) findViewById(R.id.btModuloB);
        MiBotonC= (Button) findViewById(R.id.btModuloC);
        MiBotonD= (Button) findViewById(R.id.btModuloD);
        MiBotonE= (Button) findViewById(R.id.btModuloE);
        MiBotonF= (Button) findViewById(R.id.btModuloF);
        MiTvPrueba= (TextView) findViewById(R.id.tVPrueba);

        MiBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // acá el codigo para el boton A

                MiTvPrueba.setText("Modulo A");

                Intent MiIntentA = new Intent(MainActivity2.this,MainActivity3.class);
                MiIntentA.putExtra("Modulo","Hola Modulo A desde Modulo Uno");
                MiIntentA.putExtra("Numero",33);
                startActivity(MiIntentA);

            }
        });

        MiBotonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acá el codigo para el boton B
                MiTvPrueba.setText("Modulo B");
                Intent MiIntentB = new Intent(MainActivity2.this,MainActivity4.class);
                MiIntentB.putExtra("Modulo","Hola Modulo B desde Modulo Uno");
                MiIntentB.putExtra("Numero",33);
                startActivity(MiIntentB);
            }
        });


        MiBotonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acá el codigo para el Boton C
                MiTvPrueba.setText(("Modulo C"));

                Intent MiIntentC = new Intent(MainActivity2.this,MainActivity5.class);
                MiIntentC.putExtra("Modulo","Hola Modulo C desde Modulo Uno");
                MiIntentC.putExtra("Numero",33);
                startActivity(MiIntentC);


            }
        });

        MiBotonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acá el codigo para el Boton C
                MiTvPrueba.setText(("Modulo D"));

                Intent MiIntentC = new Intent(MainActivity2.this,MainActivity6.class);
                MiIntentC.putExtra("Modulo","Hola Modulo D desde Modulo Uno");
                MiIntentC.putExtra("Numero",33);
                startActivity(MiIntentC);


            }
        });
        MiBotonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MiTvPrueba.setText(("Modulo E"));

                Intent MiIntentC = new Intent(MainActivity2.this,MainActivity7.class);
                MiIntentC.putExtra("Modulo","Hola Modulo E desde Modulo Uno");
                MiIntentC.putExtra("Numero",33);
                startActivity(MiIntentC);


            }
        });



        MiBotonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MiTvPrueba.setText(("Modulo F"));

                Intent MiIntentC = new Intent(MainActivity2.this,MainActivity8.class);
                MiIntentC.putExtra("Modulo","Hola Modulo F desde Modulo Uno");
                MiIntentC.putExtra("Numero",33);
                startActivity(MiIntentC);


            }
        });




    }
}