package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double valorInicial) {
        this.numero = numero;
        this.nome = nome;
        Deposito(valorInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Deposito(double valor) {
        saldo += valor;
    }

    public void Saque(double valor) {
        saldo -= valor + 5.0;
    }

    public String toString() {
        return "Conta " + numero + ", Nome: " + nome + ", Saldo: $ " + String.format("%.2f", saldo);
    }
}
