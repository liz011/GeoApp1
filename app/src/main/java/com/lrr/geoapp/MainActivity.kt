package com.lrr.geoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var edUser: EditText = findViewById(R.id.edUser)
        var edPass: EditText = findViewById(R.id.edPass)
        var btnInput: Button = findViewById(R.id.btnIngresar)
        var btnRestart: Button = findViewById(R.id.btnResetear)

        btnRestart.setOnClickListener {
            edUser.setText("")
            edPass.setText("")
        }

        fun validarDatos(){
            val user = edUser.text
            val pass = edPass.text
            //aqio es donde existe una comparacion nombre y contraseña
            if (user.toString().isEmpty() || pass.toString().isEmpty()) {
                Toast.makeText(
                    this@MainActivity, "Debes ingresasr datos solicitados, " +
                            "no puede estar vacío ",
                    Toast.LENGTH_SHORT
                ).show()

            }

            else {
                // ir a otra pantalla
                //aqio es donde existe una comparacion se contraseña parapoder adminitrlo
                if (user.toString()=="admin" || pass.toString()=="12345"){
                    val intent = Intent(this,lista::class.java)
                    intent.putExtra("Usuario", user.toString())
                    startActivity(intent)
                }
                else{
                    Toast.makeText(
                        this@MainActivity, "Datos incorrectos, " +
                                "vuelva a ingresar la informacion ",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        btnInput.setOnClickListener {
            validarDatos()

        }
    }
}
