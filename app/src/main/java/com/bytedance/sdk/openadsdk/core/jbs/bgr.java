package com.bytedance.sdk.openadsdk.core.jbs;

import android.text.TextUtils;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.p200co.C3155ka;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {
    /* JADX INFO: renamed from: ik */
    private static void m13602ik(String str) {
        File fileM13608ri = m13608ri(str);
        if (fileM13608ri == null) {
            return;
        }
        File file = new File(fileM13608ri + ".tmp");
        C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
        c2743riM10411ka.m10373ri(8);
        c2743riM10411ka.m10371lr("preloadStaticRes");
        c2743riM10411ka.m10365ik(str);
        c2743riM10411ka.m10404ri(fileM13608ri.getParent(), fileM13608ri.getName());
        C2739lr c2739lrM10402ri = c2743riM10411ka.m10402ri();
        if (c2739lrM10402ri != null && c2739lrM10402ri.m10354di() && c2739lrM10402ri.m10355fi() != null && c2739lrM10402ri.m10355fi().exists()) {
            C2707ac.m10205ri("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (fileM13608ri.exists()) {
            try {
                fileM13608ri.delete();
            } catch (Throwable th) {
                C2707ac.m10196ik("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                C2707ac.m10196ik("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m13603ik(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strM13171ri = C3155ka.m13171ri(strOptString, str);
                File fileM13608ri = m13608ri(strM13171ri);
                if (fileM13608ri != null && fileM13608ri.exists() && fileM13608ri.length() > 0) {
                    return;
                } else {
                    m13602ik(strM13171ri);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public static void m13604ka(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strM13171ri = C3155ka.m13171ri(strOptString, str);
                File fileM13608ri = m13608ri(strM13171ri);
                if (fileM13608ri != null && fileM13608ri.exists() && fileM13608ri.length() > 0) {
                    return;
                } else {
                    m13602ik(strM13171ri);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public static InputStream m13605lr(String str) {
        File fileM13608ri = m13608ri(str);
        if (fileM13608ri == null || !fileM13608ri.exists() || fileM13608ri.length() <= 0) {
            return null;
        }
        try {
            return new FileInputStream(fileM13608ri);
        } catch (Throwable th) {
            C2707ac.m10196ik("ExpressStaticResPreload", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m13607lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3287oh c3287ohM14575zv;
        return (wjvVar == null || (c3287ohM14575zv = wjvVar.m14575zv()) == null || c3287ohM14575zv.m14225di() == null) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static File m13608ri(String str) {
        String strM10220ri = C2717fi.m10220ri(str);
        if (strM10220ri == null) {
            return null;
        }
        return new File(com.bytedance.sdk.component.utils.xha.m10328lr(C3299nr.m14642ri(), new File(CacheDirFactory.getRootDir()).getName() + "/express_static_res"), strM10220ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m13609ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.jbs.bgr.1
            @Override // java.lang.Runnable
            public void run() {
                C3287oh c3287ohM14575zv;
                C3287oh.ri riVarM14225di;
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null || (c3287ohM14575zv = wjvVar2.m14575zv()) == null || (riVarM14225di = c3287ohM14575zv.m14225di()) == null) {
                    return;
                }
                String strM14827ac = C3322sf.m14819lr().m14827ac();
                bgr.m13610ri(wjvVar, riVarM14225di.m14236ri(), strM14827ac);
                bgr.m13603ik(riVarM14225di.m14234lr(), strM14827ac);
                bgr.m13604ka(riVarM14225di.m14232ik(), strM14827ac);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m13610ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                String strM13171ri = C3155ka.m13171ri(strOptString, str);
                String strM10220ri = C2717fi.m10220ri(strM13171ri);
                InputStream inputStreamM15836ri = C3491ka.m15836ri(strM13171ri, strM10220ri);
                if (inputStreamM15836ri != null) {
                    try {
                        inputStreamM15836ri.close();
                    } catch (IOException unused) {
                    }
                } else {
                    C3491ka.m15834ri(strM13171ri).mo9652ik(1).mo9665ri(strM10220ri).mo9659ri(new C3492lr(wjvVar, strM13171ri, new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.jbs.bgr.2
                        @Override // com.bytedance.sdk.component.p145fi.slm
                        /* JADX INFO: renamed from: ri */
                        public void mo8254ri(int i2, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.p145fi.slm
                        /* JADX INFO: renamed from: ri */
                        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                            interfaceC2630sf.mo9676ri();
                        }
                    }), 4);
                }
            }
        }
    }
}
