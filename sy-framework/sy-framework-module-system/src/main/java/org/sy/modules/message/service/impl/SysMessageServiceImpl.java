package org.sy.modules.message.service.impl;

import org.sy.common.system.base.service.impl.SyServiceImpl;
import org.sy.modules.message.entity.SysMessage;
import org.sy.modules.message.mapper.SysMessageMapper;
import org.sy.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 * @Author: sy-framework
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends SyServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
