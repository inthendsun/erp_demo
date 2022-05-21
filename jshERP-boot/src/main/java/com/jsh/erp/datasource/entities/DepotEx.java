package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Description
 *
 * @Author: cjl
 * @Date: 2019/2/25 11:40
 */
@Data
public class DepotEx extends Depot{
    //负责人名字
    private String principalName;

    private BigDecimal initStock;

    private BigDecimal currentStock;

    private BigDecimal lowSafeStock;

    private BigDecimal highSafeStock;

}
