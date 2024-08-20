package com.example.activityfragment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


lateinit var btn_fechar: Button
lateinit var textView: TextView



class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo de vida", "onCreate")
        setContentView(R.layout.activity_detalhes)


        btn_fechar = findViewById(R.id.btn_fechar)
        textView = findViewById(R.id.textView)

        val bundle = intent.extras
        if (bundle != null){
//            val filme = bundle.getString("filme")

              val filme = if (Build.VERSION.SDK_INT >= 33 ) {
//                  bundle.getSerializable("filme", Filme::class.java)
                    bundle.getParcelable("", Filme::class.java)
              }else{
                    bundle.getParcelable("filme")
//                  bundle.getSerializable("filme") as Filme
              }
//
//            val resultado = "FILME: $filme"
//            val filme = bundle.getSerializable("filme") as Filme

            textView.text = "${filme?.nome} - ${filme?.avaliacao} - ${filme?.descricao}"
//            textView.text = resultado
        }

        btn_fechar.setOnClickListener{
            finish()

        }

    }
}