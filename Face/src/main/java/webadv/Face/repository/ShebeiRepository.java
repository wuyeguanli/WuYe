package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Shebei;

@Mapper
public interface ShebeiRepository {
	
	@Results(id="ShebeiMap", value={ 
			@Result(property = "id", column = "id",jdbcType=JdbcType.INTEGER),
		    @Result(property = "name", column = "name"), 		   
		    @Result(property = "num", column = "num"),
		    @Result(property = "state", column = "state"),
			})
			@Select("select * from shebei") 
			public List<Shebei> findAll();
			
	@Insert("insert into shebei(id,name,num,state) values(${id},#{name},#{num},#{state})") 
	public int Insert(@Param("id")int id,@Param("name")String name,@Param("num")String num,@Param("state")String state);    
	
	@Delete("delete from shebei where id = ${id}")
    public int delid(@Param("id")int id);
	
	@Update("update shebei set name =#{name},num =#{num},state =#{state} where  id = ${id}")
    public int update(@Param("id")int id,@Param("name")String name,@Param("num")String num,@Param("state")String state);
			
		}
