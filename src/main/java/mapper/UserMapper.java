package mapper;

import com.busy.user;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    user getUserById(Integer id);

    @Select("SELECT * FROM user")
    public List<user> getUserList();

    @Insert("insert into user(username, age, ctm) values(#{username}, #{age}, now())")
    public int add(user user);

    @Update("UPDATE user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
    public int update(@Param("id") Integer id, @Param("user") user user);

    @Delete("DELETE from user where id = #{id} ")
    public int delete(Integer id);
}
