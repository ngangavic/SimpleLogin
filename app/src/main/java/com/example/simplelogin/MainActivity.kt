package com.example.simplelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextEmail = findViewById(R.id.editTextEmail)as EditText
        var editTextPassword = findViewById(R.id.editTextPassword)as EditText
        var buttonLogin = findViewById(R.id.buttonLogin) as Button

        buttonLogin.setOnClickListener{
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            if (email.isEmpty()){
                editTextEmail.requestFocus()
                editTextEmail.setError("Email cannot be empty")
            }else if (password.isEmpty()){
                editTextPassword.requestFocus()
                editTextPassword.setError("Password cannot be empty")
            }else{
                Toast.makeText(this@MainActivity,"Login successful",Toast.LENGTH_LONG).show()
                editTextEmail.text.clear()
                editTextPassword.text.clear()
            }
        }
    }
}
