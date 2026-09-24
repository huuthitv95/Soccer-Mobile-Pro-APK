package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13712c;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13738d;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13739e;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.cache.b */
/* JADX INFO: compiled from: CacheStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13725b {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C13789y f38792a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final C13709a0 f38793b;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.cache.b$a */
    /* JADX INFO: compiled from: CacheStrategy.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        final long f38794a;

        /* JADX INFO: renamed from: b */
        final C13789y f38795b;

        /* JADX INFO: renamed from: c */
        final C13709a0 f38796c;

        /* JADX INFO: renamed from: d */
        private Date f38797d;

        /* JADX INFO: renamed from: e */
        private String f38798e;

        /* JADX INFO: renamed from: f */
        private Date f38799f;

        /* JADX INFO: renamed from: g */
        private String f38800g;

        /* JADX INFO: renamed from: h */
        private Date f38801h;

        /* JADX INFO: renamed from: i */
        private long f38802i;

        /* JADX INFO: renamed from: j */
        private long f38803j;

        /* JADX INFO: renamed from: k */
        private String f38804k;

        /* JADX INFO: renamed from: l */
        private int f38805l;

        public a(long j, C13789y c13789y, C13709a0 c13709a0) {
            this.f38805l = -1;
            this.f38794a = j;
            this.f38795b = c13789y;
            this.f38796c = c13709a0;
            if (c13709a0 != null) {
                this.f38802i = c13709a0.m40178t();
                this.f38803j = c13709a0.m40176r();
                C13782r c13782rM40171m = c13709a0.m40171m();
                int iM40706b = c13782rM40171m.m40706b();
                for (int i = 0; i < iM40706b; i++) {
                    String strM40705a = c13782rM40171m.m40705a(i);
                    String strM40707b = c13782rM40171m.m40707b(i);
                    if (HttpHeaders.DATE.equalsIgnoreCase(strM40705a)) {
                        this.f38797d = C13738d.m40378a(strM40707b);
                        this.f38798e = strM40707b;
                    } else if (HttpHeaders.EXPIRES.equalsIgnoreCase(strM40705a)) {
                        this.f38801h = C13738d.m40378a(strM40707b);
                    } else if (HttpHeaders.LAST_MODIFIED.equalsIgnoreCase(strM40705a)) {
                        this.f38799f = C13738d.m40378a(strM40707b);
                        this.f38800g = strM40707b;
                    } else if ("ETag".equalsIgnoreCase(strM40705a)) {
                        this.f38804k = strM40707b;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(strM40705a)) {
                        this.f38805l = C13739e.m40380a(strM40707b, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private long m40307a() {
            Date date = this.f38797d;
            long jMax = date != null ? Math.max(0L, this.f38803j - date.getTime()) : 0L;
            int i = this.f38805l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f38803j;
            return jMax + (j - this.f38802i) + (this.f38794a - j);
        }

        /* JADX INFO: renamed from: a */
        private static boolean m40308a(C13789y c13789y) {
            return (c13789y.m40825a(HttpHeaders.IF_MODIFIED_SINCE) == null && c13789y.m40825a(HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        /* JADX INFO: renamed from: b */
        private long m40309b() {
            C13712c c13712cM40168h = this.f38796c.m40168h();
            if (c13712cM40168h.m40209d() != -1) {
                return TimeUnit.SECONDS.toMillis(c13712cM40168h.m40209d());
            }
            if (this.f38801h != null) {
                Date date = this.f38797d;
                long time = this.f38801h.getTime() - (date != null ? date.getTime() : this.f38803j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f38799f != null && this.f38796c.m40177s().m40831g().m40742k() == null) {
                Date date2 = this.f38797d;
                long time2 = (date2 != null ? date2.getTime() : this.f38802i) - this.f38799f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: d */
        private C13725b m40310d() {
            String str;
            if (this.f38796c == null) {
                return new C13725b(this.f38795b, null);
            }
            if ((!this.f38795b.m40828d() || this.f38796c.m40170l() != null) && C13725b.m40306a(this.f38796c, this.f38795b)) {
                C13712c c13712cM40826b = this.f38795b.m40826b();
                if (c13712cM40826b.m40213h() || m40308a(this.f38795b)) {
                    return new C13725b(this.f38795b, null);
                }
                C13712c c13712cM40168h = this.f38796c.m40168h();
                long jM40307a = m40307a();
                long jM40309b = m40309b();
                if (c13712cM40826b.m40209d() != -1) {
                    jM40309b = Math.min(jM40309b, TimeUnit.SECONDS.toMillis(c13712cM40826b.m40209d()));
                }
                long millis = 0;
                long millis2 = c13712cM40826b.m40211f() != -1 ? TimeUnit.SECONDS.toMillis(c13712cM40826b.m40211f()) : 0L;
                if (!c13712cM40168h.m40212g() && c13712cM40826b.m40210e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c13712cM40826b.m40210e());
                }
                if (!c13712cM40168h.m40213h()) {
                    long j = millis2 + jM40307a;
                    if (j < millis + jM40309b) {
                        C13709a0.a aVarM40174p = this.f38796c.m40174p();
                        if (j >= jM40309b) {
                            aVarM40174p.m40190a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jM40307a > SignalManager.TWENTY_FOUR_HOURS_MILLIS && m40311e()) {
                            aVarM40174p.m40190a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C13725b(null, aVarM40174p.m40191a());
                    }
                }
                String str2 = this.f38804k;
                if (str2 != null) {
                    str = HttpHeaders.IF_NONE_MATCH;
                } else {
                    if (this.f38799f != null) {
                        str2 = this.f38800g;
                    } else {
                        if (this.f38797d == null) {
                            return new C13725b(this.f38795b, null);
                        }
                        str2 = this.f38798e;
                    }
                    str = HttpHeaders.IF_MODIFIED_SINCE;
                }
                C13782r.a aVarM40704a = this.f38795b.m40827c().m40704a();
                AbstractC13721a.f38769a.mo40259a(aVarM40704a, str, str2);
                return new C13725b(this.f38795b.m40830f().m40833a(aVarM40704a.m40712a()).m40839a(), this.f38796c);
            }
            return new C13725b(this.f38795b, null);
        }

        /* JADX INFO: renamed from: e */
        private boolean m40311e() {
            return this.f38796c.m40168h().m40209d() == -1 && this.f38801h == null;
        }

        /* JADX INFO: renamed from: c */
        public C13725b m40312c() {
            C13725b c13725bM40310d = m40310d();
            return (c13725bM40310d.f38792a == null || !this.f38795b.m40826b().m40215j()) ? c13725bM40310d : new C13725b(null, null);
        }
    }

    C13725b(C13789y c13789y, C13709a0 c13709a0) {
        this.f38792a = c13789y;
        this.f38793b = c13709a0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m40168h().m40207b() == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m40306a(com.mbridge.msdk.thrid.okhttp.C13709a0 r3, com.mbridge.msdk.thrid.okhttp.C13789y r4) {
        /*
            int r0 = r3.m40169k()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m40166b(r0)
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.m40168h()
            int r0 = r0.m40209d()
            r1 = -1
            if (r0 != r1) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.m40168h()
            boolean r0 = r0.m40208c()
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.m40168h()
            boolean r0 = r0.m40207b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            com.mbridge.msdk.thrid.okhttp.c r3 = r3.m40168h()
            boolean r3 = r3.m40214i()
            if (r3 != 0) goto L70
            com.mbridge.msdk.thrid.okhttp.c r3 = r4.m40826b()
            boolean r3 = r3.m40214i()
            if (r3 != 0) goto L70
            r3 = 1
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.cache.C13725b.m40306a(com.mbridge.msdk.thrid.okhttp.a0, com.mbridge.msdk.thrid.okhttp.y):boolean");
    }
}
