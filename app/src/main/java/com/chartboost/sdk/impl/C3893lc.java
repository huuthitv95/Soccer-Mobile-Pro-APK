package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.lc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893lc implements InterfaceC4115vc {

    /* JADX INFO: renamed from: a */
    public final AudioManager f15205a;

    public C3893lc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        this.f15205a = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4115vc
    /* JADX INFO: renamed from: a */
    public Float mo18503a() {
        AudioManager audioManager = this.f15205a;
        if (audioManager == null) {
            return null;
        }
        return Float.valueOf((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100);
    }
}
