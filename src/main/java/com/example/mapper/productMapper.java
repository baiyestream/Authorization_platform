package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface productMapper extends BaseMapper<product> {
}
