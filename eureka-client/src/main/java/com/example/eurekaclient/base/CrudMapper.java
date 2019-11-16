package com.example.eurekaclient.base;

/**
 * 基础增删改查功能mapper
 * @author wzq
 */
public interface CrudMapper<T> extends InsertMapper<T>, DeleteMapper<T>, UpdateMapper<T>, SelectMapper<T>{
}