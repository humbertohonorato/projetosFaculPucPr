package com.bmicalculator.mobile.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etPeso, etAltura;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Certifique-se de que activity_main.xml está correto

        // Inicializar os componentes
        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        // Configurar o botão para calcular o IMC ao ser clicado
        btnCalcular.setOnClickListener(view -> calcularIMC());
    }

    private void calcularIMC() {
        String pesoStr = etPeso.getText().toString();
        String alturaStr = etAltura.getText().toString();

        if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            if (peso <= 0 || altura <= 0) {
                Toast.makeText(this, "Valores inválidos!", Toast.LENGTH_SHORT).show();
                return;
            }

            double imc = peso / (altura * altura);
            String resultado = String.format("Seu IMC é: %.2f", imc);
            tvResultado.setText(resultado);

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Digite valores numéricos válidos.", Toast.LENGTH_SHORT).show();
        }
    }
}
