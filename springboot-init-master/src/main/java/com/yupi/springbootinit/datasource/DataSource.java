package com.yupi.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 数据源接口（新接入的数据必须实现）
 * @param <T>
 */
public interface DataSource<T> {

    Page<T> doSearch(String searchText , long pageNum , long pageSize);
}
