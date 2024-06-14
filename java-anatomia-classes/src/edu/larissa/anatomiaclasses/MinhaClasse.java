package edu.larissa.anatomiaclasses;
public class MinhaClasse {
    
 public static void main (String [] args){
    System.out.print ("Olá turma, sejam bem-vindos! ");

    String primeiroNome = "Larissa";
    String segundoNome = "Freitas";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
     
 } 
 
 public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);



 } 


}
