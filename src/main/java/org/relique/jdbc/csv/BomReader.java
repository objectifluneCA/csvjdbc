package org.relique.jdbc.csv;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;
import org.relique.io.TableReader;

public class BomReader implements TableReader {

	private String tableName = null;
	private String extension = ".csv";

	@Override
	public Reader getReader(Statement statement, String tableName) throws SQLException {
		try {
			this.tableName = tableName;

			final CsvConnection connection = (CsvConnection) statement.getConnection();
			if (connection.getExtension() != null && !connection.getExtension().isEmpty())
				extension = connection.getExtension();

			BOMInputStream bomIn = new BOMInputStream(new FileInputStream(tableName + extension),
					ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_32LE, ByteOrderMark.UTF_32BE,
					ByteOrderMark.UTF_8);

			InputStreamReader reader = new InputStreamReader(bomIn, connection.getCharset());
			return reader;
		}
		catch (Exception e) {
			throw new SQLException(e.getMessage());
		}
	}

	@Override
	public List<String> getTableNames(Connection connection) {
		// Return list of available table names
		List<String> tableNames = new ArrayList<String>();
		tableNames.add(tableName);
		return tableNames;
	}

}