package com.lexi.ren.service;

import com.lexi.ren.dao.ITravellerDao;
import com.lexi.ren.model.Traveller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ITravellerService {
    List<Traveller> findByOrderId(int orderId);
}
