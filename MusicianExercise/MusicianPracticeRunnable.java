package MusicianExercise;

// Class implementing Runnable to represent a musician practicing
class MusicianPracticeRunnable implements Runnable {
	private String musicianName;
	private int practiceTime;
	private String songName;

	public MusicianPracticeRunnable(String musicianName, int practiceTime,String songName) {
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
		MusicianPracticeRunnable m1=new MusicianPracticeRunnable("Pepe ",1,"Autorretrato,Extremoduro");
		MusicianPracticeRunnable m2=new MusicianPracticeRunnable("Pepa ",2,"Ni una sola palbara,Paulina Rubio");
		MusicianPracticeRunnable m3=new MusicianPracticeRunnable("Luis ",3,"Peter Pan,El canto del loco");
		// Create and start threads
		Thread thread1 = new Thread(m1);
		Thread thread2 = new Thread(m2);
		Thread thread3 = new Thread(m3);

		thread1.start();
		thread2.start();
		thread3.start();

		// Main thread continues
		System.out.println("All musician are practicing ... ");
	}
}