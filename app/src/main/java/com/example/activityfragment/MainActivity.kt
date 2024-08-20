package com.example.activityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


lateinit var btn_NewActivity: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_NewActivity = findViewById(R.id.btn_activity)

        btn_NewActivity.setOnClickListener{

            var intent = Intent(this, DetalhesActivity::class.java)

            val filme = Filme(
                "Sem Limite",
                "Teste",
                9.8,
                "Teste",
                "Netflix"
            )

            intent.putExtra("filme", filme)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo de vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo de vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo de vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo de vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo de vida", "onRestart")
    }

    override fun onDestroy() {
        Log.i("ciclo de vida", "onDestroy")
        super.onDestroy()
    }
}