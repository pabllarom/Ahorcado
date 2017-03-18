package v1_0;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
	public static void jugarAhorcado() {
	String s = "Hola Fernando!!"
			+ "";
	List<String> ls = palabraALista(s);
	List<String> res = listaResultadoVacia(ls);
	imprimeLista(res);
	System.out.println("Introduzca Letra");
	Scanner sc = new Scanner(System.in);
	int cont = 0;
	while (cont < 6 && res.contains("_")) {
		String letra = sc.nextLine().toUpperCase();
		cont = cuerpoJuego(letra, res, ls, cont, s);
		imprimeLista(res);
		imprimeAhorcado(cont);
		System.out.println("-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-");
		}
	if (!res.contains("_") && cont!=100) {
		Imprime.imprimeAsciiArt("HAS GANADO!! :D");
		Imprime.imprimeAsciiArt(s);
		Imprime.ahorcadoVictoria();
	}
	sc.close();
}	
	
	
	
	private static int cuerpoJuego (String letra, List<String> res,
			List<String> ls, int cont, String sol) {
		if (letra.toUpperCase().equals(sol.toUpperCase())) {
			Imprime.imprimeAsciiArt("HAS GANADO!! :D");
			Imprime.imprimeAsciiArt(letra);
			Imprime.ahorcadoVictoria();
			cont = 100;
		
		} else if (ls.contains(letra)) {
			while(ls.contains(letra)) {
				int ind = ls.indexOf(letra);
				res.remove(ind);
				ls.remove(ind);
				res.add(ind, letra);
				ls.add(ind, "_");
			}
		} else {
			cont++;
		}
		return cont;
	}
	private static void imprimeAhorcado (int n) {
		if (n==0) {
			Imprime.ahorcado0();
		} else if (n==1) {
			Imprime.ahorcado1();
		} else if (n==2) {
			Imprime.ahorcado2();
		} else if (n==3) {
			Imprime.ahorcado3();
		} else if (n==4) {
			Imprime.ahorcado4();
		} else if (n==5) {
			Imprime.ahorcado5();
		} else if (n==100){
			
		} else {
			Imprime.ahorcadoFinal();
			Imprime.imprimeAsciiArt("HAS PERDIDO! :'(");
		}	
	}
		
	
	private static List<String> palabraALista (String s) {
		List<String> res = new ArrayList<>();
		char[] ac = s.toCharArray();
		int cont = 0;
		while (cont < ac.length) {
			String letra = ac[cont] + "" ;
			res.add(letra.toUpperCase());
			cont++;
		}
		return res;
	}
	private static List<String> listaResultadoVacia (List<String> ls) {
		List<String> res = new ArrayList<>();
		for (String s: ls) {
			if (s.equals(" ")) {
				res.add(" ");
			} else if (s.equalsIgnoreCase("-")) {
				res.add("-");
			} else if (s.equals("!")) {
				res.add("!"); 			
			} else {
				res.add("_");
			}
		}
		return res;
	}
	private static void imprimeLista (List<String> ls) {
		String res = "";
		int cont = 0;
		while (cont < ls.size()) {
			res = res + ls.get(cont) +" ";
			cont++;
		}
		System.out.println(res.trim());
	}

}