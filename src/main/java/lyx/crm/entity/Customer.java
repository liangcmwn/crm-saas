/**
 * Copyright liangyx liang_cmwn@163.com
 */
package lyx.crm.entity;

/**
 * @author liangyx
 *
 */
public class Customer {
	
	private Long id;
	private String codeSN;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeSN() {
		return codeSN;
	}
	public void setCodeSN(String codeSN) {
		this.codeSN = codeSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
