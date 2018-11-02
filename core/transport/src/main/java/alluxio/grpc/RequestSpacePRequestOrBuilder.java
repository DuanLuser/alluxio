// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block_worker.proto

package alluxio.grpc;

public interface RequestSpacePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.RequestSpacePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  boolean hasSessionId();
  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  long getSessionId();

  /**
   * <pre>
   ** the id of the block being accessed 
   * </pre>
   *
   * <code>optional int64 blockId = 2;</code>
   */
  boolean hasBlockId();
  /**
   * <pre>
   ** the id of the block being accessed 
   * </pre>
   *
   * <code>optional int64 blockId = 2;</code>
   */
  long getBlockId();

  /**
   * <pre>
   ** the number of bytes requested 
   * </pre>
   *
   * <code>optional int64 requestBytes = 3;</code>
   */
  boolean hasRequestBytes();
  /**
   * <pre>
   ** the number of bytes requested 
   * </pre>
   *
   * <code>optional int64 requestBytes = 3;</code>
   */
  long getRequestBytes();

  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  boolean hasOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  alluxio.grpc.RequestSpacePOptions getOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  alluxio.grpc.RequestSpacePOptionsOrBuilder getOptionsOrBuilder();
}