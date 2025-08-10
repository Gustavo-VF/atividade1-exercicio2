package Controller;

import javax.swing.JOptionPane;

public class Controller {
	public static String Entrada() {
		String Texto = JOptionPane.showInputDialog
				("Digite as palavras separadas por ;");
		return Texto;
	}

	public void Texto(String frase) {
		String[] Vpalavra = frase.split(";");
		int partes = Vpalavra.length;
		System.out.println(partes + " partes.");

	}

}
