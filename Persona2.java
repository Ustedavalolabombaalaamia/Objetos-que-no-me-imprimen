package ar.edu.unlam.pb1.trabajoPractico02;

public class Persona2 {

	private String nombre;
	private String genero;
	private long Dni;
	private double peso=0.0;
	private double altura=0.0;
	private int edad=0;
	private boolean viva=false;
	
	
	
	public Persona2(String nombreElegido, String generoElegido, long DniElegido, double pesoInicial, double alturaInicial) {
	nombre=nombreElegido;
	genero=generoElegido;
	Dni=DniElegido;
	peso=pesoInicial;
	altura=alturaInicial;
	
	}

	public void alimentar(double Kilos) {
		
		peso+=Kilos;
	}
	
	public void crecer (double metros) {
		altura+=metros;
	}
	
	public void cumplirAnios() {
		edad++;
	}
	
	public double pesar() {
		return peso;
	}
	
	public double medir() {
		return altura;
	}
	
	public void morir() {
		viva=!viva;
	}
}
