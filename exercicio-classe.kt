/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

class Produto(val nome: String, var preco: Double, var quantidade: Int){
 
/* Se o preco ou a quantidade forem negativos, exibir uma mensagem como:
	"Preço e quantidade devem ser valores positivos."
	e definir o valor como 0.0 ou 0. */
    
  init {
        if (preco < 0) {
            println("Preço deve ser um valor positivo.")
            preco = 0.0
        }
        if (quantidade < 0) {
            println("Quantidade deve ser um valor positivo.")
            quantidade = 0
        }
    }
    fun exibirInfo(){
        println("Produto: $nome")
        println("Preço: R$ $preco")
        println("Quantidade em estoque: $quantidade")
    }
   
}

// FUNÇÃO PRINCIPAL

/* Cria dois produtos, um com valores válidos e outro com valores inválidos.
   Chama o método exibirInfo() para os dois. */
fun main() {
    
    val produto1 = Produto("Bicicleta",950.59, 1)
    produto1.exibirInfo()
    
    println("***************************")
    
    var produto2 = Produto("Avião", -2.0, -2)
    produto2.exibirInfo()
    
}
