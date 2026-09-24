package com.chartboost.sdk.impl;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3847jc implements InterfaceC4093uc {

    /* JADX INFO: renamed from: a */
    public final Context f14907a;

    public C3847jc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14907a = context;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4093uc
    /* JADX INFO: renamed from: a */
    public EnumC4027rc mo18205a() {
        int i = this.f14907a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return EnumC4027rc.PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return EnumC4027rc.LANDSCAPE;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4093uc
    public boolean isLocked() {
        return Settings.System.getInt(this.f14907a.getContentResolver(), "accelerometer_rotation", 0) != 0;
    }
}
