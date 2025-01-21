package com.brunocarvalho.exappgasolinaalcool

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textGasolina: TextView
    private lateinit var textAlcool: TextView
    private lateinit var textResultado: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        textGasolina = findViewById(R.id.text_gasolina)
        textAlcool = findViewById(R.id.text_alcool)
        textResultado = findViewById(R.id.text_resultado)

        var i = intent.extras
        if(i != null) {
            val precoGasolina = i.getDouble("precoGasolina")
            val precoAlcool = i.getDouble("precoAlcool")

            textGasolina.text = "Preço gasolina: $precoGasolina"
            textAlcool.text = "Preço Álcool: $precoAlcool"

            val resultado = precoAlcool / precoGasolina

            textResultado.text = if (resultado > 0.7)
                 "Gasolina"
            else
                "Álcool"
        }

    }
}