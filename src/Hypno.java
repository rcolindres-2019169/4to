package src;
public class Hypno extends Datos{

	int ataque = (int)(Math.random()*+25+5);

	public Hypno(){

	}	
	public Hypno(int vidaram){
		this.vida = vidaram;
	}	
	public void pokemon() {
		pokemon = "Hypno";
	}

	public void nombre() {
		nombre = "Hypno";
	}
	public void vida(){
		int vidaram = (int)(Math.random()*+50+50);
		vida = vidaram;
	}
	public void estado(){
		estado = true;
	}

	public Datos atacar(int secataque, Datos atackPoke){
		int rand = (int)(Math.random()*+15+5);

		switch (secataque){
		case 1:
			atackPoke.vida = rand;
			break;
		default:
			break;
		}if(atackPoke.getVida() < 0 )
			atackPoke.setEstado(false);
			return atackPoke;
	
	}

	public void mostPoke() {
	System.out.println("Nombre: Hypno");

	System.out.println("                                                                    ");
	System.out.println("@@@@#@@@@@@@@@@@@@@@@@@.(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@#@@@@@@@@@@@@@@@@@(..,@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@.....,.#@@@@@@@@@@@...,,@@@@@@@@@@@@@@..,@@@@@@@@@@@@((@@@@@@@@@@");
	System.out.println("@@,,,........@@@@@@@@&,,,,,,*@@@@@@@@@..((@.@@@@@@@@@@(....,..&@@@@@");
	System.out.println("@............@@@@@@@@,,,..........*..,((((,@@@@@@@@@@,.........,%@@@");
	System.out.println("@@@@@@/......(@@@@@@@...............#((//@*@@@@@@@@..*,,.......,...@");
	System.out.println("@@@@@@@.......@@@@@#...................&/*@@@@@@@%...*****,***@,..,.");
	System.out.println("@@@@@@@.......@@@@@....................,,#@@@@@@@@,.,*#**/%&#***(**@");
	System.out.println("@@@@@@@.......@@@@@.( ......../&#*...,,,,/@@@@@@@@@@@*********/@@@@@");
	System.out.println("@@@@@@@....*,,,,% (.&......./....,,*,*,,,(,,*@@@@@@@%,,/*****@@@@@@@");
	System.out.println("@@@@@@@,..,,,,,,, ........./...,,*,,,,,,*,,,,/@@@@@@,,,,,,,,@@@@@@@@");
	System.out.println("@@@@@@@@@.,,,,,.  ......,,/,,,,*,****,.,,,,,,,./***,,,,,.,,@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@   &.*, %,,,,,,,,,,@,,,,,/,,,,%//***,,/(///*%&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@.            ......,,,,,,,,,(///****,#/&@@@,/&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@@@@                    .,,,@@@@@@@@@@&%/**(%&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@,.... .       ...,,@**@@@@@@@@@@&&&&&&&&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@.....,.@@/@,#@%*******@@@@@@@@@@%&&&&&&&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@,,..................,,*@@@@@@@@@&&&&&&&&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@@@@,*,,,,,,,........,,,,,,,,,@@@@@@@@@@&&&&&&&&&&&&&");
	System.out.println("@@@@@@@@@@@@@@@@.....,,,,,,,,*,*,*,*,,,,,*,***,,@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@.....,,,,,,,,*,*,*,*,,,,,*,***,,@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@..............,,*/@@@@@%*,,,*,*,,,*,,,*,*%@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@..*...........@@@@@@@@@@@@@@@@@#,,,,,,,,*,*@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@,,.***,,...,@@@@@@@@@@@@@@@@@**///********@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@********,**@@@@@@@@@@@@@@@@@***********@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@*********/@@@@@@@@@@@@@@@@************@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@*,*****(,,,@@@@@@@@@@@@@@@@@@*,,.......,,@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@*,,,,,,,,((,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@....@....(...../%%%%%%%%%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("                                                                    ");
}
}
