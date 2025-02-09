package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.DepotEx;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepotMapperEx {

    List<DepotEx> selectByConditionDepot(
            @Param("name") String name,
            @Param("type") Integer type,
            @Param("remark") String remark,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByDepot(
            @Param("name") String name,
            @Param("type") Integer type,
            @Param("remark") String remark);

    int batchDeleteDepotByIds(@Param("updateTime") Date updateTime, @Param("updater") Long updater, @Param("ids") String ids[]);
}