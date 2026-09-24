package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.privacysandbox.ads.adservices.common.AdFilters$$ExternalSyntheticApiModelOutline0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12292l0 {

    /* JADX INFO: renamed from: a */
    public static final C12292l0 f30758a = new C12292l0();

    private C12292l0() {
    }

    /* JADX INFO: renamed from: a */
    public static final int m31957a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m31959b() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final MeasurementManager m31958a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && m31957a() >= 4) {
            try {
                return AdFilters$$ExternalSyntheticApiModelOutline0.m708m(context.getSystemService(AdFilters$$ExternalSyntheticApiModelOutline0.m$2()));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
