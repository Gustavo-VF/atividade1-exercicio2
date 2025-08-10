package View;

import javax.swing.JOptionPane;

import Controller.Controller;

public class principal {

	public static void main(String[] args) {
		Controller op = new Controller(); 
		String Texto1 = JOptionPane.showInputDialog("Digite as palavras separadas por ;");
		String Texto2 = JOptionPane.showInputDialog("Digite as palavras separadas por ;");
		String Texto3 = JOptionPane.showInputDialog("Digite as palavras separadas por ;");
		// Texto1 =
		// ("abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba");
		// Texto2 =
		// ("abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga");
		// Texto3 =
		// ("acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião");

		op.Texto(Texto1);
		op.Texto(Texto2);
		op.Texto(Texto3);

	}

}
