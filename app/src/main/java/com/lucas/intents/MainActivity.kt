package com.lucas.intents

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lucas.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        setSupportActionBar(amb.toolbarIn.toolbar)
        supportActionBar?.subtitle = localClassName

        amb.parameterBt.setOnClickListener {
            // Intent explicita porque define a classe que será executada para tratar a Intent
            Intent(this, ParameterActivity::class.java).let {
                startActivity(it)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.open_activity_mi -> {
                Toast.makeText(this, "Você clicou no open", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.view_mi -> { true }
            R.id.call_mi -> { true }
            R.id.dial_mi -> { true }
            R.id.pick_mi -> { true }
            R.id.chooser_mi -> { true }
            else -> { false }
        }
    }

}