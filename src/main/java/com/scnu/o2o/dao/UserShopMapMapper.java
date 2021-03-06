package com.scnu.o2o.dao;

import com.scnu.o2o.domain.UserShopMap;
import com.scnu.o2o.domain.UserShopMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShopMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int countByExample(UserShopMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int deleteByExample(UserShopMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int deleteByPrimaryKey(Integer userShopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int insert(UserShopMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int insertSelective(UserShopMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    List<UserShopMap> selectByExample(UserShopMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    UserShopMap selectByPrimaryKey(Integer userShopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserShopMap record, @Param("example") UserShopMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByExample(@Param("record") UserShopMap record, @Param("example") UserShopMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByPrimaryKeySelective(UserShopMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_shop_map
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    int updateByPrimaryKey(UserShopMap record);
}