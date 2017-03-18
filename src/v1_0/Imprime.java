package v1_0;

import com.github.lalyos.jfiglet.FigletFont;

public class Imprime {
	public static void ahorcadoFinal() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O     |");
		System.out.println("        /|\\"+"    |");
		System.out.println("        / \\"+"    |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcadoVictoria() {
		System.out.println("          _____");
		System.out.println("               |");
		System.out.println("               |");
		System.out.println("        \\"+"O/    |");
		System.out.println("         Y     |");
		System.out.println("        / \\"+"   /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	
	public static void ahorcado0() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("               |");
		System.out.println("               |");
		System.out.println("               |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcado1() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O     |");
		System.out.println("               |");
		System.out.println("               |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcado2() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O     |");
		System.out.println("         |     |");
		System.out.println("               |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcado3() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O     |");
		System.out.println("        /|     |");
		System.out.println("               |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcado4() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O     |");
		System.out.println("        /|\\"+"    |");
		System.out.println("               |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void ahorcado5() {
		System.out.println("          _____");
		System.out.println("         |     |");
		System.out.println("         O    |");
		System.out.println("        /|\\"+"    |");
		System.out.println("        /      |");
		System.out.println("              /|\\");
		System.out.println("wWwWwWwWwWwWwWwWwWwWwWwWwWw");
	}
	public static void imprimeAsciiArt (String s) {
		String a = FigletFont.convertOneLine(s.replaceAll(" ", "    ").toUpperCase());
		System.out.println(a);
	}

}
