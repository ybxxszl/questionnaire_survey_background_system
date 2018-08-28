package com.dao;

import com.vo.TextAnswer;
import com.vo.TextAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int countByExample(TextAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int deleteByExample(TextAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int deleteByPrimaryKey(String textAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int insert(TextAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int insertSelective(TextAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    List<TextAnswer> selectByExample(TextAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    TextAnswer selectByPrimaryKey(String textAnswerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") TextAnswer record, @Param("example") TextAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByExample(@Param("record") TextAnswer record, @Param("example") TextAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByPrimaryKeySelective(TextAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_answer
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByPrimaryKey(TextAnswer record);
}