package dev.marawanxmamdouh.aboutme

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import dev.marawanxmamdouh.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val object1: MyName = MyName("Marawan Mamdouh") // [1]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myNameXML = object1 // [2]

        binding.apply {
            btn.setOnClickListener {
                object1.nickname = etNickname.text.toString() // [1]
                // Invalidate all binding expressions and request a new rebind to refresh UI
                invalidateAll() // [2]
                etNickname.visibility = View.GONE
                btn.visibility = View.GONE
                tvNickname.visibility = View.VISIBLE
                hideKeyboard(it)
            }
        }
    }

    private fun hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}