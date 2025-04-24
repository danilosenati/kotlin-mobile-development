fun main() {
	var a: String = "initial"  // Declara uma variável mutável e a inicializa.
	
	val b: Int = 1             // Declara uma variável imutável e a inicializa.
    
	val c = 3                  // Declara uma variável imutável e a inicializa sem especificar o tipo. O compilador infere o tipo Int.

	println(a)
    a = "final"
    println(a)
    println(b)
    println(c)
}
