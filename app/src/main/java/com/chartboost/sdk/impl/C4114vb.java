package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.chartboost.adsession.Partner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4114vb {

    /* JADX INFO: renamed from: a */
    public final Context f16593a;

    /* JADX INFO: renamed from: b */
    public final C3665be f16594b;

    /* JADX INFO: renamed from: c */
    public final C4105v2 f16595c;

    /* JADX INFO: renamed from: d */
    public Long f16596d;

    /* JADX INFO: renamed from: e */
    public Integer f16597e;

    /* JADX INFO: renamed from: f */
    public Integer f16598f;

    /* JADX INFO: renamed from: g */
    public Integer f16599g;

    /* JADX INFO: renamed from: h */
    public Integer f16600h;

    /* JADX INFO: renamed from: i */
    public String f16601i;

    /* JADX INFO: renamed from: j */
    public String f16602j;

    public C4114vb(Context androidContext, C3665be openMeasurementManager, C4105v2 identity) {
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f16593a = androidContext;
        this.f16594b = openMeasurementManager;
        this.f16595c = identity;
    }

    /* JADX INFO: renamed from: a */
    public final C4092ub m19693a() {
        Long l = this.f16596d;
        long jLongValue = l != null ? l.longValue() : System.currentTimeMillis();
        Integer num = this.f16597e;
        int iIntValue = 0;
        int iIntValue2 = num != null ? num.intValue() : Random.INSTANCE.nextInt(0, 100000000);
        String packageName = this.f16601i;
        if (packageName == null) {
            packageName = this.f16593a.getPackageName();
        }
        String str = packageName;
        String str2 = this.f16602j;
        if (str2 == null) {
            Partner partnerM16929c = this.f16594b.m16929c();
            if (partnerM16929c != null) {
                str2 = partnerM16929c.getName() + RemoteSettings.FORWARD_SLASH_STRING + partnerM16929c.getVersion();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "unknown";
            }
        }
        String str3 = str2;
        Integer num2 = this.f16600h;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else if (this.f16595c.m19635h().m18899f() == EnumC3922mi.TRACKING_LIMITED) {
            iIntValue = 1;
        }
        Integer num3 = this.f16598f;
        Integer num4 = this.f16599g;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Intrinsics.checkNotNull(str);
        return new C4092ub(jLongValue, iIntValue2, num3, num4, numValueOf, str, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m19694a(Integer num) {
        this.f16598f = num;
    }

    /* JADX INFO: renamed from: b */
    public final void m19695b(Integer num) {
        this.f16599g = num;
    }
}
