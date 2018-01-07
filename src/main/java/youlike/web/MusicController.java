package youlike.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import youlike.dto.MusicDto;
import youlike.dto.MusicPageListDto;
import youlike.service.MusicService;

@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping(value = "/api/music/list", method = RequestMethod.GET)
    public MusicPageListDto list(@RequestParam int pagenum,@RequestParam int pagesize){

        return musicService.getMusicListDto(pagenum,pagesize);
    }

    @RequestMapping(value = "/api/music",method = RequestMethod.GET)
    public MusicDto getMusic(@RequestParam String id){
        return musicService.finMusicById(id);
    }
}
