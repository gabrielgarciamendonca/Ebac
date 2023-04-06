package com.asgard.concepts

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asgard.concepts.databinding.ActivityIntentingBinding

class Intenting : AppCompatActivity() {
    lateinit var binding: ActivityIntentingBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = intent.getStringExtra("title")
        binding.textView3.text = intent.getStringExtra("description")
        binding.concept.text = "Como iniciar uma atividade"
        binding.definition.text = "Uma Activity representa uma única tela em um aplicativo. É possível iniciar uma nova instância de uma Activity passando um Intent para startActivity(). O Intent descreve a atividade a iniciar e carrega todos os dados necessários.\n" +
                "\n" +
                "Se você quiser receber um resultado da atividade quando ela finalizar, chame startActivityForResult(). Sua atividade recebe o resultado como um objeto Intent separado no callback de onActivityResult() da atividade. Para saber mais, consulte o guia Activities."

        val result = Intent()

        result.putExtra("result", "MODULO DE INTENT LIDO")
        setResult(Activity.RESULT_OK, result)
        binding.intentButton.setOnClickListener {
            finish()
        }
    }
}