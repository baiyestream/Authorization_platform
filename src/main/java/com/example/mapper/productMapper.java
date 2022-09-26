package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface productMapper extends BaseMapper<Product> {
}
