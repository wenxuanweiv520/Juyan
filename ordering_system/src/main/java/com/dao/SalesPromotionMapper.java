package com.dao;

import com.model.SalesPromotion;
import com.model.SalesPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesPromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int countByExample(SalesPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int deleteByExample(SalesPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer promId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int insert(SalesPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int insertSelective(SalesPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    List<SalesPromotion> selectByExample(SalesPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    SalesPromotion selectByPrimaryKey(Integer promId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SalesPromotion record, @Param("example") SalesPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SalesPromotion record, @Param("example") SalesPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SalesPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_promotion
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SalesPromotion record);
}