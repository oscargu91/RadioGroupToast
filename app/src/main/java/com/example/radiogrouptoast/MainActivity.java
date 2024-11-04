package com.example.radiogrouptoast;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        RadioGroup grupo = findViewById(R.id.radioGrupo);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton boton = findViewById(grupo.getCheckedRadioButtonId());

                SpannableStringBuilder cadena = new SpannableStringBuilder();
                if (boton.getText().equals("Rojo")) {
                    cadena.append("Rojo");
                    cadena.setSpan(new ForegroundColorSpan(Color.RED), 0, cadena.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                } else if (boton.getText().equals("Azul")) {
                    cadena.append("Azul");
                    cadena.setSpan(new ForegroundColorSpan(Color.BLUE), 0, cadena.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                } else {
                    cadena.append("Verde");
                    cadena.setSpan(new ForegroundColorSpan(Color.GREEN), 0, cadena.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                }

                Toast.makeText(MainActivity.this, cadena, Toast.LENGTH_LONG).show();

            }
        });


    }
}






