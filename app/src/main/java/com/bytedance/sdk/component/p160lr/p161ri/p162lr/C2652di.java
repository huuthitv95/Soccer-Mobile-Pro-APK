package com.bytedance.sdk.component.p160lr.p161ri.p162lr;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.lr.di */
/* JADX INFO: loaded from: classes3.dex */
final class C2652di {

    /* JADX INFO: renamed from: lr */
    static long f7547lr;

    /* JADX INFO: renamed from: ri */
    static C2653fi f7548ri;

    private C2652di() {
    }

    /* JADX INFO: renamed from: ri */
    static C2653fi m9926ri() {
        synchronized (C2652di.class) {
            C2653fi c2653fi = f7548ri;
            if (c2653fi == null) {
                return new C2653fi();
            }
            f7548ri = c2653fi.f7549di;
            c2653fi.f7549di = null;
            f7547lr -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return c2653fi;
        }
    }

    /* JADX INFO: renamed from: ri */
    static void m9927ri(C2653fi c2653fi) {
        if (c2653fi.f7549di != null || c2653fi.xha != null) {
            throw new IllegalArgumentException();
        }
        if (c2653fi.f7552ka) {
            return;
        }
        synchronized (C2652di.class) {
            long j = f7547lr;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            f7547lr = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            c2653fi.f7549di = f7548ri;
            c2653fi.f7551ik = 0;
            c2653fi.f7553lr = 0;
            f7548ri = c2653fi;
        }
    }
}
