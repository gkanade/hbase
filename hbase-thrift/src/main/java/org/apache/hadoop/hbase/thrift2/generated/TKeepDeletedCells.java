/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;


/**
 * Thrift wrapper around
 * org.apache.hadoop.hbase.KeepDeletedCells
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-06-15")
public enum TKeepDeletedCells implements org.apache.thrift.TEnum {
  /**
   * Deleted Cells are not retained.
   */
  FALSE(0),
  /**
   * Deleted Cells are retained until they are removed by other means
   * such TTL or VERSIONS.
   * If no TTL is specified or no new versions of delete cells are
   * written, they are retained forever.
   */
  TRUE(1),
  /**
   * Deleted Cells are retained until the delete marker expires due to TTL.
   * This is useful when TTL is combined with MIN_VERSIONS and one
   * wants to keep a minimum number of versions around but at the same
   * time remove deleted cells after the TTL.
   */
  TTL(2);

  private final int value;

  private TKeepDeletedCells(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TKeepDeletedCells findByValue(int value) { 
    switch (value) {
      case 0:
        return FALSE;
      case 1:
        return TRUE;
      case 2:
        return TTL;
      default:
        return null;
    }
  }
}
