package com.fyber.inneractive.sdk.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.s */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9011s implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final C9000q f21106b = new C9000q(AbstractC8972l1.f21065b);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8988o f21107c;

    /* JADX INFO: renamed from: a */
    public int f21108a = 0;

    static {
        f21107c = AbstractC8922d.m21528a() ? new C9006r() : new C8976m();
    }

    /* JADX INFO: renamed from: a */
    public static int m21712a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    /* JADX INFO: renamed from: a */
    public static C9000q m21713a(String str) {
        return new C9000q(str.getBytes(AbstractC8972l1.f21064a));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo21700a(int i, int i2);

    /* JADX INFO: renamed from: a */
    public abstract void mo21668a(int i, byte[] bArr);

    /* JADX INFO: renamed from: a */
    public abstract void mo21701a(AbstractC8964k abstractC8964k);

    /* JADX INFO: renamed from: c */
    public abstract byte mo21669c(int i);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo21702c();

    /* JADX INFO: renamed from: d */
    public abstract byte mo21670d(int i);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC9031w mo21703d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC9011s mo21704e(int i);

    /* JADX INFO: renamed from: e */
    public abstract String mo21705e();

    /* JADX INFO: renamed from: f */
    public final String m21714f() {
        Charset charset = AbstractC8972l1.f21064a;
        return size() == 0 ? "" : mo21705e();
    }

    public final int hashCode() {
        int iMo21700a = this.f21108a;
        if (iMo21700a == 0) {
            int size = size();
            iMo21700a = mo21700a(size, size);
            if (iMo21700a == 0) {
                iMo21700a = 1;
            }
            this.f21108a = iMo21700a;
        }
        return iMo21700a;
    }

    public abstract int size();

    public final String toString() {
        String strM21620a;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strM21620a = AbstractC8950h3.m21620a(this);
        } else {
            strM21620a = AbstractC8950h3.m21620a(mo21704e(47)) + "...";
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + strM21620a + "\">";
    }
}
