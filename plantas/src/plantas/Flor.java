package plantas;

public class Flor extends Planta{
	
	
	private String colorPetalos;
	private String cantPetalos;
	private String variedad;
	private String estacion;
	
	

	public Flor() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
		super(nombre, altoTallo, tieneHojas, climaIdeal);
		this.colorPetalos = colorPetalos;
		this.cantPetalos = cantPetalos;
		this.variedad = variedad;
		this.estacion = estacion;
	}
	



	


	public String getColorPetalos() {
		return colorPetalos;
	}







	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}







	public String getCantPetalos() {
		return cantPetalos;
	}







	public void setCantPetalos(String cantPetalos) {
		this.cantPetalos = cantPetalos;
	}







	public String getVariedad() {
		return variedad;
	}







	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}







	public String getEstacion() {
		return estacion;
	}







	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}







	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy una flor");
		
	}
	
	
}
