package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.e */
/* JADX INFO: compiled from: MBDNSManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13633e {

    /* JADX INFO: renamed from: a */
    public int f38092a;

    /* JADX INFO: renamed from: b */
    private HashMap<String, C13634f> f38093b;

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.e$b */
    /* JADX INFO: compiled from: MBDNSManager.java */
    static class b {

        /* JADX INFO: renamed from: a */
        private static final C13633e f38094a = new C13633e();
    }

    private C13633e() {
        this.f38092a = 6;
        this.f38093b = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static C13633e m39694a() {
        return b.f38094a;
    }

    /* JADX INFO: renamed from: a */
    public int m39695a(String str) {
        HashMap<String, C13634f> map;
        C13634f c13634f;
        int i;
        if (TextUtils.isEmpty(str) || (map = this.f38093b) == null || !map.containsKey(str) || (c13634f = this.f38093b.get(str)) == null) {
            return 0;
        }
        if (c13634f.m39702b()) {
            i = 1;
        } else {
            i = c13634f.m39698a() >= this.f38092a ? 2 : 0;
        }
        c13634f.m39700a(false);
        return i;
    }

    /* JADX INFO: renamed from: b */
    public void m39696b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f38093b == null) {
                this.f38093b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                C13634f c13634f = new C13634f();
                c13634f.m39699a(next);
                c13634f.m39701b(string);
                this.f38093b.put(next, c13634f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
