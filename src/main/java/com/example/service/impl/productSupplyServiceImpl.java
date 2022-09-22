package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.productSupply;
import com.example.mapper.productSupplyMapper;
import com.example.service.productSupplyService;
import org.springframework.stereotype.Service;

@Service
public class productSupplyServiceImpl extends ServiceImpl<productSupplyMapper, productSupply> implements productSupplyService {
}

