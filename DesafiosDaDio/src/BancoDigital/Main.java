package BancoDigital;

public class Main {

    public static void main(String[] args){
        Cliente carla = new Cliente();
        carla.setNome("Carla Izabella");

        Conta cc = new ContaCorrente(carla);
        Conta poupanca = new ContaPoupanca(carla);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
