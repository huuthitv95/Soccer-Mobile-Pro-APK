package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.b0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8911b0 extends AbstractC8964k {

    /* JADX INFO: renamed from: b */
    public static final Logger f20983b = Logger.getLogger(AbstractC8911b0.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f20984c = AbstractC9040x3.f21174e;

    /* JADX INFO: renamed from: a */
    public C8917c0 f20985a;

    /* JADX INFO: renamed from: a */
    public static int m21510a(int i) {
        if (i >= 0) {
            return m21516c(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: a */
    public static int m21511a(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: a */
    public static int m21512a(AbstractC9011s abstractC9011s) {
        int size = abstractC9011s.size();
        return m21516c(size) + size;
    }

    /* JADX INFO: renamed from: a */
    public static int m21513a(String str) {
        int length;
        try {
            length = AbstractC8927d4.m21533a(str);
        } catch (C8915b4 unused) {
            length = str.getBytes(AbstractC8972l1.f21064a).length;
        }
        return m21516c(length) + length;
    }

    /* JADX INFO: renamed from: b */
    public static int m21514b(int i) {
        return m21516c(i << 3);
    }

    /* JADX INFO: renamed from: b */
    public static long m21515b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: c */
    public static int m21516c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: d */
    public static int m21517d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21473a(byte b);

    /* JADX INFO: renamed from: a */
    public abstract void mo21474a(int i, int i2);

    /* JADX INFO: renamed from: a */
    public abstract void mo21475a(int i, long j);

    /* JADX INFO: renamed from: a */
    public abstract void mo21476a(int i, InterfaceC8925d2 interfaceC8925d2);

    /* JADX INFO: renamed from: a */
    public abstract void mo21477a(int i, InterfaceC8925d2 interfaceC8925d2, InterfaceC9019t2 interfaceC9019t2);

    /* JADX INFO: renamed from: a */
    public abstract void mo21478a(int i, AbstractC9011s abstractC9011s);

    /* JADX INFO: renamed from: a */
    public abstract void mo21479a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo21481a(String str, int i);

    /* JADX INFO: renamed from: a */
    public final void m21518a(String str, C8915b4 c8915b4) throws C9046z {
        f20983b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c8915b4);
        byte[] bytes = str.getBytes(AbstractC8972l1.f21064a);
        try {
            mo21498g(bytes.length);
            mo21482a(bytes, 0, bytes.length);
        } catch (C9046z e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C9046z(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo21483b(int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo21484b(int i, long j);

    /* JADX INFO: renamed from: b */
    public abstract void mo21485b(int i, AbstractC9011s abstractC9011s);

    /* JADX INFO: renamed from: c */
    public abstract void mo21489c(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract void mo21490c(long j);

    /* JADX INFO: renamed from: d */
    public abstract void mo21491d(int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract void mo21492d(long j);

    /* JADX INFO: renamed from: e */
    public abstract void mo21493e(int i);

    /* JADX INFO: renamed from: f */
    public abstract void mo21496f(int i);

    /* JADX INFO: renamed from: g */
    public abstract void mo21498g(int i);
}
