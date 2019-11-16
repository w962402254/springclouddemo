package com.example.eurekaclient.base;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;
/**
 * 基础删除功能mapper
 * @author wzq
 */
public interface InsertMapper<T> extends Marker, BaseInsertMapper<T>, InsertSelectiveMapper<T>, MySqlMapper<T> {
}
