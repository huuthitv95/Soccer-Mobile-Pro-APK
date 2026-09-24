package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4087u6 {

    /* JADX INFO: renamed from: a */
    public final Download f16474a;

    public C4087u6(Download download) {
        Intrinsics.checkNotNullParameter(download, "download");
        this.f16474a = download;
    }

    /* JADX INFO: renamed from: a */
    public final Download m19568a() {
        return this.f16474a;
    }

    /* JADX INFO: renamed from: b */
    public final String m19569b() {
        String id = this.f16474a.request.f21864id;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        return id;
    }

    /* JADX INFO: renamed from: c */
    public final float m19570c() {
        return this.f16474a.getPercentDownloaded();
    }

    /* JADX INFO: renamed from: d */
    public final int m19571d() {
        return this.f16474a.state;
    }

    /* JADX INFO: renamed from: e */
    public final long m19572e() {
        return this.f16474a.updateTimeMs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4087u6) && Intrinsics.areEqual(this.f16474a, ((C4087u6) obj).f16474a);
    }

    /* JADX INFO: renamed from: f */
    public final String m19573f() {
        String string = this.f16474a.request.uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        return this.f16474a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f16474a + ")";
    }
}
