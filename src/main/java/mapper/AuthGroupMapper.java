package mapper;

import com.busy.model.AuthGroup;
import java.util.List;

public interface AuthGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_group
     *
     * @mbg.generated
     */
    int insert(AuthGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_group
     *
     * @mbg.generated
     */
    AuthGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_group
     *
     * @mbg.generated
     */
    List<AuthGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthGroup record);
}