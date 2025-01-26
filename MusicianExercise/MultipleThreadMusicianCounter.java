package MusicianExercise;

public class MultipleThreadMusicianCounter implements Runnable {
	private String musicianName;
	private int practiceTime;
	private String songName;
	private static int counter = 0;

	public MultipleThreadMusicianCounter(String musicianName, int practiceTime, String songName) {
		this.musicianName = musicianName;
		this.songName = songName;
		this.practiceTime = practiceTime; // in seconds
	}

	// Getter and setters 
	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public int getPracticeTime() {
		return practiceTime;
	}

	public void setPracticeTime(int practiceTime) {
		this.practiceTime = practiceTime;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public void run() {
		System.out.println(musicianName + " started practicing the song " + songName);
		try {
			Thread.sleep(practiceTime * 1000L); //to milliseconds
		} catch (InterruptedException e) {
			System.out.println(musicianName + " was interrupted while practicing");
		}
		counter++;

		System.out.println(musicianName + " finished practicing " + getSongName() + " for " + counter + " times");
	}

	public static void main(String[] args) {
		MultipleThreadMusicianCounter musician = new MultipleThreadMusicianCounter("Pepe", 1, "Autorretrato, Extremoduro");

		// Create 99 threads
		for (int i = 1; i <= 99; i++) {
			Thread thread = new Thread(musician);
			thread.start();
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Total practices completed: " + counter);
	}
}
