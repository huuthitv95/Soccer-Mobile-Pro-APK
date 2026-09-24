package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C8046v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.serverapi.C9112a;
import com.fyber.inneractive.sdk.serverapi.C9114c;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C7859d {

    /* JADX INFO: renamed from: A */
    public String f17527A;

    /* JADX INFO: renamed from: B */
    public Boolean f17528B;

    /* JADX INFO: renamed from: C */
    public String f17529C;

    /* JADX INFO: renamed from: D */
    public int f17530D;

    /* JADX INFO: renamed from: E */
    public InneractiveUserConfig.Gender f17531E;

    /* JADX INFO: renamed from: F */
    public boolean f17532F;

    /* JADX INFO: renamed from: G */
    public String f17533G;

    /* JADX INFO: renamed from: H */
    public String f17534H;

    /* JADX INFO: renamed from: I */
    public String f17535I;

    /* JADX INFO: renamed from: J */
    public String f17536J;

    /* JADX INFO: renamed from: K */
    public final boolean f17537K;

    /* JADX INFO: renamed from: L */
    public Boolean f17538L;

    /* JADX INFO: renamed from: a */
    public final C9114c f17539a;

    /* JADX INFO: renamed from: b */
    public String f17540b;

    /* JADX INFO: renamed from: c */
    public final String f17541c;

    /* JADX INFO: renamed from: d */
    public final String f17542d;

    /* JADX INFO: renamed from: e */
    public final String f17543e;

    /* JADX INFO: renamed from: f */
    public final String f17544f;

    /* JADX INFO: renamed from: g */
    public String f17545g;

    /* JADX INFO: renamed from: h */
    public String f17546h;

    /* JADX INFO: renamed from: i */
    public String f17547i;

    /* JADX INFO: renamed from: j */
    public String f17548j;

    /* JADX INFO: renamed from: k */
    public String f17549k;

    /* JADX INFO: renamed from: l */
    public Long f17550l;

    /* JADX INFO: renamed from: m */
    public int f17551m;

    /* JADX INFO: renamed from: n */
    public int f17552n;

    /* JADX INFO: renamed from: o */
    public final EnumC7885q f17553o;

    /* JADX INFO: renamed from: p */
    public String f17554p;

    /* JADX INFO: renamed from: q */
    public String f17555q;

    /* JADX INFO: renamed from: r */
    public final EnumC7864f0 f17556r;

    /* JADX INFO: renamed from: s */
    public Boolean f17557s;

    /* JADX INFO: renamed from: t */
    public Boolean f17558t;

    /* JADX INFO: renamed from: u */
    public Boolean f17559u;

    /* JADX INFO: renamed from: v */
    public boolean f17560v;

    /* JADX INFO: renamed from: w */
    public Boolean f17561w;

    /* JADX INFO: renamed from: x */
    public Boolean f17562x;

    /* JADX INFO: renamed from: y */
    public Boolean f17563y;

    /* JADX INFO: renamed from: z */
    public int f17564z;

    public C7859d(C9114c c9114c) {
        String str;
        this.f17539a = c9114c;
        if (TextUtils.isEmpty(this.f17540b)) {
            AbstractC9183r.f21477a.execute(new RunnableC7857c(this));
        }
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        this.f17541c = sb.toString();
        this.f17542d = AbstractC9174o.f21470a.getPackageName();
        this.f17543e = AbstractC9162k.m21974j();
        this.f17544f = AbstractC9162k.m21976l();
        this.f17551m = AbstractC9174o.m22001c(AbstractC9174o.m22004e());
        this.f17552n = AbstractC9174o.m22001c(AbstractC9174o.m22002d());
        C9112a c9112a = AbstractC9113b.f21363a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f17553o = !str.equals("native") ? !str.equals("unity3d") ? EnumC7885q.UNRECOGNIZED : EnumC7885q.UNITY3D : EnumC7885q.NATIVE;
        this.f17556r = (!AbstractC9186s.m22012a() || IAConfigManager.f17654M.f17685q) ? EnumC7864f0.SECURE : EnumC7864f0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (TextUtils.isEmpty(iAConfigManager.f17682n)) {
            this.f17534H = iAConfigManager.f17680l;
        } else {
            this.f17534H = iAConfigManager.f17680l + "_" + iAConfigManager.f17682n;
        }
        this.f17537K = InneractiveAdManager.isCurrentUserAChild();
        m20343a();
        this.f17558t = AbstractC9113b.m21913g();
        this.f17528B = AbstractC9113b.m21915i();
        this.f17561w = AbstractC9113b.m21912f();
        this.f17562x = AbstractC9113b.m21918l();
        this.f17563y = AbstractC9113b.m21917k();
    }

    /* JADX INFO: renamed from: a */
    public final void m20343a() {
        this.f17539a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        this.f17545g = iAConfigManager.f17683o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f17539a.getClass();
            this.f17546h = AbstractC9162k.m21973i();
            this.f17547i = this.f17539a.m21922a();
            String str = this.f17539a.f21368b;
            this.f17548j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f17539a.f21368b;
            this.f17549k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f17539a.getClass();
            EnumC9134a1 enumC9134a1M21954a = EnumC9134a1.m21954a();
            IAlog.m21945a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", enumC9134a1M21954a, enumC9134a1M21954a.m21955b());
            this.f17555q = enumC9134a1M21954a.m21955b();
            int i = AbstractC8013k.f17788a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                C8046v c8046v = AbstractC8044u.f17878a.f17886b;
                property = c8046v != null ? c8046v.f17882a : null;
            }
            this.f17527A = property;
            this.f17533G = iAConfigManager.f17678j.getZipCode();
        }
        this.f17531E = iAConfigManager.f17678j.getGender();
        this.f17530D = iAConfigManager.f17678j.getAge();
        this.f17550l = AbstractC9113b.m21911e();
        this.f17539a.getClass();
        ArrayList arrayList = iAConfigManager.f17684p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f17554p = AbstractC9174o.m21991a(arrayList);
        }
        this.f17529C = AbstractC9113b.m21908b();
        this.f17560v = AbstractC9113b.m21914h().booleanValue();
        this.f17564z = AbstractC9113b.m21909c().intValue();
        this.f17532F = iAConfigManager.f17679k;
        this.f17557s = AbstractC9113b.m21919m();
        if (TextUtils.isEmpty(iAConfigManager.f17682n)) {
            this.f17534H = iAConfigManager.f17680l;
        } else {
            this.f17534H = iAConfigManager.f17680l + "_" + iAConfigManager.f17682n;
        }
        this.f17559u = AbstractC9113b.m21920n();
        iAConfigManager.f17660D.m20650n();
        C8252l c8252l = iAConfigManager.f17660D.f18422p;
        this.f17535I = c8252l != null ? c8252l.f17294a.mo20291i() : null;
        C8252l c8252l2 = iAConfigManager.f17660D.f18422p;
        this.f17536J = c8252l2 != null ? c8252l2.f17294a.mo20286d() : null;
        this.f17539a.getClass();
        this.f17551m = AbstractC9174o.m22001c(AbstractC9174o.m22004e());
        this.f17539a.getClass();
        this.f17552n = AbstractC9174o.m22001c(AbstractC9174o.m22002d());
        this.f17538L = AbstractC9113b.m21916j();
    }
}
