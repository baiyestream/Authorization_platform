package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.operator;
import com.example.mapper.operatorMapper;
import com.example.service.operatorService;
import org.springframework.stereotype.Service;

@Service
public class operatorServiceImpl extends ServiceImpl<operatorMapper, operator> implements operatorService {
}
