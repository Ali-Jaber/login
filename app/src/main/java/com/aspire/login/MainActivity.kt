package com.aspire.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            var u = username.text.toString()
            var p = password.text.toString()
            var status =
                !(validUsername() || validPassword())

            if(status){
                Toast.makeText(this, username.text.toString() + " " + password.text.toString(), Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this,  "username or password should be more than one character", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validUsername() = username == null || username.length() < 1
    private fun validPassword() = password == null || password.length() < 1
}