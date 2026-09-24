package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.p008ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4196z5 implements InterfaceC4051se {
    @Override // com.chartboost.sdk.impl.InterfaceC4051se
    /* JADX INFO: renamed from: a */
    public PlayerView mo19429a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PlayerView playerView = new PlayerView(context);
        playerView.setUseController(false);
        return playerView;
    }
}
