package com.example.radiogrouptoast;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Referencias a los botones de colores
        Button redButton = findViewById(R.id.botonRojo);
        Button blueButton = findViewById(R.id.botonAzul);
        Button greenButton = findViewById(R.id.botonVerde);
        Button yellowButton = findViewById(R.id.botonAmarillo);

        // Configura el comportamiento para cada botón de color
        redButton.setOnClickListener(v -> mostrarToastColor("Rojo", Color.RED));
        blueButton.setOnClickListener(v -> mostrarToastColor("Azul", Color.BLUE));
        greenButton.setOnClickListener(v -> mostrarToastColor("Verde", Color.GREEN));
        yellowButton.setOnClickListener(v -> mostrarToastColor("Amarillo", Color.YELLOW));
    }

    // Método para mostrar el Toast con el nombre y el color del texto seleccionado
    private void mostrarToastColor(String nombreColor, int color) {
        Toast toast = Toast.makeText(getApplicationContext(), nombreColor, Toast.LENGTH_SHORT);
        View view = toast.getView();

        // Cambia el color del texto del Toast
        view.findViewById(android.R.id.message).setBackgroundColor(Color.TRANSPARENT);
        ((TextView) view.findViewById(android.R.id.message)).setTextColor(color);

        toast.show();
    };
}

