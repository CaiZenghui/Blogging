// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SecurityParameter.proto

package com.halo.domain.www.controller.protobuf;

public final class SecurityParameterOuterClass {
  private SecurityParameterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface SecurityParameterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.halo.domain.www.controller.protobuf.SecurityParameter)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string appId = 1;</code>
     */
    String getAppId();
    /**
     * <code>optional string appId = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppIdBytes();

    /**
     * <code>optional string dhid = 2;</code>
     */
    String getDhid();
    /**
     * <code>optional string dhid = 2;</code>
     */
    com.google.protobuf.ByteString
        getDhidBytes();

    /**
     * <code>optional string st = 3;</code>
     */
    String getSt();
    /**
     * <code>optional string st = 3;</code>
     */
    com.google.protobuf.ByteString
        getStBytes();

    /**
     * <code>optional string et = 4;</code>
     */
    String getEt();
    /**
     * <code>optional string et = 4;</code>
     */
    com.google.protobuf.ByteString
        getEtBytes();

    /**
     * <code>optional string verCode = 5;</code>
     */
    String getVerCode();
    /**
     * <code>optional string verCode = 5;</code>
     */
    com.google.protobuf.ByteString
        getVerCodeBytes();

    /**
     * <code>optional string chanId = 6;</code>
     */
    String getChanId();
    /**
     * <code>optional string chanId = 6;</code>
     */
    com.google.protobuf.ByteString
        getChanIdBytes();

    /**
     * <code>optional string lang = 7;</code>
     */
    String getLang();
    /**
     * <code>optional string lang = 7;</code>
     */
    com.google.protobuf.ByteString
        getLangBytes();

    /**
     * <code>optional string imei = 8;</code>
     */
    String getImei();
    /**
     * <code>optional string imei = 8;</code>
     */
    com.google.protobuf.ByteString
        getImeiBytes();

    /**
     * <pre>
     *key type:0=swap session key(response is not crypt);1=session key;
     * </pre>
     *
     * <code>optional int32 kt = 9;</code>
     */
    int getKt();
  }
  /**
   * Protobuf type {@code com.halo.domain.www.controller.protobuf.SecurityParameter}
   */
  public  static final class SecurityParameter extends
      com.google.protobuf.GeneratedMessageLite<
          SecurityParameter, SecurityParameter.Builder> implements
      // @@protoc_insertion_point(message_implements:com.halo.domain.www.controller.protobuf.SecurityParameter)
      SecurityParameterOrBuilder {
    private SecurityParameter() {
      appId_ = "";
      dhid_ = "";
      st_ = "";
      et_ = "";
      verCode_ = "";
      chanId_ = "";
      lang_ = "";
      imei_ = "";
    }
    public static final int APPID_FIELD_NUMBER = 1;
    private String appId_;
    /**
     * <code>optional string appId = 1;</code>
     */
    public String getAppId() {
      return appId_;
    }
    /**
     * <code>optional string appId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(appId_);
    }
    /**
     * <code>optional string appId = 1;</code>
     */
    private void setAppId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appId_ = value;
    }
    /**
     * <code>optional string appId = 1;</code>
     */
    private void clearAppId() {
      
      appId_ = getDefaultInstance().getAppId();
    }
    /**
     * <code>optional string appId = 1;</code>
     */
    private void setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appId_ = value.toStringUtf8();
    }

    public static final int DHID_FIELD_NUMBER = 2;
    private String dhid_;
    /**
     * <code>optional string dhid = 2;</code>
     */
    public String getDhid() {
      return dhid_;
    }
    /**
     * <code>optional string dhid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDhidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(dhid_);
    }
    /**
     * <code>optional string dhid = 2;</code>
     */
    private void setDhid(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dhid_ = value;
    }
    /**
     * <code>optional string dhid = 2;</code>
     */
    private void clearDhid() {
      
      dhid_ = getDefaultInstance().getDhid();
    }
    /**
     * <code>optional string dhid = 2;</code>
     */
    private void setDhidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dhid_ = value.toStringUtf8();
    }

    public static final int ST_FIELD_NUMBER = 3;
    private String st_;
    /**
     * <code>optional string st = 3;</code>
     */
    public String getSt() {
      return st_;
    }
    /**
     * <code>optional string st = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(st_);
    }
    /**
     * <code>optional string st = 3;</code>
     */
    private void setSt(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      st_ = value;
    }
    /**
     * <code>optional string st = 3;</code>
     */
    private void clearSt() {
      
      st_ = getDefaultInstance().getSt();
    }
    /**
     * <code>optional string st = 3;</code>
     */
    private void setStBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      st_ = value.toStringUtf8();
    }

    public static final int ET_FIELD_NUMBER = 4;
    private String et_;
    /**
     * <code>optional string et = 4;</code>
     */
    public String getEt() {
      return et_;
    }
    /**
     * <code>optional string et = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEtBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(et_);
    }
    /**
     * <code>optional string et = 4;</code>
     */
    private void setEt(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      et_ = value;
    }
    /**
     * <code>optional string et = 4;</code>
     */
    private void clearEt() {
      
      et_ = getDefaultInstance().getEt();
    }
    /**
     * <code>optional string et = 4;</code>
     */
    private void setEtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      et_ = value.toStringUtf8();
    }

    public static final int VERCODE_FIELD_NUMBER = 5;
    private String verCode_;
    /**
     * <code>optional string verCode = 5;</code>
     */
    public String getVerCode() {
      return verCode_;
    }
    /**
     * <code>optional string verCode = 5;</code>
     */
    public com.google.protobuf.ByteString
        getVerCodeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(verCode_);
    }
    /**
     * <code>optional string verCode = 5;</code>
     */
    private void setVerCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      verCode_ = value;
    }
    /**
     * <code>optional string verCode = 5;</code>
     */
    private void clearVerCode() {
      
      verCode_ = getDefaultInstance().getVerCode();
    }
    /**
     * <code>optional string verCode = 5;</code>
     */
    private void setVerCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      verCode_ = value.toStringUtf8();
    }

    public static final int CHANID_FIELD_NUMBER = 6;
    private String chanId_;
    /**
     * <code>optional string chanId = 6;</code>
     */
    public String getChanId() {
      return chanId_;
    }
    /**
     * <code>optional string chanId = 6;</code>
     */
    public com.google.protobuf.ByteString
        getChanIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(chanId_);
    }
    /**
     * <code>optional string chanId = 6;</code>
     */
    private void setChanId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      chanId_ = value;
    }
    /**
     * <code>optional string chanId = 6;</code>
     */
    private void clearChanId() {
      
      chanId_ = getDefaultInstance().getChanId();
    }
    /**
     * <code>optional string chanId = 6;</code>
     */
    private void setChanIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      chanId_ = value.toStringUtf8();
    }

    public static final int LANG_FIELD_NUMBER = 7;
    private String lang_;
    /**
     * <code>optional string lang = 7;</code>
     */
    public String getLang() {
      return lang_;
    }
    /**
     * <code>optional string lang = 7;</code>
     */
    public com.google.protobuf.ByteString
        getLangBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(lang_);
    }
    /**
     * <code>optional string lang = 7;</code>
     */
    private void setLang(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lang_ = value;
    }
    /**
     * <code>optional string lang = 7;</code>
     */
    private void clearLang() {
      
      lang_ = getDefaultInstance().getLang();
    }
    /**
     * <code>optional string lang = 7;</code>
     */
    private void setLangBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lang_ = value.toStringUtf8();
    }

    public static final int IMEI_FIELD_NUMBER = 8;
    private String imei_;
    /**
     * <code>optional string imei = 8;</code>
     */
    public String getImei() {
      return imei_;
    }
    /**
     * <code>optional string imei = 8;</code>
     */
    public com.google.protobuf.ByteString
        getImeiBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(imei_);
    }
    /**
     * <code>optional string imei = 8;</code>
     */
    private void setImei(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imei_ = value;
    }
    /**
     * <code>optional string imei = 8;</code>
     */
    private void clearImei() {
      
      imei_ = getDefaultInstance().getImei();
    }
    /**
     * <code>optional string imei = 8;</code>
     */
    private void setImeiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imei_ = value.toStringUtf8();
    }

    public static final int KT_FIELD_NUMBER = 9;
    private int kt_;
    /**
     * <pre>
     *key type:0=swap session key(response is not crypt);1=session key;
     * </pre>
     *
     * <code>optional int32 kt = 9;</code>
     */
    public int getKt() {
      return kt_;
    }
    /**
     * <pre>
     *key type:0=swap session key(response is not crypt);1=session key;
     * </pre>
     *
     * <code>optional int32 kt = 9;</code>
     */
    private void setKt(int value) {
      
      kt_ = value;
    }
    /**
     * <pre>
     *key type:0=swap session key(response is not crypt);1=session key;
     * </pre>
     *
     * <code>optional int32 kt = 9;</code>
     */
    private void clearKt() {
      
      kt_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!appId_.isEmpty()) {
        output.writeString(1, getAppId());
      }
      if (!dhid_.isEmpty()) {
        output.writeString(2, getDhid());
      }
      if (!st_.isEmpty()) {
        output.writeString(3, getSt());
      }
      if (!et_.isEmpty()) {
        output.writeString(4, getEt());
      }
      if (!verCode_.isEmpty()) {
        output.writeString(5, getVerCode());
      }
      if (!chanId_.isEmpty()) {
        output.writeString(6, getChanId());
      }
      if (!lang_.isEmpty()) {
        output.writeString(7, getLang());
      }
      if (!imei_.isEmpty()) {
        output.writeString(8, getImei());
      }
      if (kt_ != 0) {
        output.writeInt32(9, kt_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!appId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getAppId());
      }
      if (!dhid_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getDhid());
      }
      if (!st_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getSt());
      }
      if (!et_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getEt());
      }
      if (!verCode_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getVerCode());
      }
      if (!chanId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getChanId());
      }
      if (!lang_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getLang());
      }
      if (!imei_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getImei());
      }
      if (kt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, kt_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static SecurityParameter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static SecurityParameter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static SecurityParameter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static SecurityParameter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static SecurityParameter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static SecurityParameter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static SecurityParameter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static SecurityParameter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static SecurityParameter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static SecurityParameter parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SecurityParameter prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code com.halo.domain.www.controller.protobuf.SecurityParameter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          SecurityParameter, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.halo.domain.www.controller.protobuf.SecurityParameter)
        SecurityParameterOrBuilder {
      // Construct using com.halo.domain.www.controller.protobuf.SecurityParameterOuterClass.SecurityParameter.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string appId = 1;</code>
       */
      public String getAppId() {
        return instance.getAppId();
      }
      /**
       * <code>optional string appId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppIdBytes() {
        return instance.getAppIdBytes();
      }
      /**
       * <code>optional string appId = 1;</code>
       */
      public Builder setAppId(
          String value) {
        copyOnWrite();
        instance.setAppId(value);
        return this;
      }
      /**
       * <code>optional string appId = 1;</code>
       */
      public Builder clearAppId() {
        copyOnWrite();
        instance.clearAppId();
        return this;
      }
      /**
       * <code>optional string appId = 1;</code>
       */
      public Builder setAppIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setAppIdBytes(value);
        return this;
      }

      /**
       * <code>optional string dhid = 2;</code>
       */
      public String getDhid() {
        return instance.getDhid();
      }
      /**
       * <code>optional string dhid = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDhidBytes() {
        return instance.getDhidBytes();
      }
      /**
       * <code>optional string dhid = 2;</code>
       */
      public Builder setDhid(
          String value) {
        copyOnWrite();
        instance.setDhid(value);
        return this;
      }
      /**
       * <code>optional string dhid = 2;</code>
       */
      public Builder clearDhid() {
        copyOnWrite();
        instance.clearDhid();
        return this;
      }
      /**
       * <code>optional string dhid = 2;</code>
       */
      public Builder setDhidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDhidBytes(value);
        return this;
      }

      /**
       * <code>optional string st = 3;</code>
       */
      public String getSt() {
        return instance.getSt();
      }
      /**
       * <code>optional string st = 3;</code>
       */
      public com.google.protobuf.ByteString
          getStBytes() {
        return instance.getStBytes();
      }
      /**
       * <code>optional string st = 3;</code>
       */
      public Builder setSt(
          String value) {
        copyOnWrite();
        instance.setSt(value);
        return this;
      }
      /**
       * <code>optional string st = 3;</code>
       */
      public Builder clearSt() {
        copyOnWrite();
        instance.clearSt();
        return this;
      }
      /**
       * <code>optional string st = 3;</code>
       */
      public Builder setStBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setStBytes(value);
        return this;
      }

      /**
       * <code>optional string et = 4;</code>
       */
      public String getEt() {
        return instance.getEt();
      }
      /**
       * <code>optional string et = 4;</code>
       */
      public com.google.protobuf.ByteString
          getEtBytes() {
        return instance.getEtBytes();
      }
      /**
       * <code>optional string et = 4;</code>
       */
      public Builder setEt(
          String value) {
        copyOnWrite();
        instance.setEt(value);
        return this;
      }
      /**
       * <code>optional string et = 4;</code>
       */
      public Builder clearEt() {
        copyOnWrite();
        instance.clearEt();
        return this;
      }
      /**
       * <code>optional string et = 4;</code>
       */
      public Builder setEtBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setEtBytes(value);
        return this;
      }

      /**
       * <code>optional string verCode = 5;</code>
       */
      public String getVerCode() {
        return instance.getVerCode();
      }
      /**
       * <code>optional string verCode = 5;</code>
       */
      public com.google.protobuf.ByteString
          getVerCodeBytes() {
        return instance.getVerCodeBytes();
      }
      /**
       * <code>optional string verCode = 5;</code>
       */
      public Builder setVerCode(
          String value) {
        copyOnWrite();
        instance.setVerCode(value);
        return this;
      }
      /**
       * <code>optional string verCode = 5;</code>
       */
      public Builder clearVerCode() {
        copyOnWrite();
        instance.clearVerCode();
        return this;
      }
      /**
       * <code>optional string verCode = 5;</code>
       */
      public Builder setVerCodeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setVerCodeBytes(value);
        return this;
      }

      /**
       * <code>optional string chanId = 6;</code>
       */
      public String getChanId() {
        return instance.getChanId();
      }
      /**
       * <code>optional string chanId = 6;</code>
       */
      public com.google.protobuf.ByteString
          getChanIdBytes() {
        return instance.getChanIdBytes();
      }
      /**
       * <code>optional string chanId = 6;</code>
       */
      public Builder setChanId(
          String value) {
        copyOnWrite();
        instance.setChanId(value);
        return this;
      }
      /**
       * <code>optional string chanId = 6;</code>
       */
      public Builder clearChanId() {
        copyOnWrite();
        instance.clearChanId();
        return this;
      }
      /**
       * <code>optional string chanId = 6;</code>
       */
      public Builder setChanIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setChanIdBytes(value);
        return this;
      }

      /**
       * <code>optional string lang = 7;</code>
       */
      public String getLang() {
        return instance.getLang();
      }
      /**
       * <code>optional string lang = 7;</code>
       */
      public com.google.protobuf.ByteString
          getLangBytes() {
        return instance.getLangBytes();
      }
      /**
       * <code>optional string lang = 7;</code>
       */
      public Builder setLang(
          String value) {
        copyOnWrite();
        instance.setLang(value);
        return this;
      }
      /**
       * <code>optional string lang = 7;</code>
       */
      public Builder clearLang() {
        copyOnWrite();
        instance.clearLang();
        return this;
      }
      /**
       * <code>optional string lang = 7;</code>
       */
      public Builder setLangBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setLangBytes(value);
        return this;
      }

      /**
       * <code>optional string imei = 8;</code>
       */
      public String getImei() {
        return instance.getImei();
      }
      /**
       * <code>optional string imei = 8;</code>
       */
      public com.google.protobuf.ByteString
          getImeiBytes() {
        return instance.getImeiBytes();
      }
      /**
       * <code>optional string imei = 8;</code>
       */
      public Builder setImei(
          String value) {
        copyOnWrite();
        instance.setImei(value);
        return this;
      }
      /**
       * <code>optional string imei = 8;</code>
       */
      public Builder clearImei() {
        copyOnWrite();
        instance.clearImei();
        return this;
      }
      /**
       * <code>optional string imei = 8;</code>
       */
      public Builder setImeiBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setImeiBytes(value);
        return this;
      }

      /**
       * <pre>
       *key type:0=swap session key(response is not crypt);1=session key;
       * </pre>
       *
       * <code>optional int32 kt = 9;</code>
       */
      public int getKt() {
        return instance.getKt();
      }
      /**
       * <pre>
       *key type:0=swap session key(response is not crypt);1=session key;
       * </pre>
       *
       * <code>optional int32 kt = 9;</code>
       */
      public Builder setKt(int value) {
        copyOnWrite();
        instance.setKt(value);
        return this;
      }
      /**
       * <pre>
       *key type:0=swap session key(response is not crypt);1=session key;
       * </pre>
       *
       * <code>optional int32 kt = 9;</code>
       */
      public Builder clearKt() {
        copyOnWrite();
        instance.clearKt();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.halo.domain.www.controller.protobuf.SecurityParameter)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new SecurityParameter();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          SecurityParameter other = (SecurityParameter) arg1;
          appId_ = visitor.visitString(!appId_.isEmpty(), appId_,
              !other.appId_.isEmpty(), other.appId_);
          dhid_ = visitor.visitString(!dhid_.isEmpty(), dhid_,
              !other.dhid_.isEmpty(), other.dhid_);
          st_ = visitor.visitString(!st_.isEmpty(), st_,
              !other.st_.isEmpty(), other.st_);
          et_ = visitor.visitString(!et_.isEmpty(), et_,
              !other.et_.isEmpty(), other.et_);
          verCode_ = visitor.visitString(!verCode_.isEmpty(), verCode_,
              !other.verCode_.isEmpty(), other.verCode_);
          chanId_ = visitor.visitString(!chanId_.isEmpty(), chanId_,
              !other.chanId_.isEmpty(), other.chanId_);
          lang_ = visitor.visitString(!lang_.isEmpty(), lang_,
              !other.lang_.isEmpty(), other.lang_);
          imei_ = visitor.visitString(!imei_.isEmpty(), imei_,
              !other.imei_.isEmpty(), other.imei_);
          kt_ = visitor.visitInt(kt_ != 0, kt_,
              other.kt_ != 0, other.kt_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  appId_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  dhid_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  st_ = s;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  et_ = s;
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  verCode_ = s;
                  break;
                }
                case 50: {
                  String s = input.readStringRequireUtf8();

                  chanId_ = s;
                  break;
                }
                case 58: {
                  String s = input.readStringRequireUtf8();

                  lang_ = s;
                  break;
                }
                case 66: {
                  String s = input.readStringRequireUtf8();

                  imei_ = s;
                  break;
                }
                case 72: {

                  kt_ = input.readInt32();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (SecurityParameter.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.halo.domain.www.controller.protobuf.SecurityParameter)
    private static final SecurityParameter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SecurityParameter();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static SecurityParameter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SecurityParameter> PARSER;

    public static com.google.protobuf.Parser<SecurityParameter> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
