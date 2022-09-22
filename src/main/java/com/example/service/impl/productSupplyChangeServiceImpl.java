package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.productSupplyChange;
import com.example.mapper.productSupplyChangeMapper;
import com.example.service.productSupplyChangeService;
import org.springframework.stereotype.Service;

@Service
public class productSupplyChangeServiceImpl extends ServiceImpl<productSupplyChangeMapper, productSupplyChange> implements productSupplyChangeService {
}
