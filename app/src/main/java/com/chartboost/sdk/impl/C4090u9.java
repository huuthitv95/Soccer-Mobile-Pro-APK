package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4090u9 {

    /* JADX INFO: renamed from: a */
    public final Context f16480a;

    public C4090u9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16480a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m19577a() {
        Intent intentAddFlags = new Intent(this.f16480a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }

    /* JADX INFO: renamed from: a */
    public final void m19578a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            this.f16480a.startActivity(intent);
        } catch (Exception e) {
            C4048sb.m19410b("Cannot start the activity", e);
        }
    }
}
