// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ApQueryOwnerListRequestBean.proto

package com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf;

public final class ApQueryOwnerListRequestBeanOuterClass {
  private ApQueryOwnerListRequestBeanOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApQueryOwnerListRequestBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string sb = 1;</code>
     */
    String getSb();
    /**
     * <code>optional string sb = 1;</code>
     */
    com.google.protobuf.ByteString
        getSbBytes();
  }
  /**
   * Protobuf type {@code com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean}
   */
  public  static final class ApQueryOwnerListRequestBean extends
      com.google.protobuf.GeneratedMessageLite<
          ApQueryOwnerListRequestBean, ApQueryOwnerListRequestBean.Builder> implements
      // @@protoc_insertion_point(message_implements:com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean)
      ApQueryOwnerListRequestBeanOrBuilder {
    private ApQueryOwnerListRequestBean() {
      sb_ = "";
    }
    public static final int SB_FIELD_NUMBER = 1;
    private String sb_;
    /**
     * <code>optional string sb = 1;</code>
     */
    public String getSb() {
      return sb_;
    }
    /**
     * <code>optional string sb = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSbBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(sb_);
    }
    /**
     * <code>optional string sb = 1;</code>
     */
    private void setSb(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sb_ = value;
    }
    /**
     * <code>optional string sb = 1;</code>
     */
    private void clearSb() {
      
      sb_ = getDefaultInstance().getSb();
    }
    /**
     * <code>optional string sb = 1;</code>
     */
    private void setSbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sb_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!sb_.isEmpty()) {
        output.writeString(1, getSb());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!sb_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSb());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApQueryOwnerListRequestBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApQueryOwnerListRequestBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApQueryOwnerListRequestBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApQueryOwnerListRequestBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApQueryOwnerListRequestBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApQueryOwnerListRequestBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApQueryOwnerListRequestBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApQueryOwnerListRequestBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApQueryOwnerListRequestBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApQueryOwnerListRequestBean parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApQueryOwnerListRequestBean prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApQueryOwnerListRequestBean, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean)
        ApQueryOwnerListRequestBeanOrBuilder {
      // Construct using com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBeanOuterClass.ApQueryOwnerListRequestBean.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string sb = 1;</code>
       */
      public String getSb() {
        return instance.getSb();
      }
      /**
       * <code>optional string sb = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSbBytes() {
        return instance.getSbBytes();
      }
      /**
       * <code>optional string sb = 1;</code>
       */
      public Builder setSb(
          String value) {
        copyOnWrite();
        instance.setSb(value);
        return this;
      }
      /**
       * <code>optional string sb = 1;</code>
       */
      public Builder clearSb() {
        copyOnWrite();
        instance.clearSb();
        return this;
      }
      /**
       * <code>optional string sb = 1;</code>
       */
      public Builder setSbBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSbBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApQueryOwnerListRequestBean();
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
          ApQueryOwnerListRequestBean other = (ApQueryOwnerListRequestBean) arg1;
          sb_ = visitor.visitString(!sb_.isEmpty(), sb_,
              !other.sb_.isEmpty(), other.sb_);
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

                  sb_ = s;
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
          if (PARSER == null) {    synchronized (ApQueryOwnerListRequestBean.class) {
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


    // @@protoc_insertion_point(class_scope:com.halo.ap.web.cmd.qryap.queryapownerlist.protobuf.ApQueryOwnerListRequestBean)
    private static final ApQueryOwnerListRequestBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApQueryOwnerListRequestBean();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApQueryOwnerListRequestBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApQueryOwnerListRequestBean> PARSER;

    public static com.google.protobuf.Parser<ApQueryOwnerListRequestBean> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}