package com.example.lab_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameDisplay = findViewById<TextView>(R.id.name_display)
        val nameSubmit = findViewById<Button>(R.id.name_submit)

        nameSubmit.setOnClickListener {
            val nameInput = findViewById<TextInputEditText>(R.id.name_input)
                ?.text.toString().trim()
            if(nameInput.isNotEmpty()){
                nameDisplay?.text = getString(R.string.name_greet).plus(" ").plus(nameInput)
// or you can use
// nameDisplay?.text = "${getString(R.string.name_greet)} ${nameInput}"
            }
            else {
                Toast.makeText(this, getString(R.string.name_empty), Toast.LENGTH_LONG)
                    .apply {

                        setGravity(Gravity.CENTER, 0, 0)
                        show()
                    }


            }
    }   
}
}


