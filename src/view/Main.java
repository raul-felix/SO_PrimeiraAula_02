package view;

import java.util.Scanner;

import controller.TextoController;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TextoController textoController = new TextoController();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira o texto:");
			StringBuffer texto = new StringBuffer(sc.nextLine());
			int partes = textoController.quantasPartes(texto.toString());
			System.out.println("Esse texto tem " + partes + " partes\n");
		}
	}
}
