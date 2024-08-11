package controller;

public class TextoController {
	
	public TextoController() {
		super();
	}
	
	public int quantasPartes(String texto) {
		String[] partes = texto.split(";");
		return partes.length;
	}
}
