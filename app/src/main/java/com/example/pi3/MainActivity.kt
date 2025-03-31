package com.example.pi3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {

    lateinit var loginInput : EditText
    lateinit var senhaInput : EditText
    lateinit var entrarBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loginInput = findViewById(R.id.login_input)
        senhaInput = findViewById(R.id.senha_input)
        entrarBtn = findViewById(R.id.entrar_btn)

        entrarBtn.setOnClickListener {
            val login = loginInput.text.toString()
            val senha = senhaInput.text.toString()
            Log.i("Test Credentials", "Login : $login e Senha : $senha")
        }
    }
}