package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.l */
/* JADX INFO: compiled from: UnitSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13640l extends C13631c {
    /* JADX INFO: renamed from: N */
    public static C13640l m39751N() {
        return new C13640l();
    }

    /* JADX INFO: renamed from: h */
    public static C13640l m39752h(String str) {
        C13640l c13640l = new C13640l();
        try {
            c13640l.m39637e(str);
            c13640l.m39665r(1);
            c13640l.m39677x(1);
            c13640l.m39681z(5);
            c13640l.m39623b(1);
            c13640l.m39628c(1);
            return c13640l;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("UnitSetting", e.getMessage());
            }
            return c13640l;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C13640l m39753i(String str) {
        C13640l c13640l = new C13640l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        c13640l.m39665r(1);
        c13640l.m39637e(str);
        c13640l.m39621a(arrayList);
        c13640l.m39626b(arrayList2);
        c13640l.m39677x(1);
        c13640l.m39623b(-2);
        c13640l.m39628c(-2);
        c13640l.m39681z(5);
        c13640l.m39633d(3600L);
        c13640l.m39651k(2);
        c13640l.m39632d(1);
        c13640l.m39671u(100);
        c13640l.m39642g(0);
        c13640l.m39647i(1);
        c13640l.m39655m(0);
        c13640l.m39673v(60);
        c13640l.m39661p(10);
        c13640l.m39663q(60);
        return c13640l;
    }

    /* JADX INFO: renamed from: j */
    public static C13640l m39754j(String str) {
        C13640l c13640l = new C13640l();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            c13640l.m39621a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            c13640l.m39626b(arrayList2);
            c13640l.m39637e(str);
            c13640l.m39665r(1);
            c13640l.m39677x(1);
            c13640l.m39623b(-2);
            c13640l.m39628c(-2);
            c13640l.m39681z(5);
            c13640l.m39633d(3600L);
            c13640l.m39651k(2);
            c13640l.m39632d(3);
            return c13640l;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("UnitSetting", e.getMessage());
            }
            return c13640l;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C13640l m39755k(String str) {
        C13640l c13640lM39751N = m39751N();
        c13640lM39751N.m39632d(0);
        return c13640lM39751N;
    }

    /* JADX INFO: renamed from: l */
    public static C13640l m39756l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C13631c.m39603a(new JSONObject(str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("UnitSetting", "parseSetting", e);
            }
            return null;
        }
    }
}
