public class ContaSalario extends Conta {
    private int limiteDeQuantidadeDeSaque;

    public ContaSalario(int limiteInicialDeQuantidadeDeSaque) {
        this.limiteDeQuantidadeDeSaque = limiteInicialDeQuantidadeDeSaque;
    }
    @Override
    public double sacar(double valor) {
        if (limiteDeQuantidadeDeSaque >0) {
            setSaldo(getSaldo() - valor);
            limiteDeQuantidadeDeSaque--;
            return valor;
        }
        return 0.0;
    }
    @Override
    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }

}
