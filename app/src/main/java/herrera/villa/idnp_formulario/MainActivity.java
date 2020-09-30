package herrera.villa.idnp_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import herrera.villa.idnp_formulario.R;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellido,edad,correo,cui;
    Button aceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombre   = (EditText)findViewById(R.id.editNombre);
        apellido = (EditText)findViewById(R.id.editApellidos);
        edad     = (EditText)findViewById(R.id.editEdad);
        correo   = (EditText)findViewById(R.id.editCorreo);
        aceptar  = (Button) findViewById(R.id.btnAceptar);
        cui      = (EditText)findViewById(R.id.editCUI);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nombre.getText().toString();
                String apelli=apellido.getText().toString();
                String eda=edad.getText().toString();
                String correoo=correo.getText().toString();
                String cuii=cui.getText().toString();
               // Intent i = new Intent(MainActivity.this, herrera.villa.registroestudiante.DatosEstudiantes.class);
                Intent i = new Intent(MainActivity.this,DatosEstudiantes.class);
                i.putExtra( "name",name);
                i.putExtra( "apelli",apelli);
                i.putExtra( "eda",eda);
                i.putExtra( "correoo",correoo);
                i.putExtra( "cuii",cuii);
                startActivity(i);
            }
        });
    }
}