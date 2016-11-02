/**
 * 
 */
package lyx.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
	
	int update(Customer obj);
	
	int delete(Long id);
}
