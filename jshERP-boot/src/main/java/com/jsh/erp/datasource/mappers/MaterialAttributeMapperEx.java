package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialAttribute;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialAttributeMapperEx {

    List<MaterialAttribute> selectByConditionMaterialAttribute(
            @Param("attributeField") String attributeField,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByMaterialAttribute(
            @Param("attributeField") String attributeField);

    int batchDeleteMaterialAttributeByIds(
            @Param("ids") String ids[]);
}