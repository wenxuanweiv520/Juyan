package com.dao;

import com.model.Merchant;
import com.model.MerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int countByExample(MerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int deleteByExample(MerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String merchantNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int insert(Merchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int insertSelective(Merchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    List<Merchant> selectByExample(MerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    Merchant selectByPrimaryKey(String merchantNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Merchant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Merchant record);
}