package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11401Db;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.d */
/* JADX INFO: compiled from: Hpack.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13750d {

    /* JADX INFO: renamed from: a */
    static final C13749c[] f38932a;

    /* JADX INFO: renamed from: b */
    static final Map<C13796f, Integer> f38933b;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.d$a */
    /* JADX INFO: compiled from: Hpack.java */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final List<C13749c> f38934a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC13795e f38935b;

        /* JADX INFO: renamed from: c */
        private final int f38936c;

        /* JADX INFO: renamed from: d */
        private int f38937d;

        /* JADX INFO: renamed from: e */
        C13749c[] f38938e;

        /* JADX INFO: renamed from: f */
        int f38939f;

        /* JADX INFO: renamed from: g */
        int f38940g;

        /* JADX INFO: renamed from: h */
        int f38941h;

        a(int i, int i2, InterfaceC13809s interfaceC13809s) {
            this.f38934a = new ArrayList();
            this.f38938e = new C13749c[8];
            this.f38939f = 7;
            this.f38940g = 0;
            this.f38941h = 0;
            this.f38936c = i;
            this.f38937d = i2;
            this.f38935b = C13802l.m40944a(interfaceC13809s);
        }

        a(int i, InterfaceC13809s interfaceC13809s) {
            this(i, i, interfaceC13809s);
        }

        /* JADX INFO: renamed from: a */
        private int m40434a(int i) {
            return this.f38939f + 1 + i;
        }

        /* JADX INFO: renamed from: a */
        private void m40435a() {
            int i = this.f38937d;
            int i2 = this.f38941h;
            if (i < i2) {
                if (i == 0) {
                    m40438b();
                } else {
                    m40437b(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m40436a(int i, C13749c c13749c) {
            this.f38934a.add(c13749c);
            int i2 = c13749c.f38931c;
            if (i != -1) {
                i2 -= this.f38938e[m40434a(i)].f38931c;
            }
            int i3 = this.f38937d;
            if (i2 > i3) {
                m40438b();
                return;
            }
            int iM40437b = m40437b((this.f38941h + i2) - i3);
            if (i == -1) {
                int i4 = this.f38940g + 1;
                C13749c[] c13749cArr = this.f38938e;
                if (i4 > c13749cArr.length) {
                    C13749c[] c13749cArr2 = new C13749c[c13749cArr.length * 2];
                    System.arraycopy(c13749cArr, 0, c13749cArr2, c13749cArr.length, c13749cArr.length);
                    this.f38939f = this.f38938e.length - 1;
                    this.f38938e = c13749cArr2;
                }
                int i5 = this.f38939f;
                this.f38939f = i5 - 1;
                this.f38938e[i5] = c13749c;
                this.f38940g++;
            } else {
                this.f38938e[i + m40434a(i) + iM40437b] = c13749c;
            }
            this.f38941h += i2;
        }

        /* JADX INFO: renamed from: b */
        private int m40437b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f38938e.length;
                while (true) {
                    length--;
                    i2 = this.f38939f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f38938e[length].f38931c;
                    i -= i4;
                    this.f38941h -= i4;
                    this.f38940g--;
                    i3++;
                }
                C13749c[] c13749cArr = this.f38938e;
                int i5 = i2 + 1;
                System.arraycopy(c13749cArr, i5, c13749cArr, i5 + i3, this.f38940g);
                this.f38939f += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: b */
        private void m40438b() {
            Arrays.fill(this.f38938e, (Object) null);
            this.f38939f = this.f38938e.length - 1;
            this.f38940g = 0;
            this.f38941h = 0;
        }

        /* JADX INFO: renamed from: c */
        private C13796f m40439c(int i) throws IOException {
            if (m40441d(i)) {
                return C13750d.f38932a[i].f38929a;
            }
            int iM40434a = m40434a(i - C13750d.f38932a.length);
            if (iM40434a >= 0) {
                C13749c[] c13749cArr = this.f38938e;
                if (iM40434a < c13749cArr.length) {
                    return c13749cArr[iM40434a].f38929a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: d */
        private int m40440d() throws IOException {
            return this.f38935b.readByte() & 255;
        }

        /* JADX INFO: renamed from: d */
        private boolean m40441d(int i) {
            return i >= 0 && i <= C13750d.f38932a.length - 1;
        }

        /* JADX INFO: renamed from: e */
        private void m40442e(int i) throws IOException {
            if (m40441d(i)) {
                this.f38934a.add(C13750d.f38932a[i]);
                return;
            }
            int iM40434a = m40434a(i - C13750d.f38932a.length);
            if (iM40434a >= 0) {
                C13749c[] c13749cArr = this.f38938e;
                if (iM40434a < c13749cArr.length) {
                    this.f38934a.add(c13749cArr[iM40434a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* JADX INFO: renamed from: f */
        private void m40443f(int i) throws IOException {
            m40436a(-1, new C13749c(m40439c(i), m40449e()));
        }

        /* JADX INFO: renamed from: g */
        private void m40444g() throws IOException {
            m40436a(-1, new C13749c(C13750d.m40432a(m40449e()), m40449e()));
        }

        /* JADX INFO: renamed from: g */
        private void m40445g(int i) throws IOException {
            this.f38934a.add(new C13749c(m40439c(i), m40449e()));
        }

        /* JADX INFO: renamed from: h */
        private void m40446h() throws IOException {
            this.f38934a.add(new C13749c(C13750d.m40432a(m40449e()), m40449e()));
        }

        /* JADX INFO: renamed from: a */
        int m40447a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM40440d = m40440d();
                if ((iM40440d & 128) == 0) {
                    return i2 + (iM40440d << i4);
                }
                i2 += (iM40440d & 127) << i4;
                i4 += 7;
            }
        }

        /* JADX INFO: renamed from: c */
        public List<C13749c> m40448c() {
            ArrayList arrayList = new ArrayList(this.f38934a);
            this.f38934a.clear();
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        C13796f m40449e() throws IOException {
            int iM40440d = m40440d();
            boolean z = (iM40440d & 128) == 128;
            int iM40447a = m40447a(iM40440d, 127);
            return z ? C13796f.m40909a(C13757k.m40577b().m40580a(this.f38935b.mo40884c(iM40447a))) : this.f38935b.mo40880b(iM40447a);
        }

        /* JADX INFO: renamed from: f */
        void m40450f() throws IOException {
            while (!this.f38935b.mo40892f()) {
                byte b = this.f38935b.readByte();
                int i = b & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 128) == 128) {
                    m40442e(m40447a(i, 127) - 1);
                } else if (i == 64) {
                    m40444g();
                } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    m40443f(m40447a(i, 63) - 1);
                } else if ((b & 32) == 32) {
                    int iM40447a = m40447a(i, 31);
                    this.f38937d = iM40447a;
                    if (iM40447a < 0 || iM40447a > this.f38936c) {
                        throw new IOException("Invalid dynamic table size update " + this.f38937d);
                    }
                    m40435a();
                } else if (i == 16 || i == 0) {
                    m40446h();
                } else {
                    m40445g(m40447a(i, 15) - 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.d$b */
    /* JADX INFO: compiled from: Hpack.java */
    static final class b {

        /* JADX INFO: renamed from: a */
        private final C13793c f38942a;

        /* JADX INFO: renamed from: b */
        private final boolean f38943b;

        /* JADX INFO: renamed from: c */
        private int f38944c;

        /* JADX INFO: renamed from: d */
        private boolean f38945d;

        /* JADX INFO: renamed from: e */
        int f38946e;

        /* JADX INFO: renamed from: f */
        int f38947f;

        /* JADX INFO: renamed from: g */
        C13749c[] f38948g;

        /* JADX INFO: renamed from: h */
        int f38949h;

        /* JADX INFO: renamed from: i */
        int f38950i;

        /* JADX INFO: renamed from: j */
        int f38951j;

        b(int i, boolean z, C13793c c13793c) {
            this.f38944c = Integer.MAX_VALUE;
            this.f38948g = new C13749c[8];
            this.f38949h = 7;
            this.f38950i = 0;
            this.f38951j = 0;
            this.f38946e = i;
            this.f38947f = i;
            this.f38943b = z;
            this.f38942a = c13793c;
        }

        b(C13793c c13793c) {
            this(4096, true, c13793c);
        }

        /* JADX INFO: renamed from: a */
        private int m40451a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f38948g.length;
                while (true) {
                    length--;
                    i2 = this.f38949h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f38948g[length].f38931c;
                    i -= i4;
                    this.f38951j -= i4;
                    this.f38950i--;
                    i3++;
                }
                C13749c[] c13749cArr = this.f38948g;
                int i5 = i2 + 1;
                System.arraycopy(c13749cArr, i5, c13749cArr, i5 + i3, this.f38950i);
                C13749c[] c13749cArr2 = this.f38948g;
                int i6 = this.f38949h + 1;
                Arrays.fill(c13749cArr2, i6, i6 + i3, (Object) null);
                this.f38949h += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: a */
        private void m40452a() {
            int i = this.f38947f;
            int i2 = this.f38951j;
            if (i < i2) {
                if (i == 0) {
                    m40454b();
                } else {
                    m40451a(i2 - i);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m40453a(C13749c c13749c) {
            int i = c13749c.f38931c;
            int i2 = this.f38947f;
            if (i > i2) {
                m40454b();
                return;
            }
            m40451a((this.f38951j + i) - i2);
            int i3 = this.f38950i + 1;
            C13749c[] c13749cArr = this.f38948g;
            if (i3 > c13749cArr.length) {
                C13749c[] c13749cArr2 = new C13749c[c13749cArr.length * 2];
                System.arraycopy(c13749cArr, 0, c13749cArr2, c13749cArr.length, c13749cArr.length);
                this.f38949h = this.f38948g.length - 1;
                this.f38948g = c13749cArr2;
            }
            int i4 = this.f38949h;
            this.f38949h = i4 - 1;
            this.f38948g[i4] = c13749c;
            this.f38950i++;
            this.f38951j += i;
        }

        /* JADX INFO: renamed from: b */
        private void m40454b() {
            Arrays.fill(this.f38948g, (Object) null);
            this.f38949h = this.f38948g.length - 1;
            this.f38950i = 0;
            this.f38951j = 0;
        }

        /* JADX INFO: renamed from: a */
        void m40455a(int i, int i2, int i3) {
            if (i < i2) {
                this.f38942a.writeByte(i | i3);
                return;
            }
            this.f38942a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f38942a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f38942a.writeByte(i4);
        }

        /* JADX INFO: renamed from: a */
        void m40456a(C13796f c13796f) throws IOException {
            if (!this.f38943b || C13757k.m40577b().m40578a(c13796f) >= c13796f.mo40923j()) {
                m40455a(c13796f.mo40923j(), 127, 0);
                this.f38942a.m40867a(c13796f);
                return;
            }
            C13793c c13793c = new C13793c();
            C13757k.m40577b().m40579a(c13796f, c13793c);
            C13796f c13796fM40903o = c13793c.m40903o();
            m40455a(c13796fM40903o.mo40923j(), 127, 128);
            this.f38942a.m40867a(c13796fM40903o);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX INFO: renamed from: a */
        void m40457a(List<C13749c> list) throws IOException {
            int length;
            int length2;
            if (this.f38945d) {
                int i = this.f38944c;
                if (i < this.f38947f) {
                    m40455a(i, 31, 32);
                }
                this.f38945d = false;
                this.f38944c = Integer.MAX_VALUE;
                m40455a(this.f38947f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13749c c13749c = list.get(i2);
                C13796f c13796fMo40924k = c13749c.f38929a.mo40924k();
                C13796f c13796f = c13749c.f38930b;
                Integer num = C13750d.f38933b.get(c13796fMo40924k);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C13749c[] c13749cArr = C13750d.f38932a;
                        if (C13723c.m40287a(c13749cArr[iIntValue].f38930b, c13796f)) {
                            length = length2;
                        } else if (C13723c.m40287a(c13749cArr[length2].f38930b, c13796f)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f38948g.length;
                    for (int i3 = this.f38949h + 1; i3 < length3; i3++) {
                        if (C13723c.m40287a(this.f38948g[i3].f38929a, c13796fMo40924k)) {
                            if (C13723c.m40287a(this.f38948g[i3].f38930b, c13796f)) {
                                length2 = (i3 - this.f38949h) + C13750d.f38932a.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f38949h) + C13750d.f38932a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    m40455a(length2, 127, 128);
                } else if (length == -1) {
                    this.f38942a.writeByte(64);
                    m40456a(c13796fMo40924k);
                    m40456a(c13796f);
                    m40453a(c13749c);
                } else if (!c13796fMo40924k.m40918b(C13749c.f38923d) || C13749c.f38928i.equals(c13796fMo40924k)) {
                    m40455a(length, 63, 64);
                    m40456a(c13796f);
                    m40453a(c13749c);
                } else {
                    m40455a(length, 15, 0);
                    m40456a(c13796f);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m40458b(int i) {
            this.f38946e = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f38947f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f38944c = Math.min(this.f38944c, iMin);
            }
            this.f38945d = true;
            this.f38947f = iMin;
            m40452a();
        }
    }

    static {
        C13796f c13796f = C13749c.f38925f;
        C13796f c13796f2 = C13749c.f38926g;
        C13796f c13796f3 = C13749c.f38927h;
        C13796f c13796f4 = C13749c.f38924e;
        f38932a = new C13749c[]{new C13749c(C13749c.f38928i, ""), new C13749c(c13796f, "GET"), new C13749c(c13796f, "POST"), new C13749c(c13796f2, RemoteSettings.FORWARD_SLASH_STRING), new C13749c(c13796f2, "/index.html"), new C13749c(c13796f3, ProxyConfig.MATCH_HTTP), new C13749c(c13796f3, "https"), new C13749c(c13796f4, "200"), new C13749c(c13796f4, "204"), new C13749c(c13796f4, "206"), new C13749c(c13796f4, "304"), new C13749c(c13796f4, "400"), new C13749c(c13796f4, "404"), new C13749c(c13796f4, "500"), new C13749c("accept-charset", ""), new C13749c("accept-encoding", "gzip, deflate"), new C13749c("accept-language", ""), new C13749c("accept-ranges", ""), new C13749c("accept", ""), new C13749c("access-control-allow-origin", ""), new C13749c("age", ""), new C13749c("allow", ""), new C13749c("authorization", ""), new C13749c("cache-control", ""), new C13749c("content-disposition", ""), new C13749c("content-encoding", ""), new C13749c("content-language", ""), new C13749c("content-length", ""), new C13749c("content-location", ""), new C13749c("content-range", ""), new C13749c("content-type", ""), new C13749c("cookie", ""), new C13749c("date", ""), new C13749c(DownloadModel.ETAG, ""), new C13749c("expect", ""), new C13749c("expires", ""), new C13749c(TypedValues.TransitionType.S_FROM, ""), new C13749c("host", ""), new C13749c("if-match", ""), new C13749c("if-modified-since", ""), new C13749c("if-none-match", ""), new C13749c("if-range", ""), new C13749c("if-unmodified-since", ""), new C13749c("last-modified", ""), new C13749c("link", ""), new C13749c(FirebaseAnalytics.Param.LOCATION, ""), new C13749c("max-forwards", ""), new C13749c("proxy-authenticate", ""), new C13749c("proxy-authorization", ""), new C13749c("range", ""), new C13749c("referer", ""), new C13749c(ToolBar.REFRESH, ""), new C13749c("retry-after", ""), new C13749c(C11401Db.f24216a, ""), new C13749c("set-cookie", ""), new C13749c("strict-transport-security", ""), new C13749c("transfer-encoding", ""), new C13749c("user-agent", ""), new C13749c("vary", ""), new C13749c("via", ""), new C13749c("www-authenticate", "")};
        f38933b = m40433a();
    }

    /* JADX INFO: renamed from: a */
    static C13796f m40432a(C13796f c13796f) throws IOException {
        int iMo40923j = c13796f.mo40923j();
        for (int i = 0; i < iMo40923j; i++) {
            byte bMo40912a = c13796f.mo40912a(i);
            if (bMo40912a >= 65 && bMo40912a <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c13796f.mo40926m());
            }
        }
        return c13796f;
    }

    /* JADX INFO: renamed from: a */
    private static Map<C13796f, Integer> m40433a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f38932a.length);
        int i = 0;
        while (true) {
            C13749c[] c13749cArr = f38932a;
            if (i >= c13749cArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c13749cArr[i].f38929a)) {
                linkedHashMap.put(c13749cArr[i].f38929a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
