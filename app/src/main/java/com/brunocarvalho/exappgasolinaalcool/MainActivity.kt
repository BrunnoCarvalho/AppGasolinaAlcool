package com.brunocarvalho.exappgasolinaalcool

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular : Button

    private lateinit var inputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var inputAlcool: TextInputLayout
    private lateinit var editAlcool: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)
        
        inputGasolina = findViewById(R.id.text_input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)
        
        inputAlcool = findViewById(R.id.text_input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)

        btnCalcular.setOnClickListener {

            var i = Intent(this, ResultadoActivity::class.java)
            verificaDados(editGasolina.text.toString(), editAlcool.text.toString(), i)

        }

    }

    override fun onStop() {
        super.onStop()
        editAlcool.text = null
        editGasolina.text = null
        editAlcool.clearFocus()
        editGasolina.clearFocus()
    }

    private fun verificaDados(editGasolina: String, editAlcool: String, i: Intent) {

        inputAlcool.error = null
        inputGasolina.error = null

        if(editGasolina.isNotEmpty() && editAlcool.isNotEmpty()){
            i.putExtra("precoGasolina", editGasolina.toDouble())
            i.putExtra("precoAlcool", editAlcool.toDouble())
            startActivity(i)
        }else if(editGasolina.isEmpty()){
            inputGasolina.error = "Digite o preço da gasolina"
        }else{
            inputAlcool.error = "Digite o preço do álcool"
        }

    }
}