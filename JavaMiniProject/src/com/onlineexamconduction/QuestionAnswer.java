package com.onlineexamconduction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author -- TkGitcode
 */
public class QuestionAnswer extends User {

	static int Score = 0;
	Connection connection = DataBase.getConnection();
	void QuestionAnswerSession() throws SQLException {

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from questionandanswer_tbl");

		System.out.println("1 for true and 0 for false");

		while (rs.next()) {
			System.out.println(rs.getString(2));

			int answer = scanner.nextInt();

			if (rs.getString(3).equals(String.valueOf(answer)))
				Score = Score + 10;
//			if (!rs.getString(3).equals(String.valueOf(answer)))
//				Score = Score - 5;
		}
		if (Score < 0)
			Score = 0;
		connection.close();
	}

	int getScore() {
		return QuestionAnswer.Score;
	}
	
}
