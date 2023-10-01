package view;

public class calculos {
	private int escolha;
	private double valor1,valor2,soma;

	public calculos() {
	}
	
	public calculos(double valor1, double valor2,int escolha) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.escolha = escolha;
	}
	
	public String soma() {
		switch (escolha) {
		case 1:
			soma = valor1 + valor2;
			break;
		case 2: 
			soma = valor1 - valor2;
			break;
		case 3:
			soma = valor1 * valor2;
			break;
		case 4:
			soma = valor1 / valor2;
			break;
		}
		
		return String.valueOf(soma);
	}
	
}
