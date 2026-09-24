package com.apm.insight.runtime;

import androidx.work.WorkRequest;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.apm.insight.runtime.b */
/* JADX INFO: compiled from: AppAliveTrack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1460b {

    /* JADX INFO: renamed from: a */
    private static long f839a = -30000;

    /* JADX INFO: renamed from: b */
    private static File f840b;

    /* JADX INFO: renamed from: a */
    public static String m1612a(long j, String str) {
        try {
            return C1430f.m1321a(new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/TrackInfo/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + RemoteSettings.FORWARD_SLASH_STRING + str), "\n");
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1613a() {
        File file = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                C1430f.m1334a(new File(file, list[i]));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1614a(long j) throws Throwable {
        if (j - f839a < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return;
        }
        f839a = j;
        try {
            if (f840b == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                f840b = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + RemoteSettings.FORWARD_SLASH_STRING + C1390e.m1030f());
            }
            C1430f.m1327a(f840b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }
}
