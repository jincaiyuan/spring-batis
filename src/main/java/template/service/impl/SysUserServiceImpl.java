package template.service.impl;

import org.springframework.stereotype.Service;
import template.mapper.SysUserMapper;
import template.model.SysUser;
import template.service.SysUserService;
import template.service.entity.SysUserServiceEntity;
import template.service.util.EntityUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    public List<SysUserServiceEntity> selectAllUsers() {
        List<SysUser> sysUsers = sysUserMapper.selectAllUsers();
        List<SysUserServiceEntity> sysUserServiceEntities = new ArrayList<SysUserServiceEntity>(sysUsers.size());
        for(SysUser user: sysUsers) {
            SysUserServiceEntity userServiceEntity = EntityUtil.modelConvertToServiceEntity(user);
            sysUserServiceEntities.add(userServiceEntity);
        }
        return sysUserServiceEntities;
    }

    public SysUserServiceEntity selectUserByName(String name) {
        SysUser user = sysUserMapper.selectUserByName(name);
        return EntityUtil.modelConvertToServiceEntity(user);
    }
}
