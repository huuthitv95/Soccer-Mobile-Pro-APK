package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3632a4 {
    /* JADX INFO: renamed from: b */
    public static final int m16802b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j2 = cacheSpan2.lastTouchTimestamp;
        if (j - j2 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j < j2 ? -1 : 1;
    }
}
