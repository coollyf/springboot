package mapper;

import com.busy.model.SysRolePermission;
import java.util.List;

public interface SysRolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated
     */
    int insert(SysRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated
     */
    List<SysRolePermission> selectAll();
}