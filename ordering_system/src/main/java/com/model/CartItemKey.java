package com.model;

public class CartItemKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.prod_no
     *
     * @mbggenerated
     */
    private String prodNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_item.sku
     *
     * @mbggenerated
     */
    private String sku;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.prod_no
     *
     * @return the value of cart_item.prod_no
     *
     * @mbggenerated
     */
    public String getProdNo() {
        return prodNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.prod_no
     *
     * @param prodNo the value for cart_item.prod_no
     *
     * @mbggenerated
     */
    public void setProdNo(String prodNo) {
        this.prodNo = prodNo == null ? null : prodNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_item.sku
     *
     * @return the value of cart_item.sku
     *
     * @mbggenerated
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_item.sku
     *
     * @param sku the value for cart_item.sku
     *
     * @mbggenerated
     */
    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}