// Complete a linha abaixo para que a função exibirMensagem receba o conteúdo da variável mensagem somente se ela não for nula.

fun exibirMensagem(msg: String?) {
    
    if(msg != null){
    	   println("Mensagem recebida: $msg")
    } else {
        println("Nenhuma mensagem informada.")
    }
}

fun main() {
    val mensagem: String? = "Olá!"
    exibirMensagem(mensagem)

    val mensagemNula: String? = null
    exibirMensagem(mensagemNula)
}
