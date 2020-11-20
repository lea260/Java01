package main;


public class PrimeraClase {
	public static void main(String args[]) {		
		Formulario form = new Formulario();
		//posicion en x, posicion en y
		form.setBounds(0, 0, 400, 400);
		form.setVisible(true);
		//formulario en el centro
		form.setLocationRelativeTo(null);		
	}
}