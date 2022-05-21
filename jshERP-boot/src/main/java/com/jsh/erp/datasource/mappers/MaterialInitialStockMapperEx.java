package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialInitialStock;
import java.util.List;

public interface MaterialInitialStockMapperEx {

    int batchInsert(List<MaterialInitialStock> list);

}