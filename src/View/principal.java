package View;

import javax.swing.JOptionPane;

import Controller.Controller;

public class principal {

	public static void main(String[] args) {
		Controller op = new Controller();
		String Texto = op.Entrada();

		op.Texto(Texto);

	}

}

// Texto1 = ("abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba");
// Texto2 = ("abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga");
// Texto3 = ("acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião");
