package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4109v6 {
    /* JADX INFO: renamed from: a */
    public static final C4087u6 m19651a(Download download) {
        Intrinsics.checkNotNullParameter(download, "<this>");
        return new C4087u6(download);
    }

    /* JADX INFO: renamed from: a */
    public static final File m19652a(C4087u6 c4087u6, File file) {
        Intrinsics.checkNotNullParameter(c4087u6, "<this>");
        return new File(file, c4087u6.m19569b());
    }

    /* JADX INFO: renamed from: a */
    public static final String m19653a(int i) {
        if (i == 0) {
            return "STATE_QUEUED";
        }
        if (i == 1) {
            return "STATE_STOPPED";
        }
        if (i == 2) {
            return "STATE_DOWNLOADING";
        }
        if (i == 3) {
            return "STATE_COMPLETED";
        }
        if (i == 4) {
            return "STATE_FAILED";
        }
        if (i == 5) {
            return "STATE_REMOVING";
        }
        if (i == 7) {
            return "STATE_RESTARTING";
        }
        return "UNKNOWN STATE " + i;
    }
}
