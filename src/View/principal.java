package View;

import javax.swing.JOptionPane;

import Controller.Controller;

public class principal {

	public static void main(String[] args) {
		Controller op = new Controller();
		String Texto1 = op.Entrada();
		op.Texto(Texto1);
		
		String Texto2 = op.Entrada();
		op.Texto(Texto2);
		
		String Texto3 = op.Entrada();
		op.Texto(Texto3);
	}

}

// Texto1 = ("abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba");
// Texto2 = ("abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga");
// Texto3 = ("acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião");
