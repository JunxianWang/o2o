package com.scnu.o2o.domain;

public class PhoneAuth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_phone_auth.phone_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Integer phoneAuthId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_phone_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_phone_auth.phone
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_phone_auth.auth_number
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private String authNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_phone_auth.phone_auth_id
     *
     * @return the value of tb_phone_auth.phone_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Integer getPhoneAuthId() {
        return phoneAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_phone_auth.phone_auth_id
     *
     * @param phoneAuthId the value for tb_phone_auth.phone_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setPhoneAuthId(Integer phoneAuthId) {
        this.phoneAuthId = phoneAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_phone_auth.user_id
     *
     * @return the value of tb_phone_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_phone_auth.user_id
     *
     * @param userId the value for tb_phone_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_phone_auth.phone
     *
     * @return the value of tb_phone_auth.phone
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_phone_auth.phone
     *
     * @param phone the value for tb_phone_auth.phone
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_phone_auth.auth_number
     *
     * @return the value of tb_phone_auth.auth_number
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public String getAuthNumber() {
        return authNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_phone_auth.auth_number
     *
     * @param authNumber the value for tb_phone_auth.auth_number
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }
}