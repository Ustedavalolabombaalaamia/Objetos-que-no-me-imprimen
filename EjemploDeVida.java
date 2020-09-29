package ar.edu.unlam.pb1.trabajoPractico02;

public class EjemploDeVida {

	public static void main(String[] args) {

		//Declaracion de la variable
		Persona2 Sofia;
		
		
		//Instanciacion de objeto
		Sofia = new Persona2("sofia","Mujer",38432153,2.8, 0.50);
		
		
		System.out.println(Sofia);
		
		System.out.println(Sofia.pesar());
		System.out.println(Sofia.medir());
		
		
	}

}
