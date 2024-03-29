package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Chewei;

@Mapper
public interface CheweiRepository {
	
	@Results(id="CheweiMap", value={ 
		    @Result(property = "id", column = "id",  jdbcType=JdbcType.INTEGER), 
		    @Result(property = "address", column = "address"),
		    @Result(property = "state", column = "state")
			})

			@Select("select * from chewei where id not in (select id from huzhu)  ") //共享车位
			public List<Chewei> findAll();
			
	
			@Select("select * from chewei where id in (select id from huzhu)  ") //个人车位
			public List<Chewei> findPer();
	
//			@Select("select * from chewei where id = #{id}")
//		    public List<Chewei> findID(@Param("id")int id);
			@Select("select * from chewei where id like '%${id}%'")	//车位状态查询
		    public List<Chewei> findID(@Param("id")int id);
			
			@Select("select * from chewei")	//车位状态查询
		    public List<Chewei> findAllMsg();
			
			@Delete("delete from chewei where  id = ${id}")	//车位删除
		    public int delID(@Param("id")int id);
			
			@Update("update  chewei set address =#{address},state =#{state} where  id = ${id}")	//车位状态管理
		    public int update(@Param("id")int id,@Param("address")String address,@Param("state")String state);
			
}
