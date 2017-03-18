package v1_0;

import java.util.Scanner;

public class MainAhorcado {

	public static void main(String[] args) {
		Imprime.imprimeAsciiArt("EL AHORCADO");
		Imprime.ahorcado0();
		System.out.println("Elije que hacer.(Escribe el Número)");
		System.out.println("1) Jugar.");
		System.out.println("2) Añadir palabra. (No Disponible)");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.contains("1")) {
			System.out.println("JUGAR");
			Juego.jugarAhorcado();
		}
		sc.close();
		
		
	}

}
