package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        /*
        Operadores lógicos 
        ==
        !=
        >
        <
        >=
        <=
        &&
        ||
         */
        Integer dia = 1;

        /*if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        }*/
        
        Scanner leitor = new Scanner(System.in);
        
        /*System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        if(idade >=18){
            System.out.println("Pode tirar habilitação");
        }else{
            System.out.println("Não pode");
        }*/
        
        /*System.out.println("Digite sua faculdade: ");
        String faculdade = leitor.nextLine();
        
        if(faculdade.equals("Bandtec")){
            System.out.println("Melhor faculdade");
        }else{
            System.out.println("Deu ruim");
        }*/ 
        
        switch(dia){
            case 1: 
                System.out.println("Ultimo dia de descanso");
                break;
                
            case 2: 
                System.out.println("Dia de trabalhar");
                break; 
        }
        
        
        
    }
        
}
