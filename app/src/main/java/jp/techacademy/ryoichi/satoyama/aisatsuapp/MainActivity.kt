package jp.techacademy.ryoichi.satoyama.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val timePickerDialog = TimePickerDialog(
                this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                if(hourOfDay >= 2 && hourOfDay < 10) {
                    textView1.text = "おはよう"
                } else if(hourOfDay >= 10 && hourOfDay < 18) {
                    textView1.text = "こんにちは"
                } else {
                    textView1.text = "こんばんは"
                }
            },
                12,0,true)
            timePickerDialog.show()
        }
    }
}