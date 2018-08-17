package com.zishenmanong.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods {

   @Id
   @GeneratedValue
   @Column(name="ID")
    private Integer  id;
    @Column(name="GOODS_NAME")
    private String goodsName;
    @Column(name="GOODS_BRAND")
    private String goodsBrand;
    @Column(name="GOODS_PRICE")
    private String goodsPrice;
    @Column(name="GOODS_PLACE")
    private String goodsPlace;

    public Goods() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsBrand='" + goodsBrand + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsPlace='" + goodsPlace + '\'' +
                '}';
    }
}
