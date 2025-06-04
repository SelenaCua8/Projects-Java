package ejerciciointegrador;

public class Squirtle extends Pokemon implements IAgua{
	
	public Squirtle() {
		
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Squirtle y este es mi ataque placaje");	
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Squirtle y este es mi ataque arañazo");	
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Squirtle y este es mi ataque mordisco");	
		
	}

	@Override
	public void atacarHibridoBomba() {
		System.out.println("Hola soy Squirtle y este es mi ataque hibrido bomba");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola soy Squirtle y este es mi ataque postila de agua");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
		
	}

	@Override
	public void atacarHidropulso() {
		System.out.println("Hola soy Squirtle y este es mi ataque hidro-pulso");
		
	}

}
