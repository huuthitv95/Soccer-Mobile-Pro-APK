package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.component.p168ri.InterfaceC2702qt;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.common.C2945ik;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3274aw;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.p219ik.InterfaceC3219ka;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.InterfaceC3352ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2880fi;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2881ik;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2882ka;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2883lr;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2885qt;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2886ri;
import com.bytedance.sdk.openadsdk.p179co.C2905ri;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2906ac;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2907aw;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2910bu;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2911co;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2912di;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2913fi;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2914ik;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2915ka;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2916lr;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2917mj;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2918nr;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2919qt;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2920ri;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2921sf;
import com.bytedance.sdk.openadsdk.p179co.p180ri.C2924vr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.p236ka.p242lr.InterfaceC3426ri;
import com.bytedance.sdk.openadsdk.p259sf.C3519ri;
import com.bytedance.sdk.openadsdk.p259sf.InterfaceC3516ik;
import com.bytedance.sdk.openadsdk.p259sf.InterfaceC3517ka;
import com.bytedance.sdk.openadsdk.p259sf.InterfaceC3518lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.internal.ShareConstants;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import com.ironsource.sdk.controller.InterfaceC12497f;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class dzy implements InterfaceC2486lr, com.bytedance.sdk.component.utils.igq.InterfaceC2719ri, InterfaceC3518lr {

    /* JADX INFO: renamed from: mj */
    private static final Map<String, Boolean> f10583mj;

    /* JADX INFO: renamed from: ac */
    private InterfaceC3247vr f10584ac;

    /* JADX INFO: renamed from: aw */
    private int f10585aw;

    /* JADX INFO: renamed from: ay */
    private InterfaceC2880fi f10586ay;
    private String bgr;
    private RunnableC3208ik bnj;

    /* JADX INFO: renamed from: bu */
    private com.bytedance.sdk.openadsdk.core.model.wjv f10587bu;

    /* JADX INFO: renamed from: co */
    private String f10588co;

    /* JADX INFO: renamed from: di */
    private String f10589di;
    private C2705vr dzy;

    /* JADX INFO: renamed from: fe */
    private igq f10591fe;
    private boolean feb;

    /* JADX INFO: renamed from: fr */
    private JSONObject f10593fr;

    /* JADX INFO: renamed from: ig */
    private String f10594ig;
    private InterfaceC2881ik igq;
    private JSONObject ihz;
    private InterfaceC3516ik jbs;

    /* JADX INFO: renamed from: jc */
    private com.bytedance.sdk.openadsdk.p174aw.xha f10596jc;

    /* JADX INFO: renamed from: ka */
    private WeakReference<C2634di> f10597ka;

    /* JADX INFO: renamed from: kt */
    private boolean f10598kt;

    /* JADX INFO: renamed from: nr */
    private JSONObject f10600nr;
    private HashMap<String, C3323sf> ory;

    /* JADX INFO: renamed from: pv */
    private InterfaceC2883lr f10602pv;

    /* JADX INFO: renamed from: qt */
    private String f10604qt;

    /* JADX INFO: renamed from: ri */
    protected Map<String, Object> f10605ri;

    /* JADX INFO: renamed from: sf */
    private WeakReference<View> f10606sf;
    private InterfaceC3352ri srn;

    /* JADX INFO: renamed from: su */
    private InterfaceC3219ka f10607su;

    /* JADX INFO: renamed from: ta */
    private InterfaceC3210ri f10608ta;
    private InterfaceC2510sf tan;
    private InterfaceC3118lr tnn;

    /* JADX INFO: renamed from: uq */
    private InterfaceC3517ka f10609uq;

    /* JADX INFO: renamed from: vr */
    private int f10610vr;
    private InterfaceC2886ri wjv;

    /* JADX INFO: renamed from: xd */
    private InterfaceC3418fi f10611xd;
    private InterfaceC3338fi xha;

    /* JADX INFO: renamed from: zf */
    private InterfaceC2885qt f10612zf;
    private Context zyn;
    private boolean slm = true;

    /* JADX INFO: renamed from: dw */
    private boolean f10590dw = true;
    private boolean hcw = false;

    /* JADX INFO: renamed from: oh */
    private boolean f10601oh = false;

    /* JADX INFO: renamed from: lr */
    boolean f10599lr = false;

    /* JADX INFO: renamed from: ik */
    boolean f10595ik = false;

    /* JADX INFO: renamed from: qd */
    private boolean f10603qd = false;

    /* JADX INFO: renamed from: fi */
    private final com.bytedance.sdk.component.utils.igq f10592fi = new com.bytedance.sdk.component.utils.igq(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dzy$ik */
    private static class RunnableC3208ik implements Runnable {

        /* JADX INFO: renamed from: lr */
        private final JSONObject f10634lr;

        /* JADX INFO: renamed from: ri */
        private final InterfaceC3247vr f10635ri;

        public RunnableC3208ik(InterfaceC3247vr interfaceC3247vr, JSONObject jSONObject) {
            this.f10635ri = interfaceC3247vr;
            this.f10634lr = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            dzy.m13374lr(this.f10635ri, this.f10634lr);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dzy$lr */
    public static class C3209lr {

        /* JADX INFO: renamed from: fi */
        public int f10636fi;

        /* JADX INFO: renamed from: ik */
        public String f10637ik;

        /* JADX INFO: renamed from: ka */
        public JSONObject f10638ka;

        /* JADX INFO: renamed from: lr */
        public String f10639lr;

        /* JADX INFO: renamed from: ri */
        public String f10640ri;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.dzy$ri */
    public interface InterfaceC3210ri {
        /* JADX INFO: renamed from: ri */
        void mo12114ri();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f10583mj = concurrentHashMap;
        concurrentHashMap.put("log_event", Boolean.TRUE);
        concurrentHashMap.put("private", Boolean.TRUE);
        concurrentHashMap.put("dispatch_message", Boolean.TRUE);
        concurrentHashMap.put("custom_event", Boolean.TRUE);
        concurrentHashMap.put("log_event_v3", Boolean.TRUE);
    }

    public dzy(Context context) {
        this.zyn = context;
    }

    /* JADX INFO: renamed from: ac */
    private WebView m13358ac() {
        C2634di c2634di;
        WeakReference<C2634di> weakReference = this.f10597ka;
        if (weakReference == null || (c2634di = weakReference.get()) == null) {
            return null;
        }
        return c2634di.getWebView();
    }

    /* JADX INFO: renamed from: ac */
    private boolean m13359ac(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    /* JADX INFO: renamed from: aw */
    private void m13360aw(JSONObject jSONObject) throws Exception {
        m13392ri(jSONObject, this.f10587bu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ay */
    public JSONObject m13361ay(JSONObject jSONObject) {
        if (this.f10605ri != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.f10605ri.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                C2707ac.m10197ik(e.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ay */
    private void m13362ay() {
        InterfaceC2885qt interfaceC2885qt = this.f10612zf;
        if (interfaceC2885qt == null) {
            return;
        }
        interfaceC2885qt.mo11097ri();
    }

    private void bgr(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(C3279dw.m14095qt(this.f10587bu))) {
            return;
        }
        jSONObject.put("playable_style", C3279dw.m14095qt(this.f10587bu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bu */
    public void m13363bu(JSONObject jSONObject) {
        if (this.f10584ac == null || jSONObject == null) {
            return;
        }
        try {
            this.f10584ac.mo11546ri(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: dw */
    private boolean m13364dw() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10587bu;
        if (wjvVar == null || wjvVar.ugd() == null || C3279dw.m14092lr(this.f10587bu) || this.hcw || this.f10587bu.ugd().optInt("parent_type") != 2) {
            return false;
        }
        int iLji = this.f10587bu.lji();
        if (iLji != 8 && iLji != 7) {
            return false;
        }
        this.hcw = true;
        return true;
    }

    /* JADX INFO: renamed from: fr */
    private void m13366fr() {
        InterfaceC2885qt interfaceC2885qt = this.f10612zf;
        if (interfaceC2885qt == null) {
            return;
        }
        interfaceC2885qt.mo11096lr();
    }

    private void igq() {
        if (this.zyn == null || TextUtils.isEmpty(C3299nr.m14639ka().feb())) {
            return;
        }
        TTWebsiteActivity.m10758ri(this.zyn, this.f10587bu, this.f10594ig);
    }

    private JSONObject ihz() {
        try {
            View view = this.f10606sf.get();
            C2634di c2634di = this.f10597ka.get();
            if (view != null && c2634di != null) {
                int[] iArrM16597lr = C3583qd.m16597lr(view);
                int[] iArrM16597lr2 = C3583qd.m16597lr((View) c2634di);
                if (iArrM16597lr != null && iArrM16597lr2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", C3583qd.m16581ik(C3299nr.m14642ri(), iArrM16597lr[0] - iArrM16597lr2[0]));
                    jSONObject.put("y", C3583qd.m16581ik(C3299nr.m14642ri(), iArrM16597lr[1] - iArrM16597lr2[1]));
                    jSONObject.put("w", C3583qd.m16581ik(C3299nr.m14642ri(), view.getWidth()));
                    jSONObject.put(CmcdData.Factory.STREAMING_FORMAT_HLS, C3583qd.m16581ik(C3299nr.m14642ri(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void ihz(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.tan.m16660ri(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ik */
    private JSONObject m13368ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put("cid", wjvVar.m14392fe());
        jSONObject2.put("req_id", wjvVar.m14424jf());
        jSONObject2.put("ad_id", wjvVar.m14533tn());
        jSONObject2.put("log_extra", wjvVar.yjg());
        jSONObject2.put("isRTL", C3322sf.m14819lr().hpn());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", wjvVar.m14530ta());
        jSONObject.put("dynamic_creative", wjvVar.m14377de());
        jSONObject.put("title", wjvVar.m14559xh());
        com.bytedance.sdk.openadsdk.core.model.wjv.m14349ri(wjvVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.wjv.m14339lr(wjvVar, jSONObject);
        jSONObject.put("source", wjvVar.tpb());
        jSONObject.put("button_text", wjvVar.m14425jg());
        C3274aw c3274awLau = wjvVar.lau();
        if (c3274awLau != null) {
            jSONObject.put("deeplink_url", c3274awLau.m14016ri());
        }
        jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, wjvVar.m14426jm());
        jSONObject.put("has_show", wjvVar.feb() ? 1 : 0);
        jSONObject.put("has_click", wjvVar.nhl() ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ik */
    private void m13369ik(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            wjv(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void jbs(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewM13358ac = m13358ac();
                    if (webViewM13358ac != null) {
                        com.bytedance.sdk.component.utils.bgr.m10210ri(webViewM13358ac, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    xha(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public static JSONObject m13373lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iM14545ur;
        JSONObject jSONObject = new JSONObject();
        if (C3299nr.m14639ka() != null) {
            if (wjvVar != null) {
                try {
                    iM14545ur = wjvVar.m14545ur();
                } catch (Exception unused) {
                }
            } else {
                iM14545ur = 0;
            }
            int iLji = wjvVar != null ? wjvVar.lji() : 0;
            int iPlm = wjvVar != null ? wjvVar.plm() : 0;
            int iMhp = wjvVar != null ? wjvVar.mhp() : 0;
            boolean zM14839di = C3299nr.m14639ka().m14839di(String.valueOf(iM14545ur));
            boolean z = C3299nr.m14639ka().m14829aw(String.valueOf(iM14545ur)) == 1;
            jSONObject.put("voice_control", (iLji == 7 || iLji == 8) ? C3299nr.m14639ka().m14834bu(String.valueOf(iM14545ur)) : C3299nr.m14639ka().m14853ik(String.valueOf(iM14545ur)));
            jSONObject.put("rv_skip_time", iPlm);
            jSONObject.put("fv_skip_show", zM14839di);
            jSONObject.put("iv_skip_time", iMhp);
            jSONObject.put("show_dislike", wjvVar != null && wjvVar.nlk());
            jSONObject.put("video_adaptation", wjvVar != null ? wjvVar.hws() : 0);
            jSONObject.put("splash_image_count_down_time", C3299nr.m14639ka().wjv(String.valueOf(iM14545ur)));
            if (wjvVar != null && wjvVar.hqg() != null) {
                jSONObject.put("dynamic_configs", wjvVar.hqg());
            }
            if (C3273ac.m13965ik(wjvVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z);
            }
            jSONObject.put("bar_render_platform", wjvVar.zyn() ? 1 : 0);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m13374lr(InterfaceC3247vr interfaceC3247vr, JSONObject jSONObject) {
        if (interfaceC3247vr == null || jSONObject == null) {
            return;
        }
        try {
            interfaceC3247vr.mo11884ri(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13375lr(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            wjv(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m13376lr(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = m13397uq().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", C2945ik.m11352ri());
        jSONObject.put("innerAppName", C2945ik.m11348fi());
        jSONObject.put(C12460ra.f31825b, C2945ik.m11351lr());
        jSONObject.put("sdkEdition", C2945ik.m11349ik());
        jSONObject.put("appVersion", C2945ik.m11350ka());
        jSONObject.put("netType", C2945ik.m11347di());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", C2945ik.m11353ri(C3299nr.m14642ri()));
        if (DeviceUtils.m16332lr(C3299nr.m14642ri())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", C11744X3.f26142d);
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public boolean m13378mj(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return m13430qt();
        }
        return true;
    }

    /* JADX INFO: renamed from: nr */
    private boolean m13379nr(JSONObject jSONObject) {
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null && jSONObject != null) {
            double dMo11541ik = interfaceC3247vr.mo11541ik();
            double dMo11543ka = this.f10584ac.mo11543ka();
            int iMo11540fi = this.f10584ac.mo11540fi();
            C2707ac.m10207ri("TTAD.TopLayoutHelper", "current:", Double.valueOf(dMo11541ik), "state", Integer.valueOf(iMo11540fi), "countdownTime", Double.valueOf(dMo11543ka));
            try {
                jSONObject.put("currentTime", dMo11541ik / 1000.0d);
                if (dMo11543ka > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    jSONObject.put("countDownTime", dMo11543ka / 1000.0d);
                }
                jSONObject.put("state", iMo11540fi);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void ory() {
        if (this.jbs == null) {
            this.jbs = C3519ri.m15930ri(this, this.f10587bu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public String m13382ri(String str, String str2) {
        if (C3273ac.xha(this.f10587bu)) {
            return "show".equals(str2) ? C3571ig.m16474ri(this.f10585aw) : "aggregate_page";
        }
        if (C3279dw.m14088fi(this.f10587bu)) {
            return this.f10589di;
        }
        if (this.igq != null) {
            return C3571ig.m16474ri(this.f10585aw);
        }
        return this.tan == null ? C3571ig.m16458lr(this.f10585aw) : str;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONArray m13383ri(C3289ri c3289ri) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM14248di;
        if (c3289ri == null || !c3289ri.m14249fi() || (wjvVarM14248di = c3289ri.m14248di()) == null || TextUtils.isEmpty(wjvVarM14248di.m14536tt())) {
            return null;
        }
        try {
            return new JSONObject(wjvVarM14248di.m14536tt()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13389ri(C3289ri c3289ri, C3282ik c3282ik, InterfaceC2882ka interfaceC2882ka) {
        if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
            interfaceC2882ka.mo11093ri(false, null);
            c3282ik.m14181ri(-3);
            c3282ik.m14175ik(7);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = c3289ri.m14252ka().get(0);
        if (wjvVar != null) {
            this.f10600nr = wjvVar.ugd();
        }
        interfaceC2882ka.mo11093ri(true, c3289ri);
    }

    /* JADX INFO: renamed from: ri */
    private void m13390ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, boolean z) {
        C3221ri c3221ri = new C3221ri(C3299nr.m14642ri(), wjvVar, str, this.f10585aw);
        c3221ri.m13534ri(C3371ka.m15240ri(C3299nr.m14642ri(), str));
        if (!z) {
            c3221ri.m13547ri(false);
        }
        c3221ri.onClick(null);
    }

    /* JADX INFO: renamed from: ri */
    private void m13391ri(String str, boolean z) {
        if (this.f10611xd == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.f10611xd.mo15588ri(str);
        } else {
            this.f10611xd.mo15585lr(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m13392ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) throws Exception {
        String strM14533tn = wjvVar.m14533tn();
        if (!TextUtils.isEmpty(strM14533tn)) {
            jSONObject.put("cid", strM14533tn);
        }
        String strYjg = wjvVar.yjg();
        if (!TextUtils.isEmpty(strYjg)) {
            jSONObject.put("log_extra", strYjg);
        }
        String strM14541uo = wjvVar.m14541uo();
        if (!TextUtils.isEmpty(strM14541uo)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strM14541uo);
        }
        jSONObject.put("dc", TextUtils.isEmpty(C3299nr.m14639ka().m14843fe()) ? C3299nr.m14639ka().m14843fe() : "TX");
        jSONObject.put("language", C3089aw.m12375lr());
        jSONObject.put("isRTL", C3322sf.m14819lr().hpn());
    }

    /* JADX INFO: renamed from: ri */
    private void m13393ri(JSONObject jSONObject, boolean z, String str) {
        InterfaceC3338fi interfaceC3338fi;
        if (z) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (interfaceC3338fi = this.xha) == null) {
                    return;
                }
                interfaceC3338fi.mo10615ri();
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m13394ri(String str, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        HashMap<String, C3323sf> map;
        if (TextUtils.isEmpty(str) || (map = this.ory) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m13395ri(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString(MessengerShareContentUtility.FALLBACK_URL);
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!C2724nr.m10260ri(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    C2707ac.m10206ri("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!C2724nr.m10260ri(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e2) {
                C2707ac.m10206ri("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
        }
        return true;
    }

    private void slm(JSONObject jSONObject) {
        InterfaceC2881ik interfaceC2881ik = this.igq;
        if (interfaceC2881ik == null || jSONObject == null) {
            return;
        }
        interfaceC2881ik.mo11088ri(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: su */
    public void m13396su() {
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11545ri();
        }
    }

    private void tan(JSONObject jSONObject) {
        int i;
        double dOptDouble;
        double dOptDouble2;
        int i2;
        dzy dzyVar = this;
        if (dzyVar.tan == null || jSONObject == null) {
            return;
        }
        InterfaceC3418fi interfaceC3418fi = dzyVar.f10611xd;
        if (interfaceC3418fi != null) {
            interfaceC3418fi.mo15600vr();
        }
        com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
        bgrVar.m8965ri(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    i2 = 101;
                    try {
                        double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                        double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                        if (dzyVar.m13359ac(jSONObjectOptJSONObject2)) {
                            bgrVar.m8964ri((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                            bgrVar.m8956lr((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                            bgrVar.m8951ik((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                            bgrVar.m8954ka((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                        }
                        bgrVar.m8950ik(dOptDouble3);
                        bgrVar.m8953ka(dOptDouble4);
                        bgrVar.m8948fi(dOptDouble5);
                        bgrVar.m8946di(dOptDouble6);
                    } catch (Exception unused) {
                        dzyVar = this;
                        i = 101;
                        bgrVar.m8957lr(i);
                        bgrVar.m8967ri(jbs.m13550ri(i));
                        dzyVar.tan.mo8757ri(bgrVar);
                    }
                } catch (Exception unused2) {
                    i = 101;
                    dzyVar = this;
                    bgrVar.m8957lr(i);
                    bgrVar.m8967ri(jbs.m13550ri(i));
                    dzyVar.tan.mo8757ri(bgrVar);
                }
            } else {
                dOptDouble2 = dOptDouble2;
                i2 = 101;
            }
            try {
                String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, jbs.m13550ri(i2));
                i = i2;
                try {
                    int iOptInt = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                    bgrVar.m8968ri(zOptBoolean);
                    bgrVar.m8963ri(dOptDouble);
                    bgrVar.m8955lr(dOptDouble2);
                    bgrVar.m8967ri(strOptString);
                    bgrVar.m8957lr(iOptInt);
                    dzyVar = this;
                    dzyVar.tan.mo8757ri(bgrVar);
                } catch (Exception unused3) {
                    dzyVar = this;
                    bgrVar.m8957lr(i);
                    bgrVar.m8967ri(jbs.m13550ri(i));
                    dzyVar.tan.mo8757ri(bgrVar);
                }
            } catch (Exception unused4) {
                dzyVar = this;
                i = 101;
                bgrVar.m8957lr(i);
                bgrVar.m8967ri(jbs.m13550ri(i));
                dzyVar.tan.mo8757ri(bgrVar);
            }
        } catch (Exception unused5) {
        }
    }

    /* JADX INFO: renamed from: uq */
    private static List<String> m13397uq() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    /* JADX INFO: renamed from: uq */
    private void m13398uq(JSONObject jSONObject) {
        if (jSONObject == null || this.f10609uq == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                this.f10609uq.mo10727ri(false, null);
            } else {
                this.f10609uq.mo10727ri(true, jSONArrayOptJSONArray);
            }
        } catch (Exception unused) {
            this.f10609uq.mo10727ri(false, null);
        }
    }

    /* JADX INFO: renamed from: vr */
    private void m13399vr(JSONObject jSONObject) {
        InterfaceC3418fi interfaceC3418fi;
        if (jSONObject == null || (interfaceC3418fi = this.f10611xd) == null) {
            return;
        }
        interfaceC3418fi.mo15587lr(jSONObject);
    }

    private Context wjv() {
        WeakReference<C2634di> weakReference = this.f10597ka;
        Activity activityM10240ri = (weakReference == null || weakReference.get() == null) ? null : C2722lr.m10240ri(this.f10597ka.get());
        return activityM10240ri == null ? this.zyn : activityM10240ri;
    }

    private void wjv(JSONObject jSONObject) {
        WebView webViewM13358ac;
        if (jSONObject == null || (webViewM13358ac = m13358ac()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.bgr.m10210ri(webViewM13358ac, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void xha(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C3209lr c3209lr = new C3209lr();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        c3209lr.f10640ri = jSONObjectOptJSONObject.optString("__msg_type", null);
                        c3209lr.f10639lr = jSONObjectOptJSONObject.optString("__callback_id", null);
                        c3209lr.f10637ik = jSONObjectOptJSONObject.optString("func");
                        c3209lr.f10638ka = jSONObjectOptJSONObject.optJSONObject("params");
                        c3209lr.f10636fi = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(c3209lr.f10640ri) && !TextUtils.isEmpty(c3209lr.f10637ik)) {
                    Message messageObtainMessage = this.f10592fi.obtainMessage(11);
                    messageObtainMessage.obj = c3209lr;
                    this.f10592fi.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: zf */
    private JSONObject m13400zf() {
        return m13373lr(this.f10587bu);
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m13360aw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            m13376lr(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: aw */
    public void m13401aw() {
        InterfaceC3210ri interfaceC3210ri = this.f10608ta;
        if (interfaceC3210ri != null) {
            interfaceC3210ri.mo12114ri();
        }
    }

    public InterfaceC3118lr bgr() {
        return this.tnn;
    }

    /* JADX INFO: renamed from: bu */
    public JSONObject m13402bu() {
        JSONObject jSONObject = new JSONObject();
        try {
            igq igqVar = this.f10591fe;
            if (igqVar != null) {
                jSONObject.put("leftTime", igqVar.mo11939o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.3
                @Override // java.lang.Runnable
                public void run() {
                    dzy.this.m13363bu(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.4
                @Override // java.lang.Runnable
                public void run() {
                    dzy.this.m13409fi(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: co */
    public void m13403co() {
        InterfaceC3516ik interfaceC3516ik = this.jbs;
        if (interfaceC3516ik != null) {
            interfaceC3516ik.mo15924ri();
        }
        RunnableC3208ik runnableC3208ik = this.bnj;
        if (runnableC3208ik != null) {
            com.bytedance.sdk.openadsdk.utils.dzy.m16403lr(runnableC3208ik);
            this.bnj = null;
        }
        this.zyn = null;
        this.tnn = null;
    }

    /* JADX INFO: renamed from: co */
    public void m13404co(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        C3414ik.m15533ri(new AbstractRunnableC2676ik("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.dzy.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has(ViewHierarchyConstants.TAG_KEY) && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString(ViewHierarchyConstants.TAG_KEY);
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong("value");
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", dzy.this.f10610vr);
                    } catch (Exception unused) {
                    }
                    new C3430ri.ri(System.currentTimeMillis(), dzy.this.f10587bu).m15650ka(strOptString).m15651lr(strOptString2).m15649ik(strOptString3).m15653ri(dzy.this.f10587bu == null ? "" : dzy.this.f10587bu.tyc()).m15654ri(dzy.this.f10587bu == null ? null : dzy.this.f10587bu.m14358am()).m15648fi(String.valueOf(jOptLong)).m15647di(String.valueOf(jOptLong2)).m15655ri(jSONObjectOptJSONObject).m15656ri((InterfaceC3426ri) null);
                }
            }
        });
    }

    /* JADX INFO: renamed from: di */
    public void m13405di(String str) {
        this.f10594ig = str;
    }

    /* JADX INFO: renamed from: di */
    public void m13406di(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM13905ri = C3267lr.m13905ri(jSONObject, null, null, null, 0);
        if (wjvVarM13905ri != null) {
            boolean zXha = C3273ac.xha(this.f10587bu);
            m13390ri(wjvVarM13905ri, zXha ? C3571ig.m16458lr(this.f10585aw) : this.f10594ig, !zXha);
        }
    }

    /* JADX INFO: renamed from: di */
    public boolean m13407di() {
        return this.f10599lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            ihz(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: fi */
    public dzy m13408fi(String str) {
        this.bgr = str;
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public void m13409fi(JSONObject jSONObject) {
        double d;
        double d2;
        double dOptDouble;
        double d3;
        double d4;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        C2707ac.m10205ri("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString(InterfaceC12497f.b.f32089c);
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d4 = dOptDouble6;
                d5 = dOptDouble2;
                d2 = dOptDouble3;
                d3 = dOptDouble5;
                d = dOptDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                dOptDouble = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.slm slmVarM14294ri = new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka((float) d5).m14279ik((float) dOptDouble).m14282lr((float) d2).m14287ri((float) d).m14284lr((long) d3).m14289ri((long) d4).m14291ri(strOptString2).m14290ri((SparseArray<AbstractViewOnClickListenerC3218ik.ri>) null).m14293ri(true).m14283lr(iOptInt).m14292ri(jSONObjectOptJSONObject).m14288ri(jSONObject.optInt("clickAreaCategory", -1)).m14285lr(jSONObjectOptJSONObject2).m14294ri();
            InterfaceC2510sf interfaceC2510sf = this.tan;
            if (interfaceC2510sf != null) {
                interfaceC2510sf.mo8756ri(null, iOptInt, slmVarM14294ri);
            }
            m13394ri(strOptString, iOptInt, slmVarM14294ri);
        } catch (Exception unused) {
            InterfaceC2510sf interfaceC2510sf2 = this.tan;
            if (interfaceC2510sf2 != null) {
                interfaceC2510sf2.mo8756ri(null, -1, null);
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    public boolean m13410fi() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10587bu;
        return wjvVar != null && wjvVar.luy();
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        m13379nr(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.ihz.toString();
        }
        try {
            JSONObject jSONObjectM13716ri = C3239lr.m13716ri(this.ihz, new JSONObject(str));
            return jSONObjectM13716ri == null ? this.ihz.toString() : jSONObjectM13716ri.toString();
        } catch (Exception unused) {
            return this.ihz.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public String getTemplateInfo() {
        m13391ri("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.ihz;
            if (jSONObject != null) {
                jSONObject.put("setting", m13400zf());
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10587bu;
                if (wjvVar != null && wjvVar.hqg() != null) {
                    this.ihz.put("dynamic_configs", this.f10587bu.hqg());
                }
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10587bu;
                if (wjvVar2 != null) {
                    this.ihz.put(ShareConstants.MEDIA_EXTENSION, wjvVar2.m14372cm());
                }
            }
            m13391ri("getTemplateInfo", false);
            return this.ihz.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ik */
    public dzy m13411ik(String str) {
        this.f10604qt = str;
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public void m13412ik() {
        C2705vr c2705vr = this.dzy;
        if (c2705vr == null) {
            return;
        }
        c2705vr.m10191ri();
        this.dzy = null;
    }

    /* JADX INFO: renamed from: ik */
    public void m13413ik(int i) {
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11880lr(i);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m13414ik(JSONObject jSONObject) {
        tan.m14973ri(wjv(), this.zyn instanceof Activity, jSONObject, this.f10587bu, this.f10594ig, this.f10585aw, m13358ac(), this.xha);
    }

    /* JADX INFO: renamed from: ik */
    public void m13415ik(boolean z) {
        this.f10598kt = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.6
            @Override // java.lang.Runnable
            public void run() {
                if (dzy.this.srn != null) {
                    dzy.this.srn.mo15090ri();
                }
            }
        });
    }

    public JSONObject jbs(JSONObject jSONObject) {
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listRzk;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            InterfaceC3118lr interfaceC3118lr = this.tnn;
            if (interfaceC3118lr != null && (listRzk = interfaceC3118lr.rzk()) != null) {
                for (int i = 0; i < listRzk.size(); i++) {
                    jSONArray.put(m13368ik(listRzk.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public boolean jbs() {
        return this.f10603qd;
    }

    /* JADX INFO: renamed from: ka */
    public dzy m13416ka(String str) {
        this.f10588co = str;
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public com.bytedance.sdk.openadsdk.core.model.wjv m13417ka() {
        return this.f10587bu;
    }

    /* JADX INFO: renamed from: ka */
    public void m13418ka(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            bgrVar.m8950ik(dOptDouble);
            bgrVar.m8953ka(dOptDouble2);
            bgrVar.m8948fi(dOptDouble3);
            bgrVar.m8946di(dOptDouble4);
        }
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11882ri(iOptInt, bgrVar);
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m13419ka(boolean z) {
        this.feb = z;
    }

    /* JADX INFO: renamed from: lr */
    public C2705vr m13420lr() {
        return this.dzy;
    }

    /* JADX INFO: renamed from: lr */
    public dzy m13421lr(int i) {
        this.f10585aw = i;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public dzy m13422lr(C2634di c2634di) {
        this.f10597ka = new WeakReference<>(c2634di);
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public dzy m13423lr(String str) {
        this.f10589di = str;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public void m13424lr(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    jbs(uri.toString());
                    return;
                }
                return;
            }
            C3414ik.m15533ri(new AbstractRunnableC2676ik("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.dzy.10
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String strM13382ri;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter(ViewHierarchyConstants.TAG_KEY);
                    dzy.this.f10594ig = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (dzy.this.m13378mj(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(dzy.this.f10610vr));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = dzy.this.m13361ay(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strM13382ri = dzy.this.f10589di;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strM13382ri = dzy.this.m13382ri(queryParameter2, queryParameter3);
                        }
                        C3414ik.m15552ri(dzy.this.f10587bu, queryParameter, strM13382ri, queryParameter3, j, j3, jSONObject, C3273ac.xha(dzy.this.f10587bu));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m13425lr(boolean z) {
        this.f10599lr = z;
    }

    /* JADX INFO: renamed from: mj */
    public JSONObject m13426mj(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            try {
                jSONObject2.put("state", interfaceC3247vr.mo11551ri(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: mj */
    public void m13427mj() {
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11544lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            RunnableC3208ik runnableC3208ik = this.bnj;
            if (runnableC3208ik != null) {
                com.bytedance.sdk.openadsdk.utils.dzy.m16403lr(runnableC3208ik);
            }
            RunnableC3208ik runnableC3208ik2 = new RunnableC3208ik(this.f10584ac, jSONObject);
            this.bnj = runnableC3208ik2;
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(runnableC3208ik2);
        } catch (Exception unused) {
            C2707ac.m10196ik("TTAD.AndroidObject", "");
        }
    }

    /* JADX INFO: renamed from: nr */
    public void m13428nr() {
        igq igqVar = this.f10591fe;
        if (igqVar != null) {
            igqVar.mo11942r_();
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m13429qt(JSONObject jSONObject) {
        C3289ri c3289riM14428ka;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10587bu;
        if (wjvVar == null || (c3289riM14428ka = wjvVar.m14428ka()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listM14252ka = c3289riM14428ka.m14252ka();
        if (iOptInt < 0 || iOptInt >= listM14252ka.size()) {
            return;
        }
        m13390ri(listM14252ka.get(iOptInt), this.f10594ig, false);
        InterfaceC3118lr interfaceC3118lr = this.tnn;
        if (interfaceC3118lr != null) {
            interfaceC3118lr.gcp();
        }
    }

    /* JADX INFO: renamed from: qt */
    boolean m13430qt() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10587bu;
        return wjvVar != null && wjvVar.zxp() == 1;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            tan(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC2883lr m13431ri() {
        return this.f10602pv;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13432ri(int i) {
        this.f10610vr = i;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13433ri(View view) {
        this.f10606sf = new WeakReference<>(view);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13434ri(InterfaceC2510sf interfaceC2510sf) {
        this.tan = interfaceC2510sf;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13435ri(C2634di c2634di) {
        WebView webView;
        if (c2634di != null && (webView = c2634di.getWebView()) != null) {
            try {
                this.dzy = C2705vr.m10184ri(webView).m10162ri(new C2905ri()).m10163ri("ToutiaoJSBridge").m10161ri(new InterfaceC2702qt() { // from class: com.bytedance.sdk.openadsdk.core.dzy.1
                    @Override // com.bytedance.sdk.component.p168ri.InterfaceC2702qt
                    /* JADX INFO: renamed from: ri */
                    public <T> T mo10171ri(String str, Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.p168ri.InterfaceC2702qt
                    /* JADX INFO: renamed from: ri */
                    public <T> String mo10172ri(T t) {
                        return null;
                    }
                }).m10164ri(C3304qt.m14669lr().m14703vr()).m10160lr(true).m10165ri();
                if (C3606fi.xha()) {
                    C2917mj.m11214ri(this.dzy, this);
                    C2919qt.m11218ri(this.dzy, this);
                    C2906ac.m11198ri(this.dzy, c2634di, this, this.f10587bu);
                } else {
                    com.bytedance.sdk.openadsdk.p179co.p180ri.xha.m11228ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.p179co.p180ri.jbs.m11211ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.p179co.p180ri.tan.m11226ri(this.dzy, c2634di, this, this.f10587bu);
                }
                C2920ri.m11221ri(this.dzy, this);
                C2916lr.m11213ri(this.dzy, this);
                C2914ik.m11210ri(this.dzy, this);
                C2912di.m11208ri(this.dzy, this);
                C2921sf.m11223ri(this.dzy, this);
                C2924vr.m11227ri(this.dzy, this);
                C2907aw.m11200ri(this.dzy, c2634di);
                C2913fi.m11209ri(this.dzy, this.ihz);
                C2915ka.m11212ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.p179co.p180ri.bgr.m11203ri(this.dzy, this, this.f10587bu);
                com.bytedance.sdk.openadsdk.p179co.p180ri.slm.m11224ri(this.dzy, this);
                C2910bu.m11205ri(this.dzy, this);
                C2911co.m11206ri(this.dzy, this);
                C2918nr.m11216ri(this.dzy, this.f10587bu);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13436ri(InterfaceC2880fi interfaceC2880fi) {
        this.f10586ay = interfaceC2880fi;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13437ri(InterfaceC2881ik interfaceC2881ik) {
        this.igq = interfaceC2881ik;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13438ri(InterfaceC2885qt interfaceC2885qt) {
        this.f10612zf = interfaceC2885qt;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13439ri(InterfaceC2886ri interfaceC2886ri) {
        this.wjv = interfaceC2886ri;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13440ri(com.bytedance.sdk.openadsdk.p174aw.xha xhaVar) {
        this.f10596jc = xhaVar;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13441ri(InterfaceC3247vr interfaceC3247vr) {
        this.f10584ac = interfaceC3247vr;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13442ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        this.f10587bu = wjvVar;
        if (wjvVar != null) {
            this.f10600nr = wjvVar.ugd();
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13443ri(InterfaceC3338fi interfaceC3338fi) {
        this.xha = interfaceC3338fi;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13444ri(InterfaceC3352ri interfaceC3352ri) {
        this.srn = interfaceC3352ri;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13445ri(InterfaceC3418fi interfaceC3418fi) {
        this.f10611xd = interfaceC3418fi;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13446ri(Map<String, Object> map) {
        this.f10605ri = map;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13447ri(JSONObject jSONObject) {
        this.ihz = jSONObject;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public dzy m13448ri(boolean z) {
        this.f10601oh = z;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x0409 A[PHI: r4
  0x0409: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:239:0x0407, B:221:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    public JSONObject m13449ri(C3209lr c3209lr, int i) throws Exception {
        byte b;
        JSONObject jSONObjectIhz;
        Context context;
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        if (!NotificationCompat.CATEGORY_CALL.equals(c3209lr.f10640ri)) {
            return null;
        }
        if (C3304qt.m14669lr().m14703vr()) {
            Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + i + " method:" + c3209lr.f10637ik);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = c3209lr.f10637ik;
        str.hashCode();
        switch (str.hashCode()) {
            case -2036781162:
                b = !str.equals("subscribe_app_ad") ? (byte) -1 : (byte) 0;
                break;
            case -1423303823:
                b = !str.equals("adInfo") ? (byte) -1 : (byte) 1;
                break;
            case -1330994877:
                b = !str.equals("pauseWebView") ? (byte) -1 : (byte) 2;
                break;
            case -1169135450:
                b = !str.equals("changeVideoState") ? (byte) -1 : (byte) 3;
                break;
            case -1023873614:
                b = !str.equals("openAdLandPageLinks") ? (byte) -1 : (byte) 4;
                break;
            case -844321441:
                b = !str.equals("webview_time_track") ? (byte) -1 : (byte) 5;
                break;
            case -800853518:
                b = !str.equals("clickEvent") ? (byte) -1 : (byte) 6;
                break;
            case -794273169:
                b = !str.equals("appInfo") ? (byte) -1 : (byte) 7;
                break;
            case -715147645:
                b = !str.equals("getScreenSize") ? (byte) -1 : (byte) 8;
                break;
            case -511324706:
                b = !str.equals("openPrivacy") ? (byte) -1 : (byte) 9;
                break;
            case -278382602:
                b = !str.equals("send_temai_product_ids") ? (byte) -1 : (byte) 10;
                break;
            case -173752734:
                b = !str.equals("getTeMaiAds") ? (byte) -1 : Ascii.f22503VT;
                break;
            case 27837080:
                b = !str.equals("download_app_ad") ? (byte) -1 : Ascii.f22492FF;
                break;
            case 94756344:
                b = !str.equals("close") ? (byte) -1 : Ascii.f22490CR;
                break;
            case 105049135:
                b = !str.equals("unsubscribe_app_ad") ? (byte) -1 : Ascii.f22500SO;
                break;
            case 399543522:
                b = !str.equals("getCloseButtonInfo") ? (byte) -1 : Ascii.f22499SI;
                break;
            case 402955465:
                b = !str.equals(C11744X3.i.f26382o) ? (byte) -1 : Ascii.DLE;
                break;
            case 425443791:
                b = !str.equals("getNativeSiteCustomData") ? (byte) -1 : (byte) 17;
                break;
            case 442647767:
                b = !str.equals("sendReward") ? (byte) -1 : Ascii.DC2;
                break;
            case 571273292:
                b = !str.equals("dynamicTrack") ? (byte) -1 : (byte) 19;
                break;
            case 650209982:
                b = !str.equals("getTemplateInfo") ? (byte) -1 : Ascii.DC4;
                break;
            case 672928467:
                b = !str.equals("cancel_download_app_ad") ? (byte) -1 : Ascii.NAK;
                break;
            case 711635577:
                b = !str.equals("getCurrentVideoState") ? (byte) -1 : Ascii.SYN;
                break;
            case 885131792:
                b = !str.equals("getVolume") ? (byte) -1 : Ascii.ETB;
                break;
            case 1107374321:
                b = !str.equals("pauseWebViewTimers") ? (byte) -1 : Ascii.CAN;
                break;
            case 1151744482:
                b = !str.equals(FyberMediationAdapter.KEY_MUTE_VIDEO) ? (byte) -1 : Ascii.f22491EM;
                break;
            case 1237100796:
                b = !str.equals("renderDidFinish") ? (byte) -1 : Ascii.SUB;
                break;
            case 1532142616:
                b = !str.equals("removeLoading") ? (byte) -1 : Ascii.ESC;
                break;
            case 1634511418:
                b = !str.equals("endcard_load") ? (byte) -1 : Ascii.f22493FS;
                break;
            case 1713585602:
                b = !str.equals("getNetworkData") ? (byte) -1 : Ascii.f22494GS;
                break;
            case 1731806400:
                b = !str.equals("playable_style") ? (byte) -1 : Ascii.f22498RS;
                break;
            case 1979895452:
                b = !str.equals("sendLog") ? (byte) -1 : Ascii.f22502US;
                break;
            case 2086000188:
                b = !str.equals("skipVideo") ? (byte) -1 : (byte) 32;
                break;
            case 2105008900:
                b = !str.equals("landscape_click") ? (byte) -1 : (byte) 33;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ory();
                C3414ik.m15520lr(this.f10587bu, this.f10594ig, 0, (JSONObject) null);
                Context context2 = this.zyn;
                if (context2 == null) {
                    C3414ik.m15520lr(this.f10587bu, this.f10594ig, -1, (JSONObject) null);
                } else {
                    this.jbs.mo15926ri(context2, c3209lr.f10638ka, this.f10588co, this.f10585aw, this.slm);
                }
                break;
            case 1:
                m13360aw(jSONObject2);
                break;
            case 2:
                m13362ay();
                break;
            case 3:
                m13363bu(c3209lr.f10638ka);
                break;
            case 4:
                JSONObject jSONObject3 = c3209lr.f10638ka;
                if (m13395ri(jSONObject3, jSONObject2)) {
                    m13414ik(jSONObject3);
                }
                break;
            case 5:
                m13399vr(c3209lr.f10638ka);
                break;
            case 6:
                m13409fi(c3209lr.f10638ka);
                break;
            case 7:
                m13376lr(jSONObject2);
                break;
            case 8:
                InterfaceC2886ri interfaceC2886ri = this.wjv;
                if (interfaceC2886ri != null) {
                    int iMo11098lr = interfaceC2886ri.mo11098lr();
                    int iMo11099ri = this.wjv.mo11099ri();
                    jSONObject2.put("width", iMo11098lr);
                    jSONObject2.put("height", iMo11099ri);
                }
                break;
            case 9:
                igq();
                break;
            case 10:
                m13398uq(c3209lr.f10638ka);
                break;
            case 11:
                jSONObjectIhz = this.f10593fr;
                if (jSONObjectIhz != null) {
                    jSONObject2 = jSONObjectIhz;
                }
                break;
            case 12:
                this.f10603qd = true;
                C3414ik.m15520lr(this.f10587bu, this.f10594ig, 1, (JSONObject) null);
                InterfaceC3219ka interfaceC3219ka = this.f10607su;
                if (interfaceC3219ka == null) {
                    InterfaceC3516ik interfaceC3516ik = this.jbs;
                    if (interfaceC3516ik == null || (context = this.zyn) == null) {
                        C3414ik.m15520lr(this.f10587bu, this.f10594ig, -2, (JSONObject) null);
                    } else {
                        interfaceC3516ik.mo15925ri(context, c3209lr.f10638ka, this.f10594ig);
                        InterfaceC3118lr interfaceC3118lr = this.tnn;
                        if (interfaceC3118lr != null) {
                            interfaceC3118lr.gcp();
                        }
                    }
                } else {
                    interfaceC3219ka.mo10678fi(this.f10590dw);
                }
                break;
            case 13:
                xha();
                break;
            case 14:
                InterfaceC3516ik interfaceC3516ik2 = this.jbs;
                if (interfaceC3516ik2 != null) {
                    interfaceC3516ik2.mo15927ri(c3209lr.f10638ka);
                }
                break;
            case 15:
                jSONObjectIhz = ihz();
                if (jSONObjectIhz != null) {
                    jSONObject2 = jSONObjectIhz;
                }
                break;
            case 16:
                jSONObject2.put("viewStatus", this.f10601oh ? 1 : 0);
                break;
            case 17:
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10587bu;
                if (wjvVar2 != null && !TextUtils.isEmpty(wjvVar2.m14468pu())) {
                    jSONObject2.put("data", this.f10587bu.m14468pu());
                }
                break;
            case 18:
                this.f10599lr = true;
                InterfaceC3118lr interfaceC3118lr2 = this.tnn;
                if (interfaceC3118lr2 != null) {
                    interfaceC3118lr2.dzy();
                }
                break;
            case 19:
                ihz(c3209lr.f10638ka);
                break;
            case 20:
                JSONObject jSONObject4 = this.ihz;
                if (jSONObject4 != null) {
                    jSONObject4.put("setting", m13400zf());
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar3 = this.f10587bu;
                    if (wjvVar3 != null && wjvVar3.hqg() != null) {
                        this.ihz.put("dynamic_configs", this.f10587bu.hqg());
                    }
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar4 = this.f10587bu;
                    if (wjvVar4 != null) {
                        this.ihz.put(ShareConstants.MEDIA_EXTENSION, wjvVar4.m14372cm());
                    }
                }
                jSONObject2 = this.ihz;
                break;
            case 22:
                m13379nr(jSONObject2);
                break;
            case 23:
                AudioManager audioManager = (AudioManager) C3299nr.m14642ri().getSystemService("audio");
                jSONObject2.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case 24:
                m13366fr();
                break;
            case 25:
                m13374lr(this.f10584ac, c3209lr.f10638ka);
                break;
            case 26:
                tan(c3209lr.f10638ka);
                break;
            case 27:
                InterfaceC2880fi interfaceC2880fi = this.f10586ay;
                if (interfaceC2880fi != null) {
                    interfaceC2880fi.mo10682ri();
                }
                break;
            case 28:
                slm(c3209lr.f10638ka);
                break;
            case 29:
                m13452ri(c3209lr, jSONObject2);
                break;
            case 30:
                bgr(jSONObject2);
                break;
            case 31:
                JSONObject jSONObject5 = c3209lr.f10638ka;
                if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("extJson")) != null && jSONObject.has("category") && jSONObject.has(ViewHierarchyConstants.TAG_KEY) && jSONObject.has("label")) {
                    String strOptString = jSONObject.optString("category");
                    String strOptString2 = jSONObject.optString(ViewHierarchyConstants.TAG_KEY);
                    String strOptString3 = jSONObject.optString("label");
                    long jOptLong = jSONObject5.optLong("value");
                    long jOptLong2 = jSONObject5.optLong("extValue");
                    try {
                        jSONObject.putOpt("ua_policy", Integer.valueOf(this.f10610vr));
                        break;
                    } catch (Exception unused) {
                    }
                    if ("click".equals(strOptString3)) {
                        jSONObject = m13361ay(jSONObject);
                    }
                    if ("insight_log".equals(strOptString3) && (wjvVar = this.f10587bu) != null && wjvVar.inh()) {
                        jSONObject.putOpt("page_visible", Integer.valueOf(this.f10587bu.qhn()));
                        jSONObject.putOpt("time_to_leave", Long.valueOf(this.f10587bu.kcf() > 0 ? SystemClock.elapsedRealtime() - this.f10587bu.kcf() : -1L));
                        jSONObject.putOpt("time_to_click", Long.valueOf(this.f10587bu.m14451mn() > 0 ? SystemClock.elapsedRealtime() - this.f10587bu.m14451mn() : -1L));
                    }
                    String strM13382ri = m13382ri(strOptString2, strOptString3);
                    boolean zXha = C3273ac.xha(this.f10587bu);
                    m13393ri(jSONObject, zXha, strOptString3);
                    C3414ik.m15552ri(this.f10587bu, strOptString, strM13382ri, strOptString3, jOptLong, jOptLong2, jSONObject, zXha);
                }
                break;
            case 32:
                m13396su();
                break;
            case 33:
                Context context3 = this.zyn;
                if (context3 instanceof InterfaceC3118lr) {
                    ((InterfaceC3118lr) context3).gcp();
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(c3209lr.f10639lr)) {
            m13375lr(c3209lr.f10639lr, jSONObject2);
            if (C3304qt.m14669lr().m14703vr()) {
                Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + i + " data=" + jSONObject2);
            }
        }
        return jSONObject2;
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof C3209lr)) {
            try {
                m13449ri((C3209lr) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13450ri(InterfaceC2883lr interfaceC2883lr) {
        this.f10602pv = interfaceC2883lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13451ri(InterfaceC3118lr interfaceC3118lr) {
        this.tnn = interfaceC3118lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13452ri(final C3209lr c3209lr, final JSONObject jSONObject) {
        if (c3209lr == null) {
            return;
        }
        try {
            m13456ri(c3209lr.f10638ka, new InterfaceC2882ka() { // from class: com.bytedance.sdk.openadsdk.core.dzy.7
                @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2882ka
                /* JADX INFO: renamed from: ri */
                public void mo11093ri(boolean z, C3289ri c3289ri) {
                    if (!z) {
                        dzy.this.m13375lr(c3209lr.f10639lr, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", dzy.m13383ri(c3289ri));
                        dzy.this.m13375lr(c3209lr.f10639lr, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13453ri(InterfaceC3210ri interfaceC3210ri) {
        this.f10608ta = interfaceC3210ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13454ri(igq igqVar) {
        this.f10591fe = igqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    /* JADX INFO: renamed from: ri */
    public void mo8780ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            InterfaceC3247vr interfaceC3247vr = this.f10584ac;
            if (interfaceC3247vr != null) {
                interfaceC3247vr.mo11547ri(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            C2707ac.m10196ik("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3518lr
    /* JADX INFO: renamed from: ri */
    public void mo13455ri(String str, JSONObject jSONObject) {
        m13369ik(str, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public void m13456ri(JSONObject jSONObject, final InterfaceC2882ka interfaceC2882ka) {
        JSONObject jSONObjectOptJSONObject;
        if (interfaceC2882ka == null) {
            return;
        }
        try {
            final InterfaceC2882ka interfaceC2882ka2 = new InterfaceC2882ka() { // from class: com.bytedance.sdk.openadsdk.core.dzy.8
                @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2882ka
                /* JADX INFO: renamed from: ri */
                public void mo11093ri(final boolean z, final C3289ri c3289ri) {
                    com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            interfaceC2882ka.mo11093ri(z, c3289ri);
                        }
                    });
                }
            };
            if (this.f10587bu != null && !TextUtils.isEmpty(this.f10588co)) {
                int iLji = this.f10587bu.lji();
                AdSlot adSlotM14388eb = this.f10587bu.m14388eb();
                com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
                igqVar.f11276di = true;
                if (this.f10587bu.sez() != null || this.f10587bu.m14575zv() != null) {
                    igqVar.jbs = 2;
                }
                JSONObject jSONObject2 = this.f10600nr;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                igqVar.xha = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (igqVar.f11281mj == null) {
                        igqVar.f11281mj = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            igqVar.f11281mj.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                C3299nr.m14638ik().mo12638ri(adSlotM14388eb, igqVar, iLji, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.core.dzy.9
                    @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10890ri(int i, String str) {
                        interfaceC2882ka2.mo11093ri(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                        dzy.this.m13389ri(c3289ri, c3282ik, interfaceC2882ka2);
                    }
                });
                return;
            }
            interfaceC2882ka2.mo11093ri(false, null);
        } catch (Exception e) {
            C2707ac.m10206ri("TTAD.AndroidObject", "get ads error", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13457ri(JSONObject jSONObject, String str) {
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            interfaceC3247vr.mo11883ri(str, jSONObject);
            return;
        }
        InterfaceC3118lr interfaceC3118lr = this.tnn;
        if (interfaceC3118lr != null) {
            interfaceC3118lr.mo10613ri(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13458ri(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (f10583mj.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: sf */
    public void m13459sf() {
        m13364dw();
    }

    /* JADX INFO: renamed from: sf */
    public void m13460sf(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        igq igqVar = this.f10591fe;
        if (igqVar != null) {
            if (iOptInt == 1) {
                igqVar.mo11940p_();
            } else if (iOptInt == 2) {
                igqVar.mo11941q_();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.5
            @Override // java.lang.Runnable
            public void run() {
                dzy.this.m13396su();
            }
        });
    }

    public void slm() {
        igq igqVar = this.f10591fe;
        if (igqVar != null) {
            igqVar.mo11938n_();
        }
    }

    public void tan() {
        InterfaceC3118lr interfaceC3118lr = this.tnn;
        if (interfaceC3118lr != null) {
            interfaceC3118lr.ory();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p122fi.InterfaceC2486lr
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.f10596jc == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (m13359ac(jSONObjectOptJSONObject)) {
                    bgrVar.m8964ri((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                    bgrVar.m8956lr((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    bgrVar.m8951ik((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    bgrVar.m8954ka((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                bgrVar.m8950ik(dOptDouble);
                bgrVar.m8953ka(dOptDouble2);
                bgrVar.m8948fi(dOptDouble3);
                bgrVar.m8946di(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.p174aw.xha xhaVar = this.f10596jc;
            if (xhaVar != null) {
                xhaVar.mo11100ri(bgrVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: vr */
    public void m13461vr() {
        igq igqVar = this.f10591fe;
        if (igqVar != null) {
            igqVar.mo11937m_();
        }
    }

    public JSONObject xha(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC3247vr interfaceC3247vr = this.f10584ac;
        if (interfaceC3247vr != null) {
            try {
                jSONObject2.put("state", interfaceC3247vr.mo11881lr(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void xha() {
        InterfaceC2881ik interfaceC2881ik;
        if (this.feb && (interfaceC2881ik = this.igq) != null) {
            interfaceC2881ik.mo11087ri();
            return;
        }
        Context context = this.zyn;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.wjv.m16673ri((Activity) context)) {
            ((Activity) this.zyn).finish();
        }
    }
}
