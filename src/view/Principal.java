package view;

import model.ContaBancaria;

public class Principal {
	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();

		conta.realizarDeposito(1000);
		System.out.println(conta.saldo);
		conta.realizarSaque(700);
		System.out.println(conta.saldo);

		conta.realizarDeposito(-580);
		System.out.println(conta.saldo);

		conta.realizarSaque(-700);
		System.out.println(conta.saldo);

		conta.nome = "Wallace";
		conta.numeroConta = 111048;
		
		System.out.println(conta.nome);
		System.out.println(conta.numeroConta);
	}
}
