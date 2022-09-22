package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.productVersionChange;
import com.example.mapper.productVersionChangeMapper;
import com.example.service.productVersionChangeService;
import org.springframework.stereotype.Service;

@Service
public class productVersionChangeServiceImpl extends ServiceImpl<productVersionChangeMapper, productVersionChange> implements productVersionChangeService {
}
