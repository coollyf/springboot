package mapper;

import com.busy.model.TestmodelTest;
import java.util.List;

public interface TestmodelTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testmodel_test
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testmodel_test
     *
     * @mbg.generated
     */
    int insert(TestmodelTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testmodel_test
     *
     * @mbg.generated
     */
    TestmodelTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testmodel_test
     *
     * @mbg.generated
     */
    List<TestmodelTest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table testmodel_test
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TestmodelTest record);
}