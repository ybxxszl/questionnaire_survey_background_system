package com.vo;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.account
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.name
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_id
     *
     * @return the value of admin.admin_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_id
     *
     * @param adminId the value for admin.admin_id
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.account
     *
     * @return the value of admin.account
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.account
     *
     * @param account the value for admin.account
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.name
     *
     * @return the value of admin.name
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.name
     *
     * @param name the value for admin.name
     *
     * @mbggenerated Thu Apr 12 09:03:13 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}