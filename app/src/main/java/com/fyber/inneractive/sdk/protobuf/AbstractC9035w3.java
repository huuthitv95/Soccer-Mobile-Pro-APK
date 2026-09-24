package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.w3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9035w3 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f21158a;

    public AbstractC9035w3(Unsafe unsafe) {
        this.f21158a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo21754a(long j);

    /* JADX INFO: renamed from: a */
    public abstract void mo21755a(long j, byte[] bArr, long j2);

    /* JADX INFO: renamed from: a */
    public abstract void mo21756a(Object obj, long j, byte b);

    /* JADX INFO: renamed from: a */
    public abstract void mo21757a(Object obj, long j, double d);

    /* JADX INFO: renamed from: a */
    public abstract void mo21758a(Object obj, long j, float f);

    /* JADX INFO: renamed from: a */
    public abstract void mo21759a(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: a */
    public boolean mo21816a() {
        Unsafe unsafe = this.f21158a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC9040x3.m21832a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo21760a(Object obj, long j);

    /* JADX INFO: renamed from: b */
    public abstract byte mo21761b(Object obj, long j);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo21762b();

    /* JADX INFO: renamed from: c */
    public abstract double mo21763c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract float mo21764d(Object obj, long j);
}
