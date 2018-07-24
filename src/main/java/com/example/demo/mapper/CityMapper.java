package com.example.demo.mapper;

import com.example.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM CITY WHERE state = #{state}")
    City findByState(@Param("state") String state);

}
