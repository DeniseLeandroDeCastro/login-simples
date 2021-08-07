
package br.com.livroandroid.helloandroid

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class BemVindoActivity : DebugActivity() {
    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        //Views
        setContentView(R.layout.activity_bem_vindo)
        val textView = findViewById<TextView>(R.id.text)

        //Args
        val args = intent.extras
        val nome = args?.getString("nome")
        textView.text = "$nome, seja bem-vindo(a)!"

        //Ativa o "up navigation" na action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item?.itemId == android.R.id.home) {
            //Trata o clique no botão de voltar
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}