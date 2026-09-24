package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.u8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12547u8 {

    /* JADX INFO: renamed from: b */
    private static C12547u8 f32556b;

    /* JADX INFO: renamed from: a */
    private C11485I5 f32557a;

    private C12547u8() {
    }

    /* JADX INFO: renamed from: a */
    private static C12547u8 m33892a() {
        if (f32556b == null) {
            f32556b = new C12547u8();
        }
        return f32556b;
    }

    /* JADX INFO: renamed from: a */
    public static void m33893a(C11377C5 c11377c5, C12476s8 c12476s8) {
        if (c11377c5 != null) {
            try {
                m33892a().f32557a = new C11485I5(c11377c5, c12476s8);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m33894a(C11703Ud.a aVar) {
        m33895a(aVar, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public static void m33895a(C11703Ud.a aVar, Map<String, Object> map) {
        C11485I5 c11485i5 = m33892a().f32557a;
        if (c11485i5 == null) {
            Log.d(C11341A5.f23810a, C11341A5.f23809V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f25989b));
        }
        c11485i5.m26068a(aVar.f25988a, map);
    }
}
