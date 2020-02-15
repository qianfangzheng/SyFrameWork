package org.sy.common.system.base.service.impl;

import org.sy.common.system.base.entity.SyEntity;
import org.sy.common.system.base.service.SyService;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: ServiceImpl基类
 * @Author: dangzhenghui@163.com
 * @Date: 2019-4-21 8:13
 * @Version: 1.0
 */
@Slf4j
public class SyServiceImpl<M extends BaseMapper<T>, T extends SyEntity> extends ServiceImpl<M, T> implements SyService<T> {

}
