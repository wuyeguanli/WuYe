package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Gonggao;


@Mapper
public interface GonggaoRepository {
	
	@Results(id="GonggaoMap", value={ 
			@Result(property = "id", column = "id", jdbcType=JdbcType.INTEGER),
		    @Result(property = "Title", column = "Title"), 
		    @Result(property = "Notice", column = "Notice"),
		    @Result(property = "Time", column = "Time"),
		    @Result(property = "Publisher", column = "Publisher"), 
			})

			@Select("select * from gonggao") 
			public List<Gonggao> findAll();
			
	@Select("select * from gonggao where id=#{id} ")
	@ResultMap(value="GonggaoMap")
	public Gonggao validGonggaotitle(@Param("id")String id);
	
	@Select("select * from gonggao where time like '%${time}%'")
    public List<Gonggao> findtime(@Param("time")String time);
	
	@Insert("insert into gonggao(id,Title,Notice,time,Publisher) values(${id},#{Title},#{Notice},#{time},#{Publisher}) ") 
	public int Insert(@Param("id")int id,@Param("Title")String Title,@Param("Notice")String Notice,@Param("time")String time,@Param("Publisher")String Publisher);    
	
	@Delete("delete from gonggao where id = ${id}")
    public int delid(@Param("id")int id);
	
	@Update("update  gonggao set Title =#{Title},Notice =#{Notice},Time =#{Time},Publisher =#{Publisher} where  id = ${id}")
    public int update(@Param("id")int id,@Param("Title")String Title,@Param("Notice")String Notice,@Param("Time")String Time,@Param("Publisher")String Publisher);
			
		}
