package Model;

public class Monom {

	private Double coef;
	private Integer pow;
	
	
	public Monom(Double coef,Integer pow) {
		this.coef = new Double(coef);
		this.pow = new Integer(pow);
	}
	
	public void setCoef(Double coef) {
		this.coef = coef;
	}
	
	public Double getCoef() {
		return this.coef;
	}
	
	public void setPow(Integer pow) {
		this.pow=pow;
	}
	
	public Integer getPow() {
		return this.pow;
	}
	
}
