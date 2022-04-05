public class ContaCorrente1 extends Conta {
    private double valorChequeEspecial;

    public ContaCorrente1(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }

    @Override
    public double sacar (double valor) {
        System.out.println("Tentando sacar:" + valor);
        if(valor <=(getSaldo() + valorChequeEspecial)) {
            setSaldo(getSaldo() - valor);
            System.out.println("SALDO ATUAL:" + getSaldo());

            if (getSaldo() < 0) {
                System.out.println("valor restante do che especial:" + getValorChequeEspecial());
            }
            return valor;
        } else {
            System.out.println(("Você não tem valor do cheque especial disponivel para esse saque"));

        }
        return 0.0;
    }
    @Override
    public double depositar(double valor) {
        System.out.println("Depositando:+ valor");
        setSaldo(getSaldo()+ valor);
        System.out.println("Saldo atual:" + getSaldo());

        return valor;
    }
    private double  getValorChequeEspecial() {
        if (getSaldo() < 0 )
            return  valorChequeEspecial -  Math.abs(getSaldo());
        else
            return valorChequeEspecial;
    }

}
