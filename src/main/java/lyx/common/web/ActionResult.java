/**
 * Copyright liangyx liang_cmwn@163.com
 */
package lyx.common.web;

/**
 * web request result
 * @author liangyx
 *
 */
public class ActionResult {

	private Object data;
	private boolean hasErrors = false;
	private String errorCode;
	private String message;
	private String errorMessage;
	
	public ActionResult(boolean hasErrors, Object data, String message) {
		this.hasErrors = hasErrors;
		this.data = data;
		this.message = message;
	}

	public ActionResult(boolean hasErrors, String errorCode, String errorMessage) {
		this.hasErrors = hasErrors;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public static ActionResult success(Object data) {
		return new ActionResult(false, data, null);
	}
	
	public static ActionResult success(Object data, String message) {
		return new ActionResult(false, data, message);
	}

	public static ActionResult errorWithCode(String errorCode) {
		return new ActionResult(true, errorCode, null);
	}

	public static ActionResult errorWithMessage(String errorMessage) {
		return new ActionResult(true, null, null);
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public boolean isHasErrors() {
		return hasErrors;
	}
	public void setHasErrors(boolean hasErrors) {
		this.hasErrors = hasErrors;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
