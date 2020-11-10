package com.elevenetc.issues.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elevenetc.issues.android.ripple.RippleActivity
import com.elevenetc.issues.android.view_code_click.ViewCodeClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        startActivity(Intent(this, ViewCodeClick::class.java))
        startActivity(Intent(this, RippleActivity::class.java))
    }
}