package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.InterfaceC12497f;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.P */
/* JADX INFO: loaded from: classes6.dex */
public final class C11605P {

    /* JADX INFO: renamed from: f */
    public static final a f25307f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final String f25308g = "0";

    /* JADX INFO: renamed from: h */
    public static final String f25309h = "0";

    /* JADX INFO: renamed from: i */
    public static final String f25310i = "0";

    /* JADX INFO: renamed from: j */
    public static final String f25311j = "0";

    /* JADX INFO: renamed from: a */
    private final C11471H9 f25312a;

    /* JADX INFO: renamed from: b */
    private EnumC11630Q7 f25313b;

    /* JADX INFO: renamed from: c */
    private String f25314c;

    /* JADX INFO: renamed from: d */
    private EnumC12396o0 f25315d;

    /* JADX INFO: renamed from: e */
    private double f25316e;

    /* JADX INFO: renamed from: com.ironsource.P$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11605P(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f25312a = adInstance;
        this.f25313b = EnumC11630Q7.UnknownProvider;
        this.f25314c = "0";
        this.f25315d = EnumC12396o0.LOAD_REQUEST;
        this.f25316e = new Date().getTime() / 1000.0d;
    }

    /* JADX INFO: renamed from: a */
    public final C11471H9 m26781a() {
        return this.f25312a;
    }

    /* JADX INFO: renamed from: b */
    public final IronSource.EnumC12328a m26787b() {
        if (this.f25312a.m25999i()) {
            return IronSource.EnumC12328a.BANNER;
        }
        return this.f25312a.m26004n() ? IronSource.EnumC12328a.REWARDED_VIDEO : IronSource.EnumC12328a.INTERSTITIAL;
    }

    /* JADX INFO: renamed from: c */
    public final String m26788c() {
        String strM25995e = this.f25312a.m25995e();
        Intrinsics.checkNotNullExpressionValue(strM25995e, "adInstance.id");
        return strM25995e;
    }

    /* JADX INFO: renamed from: d */
    public final C11471H9 m26789d() {
        return this.f25312a;
    }

    /* JADX INFO: renamed from: e */
    public final EnumC11630Q7 m26790e() {
        return this.f25313b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11605P)) {
            return false;
        }
        C11605P c11605p = (C11605P) obj;
        return Intrinsics.areEqual(m26788c(), c11605p.m26788c()) && Intrinsics.areEqual(m26792g(), c11605p.m26792g()) && m26787b() == c11605p.m26787b() && Intrinsics.areEqual(m26794i(), c11605p.m26794i()) && this.f25313b == c11605p.f25313b && Intrinsics.areEqual(this.f25314c, c11605p.f25314c) && this.f25315d == c11605p.f25315d;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC12396o0 m26791f() {
        return this.f25315d;
    }

    /* JADX INFO: renamed from: g */
    public final String m26792g() {
        String strM25993c = this.f25312a.m25993c();
        return strM25993c == null ? "0" : strM25993c;
    }

    /* JADX INFO: renamed from: h */
    public final String m26793h() {
        return this.f25314c;
    }

    public int hashCode() {
        return Objects.hash(m26788c(), m26792g(), m26787b(), m26794i(), this.f25313b, this.f25314c, this.f25315d, Double.valueOf(this.f25316e));
    }

    /* JADX INFO: renamed from: i */
    public final String m26794i() {
        String strM25997g = this.f25312a.m25997g();
        Intrinsics.checkNotNullExpressionValue(strM25997g, "adInstance.name");
        return strM25997g;
    }

    /* JADX INFO: renamed from: j */
    public final double m26795j() {
        return this.f25316e;
    }

    public String toString() {
        String string = new JSONObject().put(InterfaceC12497f.b.f32089c, m26788c()).put("advertiserBundleId", this.f25314c).put("adProvider", this.f25313b.ordinal()).put("adStatus", this.f25315d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f25316e).put("adUnitId", m26792g()).put("adFormat", m26787b().toString()).put("instanceId", m26794i()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final C11605P m26782a(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new C11605P(adInstance);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11605P m26780a(C11605P c11605p, C11471H9 c11471h9, int i, Object obj) {
        if ((i & 1) != 0) {
            c11471h9 = c11605p.f25312a;
        }
        return c11605p.m26782a(c11471h9);
    }

    /* JADX INFO: renamed from: a */
    public final void m26784a(EnumC11630Q7 enumC11630Q7) {
        Intrinsics.checkNotNullParameter(enumC11630Q7, "<set-?>");
        this.f25313b = enumC11630Q7;
    }

    /* JADX INFO: renamed from: a */
    public final void m26786a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f25314c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m26785a(EnumC12396o0 enumC12396o0) {
        Intrinsics.checkNotNullParameter(enumC12396o0, "<set-?>");
        this.f25315d = enumC12396o0;
    }

    /* JADX INFO: renamed from: a */
    public final void m26783a(double d) {
        this.f25316e = d;
    }
}
