package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3790h1 extends AbstractC3767g1 {

    /* JADX INFO: renamed from: b */
    public final ContentResolver f14351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3790h1(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f14351b = contentResolver;
    }

    /* JADX INFO: renamed from: b */
    public C3744f1 m17827b() {
        EnumC3922mi enumC3922mi = EnumC3922mi.TRACKING_UNKNOWN;
        String str = null;
        try {
            boolean z = Settings.Secure.getInt(this.f14351b, "limit_ad_tracking") != 0;
            String string = Settings.Secure.getString(this.f14351b, "advertising_id");
            if (z || Intrinsics.areEqual(string, "00000000-0000-0000-0000-000000000000") || m17749a()) {
                enumC3922mi = EnumC3922mi.TRACKING_LIMITED;
            } else {
                enumC3922mi = EnumC3922mi.TRACKING_ENABLED;
                str = string;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return new C3744f1(enumC3922mi, str);
    }
}
