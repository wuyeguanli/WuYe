package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Huzhu;

@Mapper
public interface HuzhuRepository {
	
	@Results(id="HuzhuMap", value={ 
		    @Result(property = "address", column = "address",jdbcType=JdbcType.INTEGER), 		   
		    @Result(property = "name", column = "name"),  
		    @Result(property = "tel", column = "tel"), 
		    @Result(property = "id", column = "id",jdbcType=JdbcType.INTEGER)
			})

			@Select("select * from huzhu") 
			public List<Huzhu> findAll();
			
		}
