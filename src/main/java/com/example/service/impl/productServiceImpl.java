package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.product;
import com.example.mapper.productMapper;
import com.example.service.productService;
import org.springframework.stereotype.Service;

@Service
public class productServiceImpl extends ServiceImpl<productMapper, product> implements productService {
}
