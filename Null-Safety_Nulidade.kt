fun main() {
  
    var neverNull: String = "This can't be null"            // - Aqui, a variável `neverNull` é declarada como do tipo `String`, **sem possibilidade de ser `null`**.
    
    neverNull = null                                        //  Erro de compilação! Como neverNull é um String não anulável, não pode receber null.
    
    var nullable: String? = "You can keep a null here"      //  O `?` diz ao compilador: "essa variável pode ser `null`".
    
    nullable = null                                         //  nullable pode receber o valor null
    
    var inferredNonNull = "The compiler assumes non-null"   // - Kotlin **infere o tipo** como `String` e, como não foi declarado como `String?`, o valor **não pode ser `null`**.
    
    inferredNonNull = null                                  // Erro de compilação! Como inferredNonNull é um String não anulável, não pode receber null.
    
    fun strLength(notNull: String): Int {                   // - Função que recebe um `String` **não anulável** e retorna seu comprimento.
        return notNull.length
    }
    
    strLength(neverNull)                                    //  Chamada da função vai funcionar porquê neverNull é um String não anulável.
    strLength(nullable)                                     //  Chamada da função não irá funcionar pq nullable recebe valor null.

}
