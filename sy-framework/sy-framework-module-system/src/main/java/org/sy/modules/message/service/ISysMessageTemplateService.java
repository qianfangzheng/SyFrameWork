package org.sy.modules.message.service;

import java.util.List;

import org.sy.common.system.base.service.SyService;
import org.sy.modules.message.entity.SysMessageTemplate;

/**
 * @Description: 消息模板
 * @Author: sy-framework
 * @Date:  2019-04-09
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends SyService<SysMessageTemplate> {
    List<SysMessageTemplate> selectByCode(String code);
}
