package com.vo;

public class TextAnswer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text_answer.text_answer_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String textAnswerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text_answer.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String designTextId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column text_answer.text_answer_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String textAnswerContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text_answer.text_answer_id
     *
     * @return the value of text_answer.text_answer_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getTextAnswerId() {
        return textAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text_answer.text_answer_id
     *
     * @param textAnswerId the value for text_answer.text_answer_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setTextAnswerId(String textAnswerId) {
        this.textAnswerId = textAnswerId == null ? null : textAnswerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text_answer.design_text_id
     *
     * @return the value of text_answer.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getDesignTextId() {
        return designTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text_answer.design_text_id
     *
     * @param designTextId the value for text_answer.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDesignTextId(String designTextId) {
        this.designTextId = designTextId == null ? null : designTextId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column text_answer.text_answer_content
     *
     * @return the value of text_answer.text_answer_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getTextAnswerContent() {
        return textAnswerContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column text_answer.text_answer_content
     *
     * @param textAnswerContent the value for text_answer.text_answer_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setTextAnswerContent(String textAnswerContent) {
        this.textAnswerContent = textAnswerContent == null ? null : textAnswerContent.trim();
    }
}