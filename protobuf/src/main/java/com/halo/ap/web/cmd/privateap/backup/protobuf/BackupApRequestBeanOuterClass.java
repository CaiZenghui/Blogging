// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BackupApRequestBean.proto

package com.halo.ap.web.cmd.privateap.backup.protobuf;

public final class BackupApRequestBeanOuterClass {
  private BackupApRequestBeanOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface BackupApRequestBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string ssid = 1;</code>
     */
    String getSsid();
    /**
     * <code>optional string ssid = 1;</code>
     */
    com.google.protobuf.ByteString
        getSsidBytes();

    /**
     * <code>optional string bssid = 2;</code>
     */
    String getBssid();
    /**
     * <code>optional string bssid = 2;</code>
     */
    com.google.protobuf.ByteString
        getBssidBytes();

    /**
     * <code>optional string seclvl = 3;</code>
     */
    String getSeclvl();
    /**
     * <code>optional string seclvl = 3;</code>
     */
    com.google.protobuf.ByteString
        getSeclvlBytes();

    /**
     * <code>optional string pwd = 4;</code>
     */
    String getPwd();
    /**
     * <code>optional string pwd = 4;</code>
     */
    com.google.protobuf.ByteString
        getPwdBytes();

    /**
     * <code>optional string type = 5;</code>
     */
    String getType();
    /**
     * <code>optional string type = 5;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>optional string wkflg = 6;</code>
     */
    String getWkflg();
    /**
     * <code>optional string wkflg = 6;</code>
     */
    com.google.protobuf.ByteString
        getWkflgBytes();
  }
  /**
   * Protobuf type {@code com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean}
   */
  public  static final class BackupApRequestBean extends
      com.google.protobuf.GeneratedMessageLite<
          BackupApRequestBean, BackupApRequestBean.Builder> implements
      // @@protoc_insertion_point(message_implements:com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean)
      BackupApRequestBeanOrBuilder {
    private BackupApRequestBean() {
      ssid_ = "";
      bssid_ = "";
      seclvl_ = "";
      pwd_ = "";
      type_ = "";
      wkflg_ = "";
    }
    public static final int SSID_FIELD_NUMBER = 1;
    private String ssid_;
    /**
     * <code>optional string ssid = 1;</code>
     */
    public String getSsid() {
      return ssid_;
    }
    /**
     * <code>optional string ssid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSsidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(ssid_);
    }
    /**
     * <code>optional string ssid = 1;</code>
     */
    private void setSsid(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ssid_ = value;
    }
    /**
     * <code>optional string ssid = 1;</code>
     */
    private void clearSsid() {
      
      ssid_ = getDefaultInstance().getSsid();
    }
    /**
     * <code>optional string ssid = 1;</code>
     */
    private void setSsidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ssid_ = value.toStringUtf8();
    }

    public static final int BSSID_FIELD_NUMBER = 2;
    private String bssid_;
    /**
     * <code>optional string bssid = 2;</code>
     */
    public String getBssid() {
      return bssid_;
    }
    /**
     * <code>optional string bssid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBssidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(bssid_);
    }
    /**
     * <code>optional string bssid = 2;</code>
     */
    private void setBssid(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bssid_ = value;
    }
    /**
     * <code>optional string bssid = 2;</code>
     */
    private void clearBssid() {
      
      bssid_ = getDefaultInstance().getBssid();
    }
    /**
     * <code>optional string bssid = 2;</code>
     */
    private void setBssidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bssid_ = value.toStringUtf8();
    }

    public static final int SECLVL_FIELD_NUMBER = 3;
    private String seclvl_;
    /**
     * <code>optional string seclvl = 3;</code>
     */
    public String getSeclvl() {
      return seclvl_;
    }
    /**
     * <code>optional string seclvl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSeclvlBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(seclvl_);
    }
    /**
     * <code>optional string seclvl = 3;</code>
     */
    private void setSeclvl(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      seclvl_ = value;
    }
    /**
     * <code>optional string seclvl = 3;</code>
     */
    private void clearSeclvl() {
      
      seclvl_ = getDefaultInstance().getSeclvl();
    }
    /**
     * <code>optional string seclvl = 3;</code>
     */
    private void setSeclvlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      seclvl_ = value.toStringUtf8();
    }

    public static final int PWD_FIELD_NUMBER = 4;
    private String pwd_;
    /**
     * <code>optional string pwd = 4;</code>
     */
    public String getPwd() {
      return pwd_;
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPwdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(pwd_);
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    private void setPwd(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pwd_ = value;
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    private void clearPwd() {
      
      pwd_ = getDefaultInstance().getPwd();
    }
    /**
     * <code>optional string pwd = 4;</code>
     */
    private void setPwdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pwd_ = value.toStringUtf8();
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private String type_;
    /**
     * <code>optional string type = 5;</code>
     */
    public String getType() {
      return type_;
    }
    /**
     * <code>optional string type = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(type_);
    }
    /**
     * <code>optional string type = 5;</code>
     */
    private void setType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
    }
    /**
     * <code>optional string type = 5;</code>
     */
    private void clearType() {
      
      type_ = getDefaultInstance().getType();
    }
    /**
     * <code>optional string type = 5;</code>
     */
    private void setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value.toStringUtf8();
    }

    public static final int WKFLG_FIELD_NUMBER = 6;
    private String wkflg_;
    /**
     * <code>optional string wkflg = 6;</code>
     */
    public String getWkflg() {
      return wkflg_;
    }
    /**
     * <code>optional string wkflg = 6;</code>
     */
    public com.google.protobuf.ByteString
        getWkflgBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(wkflg_);
    }
    /**
     * <code>optional string wkflg = 6;</code>
     */
    private void setWkflg(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wkflg_ = value;
    }
    /**
     * <code>optional string wkflg = 6;</code>
     */
    private void clearWkflg() {
      
      wkflg_ = getDefaultInstance().getWkflg();
    }
    /**
     * <code>optional string wkflg = 6;</code>
     */
    private void setWkflgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      wkflg_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!ssid_.isEmpty()) {
        output.writeString(1, getSsid());
      }
      if (!bssid_.isEmpty()) {
        output.writeString(2, getBssid());
      }
      if (!seclvl_.isEmpty()) {
        output.writeString(3, getSeclvl());
      }
      if (!pwd_.isEmpty()) {
        output.writeString(4, getPwd());
      }
      if (!type_.isEmpty()) {
        output.writeString(5, getType());
      }
      if (!wkflg_.isEmpty()) {
        output.writeString(6, getWkflg());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!ssid_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSsid());
      }
      if (!bssid_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getBssid());
      }
      if (!seclvl_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getSeclvl());
      }
      if (!pwd_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getPwd());
      }
      if (!type_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getType());
      }
      if (!wkflg_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getWkflg());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static BackupApRequestBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static BackupApRequestBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static BackupApRequestBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static BackupApRequestBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static BackupApRequestBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static BackupApRequestBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static BackupApRequestBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static BackupApRequestBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static BackupApRequestBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static BackupApRequestBean parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(BackupApRequestBean prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          BackupApRequestBean, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean)
        BackupApRequestBeanOrBuilder {
      // Construct using com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBeanOuterClass.BackupApRequestBean.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string ssid = 1;</code>
       */
      public String getSsid() {
        return instance.getSsid();
      }
      /**
       * <code>optional string ssid = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSsidBytes() {
        return instance.getSsidBytes();
      }
      /**
       * <code>optional string ssid = 1;</code>
       */
      public Builder setSsid(
          String value) {
        copyOnWrite();
        instance.setSsid(value);
        return this;
      }
      /**
       * <code>optional string ssid = 1;</code>
       */
      public Builder clearSsid() {
        copyOnWrite();
        instance.clearSsid();
        return this;
      }
      /**
       * <code>optional string ssid = 1;</code>
       */
      public Builder setSsidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSsidBytes(value);
        return this;
      }

      /**
       * <code>optional string bssid = 2;</code>
       */
      public String getBssid() {
        return instance.getBssid();
      }
      /**
       * <code>optional string bssid = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBssidBytes() {
        return instance.getBssidBytes();
      }
      /**
       * <code>optional string bssid = 2;</code>
       */
      public Builder setBssid(
          String value) {
        copyOnWrite();
        instance.setBssid(value);
        return this;
      }
      /**
       * <code>optional string bssid = 2;</code>
       */
      public Builder clearBssid() {
        copyOnWrite();
        instance.clearBssid();
        return this;
      }
      /**
       * <code>optional string bssid = 2;</code>
       */
      public Builder setBssidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setBssidBytes(value);
        return this;
      }

      /**
       * <code>optional string seclvl = 3;</code>
       */
      public String getSeclvl() {
        return instance.getSeclvl();
      }
      /**
       * <code>optional string seclvl = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSeclvlBytes() {
        return instance.getSeclvlBytes();
      }
      /**
       * <code>optional string seclvl = 3;</code>
       */
      public Builder setSeclvl(
          String value) {
        copyOnWrite();
        instance.setSeclvl(value);
        return this;
      }
      /**
       * <code>optional string seclvl = 3;</code>
       */
      public Builder clearSeclvl() {
        copyOnWrite();
        instance.clearSeclvl();
        return this;
      }
      /**
       * <code>optional string seclvl = 3;</code>
       */
      public Builder setSeclvlBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSeclvlBytes(value);
        return this;
      }

      /**
       * <code>optional string pwd = 4;</code>
       */
      public String getPwd() {
        return instance.getPwd();
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPwdBytes() {
        return instance.getPwdBytes();
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder setPwd(
          String value) {
        copyOnWrite();
        instance.setPwd(value);
        return this;
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder clearPwd() {
        copyOnWrite();
        instance.clearPwd();
        return this;
      }
      /**
       * <code>optional string pwd = 4;</code>
       */
      public Builder setPwdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPwdBytes(value);
        return this;
      }

      /**
       * <code>optional string type = 5;</code>
       */
      public String getType() {
        return instance.getType();
      }
      /**
       * <code>optional string type = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        return instance.getTypeBytes();
      }
      /**
       * <code>optional string type = 5;</code>
       */
      public Builder setType(
          String value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <code>optional string type = 5;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }
      /**
       * <code>optional string type = 5;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTypeBytes(value);
        return this;
      }

      /**
       * <code>optional string wkflg = 6;</code>
       */
      public String getWkflg() {
        return instance.getWkflg();
      }
      /**
       * <code>optional string wkflg = 6;</code>
       */
      public com.google.protobuf.ByteString
          getWkflgBytes() {
        return instance.getWkflgBytes();
      }
      /**
       * <code>optional string wkflg = 6;</code>
       */
      public Builder setWkflg(
          String value) {
        copyOnWrite();
        instance.setWkflg(value);
        return this;
      }
      /**
       * <code>optional string wkflg = 6;</code>
       */
      public Builder clearWkflg() {
        copyOnWrite();
        instance.clearWkflg();
        return this;
      }
      /**
       * <code>optional string wkflg = 6;</code>
       */
      public Builder setWkflgBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setWkflgBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new BackupApRequestBean();
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
          BackupApRequestBean other = (BackupApRequestBean) arg1;
          ssid_ = visitor.visitString(!ssid_.isEmpty(), ssid_,
              !other.ssid_.isEmpty(), other.ssid_);
          bssid_ = visitor.visitString(!bssid_.isEmpty(), bssid_,
              !other.bssid_.isEmpty(), other.bssid_);
          seclvl_ = visitor.visitString(!seclvl_.isEmpty(), seclvl_,
              !other.seclvl_.isEmpty(), other.seclvl_);
          pwd_ = visitor.visitString(!pwd_.isEmpty(), pwd_,
              !other.pwd_.isEmpty(), other.pwd_);
          type_ = visitor.visitString(!type_.isEmpty(), type_,
              !other.type_.isEmpty(), other.type_);
          wkflg_ = visitor.visitString(!wkflg_.isEmpty(), wkflg_,
              !other.wkflg_.isEmpty(), other.wkflg_);
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

                  ssid_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  bssid_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  seclvl_ = s;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  pwd_ = s;
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  type_ = s;
                  break;
                }
                case 50: {
                  String s = input.readStringRequireUtf8();

                  wkflg_ = s;
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
          if (PARSER == null) {    synchronized (BackupApRequestBean.class) {
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


    // @@protoc_insertion_point(class_scope:com.halo.ap.web.cmd.privateap.backup.protobuf.BackupApRequestBean)
    private static final BackupApRequestBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BackupApRequestBean();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static BackupApRequestBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<BackupApRequestBean> PARSER;

    public static com.google.protobuf.Parser<BackupApRequestBean> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}