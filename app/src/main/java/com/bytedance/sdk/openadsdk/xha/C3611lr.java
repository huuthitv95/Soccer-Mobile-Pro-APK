package com.bytedance.sdk.openadsdk.xha;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.p028vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xha.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3611lr {

    /* JADX INFO: renamed from: ri */
    private static final String[] f13378ri = {"gecko16-normal-useast5.tiktokv.us"};

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xha.lr$lr */
    private static class lr {

        /* JADX INFO: renamed from: ri */
        private static final C3611lr f13382ri = new C3611lr();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xha.lr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11179ri();
    }

    private C3611lr() {
        try {
            GeckoHubImp.inst(C3299nr.m14642ri());
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    /* JADX INFO: renamed from: ik */
    public static void m16741ik() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.xha.lr.2
                @Override // com.bykv.p028vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return dzy.m16392fi();
                }
            });
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    /* JADX INFO: renamed from: ka */
    private static String m16742ka() {
        String[] strArrYjm = C3299nr.m14639ka().yjm();
        if (strArrYjm != null) {
            int length = strArrYjm.length;
        }
        if (strArrYjm == null) {
            strArrYjm = f13378ri;
        }
        String str = strArrYjm[new SecureRandom().nextInt(strArrYjm.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = f13378ri;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m16743lr(Map<String, wjv> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject = jSONObject2;
            }
            Iterator<wjv> it = map.values().iterator();
            while (it.hasNext()) {
                C3521ka.m15948ri(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3611lr m16744ri() {
        return lr.f13382ri;
    }

    /* JADX INFO: renamed from: lr */
    public ILoader m16746lr() {
        try {
            return GeckoHubImp.inst(C3299nr.m14642ri()).getGeckoResLoader();
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m16747ri(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(C3299nr.m14642ri()).getResCount(iLoader, str);
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: ri */
    public WebResourceResponseModel m16748ri(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(C3299nr.m14642ri()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            C2707ac.m10206ri("GeckoHub", "findRes error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16749ri(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(C3299nr.m14642ri()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                C2707ac.m10206ri("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16750ri(Map<String, wjv> map) {
        m16751ri(map, (ri) null, false);
    }

    /* JADX INFO: renamed from: ri */
    public void m16751ri(final Map<String, wjv> map, final ri riVar, boolean z) {
        try {
            String strM12377ri = C3089aw.m12377ri(C3299nr.m14642ri());
            if (TextUtils.isEmpty(strM12377ri)) {
                return;
            }
            for (wjv wjvVar : map.values()) {
                if (wjvVar != null) {
                    if (z || !wjvVar.m14554wm()) {
                        C3521ka.m15940lr(wjvVar);
                    } else {
                        map.remove(wjvVar.mvf());
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(m16742ka());
            GeckoHubImp.inst(C3299nr.m14642ri()).preload(strM12377ri, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.xha.lr.1
                @Override // com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        wjv wjvVar2 = (wjv) map.get(jSONObject.optString("channel"));
                        if (wjvVar2 != null) {
                            C3414ik.ri.m15572ri(str, jSONObject, wjvVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        ri riVar2 = riVar;
                        if (riVar2 != null) {
                            riVar2.mo11179ri();
                        }
                        C3611lr.m16743lr(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new C3612ri());
        } catch (Throwable th) {
            m16743lr(map, null, th.toString());
            C2707ac.m10206ri("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }
}
