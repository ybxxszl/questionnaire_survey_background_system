package com.dao;

import com.vo.DictSingleOption;
import com.vo.DictSingleOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictSingleOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int countByExample(DictSingleOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int deleteByExample(DictSingleOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int deleteByPrimaryKey(String dictSingleOptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int insert(DictSingleOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int insertSelective(DictSingleOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    List<DictSingleOption> selectByExample(DictSingleOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    DictSingleOption selectByPrimaryKey(String dictSingleOptionId);

    /*获取dict_single_option表中对应选项内容，并按照dictSingleOrder字段升序排序*/
    List<DictSingleOption> selectBydictSingleIdOrderbydictSingleOrder(String dictSingleId);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") DictSingleOption record, @Param("example") DictSingleOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByExample(@Param("record") DictSingleOption record, @Param("example") DictSingleOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByPrimaryKeySelective(DictSingleOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_single_option
     *
     * @mbggenerated Sun Mar 25 19:58:56 CST 2018
     */
    int updateByPrimaryKey(DictSingleOption record);
}