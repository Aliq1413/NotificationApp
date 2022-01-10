package com.example.notificationapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showButton = findViewById<Button>(R.id.show_btn)
        showButton.setOnClickListener {
            val notificationMessage = findViewById<EditText>(R.id.notification_et).text.toString()
            Notifications(this).createNotification(notificationMessage)
        }
    }
}