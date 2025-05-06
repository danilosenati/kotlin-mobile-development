/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

// DECLARAÇÃO SIMPLES DE CLASSE
class Pessoa{
    var nome = ""
    var idade = 0
    
    fun dizerOla(){
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}

// INSTANCIANDO UMA CLASSE
fun main(){
	val pessoa = Pessoa()
    pessoa.nome = "Jeremias"
    pessoa.idade = 25
    
    pessoa.dizerOla()
    
}
