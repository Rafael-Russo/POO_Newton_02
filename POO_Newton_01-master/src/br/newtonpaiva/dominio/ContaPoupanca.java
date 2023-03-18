package br.newtonpaiva.dominio;

public class ContaPoupanca extends Conta{

    public void aplicarRencimentos(Double percentual){
        if (percentual <= 0){
            throw new IllegalArgumentException("O percentual não pode ser menor que 0");
        }
        setSaldo(getSaldo()*(percentual/100.00 + 1));
    }

}
