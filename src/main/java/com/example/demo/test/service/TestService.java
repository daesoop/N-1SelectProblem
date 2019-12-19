package com.example.demo.test.service;

import com.example.demo.test.dao.ManyEntityDao;
import com.example.demo.test.dao.OneEntityDao;
import com.example.demo.test.domain.ManyEntity;
import com.example.demo.test.domain.OneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private OneEntityDao oneEntityDao;

    @Autowired
    private ManyEntityDao manyEntityDao;


    public void add() {
        System.out.println("add method is working?");
        OneEntity oneEntity = new OneEntity(1, "first OneEntitiy");
        oneEntityDao.save(oneEntity);
        OneEntity secEntity = new OneEntity(2, "second OneEntitiy");
        oneEntityDao.save(secEntity);
        OneEntity thrEntity = new OneEntity(3, "third OneEntitiy");
        oneEntityDao.save(thrEntity);
        OneEntity firEntity = new OneEntity(4, "fourth oneEntity");
        oneEntityDao.save(firEntity);

        ManyEntity firstManyEntity = new ManyEntity(1, "first ManyEntity", oneEntity);
        manyEntityDao.save(firstManyEntity);
        ManyEntity secondManyEntity = new ManyEntity(2, "second ManyEntity", secEntity);
        manyEntityDao.save(secondManyEntity);
        ManyEntity thirdManyEntity = new ManyEntity(3, "third ManyEntity", oneEntity);
        manyEntityDao.save(thirdManyEntity);
        ManyEntity fourManyEntity = new ManyEntity(4, "firth ManyEntity", firEntity);
        manyEntityDao.save(fourManyEntity);
    }

    public void one() {
        List<OneEntity> one = oneEntityDao.findAll();
        for (int i = 0; i < one.size(); i++) {
            for (int j = 0; j < one.get(i).getManyEntities().size(); j++) {
                System.out.println("test : " + one.get(i).getId());
                System.out.println(one.get(i).getManyEntities().get(j).getComment());
            }
        }
    }

    public void many() {
        List<ManyEntity> manyEntities = manyEntityDao.findAll();
    }
}
