package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3728e8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4154x7 f14053a;

    public C3728e8(InterfaceC4154x7 downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        this.f14053a = downloadManager;
    }

    /* JADX INFO: renamed from: a */
    public final MediaItem m17526a(C4078tj asset) {
        Download downloadM19568a;
        DownloadRequest downloadRequest;
        Intrinsics.checkNotNullParameter(asset, "asset");
        C4087u6 c4087u6Mo19926b = this.f14053a.mo19926b(asset.m19509d());
        if (c4087u6Mo19926b == null || (downloadM19568a = c4087u6Mo19926b.m19568a()) == null || (downloadRequest = downloadM19568a.request) == null) {
            return null;
        }
        return downloadRequest.toMediaItem();
    }
}
