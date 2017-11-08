package com.example.myfirstapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class WebViewActivity : Activity() {

    private var webView: WebView? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        webView = findViewById<WebView>(R.id.webView1)
        webView!!.settings.javaScriptEnabled = true
        webView!!.loadUrl("http://www.google.com")

    }

}