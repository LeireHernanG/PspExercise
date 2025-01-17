package pspEjercicio2;

// Class implementing Runnable to represent a Pet eating
class MusicianPractice implements Runnable {
    private String musicianName;
    private int practiceTime;
    private String songName;
    
    public MusicianPractice(String musicianName, int practiceTime,String songName) {
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
}

