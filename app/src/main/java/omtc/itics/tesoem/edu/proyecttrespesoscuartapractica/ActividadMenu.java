package omtc.itics.tesoem.edu.proyecttrespesoscuartapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_menu);
    }
    public void SiguienteBaby(View view){
        Intent siguiente = new Intent(this, Actividad1.class);
        startActivity(siguiente);
    }
    public void SiguienteCell(View view){
        Intent siguiente = new Intent(this, Actividad2.class);
        startActivity(siguiente);
    }
    public void SiguienteGohan(View view){
        Intent siguiente = new Intent(this, Actividad3.class);
        startActivity(siguiente);
    }
    public void SiguienteGoku(View view){
        Intent siguiente = new Intent(this, Actividad4.class);
        startActivity(siguiente);
    }
    public void SiguienteKidBuu(View view){
        Intent siguiente = new Intent(this, Actividad5.class);
        startActivity(siguiente);
    }
    public void SiguienteNappa(View view){
        Intent siguiente = new Intent(this, Actividad6.class);
        startActivity(siguiente);
    }
    public void SiguientePiccoro(View view){
        Intent siguiente = new Intent(this, Actividad7.class);
        startActivity(siguiente);
    }
    public void SiguienteRaditz(View view){
        Intent siguiente = new Intent(this, Actividad8.class);
        startActivity(siguiente);
    }
    public void SiguienteTrunks(View view){
        Intent siguiente = new Intent(this, Actividad9.class);
        startActivity(siguiente);
    }
    public void SiguienteVegeta(View view){
        Intent siguiente = new Intent(this, Actividad10.class);
        startActivity(siguiente);
    }
}

