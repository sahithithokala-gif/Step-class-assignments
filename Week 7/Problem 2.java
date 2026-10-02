import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int count;

    public Playlist(int capacity) {
        this.songs = new String[capacity];
        this.count = 0;
    }

    public void addSong(String song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }

    public String[] getSongs() {
        // Return a defensive copy containing only added songs
        return Arrays.copyOf(songs, count);
    }

    public int getSongCount() {
        return count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked"; // Attempting to modify external copy

        System.out.println("Copy[0]: " + copy[0]);
        System.out.println("Original playlist song 0: " + p.getSongs()[0]); // Still "Song A"
        System.out.println("Song count: " + p.getSongCount()); // 2
    }
}