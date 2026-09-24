package com.mbridge.msdk.thrid.okhttp;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13739e;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.c */
/* JADX INFO: compiled from: CacheControl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13712c {

    /* JADX INFO: renamed from: n */
    public static final C13712c f38597n = new a().m40218b().m40217a();

    /* JADX INFO: renamed from: o */
    public static final C13712c f38598o = new a().m40219c().m40216a(Integer.MAX_VALUE, TimeUnit.SECONDS).m40217a();

    /* JADX INFO: renamed from: a */
    private final boolean f38599a;

    /* JADX INFO: renamed from: b */
    private final boolean f38600b;

    /* JADX INFO: renamed from: c */
    private final int f38601c;

    /* JADX INFO: renamed from: d */
    private final int f38602d;

    /* JADX INFO: renamed from: e */
    private final boolean f38603e;

    /* JADX INFO: renamed from: f */
    private final boolean f38604f;

    /* JADX INFO: renamed from: g */
    private final boolean f38605g;

    /* JADX INFO: renamed from: h */
    private final int f38606h;

    /* JADX INFO: renamed from: i */
    private final int f38607i;

    /* JADX INFO: renamed from: j */
    private final boolean f38608j;

    /* JADX INFO: renamed from: k */
    private final boolean f38609k;

    /* JADX INFO: renamed from: l */
    private final boolean f38610l;

    /* JADX INFO: renamed from: m */
    @Nullable
    String f38611m;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.c$a */
    /* JADX INFO: compiled from: CacheControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        boolean f38612a;

        /* JADX INFO: renamed from: b */
        boolean f38613b;

        /* JADX INFO: renamed from: c */
        int f38614c = -1;

        /* JADX INFO: renamed from: d */
        int f38615d = -1;

        /* JADX INFO: renamed from: e */
        int f38616e = -1;

        /* JADX INFO: renamed from: f */
        boolean f38617f;

        /* JADX INFO: renamed from: g */
        boolean f38618g;

        /* JADX INFO: renamed from: h */
        boolean f38619h;

        /* JADX INFO: renamed from: a */
        public a m40216a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f38615d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* JADX INFO: renamed from: a */
        public C13712c m40217a() {
            return new C13712c(this);
        }

        /* JADX INFO: renamed from: b */
        public a m40218b() {
            this.f38612a = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m40219c() {
            this.f38617f = true;
            return this;
        }
    }

    C13712c(a aVar) {
        this.f38599a = aVar.f38612a;
        this.f38600b = aVar.f38613b;
        this.f38601c = aVar.f38614c;
        this.f38602d = -1;
        this.f38603e = false;
        this.f38604f = false;
        this.f38605g = false;
        this.f38606h = aVar.f38615d;
        this.f38607i = aVar.f38616e;
        this.f38608j = aVar.f38617f;
        this.f38609k = aVar.f38618g;
        this.f38610l = aVar.f38619h;
    }

    private C13712c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f38599a = z;
        this.f38600b = z2;
        this.f38601c = i;
        this.f38602d = i2;
        this.f38603e = z3;
        this.f38604f = z4;
        this.f38605g = z5;
        this.f38606h = i3;
        this.f38607i = i4;
        this.f38608j = z6;
        this.f38609k = z7;
        this.f38610l = z8;
        this.f38611m = str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:0x0133 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C13712c m40205a(C13782r c13782r) {
        int i;
        int iM40381a;
        String strTrim;
        int iM40381a2;
        String strTrim2;
        C13782r c13782r2 = c13782r;
        int iM40706b = c13782r2.m40706b();
        int i2 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM40380a = -1;
        int iM40380a2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM40380a3 = -1;
        int iM40380a4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i2 < iM40706b) {
            String strM40705a = c13782r2.m40705a(i2);
            String strM40707b = c13782r2.m40707b(i2);
            if (strM40705a.equalsIgnoreCase(HttpHeaders.CACHE_CONTROL)) {
                if (str == null) {
                    str = strM40707b;
                }
                for (i = 0; i < strM40707b.length(); i = iM40381a2) {
                    iM40381a = C13739e.m40381a(strM40707b, i, "=,;");
                    strTrim = strM40707b.substring(i, iM40381a).trim();
                    if (iM40381a != strM40707b.length() || strM40707b.charAt(iM40381a) == ',' || strM40707b.charAt(iM40381a) == ';') {
                        iM40381a2 = iM40381a + 1;
                        strTrim2 = null;
                    } else {
                        int iM40386b = C13739e.m40386b(strM40707b, iM40381a + 1);
                        if (iM40386b >= strM40707b.length() || strM40707b.charAt(iM40386b) != '\"') {
                            iM40381a2 = C13739e.m40381a(strM40707b, iM40386b, ",;");
                            strTrim2 = strM40707b.substring(iM40386b, iM40381a2).trim();
                        } else {
                            int i3 = iM40386b + 1;
                            int iM40381a3 = C13739e.m40381a(strM40707b, i3, "\"");
                            strTrim2 = strM40707b.substring(i3, iM40381a3);
                            iM40381a2 = iM40381a3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iM40380a = C13739e.m40380a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iM40380a2 = C13739e.m40380a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iM40380a3 = C13739e.m40380a(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iM40380a4 = C13739e.m40380a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z9 = true;
                        }
                    }
                }
                i2++;
                c13782r2 = c13782r;
            } else {
                if (strM40705a.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                }
                i2++;
                c13782r2 = c13782r;
            }
            z = false;
            while (i < strM40707b.length()) {
                iM40381a = C13739e.m40381a(strM40707b, i, "=,;");
                strTrim = strM40707b.substring(i, iM40381a).trim();
                if (iM40381a != strM40707b.length()) {
                    iM40381a2 = iM40381a + 1;
                    strTrim2 = null;
                } else {
                    iM40381a2 = iM40381a + 1;
                    strTrim2 = null;
                }
                if ("no-cache".equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iM40380a = C13739e.m40380a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iM40380a2 = C13739e.m40380a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iM40380a3 = C13739e.m40380a(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iM40380a4 = C13739e.m40380a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    }
                }
            }
            i2++;
            c13782r2 = c13782r;
        }
        return new C13712c(z2, z3, iM40380a, iM40380a2, z4, z5, z6, iM40380a3, iM40380a4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: a */
    private String m40206a() {
        StringBuilder sb = new StringBuilder();
        if (this.f38599a) {
            sb.append("no-cache, ");
        }
        if (this.f38600b) {
            sb.append("no-store, ");
        }
        if (this.f38601c != -1) {
            sb.append("max-age=");
            sb.append(this.f38601c);
            sb.append(", ");
        }
        if (this.f38602d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f38602d);
            sb.append(", ");
        }
        if (this.f38603e) {
            sb.append("private, ");
        }
        if (this.f38604f) {
            sb.append("public, ");
        }
        if (this.f38605g) {
            sb.append("must-revalidate, ");
        }
        if (this.f38606h != -1) {
            sb.append("max-stale=");
            sb.append(this.f38606h);
            sb.append(", ");
        }
        if (this.f38607i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f38607i);
            sb.append(", ");
        }
        if (this.f38608j) {
            sb.append("only-if-cached, ");
        }
        if (this.f38609k) {
            sb.append("no-transform, ");
        }
        if (this.f38610l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m40207b() {
        return this.f38603e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m40208c() {
        return this.f38604f;
    }

    /* JADX INFO: renamed from: d */
    public int m40209d() {
        return this.f38601c;
    }

    /* JADX INFO: renamed from: e */
    public int m40210e() {
        return this.f38606h;
    }

    /* JADX INFO: renamed from: f */
    public int m40211f() {
        return this.f38607i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m40212g() {
        return this.f38605g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m40213h() {
        return this.f38599a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m40214i() {
        return this.f38600b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m40215j() {
        return this.f38608j;
    }

    public String toString() {
        String str = this.f38611m;
        if (str != null) {
            return str;
        }
        String strM40206a = m40206a();
        this.f38611m = strM40206a;
        return strM40206a;
    }
}
