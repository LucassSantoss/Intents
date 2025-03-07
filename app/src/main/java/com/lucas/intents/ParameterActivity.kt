package com.lucas.intents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lucas.intents.databinding.ActivityMainBinding
import com.lucas.intents.databinding.ActivityParameterBinding

class ParameterActivity : AppCompatActivity() {
    private val apb: ActivityParameterBinding by lazy {
        ActivityParameterBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(apb.root)

        setSupportActionBar(apb.toolbarIn.toolbar)
        supportActionBar?.subtitle = localClassName

        apb.returnAndCloseBt.setOnClickListener {
            finish()
        }
    }
}