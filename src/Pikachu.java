package src;
public class Pikachu extends Datos{

	int ataque = (int)(Math.random()*+25+5);

	public Pikachu(){

	}		
	public Pikachu(int vidaram){
		this.vida = vidaram;
	}
	public void pokemon() {
		pokemon = "Pikachu";
	}

	public void nombre() {
		nombre = "Pikachu";
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
	System.out.println("Nombre: Pikachu");
	System.out.println("                                                                                ");
	System.out.println("                    &&&&&#                                                      ");
	System.out.println("                     /&&&,...#                                                  ");
	System.out.println("                       &&,....../                                        #&&&&&%");
	System.out.println("                         #.........#                                /.....&&&&  ");
	System.out.println("                           (,......../                         .*.........&&    ");
	System.out.println("                              %,.......%%,...........((     /............,      ");
	System.out.println("        .......(*                /*......................./..........*.         ");
	System.out.println("       ,............#.             (............................,#              ");
	System.out.println("     #..................,%        &....,,,.....................                 ");
	System.out.println("    .........................*    ....&&. &,...........,%#,...#                 ");
	System.out.println("  (..............................%....,&&&,...........&&*&&#..(                 ");
	System.out.println(" *....................../....#../&((((,................%&&,...*                 ");
	System.out.println("    ,%******************.......,%((((((.....%&&&%&&%,....../*.(                 ");
	System.out.println("              ,#/*******/.........#(#*......#######*.....(((((#                 ");
	System.out.println("                        /#..........(......../////.......%((((                  ");
	System.out.println("                         (*,........../.......**.........../                    ");
	System.out.println("                       #****#..........,...............#./                      ");
	System.out.println("                     .******% *.............****,.........%                     ");
	System.out.println("                    &*********( %,.................(......,                     ");
	System.out.println("                         .#****%,,................#.........                    ");
	System.out.println("                           (***...........................,.                    ");
	System.out.println("                         %###/...................,........&                     ");
	System.out.println("                          *###..,,#(*(.#.........*.......*.., %/(               ");
	System.out.println("                            ......,.*,#..*.......%/.....#...*,##/               ");
	System.out.println("                            *......*****.............,...../***%                ");
	System.out.println("                             #...**********************,.,*****                 ");
	System.out.println("                               (****#************************                   ");
	System.out.println("                                     .**                 *#                     ");
	System.out.println("                                                                                ");	
}
}

