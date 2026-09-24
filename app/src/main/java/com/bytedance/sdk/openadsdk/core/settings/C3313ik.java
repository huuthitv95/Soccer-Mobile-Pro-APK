package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3561aw;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3313ik {

    /* JADX INFO: renamed from: ri */
    private static final ConcurrentHashMap<String, C3318lr> f11568ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: lr */
    private static C3318lr m14767lr(String str) {
        return new C3318lr(str, 1);
    }

    /* JADX INFO: renamed from: lr */
    private static File m14768lr() {
        return com.bytedance.sdk.component.utils.xha.m10330ri(C3299nr.m14642ri(), C3299nr.m14642ri().getFilesDir(), "tt_ads_conf_sr");
    }

    /* JADX INFO: renamed from: lr */
    private static HashMap<String, C3318lr> m14769lr(JSONArray jSONArray) {
        HashMap<String, C3318lr> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C3318lr c3318lrM14771ri = m14771ri(jSONArray.getJSONObject(i));
                if (c3318lrM14771ri != null) {
                    map.put(c3318lrM14771ri.f11597ri, c3318lrM14771ri);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ri */
    public static C3318lr m14770ri(String str) {
        C3318lr c3318lr = f11568ri.get(str);
        return c3318lr == null ? m14767lr(str) : c3318lr;
    }

    /* JADX INFO: renamed from: ri */
    private static C3318lr m14771ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C3318lr(jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public static void m14772ri() {
        File fileM14768lr = m14768lr();
        if (fileM14768lr.exists()) {
            fileM14768lr.delete();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14773ri(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileM14768lr = m14768lr();
        File file = new File(fileM14768lr.getParent(), fileM14768lr.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileM14768lr);
                    if (file.exists()) {
                        file.delete();
                    }
                    C3561aw.m16367ri(fileWriter2);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    C3561aw.m16367ri(fileWriter);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    C3561aw.m16367ri(fileWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        HashMap<String, C3318lr> mapM14769lr = m14769lr(jSONArray);
        if (mapM14769lr.isEmpty()) {
            return;
        }
        for (Map.Entry<String, C3318lr> entry : mapM14769lr.entrySet()) {
            f11568ri.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14774ri(boolean z) {
        File fileM14768lr = m14768lr();
        if (fileM14768lr.exists()) {
            try {
                HashMap<String, C3318lr> mapM14769lr = m14769lr(new JSONArray(new String(com.bytedance.sdk.component.utils.xha.m10327ka(fileM14768lr))));
                if (mapM14769lr.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, C3318lr> entry : mapM14769lr.entrySet()) {
                    f11568ri.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }
}
