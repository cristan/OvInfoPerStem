package nl.openov.ovinfoperstem.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mainService.proto
// Protobuf Java Version: 4.29.3

public final class MainService {
  private MainService() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      MainService.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021mainService.proto\032\033google/protobuf/emp" +
      "ty.proto\032\017userInput.proto\032\016feedback.prot" +
      "o2x\n\021TravelChatService\022-\n\tsendInput\022\n.Us" +
      "erInput\032\022.UserInputResponse\"\000\0224\n\013getFeed" +
      "back\022\026.google.protobuf.Empty\032\t.Feedback\"" +
      "\0000\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          UserInputOuterClass.getDescriptor(),
          FeedbackOuterClass.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    UserInputOuterClass.getDescriptor();
    FeedbackOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
