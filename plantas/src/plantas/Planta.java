package plantas;

public abstract class Planta {

	//ATRIBUTOS
	private String nombre;
	private double altoTallo;
	private boolean tieneHojas;
	private String climaIdeal;
	
	
	//CONSTRUCTOR
	public Planta() {
		
	}

//CONSTRUCTOR CON PARAMETROS
	public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
		super();
		this.nombre = nombre;
		this.altoTallo = altoTallo;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
	}
	
	//GETTERS AND SETTERS = nos permites traen valores y asignar valores que nosotros queremos 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltoTallo() {
		return altoTallo;
	}

	public void setAltoTallo(double altoTallo) {
		this.altoTallo = altoTallo;
	}

	public boolean isTieneHojas() {
		return tieneHojas;
	}

	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	public String getClimaIdeal() {
		return climaIdeal;
	}

	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}
	
	
	public abstract void decirLoQueSoy();
	
}
