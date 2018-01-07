package youlike.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youlike.domain.entity.MusicPO;
import youlike.domain.mapper.MusicMapper;
import youlike.dto.MusicDto;
import youlike.dto.MusicPageListDto;
import youlike.service.MusicService;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private Mapper mapper;

    @Override
    public MusicPageListDto getMusicListDto(int pagenum, int pagesize) {
        MusicDto music1 = new MusicDto();
        music1.setId("aaa");
        music1.setAuthor("aaa");
        music1.setName("bbb");
        music1.setUrl("123456asd");

        MusicDto music2 = new MusicDto();
        music2.setId("aaa");
        music2.setAuthor("aaa");
        music2.setName("bbb");
        music2.setUrl("123456asd");

        List<MusicDto> musicList = new ArrayList<MusicDto>();
        musicList.add(music2);
        musicList.add(music1);

        MusicPageListDto list = new MusicPageListDto();
        list.setCurrentpage(pagenum);
        list.setPagesize(pagesize);
        list.setMusicList(musicList);
        return list;
    }

    @Override
    public MusicDto finMusicById(String id) {

        MusicPO musicPO = musicMapper.findById(id);

        MusicDto musicDto = mapper.map(musicPO,MusicDto.class);

        return musicDto;
    }
}
