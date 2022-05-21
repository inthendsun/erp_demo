package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialCurrentStock;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialCurrentStockMapperEx {

    int batchInsert(List<MaterialCurrentStock> list);

    List<MaterialCurrentStock> getCurrentStockMapByIdList(
            @Param("materialIdList") List<Long> materialIdList);
}