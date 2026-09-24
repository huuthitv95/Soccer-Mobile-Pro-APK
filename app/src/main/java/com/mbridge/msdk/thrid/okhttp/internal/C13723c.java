package com.mbridge.msdk.thrid.okhttp.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.C11744X3;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13749c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.c */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13723c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f38771a;

    /* JADX INFO: renamed from: c */
    public static final AbstractC13711b0 f38773c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC13790z f38774d;

    /* JADX INFO: renamed from: r */
    private static final Method f38788r;

    /* JADX INFO: renamed from: s */
    private static final Pattern f38789s;

    /* JADX INFO: renamed from: b */
    public static final String[] f38772b = new String[0];

    /* JADX INFO: renamed from: e */
    private static final C13796f f38775e = C13796f.m40908a("efbbbf");

    /* JADX INFO: renamed from: f */
    private static final C13796f f38776f = C13796f.m40908a("feff");

    /* JADX INFO: renamed from: g */
    private static final C13796f f38777g = C13796f.m40908a("fffe");

    /* JADX INFO: renamed from: h */
    private static final C13796f f38778h = C13796f.m40908a("0000ffff");

    /* JADX INFO: renamed from: i */
    private static final C13796f f38779i = C13796f.m40908a("ffff0000");

    /* JADX INFO: renamed from: j */
    public static final Charset f38780j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k */
    public static final Charset f38781k = Charset.forName(C9415C.ISO88591_NAME);

    /* JADX INFO: renamed from: l */
    private static final Charset f38782l = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: m */
    private static final Charset f38783m = Charset.forName(C9415C.UTF16LE_NAME);

    /* JADX INFO: renamed from: n */
    private static final Charset f38784n = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: o */
    private static final Charset f38785o = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: p */
    public static final TimeZone f38786p = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: q */
    public static final Comparator<String> f38787q = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.c$a */
    /* JADX INFO: compiled from: Util.java */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.c$b */
    /* JADX INFO: compiled from: Util.java */
    static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f38790a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f38791b;

        b(String str, boolean z) {
            this.f38790a = str;
            this.f38791b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f38790a);
            thread.setDaemon(this.f38791b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f38771a = bArr;
        Method declaredMethod = null;
        f38773c = AbstractC13711b0.m40198a(null, bArr);
        f38774d = AbstractC13790z.m40848a(null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f38788r = declaredMethod;
        f38789s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: a */
    public static int m40264a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: a */
    public static int m40265a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m40266a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m40267a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    /* JADX INFO: renamed from: a */
    public static int m40268a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static AssertionError m40269a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX INFO: renamed from: a */
    public static String m40270a(C13783s c13783s, boolean z) {
        String strM40738g;
        if (c13783s.m40738g().contains(CertificateUtil.DELIMITER)) {
            strM40738g = C11744X3.j.f26438d + c13783s.m40738g() + C11744X3.j.f26440e;
        } else {
            strM40738g = c13783s.m40738g();
        }
        if (!z && c13783s.m40741j() == C13783s.m40716a(c13783s.m40744m())) {
            return strM40738g;
        }
        return strM40738g + CertificateUtil.DELIMITER + c13783s.m40741j();
    }

    /* JADX INFO: renamed from: a */
    public static String m40271a(String str) {
        if (!str.contains(CertificateUtil.DELIMITER)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || m40294b(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM40274a = (str.startsWith(C11744X3.j.f26438d) && str.endsWith(C11744X3.j.f26440e)) ? m40274a(str, 1, str.length() - 1) : m40274a(str, 0, str.length());
        if (inetAddressM40274a == null) {
            return null;
        }
        byte[] address = inetAddressM40274a.getAddress();
        if (address.length == 16) {
            return m40273a(address);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    /* JADX INFO: renamed from: a */
    public static String m40272a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    private static String m40273a(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C13793c c13793c = new C13793c();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c13793c.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c13793c.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c13793c.writeByte(58);
                }
                c13793c.mo40872a(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c13793c.m40904p();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
    @Nullable
    /* JADX INFO: renamed from: a */
    private static InetAddress m40274a(String str, int i, int i2) {
        int i3;
        int i4;
        int iM40264a;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i3 = 0;
                i = i7;
                while (i < i2) {
                    iM40264a = m40264a(str.charAt(i));
                    if (iM40264a == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM40264a;
                    i++;
                }
                i4 = i - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, CertificateUtil.DELIMITER, 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1) || !m40288a(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    }
                    i5 += 2;
                    break;
                }
                i++;
            }
            i7 = i;
            i3 = 0;
            i = i7;
            while (i < i2) {
                iM40264a = m40264a(str.charAt(i));
                if (iM40264a == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM40264a;
                i++;
            }
            i4 = i - i7;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            int i9 = i5 + 1;
            bArr[i5] = (byte) ((i3 >>> 8) & 255);
            i5 += 2;
            bArr[i9] = (byte) (i3 & 255);
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i10 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Charset m40275a(InterfaceC13795e interfaceC13795e, Charset charset) throws IOException {
        C13796f c13796f = f38775e;
        if (interfaceC13795e.mo40877a(0L, c13796f)) {
            interfaceC13795e.skip(c13796f.mo40923j());
            return f38780j;
        }
        C13796f c13796f2 = f38776f;
        if (interfaceC13795e.mo40877a(0L, c13796f2)) {
            interfaceC13795e.skip(c13796f2.mo40923j());
            return f38782l;
        }
        C13796f c13796f3 = f38777g;
        if (interfaceC13795e.mo40877a(0L, c13796f3)) {
            interfaceC13795e.skip(c13796f3.mo40923j());
            return f38783m;
        }
        C13796f c13796f4 = f38778h;
        if (interfaceC13795e.mo40877a(0L, c13796f4)) {
            interfaceC13795e.skip(c13796f4.mo40923j());
            return f38784n;
        }
        C13796f c13796f5 = f38779i;
        if (!interfaceC13795e.mo40877a(0L, c13796f5)) {
            return charset;
        }
        interfaceC13795e.skip(c13796f5.mo40923j());
        return f38785o;
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m40276a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m40277a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m40278a(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m40279a(String str, boolean z) {
        return new b(str, z);
    }

    /* JADX INFO: renamed from: a */
    public static X509TrustManager m40280a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m40269a("No System TLS", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40281a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40282a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40283a(Throwable th, Throwable th2) {
        Method method = f38788r;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40284a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m40286a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40285a(InterfaceC13809s interfaceC13809s, int i, TimeUnit timeUnit) {
        try {
            return m40293b(interfaceC13809s, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40286a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40287a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m40288a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m40289a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a */
    public static String[] m40290a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int m40291b(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static C13782r m40292b(List<C13749c> list) {
        C13782r.a aVar = new C13782r.a();
        for (C13749c c13749c : list) {
            AbstractC13721a.f38769a.mo40259a(aVar, c13749c.f38929a.mo40926m(), c13749c.f38930b.mo40926m());
        }
        return aVar.m40712a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40293b(InterfaceC13809s interfaceC13809s, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jMo40933c = interfaceC13809s.mo40428b().mo40934d() ? interfaceC13809s.mo40428b().mo40933c() - jNanoTime : Long.MAX_VALUE;
        interfaceC13809s.mo40428b().mo40930a(Math.min(jMo40933c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C13793c c13793c = new C13793c();
            while (interfaceC13809s.mo40427b(c13793c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c13793c.m40899k();
            }
            if (jMo40933c == Long.MAX_VALUE) {
                interfaceC13809s.mo40428b().mo40929a();
                return true;
            }
            interfaceC13809s.mo40428b().mo40930a(jNanoTime + jMo40933c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo40933c == Long.MAX_VALUE) {
                interfaceC13809s.mo40428b().mo40929a();
                return false;
            }
            interfaceC13809s.mo40428b().mo40930a(jNanoTime + jMo40933c);
            return false;
        } catch (Throwable th) {
            if (jMo40933c == Long.MAX_VALUE) {
                interfaceC13809s.mo40428b().mo40929a();
            } else {
                interfaceC13809s.mo40428b().mo40930a(jNanoTime + jMo40933c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m40294b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40295b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static int m40296c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m40297c(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static String m40298d(String str, int i, int i2) {
        int iM40291b = m40291b(str, i, i2);
        return str.substring(iM40291b, m40297c(str, iM40291b, i2));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m40299d(String str) {
        return f38789s.matcher(str).matches();
    }
}
