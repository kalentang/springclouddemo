package cloud.kms.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cloud.kms.service.domain.Student;

@Mapper
public interface StudentMapper {

	@Select("select id, age, name,score from student")
	List<Student> findStudentList();
}
