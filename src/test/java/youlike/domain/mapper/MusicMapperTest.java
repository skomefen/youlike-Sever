package youlike.domain.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import youlike.Application;
import youlike.domain.entity.MusicPO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MusicMapperTest {

    @Autowired
    private MusicMapper musicMapper;

    @Test
    public void findById() {
        MusicPO musicPO = musicMapper.findById("1");
        Assert.assertEquals("Audrey%20Hepburn",musicPO.getAuthor());
    }
}