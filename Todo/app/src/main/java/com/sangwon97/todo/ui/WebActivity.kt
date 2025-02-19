package com.sangwon97.todo.ui

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.sangwon97.todo.R

class WebActivity : AppCompatActivity(){
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        webView = findViewById(R.id.fad_web)

        webView.apply {
            settings.javaScriptEnabled=true
            settings.loadWithOverviewMode= true
            settings.useWideViewPort=true
            settings.cacheMode=WebSettings.LOAD_DEFAULT
            webViewClient = WebViewClient()
        }
        val url="http://m.naver.com";
        webView.loadUrl(url)
    }
    //뒤로가기 정의
    override fun onBackPressed() {
        if(webView.canGoBack()) webView.goBack()
        else super.onBackPressed()
    }
}