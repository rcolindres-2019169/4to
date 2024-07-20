import src.*;

public class Menu{
	
	Blastoise blas = new Blastoise();
	Charizard chari = new Charizard();
	Dragonite drago = new Dragonite();
	Hypno hyp = new Hypno();
	Pikachu pika = new Pikachu();
	Venasaur vena = new Venasaur();

	public void mostMenu(){
	System.out.println("          |MENU POKEMON|          ");
	System.out.println("	  1. MOSTRAR POKEMONES   	  ");
	System.out.println("	     2. BATALLAR              ");
	System.out.println("	    3. POKEMONES USADOS       ");
	System.out.println("     4. REGISTRO DE PARTIDAS      ");
	System.out.println("       5. Salir de Pokemon        ");

	System.out.println("Ingresa el numero de la opcion valido");
	}

	public void mostPokes(){
	System.out.println("	POKEMONES	");
	blas.mostPoke();
	chari.mostPoke();
	drago.mostPoke();
	hyp.mostPoke();
	pika.mostPoke();
	vena.mostPoke();
	}

	public void statspoke(){
	int blastoisecont = 0;
	int charizardcont = 0;
	int dragonitecont = 0;
	int hypnocont = 0;
	int pikachucont = 0;
	int venasaurcont = 0;


			System.out.println("USO DE POKEMONES");
			System.out.println("Blastoise ha sido usado " + blastoisecont + " veces");
			System.out.println("Charizard ha sido usado " + charizardcont + " veces");
			System.out.println("Dragonite ha sido usado " + dragonitecont + " veces");
			System.out.println("Hypno ha sido usado " + hypnocont + " veces");
			System.out.println("Pikachu ha sido usado " + pikachucont + " veces");
			System.out.println("Venasaur ha sido usado " + venasaurcont + " veces");
			System.out.println("");
}

	public void historial(){
	int matchstotal = 0;
	int winjugador1 = 0;
	int winjugador2 = 0;
		System.out.println("HISTORIAL DE PARTIDAS");
		System.out.println("Se han jugado " + matchstotal  + " batallas");
		System.out.println("El jugador 1 ha ganado " + winjugador1  + " batallas");
		System.out.println("El jugador 2 ha ganado " + winjugador2  + " batallas");
	}
}