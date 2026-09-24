package com.chartboost.sdk.impl;

import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vi */
/* JADX INFO: loaded from: classes3.dex */
public final class C4121vi {

    /* JADX INFO: renamed from: a */
    public final Function1 f16630a;

    /* JADX INFO: renamed from: b */
    public final SSLSocketFactory f16631b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16632b = new a();

        public a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b */
    public static abstract class b extends Exception {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: b */
            public static final a f16633b = new a();

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                super("Empty or null URL", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b$b, reason: collision with other inner class name */
        public static final class C15487b extends b {

            /* JADX INFO: renamed from: b */
            public final int f16634b;

            /* JADX WARN: Multi-variable type inference failed */
            public C15487b(int i) {
                super("Failed with HTTP code " + i, null, 2, 0 == true ? 1 : 0);
                this.f16634b = i;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: b */
            public static final c f16635b = new c();

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                super("Returned connection is null", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b$d */
        public static final class d extends b {

            /* JADX INFO: renamed from: b */
            public static final d f16636b = new d();

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                super("Too many redirects", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.vi$b$e */
        public static final class e extends b {

            /* JADX INFO: renamed from: b */
            public final String f16637b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f16637b = url;
            }

            /* JADX INFO: renamed from: a */
            public final String m19719a() {
                return this.f16637b;
            }

            @Override // com.chartboost.sdk.impl.C4121vi.b, java.lang.Throwable
            public String toString() {
                String string;
                Throwable cause = getCause();
                return (cause == null || (string = cause.toString()) == null) ? "No cause" : string;
            }
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ b(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, null);
        }

        public /* synthetic */ b(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            return message == null ? "No message" : message;
        }
    }

    public C4121vi(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        this.f16630a = urlFactory;
        this.f16631b = sslSocket;
    }

    public /* synthetic */ C4121vi(Function1 function1, SSLSocketFactory sSLSocketFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f16632b : function1, (i & 2) != 0 ? AbstractC3838j3.f14864a.m18183a() : sSLSocketFactory);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m19712a(C4121vi c4121vi, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return c4121vi.m19714a(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final Object m19713a(b bVar) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(bVar));
    }

    /* JADX INFO: renamed from: a */
    public final Object m19714a(String str, int i) throws Throwable {
        Object objM19713a;
        HttpsURLConnection httpsURLConnectionM19715a;
        HttpsURLConnection httpsURLConnection = null;
        C4048sb.m19408a("Attempting to redirect url: " + str + ", limit: " + i, (Throwable) null, 2, (Object) null);
        if (str == null || str.length() == 0) {
            Object objM19713a2 = m19713a(b.a.f16633b);
            C4048sb.m19417e("Url is null or empty.", null, 2, null);
            return objM19713a2;
        }
        try {
            if (i < 0) {
                Object objM19713a3 = m19713a(b.d.f16636b);
                C4048sb.m19417e("Too many redirects for url: " + str, null, 2, null);
                return objM19713a3;
            }
            try {
                URL url = (URL) this.f16630a.invoke(str);
                httpsURLConnectionM19715a = m19715a(url);
                try {
                    if (httpsURLConnectionM19715a == null) {
                        objM19713a = m19713a(b.c.f16635b);
                        C4048sb.m19417e("Null connection for url: " + str, null, 2, null);
                    } else if (m19717b(httpsURLConnectionM19715a.getResponseCode())) {
                        Result.Companion companion = Result.INSTANCE;
                        objM19713a = Result.m44946constructorimpl(str);
                        C4048sb.m19408a("Successfully fetched url: " + str, (Throwable) null, 2, (Object) null);
                    } else if (m19716a(httpsURLConnectionM19715a.getResponseCode())) {
                        String headerField = httpsURLConnectionM19715a.getHeaderField(HttpHeaders.LOCATION);
                        Intrinsics.checkNotNull(headerField);
                        if (StringsKt.startsWith$default(headerField, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
                            headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                        }
                        C4048sb.m19408a("Redirecting to: " + headerField, (Throwable) null, 2, (Object) null);
                        objM19713a = m19714a(headerField, i + (-1));
                    } else {
                        objM19713a = m19713a(new b.C15487b(httpsURLConnectionM19715a.getResponseCode()));
                        C4048sb.m19417e("Failed with HTTP code " + httpsURLConnectionM19715a.getResponseCode() + " for url: " + str, null, 2, null);
                    }
                    if (httpsURLConnectionM19715a == null) {
                        return objM19713a;
                    }
                } catch (Exception e) {
                    e = e;
                    httpsURLConnection = httpsURLConnectionM19715a;
                    C4048sb.m19410b("Cannot redirect " + str, e);
                    objM19713a = m19713a(new b.e(str, e));
                    if (httpsURLConnection != null) {
                        httpsURLConnectionM19715a = httpsURLConnection;
                    }
                    return objM19713a;
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnectionM19715a;
                }
            } catch (Exception e2) {
                e = e2;
            }
            httpsURLConnectionM19715a.disconnect();
            return objM19713a;
        } catch (Throwable th2) {
            th = th2;
        }
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final HttpsURLConnection m19715a(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(this.f16631b);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        return httpsURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19716a(int i) {
        return i <= EnumC3729e9.REDIRECTION_END.m17528b() && EnumC3729e9.REDIRECTION_START.m17528b() <= i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19717b(int i) {
        return i <= EnumC3729e9.REQUEST_SUCCESS_END.m17528b() && EnumC3729e9.REQUEST_SUCCESS_START.m17528b() <= i;
    }
}
