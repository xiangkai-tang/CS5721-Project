// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserForgetUserIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.UserForgetUserIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string iban = 1;</code>
   */
  String getIban();
  /**
   * <code>string iban = 1;</code>
   */
  com.google.protobuf.ByteString
      getIbanBytes();

  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  boolean hasBirthDate();
  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  com.google.protobuf.Timestamp getBirthDate();
  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBirthDateOrBuilder();

  /**
   * <code>string phone = 3;</code>
   */
  String getPhone();
  /**
   * <code>string phone = 3;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string email = 4;</code>
   */
  String getEmail();
  /**
   * <code>string email = 4;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}
