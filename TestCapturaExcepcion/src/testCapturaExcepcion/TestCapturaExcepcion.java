package testCapturaExcepcion;

public class TestCapturaExcepcion {

	public static void main(String[] args) {
		
		try {
			int dividendo = 7;
			int divisor = 0;
			int cociente = dividendo/divisor;
			System.out.println("aaaaaadios");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
		}

	}

}
