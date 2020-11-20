package main;
import javax.swing.*;


public class Formulario extends JFrame{
	private JLabel label01;
	public Formulario() {
		setLayout(null);
		label01 = new JLabel("Primero");
		label01.setBounds(0,0,100,40);
		super.add(label01);
	}
}