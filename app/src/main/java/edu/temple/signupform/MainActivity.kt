package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Button)
            .setOnClickListener {
                val name = findViewById<EditText>(R.id.name).text
                val email = findViewById<EditText>(R.id.email).text
                val pass1 = findViewById<EditText>(R.id.password1).text
                val pass2 = findViewById<EditText>(R.id.password2).text
                if (name.isNullOrBlank() ) {
                    findViewById<EditText>(R.id.name).error=("Missing Data")
                }
                else if(email.isNullOrBlank()){
                    findViewById<EditText>(R.id.email).error=("Missing Data")
                }
                else if(pass1.isNullOrBlank()){
                    findViewById<EditText>(R.id.name).error=("Password Missing")
                }
                else{
                    if(pass1.toString() == pass2.toString()){
                        findViewById<TextView>(R.id.Message).text=("Welcome, ${name}, to the SignUpForm App")
                    }
                    else {
                        findViewById<TextView>(R.id.password1).error=("Passwords do not match")
                        findViewById<TextView>(R.id.password2).error=("Passwords do not match")
                    }
                }
            }
    }
}


