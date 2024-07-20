import src.*;
import java.util.*;

	public class Principal{
		public static void main(String[] args) {
			
	Scanner leer = new Scanner (System.in);
	int opcUser = 0;
	int ataque = (int)(Math.random()*+25+5);

	int blastoisecont = 0;
	int charizardcont = 0;
	int dragonitecont = 0;
	int hypnocont = 0;
	int pikachucont = 0;
	int venasaurcont = 0;
	int matchstotal = 0;
	int winjugador1 = 0;
	int winjugador2 = 0;

	do{
		Menu menu1 = new Menu();
		menu1.mostMenu();
		opcUser = leer.nextInt();

		switch(opcUser){
		case 1:
			menu1.mostPokes();
		break;
		case 2:
			System.out.println("Inicia la batalla Pokemon");
			matchstotal++;
			int poke1, poke2, poke1_2, poke2_2;
			String jug1, jug2;
			Scanner lee = new Scanner(System.in);
			do{
				System.out.println("Escribe el nombre del jugador 1: ");
				jug1=lee.next();
				System.out.println("NOMBRE: " + jug1 + " Selecciona uno de los Pokemones disponibles:");
				menu1.mostPokes();

				poke1=lee.nextInt();
				
			}while(poke1 >= 6 || poke1 <=1);

			Datos pokeEleg1_1 = null;

			int psRam = (int)(Math.random()*50+50);

			switch(poke1){
			case 1:
				System.out.println("Tu primer Pokemon es Blastoise");
				pokeEleg1_1 = new Blastoise(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				blastoisecont++;
				break;
			case 2:
				System.out.println("Tu primer Pokemon es Charizard");
				pokeEleg1_1 = new Charizard(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				charizardcont++;
				break;
			case 3:
				System.out.println("Tu primer Pokemon es Dragonite");
				pokeEleg1_1 = new Dragonite(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				dragonitecont++;
				break;
			case 4:
				System.out.println("Tu primer Pokemon es Hypno");
				pokeEleg1_1 = new Hypno(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				hypnocont++;
				break;
			case 5:
				System.out.println("Tu primer Pokemon es Pikachu");
				pokeEleg1_1 = new Pikachu(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				pikachucont++;
				break;
			case 6:
				System.out.println("Tu primer Pokemon es Venasaur");
				pokeEleg1_1 = new Venasaur(psRam);
				System.out.println("Vida: " + psRam);
				System.out.println("Ataque: " + ataque);
				venasaurcont++;
				break;
			default:
				System.out.println("Este numero no corresponde a un Pokemon");
				break;
			
			}

			Scanner leer2 = new Scanner(System.in);

			do{
				System.out.println(jug1 + " elige tu segundo Pokemon:");
				menu1.mostPokes();
				poke1_2 = leer2.nextInt();
			}while(poke1_2 >= 6 && poke1_2 <= 1);

			Datos pokeEleg1_2 = null;
			int psRam2 = (int)(Math.random()+50+50);

			switch(poke1_2){
			case 1:
				System.out.println("Tu segundo Pokemon es Blastoise");
				pokeEleg1_2 = new Blastoise(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				blastoisecont++;
				break;
			case 2:
				System.out.println("Tu segundo Pokemon es Charizard");
				pokeEleg1_2 = new Charizard(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				charizardcont++;
				break;
			case 3:
				System.out.println("Tu segundo Pokemon es Dragonite");
				pokeEleg1_2 = new Dragonite(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				dragonitecont++;
				break;
			case 4:
				System.out.println("Tu segundo Pokemon es Hypno");
				pokeEleg1_2 = new Hypno(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				hypnocont++;
				break;
			case 5:
				System.out.println("Tu segundo Pokemon es Pikachu");
				pokeEleg1_2 = new Pikachu(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				pikachucont++;
				break;
			case 6:
				System.out.println("Tu segundo Pokemon es Venasaur");
				pokeEleg1_2 = new Venasaur(psRam2);
				System.out.println("Vida: " + psRam2);
				System.out.println("Ataque: " + ataque);
				venasaurcont++;
				break;
			default:
				System.out.println("Este numero no corresponde a un Pokemon");
				break;
			}

			Scanner leer3 = new Scanner(System.in);

			do{
				System.out.println("Escribe el nombre del jugador 2");
				jug2=leer3.next();
				System.out.println("NOMBRE: " + jug2 + " Selecciona uno de los Pokemones disponibles:");
				menu1.mostPokes();
				poke2=lee.nextInt();
			}while(poke2 >=6 && poke2 <=1);
			Datos pokeEleg2_1 = null;

			int psRam3 = (int)(Math.random()*50+50);

			switch(poke2){
			case 1:
				System.out.println("Tu primer Pokemon es Blastoise");
				pokeEleg2_1 = new Blastoise(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				blastoisecont++;
				break;
			case 2:
				System.out.println("Tu primer Pokemon es Charizard");
				pokeEleg2_1 = new Charizard(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				charizardcont++;
				break;
			case 3:
				System.out.println("Tu primer Pokemon es Dragonite");
				pokeEleg2_1 = new Dragonite(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				dragonitecont++;
				break;
			case 4:
				System.out.println("Tu primer Pokemon es Hypno");
				pokeEleg2_1 = new Hypno(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				hypnocont++;
				break;
			case 5:
				System.out.println("Tu primer Pokemon es Pikachu");
				pokeEleg2_1 = new Pikachu(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				pikachucont++;
				break;
			case 6:
				System.out.println("Tu primer Pokemon es Venasaur");
				pokeEleg2_1 = new Venasaur(psRam3);
				System.out.println("Vida: " + psRam3);
				System.out.println("Ataque: " + ataque);
				venasaurcont++;
				break;
			default:
				System.out.println("Este numero no corresponde a un Pokemon");
				break;

			}

			Scanner leer4 = new Scanner(System.in);

			do{
				System.out.println(jug2 + "elige tu segundo Pokemon:");
				menu1.mostPokes();
				poke2_2 = leer2.nextInt();
			}while(poke2_2 >= 6 && poke2_2 <= 1);

			Datos pokeEleg2_2 = null;
			int psRam4 = (int)(Math.random()+50+50);

			switch(poke2_2){
			case 1:
				System.out.println("Tu segundo Pokemon es Blastoise");
				pokeEleg2_2 = new Blastoise(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				blastoisecont++;
				break;
			case 2:
				System.out.println("Tu segundo Pokemon es Charizard");
				pokeEleg2_2 = new Charizard(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				charizardcont++;
				break;
			case 3:
				System.out.println("Tu segundo Pokemon es Dragonite");
				pokeEleg2_2 = new Dragonite(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				dragonitecont++;
				break;
			case 4:
				System.out.println("Tu segundo Pokemon es Hypno");
				pokeEleg2_2 = new Hypno(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				hypnocont++;
				break;
			case 5:
				System.out.println("Tu segundo Pokemon es Pikachu");
				pokeEleg2_2 = new Pikachu(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				pikachucont++;
				break;
			case 6:
				System.out.println("Tu segundo Pokemon es Venasaur");
				pokeEleg2_2 = new Venasaur(psRam4);
				System.out.println("Vida: " + psRam4);
				System.out.println("Ataque: " + ataque);
				venasaurcont++;
				break;
			default:
				System.out.println("Este numero no corresponde a un Pokemon");
				break;
			}
			System.out.println("La batalla ha iniciado");

			System.out.println("Pokemones que van a estar en la batalla");

				pokeEleg1_1.nombre();
				pokeEleg2_1.nombre();

				pokeEleg1_2.nombre();
				pokeEleg2_2.nombre();

				pokeEleg1_1.getEstado();
				pokeEleg2_1.getEstado();

				pokeEleg1_2.getEstado();
				pokeEleg2_2.getEstado();

			Datos pokesec1 = null;
			Datos pokesec2 = null;

				do{

					
						System.out.println("Turno del primer Entrenador Pokemon");
						System.out.println("Pokemones seleccionados: " + pokeEleg1_1.getNombre()+ " y  " + pokeEleg1_2.getNombre());

					if(pokeEleg1_1.getVida() > 0 && pokeEleg1_2.getVida()> 0){
						System.out.println("Vida del pokemon: " + pokeEleg1_1.getNombre() + "= " + pokeEleg1_1.getVida());
					}else if (pokeEleg1_1.getVida() < 0 && pokeEleg1_2.getVida() > 0){
						System.out.println("Vida de pokemon: " + pokeEleg1_1.getNombre()+ "=0 (Estado: muerto) " + pokeEleg1_2.getNombre());
					}else if(pokeEleg1_1.getVida() > 0 && pokeEleg1_2.getVida() < 0){
						System.out.println("Vida de pokemon: " + pokeEleg1_1.getNombre()+ "= " + pokeEleg1_2.getVida());
					}else if(pokeEleg1_1.getVida() < 0 && pokeEleg1_2.getVida() < 0){
						System.out.println("Vida del pokemon: " +pokeEleg1_1.getNombre() + "= 0 (Estado muerto)" + pokeEleg1_2.getNombre());
					}

				System.out.println("Elige tu Pokemon: ");
				Scanner secc1 = new Scanner(System.in);
				int opcion;

					do{
						if(pokeEleg1_1.getVida()>0){
							System.out.println("1. " + pokeEleg1_1.getNombre());
						}
						if (pokeEleg1_2.getVida()>0){
							System.out.println("2." + pokeEleg1_2.getNombre());
						}
					opcion = secc1.nextInt();

					switch(opcion){
					case 1:
						System.out.println("Pokemon que elegiste: " + pokeEleg1_1.getNombre());
						pokeEleg1_1 = pokeEleg1_1; 
						break;
					case 2:
						System.out.println("Pokemon seleccionado: " + pokeEleg1_2.getNombre());
						pokeEleg1_2 = pokeEleg1_2;
						break;
					}

					}while(opcion <0 && opcion > 2 && pokeEleg1_1.getVida()<0);

					System.out.println("Pokemon al que atacaras: ");
					do{
						if(pokeEleg2_1.getVida()>0){
							System.out.println("1. " + pokeEleg2_1.getNombre());
						}
						if(pokeEleg2_2.getVida()>0){
							System.out.println("2. " + pokeEleg2_2.getNombre());
						}

						int opcion1 = secc1.nextInt();

						switch(opcion1){
						case 1:
							System.out.println("Pokemon al que atacaras: "+ pokeEleg2_1.getNombre());
							pokeEleg2_1 = pokeEleg2_1;
							pokeEleg2_1.mostPoke();
							break;
						case 2: 
							System.out.println("Pokemon al que atacaras: "+ pokeEleg2_2.getNombre());
							pokeEleg2_2 = pokeEleg2_2;
							pokeEleg2_2.mostPoke();
							break;
						}

					}while(opcion < 0 && opcion > 2 && pokeEleg2_2.getVida()<0);

					pokeEleg1_1.atacar();
					pokeEleg1_2.atacar();

					pokeEleg1_1 = pokeEleg1_1.atacar(1, pokeEleg2_1);

					if(pokeEleg1_1.getVida()>0){
						System.out.println("Pts: " + pokeEleg2_1.getNombre()+ ": " + pokeEleg2_1.getVida());
					}else if (pokeEleg1_2.getVida()<0){
						System.out.println("Pts: " + pokeEleg2_2.getNombre()+ " =0 (Estado: muerto)");
					}
					if(pokeEleg1_2.getVida()<=0 && pokeEleg2_2.getVida() <=0){
						System.out.println(jug1 + " gano la batalla");

						winjugador1++;
						break;
					}

					System.out.println("Turno del segundo Entrenador Pokemon");
						System.out.println("Pokemones seleccionados: " + pokeEleg2_1.getNombre()+ " y  " + pokeEleg2_2.getNombre());

					if(pokeEleg2_1.getVida() > 0 && pokeEleg2_2.getVida()> 0){
						System.out.println("Vida del pokemon: " + pokeEleg2_1.getNombre() + "= " + pokeEleg2_1.getVida());
					}else if (pokeEleg2_1.getVida() < 0 && pokeEleg2_2.getVida() > 0){
						System.out.println("Vida de pokemon: " + pokeEleg2_1.getNombre()+ "=0 (Estado: muerto) " + pokeEleg2_2.getNombre());
					}else if(pokeEleg1_1.getVida() > 0 && pokeEleg1_2.getVida() < 0){
						System.out.println("Vida de pokemon: " + pokeEleg2_1.getNombre()+ "= " + pokeEleg2_2.getVida());
					}else if(pokeEleg1_1.getVida() < 0 && pokeEleg1_2.getVida() < 0){
						System.out.println("Vida del pokemon: " +pokeEleg2_1.getNombre() + "= 0 (Estado muerto)" + pokeEleg2_2.getNombre());
					}

				System.out.println("Elige tu Pokemon: ");
				Scanner num7 = new Scanner(System.in);
				int op;

					do{
						if(pokeEleg2_1.getVida()>0){
							System.out.println("1. " + pokeEleg2_1.getNombre());
						}
						if (pokeEleg2_2.getVida()>0){
							System.out.println("2." + pokeEleg2_2.getNombre());
						}
					op = num7.nextInt();

					switch(opcion){
					case 1:
						System.out.println("Pokemon que elegiste: " + pokeEleg2_1.getNombre());
						pokeEleg2_1 = pokeEleg2_1; 
						break;
					case 2:
						System.out.println("Pokemon seleccionado: " + pokeEleg2_2.getNombre());
						pokeEleg2_2 = pokeEleg2_2;
						break;
					}

					}while(opcion <0 && opcion > 2 && pokeEleg1_1.getVida()<0);

					System.out.println("Pokemon al que atacaras: ");
					do{
						if(pokeEleg1_1.getVida()>0){
							System.out.println("1. " + pokeEleg1_1.getNombre());
						}
						if(pokeEleg1_2.getVida()>0){
							System.out.println("2. " + pokeEleg1_2.getNombre());
						}

						int opcion1 = secc1.nextInt();

						switch(opcion1){
						case 1:
							System.out.println("Pokemon al que atacaras: "+ pokeEleg1_1.getNombre());
							pokeEleg1_1 = pokeEleg1_1;
							pokeEleg1_1.mostPoke();
							break;
						case 2: 
							System.out.println("Pokemon al que atacaras: "+ pokeEleg1_2.getNombre());
							pokeEleg1_2 = pokeEleg1_2;
							pokeEleg1_2.mostPoke();
							break;
						}

					}while(opcion < 0 && opcion > 2 && pokeEleg1_2.getVida()<0);

					pokeEleg1_1.atacar();
					pokeEleg1_2.atacar();

					pokeEleg1_1 = pokeEleg1_1.atacar(1, pokeEleg2_1);

					if(pokeEleg1_1.getVida()>0){
						System.out.println("Pts: " + pokeEleg1_1.getNombre()+ ": " + pokeEleg1_1.getVida());
					}else if (pokeEleg1_2.getVida()<0){
						System.out.println("Pts: " + pokeEleg1_2.getNombre()+ " =0 (Estado: muerto)");
					}
					if(pokeEleg1_1.getVida()<=0 && pokeEleg1_2.getVida() <=0){
						System.out.println(jug2 + " gano la batalla");

						winjugador2++;
						break;


					}


					
				}while(pokeEleg1_1.getVida() >=0 || pokeEleg1_2.getVida() >= 0 || pokeEleg2_1.getVida() >=0 || pokeEleg2_2.getVida() >= 0);
			
		break;
		case 3:
			menu1.statspoke();
		break;
		case 4:
			menu1.historial();
		break;
		case 5:
			System.out.println("SALIR DEL JUEGO");
			break;
			default:
			System.out.println("Opcion no valida en el menu");
			break;
			}
		Scanner num5 = new Scanner(System.in);

		System.out.println("Menu para regresar al Menu Pokemon");
		System.out.println("1. Si, regresar al menu");
		System.out.println("2. No. salir de Pokemon");
		System.out.println("Elige una opcion");
		int numult;

		numult = num5.nextInt();

		if (numult==1){

		}else if (numult==2){
		break;
		}

		}while(opcUser !=5);
	}
}




