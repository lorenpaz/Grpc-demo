// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Spacestation.proto

package com.lorenzo.spacestation.generated;

public final class SpaceStationOuterClass {
  private SpaceStationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lorenzo_Captain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lorenzo_Captain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lorenzo_SpaceShip_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lorenzo_SpaceShip_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lorenzo_SpaceStation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lorenzo_SpaceStation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022Spacestation.proto\022\013com.lorenzo\"}\n\007Cap" +
      "tain\022\014\n\004name\030\001 \001(\t\022+\n\004race\030\002 \001(\0162\035.com.l" +
      "orenzo.Captain.RaceType\"7\n\010RaceType\022\t\n\005F" +
      "URRY\020\000\022\017\n\013TALL_WOODEN\020\001\022\017\n\013SMALL_ROUND\020\002" +
      "\"6\n\tSpaceShip\022\014\n\004name\030\001 \001(\t\022\014\n\004crew\030\002 \001(" +
      "\005\022\r\n\005cargo\030\003 \001(\t\"a\n\014SpaceStation\022%\n\007capt" +
      "ain\030\001 \001(\0132\024.com.lorenzo.Captain\022*\n\nspace" +
      "ships\030\002 \003(\0132\026.com.lorenzo.SpaceShipB>\n\"c" +
      "om.lorenzo.spacestation.generatedB\026Space" +
      "StationOuterClassP\001b\006proto3"
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
        }, assigner);
    internal_static_com_lorenzo_Captain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_lorenzo_Captain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lorenzo_Captain_descriptor,
        new java.lang.String[] { "Name", "Race", });
    internal_static_com_lorenzo_SpaceShip_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_lorenzo_SpaceShip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lorenzo_SpaceShip_descriptor,
        new java.lang.String[] { "Name", "Crew", "Cargo", });
    internal_static_com_lorenzo_SpaceStation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_lorenzo_SpaceStation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lorenzo_SpaceStation_descriptor,
        new java.lang.String[] { "Captain", "Spaceships", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}