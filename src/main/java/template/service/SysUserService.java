package template.service;

import template.service.entity.SysUserServiceEntity;

import java.util.List;

public interface SysUserService {

    List<SysUserServiceEntity> selectAllUsers();

    SysUserServiceEntity selectUserByName(String names);
}
