package com.dao;

import com.model.Brand;
import com.model.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int countByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int deleteByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int insert(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int insertSelective(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    List<Brand> selectByExample(BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    Brand selectByPrimaryKey(Integer brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Brand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Brand record);
}