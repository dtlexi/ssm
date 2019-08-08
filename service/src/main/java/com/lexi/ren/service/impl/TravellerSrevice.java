package com.lexi.ren.service.impl;

import com.lexi.ren.dao.ITravellerDao;
import com.lexi.ren.model.Traveller;
import com.lexi.ren.service.ITravellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravellerSrevice implements ITravellerService {
    @Autowired
    private ITravellerDao dao;

    public List<Traveller> findByOrderId(int orderId) {
        return dao.findByOrderId(orderId);
    }
}
