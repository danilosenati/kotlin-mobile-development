fun main() {

	/*
 	val: Define uma variável somente leitura (imutável). Pode ser atribuída apenas uma vez. Equivalente a final em Java.
	var: Define uma variável mutável. Pode ser modificada após a atribuição inicial.
 	*/

	val nome = "João"         // Imutável: não pode ser reatribuída
	var idade = 25            // Mutável: pode ser alterada depois

	idade = 26                // Ok
	// nome = "Maria"        // Erro! val não pode ser reatribuída

	// **********************************************************************
	
	var a: String = "initial"  // Declara uma variável mutável e a inicializa.
	
	val b: Int = 1   
	
	val c = 3                  // Declara uma variável imutável e a inicializa sem especificar o tipo. O compilador infere o tipo Int.

	println(a)
    	a = "final"
    	println(a)
    	println(b)
    	println(c)
}
