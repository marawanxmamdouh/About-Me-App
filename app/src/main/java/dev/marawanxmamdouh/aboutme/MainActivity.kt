package dev.marawanxmamdouh.aboutme

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            tvNickname.text = etNickname.text
            etNickname.visibility = View.GONE
            btn.visibility = View.GONE
            tvNickname.visibility = View.VISIBLE
        }
    }
}