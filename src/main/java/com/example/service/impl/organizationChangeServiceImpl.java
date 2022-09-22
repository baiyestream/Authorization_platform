package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.organizationChange;
import com.example.mapper.organizationChangeMapper;
import com.example.service.organizationChangeService;
import org.springframework.stereotype.Service;

@Service
public class organizationChangeServiceImpl extends ServiceImpl<organizationChangeMapper, organizationChange> implements organizationChangeService {
}
