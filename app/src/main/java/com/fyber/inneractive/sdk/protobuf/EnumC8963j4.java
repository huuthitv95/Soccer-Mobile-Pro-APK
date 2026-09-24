package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.j4 */
/* JADX INFO: loaded from: classes4.dex */
public class EnumC8963j4 {
    private static final /* synthetic */ EnumC8963j4[] $VALUES;
    public static final EnumC8963j4 BOOL;
    public static final EnumC8963j4 BYTES;
    public static final EnumC8963j4 DOUBLE;
    public static final EnumC8963j4 ENUM;
    public static final EnumC8963j4 FIXED32;
    public static final EnumC8963j4 FIXED64;
    public static final EnumC8963j4 FLOAT;
    public static final EnumC8963j4 GROUP;
    public static final EnumC8963j4 INT32;
    public static final EnumC8963j4 INT64;
    public static final EnumC8963j4 MESSAGE;
    public static final EnumC8963j4 SFIXED32;
    public static final EnumC8963j4 SFIXED64;
    public static final EnumC8963j4 SINT32;
    public static final EnumC8963j4 SINT64;
    public static final EnumC8963j4 STRING;
    public static final EnumC8963j4 UINT32;
    public static final EnumC8963j4 UINT64;
    private final EnumC8969k4 javaType;
    private final int wireType;

    static {
        EnumC8963j4 enumC8963j4 = new EnumC8963j4("DOUBLE", 0, EnumC8969k4.DOUBLE, 1);
        DOUBLE = enumC8963j4;
        EnumC8963j4 enumC8963j5 = new EnumC8963j4("FLOAT", 1, EnumC8969k4.FLOAT, 5);
        FLOAT = enumC8963j5;
        EnumC8969k4 enumC8969k4 = EnumC8969k4.LONG;
        EnumC8963j4 enumC8963j6 = new EnumC8963j4("INT64", 2, enumC8969k4, 0);
        INT64 = enumC8963j6;
        EnumC8963j4 enumC8963j7 = new EnumC8963j4("UINT64", 3, enumC8969k4, 0);
        UINT64 = enumC8963j7;
        EnumC8969k4 enumC8969k5 = EnumC8969k4.INT;
        EnumC8963j4 enumC8963j8 = new EnumC8963j4("INT32", 4, enumC8969k5, 0);
        INT32 = enumC8963j8;
        EnumC8963j4 enumC8963j9 = new EnumC8963j4("FIXED64", 5, enumC8969k4, 1);
        FIXED64 = enumC8963j9;
        EnumC8963j4 enumC8963j10 = new EnumC8963j4("FIXED32", 6, enumC8969k5, 5);
        FIXED32 = enumC8963j10;
        EnumC8963j4 enumC8963j11 = new EnumC8963j4("BOOL", 7, EnumC8969k4.BOOLEAN, 0);
        BOOL = enumC8963j11;
        C8939f4 c8939f4 = new C8939f4(EnumC8969k4.STRING);
        STRING = c8939f4;
        final EnumC8969k4 enumC8969k6 = EnumC8969k4.MESSAGE;
        EnumC8963j4 enumC8963j12 = new EnumC8963j4(enumC8969k6) { // from class: com.fyber.inneractive.sdk.protobuf.g4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8963j4
            /* JADX INFO: renamed from: c */
            public final boolean mo21559c() {
                return false;
            }
        };
        GROUP = enumC8963j12;
        EnumC8963j4 enumC8963j13 = new EnumC8963j4(enumC8969k6) { // from class: com.fyber.inneractive.sdk.protobuf.h4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8963j4
            /* JADX INFO: renamed from: c */
            public final boolean mo21559c() {
                return false;
            }
        };
        MESSAGE = enumC8963j13;
        final EnumC8969k4 enumC8969k7 = EnumC8969k4.BYTE_STRING;
        EnumC8963j4 enumC8963j14 = new EnumC8963j4(enumC8969k7) { // from class: com.fyber.inneractive.sdk.protobuf.i4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8963j4
            /* JADX INFO: renamed from: c */
            public final boolean mo21559c() {
                return false;
            }
        };
        BYTES = enumC8963j14;
        EnumC8963j4 enumC8963j15 = new EnumC8963j4("UINT32", 12, enumC8969k5, 0);
        UINT32 = enumC8963j15;
        EnumC8963j4 enumC8963j16 = new EnumC8963j4("ENUM", 13, EnumC8969k4.ENUM, 0);
        ENUM = enumC8963j16;
        EnumC8963j4 enumC8963j17 = new EnumC8963j4("SFIXED32", 14, enumC8969k5, 5);
        SFIXED32 = enumC8963j17;
        EnumC8963j4 enumC8963j18 = new EnumC8963j4("SFIXED64", 15, enumC8969k4, 1);
        SFIXED64 = enumC8963j18;
        EnumC8963j4 enumC8963j19 = new EnumC8963j4("SINT32", 16, enumC8969k5, 0);
        SINT32 = enumC8963j19;
        EnumC8963j4 enumC8963j20 = new EnumC8963j4("SINT64", 17, enumC8969k4, 0);
        SINT64 = enumC8963j20;
        $VALUES = new EnumC8963j4[]{enumC8963j4, enumC8963j5, enumC8963j6, enumC8963j7, enumC8963j8, enumC8963j9, enumC8963j10, enumC8963j11, c8939f4, enumC8963j12, enumC8963j13, enumC8963j14, enumC8963j15, enumC8963j16, enumC8963j17, enumC8963j18, enumC8963j19, enumC8963j20};
    }

    public EnumC8963j4(String str, int i, EnumC8969k4 enumC8969k4, int i2) {
        super(str, i);
        this.javaType = enumC8969k4;
        this.wireType = i2;
    }

    public EnumC8963j4(String str, int i, EnumC8969k4 enumC8969k4, int i2, int i3) {
        super(str, i);
        this.javaType = enumC8969k4;
        this.wireType = i2;
    }

    public static EnumC8963j4 valueOf(String str) {
        return (EnumC8963j4) Enum.valueOf(EnumC8963j4.class, str);
    }

    public static EnumC8963j4[] values() {
        return (EnumC8963j4[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC8969k4 m21661a() {
        return this.javaType;
    }

    /* JADX INFO: renamed from: b */
    public final int m21662b() {
        return this.wireType;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo21559c() {
        return !(this instanceof C8939f4);
    }
}
