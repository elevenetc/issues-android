package com.elevenetc.issues.android.view_code_click

import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.elevenetc.issues.android.R

class ViewCodeClick : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vide_code_click)

        initABTouch()
    }

    private fun initABTouch() {
        val btnA = findViewById<Button>(R.id.btn_a)
        val btnB = findViewById<Button>(R.id.btn_b)

        btnA.setOnClickListener {

            val cX = btnB.measuredWidth / 2f
            val cY = btnB.measuredHeight / 2f

            btnB.dispatchTouchEvent(

                MotionEvent.obtain(
                    0L,
                    0L,
                    MotionEvent.ACTION_DOWN,
                    cX,
                    cY,
                    0
                )
            )


            btnB.dispatchTouchEvent(

                MotionEvent.obtain(
                    0L,
                    0L,
                    MotionEvent.ACTION_UP,
                    cX,
                    cY,
                    0
                )
            )
        }

        btnB.setOnClickListener {
            //btnA.callOnClick()
        }
    }
}