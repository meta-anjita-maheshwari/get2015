/**
 * JDBC Assignment1
 */
package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Anjita
 * Fetch all the books published by author, given the name of the author. 
 * Return the books data (List of Titles)
 */
public class BooksOfAuthor {
	static List<Titles> titleList = new ArrayList<Titles>();

	/* execute query using prepared statement */
	public List<Titles> executeQueryUsingPreparedStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Titles t = new Titles();

		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "SELECT t.title_nm FROM titles t INNER JOIN title_author ta ON t.title_id = ta.title_id INNER JOIN authors a ON ta.author_id = a.author_id WHERE a.author_nm = ?";
		String name = "";
		System.out.println("Enter name of author");
		name = sc.nextLine();

		try {
			ps = con.prepareStatement(query);
			/* set variable in prepared statement */
			ps.setString(1, name);
			rs = ps.executeQuery();

			while (rs.next()) {
				t.setTitle_nm(rs.getString("title_nm"));
				titleList.add(t);
			}
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
		sc.close();
		return titleList;

	}

}
