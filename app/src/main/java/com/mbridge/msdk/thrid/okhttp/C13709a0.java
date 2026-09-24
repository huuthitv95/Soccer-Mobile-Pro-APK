package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.a0 */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13709a0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a */
    final C13789y f38568a;

    /* JADX INFO: renamed from: b */
    final EnumC13787w f38569b;

    /* JADX INFO: renamed from: c */
    final int f38570c;

    /* JADX INFO: renamed from: d */
    final String f38571d;

    /* JADX INFO: renamed from: e */
    @Nullable
    final C13781q f38572e;

    /* JADX INFO: renamed from: f */
    final C13782r f38573f;

    /* JADX INFO: renamed from: g */
    @Nullable
    final AbstractC13711b0 f38574g;

    /* JADX INFO: renamed from: h */
    @Nullable
    final C13709a0 f38575h;

    /* JADX INFO: renamed from: i */
    @Nullable
    final C13709a0 f38576i;

    /* JADX INFO: renamed from: j */
    @Nullable
    final C13709a0 f38577j;

    /* JADX INFO: renamed from: k */
    final long f38578k;

    /* JADX INFO: renamed from: l */
    final long f38579l;

    /* JADX INFO: renamed from: m */
    @Nullable
    private volatile C13712c f38580m;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.a0$a */
    /* JADX INFO: compiled from: Response.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        C13789y f38581a;

        /* JADX INFO: renamed from: b */
        @Nullable
        EnumC13787w f38582b;

        /* JADX INFO: renamed from: c */
        int f38583c;

        /* JADX INFO: renamed from: d */
        String f38584d;

        /* JADX INFO: renamed from: e */
        @Nullable
        C13781q f38585e;

        /* JADX INFO: renamed from: f */
        C13782r.a f38586f;

        /* JADX INFO: renamed from: g */
        @Nullable
        AbstractC13711b0 f38587g;

        /* JADX INFO: renamed from: h */
        @Nullable
        C13709a0 f38588h;

        /* JADX INFO: renamed from: i */
        @Nullable
        C13709a0 f38589i;

        /* JADX INFO: renamed from: j */
        @Nullable
        C13709a0 f38590j;

        /* JADX INFO: renamed from: k */
        long f38591k;

        /* JADX INFO: renamed from: l */
        long f38592l;

        public a() {
            this.f38583c = -1;
            this.f38586f = new C13782r.a();
        }

        a(C13709a0 c13709a0) {
            this.f38583c = -1;
            this.f38581a = c13709a0.f38568a;
            this.f38582b = c13709a0.f38569b;
            this.f38583c = c13709a0.f38570c;
            this.f38584d = c13709a0.f38571d;
            this.f38585e = c13709a0.f38572e;
            this.f38586f = c13709a0.f38573f.m40704a();
            this.f38587g = c13709a0.f38574g;
            this.f38588h = c13709a0.f38575h;
            this.f38589i = c13709a0.f38576i;
            this.f38590j = c13709a0.f38577j;
            this.f38591k = c13709a0.f38578k;
            this.f38592l = c13709a0.f38579l;
        }

        /* JADX INFO: renamed from: a */
        private void m40179a(String str, C13709a0 c13709a0) {
            if (c13709a0.f38574g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (c13709a0.f38575h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (c13709a0.f38576i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (c13709a0.f38577j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        /* JADX INFO: renamed from: b */
        private void m40180b(C13709a0 c13709a0) {
            if (c13709a0.f38574g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* JADX INFO: renamed from: a */
        public a m40181a(int i) {
            this.f38583c = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40182a(long j) {
            this.f38592l = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40183a(@Nullable C13709a0 c13709a0) {
            if (c13709a0 != null) {
                m40179a("cacheResponse", c13709a0);
            }
            this.f38589i = c13709a0;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40184a(@Nullable AbstractC13711b0 abstractC13711b0) {
            this.f38587g = abstractC13711b0;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40185a(@Nullable C13781q c13781q) {
            this.f38585e = c13781q;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40186a(C13782r c13782r) {
            this.f38586f = c13782r.m40704a();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40187a(EnumC13787w enumC13787w) {
            this.f38582b = enumC13787w;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40188a(C13789y c13789y) {
            this.f38581a = c13789y;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40189a(String str) {
            this.f38584d = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40190a(String str, String str2) {
            this.f38586f.m40711a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13709a0 m40191a() {
            if (this.f38581a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f38582b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f38583c >= 0) {
                if (this.f38584d != null) {
                    return new C13709a0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f38583c);
        }

        /* JADX INFO: renamed from: b */
        public a m40192b(long j) {
            this.f38591k = j;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m40193b(String str, String str2) {
            this.f38586f.m40715c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m40194c(@Nullable C13709a0 c13709a0) {
            if (c13709a0 != null) {
                m40179a("networkResponse", c13709a0);
            }
            this.f38588h = c13709a0;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m40195d(@Nullable C13709a0 c13709a0) {
            if (c13709a0 != null) {
                m40180b(c13709a0);
            }
            this.f38590j = c13709a0;
            return this;
        }
    }

    C13709a0(a aVar) {
        this.f38568a = aVar.f38581a;
        this.f38569b = aVar.f38582b;
        this.f38570c = aVar.f38583c;
        this.f38571d = aVar.f38584d;
        this.f38572e = aVar.f38585e;
        this.f38573f = aVar.f38586f.m40712a();
        this.f38574g = aVar.f38587g;
        this.f38575h = aVar.f38588h;
        this.f38576i = aVar.f38589i;
        this.f38577j = aVar.f38590j;
        this.f38578k = aVar.f38591k;
        this.f38579l = aVar.f38592l;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m40165a(String str, @Nullable String str2) {
        String strM40708b = this.f38573f.m40708b(str);
        return strM40708b != null ? strM40708b : str2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public String m40166b(String str) {
        return m40165a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC13711b0 abstractC13711b0 = this.f38574g;
        if (abstractC13711b0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC13711b0.close();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public AbstractC13711b0 m40167d() {
        return this.f38574g;
    }

    /* JADX INFO: renamed from: h */
    public C13712c m40168h() {
        C13712c c13712c = this.f38580m;
        if (c13712c != null) {
            return c13712c;
        }
        C13712c c13712cM40205a = C13712c.m40205a(this.f38573f);
        this.f38580m = c13712cM40205a;
        return c13712cM40205a;
    }

    /* JADX INFO: renamed from: k */
    public int m40169k() {
        return this.f38570c;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public C13781q m40170l() {
        return this.f38572e;
    }

    /* JADX INFO: renamed from: m */
    public C13782r m40171m() {
        return this.f38573f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m40172n() {
        int i = this.f38570c;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: o */
    public String m40173o() {
        return this.f38571d;
    }

    /* JADX INFO: renamed from: p */
    public a m40174p() {
        return new a(this);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public C13709a0 m40175q() {
        return this.f38577j;
    }

    /* JADX INFO: renamed from: r */
    public long m40176r() {
        return this.f38579l;
    }

    /* JADX INFO: renamed from: s */
    public C13789y m40177s() {
        return this.f38568a;
    }

    /* JADX INFO: renamed from: t */
    public long m40178t() {
        return this.f38578k;
    }

    public String toString() {
        return "Response{protocol=" + this.f38569b + ", code=" + this.f38570c + ", message=" + this.f38571d + ", url=" + this.f38568a.m40831g() + AbstractJsonLexerKt.END_OBJ;
    }
}
