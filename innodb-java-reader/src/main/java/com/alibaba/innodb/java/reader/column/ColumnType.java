/*
 * Copyright (C) 1999-2019 Alibaba Group Holding Limited
 */
package com.alibaba.innodb.java.reader.column;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Column type
 *
 * @author xu.zx
 */
public final class ColumnType {

  public static final String BIT = "BIT";
  public static final String BOOL = "BOOL";
  public static final String BOOLEAN = "BOOLEAN";
  public static final String ENUM = "ENUM";

  public static final String UNSIGNED_TINYINT = "TINYINT UNSIGNED";
  public static final String UNSIGNED_SMALLINT = "SMALLINT UNSIGNED";
  public static final String UNSIGNED_MEDIUMINT = "MEDIUMINT UNSIGNED";
  public static final String UNSIGNED_INT = "INT UNSIGNED";
  public static final String UNSIGNED_BIGINT = "BIGINT UNSIGNED";

  public static final String TINYINT = "TINYINT";
  public static final String SMALLINT = "SMALLINT";
  public static final String MEDIUMINT = "MEDIUMINT";
  public static final String INT = "INT";
  public static final String BIGINT = "BIGINT";

  public static final String FLOAT = "FLOAT";
  public static final String DOUBLE = "DOUBLE";
  public static final String DECIMAL = "DECIMAL";
  public static final String NUMERIC = "NUMERIC";

  public static final String CHAR = "CHAR";
  public static final String VARCHAR = "VARCHAR";
  public static final String BINARY = "BINARY";
  public static final String VARBINARY = "VARBINARY";
  public static final String TINYBLOB = "TINYBLOB";
  public static final String BLOB = "BLOB";
  public static final String MEDIUMBLOB = "MEDIUMBLOB";
  public static final String LONGBLOB = "LONGBLOB";
  public static final String TINYTEXT = "TINYTEXT";
  public static final String TEXT = "TEXT";
  public static final String MEDIUMTEXT = "MEDIUMTEXT";
  public static final String LONGTEXT = "LONGTEXT";
  public static final String YEAR = "YEAR";
  public static final String TIME = "TIME";
  public static final String DATE = "DATE";
  public static final String DATETIME = "DATETIME";
  public static final String TIMESTAMP = "TIMESTAMP";

  public static final Set<String> VARIABLE_LENGTH_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(VARCHAR, VARBINARY, TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB,
          TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT)));

  public static final Set<String> BLOB_TEXT_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB,
          TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT)));

  public static final Set<String> CHAR_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(VARCHAR, CHAR)));

  public static final Set<String> BLOB_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB)));

  public static final Set<String> TEXT_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT)));

  public static final Set<String> JAVA_INTEGER_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(UNSIGNED_TINYINT, UNSIGNED_SMALLINT, UNSIGNED_MEDIUMINT, UNSIGNED_INT,
          TINYINT, SMALLINT, MEDIUMINT, INT)));

  public static final Set<String> JAVA_LONG_TYPES = Collections.unmodifiableSet(
      new HashSet<>(Arrays.asList(UNSIGNED_BIGINT, BIGINT)));
}
