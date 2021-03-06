package mapper;

import com.busy.model.AuthUser;
import java.util.List;

public interface AuthUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated
     */
    int insert(AuthUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated
     */
    AuthUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated
     */
    List<AuthUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthUser record);
}