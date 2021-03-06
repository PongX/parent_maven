package com.itheima.services;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id){
        return itemsDao.findById(id);
    }

}
