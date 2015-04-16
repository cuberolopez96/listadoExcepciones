package testCapturaExcepciones;

import excepciones.MiExcepcion;

public class TestCapturaExcepciones {
	public static void main(String[] args){
		metodo1();
		System.out.println("main acabando.... ");
	}

	private static void metodo1() {
		metodo2();
		System.out.println("metodo1 acabando...");
		
	}

	private static void metodo2() {
	
		try {
			String nula = null;
			
			nula.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("metodo2 acabando....");	
		}
		
			
		
	}

}
