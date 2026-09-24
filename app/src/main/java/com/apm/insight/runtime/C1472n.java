package com.apm.insight.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.runtime.n */
/* JADX INFO: compiled from: ProcessTrack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1472n {

    /* JADX INFO: renamed from: a */
    private static File f885a;

    /* JADX INFO: renamed from: com.apm.insight.runtime.n$a */
    /* JADX INFO: compiled from: ProcessTrack.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f886a;

        /* JADX INFO: renamed from: b */
        private String f887b;

        /* JADX INFO: renamed from: c */
        private long f888c;

        a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                C1386c.m990a();
                C1468j.m1652a(new RuntimeException("err ProcessTrack line:".concat(String.valueOf(str))), "NPTH_CATCH");
                return;
            }
            this.f887b = strArrSplit[0];
            this.f886a = strArrSplit[1];
            try {
                this.f888c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(new RuntimeException("err ProcessTrack line:".concat(String.valueOf(str)), th), "NPTH_CATCH");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static File m1706a(long j) {
        return new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/ProcessTrack/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, a> m1707a(long j, String str) throws Throwable {
        File file = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/ProcessTrack/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayM1324a = C1430f.m1324a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    for (int length2 = jSONArrayM1324a.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayM1324a.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', AbstractJsonLexerKt.COLON).replace(".txt", ""), new a(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static void m1708a(String str, String str2) {
        File file;
        try {
            if (f885a == null) {
                C1390e.m1032g();
                String strM1291b = C1425a.m1291b();
                if (strM1291b == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    f885a = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + '/' + strM1291b.replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                    file = f885a;
                }
            } else {
                file = f885a;
            }
            if (file != null) {
                C1430f.m1327a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
