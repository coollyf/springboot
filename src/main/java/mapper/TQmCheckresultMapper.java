package mapper;

import com.busy.model.TQmCheckresult;
import java.util.List;

public interface TQmCheckresultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_checkresult
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String inspectionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_checkresult
     *
     * @mbg.generated
     */
    int insert(TQmCheckresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_checkresult
     *
     * @mbg.generated
     */
    TQmCheckresult selectByPrimaryKey(String inspectionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_checkresult
     *
     * @mbg.generated
     */
    List<TQmCheckresult> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_checkresult
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TQmCheckresult record);
}