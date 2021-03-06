package com.lynn.framework.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.lynn.framework.entity.BaseEntity;
import com.lynn.framework.exception.DataCommitException;
import com.lynn.framework.mybatis.Sort;
import com.lynn.framework.mybatis.complexQuery.CustomQueryParam;

public interface BaseService<T extends BaseEntity> {
	
	public List<T> getAll();
	
	public T getById(String id);

	public int count(T params);

	public int countLike(T findParams);

    public int countQuery(List<CustomQueryParam> customQueryParams);

    public List<T> query(List<CustomQueryParam> customQueryParams);

    public List<T> query(List<CustomQueryParam> customQueryParams, Integer start, Integer limit, List<Sort> sortList);

	public List<T> find(T findParams, Integer start, Integer limit);
	
	public List<T> findByObj(T findParams);

	public void insert(T t) throws DataCommitException;
	
	public void insert(List<T> list) throws DataCommitException;

	void insertBatch(List<T> list) throws DataCommitException;

	public void deleteById(String id) throws DataCommitException;

	public void deleteById(List<String> list) throws DataCommitException;

	public void delete(T t) throws DataCommitException;

	public void delete(List<T> list) throws DataCommitException;

    public void deleteAll() throws DataCommitException;

	public void update(T t) throws DataCommitException;
	
	public void update(List<T> list) throws DataCommitException;

//    public void export(OutputStream outputStream, String sheetName, JSONArray columns,JSONObject queryFilter) throws IOException, WriteException, InvocationTargetException,
//            IllegalAccessException,
//            NoSuchMethodException;

    public List<T> findForExport(JSONObject jsonParams) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException;

    public int countForExport(JSONObject queryParams) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException;
    
    public List<T> getByObj(T findParams) ;


}
