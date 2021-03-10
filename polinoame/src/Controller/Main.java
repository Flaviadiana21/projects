package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Operatii;
import Model.Polinom;
import View.GUI;


public class Main {
	
	private static GUI gui = new GUI();
	private static Polinom p1 = new Polinom();
	private static Polinom p2 = new Polinom();
	private static Polinom rez = new Polinom();
	private static String optiune = new String("Adunare");
	

	public static void main(String[] args) {
		
			
		gui.getCombo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				optiune = gui.getCombo().getSelectedItem().toString();
			}
		});
		
		// butonul calculeaza
		gui.getBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
			p1 = Operatii.StringToPolinom(gui.getText1().getText());	// iau textul 1
			p2 = Operatii.StringToPolinom(gui.getText2().getText());	// iau textul 2
			p1.sortare();
			p2.sortare();
			
			switch (optiune) {
				case "Adunare": rez = Operatii.adunare(p1, p2);
				break;
				case "Scadere": rez = Operatii.scadere(p1, p2);
				break;
				case "Inmultire": rez = Operatii.inmultire(p1, p2);
				break;
				case "Derivare": rez = Operatii.derivare(p1);
				break;
				case "Integrare": rez = Operatii.derivare(p1);
				break;
			}
			
			rez.sortare();
			
			gui.getRezLabel().setText(Operatii.PolinomToString(rez));
			gui.resetTextFields();
		}});
	}
}
