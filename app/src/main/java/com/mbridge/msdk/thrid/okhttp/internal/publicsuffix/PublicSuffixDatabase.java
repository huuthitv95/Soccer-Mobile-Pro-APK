package com.mbridge.msdk.thrid.okhttp.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import com.mbridge.msdk.thrid.okio.C13800j;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    private static final byte[] f39119e = {42};

    /* JADX INFO: renamed from: f */
    private static final String[] f39120f = new String[0];

    /* JADX INFO: renamed from: g */
    private static final String[] f39121g = {ProxyConfig.MATCH_ALL_SCHEMES};

    /* JADX INFO: renamed from: h */
    private static final PublicSuffixDatabase f39122h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f39123a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f39124b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    private byte[] f39125c;

    /* JADX INFO: renamed from: d */
    private byte[] f39126d;

    /* JADX INFO: renamed from: a */
    public static PublicSuffixDatabase m40638a() {
        return f39122h;
    }

    /* JADX INFO: renamed from: a */
    private static String m40639a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, C13723c.f38780j);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String[] m40640a(String[] strArr) {
        String str;
        String strM40639a;
        String strM40639a2;
        if (this.f39123a.get() || !this.f39123a.compareAndSet(false, true)) {
            try {
                this.f39124b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m40642c();
        }
        synchronized (this) {
            if (this.f39125c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = strArr[i].getBytes(C13723c.f38780j);
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                strM40639a = null;
                break;
            }
            strM40639a = m40639a(this.f39125c, bArr, i2);
            if (strM40639a != null) {
                break;
            }
            i2++;
        }
        if (length <= 1) {
            strM40639a2 = null;
            break;
        }
        byte[][] bArr2 = (byte[][]) bArr.clone();
        int i3 = 0;
        while (true) {
            if (i3 >= bArr2.length - 1) {
                strM40639a2 = null;
                break;
            }
            bArr2[i3] = f39119e;
            strM40639a2 = m40639a(this.f39125c, bArr2, i3);
            if (strM40639a2 != null) {
                break;
            }
            i3++;
        }
        if (strM40639a2 != null) {
            for (int i4 = 0; i4 < length - 1; i4++) {
                String strM40639a3 = m40639a(this.f39126d, bArr, i4);
                if (strM40639a3 != null) {
                    str = strM40639a3;
                    break;
                }
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (strM40639a == null && strM40639a2 == null) {
            return f39121g;
        }
        String[] strArrSplit = strM40639a != null ? strM40639a.split("\\.") : f39120f;
        String[] strArrSplit2 = strM40639a2 != null ? strM40639a2.split("\\.") : f39120f;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    /* JADX INFO: renamed from: b */
    private void m40641b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC13795e interfaceC13795eM40944a = C13802l.m40944a(new C13800j(C13802l.m40947a(resourceAsStream)));
        try {
            byte[] bArr = new byte[interfaceC13795eM40944a.readInt()];
            interfaceC13795eM40944a.readFully(bArr);
            byte[] bArr2 = new byte[interfaceC13795eM40944a.readInt()];
            interfaceC13795eM40944a.readFully(bArr2);
            C13723c.m40282a(interfaceC13795eM40944a);
            synchronized (this) {
                this.f39125c = bArr;
                this.f39126d = bArr2;
            }
            this.f39124b.countDown();
        } catch (Throwable th) {
            C13723c.m40282a(interfaceC13795eM40944a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m40642c() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m40641b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C13767g.m40635d().mo40606a(5, "Failed to read public suffix list", e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m40643a(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrM40640a = m40640a(strArrSplit);
        if (strArrSplit.length == strArrM40640a.length && strArrM40640a[0].charAt(0) != '!') {
            return null;
        }
        if (strArrM40640a[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrM40640a.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrM40640a.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i = length - length2; i < strArrSplit2.length; i++) {
            sb.append(strArrSplit2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
