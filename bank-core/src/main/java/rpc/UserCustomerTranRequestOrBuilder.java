// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserCustomerTranRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:rpc.UserCustomerTranRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string user_id = 1;</code>
     */
    String getUserId();

    /**
     * <code>string user_id = 1;</code>
     */
    com.google.protobuf.ByteString
    getUserIdBytes();

    /**
     * <code>string to_card_no = 2;</code>
     */
    String getToCardNo();

    /**
     * <code>string to_card_no = 2;</code>
     */
    com.google.protobuf.ByteString
    getToCardNoBytes();

    /**
     * <code>string amount = 3;</code>
     */
    String getAmount();

    /**
     * <code>string amount = 3;</code>
     */
    com.google.protobuf.ByteString
    getAmountBytes();

    /**
     * <code>string currency = 4;</code>
     */
    String getCurrency();

    /**
     * <code>string currency = 4;</code>
     */
    com.google.protobuf.ByteString
    getCurrencyBytes();

    /**
     * <code>string description = 5;</code>
     */
    String getDescription();

    /**
     * <code>string description = 5;</code>
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();
}