package com.dao;

import com.vo.CheckboxAnswer;
import com.vo.CheckboxAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckboxAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int countByExample(CheckboxAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int deleteByExample(CheckboxAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int deleteByPrimaryKey(String checkboxAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int insert(CheckboxAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int insertSelective(CheckboxAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    List<CheckboxAnswer> selectByExample(CheckboxAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    CheckboxAnswer selectByPrimaryKey(String checkboxAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") CheckboxAnswer record, @Param("example") CheckboxAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int updateByExample(@Param("record") CheckboxAnswer record, @Param("example") CheckboxAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int updateByPrimaryKeySelective(CheckboxAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkbox_answer
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    int updateByPrimaryKey(CheckboxAnswer record);
}