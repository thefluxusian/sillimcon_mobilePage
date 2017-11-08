package com.example.myfirstapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        //Get a reference to your WebView//
        val webView = findViewById<View>(R.id.webview) as WebView
        webView.webViewClient = WebViewClient()

        //Specify the URL you want to display//
        webView.loadUrl("http://www.google.com")
    }
}