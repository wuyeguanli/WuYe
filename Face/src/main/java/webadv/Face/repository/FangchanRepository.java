package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Fangchan;

@Mapper
public interface FangchanRepository {
	
	@Results(id="FangchanMap", value={ 
		    @Result(property = "address", column = "address"), 
		    @Result(property = "size", column = "size",jdbcType=JdbcType.INTEGER),
		    @Result(property = "state", column = "state"),
		    @Result(property = "specifications", column = "specifications")
			})

			@Select("select * from fangchan") 
			public List<Fangchan> findAll();
			

		}
