package youlike.domain.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import youlike.domain.entity.MusicPO;

@Mapper
public interface MusicMapper {

    @Select("select * from music where id = #{id}")
    public MusicPO findById(@Param("id") String id);

}
