package pspEjercicio1;
//Class for representing practincing of the musician

public class MusicianPracticeInstrument extends Thread {
	private String musicianName;
	private int practiceTime;
	private String songName;

	public MusicianPracticeInstrument(String musicianName, int practiceTime,String songName) {
		this.musicianName = musicianName;
		this.songName=songName;
		this.practiceTime = practiceTime;//in seconds
	}

	public void run() {
		System.out.println(musicianName + " started practicing the song "+songName);
		try {
			Thread.sleep(practiceTime * 1000L);//To convert seconds in milisecond
		} catch (InterruptedException e) {
			System.out.println(musicianName + " was interrupted while practicing");
		}
		System.out.println(musicianName + " finished practicing");
	}

	public static void main(String[] args) {
		MusicianPracticeInstrument m1=new MusicianPracticeInstrument("Pepe ",1,"Autorretrato,Extremoduro");
		MusicianPracticeInstrument m2=new MusicianPracticeInstrument("Pepa ",2,"Ni una sola palbara,Paulina Rubio");
		MusicianPracticeInstrument m3=new MusicianPracticeInstrument("Luis ",3,"Peter Pan,El canto del loco");

		m1.start();
		m2.start();
		m3.start();

		System.out.println("All musician are practicings \n");
	}
}
