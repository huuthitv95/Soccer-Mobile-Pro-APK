package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12318m5 implements InterfaceC12618y7, InterfaceC12618y7.a {

    /* JADX INFO: renamed from: a */
    private JSONObject f30938a = new JSONObject();

    /* JADX INFO: renamed from: b */
    private final Lazy f30939b = LazyKt.lazy(new f());

    /* JADX INFO: renamed from: c */
    private final Lazy f30940c = LazyKt.lazy(new i());

    /* JADX INFO: renamed from: d */
    private final Lazy f30941d = LazyKt.lazy(new d());

    /* JADX INFO: renamed from: e */
    private final Lazy f30942e = LazyKt.lazy(new c());

    /* JADX INFO: renamed from: f */
    private final Lazy f30943f = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: g */
    private final Lazy f30944g = LazyKt.lazy(new h());

    /* JADX INFO: renamed from: h */
    private final Lazy f30945h = LazyKt.lazy(new e());

    /* JADX INFO: renamed from: i */
    private final Lazy f30946i = LazyKt.lazy(new g());

    /* JADX INFO: renamed from: j */
    private final Lazy f30947j = LazyKt.lazy(new a());

    /* JADX INFO: renamed from: com.ironsource.m5$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31695n, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31699r, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$c */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31703v, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$d */
    static final class d extends Lambda implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31702u, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$e */
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31697p, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$f */
    static final class f extends Lambda implements Function0<Boolean> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31700s, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$g */
    static final class g extends Lambda implements Function0<Boolean> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31696o, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$h */
    static final class h extends Lambda implements Function0<Boolean> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31698q, false));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m5$i */
    static final class i extends Lambda implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C12318m5.this.m32168M().optBoolean(C12419p5.f31701t, false));
        }
    }

    /* JADX INFO: renamed from: D */
    private final boolean m32159D() {
        return ((Boolean) this.f30947j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    private final boolean m32160E() {
        return ((Boolean) this.f30943f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    private final boolean m32161F() {
        return ((Boolean) this.f30942e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private final boolean m32162G() {
        return ((Boolean) this.f30941d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private final boolean m32163H() {
        return ((Boolean) this.f30945h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    private final boolean m32164I() {
        return ((Boolean) this.f30939b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: J */
    private final boolean m32165J() {
        return ((Boolean) this.f30946i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    private final boolean m32166K() {
        return ((Boolean) this.f30944g.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    private final boolean m32167L() {
        return ((Boolean) this.f30940c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final JSONObject m32168M() {
        JSONObject jSONObjectOptJSONObject = this.f30938a.optJSONObject(C12383n5.f31533a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: A */
    public boolean mo32170A() {
        return m32166K();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: B */
    public long mo32171B() {
        String strOptString = m32168M().optString(C12419p5.f31685d);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CTRL_LOAD_TIME)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: C */
    public boolean mo32172C() {
        return m32159D();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: b */
    public boolean mo32175b() {
        return m32160E();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: c */
    public int mo32176c() {
        String strOptString = m32168M().optString(C12419p5.f31684c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CTRL_LOAD_ATTEMPTS)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.InterfaceC12618y7
    public JSONObject config() {
        return this.f30938a;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: d */
    public boolean mo32177d() {
        return m32168M().optBoolean(C12419p5.f31689h, true);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: e */
    public boolean mo32178e() {
        return m32168M().optBoolean(C12419p5.f31706y, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: f */
    public long mo32179f() {
        String strOptString = m32168M().optString(C12419p5.f31686e);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: g */
    public boolean mo32180g() {
        return m32168M().optBoolean(C12419p5.f31681C, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: h */
    public boolean mo32181h() {
        return m32168M().optBoolean(C12419p5.f31707z, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: i */
    public boolean mo32182i() {
        return m32168M().optBoolean(C12419p5.f31690i, true);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: j */
    public boolean mo32183j() {
        return m32162G();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: k */
    public boolean mo32184k() {
        return m32168M().optBoolean(C12419p5.f31688g, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: l */
    public long mo32185l() {
        String strOptString = m32168M().optString(C12419p5.f31687f);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = StringsKt.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: m */
    public boolean mo32186m() {
        return m32164I();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: n */
    public boolean mo32187n() {
        return m32161F();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: o */
    public boolean mo32188o() {
        return m32167L();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: p */
    public boolean mo32189p() {
        return m32165J();
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: q */
    public boolean mo32190q() {
        return m32168M().optBoolean(C12419p5.f31693l, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: r */
    public boolean mo32191r() {
        return m32168M().optBoolean(C12419p5.f31679A, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: s */
    public boolean mo32192s() {
        return m32168M().optBoolean(C12419p5.f31704w, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: t */
    public boolean mo32193t() {
        return m32168M().optBoolean(C12419p5.f31691j, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: u */
    public boolean mo32194u() {
        String strOptString = m32168M().optString(C12419p5.f31682a);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.areEqual(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: v */
    public boolean mo32195v() {
        return m32168M().optBoolean(C12419p5.f31680B, true);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: w */
    public int mo32196w() {
        String strOptString = m32168M().optString(C12419p5.f31683b);
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: x */
    public boolean mo32197x() {
        return m32168M().optBoolean(C12419p5.f31692k, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: y */
    public boolean mo32198y() {
        return m32168M().optBoolean(C12419p5.f31694m, false);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: z */
    public boolean mo32199z() {
        return m32163H();
    }

    @Override // com.ironsource.InterfaceC12618y7.a
    /* JADX INFO: renamed from: a */
    public void mo32174a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f30938a;
        }
        this.f30938a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC12401o5
    /* JADX INFO: renamed from: a */
    public String mo32173a() {
        String strOptString = m32168M().optString("controllerUrl", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "traits.optString(CONTROLLER_URL, \"\")");
        return strOptString;
    }
}
