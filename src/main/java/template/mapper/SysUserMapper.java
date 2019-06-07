package template.mapper;

import template.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    List<SysUser> selectAllUsers();

    SysUser selectUserByName(String name);
}