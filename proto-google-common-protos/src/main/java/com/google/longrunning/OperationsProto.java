// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_GetOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_ListOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_ListOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_CancelOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_DeleteOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/longrunning/operations.proto\022\022g" +
      "oogle.longrunning\032\034google/api/annotation" +
      "s.proto\032\031google/protobuf/any.proto\032\033goog" +
      "le/protobuf/empty.proto\032\027google/rpc/stat" +
      "us.proto\"\250\001\n\tOperation\022\014\n\004name\030\001 \001(\t\022&\n\010" +
      "metadata\030\002 \001(\0132\024.google.protobuf.Any\022\014\n\004" +
      "done\030\003 \001(\010\022#\n\005error\030\004 \001(\0132\022.google.rpc.S" +
      "tatusH\000\022(\n\010response\030\005 \001(\0132\024.google.proto" +
      "buf.AnyH\000B\010\n\006result\"#\n\023GetOperationReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\\\n\025ListOperationsReques",
      "t\022\014\n\004name\030\004 \001(\t\022\016\n\006filter\030\001 \001(\t\022\021\n\tpage_" +
      "size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"d\n\026ListOp" +
      "erationsResponse\0221\n\noperations\030\001 \003(\0132\035.g" +
      "oogle.longrunning.Operation\022\027\n\017next_page" +
      "_token\030\002 \001(\t\"&\n\026CancelOperationRequest\022\014" +
      "\n\004name\030\001 \001(\t\"&\n\026DeleteOperationRequest\022\014" +
      "\n\004name\030\001 \001(\t2\214\004\n\nOperations\022\206\001\n\016ListOper" +
      "ations\022).google.longrunning.ListOperatio" +
      "nsRequest\032*.google.longrunning.ListOpera" +
      "tionsResponse\"\035\202\323\344\223\002\027\022\025/v1/{name=operati",
      "ons}\022x\n\014GetOperation\022\'.google.longrunnin" +
      "g.GetOperationRequest\032\035.google.longrunni" +
      "ng.Operation\" \202\323\344\223\002\032\022\030/v1/{name=operatio" +
      "ns/**}\022w\n\017DeleteOperation\022*.google.longr" +
      "unning.DeleteOperationRequest\032\026.google.p" +
      "rotobuf.Empty\" \202\323\344\223\002\032*\030/v1/{name=operati" +
      "ons/**}\022\201\001\n\017CancelOperation\022*.google.lon" +
      "grunning.CancelOperationRequest\032\026.google" +
      ".protobuf.Empty\"*\202\323\344\223\002$\"\037/v1/{name=opera" +
      "tions/**}:cancel:\001*B\224\001\n\026com.google.longr",
      "unningB\017OperationsProtoP\001Z=google.golang" +
      ".org/genproto/googleapis/longrunning;lon" +
      "grunning\252\002\022Google.LongRunning\312\002\022Google\\L" +
      "ongRunningb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_longrunning_Operation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_longrunning_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_Operation_descriptor,
        new java.lang.String[] { "Name", "Metadata", "Done", "Error", "Response", "Result", });
    internal_static_google_longrunning_GetOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_GetOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_longrunning_ListOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_ListOperationsRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "PageSize", "PageToken", });
    internal_static_google_longrunning_ListOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_ListOperationsResponse_descriptor,
        new java.lang.String[] { "Operations", "NextPageToken", });
    internal_static_google_longrunning_CancelOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_CancelOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_longrunning_DeleteOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_longrunning_DeleteOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
