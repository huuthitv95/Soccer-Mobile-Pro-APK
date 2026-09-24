package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4174y5 implements InterfaceC3659b8 {
    @Override // com.chartboost.sdk.impl.InterfaceC3659b8
    /* JADX INFO: renamed from: a */
    public ExoPlayer mo16910a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        return exoPlayerBuild;
    }
}
