package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Organization;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface organizationMapper extends BaseMapper<Organization> {

}
