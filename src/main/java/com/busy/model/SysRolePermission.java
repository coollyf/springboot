package com.busy.model;

import java.io.Serializable;

public class SysRolePermission implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.permission_id
     *
     * @mbg.generated
     */
    private Integer permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_permission
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.role_id
     *
     * @return the value of sys_role_permission.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.role_id
     *
     * @param roleId the value for sys_role_permission.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.permission_id
     *
     * @return the value of sys_role_permission.permission_id
     *
     * @mbg.generated
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.permission_id
     *
     * @param permissionId the value for sys_role_permission.permission_id
     *
     * @mbg.generated
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_permission
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}