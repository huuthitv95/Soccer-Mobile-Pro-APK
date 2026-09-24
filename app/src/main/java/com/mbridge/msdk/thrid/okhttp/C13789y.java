package com.mbridge.msdk.thrid.okhttp;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13740f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.y */
/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13789y {

    /* JADX INFO: renamed from: a */
    final C13783s f39277a;

    /* JADX INFO: renamed from: b */
    final String f39278b;

    /* JADX INFO: renamed from: c */
    final C13782r f39279c;

    /* JADX INFO: renamed from: d */
    @Nullable
    final AbstractC13790z f39280d;

    /* JADX INFO: renamed from: e */
    final Map<Class<?>, Object> f39281e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private volatile C13712c f39282f;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.y$a */
    /* JADX INFO: compiled from: Request.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        C13783s f39283a;

        /* JADX INFO: renamed from: b */
        String f39284b;

        /* JADX INFO: renamed from: c */
        C13782r.a f39285c;

        /* JADX INFO: renamed from: d */
        @Nullable
        AbstractC13790z f39286d;

        /* JADX INFO: renamed from: e */
        Map<Class<?>, Object> f39287e;

        public a() {
            this.f39287e = Collections.EMPTY_MAP;
            this.f39284b = "GET";
            this.f39285c = new C13782r.a();
        }

        a(C13789y c13789y) {
            this.f39287e = Collections.EMPTY_MAP;
            this.f39283a = c13789y.f39277a;
            this.f39284b = c13789y.f39278b;
            this.f39286d = c13789y.f39280d;
            this.f39287e = c13789y.f39281e.isEmpty() ? Collections.EMPTY_MAP : new LinkedHashMap<>(c13789y.f39281e);
            this.f39285c = c13789y.f39279c.m40704a();
        }

        /* JADX INFO: renamed from: a */
        public a m40832a(C13712c c13712c) {
            String string = c13712c.toString();
            return string.isEmpty() ? m40836a(HttpHeaders.CACHE_CONTROL) : m40843b(HttpHeaders.CACHE_CONTROL, string);
        }

        /* JADX INFO: renamed from: a */
        public a m40833a(C13782r c13782r) {
            this.f39285c = c13782r.m40704a();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40834a(C13783s c13783s) {
            if (c13783s == null) {
                throw new NullPointerException("url == null");
            }
            this.f39283a = c13783s;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40835a(@Nullable AbstractC13790z abstractC13790z) {
            return m40837a("DELETE", abstractC13790z);
        }

        /* JADX INFO: renamed from: a */
        public a m40836a(String str) {
            this.f39285c.m40713b(str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40837a(String str, @Nullable AbstractC13790z abstractC13790z) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abstractC13790z != null && !C13740f.m40388a(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (abstractC13790z != null || !C13740f.m40391d(str)) {
                this.f39284b = str;
                this.f39286d = abstractC13790z;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        /* JADX INFO: renamed from: a */
        public a m40838a(String str, String str2) {
            this.f39285c.m40711a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13789y m40839a() {
            if (this.f39283a != null) {
                return new C13789y(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX INFO: renamed from: b */
        public a m40840b() {
            return m40835a(C13723c.f38774d);
        }

        /* JADX INFO: renamed from: b */
        public a m40841b(AbstractC13790z abstractC13790z) {
            return m40837a("PATCH", abstractC13790z);
        }

        /* JADX INFO: renamed from: b */
        public a m40842b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return m40834a(C13783s.m40727b(str2));
        }

        /* JADX INFO: renamed from: b */
        public a m40843b(String str, String str2) {
            this.f39285c.m40715c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m40844c() {
            return m40837a("GET", (AbstractC13790z) null);
        }

        /* JADX INFO: renamed from: c */
        public a m40845c(AbstractC13790z abstractC13790z) {
            return m40837a("POST", abstractC13790z);
        }

        /* JADX INFO: renamed from: d */
        public a m40846d() {
            return m40837a("HEAD", (AbstractC13790z) null);
        }

        /* JADX INFO: renamed from: d */
        public a m40847d(AbstractC13790z abstractC13790z) {
            return m40837a("PUT", abstractC13790z);
        }
    }

    C13789y(a aVar) {
        this.f39277a = aVar.f39283a;
        this.f39278b = aVar.f39284b;
        this.f39279c = aVar.f39285c.m40712a();
        this.f39280d = aVar.f39286d;
        this.f39281e = C13723c.m40278a(aVar.f39287e);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public AbstractC13790z m40824a() {
        return this.f39280d;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m40825a(String str) {
        return this.f39279c.m40708b(str);
    }

    /* JADX INFO: renamed from: b */
    public C13712c m40826b() {
        C13712c c13712c = this.f39282f;
        if (c13712c != null) {
            return c13712c;
        }
        C13712c c13712cM40205a = C13712c.m40205a(this.f39279c);
        this.f39282f = c13712cM40205a;
        return c13712cM40205a;
    }

    /* JADX INFO: renamed from: c */
    public C13782r m40827c() {
        return this.f39279c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m40828d() {
        return this.f39277a.m40739h();
    }

    /* JADX INFO: renamed from: e */
    public String m40829e() {
        return this.f39278b;
    }

    /* JADX INFO: renamed from: f */
    public a m40830f() {
        return new a(this);
    }

    /* JADX INFO: renamed from: g */
    public C13783s m40831g() {
        return this.f39277a;
    }

    public String toString() {
        return "Request{method=" + this.f39278b + ", url=" + this.f39277a + ", tags=" + this.f39281e + AbstractJsonLexerKt.END_OBJ;
    }
}
