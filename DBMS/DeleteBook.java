/**
 * JDBC Assignment3
 */
package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Anjita
 * Delete all those books which were not issued in last 1 year.
 * Return the number of books deleted
 */
public class DeleteBook {

	public int deleteBooks() {
		int flag = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "DELETE FROM books WHERE accession_no NOT IN (SELECT accession_no FROM book_issue "
				+ "WHERE issue_dt BETWEEN NOW() - INTERVAL 365 DAY AND NOW());  ";

		try {
			ps = con.prepareStatement(query);
			flag = ps.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return flag;
	}
}
