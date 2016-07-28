/**
 * Created by diana on 7/28/16.
 */
public class Main {

    public static void main(String[] args) {

        Song song = new Song("Song name", "song description", 2016);
        song.displaySongInfo();
        SongGroup songGroup = new SongGroup("Group Name", " Group Description");
        songGroup.add(song);
        MusicDisk musicDisk = new MusicDisk(songGroup);
        musicDisk.getSongList();
    }
}
