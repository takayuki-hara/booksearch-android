package jp.ne.penguin.booksearch.common

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import jp.ne.penguin.booksearch.R
import kotlinx.android.synthetic.main.activity_web_content.*

class WebContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_content)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.google.co.jp/")
    }
}
