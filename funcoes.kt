/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun printMessage(message: String): Unit {                               // 1
    println(message)
    
    /*	Unit - Não retorna nada.
 	A função abraixo recebe uma mensagem do tipo String e exibe essa mensagem.
	*/
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
    
/*
	Esse código define uma função em Kotlin chamada printMessageWithPrefix. Vamos entender linha por linha:
 	
 	printMessageWithPrefix: nome da função.
	(message: String, prefix: String = "Info"): parâmetros da função:
	message: é uma String obrigatória, que será a mensagem a ser exibida.
	prefix: é uma String opcional, com valor padrão "Info". 
   	
    	Ou seja, se você não passar esse argumento ao chamar a função, ele usará "Info" automaticamente.

 	Se você chamar assim:
	println("[$prefix] $message")
 	Essa linha imprime no console a mensagem com o prefixo entre colchetes.
	
 	Exemplo: se message = "Servidor iniciado" e você não passar o prefix, a saída será:
	[Info] Servidor iniciado

 	Se você chamar assim:
 	printMessageWithPrefix("Servidor iniciado", "Sucesso")

 	A saída será:
  	[Sucesso] Servidor iniciado
	    
 * */
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() { // fun: palavra-chave usada para declarar uma função.
    printMessage("Hello")                                               // 5                    
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
}
