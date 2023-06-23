package Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		
		
		Vehiculo auto1 = new Vehiculo("ford", "xl",2000,500, 0);
		
		testearAuto(auto1);
		

	}
	
	
	public static void testearAuto(Vehiculo auto) {
		System.out.println("--- testeando auto ---");
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
		System.out.println(auto.getVelocidadMaxima());
		System.out.println("el auto esta frenado");
		System.out.println(auto.getVelocidadActual());
		
		System.out.println("aceleramos el auto");
		auto.acelerar(50);
		System.out.println("la velocidad actual del auto es");
		System.out.println(auto.getVelocidadActual());
		auto.frenar(10);
		System.out.println("frena el auto ");
		System.out.println(auto.getVelocidadActual());
	}
	
	

}
