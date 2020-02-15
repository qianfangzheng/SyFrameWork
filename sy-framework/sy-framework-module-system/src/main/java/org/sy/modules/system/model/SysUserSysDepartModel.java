package org.sy.modules.system.model;

import lombok.Data;
import org.sy.modules.system.entity.SysDepart;
import org.sy.modules.system.entity.SysUser;

/**
 * 包含 SysUser 和 SysDepart 的 Model
 *
 * @author sunjianlei
 */
@Data
public class SysUserSysDepartModel {

    private SysUser sysUser;
    private SysDepart sysDepart;

}
