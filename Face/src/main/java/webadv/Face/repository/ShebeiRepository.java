package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Shebei;

@Mapper
public interface ShebeiRepository {
	
	@Results(id="ShebeiMap", value={ 
		    @Result(property = "name", column = "name"), 		   
		    @Result(property = "num", column = "num",jdbcType=JdbcType.INTEGER)  
			})

			@Select("select * from shebei") 
			public List<Shebei> findAll();
			

		}
