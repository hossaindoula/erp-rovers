package com.erp.inventory.purchases.service;

import com.erp.inventory.purchases.dao.PurchasesDataDao;
import com.erp.inventory.purchases.model.PurchasesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/29/13
 * Time: 1:15 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchasesServiceImpl implements PurchasesService {
@Autowired

 private PurchasesDataDao purchasesDataDao;

    @Override
    public boolean save(PurchasesData price) {
        return purchasesDataDao.save(price);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PurchasesData> findAllPurchasesDataList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData get(int id) {
        return purchasesDataDao.get(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(PurchasesData price) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchasesData get(double price) {
        return purchasesDataDao.get(price);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
