import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        ContaCorrente1 cc = new ContaCorrente1(100);
        cc.depositar(500);
        cc.depositar(50);
        cc.sacar(560);
        cc.depositar(50);
        cc.sacar(10);
    }
}


