package template.service.util;

import template.model.SysUser;
import template.service.entity.SysUserServiceEntity;

public class EntityUtil {

    public static SysUserServiceEntity modelConvertToServiceEntity(SysUser user) {
        SysUserServiceEntity userServiceEntity = new SysUserServiceEntity();
        userServiceEntity.setId(user.getId());
        userServiceEntity.setName(user.getUserName());
        userServiceEntity.setPassword(user.getUserPassword());
        userServiceEntity.setEmail(user.getUserEmail());
        userServiceEntity.setCreateDate(user.getCreateTime());
        userServiceEntity.setUserInfo(user.getUserInfo());
        return userServiceEntity;
    }
}
