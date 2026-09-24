package com.facebook.ads.redexgen.core;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9D */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48529D {
    public static void A00(AudioTrack audioTrack, C48098O c48098o) {
        LogSessionId logSessionIdA00 = c48098o.A00();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionIdA00.equals(logSessionId)) {
            audioTrack.setLogSessionId(logSessionIdA00);
        }
    }
}
