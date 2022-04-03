package BancoDigital;

import javax.swing.*;
import javax.swing.JButton;

public class Main {

    public static void main(String[] args){
        Cliente carla = new Cliente();
        //carla.setNome();

        Conta cc = new ContaCorrente(carla);
        Conta poupanca = new ContaPoupanca(carla);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
