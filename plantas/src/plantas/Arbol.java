package plantas;

public class Arbol extends Planta {
	
	private String variedad;
	private String tipoTronco;
	private double radioTronco;
	private String color;
	private String tipoHojas;
	
	
	

	public Arbol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arbol(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal,
            String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas) {
   super(nombre, altoTallo, tieneHojas, climaIdeal);
   this.variedad = variedad;
   this.tipoTronco = tipoTronco;
   this.radioTronco = radioTronco;
   this.color = color;
   this.tipoHojas = tipoHojas;
}












	public String getVariedad() {
		return variedad;
	}












	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}












	public String getTipoTronco() {
		return tipoTronco;
	}












	public void setTipoTronco(String tipoTronco) {
		this.tipoTronco = tipoTronco;
	}












	public double getRadioTronco() {
		return radioTronco;
	}












	public void setRadioTronco(double radioTronco) {
		this.radioTronco = radioTronco;
	}












	public String getColor() {
		return color;
	}












	public void setColor(String color) {
		this.color = color;
	}












	public String getTipoHojas() {
		return tipoHojas;
	}












	public void setTipoHojas(String tipoHojas) {
		this.tipoHojas = tipoHojas;
	}







@Override
public void decirLoQueSoy() {
	System.out.println("Hola soy un árbol");
}




	












	

}
