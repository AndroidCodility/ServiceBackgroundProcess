package com.codility.servicebackground

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startServiceView(view: View) {
        startService(Intent(this, MyService::class.java))
        showToast("Background Service Started..!!")
    }

    fun stopServiceView(view: View) {
        stopService(Intent(this, MyService::class.java))
        showToast("Background Service Stopped..!!")
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}