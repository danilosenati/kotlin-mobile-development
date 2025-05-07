/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

class Produto(val nome: String, var preco: Double, var quantidade: Int){
    
    init{
        if(preco < 0 || quantidade < 0){
        println("Preço e quantidade devem ser valores positivos.")
        	if(preco < 0){
                preco = 0.0
            }else{
                quantidade = 0
            }
    	}
    }
    fun exibirInfo(){
        println("Produto: $nome")
        println("Preço: R$ $preco")
        println("Quantidade em estoque: $quantidade")
    }
   
}

// FUNÇÃO PRINCIPAL

/*	Cria dois produtos, um com valores válidos e outro com valores inválidos.
	Chama o método exibirInfo() para os dois. */
fun main() {
    
    val produto1 = Produto("Bicicleta",950.59, 1)
    produto1.exibirInfo()
    
    println("***************************")
    
    var produto2 = Produto("Avião", -2.0, -2)
    produto2.exibirInfo()
    
}
