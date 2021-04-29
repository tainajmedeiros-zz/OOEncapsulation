package com.company;

public class Conta {

    private int numero;
    private String dono;
    private double saldo;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo) {
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void transferencia(double valor) {
        this.saldo = saldo + valor;
    }
}
