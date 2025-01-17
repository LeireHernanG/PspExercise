package pspEjercicio2;

import pspEjercicio1.MusicianPracticeInstrument;

public class MultiThreadMusicianPractice2{
	public static void main(String[] args) {
		MusicianPracticeInstrument m1=new MusicianPracticeInstrument("Pepe ",1,"Autorretrato,Extremoduro");
		MusicianPracticeInstrument m2=new MusicianPracticeInstrument("Pepa ",2,"Ni una sola palbara,Paulina Rubio");
		MusicianPracticeInstrument m3=new MusicianPracticeInstrument("Luis ",3,"Peter Pan,El canto del loco");
		// Create and start threads
		Thread thread1 = new Thread(m1);
		Thread thread2 = new Thread(m2);
		Thread thread3 = new Thread(m3);

		thread1.start();
		thread2.start();
		thread3.start();

		// Main thread continues
		System.out.println("All pets are eating ... ");

	}
}