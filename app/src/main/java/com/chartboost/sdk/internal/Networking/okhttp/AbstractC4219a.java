package com.chartboost.sdk.internal.Networking.okhttp;

import com.facebook.internal.AnalyticsEvents;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4219a extends Exception {

    /* JADX INFO: renamed from: c */
    public static final d f17193c = new d(null);

    /* JADX INFO: renamed from: d */
    public static final Map f17194d = MapsKt.mapOf(TuplesKt.m43482to(400, "Bad Request"), TuplesKt.m43482to(401, "Unauthorized"), TuplesKt.m43482to(403, "Forbidden"), TuplesKt.m43482to(404, "Not Found"), TuplesKt.m43482to(408, "Request Timeout"), TuplesKt.m43482to(409, "Conflict"), TuplesKt.m43482to(Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), "Too Many Requests"), TuplesKt.m43482to(500, "Internal Server Error"), TuplesKt.m43482to(502, "Bad Gateway"), TuplesKt.m43482to(503, "Service Unavailable"), TuplesKt.m43482to(504, "Gateway Timeout"));

    /* JADX INFO: renamed from: b */
    public final int f17195b;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$a */
    public static final class a extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final a f17196e = new a();

        public a() {
            super(502, AbstractC4219a.f17193c.m20183a(502), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1600884457;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadGateway";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$b */
    public static final class b extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final b f17197e = new b();

        public b() {
            super(400, AbstractC4219a.f17193c.m20183a(400), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -316072606;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadRequest";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$c */
    public static final class c extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public final int f17198e;

        public c(int i) {
            super(i, AbstractC4219a.f17193c.m20183a(i), null);
            this.f17198e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17198e == ((c) obj).f17198e;
        }

        public int hashCode() {
            return this.f17198e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientError(status=" + this.f17198e + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$d */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m20183a(int i) {
            String str = (String) AbstractC4219a.f17194d.get(Integer.valueOf(i));
            if (str == null) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            return "HTTP " + i + " " + str;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC4219a m20184b(int i) {
            if (i == 400) {
                return b.f17197e;
            }
            if (i == 401) {
                return n.f17208e;
            }
            if (i == 403) {
                return f.f17200e;
            }
            if (i == 404) {
                return i.f17203e;
            }
            if (i == 408) {
                return j.f17204e;
            }
            if (i == 409) {
                return e.f17199e;
            }
            if (i == 429) {
                return m.f17207e;
            }
            if (i == 500) {
                return h.f17202e;
            }
            if (i == 502) {
                return a.f17196e;
            }
            if (i == 503) {
                return l.f17206e;
            }
            if (i == 504) {
                return g.f17201e;
            }
            if (400 > i || i >= 500) {
                return (500 > i || i >= 600) ? new o(i) : new k(i);
            }
            return new c(i);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$e */
    public static final class e extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final e f17199e = new e();

        public e() {
            super(409, AbstractC4219a.f17193c.m20183a(409), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 488153194;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Conflict";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$f */
    public static final class f extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final f f17200e = new f();

        public f() {
            super(403, AbstractC4219a.f17193c.m20183a(403), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 258062945;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Forbidden";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$g */
    public static final class g extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final g f17201e = new g();

        public g() {
            super(504, AbstractC4219a.f17193c.m20183a(504), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1275433707;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GatewayTimeout";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$h */
    public static final class h extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final h f17202e = new h();

        public h() {
            super(500, AbstractC4219a.f17193c.m20183a(500), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 693189104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InternalServerError";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$i */
    public static final class i extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final i f17203e = new i();

        public i() {
            super(404, AbstractC4219a.f17193c.m20183a(404), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1673446137;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotFound";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$j */
    public static final class j extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final j f17204e = new j();

        public j() {
            super(408, AbstractC4219a.f17193c.m20183a(408), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1845205398;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestTimeout";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$k */
    public static final class k extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public final int f17205e;

        public k(int i) {
            super(i, AbstractC4219a.f17193c.m20183a(i), null);
            this.f17205e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f17205e == ((k) obj).f17205e;
        }

        public int hashCode() {
            return this.f17205e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServerError(status=" + this.f17205e + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$l */
    public static final class l extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final l f17206e = new l();

        public l() {
            super(503, AbstractC4219a.f17193c.m20183a(503), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 315784435;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceUnavailable";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$m */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class m extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final m f17207e = new m();

        public m() {
            super(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, AbstractC4219a.f17193c.m20183a(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1422549791;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyRequests";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$n */
    public static final class n extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public static final n f17208e = new n();

        public n() {
            super(401, AbstractC4219a.f17193c.m20183a(401), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 36815244;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$o */
    public static final class o extends AbstractC4219a {

        /* JADX INFO: renamed from: e */
        public final int f17209e;

        public o(int i) {
            super(i, AbstractC4219a.f17193c.m20183a(i), null);
            this.f17209e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f17209e == ((o) obj).f17209e;
        }

        public int hashCode() {
            return this.f17209e;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(status=" + this.f17209e + ")";
        }
    }

    public AbstractC4219a(int i2, String str) {
        super(str);
        this.f17195b = i2;
    }

    public /* synthetic */ AbstractC4219a(int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str);
    }

    /* JADX INFO: renamed from: b */
    public final int m20181b() {
        return this.f17195b;
    }
}
