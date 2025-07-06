package plantas;

public class Arbusto extends Planta{
	
	private double anchoArbusto;
	private boolean esDomestico;
	private String variedad;
	private String colorHojas;
	private boolean sePoda;
	

	
	
	public Arbusto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
		super(nombre, altoTallo, tieneHojas, climaIdeal);
		// TODO Auto-generated constructor stub
	}
	




	public Arbusto(double anchoArbusto, boolean esDomestico, String variedad, String colorHojas, boolean sePoda) {
		super();
		this.anchoArbusto = anchoArbusto;
		this.esDomestico = esDomestico;
		this.variedad = variedad;
		this.colorHojas = colorHojas;
		this.sePoda = sePoda;
	}
	
	

	



	public double getAnchoArbusto() {
		return anchoArbusto;
	}




	public void setAnchoArbusto(double anchoArbusto) {
		this.anchoArbusto = anchoArbusto;
	}




	public boolean isEsDomestico() {
		return esDomestico;
	}




	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}




	public String getVariedad() {
		return variedad;
	}




	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}




	public String getColorHojas() {
		return colorHojas;
	}




	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}




	public boolean isSePoda() {
		return sePoda;
	}




	public void setSePoda(boolean sePoda) {
		this.sePoda = sePoda;
	}




	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy un arbusto");
		
		
	}

}
