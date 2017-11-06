// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irving/UdpBean.proto

package com.irving.udp.proto;

public final class DefaultUdpBean {
  private DefaultUdpBean() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UdpBeanOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UdpBean)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 发送方地址
     * </pre>
     *
     * <code>optional string sender = 1;</code>
     */
    java.lang.String getSender();
    /**
     * <pre>
     * 发送方地址
     * </pre>
     *
     * <code>optional string sender = 1;</code>
     */
    com.google.protobuf.ByteString
        getSenderBytes();

    /**
     * <pre>
     * 接收方地址
     * </pre>
     *
     * <code>optional string recv = 2;</code>
     */
    java.lang.String getRecv();
    /**
     * <pre>
     * 接收方地址
     * </pre>
     *
     * <code>optional string recv = 2;</code>
     */
    com.google.protobuf.ByteString
        getRecvBytes();

    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    boolean hasPacket();
    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    com.irving.udp.proto.DefaultPacket.Packet getPacket();
    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    com.irving.udp.proto.DefaultPacket.PacketOrBuilder getPacketOrBuilder();
  }
  /**
   * Protobuf type {@code UdpBean}
   */
  public  static final class UdpBean extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UdpBean)
      UdpBeanOrBuilder {
    // Use UdpBean.newBuilder() to construct.
    private UdpBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UdpBean() {
      sender_ = "";
      recv_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UdpBean(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
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
              java.lang.String s = input.readStringRequireUtf8();

              sender_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              recv_ = s;
              break;
            }
            case 26: {
              com.irving.udp.proto.DefaultPacket.Packet.Builder subBuilder = null;
              if (packet_ != null) {
                subBuilder = packet_.toBuilder();
              }
              packet_ = input.readMessage(com.irving.udp.proto.DefaultPacket.Packet.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(packet_);
                packet_ = subBuilder.buildPartial();
              }

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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irving.udp.proto.DefaultUdpBean.internal_static_UdpBean_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irving.udp.proto.DefaultUdpBean.internal_static_UdpBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irving.udp.proto.DefaultUdpBean.UdpBean.class, com.irving.udp.proto.DefaultUdpBean.UdpBean.Builder.class);
    }

    public static final int SENDER_FIELD_NUMBER = 1;
    private volatile java.lang.Object sender_;
    /**
     * <pre>
     * 发送方地址
     * </pre>
     *
     * <code>optional string sender = 1;</code>
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 发送方地址
     * </pre>
     *
     * <code>optional string sender = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECV_FIELD_NUMBER = 2;
    private volatile java.lang.Object recv_;
    /**
     * <pre>
     * 接收方地址
     * </pre>
     *
     * <code>optional string recv = 2;</code>
     */
    public java.lang.String getRecv() {
      java.lang.Object ref = recv_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recv_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 接收方地址
     * </pre>
     *
     * <code>optional string recv = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRecvBytes() {
      java.lang.Object ref = recv_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recv_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PACKET_FIELD_NUMBER = 3;
    private com.irving.udp.proto.DefaultPacket.Packet packet_;
    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    public boolean hasPacket() {
      return packet_ != null;
    }
    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    public com.irving.udp.proto.DefaultPacket.Packet getPacket() {
      return packet_ == null ? com.irving.udp.proto.DefaultPacket.Packet.getDefaultInstance() : packet_;
    }
    /**
     * <pre>
     * 数据包
     * </pre>
     *
     * <code>optional .Packet packet = 3;</code>
     */
    public com.irving.udp.proto.DefaultPacket.PacketOrBuilder getPacketOrBuilder() {
      return getPacket();
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
      if (!getSenderBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
      }
      if (!getRecvBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recv_);
      }
      if (packet_ != null) {
        output.writeMessage(3, getPacket());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSenderBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
      }
      if (!getRecvBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recv_);
      }
      if (packet_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPacket());
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.irving.udp.proto.DefaultUdpBean.UdpBean)) {
        return super.equals(obj);
      }
      com.irving.udp.proto.DefaultUdpBean.UdpBean other = (com.irving.udp.proto.DefaultUdpBean.UdpBean) obj;

      boolean result = true;
      result = result && getSender()
          .equals(other.getSender());
      result = result && getRecv()
          .equals(other.getRecv());
      result = result && (hasPacket() == other.hasPacket());
      if (hasPacket()) {
        result = result && getPacket()
            .equals(other.getPacket());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
      hash = (37 * hash) + RECV_FIELD_NUMBER;
      hash = (53 * hash) + getRecv().hashCode();
      if (hasPacket()) {
        hash = (37 * hash) + PACKET_FIELD_NUMBER;
        hash = (53 * hash) + getPacket().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.irving.udp.proto.DefaultUdpBean.UdpBean parseFrom(
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
    public static Builder newBuilder(com.irving.udp.proto.DefaultUdpBean.UdpBean prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code UdpBean}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UdpBean)
        com.irving.udp.proto.DefaultUdpBean.UdpBeanOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.irving.udp.proto.DefaultUdpBean.internal_static_UdpBean_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.irving.udp.proto.DefaultUdpBean.internal_static_UdpBean_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.irving.udp.proto.DefaultUdpBean.UdpBean.class, com.irving.udp.proto.DefaultUdpBean.UdpBean.Builder.class);
      }

      // Construct using com.irving.udp.proto.DefaultUdpBean.UdpBean.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
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
        sender_ = "";

        recv_ = "";

        if (packetBuilder_ == null) {
          packet_ = null;
        } else {
          packet_ = null;
          packetBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.irving.udp.proto.DefaultUdpBean.internal_static_UdpBean_descriptor;
      }

      public com.irving.udp.proto.DefaultUdpBean.UdpBean getDefaultInstanceForType() {
        return com.irving.udp.proto.DefaultUdpBean.UdpBean.getDefaultInstance();
      }

      public com.irving.udp.proto.DefaultUdpBean.UdpBean build() {
        com.irving.udp.proto.DefaultUdpBean.UdpBean result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.irving.udp.proto.DefaultUdpBean.UdpBean buildPartial() {
        com.irving.udp.proto.DefaultUdpBean.UdpBean result = new com.irving.udp.proto.DefaultUdpBean.UdpBean(this);
        result.sender_ = sender_;
        result.recv_ = recv_;
        if (packetBuilder_ == null) {
          result.packet_ = packet_;
        } else {
          result.packet_ = packetBuilder_.build();
        }
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
        if (other instanceof com.irving.udp.proto.DefaultUdpBean.UdpBean) {
          return mergeFrom((com.irving.udp.proto.DefaultUdpBean.UdpBean)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.irving.udp.proto.DefaultUdpBean.UdpBean other) {
        if (other == com.irving.udp.proto.DefaultUdpBean.UdpBean.getDefaultInstance()) return this;
        if (!other.getSender().isEmpty()) {
          sender_ = other.sender_;
          onChanged();
        }
        if (!other.getRecv().isEmpty()) {
          recv_ = other.recv_;
          onChanged();
        }
        if (other.hasPacket()) {
          mergePacket(other.getPacket());
        }
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
        com.irving.udp.proto.DefaultUdpBean.UdpBean parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.irving.udp.proto.DefaultUdpBean.UdpBean) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object sender_ = "";
      /**
       * <pre>
       * 发送方地址
       * </pre>
       *
       * <code>optional string sender = 1;</code>
       */
      public java.lang.String getSender() {
        java.lang.Object ref = sender_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sender_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 发送方地址
       * </pre>
       *
       * <code>optional string sender = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        java.lang.Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 发送方地址
       * </pre>
       *
       * <code>optional string sender = 1;</code>
       */
      public Builder setSender(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sender_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 发送方地址
       * </pre>
       *
       * <code>optional string sender = 1;</code>
       */
      public Builder clearSender() {
        
        sender_ = getDefaultInstance().getSender();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 发送方地址
       * </pre>
       *
       * <code>optional string sender = 1;</code>
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sender_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object recv_ = "";
      /**
       * <pre>
       * 接收方地址
       * </pre>
       *
       * <code>optional string recv = 2;</code>
       */
      public java.lang.String getRecv() {
        java.lang.Object ref = recv_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          recv_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 接收方地址
       * </pre>
       *
       * <code>optional string recv = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRecvBytes() {
        java.lang.Object ref = recv_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          recv_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 接收方地址
       * </pre>
       *
       * <code>optional string recv = 2;</code>
       */
      public Builder setRecv(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        recv_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 接收方地址
       * </pre>
       *
       * <code>optional string recv = 2;</code>
       */
      public Builder clearRecv() {
        
        recv_ = getDefaultInstance().getRecv();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 接收方地址
       * </pre>
       *
       * <code>optional string recv = 2;</code>
       */
      public Builder setRecvBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        recv_ = value;
        onChanged();
        return this;
      }

      private com.irving.udp.proto.DefaultPacket.Packet packet_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.irving.udp.proto.DefaultPacket.Packet, com.irving.udp.proto.DefaultPacket.Packet.Builder, com.irving.udp.proto.DefaultPacket.PacketOrBuilder> packetBuilder_;
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public boolean hasPacket() {
        return packetBuilder_ != null || packet_ != null;
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public com.irving.udp.proto.DefaultPacket.Packet getPacket() {
        if (packetBuilder_ == null) {
          return packet_ == null ? com.irving.udp.proto.DefaultPacket.Packet.getDefaultInstance() : packet_;
        } else {
          return packetBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public Builder setPacket(com.irving.udp.proto.DefaultPacket.Packet value) {
        if (packetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          packet_ = value;
          onChanged();
        } else {
          packetBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public Builder setPacket(
          com.irving.udp.proto.DefaultPacket.Packet.Builder builderForValue) {
        if (packetBuilder_ == null) {
          packet_ = builderForValue.build();
          onChanged();
        } else {
          packetBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public Builder mergePacket(com.irving.udp.proto.DefaultPacket.Packet value) {
        if (packetBuilder_ == null) {
          if (packet_ != null) {
            packet_ =
              com.irving.udp.proto.DefaultPacket.Packet.newBuilder(packet_).mergeFrom(value).buildPartial();
          } else {
            packet_ = value;
          }
          onChanged();
        } else {
          packetBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public Builder clearPacket() {
        if (packetBuilder_ == null) {
          packet_ = null;
          onChanged();
        } else {
          packet_ = null;
          packetBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public com.irving.udp.proto.DefaultPacket.Packet.Builder getPacketBuilder() {
        
        onChanged();
        return getPacketFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      public com.irving.udp.proto.DefaultPacket.PacketOrBuilder getPacketOrBuilder() {
        if (packetBuilder_ != null) {
          return packetBuilder_.getMessageOrBuilder();
        } else {
          return packet_ == null ?
              com.irving.udp.proto.DefaultPacket.Packet.getDefaultInstance() : packet_;
        }
      }
      /**
       * <pre>
       * 数据包
       * </pre>
       *
       * <code>optional .Packet packet = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.irving.udp.proto.DefaultPacket.Packet, com.irving.udp.proto.DefaultPacket.Packet.Builder, com.irving.udp.proto.DefaultPacket.PacketOrBuilder> 
          getPacketFieldBuilder() {
        if (packetBuilder_ == null) {
          packetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.irving.udp.proto.DefaultPacket.Packet, com.irving.udp.proto.DefaultPacket.Packet.Builder, com.irving.udp.proto.DefaultPacket.PacketOrBuilder>(
                  getPacket(),
                  getParentForChildren(),
                  isClean());
          packet_ = null;
        }
        return packetBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:UdpBean)
    }

    // @@protoc_insertion_point(class_scope:UdpBean)
    private static final com.irving.udp.proto.DefaultUdpBean.UdpBean DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.irving.udp.proto.DefaultUdpBean.UdpBean();
    }

    public static com.irving.udp.proto.DefaultUdpBean.UdpBean getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UdpBean>
        PARSER = new com.google.protobuf.AbstractParser<UdpBean>() {
      public UdpBean parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new UdpBean(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UdpBean> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UdpBean> getParserForType() {
      return PARSER;
    }

    public com.irving.udp.proto.DefaultUdpBean.UdpBean getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UdpBean_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UdpBean_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024irving/UdpBean.proto\032\023irving/Packet.pr" +
      "oto\"@\n\007UdpBean\022\016\n\006sender\030\001 \001(\t\022\014\n\004recv\030\002" +
      " \001(\t\022\027\n\006packet\030\003 \001(\0132\007.PacketB&\n\024com.irv" +
      "ing.udp.protoB\016DefaultUdpBeanb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.irving.udp.proto.DefaultPacket.getDescriptor(),
        }, assigner);
    internal_static_UdpBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UdpBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UdpBean_descriptor,
        new java.lang.String[] { "Sender", "Recv", "Packet", });
    com.irving.udp.proto.DefaultPacket.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}