/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/
import java.util.Scanner;

public class q04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial e final:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaFinal <= horaInicial) {
			duracao = 24 - (horaInicial - horaFinal);
		}
		else {
			duracao = horaFinal - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}
}
