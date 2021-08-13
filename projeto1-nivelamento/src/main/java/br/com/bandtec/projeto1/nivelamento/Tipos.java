package br.com.bandtec.projeto1.nivelamento;

public class Tipos {
    
    //Torna a classe executável
    //Como se fosse um ponto de partida
    public static void main(String[] args) {
        
        //String para texto (alfanuméricos)
        //String é sempre aspas duplas, pois aspas únicas é p/um caracter
        String nome = "Diego";
        String faculdade = "Bandtec";
        String professorAssistente = "Paulo";
        
        /*
        Tipos primitivos: int, double, float, boolean, char, entre outros
        Tipos primitivos não aceitam valor null. Não são bem objetos no Java, 
        por si próprios não fazem conversão. 
        
        Classes Wrapper: Integer, Double, Boolean, entre outros
        Classes Wrapper aceitam valor null, além de aceitarem métodos de 
        conversão. São mais pesados.
        */
        
        //Integer: utilizaremos para numéricos inteiros
        Integer idadeDiego = 28;
        Integer idadePaulo = 45;
        Integer numeroDaSorte = 7;
        
        //Double: tipo para números com casas decimais
        Double valor = 10.50;
        Double altura = 1.62; 
        
        //Boolean: Para representar verdadeiro ou falso 
        Boolean ligado = true; 
        Boolean temMundial = false; 
        Boolean eMaior = idadeDiego > 30;
        
        System.out.println("Teste:" + eMaior);
    }
    
}
