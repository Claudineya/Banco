public class ContaPoupança extends Conta {
    @Override
    public double sacar(double valor) {
        setSaldo(getSaldo() - valor);
        return valor;
    }

    @Override
    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }
}
