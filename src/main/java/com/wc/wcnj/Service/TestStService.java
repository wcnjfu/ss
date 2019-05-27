package com.wc.wcnj.Service;

import com.wc.wcnj.Dao.TestStDao;
import com.wc.wcnj.entity.TestSt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestStService {
    @Autowired
    private TestStDao testStDao;
    public List<TestSt> getall(){
        List<TestSt> list=this.testStDao.getfind();
        return list;
    }
}
