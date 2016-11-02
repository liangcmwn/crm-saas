/**
 * Copyright liangyx liang_cmwn@163.com
 */
package lyx.crm.partner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lyx.common.web.ActionResult;
import lyx.crm.dao.CustomerMapper;

/**
 * Consumer Actions
 * 
 * @author liangyx
 *
 */
@RestController
@RequestMapping("/consumers")
public class ConsumerController {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@RequestMapping
	ActionResult list() {
		return ActionResult.success(customerMapper.list());
	}

	@RequestMapping("/{id}")
	ActionResult get(@PathVariable Long id) {
		//TODO
		return ActionResult.success(id);
	}

	@RequestMapping(method=RequestMethod.POST)
	ActionResult create(Long id) {
		//TODO
		return ActionResult.success(id);
	}

	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	ActionResult update(Long id) {
		//TODO
		return ActionResult.success(id);
	}


	@RequestMapping(method=RequestMethod.DELETE)
	ActionResult delete(@RequestParam Long[] ids) {
		//TODO
		return ActionResult.success(ids);
	}
}
