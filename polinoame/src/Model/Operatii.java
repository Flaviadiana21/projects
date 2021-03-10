package Model;
import java.util.*;

public class Operatii {
 
	
	public static Polinom adunare(Polinom p1,Polinom p2) {
		Polinom rez = new Polinom();
		Iterator<Monom> it1 = (Iterator<Monom>) p1.getList().iterator();
		int ok;
		
		while (it1.hasNext()) {
			Iterator<Monom> it2 = (Iterator<Monom>) p2.getList().iterator();
			Monom m1 = it1.next();
			ok = 1;
			while (it2.hasNext()) {
				Monom m2 = it2.next();
				if (m1.getPow().equals(m2.getPow())) {
					ok = 0;
					rez.adaugareMonom(new Monom(m1.getCoef() + m2.getCoef(), m1.getPow()));
					it2.remove();
				}
			}
			if (ok == 1)
				rez.adaugareMonom(m1);
		}
		
		Iterator<Monom> it = (Iterator<Monom>) p2.getList().iterator();
		
		while (it.hasNext()) {
			Monom m = it.next();
			rez.adaugareMonom(m);
		}
		
		return rez;
	}
	
	public static Polinom scadere(Polinom p1,Polinom p2) {
		Polinom rez = new Polinom();
		Iterator<Monom> it1 = (Iterator<Monom>) p1.getList().iterator();
		int ok;
		
		while (it1.hasNext()) {
			Iterator<Monom> it2 = (Iterator<Monom>) p2.getList().iterator();
			Monom m1 = it1.next();
			ok = 1;
			while (it2.hasNext()) {
				Monom m2 = it2.next();
				if (m1.getPow().equals(m2.getPow())) {
					ok = 0;
					rez.adaugareMonom(new Monom(m1.getCoef() - m2.getCoef(), m1.getPow()));
					it2.remove();
				}
			}
			if (ok == 1)
				rez.adaugareMonom(m1);
		}
		
		Iterator<Monom> it = (Iterator<Monom>) p2.getList().iterator();
		
		while (it.hasNext()) {
			Monom m = it.next();
			m.setCoef(m.getCoef() * (-1));
			rez.adaugareMonom(m);
		}
		
		return rez;
	}
	
	
	public static Polinom derivare(Polinom p1) {
		Polinom rez = new Polinom();
		Iterator<Monom> it1 = (Iterator<Monom>) p1.getList().iterator();
		Monom m = null;
		
		while(it1.hasNext()) {
			m = it1.next();
			Integer pow = m.getPow();
			Double coef = m.getCoef();
			if(pow.equals(0))
				it1.remove();
			else {
			Integer newPow = new Integer(pow - 1);
			Double newCoef = new Double( pow * coef);
			rez.adaugareMonom(new Monom(newCoef,newPow));
			}
		}
		
		return rez;
	}
	
	
	public static Polinom integrare(Polinom p1) {
		Polinom rez = new Polinom();
		Iterator<Monom> it1 = (Iterator<Monom>) p1.getList().iterator();
		Monom m = null;
		
		while(it1.hasNext()) {
			m = it1.next();
			Integer pow = m.getPow();
			Double coef = m.getCoef();
			Integer newPow = new Integer(pow + 1);
			Double newCoef = new Double( coef/ (pow +1));
			rez.adaugareMonom(new Monom(newCoef,newPow));
	 		
		}
		return rez;
	}
	
	// metoda pt transformare polinom -> String
	public static String PolinomToString(Polinom p) {
		String rez = new String("<html>");
		Iterator<Monom> it = (Iterator<Monom>) p.getList().iterator();
		
		while (it.hasNext()) {
			Monom m = it.next();
			if (!m.getCoef().equals(0.0)) {
				if (m.getCoef() >= 0.0)
					rez = rez + " + " + m.getCoef().toString() + "X<sup>" + m.getPow().toString() + "</sup> ";
				else
					rez = rez + m.getCoef().toString() + "X<sup>" + m.getPow().toString() + "</sup> ";
			}
			
		}
		
		rez = rez + "</html>";
		
		return rez;
	}
	
	//metoda pt transformarea unui string in monom -> polinom
	public static Polinom StringToPolinom(String text) {
		Polinom p = new Polinom();
		
		int i = 0, c = -1;
		Integer pow = null;
		Double coef = null;
		String aux = new String();
		
		while (i < text.length()) {
			if ((text.charAt(i) >= '0' && text.charAt(i) <= '9') || text.charAt(i) == '-') {
				aux = new String();
				c++;
				while (i < text.length() && text.charAt(i) >= '0' && text.charAt(i) <= '9' || i < text.length() && text.charAt(i) == '-') {
					aux = aux + text.charAt(i);
					i++;
				}
				
				if (c % 2 == 0)
					coef = new Double(Double.parseDouble(aux));
				else {
					pow = new Integer(Integer.parseInt(aux));
					Monom m = new Monom(coef, pow);
					p.adaugareMonom(m);
				}
			}
			else 
				while (i < text.length() && text.charAt(i) == ' ')
					i++;
		}
		
		return p;
	}
	
	
	public static Polinom inmultire(Polinom p1, Polinom p2) {
		Polinom rez= new Polinom();
		Iterator<Monom> it1 = (Iterator<Monom>)p1.getList().iterator();
		
		while(it1.hasNext()) {
			Iterator<Monom> it2 = (Iterator<Monom>)p2.getList().iterator();
			Polinom aux = new Polinom();
			Monom m1 = it1.next();
			while(it2.hasNext()) {
				 Monom m2 = it2.next();
				 Double coef = m1.getCoef() * m2.getCoef();
				 Integer pow = m1.getPow() + m2.getPow();
				 Monom newMonom = new Monom(coef,pow);
				 aux.adaugareMonom(newMonom);
			}
			
			rez = Operatii.adunare(rez, aux);
			
		}
		
		return rez;
	}
}
