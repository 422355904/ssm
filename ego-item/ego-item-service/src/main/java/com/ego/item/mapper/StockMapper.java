package com.ego.item.mapper;

import com.ego.item.pojo.Stock;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author TheKing
 * @Date 2019/9/27 13:59
 * @Version 1.0
 * ⊰愤怒，并不会使你变强⊱
 */
public interface StockMapper extends Mapper<Stock>, SelectByIdListMapper<Stock,Long> {

}
