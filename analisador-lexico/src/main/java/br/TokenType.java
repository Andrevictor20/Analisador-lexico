package br.com.analisadorlexico;

enum  TokenType {
   // Tokens de um único caractere. 
  LEFT_PAREN , RIGHT_PAREN , LEFT_BRACE , RIGHT_BRACE ,
   COMMA , DOT , NUNS , PLUS , PONTO E VÍRGULA , SLASH , STAR ,

  // Um ​​ou dois tokens de caracteres. 
  BANG , BANG_EQUAL ,
   EQUAL , EQUAL_EQUAL ,
   GREATER , GREATER_EQUAL ,
   LESS , LESS_EQUAL ,

  // Literais. 
  IDENTIFICADOR , STRING , NÚMERO ,

  // Palavras-chave. 
  AND , CLASS , ELSE , FALSE , FUN , FOR , SE , NIL , OR ,
   PRINT , RETURN , SUPER , THIS , TRUE , VAR , WHILE ,

  EOF
}