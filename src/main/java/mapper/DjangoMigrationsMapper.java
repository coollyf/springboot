package mapper;

import com.busy.model.DjangoMigrations;
import java.util.List;

public interface DjangoMigrationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_migrations
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_migrations
     *
     * @mbg.generated
     */
    int insert(DjangoMigrations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_migrations
     *
     * @mbg.generated
     */
    DjangoMigrations selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_migrations
     *
     * @mbg.generated
     */
    List<DjangoMigrations> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_migrations
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DjangoMigrations record);
}