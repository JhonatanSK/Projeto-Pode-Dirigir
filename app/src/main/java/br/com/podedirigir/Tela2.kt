package br.com.podedirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val nome = intent.getStringExtra("Nome")
        txv_nome.text = "Bem vindo ${nome}!"
        var idades = arrayListOf<Int>()

        for (idade in 1..100){
            idades.add(idade)
        }
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, idades)
        spn_lista.adapter = adapter

        btn_verificar.setOnClickListener {
            var idadeSelecionada = spn_lista.selectedItem as Int


            if (idadeSelecionada >= 18) {
                txv_resultado.text = "Já pode dirigir!"
            } else {
                txv_resultado.text = "Ainda não atingiu a maioridade"
            }
        }
    }
}
