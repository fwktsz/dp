package com.laok.dp.structural.decorator.old.parkfee.pay;

import java.math.BigDecimal;

/**
 * @author k 2022/8/22 20:52
 */
public interface PayItem {

    BigDecimal getMoney();

    PayGroup getPayGroup();

    PayType getPayType();


}
