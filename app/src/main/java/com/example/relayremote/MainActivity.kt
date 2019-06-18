package com.example.relayremote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.view.WindowManager
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        val ipadd = findViewById<TextInputEditText>(R.id.ip_address)
        go.setOnClickListener {
            val ipadd1 = ipadd.text.toString()
            val ipadd2 = ipadd1.trim()
            webview.loadUrl("http://$ipadd2/go")
            webview.webViewClient = WebViewClient()
        }
    }
}
