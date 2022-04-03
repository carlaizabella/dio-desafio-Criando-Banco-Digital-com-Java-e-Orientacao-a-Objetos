package BancoDigital;

import java.util.Scanner;

public class Cliente {
    Scanner scan = new Scanner(System.in);

    public String nome;

    public String getNome(){
        System.out.println("What's your name? ");
        nome = scan.next();

                return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
