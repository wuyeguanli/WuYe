package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Feiyong;

@Mapper
public interface FeiyongRepository {
	
	@Results(id="FeiyongMap", value={ 
		    @Result(property = "address", column = "address"), 
		    @Result(property = "property", column = "property",jdbcType=JdbcType.INTEGER),
		    @Result(property = "parking", column = "parking",jdbcType=JdbcType.INTEGER),
		    @Result(property = "repair", column = "repair",jdbcType=JdbcType.INTEGER),
		    @Result(property = "water", column = "water",jdbcType=JdbcType.INTEGER),
		    @Result(property = "electric", column = "electric",jdbcType=JdbcType.INTEGER),
		    @Result(property = "gas", column = "gas",jdbcType=JdbcType.INTEGER)
			})

			@Select("select * from feiyong") 
			public List<Feiyong> findAll();
			

		}
