/**
 * JDBC Assignment1
 */
package com.metacube.jdbc.example;

public class Titles {
	String title_nm;
	int title_id;
	/**
	 * @return the title_nm
	 */
	public String getTitle_nm() {
		return title_nm;
	}

	/**
	 * @param title_nm the title_nm to set
	 */
	public void setTitle_nm(String title_nm) {
		this.title_nm = title_nm;
	}

	
	/**
	 * @return the title_id
	 */
	public int getTitle_id() {
		return title_id;
	}

	/**
	 * @param title_id the title_id to set
	 */
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "titles [title_nm=" + title_nm + "]";
	}
	
}
