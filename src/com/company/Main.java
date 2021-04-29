package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Criando um cliente
        Pessoa clienteTaina = new Pessoa("Taina", "123", "rua taina");
        Pessoa clientePatricia = new Pessoa("Patricia", "456", "rua patricia");
        Pessoa clienteCarol = new Pessoa("Carol", "789", "rua carol");

        //Criando uma conta
        Conta contaTaina = new Conta(456456,"Taina", 100);
        Conta contaPatricia = new Conta(5676, "Patricia", 200);
        Conta contaCarol = new Conta(1234, "Carol", 300);

        //adicionando os valores das contas nas pessoas
        clienteTaina.setConta(contaTaina);
        clientePatricia.setConta(contaPatricia);
        clienteCarol.setConta(contaCarol);

        //Pessoa taina realiza saque
        boolean tainaPodeSacar = clienteTaina.getConta().sacar(10);
        if (tainaPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!!!");
        } else {
            System.out.println("Saldo indisponivel!!!");
        }

        //Pessoa patricia transferir dinheiro para a pessoa carol
        System.out.println("Informe o valor da transferencia: ");
        double valor = teclado.nextDouble();
        boolean patiPodeSacar = clientePatricia.getConta().sacar(valor);
        if (patiPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!!!");
            clienteCarol.getConta().transferencia(valor);
        } else {
            System.out.println("Saldo indisponivel!!!");
        }

        //Pessoa carol realiza saque
        boolean carolPodeSacar = clienteCarol.getConta().sacar(10);
        if (carolPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!!!");
        } else {
            System.out.println("Saldo indisponivel!!!");
        }

        //imprimir os valores
        System.out.printf("A %s tem saldo %.2f \n", clienteTaina.getNome(), clienteTaina.getConta().getSaldo());
        System.out.printf("A %s tem saldo %.2f \n", clientePatricia.getNome(), clientePatricia.getConta().getSaldo());
        System.out.printf("A %s tem saldo %.2f \n", clienteCarol.getNome(), clienteCarol.getConta().getSaldo());
    }
}
