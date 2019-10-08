package omtc.itics.tesoem.edu.proyecttrespesoscuartapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Actividad9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad9);
    }
    public void Retorno (View view){
        Intent siguiente = new Intent(this, ActividadMenu.class);
        startActivity(siguiente);
    }

}