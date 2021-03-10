package Model;
import java.util.*;

public class Polinom {

	private List<Monom> list;
	
	
	public Polinom() {
		this.list = new LinkedList<Monom>();
	}
	
	public void adaugareMonom(Monom m) {
		this.list.add(m);
	}
	
	public List<Monom> getList(){
		return this.list;
	}
	
	public void setList(List<Monom> list) {
		this.list = new LinkedList<Monom>(list);
	}
	
	public void sortare() {
		Collections.sort(list, new Comparator<Monom>() {

			public int compare(Monom arg0, Monom arg1) {
				if (arg0.getPow().intValue() < arg1.getPow().intValue())
					return 1;
				else
					return -1;
			}
			
		});
	}
}
