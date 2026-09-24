package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.p */
/* JADX INFO: compiled from: SegmentPool.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13806p {

    /* JADX INFO: renamed from: a */
    static C13805o f39345a;

    /* JADX INFO: renamed from: b */
    static long f39346b;

    private C13806p() {
    }

    /* JADX INFO: renamed from: a */
    static C13805o m40962a() {
        synchronized (C13806p.class) {
            C13805o c13805o = f39345a;
            if (c13805o == null) {
                return new C13805o();
            }
            f39345a = c13805o.f39343f;
            c13805o.f39343f = null;
            f39346b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return c13805o;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m40963a(C13805o c13805o) {
        if (c13805o.f39343f != null || c13805o.f39344g != null) {
            throw new IllegalArgumentException();
        }
        if (c13805o.f39341d) {
            return;
        }
        synchronized (C13806p.class) {
            long j = f39346b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            if (j > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            f39346b = j;
            c13805o.f39343f = f39345a;
            c13805o.f39340c = 0;
            c13805o.f39339b = 0;
            f39345a = c13805o;
        }
    }
}
