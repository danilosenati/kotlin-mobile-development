// O modificador vararg é usado quando você quer permitir que uma função receba um número variável de argumentos do mesmo tipo — ou seja, você não precisa saber de antemão quantos valores serão passados.
/*
Como funciona o vararg?
Quando você usa vararg, a função aceita vários argumentos (ou nenhum) do tipo especificado, e internamente trata todos como um array.

*/
fun main() {
   fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}
printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
    
    /*
     * Esse código em Kotlin mostra como usar **vararg com outro parâmetro nomeado** (no caso, prefix) e como chamar a função corretamente.
     * 
     * Explicação:
		fun printAllWithPrefix(...): Declara uma função chamada printAllWithPrefix.
		vararg messages: String: Significa que você pode passar várias strings como argumentos (tipo um array implícito).		
        prefix: String: Um parâmetro normal, obrigatório.
        
		Dentro da função: ele percorre cada message e imprime prefix + mensagem.
     * */ 
}
	/*
    ⚠️ Importante:
		Quando você usa vararg junto com outro parâmetro, como o prefix, 
		você precisa usar nomeação ao chamar a função, senão o Kotlin se perde e não sabe o que é o que.
	*/
printAllWithPrefix( // 4
    "Hello", "Hallo", "Salut", "Hola", "你好",
    prefix = "Greeting: "
    
    /*
     *	Aqui ele envia 5 mensagens para o vararg messages
		E o prefix é passado com nome (obrigatório nesse caso!)
     */
    
    
    
)

fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}
log("Hello", "Hallo", "Salut", "Hola", "你好")
}

