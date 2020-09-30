package herrera.villa.idnp_formulario;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import herrera.villa.idnp_formulario.R;

public class DatosEstudiantes extends AppCompatActivity {
    TextView tunombre,tuapellido,tuedad,tucorreo,tucuii;
    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_datos_estudiantes);
        tunombre=(TextView)findViewById(R.id.tuNombre) ;
        tuapellido=(TextView)findViewById(R.id.tuApellidos) ;
        tuedad=(TextView)findViewById(R.id.tuEdad) ;
        tucorreo=(TextView)findViewById(R.id.tuCorreo) ;
        tucuii=(TextView)findViewById(R.id.tuCui) ;
        btnOK=(Button) findViewById(R.id.btnOk) ;

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent (DatosEstudiantes.this, herrera.villa.registroestudiante.MainActivity.class);
                Intent intent = new Intent (DatosEstudiantes.this,MainActivity.class);
                startActivity(intent);
            }
        });
        mostrarDatos();
    }
    private void mostrarDatos(){
        Bundle datos=this.getIntent().getExtras();
        String nombre= datos.getString("name");
        String apellido= datos.getString("apelli");
        String edad = datos.getString("eda");
        String correo= datos.getString("correoo");
        String cuui= datos.getString("cuii");
        tunombre.setText(nombre);
        tuapellido.setText(apellido);
        tuedad.setText(edad);
        tucorreo.setText(correo);
        tucuii.setText(cuui);
    }
}