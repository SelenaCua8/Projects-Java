package videojuegos;

import java.lang.reflect.Constructor;

public class VideoJuegoUno {
	
	private int codigo;
	private String titulo;
	private String consola;
	private int cantJugadores;
	private String categoria;
	
	public VideoJuegoUno(int codigo, String titulo, String consola, int cantJugadores, String categoria) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.consola=consola;
		this.cantJugadores=cantJugadores;
		this.categoria=categoria;
		
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "VideoJuegoUno [codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantJugadores="
				+ cantJugadores + ", categoria=" + categoria + ", getCodigo()=" + getCodigo() + ", getTitulo()="
				+ getTitulo() + ", getConsola()=" + getConsola() + ", getCantJugadores()=" + getCantJugadores()
				+ ", getCategoria()=" + getCategoria() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
