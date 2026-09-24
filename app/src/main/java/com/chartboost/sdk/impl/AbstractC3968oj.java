package com.chartboost.sdk.impl;

import android.content.Context;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3968oj {

    /* JADX INFO: renamed from: a */
    public final String f15748a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$a */
    public static final class a extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final a f15749b = new a();

        public a() {
            super("click", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return 1811085104;
        }

        public String toString() {
            return "Click";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$b */
    public static final class b extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final b f15750b = new b();

        public b() {
            super("close", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            AbstractC3968oj.m18981a(this, c3761fi, androidContext, omManager, identity, null, null, 48, null);
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
            return 1811091360;
        }

        public String toString() {
            return "Close";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$c */
    public static final class c extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final c f15751b = new c();

        public c() {
            super("closeLinear", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            AbstractC3968oj.m18981a(this, c3761fi, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2126271205;
        }

        public String toString() {
            return "CloseLinear";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$d */
    public static final class d extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final d f15752b = new d();

        public d() {
            super(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -848642415;
        }

        public String toString() {
            return "Complete";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$e */
    public static final class e extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final e f15753b = new e();

        public e() {
            super("creativeView", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            AbstractC3968oj.m18981a(this, c3761fi, androidContext, omManager, identity, null, null, 48, null);
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
            return 141283404;
        }

        public String toString() {
            return "CreativeView";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$f */
    public static final class f extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final f f15754b = new f();

        public f() {
            super("error", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Map mapM17741b;
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            Object obj = (c3761fi == null || (mapM17741b = c3761fi.m17741b()) == null) ? null : mapM17741b.get("VAST_ERROR_CODE");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, num, null);
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
            return 1813119920;
        }

        public String toString() {
            return "Error";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$g */
    public static final class g extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final g f15755b = new g();

        public g() {
            super("firstQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return 1356419579;
        }

        public String toString() {
            return "FirstQuartile";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$h */
    public static final class h extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final h f15756b = new h();

        public h() {
            super("impression", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return 1160259937;
        }

        public String toString() {
            return "Impression";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$i */
    public static final class i extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final i f15757b = new i();

        public i() {
            super(C11744X3.i.f26388r, null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return 569258845;
        }

        public String toString() {
            return "Loaded";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$j */
    public static final class j extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final j f15758b = new j();

        public j() {
            super(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return -1888032352;
        }

        public String toString() {
            return "Midpoint";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$k */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class k extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final k f15759b = new k();

        public k() {
            super(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1822775198;
        }

        public String toString() {
            return "Pause";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$l */
    public static final class l extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public final int f15760b;

        public l(int i) {
            super("progress" + i, null);
            this.f15760b = i;
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            AbstractC3968oj.m18981a(this, c3761fi, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f15760b == ((l) obj).f15760b;
        }

        public int hashCode() {
            return this.f15760b;
        }

        public String toString() {
            return "Progress(offsetSeconds=" + this.f15760b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$m */
    public static final class m extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final m f15761b = new m();

        public m() {
            super(CampaignEx.JSON_NATIVE_VIDEO_RESUME, null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return 732351365;
        }

        public String toString() {
            return "Resume";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$n */
    public static final class n extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final n f15762b = new n();

        public n() {
            super("skip", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
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
            return -1742217513;
        }

        public String toString() {
            return "Skip";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$o */
    public static final class o extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final o f15763b = new o();

        public o() {
            super("start", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Map mapM17741b;
            Map mapM17741b2;
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            Object obj = (c3761fi == null || (mapM17741b2 = c3761fi.m17741b()) == null) ? null : mapM17741b2.get("duration");
            Float f = obj instanceof Float ? (Float) obj : null;
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            if (fFloatValue < 1.0f) {
                fFloatValue = 30.0f;
            }
            Object obj2 = (c3761fi == null || (mapM17741b = c3761fi.m17741b()) == null) ? null : mapM17741b.get("volume");
            Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
            float fFloatValue2 = f2 != null ? f2.floatValue() : 1.0f;
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19158a(fFloatValue, fFloatValue2);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1826092554;
        }

        public String toString() {
            return "Start";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$p */
    public static final class p extends AbstractC3968oj {

        /* JADX INFO: renamed from: b */
        public static final p f15764b = new p();

        public p() {
            super("thirdQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.AbstractC3968oj
        /* JADX INFO: renamed from: a */
        public void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity) {
            Intrinsics.checkNotNullParameter(androidContext, "androidContext");
            Intrinsics.checkNotNullParameter(omManager, "omManager");
            Intrinsics.checkNotNullParameter(identity, "identity");
            if (interfaceC4167xk != null) {
                interfaceC4167xk.mo19159a(this);
            }
            m18983a(c3761fi, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -541631054;
        }

        public String toString() {
            return "ThirdQuartile";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oj$q */
    public static final class q extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Integer f15765b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Integer f15766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Integer num, Integer num2) {
            super(1);
            this.f15765b = num;
            this.f15766c = num2;
        }

        /* JADX INFO: renamed from: a */
        public final void m18985a(C4114vb macroContext) {
            Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
            macroContext.m19694a(this.f15765b);
            macroContext.m19695b(this.f15766c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18985a((C4114vb) obj);
            return Unit.INSTANCE;
        }
    }

    public AbstractC3968oj(String str) {
        this.f15748a = str;
    }

    public /* synthetic */ AbstractC3968oj(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18981a(AbstractC3968oj abstractC3968oj, C3761fi c3761fi, Context context, C3665be c3665be, C4105v2 c4105v2, Integer num, Integer num2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireTracker");
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        }
        abstractC3968oj.m18983a(c3761fi, context, c3665be, c4105v2, num, num2);
    }

    /* JADX INFO: renamed from: a */
    public final String m18982a() {
        return this.f15748a;
    }

    /* JADX INFO: renamed from: a */
    public final void m18983a(C3761fi c3761fi, Context androidContext, C3665be omManager, C4105v2 identity, Integer num, Integer num2) {
        String strM17744e;
        Unit unit;
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(omManager, "omManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        if (c3761fi == null || (strM17744e = c3761fi.m17744e()) == null) {
            C4048sb.m19408a("Failed to fire tracking URL for event `" + this.f15748a + "`. URL is null in TrackingEvent.", (Throwable) null, 2, (Object) null);
            return;
        }
        String strM19948a = AbstractC4158xb.m19948a(strM17744e, AbstractC4158xb.m19946a(androidContext, omManager, identity, new q(num, num2)));
        C3746f3 c3746f3M17208b = C3693cj.f13754a.m17208b();
        if (c3746f3M17208b != null) {
            c3746f3M17208b.m17614a(new C3990pj(strM19948a));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Failed to submit tracking request for " + strM19948a + ". Network service is null.", (Throwable) null, 2, (Object) null);
        }
        C4048sb.m19413c("Tracking URL for event `" + this.f15748a + "` fired: " + strM19948a + " (raw: " + strM17744e + ")", null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18984a(InterfaceC4167xk interfaceC4167xk, C3761fi c3761fi, Context context, C3665be c3665be, C4105v2 c4105v2);
}
