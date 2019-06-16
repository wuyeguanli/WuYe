package webadv.Face.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.Face.entity.Chewei;

@Mapper
public interface CheweiRepository {
	
	@Results(id="CheweiMap", value={ 
		    @Result(property = "id", column = "id",  jdbcType=JdbcType.INTEGER), 
		    @Result(property = "address", column = "address"),
		    @Result(property = "state", column = "state")
			})

			@Select("select * from chewei") 
			public List<Chewei> findAll();
			
//			@Select("select * from t_teacher where teacher_account=#{account} and teacher_password=md5(#{password})")
//			@ResultMap(value="teacherMap")
//			public Chewei validChewei(@Param("account")String account,@Param("password")String password);
//			
//			@Select("select * from t_teacher where teacher_name like concat('%',#{name},'%')")
//			@ResultMap(value="teacherMap")			
//			public List<Chewei> findByState(@Param("state")String state);
		}
