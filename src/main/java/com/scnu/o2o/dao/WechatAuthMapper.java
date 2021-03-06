package com.scnu.o2o.dao;

import com.scnu.o2o.domain.WechatAuth;
import com.scnu.o2o.domain.WechatAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int countByExample(WechatAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int deleteByExample(WechatAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int deleteByPrimaryKey(Integer wechatAuthId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int insert(WechatAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int insertSelective(WechatAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    List<WechatAuth> selectByExample(WechatAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    WechatAuth selectByPrimaryKey(Integer wechatAuthId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") WechatAuth record, @Param("example") WechatAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByExample(@Param("record") WechatAuth record, @Param("example") WechatAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByPrimaryKeySelective(WechatAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wechat_auth
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByPrimaryKey(WechatAuth record);
}