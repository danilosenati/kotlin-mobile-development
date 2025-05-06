// CLASSE COM CONSTRUTOR COM PARÂMETROS
class Pessoa(val nome: String, val idade: Int) {
    
    fun dizerOla() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}

// FUNÇÃO PRINCIPAL
fun main() {
    val pessoa = Pessoa("Malaquias", 100)
    pessoa.dizerOla()
}
