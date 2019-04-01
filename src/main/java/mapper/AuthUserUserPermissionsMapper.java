package mapper;

import com.busy.model.AuthUserUserPermissions;
import java.util.List;

public interface AuthUserUserPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_user_permissions
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_user_permissions
     *
     * @mbg.generated
     */
    int insert(AuthUserUserPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_user_permissions
     *
     * @mbg.generated
     */
    AuthUserUserPermissions selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_user_permissions
     *
     * @mbg.generated
     */
    List<AuthUserUserPermissions> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_user_permissions
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthUserUserPermissions record);
}