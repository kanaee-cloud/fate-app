package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class WebView : AppCompatActivity() {

    lateinit var vWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        supportActionBar?.hide()

       vWebView = findViewById(R.id.vWebView)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        vWebView.webViewClient = WebViewClient()
        vWebView.loadUrl("https://akiyama-cafe.vercel.app/")

        var webSettings = vWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

    }
    override fun onBackPressed(){
        if (vWebView.canGoBack()){
            vWebView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}