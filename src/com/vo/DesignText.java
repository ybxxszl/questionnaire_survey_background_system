package com.vo;

public class DesignText {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_text.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String designTextId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_text.design_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String designTextContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_text.design_text_id
     *
     * @return the value of design_text.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getDesignTextId() {
        return designTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_text.design_text_id
     *
     * @param designTextId the value for design_text.design_text_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDesignTextId(String designTextId) {
        this.designTextId = designTextId == null ? null : designTextId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_text.design_text_content
     *
     * @return the value of design_text.design_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getDesignTextContent() {
        return designTextContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_text.design_text_content
     *
     * @param designTextContent the value for design_text.design_text_content
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setDesignTextContent(String designTextContent) {
        this.designTextContent = designTextContent == null ? null : designTextContent.trim();
    }
}