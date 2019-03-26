package mapper;

import com.busy.user;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
@Mapper
public interface UserMapper {
    user getUserById(Integer id);

    public List<user> getUserList();

    public int add(user user);

    public int update(@Param("id") Integer id, @Param("user") user user);

    public int delete(Integer id);
}
