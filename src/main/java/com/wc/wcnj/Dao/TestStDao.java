package com.wc.wcnj.Dao;

import com.wc.wcnj.entity.TestSt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestStDao {
    @Results({ //2
            @Result(property = "loginName", column = "loginname"), //2
            @Result(property = "password", column = "password")
    })
    @Select("SELECT * FROM TestSt")
    List<TestSt> getfind();
}
