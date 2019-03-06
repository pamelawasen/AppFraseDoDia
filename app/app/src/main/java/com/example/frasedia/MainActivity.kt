package com.example.frasedia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf("A persistência é o caminho do êxito.",
                        "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                        "Só existe um êxito: a capacidade de levar a vida que se quer.",
                        "Seja tudo o quiser ser, mas acima de tudo, seja você sempre.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textFrase)

    }
    fun gerarFrase(view: View){

        val totalItensArray= frases.size
        val numeroAleatorio= Random().nextInt(totalItensArray)
        texto.setText(frases[numeroAleatorio])
    }
}
