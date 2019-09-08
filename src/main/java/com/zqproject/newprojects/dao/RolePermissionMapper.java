package com.zqproject.newprojects.dao;

import com.zqproject.newprojects.pojo.RolePermissionKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);

	List<RolePermissionKey> findByRole(int roleId);
}