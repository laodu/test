package com.zishenmanong.service;

import com.zishenmanong.entity.Goods;


import java.util.List;
import java.util.Optional;


public interface GoodsService {

  public List<Goods> getGoodsList();

  public void deletete(Integer id);

  public void add(Goods goo);

  public Goods getGoodsByid(Integer id);

  public  Goods editGoodsById(Integer id);
}
