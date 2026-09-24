package com.fyber.inneractive.sdk.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.v3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9030v3 extends AbstractC9035w3 {
    public C9030v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final byte mo21754a(long j) {
        return this.f21158a.getByte(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21755a(long j, byte[] bArr, long j2) {
        this.f21158a.copyMemory((Object) null, j, bArr, AbstractC9040x3.f21175f, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21756a(Object obj, long j, byte b) {
        this.f21158a.putByte(obj, j, b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21757a(Object obj, long j, double d) {
        this.f21158a.putDouble(obj, j, d);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21758a(Object obj, long j, float f) {
        this.f21158a.putFloat(obj, j, f);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21759a(Object obj, long j, boolean z) {
        this.f21158a.putBoolean(obj, j, z);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final boolean mo21816a() {
        if (!super.mo21816a()) {
            return false;
        }
        try {
            Class<?> cls = this.f21158a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC9040x3.m21832a(th);
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final boolean mo21760a(Object obj, long j) {
        return this.f21158a.getBoolean(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: b */
    public final byte mo21761b(Object obj, long j) {
        return this.f21158a.getByte(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[PHI: r2
  0x003c: PHI (r2v9 java.lang.reflect.Field) = (r2v5 java.lang.reflect.Field), (r2v12 java.lang.reflect.Field) binds: [B:19:0x0050, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: b */
    public final boolean mo21762b() {
        Field declaredField;
        Unsafe unsafe = this.f21158a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                Field field = null;
                if (AbstractC8922d.m21528a()) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        field = declaredField;
                    } else {
                        try {
                            declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                        } catch (Throwable unused2) {
                            declaredField = null;
                        }
                        if (declaredField != null && declaredField.getType() == Long.TYPE) {
                            field = declaredField;
                        }
                    }
                } else {
                    declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                    if (declaredField != null) {
                        field = declaredField;
                    }
                }
                if (field != null) {
                    try {
                        Class<?> cls3 = this.f21158a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC9040x3.m21832a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC9040x3.m21832a(th2);
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: c */
    public final double mo21763c(Object obj, long j) {
        return this.f21158a.getDouble(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: d */
    public final float mo21764d(Object obj, long j) {
        return this.f21158a.getFloat(obj, j);
    }
}
