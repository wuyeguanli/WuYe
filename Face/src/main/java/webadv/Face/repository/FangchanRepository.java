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

import webadv.Face.entity.Fangchan;

@Mapper
public interface FangchanRepository {

	@Results(id = "FangchanMap", value = { @Result(property = "address", column = "address"),
			@Result(property = "size", column = "size"),
			@Result(property = "state", column = "state"),
			@Result(property = "specifications", column = "specifications") })

	@Select("select * from fangchan")
	public List<Fangchan> findAll();

	@Select("insert into fangchan value (#{address},#{size},#{state},#{specifications})")
	@ResultMap(value = "FangchanMap")
	public List<Fangchan> Addhouse(@Param("address") String address, @Param("size") String size,
			@Param("state") String state, @Param("specifications") String specifications);

	@Delete("delete from fangchan where address=#{address}")
	public void deletehouse(@Param("address") String address);
	
	@Update("update  fangchan set size=#{size} ,state=#{state} ,specifications=#{specifications} where address=#{address}")
	public int updatehouse(@Param("address") String address, @Param("size") String size,
			@Param("state") String state, @Param("specifications") String specifications);

}
