package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8282a {

    /* JADX INFO: renamed from: a */
    public final String f18463a;

    public AbstractC8282a(String str) {
        this.f18463a = str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20683a(int i, int i2, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i > 0 && i2 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i);
            int i3 = 0;
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                long jOptLong = jSONArray.optLong(i4, 0L);
                if (jOptLong > jCurrentTimeMillis) {
                    i3++;
                    copyOnWriteArrayList.add(Long.valueOf(jOptLong));
                }
            }
            if (i3 >= i2) {
                return true;
            }
        }
        return false;
    }
}
