package com.elevenetc.issues.android.view_code_click

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Button
import android.widget.FrameLayout
import com.elevenetc.issues.android.R

class TransparentClickView(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    val btn by lazy { findViewById<Button>(R.id.btn_behind_transparent) }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }
}