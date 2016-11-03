/**
 * 
 */
package lyx.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import lyx.crm.entity.Customer;

/**
 * mybatis Query for Customer 
 * @author liangyx
 *
 */
@Mapper
public interface CustomerMapper {

	@Select("SELECT * FROM Customer")
	List<Customer> list();
	
	@Select("SELECT * FROM CUSTOMER WHERE id = #{id}")
	Customer find(@Param("id") Long id);
	
	@Insert("INSERT INTO CUSTOMER(id, codeSN, name) VALUES (#{id}, #{codeSN}, #{name})")
	void create(Customer obj);

	@Update("UPDATE CUSTOMER SET codeSN = #{codeSN}, name = #{name}) where id = #{id}")
	int update(Customer obj);

	@Delete("DELETE CUSTOMER where id = #{id}")
	int delete(Long id);
}
