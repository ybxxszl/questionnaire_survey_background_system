package com.vo;

public class DictText {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_text.dict_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String dictTextId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_text.dict_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String dictTextContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_text.dict_text_id
     *
     * @return the value of dict_text.dict_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getDictTextId() {
        return dictTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_text.dict_text_id
     *
     * @param dictTextId the value for dict_text.dict_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDictTextId(String dictTextId) {
        this.dictTextId = dictTextId == null ? null : dictTextId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_text.dict_text_content
     *
     * @return the value of dict_text.dict_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getDictTextContent() {
        return dictTextContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_text.dict_text_content
     *
     * @param dictTextContent the value for dict_text.dict_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDictTextContent(String dictTextContent) {
        this.dictTextContent = dictTextContent == null ? null : dictTextContent.trim();
    }
}