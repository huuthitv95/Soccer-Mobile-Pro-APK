package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.o0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8989o0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f21083a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f21084b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f21084b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21084b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21084b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC8995p0.values().length];
        f21083a = iArr2;
        try {
            iArr2[EnumC8995p0.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21083a[EnumC8995p0.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21083a[EnumC8995p0.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
