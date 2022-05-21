package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.TenantEx;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenantMapperEx {

    List<TenantEx> selectByConditionTenant(
            @Param("loginName") String loginName,
            @Param("type") String type,
            @Param("enabled") String enabled,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByTenant(
            @Param("loginName") String loginName,
            @Param("type") String type,
            @Param("enabled") String enabled);
}