package org.relique.jdbc.csv;

import java.sql.SQLException;

/**
 * This wrapper around the CSVJDBC driver's SQL exceptions 
 * allows us to display more significant error messages and will 
 * provide the content for the logger.
 * 
 * barbeauj
 */
public class CsvJdbcException extends SQLException {


	private static final long serialVersionUID = -780610504923295279L;

	public static final void CsvJdbcPassthroughException(String originalMessage) throws SQLException {
		throw new SQLException(originalMessage);
	}

	public static final void CsvJdbcSeparatorException(String separator, String line) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_SEPARATOR, separator, line));
	}

	public static final void CsvJdbcTableNotFoundException(String table) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_TABLENOTFOUND, table));
	}

	public static final void CsvJdbcZipReaderException(String originalError) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_ERRORREADING, originalError));
	}

	public static final void CsvJdbcInvalidPropertyException(String property) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_INVALIDPROPERTY, property));
	}

	public static final void CsvJdbcInvalidCharException(String charInError, String currentProperty)
			throws SQLException {
		String propertyLog = "";
		switch (currentProperty) {
			case CsvDriver.QUOTECHAR:
				propertyLog = "text delimiter";
				break;
			default:
				propertyLog = "field delimiter";
				break;
		}
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_INVALIDCHAR, charInError, propertyLog));
	}

	public static final void CsvJdbcFailOpenFileException(String filePath) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_FAILEDOPENFILE, filePath));
	}

	public static final void CsvJdbcDuplicateColumnException() throws SQLException {
				throw new SQLException(CsvLogMessages.ERR_CSVJDBC_DUPLICATECOLUMN);
	}

	public static final void CsvJdbcEOFQuoteException() throws SQLException {
		throw new SQLException(CsvLogMessages.ERR_CSVJDBC_EOFQUOTE);
	}

	public static final void CsvJdbcColumnCountException(int lineFieldCount, int columnCount) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_COLCOUNT, lineFieldCount, columnCount));
	}

	public static final void CsvJdbcInvalidColumnException(String line) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_COLTYPE, line));
	}

	public static final void CsvJdbcInvalidColumnNameException(String line) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_INVALIDCOLNAME, line));
	}

	public static final void CsvJdbcInvalidGrpColumnException(String command, String column) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_INVALIDGRPCOL, command, column));
	}

	public static final void CsvJdbcInvalidGrpColumnIdxException(int column) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_INVALIDCOLINDEX, column));
	}

	public static final void CsvJdbcConvertBigDecException(String value) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_CONVERTBIGDEC, value));
	}

	public static final void CsvJdbcOrderGroupException(String value) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_ORDERGROUP, value));
	}

	public static final void CsvJdbcCommandUnsupportedException(String command) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_COMMANDUNSUP, command));
	}

	public static final void CsvJdbcColNotInGroupByException(String columnName) throws SQLException {
		throw new SQLException(String.format(CsvLogMessages.ERR_CSVJDBC_COLNOTINCGRP, columnName));
	}

}