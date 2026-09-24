package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final EnumC8995p0 collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id */
    private final int f20970id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    private static /* synthetic */ FieldType[] $values() {
        return new FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        EnumC8995p0 enumC8995p0 = EnumC8995p0.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        DOUBLE = new FieldType("DOUBLE", 0, 0, enumC8995p0, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FLOAT = new FieldType("FLOAT", 1, 1, enumC8995p0, javaType2);
        JavaType javaType3 = JavaType.LONG;
        INT64 = new FieldType("INT64", 2, 2, enumC8995p0, javaType3);
        UINT64 = new FieldType("UINT64", 3, 3, enumC8995p0, javaType3);
        JavaType javaType4 = JavaType.INT;
        INT32 = new FieldType("INT32", 4, 4, enumC8995p0, javaType4);
        FIXED64 = new FieldType("FIXED64", 5, 5, enumC8995p0, javaType3);
        FIXED32 = new FieldType("FIXED32", 6, 6, enumC8995p0, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        BOOL = new FieldType("BOOL", 7, 7, enumC8995p0, javaType5);
        JavaType javaType6 = JavaType.STRING;
        STRING = new FieldType("STRING", 8, 8, enumC8995p0, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        MESSAGE = new FieldType("MESSAGE", 9, 9, enumC8995p0, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        BYTES = new FieldType("BYTES", 10, 10, enumC8995p0, javaType8);
        UINT32 = new FieldType("UINT32", 11, 11, enumC8995p0, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        ENUM = new FieldType("ENUM", 12, 12, enumC8995p0, javaType9);
        SFIXED32 = new FieldType("SFIXED32", 13, 13, enumC8995p0, javaType4);
        SFIXED64 = new FieldType("SFIXED64", 14, 14, enumC8995p0, javaType3);
        SINT32 = new FieldType("SINT32", 15, 15, enumC8995p0, javaType4);
        SINT64 = new FieldType("SINT64", 16, 16, enumC8995p0, javaType3);
        GROUP = new FieldType("GROUP", 17, 17, enumC8995p0, javaType7);
        EnumC8995p0 enumC8995p1 = EnumC8995p0.VECTOR;
        DOUBLE_LIST = new FieldType("DOUBLE_LIST", 18, 18, enumC8995p1, javaType);
        FLOAT_LIST = new FieldType("FLOAT_LIST", 19, 19, enumC8995p1, javaType2);
        INT64_LIST = new FieldType("INT64_LIST", 20, 20, enumC8995p1, javaType3);
        UINT64_LIST = new FieldType("UINT64_LIST", 21, 21, enumC8995p1, javaType3);
        INT32_LIST = new FieldType("INT32_LIST", 22, 22, enumC8995p1, javaType4);
        FIXED64_LIST = new FieldType("FIXED64_LIST", 23, 23, enumC8995p1, javaType3);
        FIXED32_LIST = new FieldType("FIXED32_LIST", 24, 24, enumC8995p1, javaType4);
        BOOL_LIST = new FieldType("BOOL_LIST", 25, 25, enumC8995p1, javaType5);
        STRING_LIST = new FieldType("STRING_LIST", 26, 26, enumC8995p1, javaType6);
        MESSAGE_LIST = new FieldType("MESSAGE_LIST", 27, 27, enumC8995p1, javaType7);
        BYTES_LIST = new FieldType("BYTES_LIST", 28, 28, enumC8995p1, javaType8);
        UINT32_LIST = new FieldType("UINT32_LIST", 29, 29, enumC8995p1, javaType4);
        ENUM_LIST = new FieldType("ENUM_LIST", 30, 30, enumC8995p1, javaType9);
        SFIXED32_LIST = new FieldType("SFIXED32_LIST", 31, 31, enumC8995p1, javaType4);
        SFIXED64_LIST = new FieldType("SFIXED64_LIST", 32, 32, enumC8995p1, javaType3);
        SINT32_LIST = new FieldType("SINT32_LIST", 33, 33, enumC8995p1, javaType4);
        SINT64_LIST = new FieldType("SINT64_LIST", 34, 34, enumC8995p1, javaType3);
        EnumC8995p0 enumC8995p2 = EnumC8995p0.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new FieldType("DOUBLE_LIST_PACKED", 35, 35, enumC8995p2, javaType);
        FLOAT_LIST_PACKED = new FieldType("FLOAT_LIST_PACKED", 36, 36, enumC8995p2, javaType2);
        INT64_LIST_PACKED = new FieldType("INT64_LIST_PACKED", 37, 37, enumC8995p2, javaType3);
        UINT64_LIST_PACKED = new FieldType("UINT64_LIST_PACKED", 38, 38, enumC8995p2, javaType3);
        INT32_LIST_PACKED = new FieldType("INT32_LIST_PACKED", 39, 39, enumC8995p2, javaType4);
        FIXED64_LIST_PACKED = new FieldType("FIXED64_LIST_PACKED", 40, 40, enumC8995p2, javaType3);
        FIXED32_LIST_PACKED = new FieldType("FIXED32_LIST_PACKED", 41, 41, enumC8995p2, javaType4);
        BOOL_LIST_PACKED = new FieldType("BOOL_LIST_PACKED", 42, 42, enumC8995p2, javaType5);
        UINT32_LIST_PACKED = new FieldType("UINT32_LIST_PACKED", 43, 43, enumC8995p2, javaType4);
        ENUM_LIST_PACKED = new FieldType("ENUM_LIST_PACKED", 44, 44, enumC8995p2, javaType9);
        SFIXED32_LIST_PACKED = new FieldType("SFIXED32_LIST_PACKED", 45, 45, enumC8995p2, javaType4);
        SFIXED64_LIST_PACKED = new FieldType("SFIXED64_LIST_PACKED", 46, 46, enumC8995p2, javaType3);
        SINT32_LIST_PACKED = new FieldType("SINT32_LIST_PACKED", 47, 47, enumC8995p2, javaType4);
        SINT64_LIST_PACKED = new FieldType("SINT64_LIST_PACKED", 48, 48, enumC8995p2, javaType3);
        GROUP_LIST = new FieldType("GROUP_LIST", 49, 49, enumC8995p1, javaType7);
        MAP = new FieldType("MAP", 50, 50, EnumC8995p0.MAP, JavaType.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new Type[0];
        FieldType[] fieldTypeArrValues = values();
        VALUES = new FieldType[fieldTypeArrValues.length];
        for (FieldType fieldType : fieldTypeArrValues) {
            VALUES[fieldType.f20970id] = fieldType;
        }
    }

    private FieldType(String str, int i, int i2, EnumC8995p0 enumC8995p0, JavaType javaType) {
        int i3;
        super(str, i);
        this.f20970id = i2;
        this.collection = enumC8995p0;
        this.javaType = javaType;
        int i4 = AbstractC8989o0.f21083a[enumC8995p0.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = javaType.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (enumC8995p0 != EnumC8995p0.SCALAR || (i3 = AbstractC8989o0.f21084b[javaType.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        FieldType[] fieldTypeArr = VALUES;
        if (i >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[i];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    Type type = actualTypeArguments[i2];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= typeParameters.length) {
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            if (type == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                                break;
                            }
                            i3++;
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    /* JADX INFO: renamed from: id */
    public int m21468id() {
        return this.f20970id;
    }

    public boolean isList() {
        return this.collection.m21693a();
    }

    public boolean isMap() {
        return this.collection == EnumC8995p0.MAP;
    }

    public boolean isPacked() {
        return EnumC8995p0.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == EnumC8995p0.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return EnumC8995p0.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
