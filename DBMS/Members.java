/**
 * JDBC Assignment2
 */
package com.metacube.jdbc.example;

public class Members {
	String member_nm;
	int member_id;
	/**
	 * @return the member_nm
	 */
	public String getMember_nm() {
		return member_nm;
	}

	/**
	 * @param member_nm the member_nm to set
	 */
	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}
	
	
	/**
	 * @return the member_id
	 */
	public int getMember_id() {
		return member_id;
	}

	/**
	 * @param member_id the member_id to set
	 */
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Members [member_nm=" + member_nm + "]";
	}
	
	
}
