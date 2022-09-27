package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.BusinessLicense;
import com.example.mapper.businessLicenseMapper;
import com.example.service.businessLicenseService;
import org.springframework.stereotype.Service;

@Service
public class businessLicenseServiceImpl extends ServiceImpl<businessLicenseMapper, BusinessLicense> implements businessLicenseService {
}
