package mapper;

import com.busy.model.TQmTemplatedetail;
import java.util.List;

public interface TQmTemplatedetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_templatedetail
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_templatedetail
     *
     * @mbg.generated
     */
    int insert(TQmTemplatedetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_templatedetail
     *
     * @mbg.generated
     */
    TQmTemplatedetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_templatedetail
     *
     * @mbg.generated
     */
    List<TQmTemplatedetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_qm_templatedetail
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TQmTemplatedetail record);
}