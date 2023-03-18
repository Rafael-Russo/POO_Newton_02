package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {
    protected Integer numero;
    protected Double saldo;

    public Conta() {
        this.numero = null;
        this.saldo = null;
    }

    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    //    sobrecarga de métodos
    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {
        if ((saldo - valor) < 0 || valor == null || valor <= 0) {
            throw new IllegalArgumentException("Sem dinheiro suficiente na conta");
        }

        saldo -= valor;

        return saldo;
    }

    public Double depositar(Double valor) {
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Valor menor que zero");
        }

        saldo += valor;

        return saldo;
    }

    public void transferir(Conta destino, Double valor) {
        if (this.equals(destino)) {
            throw new IllegalArgumentException("Não é possivel transferir para essa conta");
        }

        this.sacar(valor);
        destino.depositar(valor);
    }

    // Getter and Setter - Numero
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if (numero == null || numero < 0)
            throw new IllegalArgumentException("Erro, número inválido");

        this.numero = numero;
    }

    // Getter and Setter - Saldo
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Conta conta = (Conta) obj;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        Conta c2 = (Conta) obj;
//        return this.getNumero().equals(c2.getNumero());
//    }
}
