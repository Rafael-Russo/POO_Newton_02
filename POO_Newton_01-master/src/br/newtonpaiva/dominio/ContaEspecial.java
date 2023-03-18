package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta {
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public Double sacar(Double valor) {
        if ((saldo - valor) < -limite || valor == null || valor <= 0) {
            throw new IllegalArgumentException("Sem dinheiro suficiente na conta");
        }

        saldo -= valor;

        return saldo;
    }
}
