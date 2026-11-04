package com.tt.tallinn

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.rgb(235, 243, 250))

        val title = TextView(this)
        title.text = "ТТ"
        title.textSize = 36f
        title.setTextColor(Color.rgb(20, 65, 120))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Транспорт Таллинна"
        subtitle.textSize = 24f
        subtitle.setTextColor(Color.BLACK)
        subtitle.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "Приложение готовится к запуску"
        status.textSize = 18f
        status.setTextColor(Color.DKGRAY)
        status.gravity = Gravity.CENTER
        status.setPadding(0, 30, 0, 0)

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)

        setContentView(layout)
    }
}
