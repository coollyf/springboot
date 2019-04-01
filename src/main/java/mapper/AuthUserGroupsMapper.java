package mapper;

import com.busy.model.AuthUserGroups;
import java.util.List;

public interface AuthUserGroupsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_groups
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_groups
     *
     * @mbg.generated
     */
    int insert(AuthUserGroups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_groups
     *
     * @mbg.generated
     */
    AuthUserGroups selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_groups
     *
     * @mbg.generated
     */
    List<AuthUserGroups> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_groups
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthUserGroups record);
}