package psp;

public class MultiThreadMusicianPractice {

	public static void main(String[] args) {
		MusicianPracticeInstrument m1=new MusicianPracticeInstrument("Pepe ",1,"Autorretrato,Extremoduro");
		MusicianPracticeInstrument m2=new MusicianPracticeInstrument("Pepa ",2,"Ni una sola palbara,Paulina Rubio");
		MusicianPracticeInstrument m3=new MusicianPracticeInstrument("Luis ",3,"Peter Pan,El canto del loco");

		m1.start();
		System.out.println("empieza");
		m2.start();
		m3.start();

		System.out.println("All musician are practicings \n");
	}
}