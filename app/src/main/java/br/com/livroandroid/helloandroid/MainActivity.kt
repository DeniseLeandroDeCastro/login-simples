package br.com.livroandroid.helloandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle

class MainActivity : DebugActivity() {
    //Propriedade para acessar o contexto de qualquer lugar
    private val context: Context get() = this

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        //View
        setContentView(R.layout.activity_main)
        //Adiciona o evento do botão de login
        onClick(R.id.btLogin) { onClickLogin() }
    }

    fun onClickLogin() {
        //Lê os textos digitados com a extension
        val login = getTextString(R.id.tLogin)
        val senha = getTextString(R.id.tSenha)

        if ("denise" == login && "123" == senha) {
            val intent = Intent(context, BemVindoActivity::class.java)
            val params = Bundle()
            params.putString("nome", "Denise Castro")
            intent.putExtras(params)
            startActivity(intent)
        } else {
            toast("Login ou senha incorreto(a).")
        }
    }
}