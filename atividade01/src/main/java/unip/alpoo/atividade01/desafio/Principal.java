package unip.alpoo.atividade01.desafio;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        String nome;
        
        Scanner entrada = new Scanner(System.in);

        DesafioHello ola = new DesafioHello();
        
        System.out.println("Entre com seu nome");
        nome = entrada.nextLine();

        ola.hello(nome);
        entrada.close();
    }
}