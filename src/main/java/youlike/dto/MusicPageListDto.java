package youlike.dto;

import java.util.List;

public class MusicPageListDto {
    private int currentpage;
    private int pagesize;
    private List<MusicDto> musicList;

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public List<MusicDto> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<MusicDto> musicList) {
        this.musicList = musicList;
    }
}
