package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4172y3 {

    /* JADX INFO: renamed from: a */
    public final Context f17003a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f17004b;

    /* JADX INFO: renamed from: c */
    public final C3965og f17005c;

    /* JADX INFO: renamed from: d */
    public final C3906m2 f17006d;

    /* JADX INFO: renamed from: e */
    public final C4105v2 f17007e;

    public C4172y3(Context context, ScheduledExecutorService backgroundExecutor, C3965og sdkInitializer, C3906m2 tokenGenerator, C4105v2 identity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f17003a = context;
        this.f17004b = backgroundExecutor;
        this.f17005c = sdkInitializer;
        this.f17006d = tokenGenerator;
        this.f17007e = identity;
    }

    /* JADX INFO: renamed from: a */
    public static final void m20016a(C4172y3 this$0, String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(appSignature, "$appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "$onStarted");
        this$0.m20020b();
        C4187yi.f17062b.m20066a(this$0.f17003a);
        this$0.f17005c.m18936a(appId, appSignature, onStarted, chartboostError);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20017a(C4172y3 c4172y3, String str, String str2, StartCallback startCallback, ChartboostError chartboostError, int i, Object obj) {
        if ((i & 8) != 0) {
            chartboostError = null;
        }
        c4172y3.m20019a(str, str2, startCallback, chartboostError);
    }

    /* JADX INFO: renamed from: a */
    public final String m20018a() {
        return this.f17006d.m18625a();
    }

    /* JADX INFO: renamed from: a */
    public final void m20019a(final String appId, final String appSignature, final StartCallback onStarted, final ChartboostError chartboostError) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        this.f17004b.execute(new Runnable() { // from class: com.chartboost.sdk.impl.y3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4172y3.m20016a(this.f$0, appId, appSignature, onStarted, chartboostError);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m20020b() {
        try {
            Thread.sleep(100L);
            this.f17007e.m19635h();
        } catch (Exception e) {
            C4048sb.m19408a("startIdentity error " + e, (Throwable) null, 2, (Object) null);
        }
    }
}
