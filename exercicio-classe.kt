/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

class Produto(val nome, var preco, var quantidade){
    
    init{
        if(preco < 0 || quantidade < 0){
        println("Preço e quantidade devem ser valores positivos.")
    	}
    }
    fun exibirInfo(){
        println("Produto: $nome")
        println("Preço: R$ $preco")
        println("Quantidade em estoque: $quantidade")
    }

    
}


// FUNÇÃO PRINCIPAL
fun main() {
    
}

