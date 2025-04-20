/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(){
	fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
	}
printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2
    
}
