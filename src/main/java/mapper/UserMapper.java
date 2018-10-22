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
    user getUserById(Integer id);

    public List<user> getUserList();

    public int add(user user);

    public int update(@Param("id") Integer id, @Param("user") user user);

    public int delete(Integer id);
}
