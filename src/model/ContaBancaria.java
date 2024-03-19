package model;

public class ContaBancaria {

	public int numeroConta;
	public String nome;
	public double saldo;

	public ContaBancaria() {

	}

	public ContaBancaria(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void realizarDeposito(double valor) {
		if (valor < 0) {
			saldo += 0;
		} else {
			saldo += valor;
		}
	}

	public void realizarSaque(double valor) {
		if (valor < 0) {
			saldo -= 0;
		} else {
			saldo -= valor;
		}
	}
}
