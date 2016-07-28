/**
 * Created by diana on 7/28/16.
 */
public class MusicDisk {

    SongComponent songList;

    public MusicDisk(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){

        songList.displaySongInfo();
    }

}
