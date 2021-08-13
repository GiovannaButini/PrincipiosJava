package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;


public class UsoScanner {
    public static void main(String[] args) {
        
        //Representa um objeto ou uma instância do tipo Scanner 
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.err.println("Digite seu nome: ");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitorNumero.nextInt();
        
        System.out.println(String.format("Nome digitado: %s\nIdade: %d", nome, 
                idade));
        
        System.out.println("Digite sua altura: ");
        Double altura = leitorNumero.nextDouble();
        
        System.out.println("Digite sua faculdade: ");
        String faculdade = leitorTexto.nextLine();
        
        System.out.println(
                String.format("Nome digitado: %s\nIdade: %d\nAltura: %.2f\nFacul: %s",
                        nome, idade, altura, faculdade));
    }
    
}
