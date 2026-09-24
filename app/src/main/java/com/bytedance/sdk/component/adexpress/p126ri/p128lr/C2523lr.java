package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p124ka.jbs;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2516ka;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2517lr;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.xha;
import com.ironsource.C11341A5;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2523lr {

    /* JADX INFO: renamed from: ri */
    static Object f7010ri = new Object();

    /* JADX INFO: renamed from: di */
    private static File m9103di(String str) {
        if (m9105fi()) {
            for (C2518ri.ri riVar : m9109ka().m9036di()) {
                if (riVar.m9060ri() != null && riVar.m9060ri().equals(str)) {
                    File file = new File(C2520fi.m9075mj(), C2717fi.m10220ri(riVar.m9060ri()));
                    String strM10219ri = C2717fi.m10219ri(file);
                    if (riVar.m9058lr() == null || !riVar.m9058lr().equals(strM10219ri)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: di */
    private static String m9104di() {
        C2518ri c2518riM9109ka = m9109ka();
        if (c2518riM9109ka == null) {
            return null;
        }
        return c2518riM9109ka.m9040ka();
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m9105fi() {
        return C2520fi.m9074lr().m9079fi();
    }

    /* JADX INFO: renamed from: fi */
    private static boolean m9106fi(String str) {
        C2518ri c2518riM9109ka;
        List<C2518ri.ri> listM9036di;
        if (!m9105fi() || (c2518riM9109ka = m9109ka()) == null || (listM9036di = c2518riM9109ka.m9036di()) == null) {
            return false;
        }
        for (C2518ri.ri riVar : listM9036di) {
            if (riVar != null && TextUtils.equals(str, riVar.m9060ri())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public static C2517lr m9107ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2517lr c2517lrM9141ri = xha.m9136ri().m9141ri(str);
        if (c2517lrM9141ri != null) {
            c2517lrM9141ri.m9031ri(Long.valueOf(System.currentTimeMillis()));
            m9119ri(c2517lrM9141ri);
        }
        return c2517lrM9141ri;
    }

    /* JADX INFO: renamed from: ik */
    public static String m9108ik() {
        return C2519di.m9063ik();
    }

    /* JADX INFO: renamed from: ka */
    public static C2518ri m9109ka() {
        return C2520fi.m9074lr().m9078di();
    }

    /* JADX INFO: renamed from: ka */
    public static String m9110ka(String str) {
        C2518ri c2518ri;
        C2518ri c2518riM9109ka = m9109ka();
        if (c2518riM9109ka == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return m9104di();
        }
        Map<String, C2518ri> mapM9046ri = c2518riM9109ka.m9046ri();
        if (mapM9046ri == null || mapM9046ri.size() <= 0 || (c2518ri = mapM9046ri.get(str)) == null) {
            return null;
        }
        return c2518ri.m9040ka();
    }

    /* JADX INFO: renamed from: lr */
    private static File m9111lr(String str, String str2) {
        C2518ri c2518ri;
        C2518ri c2518riM9109ka = m9109ka();
        if (c2518riM9109ka != null && m9105fi()) {
            Map<String, C2518ri> mapM9046ri = c2518riM9109ka.m9046ri();
            if (mapM9046ri.size() != 0 && (c2518ri = mapM9046ri.get(str)) != null) {
                for (C2518ri.ri riVar : c2518ri.m9036di()) {
                    if (riVar.m9060ri() != null && riVar.m9060ri().equals(str2)) {
                        File file = new File(C2520fi.m9075mj(), C2717fi.m10220ri(riVar.m9060ri()));
                        String strM10219ri = C2717fi.m10219ri(file);
                        if (riVar.m9058lr() == null || !riVar.m9058lr().equals(strM10219ri)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public static Set<String> m9112lr(String str) {
        return xha.m9136ri().m9140lr(str);
    }

    /* JADX INFO: renamed from: lr */
    public static void m9113lr() {
        try {
            C2524mj.m9123ka();
            File fileM9075mj = C2520fi.m9075mj();
            if (fileM9075mj == null || !fileM9075mj.exists()) {
                return;
            }
            if (fileM9075mj.getParentFile() != null) {
                xha.m10326ik(fileM9075mj.getParentFile());
            } else {
                xha.m10326ik(fileM9075mj);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m9114lr(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static C2517lr m9115ri(String str) {
        return xha.m9136ri().m9141ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public static C2525ri m9116ri(String str, jbs.EnumC2494ri enumC2494ri, String str2, String str3) {
        File fileM9103di;
        C2525ri c2525ri = new C2525ri();
        if (TextUtils.isEmpty(str3)) {
            fileM9103di = null;
        } else {
            fileM9103di = m9111lr(str3, str);
            if (fileM9103di != null) {
                c2525ri.m9131ri(1);
            }
        }
        if (fileM9103di == null && (fileM9103di = xha(str)) != null) {
            c2525ri.m9131ri(3);
        }
        if (fileM9103di == null && (fileM9103di = m9103di(str)) != null) {
            c2525ri.m9131ri(2);
        }
        if (TextUtils.isEmpty(str3)) {
            if (!m9106fi(str)) {
                c2525ri.m9131ri(6);
            }
        } else if (!m9120ri(str, str3)) {
            c2525ri.m9131ri(4);
        }
        c2525ri.m9129lr();
        if (fileM9103di != null) {
            try {
                c2525ri.m9132ri(new WebResourceResponse(enumC2494ri.m8818ri(), C11341A5.f23802O, new FileInputStream(fileM9103di)));
            } catch (Throwable unused) {
            }
        }
        return c2525ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m9117ri() {
        C2520fi.m9074lr();
    }

    /* JADX INFO: renamed from: ri */
    public static void m9118ri(C2516ka c2516ka) {
        xha.m9136ri().m9142ri(c2516ka, c2516ka.f6970di);
    }

    /* JADX INFO: renamed from: ri */
    private static void m9119ri(final C2517lr c2517lr) {
        C2495ka.m8821ri(new AbstractRunnableC2676ik("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.ri.lr.lr.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C2523lr.f7010ri) {
                    C2519di.m9065ri().m9071ri(c2517lr, true);
                }
            }
        }, 10);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m9120ri(String str, String str2) {
        C2518ri c2518riM9109ka;
        C2518ri c2518ri;
        if (!m9105fi() || (c2518riM9109ka = m9109ka()) == null) {
            return false;
        }
        Map<String, C2518ri> mapM9046ri = c2518riM9109ka.m9046ri();
        if (mapM9046ri.size() == 0 || (c2518ri = mapM9046ri.get(str2)) == null) {
            return false;
        }
        for (C2518ri.ri riVar : c2518ri.m9036di()) {
            if (riVar != null && TextUtils.equals(str, riVar.m9060ri())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9121ri(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static File xha(String str) {
        List<Pair<String, String>> listM9052lr;
        C2518ri.lr lrVarM9037fi = m9109ka().m9037fi();
        if (lrVarM9037fi != null && (listM9052lr = lrVarM9037fi.m9052lr()) != null && listM9052lr.size() > 0) {
            for (Pair<String, String> pair : listM9052lr) {
                if (pair.second != null && ((String) pair.second).equals(str)) {
                    return new File(C2520fi.m9075mj(), (String) pair.first);
                }
            }
        }
        return null;
    }
}
