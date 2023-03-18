package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);
//        c.depositar(-20.0);

        Conta c2 = new Conta(90);
//        c2.setNumero(90);
        c2.setSaldo(500.0);

        Conta c3 = new Conta(0);
        if (c.equals(c2)) {
            System.out.println("Conta ja criada");
        } else {
            System.out.println("Contas diferentes");
        }

        c.transferir(c2, 10.0);

        System.out.println(
                "numero conta c: " + c.getNumero() + "\n" +
                        "saldo conta c: " + c.getSaldo() + "\n" +
                        "numero conta c2: " + c2.getNumero() + "\n" +
                        "saldo conta c2: " + c2.getSaldo() + "\n" +
                        "numero conta c3: " + c3.getNumero() + "\n" +
                        "saldo conta c3: " + c3.getSaldo()
        );

//        exemplo de herança com (conta especial)
        ContaEspecial ce = new ContaEspecial();

        Pessoa pessoas[] = new Pessoa[5];

        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaFisica();
        pessoas[3] = new PessoaJuridica();
        pessoas[4] = new PessoaFisica();

        for (Pessoa p : pessoas){
            p.validarDocumento();
        }
    }
}
