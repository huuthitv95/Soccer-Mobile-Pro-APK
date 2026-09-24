package com.chartboost.sdk.impl;

import android.os.Build;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nd */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC3940nd implements Runnable, Comparable {

    /* JADX INFO: renamed from: b */
    public final Executor f15504b;

    /* JADX INFO: renamed from: c */
    public final C3962od f15505c;

    /* JADX INFO: renamed from: d */
    public final C3769g3 f15506d;

    /* JADX INFO: renamed from: e */
    public final C3921mh f15507e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3945ni f15508f;

    /* JADX INFO: renamed from: g */
    public final AbstractC3654b3 f15509g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3888l7 f15510h;

    /* JADX INFO: renamed from: i */
    public C3700d3 f15511i;

    /* JADX INFO: renamed from: j */
    public C3723e3 f15512j;

    /* JADX INFO: renamed from: k */
    public boolean f15513k = true;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.nd$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15514a;

        static {
            int[] iArr = new int[AbstractC3654b3.b.values().length];
            f15514a = iArr;
            try {
                iArr[AbstractC3654b3.b.UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15514a[AbstractC3654b3.b.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RunnableC3940nd(Executor executor, C3962od c3962od, C3769g3 c3769g3, C3921mh c3921mh, InterfaceC3945ni interfaceC3945ni, AbstractC3654b3 abstractC3654b3, InterfaceC3888l7 interfaceC3888l7) {
        this.f15504b = executor;
        this.f15505c = c3962od;
        this.f15506d = c3769g3;
        this.f15507e = c3921mh;
        this.f15508f = interfaceC3945ni;
        this.f15509g = abstractC3654b3;
        this.f15510h = interfaceC3888l7;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18782b(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC3940nd runnableC3940nd) {
        return this.f15509g.m16894d().m19590b() - runnableC3940nd.f15509g.m16894d().m19590b();
    }

    /* JADX INFO: renamed from: a */
    public final long m18784a(HttpsURLConnection httpsURLConnection) {
        return Build.VERSION.SDK_INT < 24 ? httpsURLConnection.getContentLength() : httpsURLConnection.getContentLengthLong();
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m18785a() {
        return C3700d3.m17256a(new CBError(CBError.Internal.INTERNET_UNAVAILABLE, "Internet Unavailable"));
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m18786a(int i) {
        return C3700d3.m17256a(new CBError(CBError.Internal.NETWORK_FAILURE, "Failure due to HTTP status code " + i));
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m18787a(IOException iOException) {
        return C3700d3.m17256a(new CBError(CBError.Internal.NETWORK_FAILURE, iOException.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m18788a(Throwable th) {
        return C3700d3.m17256a(new CBError(CBError.Internal.MISCELLANEOUS, th.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final C3723e3 m18789a(AbstractC3654b3 abstractC3654b3) throws SocketTimeoutException {
        int i = 10000;
        int i2 = 0;
        while (true) {
            try {
                return m18790a(abstractC3654b3, i);
            } catch (SocketTimeoutException e) {
                if (i2 >= 1) {
                    throw e;
                }
                i *= 2;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3723e3 m18790a(AbstractC3654b3 abstractC3654b3, int i) throws IOException {
        this.f15513k = true;
        C3677c3 c3677c3Mo16887a = abstractC3654b3.mo16887a();
        Map map = c3677c3Mo16887a.f13655a;
        HttpsURLConnection httpsURLConnectionM18923a = this.f15505c.m18923a(abstractC3654b3);
        httpsURLConnectionM18923a.setSSLSocketFactory(AbstractC3838j3.m18182a());
        httpsURLConnectionM18923a.setConnectTimeout(i);
        httpsURLConnectionM18923a.setReadTimeout(i);
        httpsURLConnectionM18923a.setUseCaches(false);
        httpsURLConnectionM18923a.setDoInput(true);
        try {
            m18795a(map, httpsURLConnectionM18923a);
            httpsURLConnectionM18923a.setRequestMethod(abstractC3654b3.m16893c().name());
            m18791a(c3677c3Mo16887a, httpsURLConnectionM18923a);
            long jM18682b = this.f15507e.m18682b();
            try {
                int responseCode = httpsURLConnectionM18923a.getResponseCode();
                long jM18682b2 = this.f15507e.m18682b();
                abstractC3654b3.f13519g = jM18682b2 - jM18682b;
                if (responseCode == -1) {
                    throw new IOException("Could not retrieve response code from HttpsURLConnection.");
                }
                C3723e3 c3723e3 = new C3723e3(responseCode, m18796a(httpsURLConnectionM18923a, responseCode, jM18682b2));
                httpsURLConnectionM18923a.disconnect();
                return c3723e3;
            } catch (Throwable th) {
                abstractC3654b3.f13519g = this.f15507e.m18682b() - jM18682b;
                throw th;
            }
        } catch (Throwable th2) {
            httpsURLConnectionM18923a.disconnect();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18791a(C3677c3 c3677c3, HttpsURLConnection httpsURLConnection) throws IOException {
        if (!AbstractC3654b3.c.POST.equals(this.f15509g.m16893c()) || c3677c3.f13656b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(c3677c3.f13656b.length);
        if (c3677c3.m17018a() != null) {
            httpsURLConnection.addRequestProperty("Content-Type", c3677c3.m17018a());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(c3677c3.f13656b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18792a(InterfaceC3807hi interfaceC3807hi, String str) {
        try {
            m18799c();
            this.f15510h.mo43989track(C3954o5.m18874a(interfaceC3807hi, str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18793a(String str) {
        this.f15510h.mo43989track(C3954o5.m18874a(InterfaceC3807hi.h.RESPONSE_DATA_WRITE_ERROR, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m18794a(String str, long j) {
        if (this.f15513k) {
            this.f15513k = false;
            this.f15509g.mo16891a(str, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18795a(Map map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m18796a(HttpsURLConnection httpsURLConnection, int i, long j) {
        byte[] bArrM18798b;
        byte[] bArr = new byte[0];
        try {
            if (m18782b(i)) {
                if (this.f15509g.f13516d != null) {
                    m18800c(httpsURLConnection);
                } else {
                    bArrM18798b = m18798b(httpsURLConnection);
                }
                return bArr;
            }
            bArrM18798b = new byte[0];
            bArr = bArrM18798b;
            return bArr;
        } finally {
            this.f15509g.f13520h = this.f15507e.m18682b() - j;
        }
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Unit m18797b() {
        run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m18798b(HttpsURLConnection httpsURLConnection) {
        InputStream errorStream;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpsURLConnection.getErrorStream();
            }
            InputStream inputStream2 = errorStream;
            byte[] bArrM19384a = inputStream2 != null ? C4041s4.f16220a.m19384a(new BufferedInputStream(inputStream2)) : new byte[0];
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return bArrM19384a;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18799c() {
        AbstractC3654b3 abstractC3654b3 = this.f15509g;
        if (abstractC3654b3 == null || abstractC3654b3.f13516d == null || !(abstractC3654b3 instanceof C3924mk)) {
            return;
        }
        File file = new File(this.f15509g.f13516d.getParentFile(), this.f15509g.f13516d.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18800c(HttpsURLConnection httpsURLConnection) throws IOException {
        File file = new File(this.f15509g.f13516d.getParentFile(), this.f15509g.f13516d.getName() + ".tmp");
        if (this.f15509g instanceof C3924mk) {
            if (file.exists()) {
                return;
            }
            if (!file.createNewFile()) {
                throw new IOException("Video temp file was not created and doesn't exist");
            }
        }
        AbstractC3654b3 abstractC3654b3 = this.f15509g;
        if (abstractC3654b3 instanceof C3924mk) {
            m18794a(abstractC3654b3.m16895e(), m18784a(httpsURLConnection));
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (this.f15509g instanceof C3924mk) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            if (!file.exists()) {
                                throw new IOException("Temp file was deleted during download");
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                } else {
                    C4041s4.f16220a.m19381a(inputStream, fileOutputStream);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (file.renameTo(this.f15509g.f13516d)) {
                    return;
                }
                if (file.delete()) {
                    String str = "Unable to move " + file.getAbsolutePath() + " to " + this.f15509g.f13516d.getAbsolutePath();
                    m18793a(str);
                    throw new IOException(str);
                }
                String str2 = "Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + this.f15509g.f13516d.getAbsolutePath();
                m18793a(str2);
                throw new IOException(str2);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[Catch: all -> 0x012e, TryCatch #6 {all -> 0x012e, blocks: (B:30:0x0097, B:32:0x009f, B:34:0x00ac, B:33:0x00a6, B:47:0x00e3, B:49:0x00eb, B:51:0x00f8, B:50:0x00f2, B:16:0x003a, B:18:0x0042, B:20:0x0050, B:21:0x005b, B:22:0x0068), top: B:68:0x003a, inners: #5, #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[Catch: all -> 0x012e, TryCatch #6 {all -> 0x012e, blocks: (B:30:0x0097, B:32:0x009f, B:34:0x00ac, B:33:0x00a6, B:47:0x00e3, B:49:0x00eb, B:51:0x00f8, B:50:0x00f2, B:16:0x003a, B:18:0x0042, B:20:0x0050, B:21:0x005b, B:22:0x0068), top: B:68:0x003a, inners: #5, #4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        int i;
        C3700d3 c3700d3 = this.f15511i;
        if (c3700d3 != null) {
            try {
                CBError cBError = c3700d3.f13799b;
                if (cBError == null) {
                    this.f15509g.mo16890a(c3700d3.f13798a, this.f15512j);
                    return;
                } else {
                    this.f15509g.mo16889a(cBError, this.f15512j);
                    return;
                }
            } catch (Exception e) {
                C4048sb.m19410b("deliver result: ", e);
                return;
            }
        }
        if (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.f15509g.f13517e, AbstractC3654b3.d.QUEUED, AbstractC3654b3.d.PROCESSING)) {
            return;
        }
        long jM18682b = this.f15507e.m18682b();
        try {
            try {
                if (this.f15506d.m17757e()) {
                    C3723e3 c3723e3M18789a = m18789a(this.f15509g);
                    this.f15512j = c3723e3M18789a;
                    if (c3723e3M18789a.m17475c()) {
                        this.f15511i = this.f15509g.mo16888a(this.f15512j);
                    } else {
                        this.f15511i = m18786a(this.f15512j.m17474b());
                    }
                } else {
                    this.f15511i = m18785a();
                }
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                int i2 = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i2 == 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                this.f15504b.execute(this);
            } catch (InterruptedIOException e2) {
                e = e2;
                if (this.f15506d.m17757e()) {
                    this.f15511i = m18787a(e);
                } else {
                    this.f15511i = m18785a();
                }
                m18792a(InterfaceC3807hi.h.DISPATCHER_EXCEPTION, e.toString());
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                i = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i != 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                } else if (i != 2) {
                }
            } catch (SocketException e3) {
                e = e3;
                if (this.f15506d.m17757e()) {
                    this.f15511i = m18787a(e);
                } else {
                    this.f15511i = m18785a();
                }
                m18792a(InterfaceC3807hi.h.DISPATCHER_EXCEPTION, e.toString());
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                i = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i != 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                } else if (i != 2) {
                }
            } catch (UnknownHostException e4) {
                e = e4;
                if (this.f15506d.m17757e()) {
                    this.f15511i = m18787a(e);
                } else {
                    this.f15511i = m18785a();
                }
                m18792a(InterfaceC3807hi.h.DISPATCHER_EXCEPTION, e.toString());
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                i = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i != 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                } else if (i != 2) {
                }
            } catch (SSLException e5) {
                e = e5;
                if (this.f15506d.m17757e()) {
                    this.f15511i = m18787a(e);
                } else {
                    this.f15511i = m18785a();
                }
                m18792a(InterfaceC3807hi.h.DISPATCHER_EXCEPTION, e.toString());
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                i = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i != 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                } else if (i != 2) {
                }
            } catch (Throwable th) {
                if (this.f15506d.m17757e()) {
                    this.f15511i = m18788a(th);
                } else {
                    this.f15511i = m18785a();
                }
                m18792a(InterfaceC3807hi.h.REQUEST_JSON_SERIALIZATION_ERROR, th.toString());
                this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
                int i3 = a.f15514a[this.f15509g.f13521i.ordinal()];
                if (i3 == 1) {
                    this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.m18797b();
                        }
                    });
                } else if (i3 != 2) {
                }
            }
        } catch (Throwable th2) {
            this.f15509g.f13518f = this.f15507e.m18682b() - jM18682b;
            int i4 = a.f15514a[this.f15509g.f13521i.ordinal()];
            if (i4 == 1) {
                this.f15508f.mo18805a(new Function0() { // from class: com.chartboost.sdk.impl.nd$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f$0.m18797b();
                    }
                });
            } else if (i4 == 2) {
                this.f15504b.execute(this);
            }
            throw th2;
        }
    }
}
