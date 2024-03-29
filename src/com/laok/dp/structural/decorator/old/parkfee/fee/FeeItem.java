package com.laok.dp.structural.decorator.old.parkfee.fee;

import java.math.BigDecimal;

/**
 * @author k 2022/8/22 20:27
 */
public interface FeeItem<o> {

    BigDecimal getFeeItemOriginMoney();

    FeeItemType getFeeItemType();

    o getOrderInfo();

}
