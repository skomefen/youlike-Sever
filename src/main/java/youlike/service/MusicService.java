package youlike.service;

import youlike.dto.MusicDto;
import youlike.dto.MusicPageListDto;

public interface MusicService {

    public MusicPageListDto getMusicListDto(int pagenum,int pagesize);

    public MusicDto finMusicById(String id);
}
