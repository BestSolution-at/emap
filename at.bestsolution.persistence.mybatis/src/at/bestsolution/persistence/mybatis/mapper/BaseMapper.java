package at.bestsolution.persistence.mybatis.mapper;

import java.util.List;

public interface BaseMapper<O> {
	public O selectById(long sid);
	public List<O> selectAll();
}