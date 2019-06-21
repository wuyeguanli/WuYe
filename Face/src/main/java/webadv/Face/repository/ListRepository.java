package webadv.Face.repository;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.JdbcType;
import java.util.List;

import webadv.Face.entity.Chewei;
import webadv.Face.entity.CostList;

@Mapper
public interface ListRepository {
	@Results(id="ListMap", value={ 
		    @Result(property = "id", column = "id"),
		    @Result(property = "num", column = "num"),
		    @Result(property = "result", column = "result"),
		    @Result(property = "time", column = "time"),
			})
	
	@Insert("insert into list(id,num,result,time) values(${id},#{num},#{result},#{time}) ") 
	public int Insert(@Param("id")int id,@Param("num")String num,@Param("result")String result,@Param("time")String time);
			

	@Select("select * from list") 
	public List<CostList> findAll();


}
