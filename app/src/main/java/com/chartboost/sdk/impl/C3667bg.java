package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bg */
/* JADX INFO: loaded from: classes3.dex */
public final class C3667bg implements InterfaceC3644ag {

    /* JADX INFO: renamed from: a */
    public final Context f13575a;

    /* JADX INFO: renamed from: b */
    public final C4105v2 f13576b;

    /* JADX INFO: renamed from: c */
    public final C3769g3 f13577c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f13578d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f13579e;

    /* JADX INFO: renamed from: f */
    public final C3921mh f13580f;

    /* JADX INFO: renamed from: g */
    public final C4128w3 f13581g;

    /* JADX INFO: renamed from: h */
    public final C4031rg f13582h;

    /* JADX INFO: renamed from: i */
    public final C4117ve f13583i;

    /* JADX INFO: renamed from: j */
    public final Mediation f13584j;

    /* JADX INFO: renamed from: k */
    public final C3818i6 f13585k;

    public C3667bg(Context context, C4105v2 identity, C3769g3 reachability, AtomicReference sdkConfig, SharedPreferences sharedPreferences, C3921mh timeSource, C4128w3 carrierBuilder, C4031rg session, C4117ve privacyApi, Mediation mediation, C3818i6 deviceBodyFieldsFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(carrierBuilder, "carrierBuilder");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(deviceBodyFieldsFactory, "deviceBodyFieldsFactory");
        this.f13575a = context;
        this.f13576b = identity;
        this.f13577c = reachability;
        this.f13578d = sdkConfig;
        this.f13579e = sharedPreferences;
        this.f13580f = timeSource;
        this.f13581g = carrierBuilder;
        this.f13582h = session;
        this.f13583i = privacyApi;
        this.f13584j = mediation;
        this.f13585k = deviceBodyFieldsFactory;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3644ag
    /* JADX INFO: renamed from: a */
    public C3690cg mo16842a() {
        C3678c4 c3678c4 = C3678c4.f13658b;
        String strM17025e = c3678c4.m17025e();
        String strM17026f = c3678c4.m17026f();
        C3958o9 c3958o9M19635h = this.f13576b.m19635h();
        C3850jf reachabilityBodyFields = AbstractC3912m8.toReachabilityBodyFields(this.f13577c);
        C4106v3 c4106v3M19742a = this.f13581g.m19742a(this.f13575a);
        C4053sg c4053sgM19358i = this.f13582h.m19358i();
        C3944nh bodyFields = AbstractC3912m8.toBodyFields(this.f13580f);
        C4139we c4139weM19706g = this.f13583i.m19706g();
        C3725e5 c3725e5M18674n = ((C3920mg) this.f13578d.get()).m18674n();
        C3795h6 c3795h6M17962b = this.f13585k.m17962b();
        Mediation mediation = this.f13584j;
        return new C3690cg(strM17025e, strM17026f, c3958o9M19635h, reachabilityBodyFields, c4106v3M19742a, c4053sgM19358i, bodyFields, c4139weM19706g, c3725e5M18674n, c3795h6M17962b, mediation != null ? mediation.toMediationBodyFields() : null);
    }
}
