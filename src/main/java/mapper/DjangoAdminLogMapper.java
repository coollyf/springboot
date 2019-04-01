package mapper;

import com.busy.model.DjangoAdminLog;
import java.util.List;

public interface DjangoAdminLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_admin_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_admin_log
     *
     * @mbg.generated
     */
    int insert(DjangoAdminLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_admin_log
     *
     * @mbg.generated
     */
    DjangoAdminLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_admin_log
     *
     * @mbg.generated
     */
    List<DjangoAdminLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_admin_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DjangoAdminLog record);
}