/*
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Renda					Imposto de Renda
de 0.00 a 2000.00			Isento
de 2000.01 a 3000.00		8%
de 3000.01 a 4500.00		18%
acima de 4500.01			28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class q08 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda;
		renda = sc.nextDouble();
		
		double imposto;
		
		if (renda < 2000.00) {
			imposto = 0;
		}
		else if (renda <= 3000.00) {
			imposto = 0.08 * (renda - 2000.0);
		}
		else if (renda <= 4000.00) {
			imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f", imposto);			
		}
		
		sc.close();
	}
}
