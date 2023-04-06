package com.asgard.concepts

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.asgard.concepts.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentingResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result ->
            if(result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                if (intent?.hasExtra("result") == true) {
                    Snackbar.make(binding.root, intent.getStringExtra("result") ?: "", Snackbar.LENGTH_SHORT).show()
                }
            }
        }

        binding.intentButton.setOnClickListener {
            val intent = Intent(this, Intenting::class.java)
            intent.putExtra("title", "INTENTS")
            intent.putExtra("description",
                "O Intent é um objeto de mensagem que pode ser usado para solicitar uma " +
                        "ação de outro componente do aplicativo. Embora os intents facilitem " +
                        "a comunicação entre os componentes de diversas formas, há três casos " +
                        "fundamentais de uso:")
            // startActivity(intent)
            intentingResult.launch(intent)
        }
    }
}