
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author milanez.9985
 */
public class Conta {
    private String numeroConta;
    private double saldo;
    private double limite;
    private ArrayList<String> extrato = new ArrayList<>();

    public Conta(String numeroConta, double limite) {
        this.numeroConta = numeroConta;
        this.limite = limite;
        this.saldo = 0;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: " + valor);
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            extrato.add("Saque: " + valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double getLimite() {
        return limite;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public String getNumeroConta(){
        return numeroConta;
    }
}
