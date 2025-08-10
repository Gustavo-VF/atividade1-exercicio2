package Controller;

public class Controller {

	public void Texto(String frase) {
		String[] Vpalavra = frase.split(";");
		int partes = Vpalavra.length;
		System.out.println(partes + " partes.");

	}

}
