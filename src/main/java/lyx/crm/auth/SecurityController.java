/**
 * Copyright liangyx liang_cmwn@163.com
 */
package lyx.crm.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lyx.common.web.ActionResult;

/**
 * basic security 
 * @author liangyx
 *
 */
@RestController
public class SecurityController {

	@RequestMapping(path="/login", method=RequestMethod.POST)
	ActionResult login(HttpServletRequest request) {
		return ActionResult.success(null, "Login Success");
	}
	
	
}
