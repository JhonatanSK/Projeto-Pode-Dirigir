package br.com.podedirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_iniciar.setOnClickListener {
            val nome = edt_nome.editableText.toString().trim()
            if(nome.isNotEmpty()){

                val intent = Intent (this, Tela2 ::class.java)
                intent.putExtra("Nome", nome)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Digite seu nome", Toast.LENGTH_LONG).show()
            }
        }
    }
}
