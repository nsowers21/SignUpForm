package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.checkNotNull as checkNotNull1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Button)
            .setOnClickListener {
                val name = checkNotNull1(findViewById<EditText>(R.id.name).text)
                val email = checkNotNull1(findViewById<EditText>(R.id.email).text)
                val pass1 = checkNotNull1(findViewById<EditText>(R.id.password1).text)
                val pass2 = checkNotNull1(findViewById<EditText>(R.id.password2).text)
                Log.d("Name", "$name ")
                if(pass1 == pass2){

                    //findViewById<TextView>(R.id.message).text="Welcome, ${name}, to the SignUpForm App"
                }
                else {

                }
            }

    }
}
