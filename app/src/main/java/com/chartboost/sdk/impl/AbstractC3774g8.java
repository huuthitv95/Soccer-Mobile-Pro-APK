package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3774g8 {
    /* JADX INFO: renamed from: a */
    public static final int m17789a(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Format videoFormat = exoPlayer.getVideoFormat();
        if (videoFormat != null) {
            return videoFormat.height;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m17790b(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Format videoFormat = exoPlayer.getVideoFormat();
        if (videoFormat != null) {
            return videoFormat.width;
        }
        return 1;
    }
}
