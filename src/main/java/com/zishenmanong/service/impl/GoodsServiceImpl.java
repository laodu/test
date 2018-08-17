package com.zishenmanong.service.impl;

import com.zishenmanong.entity.Goods;
import com.zishenmanong.repository.GoodsRepository;
import com.zishenmanong.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {


    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getGoodsList() {
        List<Goods> list = (List<Goods>) goodsRepository.findAll();
        return list;
    }

    @Override
    public void deletete(Integer id) {
        goodsRepository.deleteById(id);

    }

    @Override
    public void add(Goods goods) {
        goodsRepository.save(goods);
    }

    @Override
    public Goods getGoodsByid(Integer id) {
        Goods goods =  goodsRepository.findById(id).get();
        return  goods;
    }

    @Override
    public Goods editGoodsById(Integer id) {
        Goods goods =  goodsRepository.findById(id).get();
        return goods;

    }
}
