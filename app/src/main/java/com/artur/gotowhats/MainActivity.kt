package com.artur.gotowhats

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color.parseColor
import android.graphics.drawable.ColorDrawable



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_gotoWhatsapp.setOnClickListener {
            var phone_number = editText_numberHint.getText().toString()
            phone_number = Regex("\\D").replace(phone_number, "")   // removes every non-digit char

            if (phone_number != "") {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wa.me/" + phone_number))
                startActivity(intent)
            }
        }
    }
}
