/**
 * JDBC Assignment2
 */
package com.metacube.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Anjita
 * Given the name of the book, to be issued by an existing member.
 * Return flag to indicate whether the  the book has been issued or not
 */
public class BookOfMember {
	
	/* execute query using prepared statement */
	public int executeQueryUsingPreparedStatement() {
		int flag1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();

		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		PreparedStatement ps2 = null;
		ResultSet rs2 = null;
		PreparedStatement ps3 = null;
		PreparedStatement ps4 = null;

		Members members = new Members();
		Books books = new Books();

		String query1 = "SELECT b.status, b.accession_no, b.title_id FROM books b"
				+ " INNER JOIN titles t ON b.title_id = t.title_id WHERE t.title_nm = ?";
		String nameBook = "";
		System.out.println("Enter title of book");
		nameBook = sc.nextLine();

		try {
			ps1 = con.prepareStatement(query1);
			/* set variable in prepared statement */
			ps1.setString(1, nameBook);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				books.setStatus(rs1.getString("status"));
				books.setAccession_no(rs1.getInt("accession_no"));
				if (books.getStatus().equals("b")) {
					//System.out.println("book is issued");
				} else {
					String query2 = "SELECT member_id FROM members WHERE member_nm = ?";
					String name = "";
					System.out.println("Enter name of member");
					name = sc.nextLine();

					try {
						ps2 = con.prepareStatement(query2);
						/* set variable in prepared statement */
						ps2.setString(1, name);
						rs2 = ps2.executeQuery();
						if (!rs2.next()) {
							System.out.println("member does not exist");
						} else {
							rs2.beforeFirst();
							while (rs2.next()) {
								members.setMember_id(rs2.getInt("member_id"));
								members.setMember_nm(name);

								String query3 = "INSERT INTO book_issue values(now(),"
										+ books.getAccession_no()
										+ ","
										+ members.getMember_id()
										+ ",now() + INTERVAL 15 DAY);";
								System.out.println(members.getMember_id());

								try {
									ps3 = con.prepareStatement(query3);
									/* set variable in prepared statement */
									int flag = ps3.executeUpdate(query3);
									System.out
											.println("successfully updated in book issue table"
													+ flag);
									String query4 = "UPDATE books SET status = 'b' WHERE accession_no = "
											+ books.getAccession_no();

									try {
										ps4 = con.prepareStatement(query4);
										/* set variable in prepared statement */
										flag1 = ps4.executeUpdate(query4);
										System.out
												.println("successfully updated in books table"
														+ flag1);
									} catch (SQLException e) {
										e.printStackTrace();
									}
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps1 != null) {
					ps1.close();
				}
				if (ps2 != null) {
					ps1.close();
				}
				if (ps3 != null) {
					ps1.close();
				}
				if (ps4 != null) {
					ps1.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		sc.close();
		return flag1;
	}

}
