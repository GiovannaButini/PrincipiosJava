package br.com.bandtec.projeto1.nivelamento;

public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Diego";
        Integer idade = 28;
        Double altura = 1.83;
        Boolean aluno = false;

        /*System.out.println(String.format("Nome: %s idade: %d altura %.2f aluno: %s", 
                nome, idade, altura, aluno));*/
        
        //OPERADOR TERNÁRIO
        String alunoLabel = aluno ? "Sim" : "Não";
        //Se for aluno, é "Sim", :(se não), é "Não"

        /*String alunoLabel;
        
        if(aluno){
           alunoLabel = "SIM"; 
        } else{
            alunoLabel = "Não";
        }*/
        
        String info = String.format(
                "Nome: %s Idade: %d Altura %.2f Aluno: %s",
                nome, idade, altura, aluno);

        System.out.println(info);

        /*
            Interpolação de texto Java: (Existem diversas maneiras, mas essa é 
        a mais prática.
        String.format(template, args)
        template (Padrão) - O nosso texto 
        args - Complementa a informação, informa que onde tem porcentagem, vai 
        entrar alguma variável. 
         */
    }

}
