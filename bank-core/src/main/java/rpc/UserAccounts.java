// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

/**
 * Protobuf type {@code rpc.UserAccounts}
 */
public  final class UserAccounts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.UserAccounts)
    UserAccountsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserAccounts.newBuilder() to construct.
  private UserAccounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserAccounts() {
    accountId_ = 0L;
    accountNumber_ = 0L;
    accountType_ = 0;
    currencyType_ = 0;
    balance_ = 0;
    status_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserAccounts(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            accountId_ = input.readInt64();
            break;
          }
          case 16: {

            accountNumber_ = input.readInt64();
            break;
          }
          case 24: {

            accountType_ = input.readInt32();
            break;
          }
          case 32: {

            currencyType_ = input.readInt32();
            break;
          }
          case 40: {

            balance_ = input.readInt32();
            break;
          }
          case 48: {

            status_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BankProto.internal_static_rpc_UserAccounts_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BankProto.internal_static_rpc_UserAccounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserAccounts.class, UserAccounts.Builder.class);
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
  private long accountId_;
  /**
   * <code>int64 account_id = 1;</code>
   */
  public long getAccountId() {
    return accountId_;
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 2;
  private long accountNumber_;
  /**
   * <code>int64 account_number = 2;</code>
   */
  public long getAccountNumber() {
    return accountNumber_;
  }

  public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
  private int accountType_;
  /**
   * <code>int32 account_type = 3;</code>
   */
  public int getAccountType() {
    return accountType_;
  }

  public static final int CURRENCY_TYPE_FIELD_NUMBER = 4;
  private int currencyType_;
  /**
   * <code>int32 currency_type = 4;</code>
   */
  public int getCurrencyType() {
    return currencyType_;
  }

  public static final int BALANCE_FIELD_NUMBER = 5;
  private int balance_;
  /**
   * <code>int32 balance = 5;</code>
   */
  public int getBalance() {
    return balance_;
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <code>int32 status = 6;</code>
   */
  public int getStatus() {
    return status_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (accountId_ != 0L) {
      output.writeInt64(1, accountId_);
    }
    if (accountNumber_ != 0L) {
      output.writeInt64(2, accountNumber_);
    }
    if (accountType_ != 0) {
      output.writeInt32(3, accountType_);
    }
    if (currencyType_ != 0) {
      output.writeInt32(4, currencyType_);
    }
    if (balance_ != 0) {
      output.writeInt32(5, balance_);
    }
    if (status_ != 0) {
      output.writeInt32(6, status_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, accountId_);
    }
    if (accountNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, accountNumber_);
    }
    if (accountType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, accountType_);
    }
    if (currencyType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, currencyType_);
    }
    if (balance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, balance_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserAccounts)) {
      return super.equals(obj);
    }
    UserAccounts other = (UserAccounts) obj;

    boolean result = true;
    result = result && (getAccountId()
        == other.getAccountId());
    result = result && (getAccountNumber()
        == other.getAccountNumber());
    result = result && (getAccountType()
        == other.getAccountType());
    result = result && (getCurrencyType()
        == other.getCurrencyType());
    result = result && (getBalance()
        == other.getBalance());
    result = result && (getStatus()
        == other.getStatus());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountId());
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountNumber());
    hash = (37 * hash) + ACCOUNT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAccountType();
    hash = (37 * hash) + CURRENCY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyType();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UserAccounts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserAccounts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserAccounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserAccounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserAccounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserAccounts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserAccounts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserAccounts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserAccounts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserAccounts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserAccounts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserAccounts parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserAccounts prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.UserAccounts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.UserAccounts)
      UserAccountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BankProto.internal_static_rpc_UserAccounts_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BankProto.internal_static_rpc_UserAccounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserAccounts.class, UserAccounts.Builder.class);
    }

    // Construct using rpc.UserAccounts.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      accountId_ = 0L;

      accountNumber_ = 0L;

      accountType_ = 0;

      currencyType_ = 0;

      balance_ = 0;

      status_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BankProto.internal_static_rpc_UserAccounts_descriptor;
    }

    public UserAccounts getDefaultInstanceForType() {
      return UserAccounts.getDefaultInstance();
    }

    public UserAccounts build() {
      UserAccounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UserAccounts buildPartial() {
      UserAccounts result = new UserAccounts(this);
      result.accountId_ = accountId_;
      result.accountNumber_ = accountNumber_;
      result.accountType_ = accountType_;
      result.currencyType_ = currencyType_;
      result.balance_ = balance_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserAccounts) {
        return mergeFrom((UserAccounts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserAccounts other) {
      if (other == UserAccounts.getDefaultInstance()) return this;
      if (other.getAccountId() != 0L) {
        setAccountId(other.getAccountId());
      }
      if (other.getAccountNumber() != 0L) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getAccountType() != 0) {
        setAccountType(other.getAccountType());
      }
      if (other.getCurrencyType() != 0) {
        setCurrencyType(other.getCurrencyType());
      }
      if (other.getBalance() != 0) {
        setBalance(other.getBalance());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserAccounts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserAccounts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long accountId_ ;
    /**
     * <code>int64 account_id = 1;</code>
     */
    public long getAccountId() {
      return accountId_;
    }
    /**
     * <code>int64 account_id = 1;</code>
     */
    public Builder setAccountId(long value) {

      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 account_id = 1;</code>
     */
    public Builder clearAccountId() {

      accountId_ = 0L;
      onChanged();
      return this;
    }

    private long accountNumber_ ;
    /**
     * <code>int64 account_number = 2;</code>
     */
    public long getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <code>int64 account_number = 2;</code>
     */
    public Builder setAccountNumber(long value) {

      accountNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 account_number = 2;</code>
     */
    public Builder clearAccountNumber() {

      accountNumber_ = 0L;
      onChanged();
      return this;
    }

    private int accountType_ ;
    /**
     * <code>int32 account_type = 3;</code>
     */
    public int getAccountType() {
      return accountType_;
    }
    /**
     * <code>int32 account_type = 3;</code>
     */
    public Builder setAccountType(int value) {

      accountType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 account_type = 3;</code>
     */
    public Builder clearAccountType() {

      accountType_ = 0;
      onChanged();
      return this;
    }

    private int currencyType_ ;
    /**
     * <code>int32 currency_type = 4;</code>
     */
    public int getCurrencyType() {
      return currencyType_;
    }
    /**
     * <code>int32 currency_type = 4;</code>
     */
    public Builder setCurrencyType(int value) {

      currencyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 currency_type = 4;</code>
     */
    public Builder clearCurrencyType() {

      currencyType_ = 0;
      onChanged();
      return this;
    }

    private int balance_ ;
    /**
     * <code>int32 balance = 5;</code>
     */
    public int getBalance() {
      return balance_;
    }
    /**
     * <code>int32 balance = 5;</code>
     */
    public Builder setBalance(int value) {

      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 balance = 5;</code>
     */
    public Builder clearBalance() {

      balance_ = 0;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 6;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 6;</code>
     */
    public Builder setStatus(int value) {

      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 6;</code>
     */
    public Builder clearStatus() {

      status_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.UserAccounts)
  }

  // @@protoc_insertion_point(class_scope:rpc.UserAccounts)
  private static final UserAccounts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserAccounts();
  }

  public static UserAccounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserAccounts>
      PARSER = new com.google.protobuf.AbstractParser<UserAccounts>() {
    public UserAccounts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserAccounts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserAccounts> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserAccounts> getParserForType() {
    return PARSER;
  }

  public UserAccounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
