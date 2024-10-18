package src;

public class Main {
    public static void main(String[] args) {
        Cliente isak = new Cliente();
        isak.setNome("Isak Silva");

        Conta cc = new ContaCorrente(isak);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(isak);
        cc.transferir(cp,50);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
