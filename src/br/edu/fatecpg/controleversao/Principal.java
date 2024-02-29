package br.edu.fatecpg.controleversao;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operacao;
		double num1,num2,resultado=0;
		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		Porcentagem porcento = new Porcentagem();
		
		while(true) {
		System.out.println("Digite a operação desejada: \n 1-soma"
				+ "\n 2-subtração \n 3-multiplicação \n 4-divisao \n 5-sair");
		operacao = scan.nextInt();
		if(operacao == 5) {
			break;
		}
		System.out.println("Digite o primeiro valor: ");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2 = scan.nextDouble();
		
		switch(operacao) {
		case 1:
			resultado = calc.soma(num1, num2);
		break;
		case 2:
			resultado = calc.subtrai(num1, num2);
		break;
		case 3:
			resultado = calc.multiplica(num1, num2);
		break;
		case 4:
			resultado = calc.dividi(num1, num2);
		break;
		}
		
			
		System.out.println(resultado); 
		}
		
		System.out.println(porcento.regraDeTres(100, 100, 50));
	}

}
