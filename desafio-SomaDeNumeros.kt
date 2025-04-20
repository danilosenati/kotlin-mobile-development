/* 🧠 Desafio: Soma de Números
Crie uma função chamada somarTudo que:

Usa vararg para aceitar vários números inteiros
Retorna a soma total desses números
Depois, chame essa função no main com diferentes quantidades de números.
*/

fun somarTudo(vararg numeros: Int): Int {
    var soma = 0
    for (n in numeros) {
        soma += n
    }
    return soma
}

fun main() {
    println(somarTudo(1, 2, 3))        // Saída: 6
    println(somarTudo(10, 20, 30, 40)) // Saída: 100
    println(somarTudo())               // Saída: 0
}
