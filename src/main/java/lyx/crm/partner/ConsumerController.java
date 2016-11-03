/**
 * Copyright liangyx liang_cmwn@163.com
 */
package lyx.crm.partner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lyx.common.web.ActionResult;
import lyx.crm.dao.CustomerMapper;
import lyx.crm.entity.Customer;

/**
 * Consumer Actions
 * 
 * @author liangyx
 *
 */
@RestController
@RequestMapping("/crm/customers")
public class ConsumerController {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@RequestMapping
	ActionResult list() {
		return ActionResult.success(customerMapper.list());
	}

	@RequestMapping("/{id}")
	ActionResult get(@PathVariable Long id) {
		return ActionResult.success(customerMapper.find(id));
	}

	@RequestMapping(method=RequestMethod.POST)
	ActionResult create(@RequestBody Customer customer) {
		customerMapper.create(customer);
		return ActionResult.success(customer.getId());
	}

	@RequestMapping(method=RequestMethod.PUT)
	ActionResult update(@RequestBody Customer customer) {
		customerMapper.update(customer);
		return ActionResult.success(customer.getId());
	}


	@RequestMapping(method=RequestMethod.DELETE)
	ActionResult delete(@RequestParam Long[] ids) {
		//TODO
		return ActionResult.success(ids);
	}
}
