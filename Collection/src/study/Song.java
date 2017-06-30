package study;

public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", rating=" + rating + ", bpm=" + bpm + "]";
	}
	Song(String t, String a, String r, String b) {
		title = t; artist = a; rating = r; bpm = b;
	}
	public String getTitle(){return title;}
	public String getArtist(){return artist;}
	public String getRating(){return rating;}
	public String getBpm(){return bpm;}
	@Override
	public int compareTo(Song o) {
		return this.getArtist().compareTo(o.getArtist());
	}
	
}
