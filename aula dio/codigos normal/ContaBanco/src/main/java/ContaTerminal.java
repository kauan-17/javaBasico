public class ContaTerminal {
    private Integer Numero;
    private String Agencia;
    private double Saldo;
    private String nomeCliente;

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public ContaTerminal() {
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "Numero=" + Numero +
                ", Agencia='" + Agencia + '\'' +
                ", NomeCliente='" + nomeCliente + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
