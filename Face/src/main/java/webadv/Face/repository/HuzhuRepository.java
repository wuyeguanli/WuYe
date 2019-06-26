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

import webadv.Face.entity.Huzhu;

@Mapper
public interface HuzhuRepository {

	@Results(id = "HuzhuMap", value = { @Result(property = "address", column = "address"),
			@Result(property = "name", column = "name"), @Result(property = "tel", column = "tel"),
			@Result(property = "id", column = "id", jdbcType = JdbcType.INTEGER) })

	@Select("select * from huzhu")
	public List<Huzhu> findAll();

	@Insert("insert into huzhu value (#{address},#{name},#{tel},${id})")
	public boolean Adduser(@Param("address") String address, @Param("name") String name, @Param("tel") String tel,
			@Param("id") int id);

	@Delete("delete from huzhu where address=#{address}")
	public void deleteUser(@Param("address") String address);

	@Update("update  huzhu set name=#{name} ,tel=#{tel} ,id=${id} where address=#{address}")
	public int updateUser(@Param("address") String address, @Param("name") String name, @Param("tel") String tel,
			@Param("id") int id);
}
