package MusicianExercise;
//ececise for create a multiple threads from the same object

public class MultipleThreatMusician extends Thread {
	private String musicianName;
	private int practiceTime;
	private String songName;

	public MultipleThreatMusician(String musicianName, int practiceTime,String songName) {
		this.musicianName = musicianName;
		this.songName=songName;
		this.practiceTime = practiceTime;//in seconds
	}
	
//Getter and setters for the musicians
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
		System.out.println(musicianName + " started practicing the song "+songName);
		try {
			Thread.sleep(practiceTime * 1000L);//To convert seconds in milisecond
		} catch (InterruptedException e) {
			System.out.println(musicianName + " was interrupted while practicing");
		}
		System.out.println(musicianName + " finished practicing");
	}
	

	public static void main(String[] args) {
		MultipleThreatMusician m1=new MultipleThreatMusician("Pepe ",1,"Autorretrato,Extremoduro");
		m1.start();
		for(int i=0;i<100;i++) {
			System.out.println(m1.getMusicianName()+"is practicing the song "+m1.songName+" for "+m1.practiceTime+" seconds");
		}	
	}
}