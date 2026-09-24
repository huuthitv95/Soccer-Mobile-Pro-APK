package com.apm.insight.p021k;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.p018h.C1406b;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1472n;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.k.d */
/* JADX INFO: compiled from: CrashUploadManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1417d {

    /* JADX INFO: renamed from: a */
    private static volatile C1417d f665a;

    /* JADX INFO: renamed from: b */
    private volatile Context f666b;

    private C1417d(Context context) {
        this.f666b = context;
    }

    /* JADX INFO: renamed from: a */
    public static C1417d m1226a() {
        if (f665a == null) {
            f665a = new C1417d(C1390e.m1032g());
        }
        return f665a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1227a(JSONObject jSONObject, File file, File file2) {
        try {
            return C1418e.m1233a(C1418e.m1251g(), jSONObject.toString(), file, file2, C1472n.m1706a(System.currentTimeMillis()), new File(C1406b.m1174a())).m1345a();
        } catch (Throwable th) {
            C1373a.m874b(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1228a(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String strM1245c = C1418e.m1245c();
            int i = 0;
            File file = new File(C1434j.m1368a(this.f666b), C1390e.m1013a(j, CrashType.ANR, false, false));
            C1430f.m1322a(file, file.getName(), strM1245c, jSONObject, C1418e.m1244b());
            if (z && !Npth.isStopUpload()) {
                jSONObject.put("upload_scene", DevicePublicKeyStringDef.DIRECT);
                jSONObject.put("crash_uuid", file.getName());
                if (C1447a.m1543h()) {
                    HashMap<String, C1472n.a> mapM1707a = C1472n.m1707a(j, "anr_trace");
                    fileArr = new File[mapM1707a.size() + 2];
                    for (Map.Entry<String, C1472n.a> entry : mapM1707a.entrySet()) {
                        if (!entry.getKey().equals(C1425a.m1291b())) {
                            fileArr[i] = C1434j.m1369a(this.f666b, entry.getValue().f886a);
                            i++;
                        }
                    }
                } else {
                    fileArr = new File[2];
                }
                fileArr[fileArr.length - 1] = C1434j.m1369a(this.f666b, C1390e.m1030f());
                fileArr[fileArr.length - 2] = C1472n.m1706a(j);
                if (C1418e.m1233a(strM1245c, jSONObject.toString(), fileArr).m1345a()) {
                    C1430f.m1334a(file);
                    if (Npth.hasCrash()) {
                        return;
                    }
                    C1430f.m1334a(C1434j.m1384e(C1390e.m1032g()));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1229a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String strM1245c = C1418e.m1245c();
                File file = new File(C1434j.m1368a(this.f666b), C1434j.m1372a(C1390e.m1028e()));
                C1430f.m1322a(file, file.getName(), strM1245c, jSONObject, C1418e.m1237a());
                jSONObject.put("upload_scene", DevicePublicKeyStringDef.DIRECT);
                if (!C1418e.m1242b(strM1245c, jSONObject.toString()).m1345a()) {
                    return false;
                }
                C1430f.m1334a(file);
                return true;
            } catch (Throwable th) {
                C1373a.m874b(th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m1230b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String strM1250f = C1418e.m1250f();
            File file = new File(C1434j.m1368a(this.f666b), C1434j.m1380c());
            C1430f.m1322a(file, file.getName(), strM1250f, jSONObject, C1418e.m1244b());
            if (C1418e.m1232a(strM1250f, jSONObject.toString()).m1345a()) {
                C1430f.m1334a(file);
            }
        } catch (Throwable th) {
            C1373a.m874b(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1231c(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public final void run() {
                String strM1245c = C1418e.m1245c();
                try {
                    jSONObject.put("upload_scene", DevicePublicKeyStringDef.DIRECT);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C1418e.m1242b(strM1245c, jSONObject.toString());
            }
        });
    }
}
