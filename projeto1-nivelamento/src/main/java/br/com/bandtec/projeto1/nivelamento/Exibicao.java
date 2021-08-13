package br.com.bandtec.projeto1.nivelamento;


public class Exibicao {
    
    public static void main(String[] args) {
        //PARA EXIBIR NO CONSOLE É SHIFT + F6
        
        /*Para exibição no console, utilizaremos: 
        System.out.println()
        System.out.print()
        Mas existem outros, como por exemplo: 
        System.out.printf()*/
        
        System.out.println("Diego");
        System.out.println(12);
        System.out.println(12 + 42);
        System.out.println(true);
        
        //Atalho para clonar linha: SHIFT + CTRL + seta
        
        Integer numero = 42; 
        
        System.out.println(numero);
        /*Antes de exibir no console, converte para texto. Se vem de uma fonte
        externa do Java é texto também.*/
        
        /*CTRL + R com o cursor em cima do que você quer, renomeia todas as 
        variáveis escritas com o mesmo nome.
        Se faz a mesma coisa com o nome da class, abre uma janelinha para 
        renomear o nome da class.*/
        
        Integer numeroTeste = Integer.valueOf("120");
        System.out.println(numeroTeste);
        //Converte o texto para número.
        
        /*
        
        Operadores aritméticos básicos: 
         + = adição
         - = subtração
         * = multiplicação
         / = divisão 
        
        Incrementos ou decrementos:
        ++ 
        --
        += 1 
        -= 1
        *=
        /=
 
        */
        
        String nome = "Paulo";
        Integer idade = 57;
        Double credito = 200.0; /*Quando é o Double maiuscúlo precisa por o .0
        mesmo se não tiver valor nas casas decimais*/
        
        System.out.println(
                "Nome: " + nome + "\n" +  "idade: " + idade + "\n" + 
                        "Saldo: " + credito);
        // "\n" -> possibilita quebra de linha na exibição 
        // "\t" -> Dá um TAB 
        
        Double passagens = credito/4.40;
        System.out.println("Passagens disponíveis:  " + passagens.intValue());
        
     
        
        
        
    }
}
