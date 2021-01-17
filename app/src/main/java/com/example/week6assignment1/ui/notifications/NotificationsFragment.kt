package com.example.week6assignment1.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.week6assignment1.R

class NotificationsFragment : Fragment() {

  private lateinit var notificationsViewModel: NotificationsViewModel
  private lateinit var webview : WebView
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_notifications, container, false)
    webview=root.findViewById(R.id.webView)
    webview.loadUrl("https://www.softwarica.edu.np")
    webview.webViewClient= WebViewClient()
    webview.settings.javaScriptEnabled=true
    return root
  }
}