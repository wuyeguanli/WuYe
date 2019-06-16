package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Gonggao;

@Mapper
public interface GonggaoRepository {
	
	@Results(id="GonggaoMap", value={ 
		    @Result(property = "Title", column = "Title"), 
		    @Result(property = "Notice", column = "Notice"),
		    @Result(property = "Datetime", column = "datetime",jdbcType=JdbcType.INTEGER),
		    @Result(property = "Publisher", column = "Publisher"),
		    
			})

			@Select("select * from gonggao") 
			public List<Gonggao> findAll();
			

		}
