package org.relique.jdbc.csv;


public final class CsvLogMessages {

	/*
	 * CSVJDBC Error Messages
	 */
	public static final String ERR_CSVJDBC_SEPARATOR = "ERROR CSV0001 - Separator \"%s\" not found on line %s.";
	public static final String ERR_CSVJDBC_TABLENOTFOUND = "ERROR CSV0002 - Table not found: %s";
	public static final String ERR_CSVJDBC_ERRORREADING = "ERROR CSV0003 - An error occured while trying to read a table from the specified zip file. - %s";
	public static final String ERR_CSVJDBC_INVALIDCHAR = "ERROR CSV0004 - Invalid Character \"%s\" used for the %s.";
	public static final String ERR_CSVJDBC_INVALIDPROPERTY = "ERROR CSV0005 - Invalid property - %s.";
	public static final String ERR_CSVJDBC_FAILEDOPENFILE = "ERROR CSV0006 - Failed to open file - %s.";
	public static final String ERR_CSVJDBC_DUPLICATECOLUMN = "ERROR CSV0007 - Duplicate column names found in the table.  Please check if 'Use Headers' option is selected.";
	public static final String ERR_CSVJDBC_EOFQUOTE = "ERROR CSV0008 - End-Of-File was found before the last text delimiter was closed.";
	public static final String ERR_CSVJDBC_COLCOUNT = "ERROR CSV0009 - The number of columns from data line %s of the CSV file exceeds the number of columns defined from the header line (%s). ";
	public static final String ERR_CSVJDBC_COLTYPE = "ERROR CSV0010 - Invalid column type: %s.";
	public static final String ERR_CSVJDBC_INVALIDCOLNAME = "ERROR CSV0011 - Invalid column name: %s.";
	public static final String ERR_CSVJDBC_INVALIDGRPCOL = "ERROR CSV0012 - Invalid %s of column %s.";
	public static final String ERR_CSVJDBC_CANNOTCOMBINE = "ERROR CSV0013 - Query columns cannot be combined with aggregate functions.";
	public static final String ERR_CSVJDBC_AGGREGATEWHERE = "ERROR CSV0014 - Aggregate functions not allowed in a WHERE clause.";
	public static final String ERR_CSVJDBC_RESULTCLOSED = "ERROR CSV0015 - ResultSet is already closed.";
	public static final String ERR_CSVJDBC_GETTERMETHOD = "ERROR CSV0016 - No previous getter method was called.";
	public static final String ERR_CSVJDBC_INVALIDCOLINDEX = "ERROR CSV0017 - Column not found; Invalid column index: %s.";
	public static final String ERR_CSVJDBC_EMPTYCOLNAME = "ERROR CSV0018 - Can't access columns through a column name search when specified name is empty.";
	public static final String ERR_CSVJDBC_CONVERTBIGDEC = "ERROR CSV0019 - Cannot convert %s to a java.math.BigDecimal object.";
	public static final String ERR_CSVJDBC_ORDERGROUP = "ERROR CSV0020 - ORDER BY column is not included in the GROUP BY: %s";
	public static final String ERR_CSVJDBC_COMMANDUNSUP = "ERROR CSV0021 - %s not supported.";
	public static final String ERR_CSVJDBC_COLNOTINCGRP = "ERROR CSV0022 - Column %s not included in GROUP BY.";

}
