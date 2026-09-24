package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3767g1 {

    /* JADX INFO: renamed from: a */
    public final Context f14259a;

    public AbstractC3767g1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14259a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17749a() {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.f14259a, COPPA.COPPA_STANDARD);
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
