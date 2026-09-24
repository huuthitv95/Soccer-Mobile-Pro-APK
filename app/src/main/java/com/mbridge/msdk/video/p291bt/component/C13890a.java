package com.mbridge.msdk.video.p291bt.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C11661S5;
import com.ironsource.C11744X3;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.C13079m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.p289db.C13023m;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p291bt.module.BTBaseView;
import com.mbridge.msdk.video.p291bt.module.MBTempContainer;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.a */
/* JADX INFO: compiled from: BaseOperateViews.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13890a {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f39670a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private static LinkedHashMap<String, String> f39671b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    private static LinkedHashMap<String, CampaignEx> f39672c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d */
    private static LinkedHashMap<String, C14223c> f39673d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e */
    private static LinkedHashMap<String, String> f39674e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f */
    private static LinkedHashMap<String, Integer> f39675f = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g */
    private static LinkedHashMap<String, Activity> f39676g = new LinkedHashMap<>();

    /* JADX INFO: renamed from: h */
    private static volatile int f39677h = 10000;

    /* JADX INFO: renamed from: i */
    private static int f39678i = 0;

    /* JADX INFO: renamed from: j */
    private static int f39679j = 1;

    /* JADX INFO: renamed from: k */
    private static String f39680k = "";

    /* JADX INFO: renamed from: l */
    private static int f39681l;

    /* JADX INFO: renamed from: m */
    private static int f39682m;

    /* JADX INFO: renamed from: n */
    private static int f39683n;

    /* JADX INFO: renamed from: o */
    private static int f39684o;

    /* JADX INFO: renamed from: p */
    private static int f39685p;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.a$a */
    /* JADX INFO: compiled from: BaseOperateViews.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f39686a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f39687b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Rect f39688c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f39689d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f39690e;

        a(Object obj, String str, Rect rect, int i, int i2) {
            this.f39686a = obj;
            this.f39687b = str;
            this.f39688c = rect;
            this.f39689d = i;
            this.f39690e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((C13387a) this.f39686a).f37156b;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = C13890a.this.m41466b(this.f39687b, rid);
            String strM41465b = C13890a.this.m41465b();
            C13890a.f39671b.put(strM41465b, rid);
            MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(C13008c.m36588n().m36542d());
            linkedHashMapM41466b.put(strM41465b, mBridgeBTLayout);
            mBridgeBTLayout.setInstanceId(strM41465b);
            mBridgeBTLayout.setUnitId(this.f39687b);
            mBridgeBTLayout.setWebView(windVaneWebView);
            mBridgeBTLayout.setRect(this.f39688c);
            int i = this.f39689d;
            if (i > 0 || this.f39690e > 0) {
                mBridgeBTLayout.setLayout(i, this.f39690e);
            }
            C13890a.this.m41467b(this.f39686a, strM41465b);
            C13219q0.m37813a("OperateViews", "create view instanceId = " + strM41465b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.a$b */
    /* JADX INFO: compiled from: BaseOperateViews.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f39692a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f39693b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f39694c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f39695d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f39696e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Rect f39697f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f39698g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f39699h;

        b(Object obj, String str, String str2, String str3, String str4, Rect rect, int i, int i2) {
            this.f39692a = obj;
            this.f39693b = str;
            this.f39694c = str2;
            this.f39695d = str3;
            this.f39696e = str4;
            this.f39697f = rect;
            this.f39698g = i;
            this.f39699h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((C13387a) this.f39692a).f37156b;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = C13890a.this.m41466b(this.f39693b, rid);
            String strM41465b = C13890a.this.m41465b();
            C13890a.f39671b.put(strM41465b, rid);
            MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(C13008c.m36588n().m36542d());
            linkedHashMapM41466b.put(strM41465b, mBridgeBTWebView);
            mBridgeBTWebView.setInstanceId(strM41465b);
            mBridgeBTWebView.setUnitId(this.f39693b);
            mBridgeBTWebView.setFileURL(this.f39694c);
            mBridgeBTWebView.setFilePath(this.f39695d);
            mBridgeBTWebView.setHtml(this.f39696e);
            mBridgeBTWebView.setRect(this.f39697f);
            mBridgeBTWebView.setWebViewRid(rid);
            mBridgeBTWebView.setCreateWebView(windVaneWebView);
            int i = this.f39698g;
            if (i > 0 || this.f39699h > 0) {
                mBridgeBTWebView.setLayout(i, this.f39699h);
            }
            mBridgeBTWebView.preload();
            C13890a.this.m41467b(this.f39692a, strM41465b);
            C13219q0.m37813a("OperateViews", "createWebview instanceId = " + strM41465b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.a$c */
    /* JADX INFO: compiled from: BaseOperateViews.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f39701a;

        c(CampaignEx campaignEx) {
            this.f39701a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                if (c13020jM36706a != null) {
                    if (c13020jM36706a.m36707a(this.f39701a.getId())) {
                        c13020jM36706a.m36709b(this.f39701a.getId());
                    } else {
                        C13073g c13073g = new C13073g();
                        c13073g.m36859a(this.f39701a.getId());
                        c13073g.m36861b(this.f39701a.getFca());
                        c13073g.m36863c(this.f39701a.getFcb());
                        c13073g.m36857a(0);
                        c13073g.m36865d(1);
                        c13073g.m36858a(System.currentTimeMillis());
                        c13020jM36706a.m36708b(c13073g);
                    }
                }
                C13890a.this.m41438a(this.f39701a.getCampaignUnitId(), this.f39701a);
            } catch (Throwable th) {
                C13219q0.m37817b("OperateViews", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private MBridgeBTContainer m41434a(String str, String str2) {
        LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(str, str2);
        if (linkedHashMapM41466b.size() <= 0) {
            return null;
        }
        for (View view : linkedHashMapM41466b.values()) {
            if (view instanceof MBridgeBTContainer) {
                return (MBridgeBTContainer) view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m41436a(CampaignEx campaignEx) {
        new Thread(new c(campaignEx)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41438a(String str, CampaignEx campaignEx) {
        if (C13091b.f35900k == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        C13091b.m37104a(str, campaignEx, C12538u.f32489j);
    }

    /* JADX INFO: renamed from: A */
    public void m41439A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exit");
                C13219q0.m37813a("OperateViews", "playerUnmute failed: instanceId not exit");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerUnmute failed: instanceId is not player");
            } else if (!((MBridgeBTVideoView) view).playUnMute()) {
                m41467b(obj, "set unmute failed");
                C13219q0.m37813a("OperateViews", "playerUnmute failed: set unmute failed");
            } else {
                m41467b(obj, strOptString2);
                m41459a(obj, "onUnmute", strOptString2);
                C13219q0.m37813a("OperateViews", "playerUnmute successed");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerUnmute failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public void m41440B(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m41441C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBTempContainer)) {
                m41458a(obj, "view not exist");
            } else {
                ((MBTempContainer) view).preload();
                m41467b(obj, strOptString2);
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "preloadSubPlayTemplateView failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: D */
    public void m41442D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "params not enough");
                C13219q0.m37813a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null || view.getParent() == null) {
                m41458a(obj, "view is null");
                C13219q0.m37813a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                m41458a(obj, "parent is null");
                C13219q0.m37813a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + strOptString2);
                return;
            }
            viewGroup.removeView(view);
            m41467b(obj, strOptString2);
            m41459a(obj, "onRemoveFromView", strOptString2);
            C13219q0.m37813a("OperateViews", "removeFromSuperView instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "removeFromSuperView failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: E */
    public void m41443E(Object obj, JSONObject jSONObject) {
        C14216c c14216c;
        try {
            WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
            String strOptString = "";
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString2 = jSONObject.optString("unitId");
            String strOptString3 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString4 = jSONObjectOptJSONObject.optString("userId");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C12538u.f32489j);
            String strOptString5 = jSONObjectOptJSONObject.optString("extra");
            if (jSONObjectOptJSONObject2 != null) {
                C14216c c14216c2 = new C14216c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                strOptString = jSONObjectOptJSONObject2.optString("id");
                c14216c = c14216c2;
            } else {
                c14216c = null;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString2, rid);
            if (linkedHashMapM41466b.size() <= 0 || !f39674e.containsKey(strOptString3)) {
                m41458a(obj, "unitId not exist");
                C13219q0.m37813a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + strOptString3);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString3);
            if (!(view instanceof MBTempContainer)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + strOptString3);
                return;
            }
            MBTempContainer mBTempContainer = (MBTempContainer) view;
            mBTempContainer.setReward(c14216c);
            mBTempContainer.setUserId(strOptString4);
            mBTempContainer.setRewardId(strOptString);
            mBTempContainer.setCampaignExpired(zOptBoolean);
            if (!TextUtils.isEmpty(strOptString5)) {
                mBTempContainer.setDeveloperExtraData(strOptString5);
            }
            m41467b(obj, strOptString3);
            C13219q0.m37813a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + strOptString3);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "setSubPlayTemplateInfo failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: F */
    public void m41444F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setAlpha((float) dOptDouble);
            m41467b(obj, strOptString2);
            m41459a(obj, "onViewAlphaChanged", strOptString2);
            C13219q0.m37813a("OperateViews", "setViewAlpha instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "setViewAlpha failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: G */
    public void m41445G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("color");
            if (TextUtils.isEmpty(strOptString3)) {
                m41458a(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + strOptString2);
                return;
            }
            m41467b(obj, strOptString2);
            view.setBackgroundColor(Color.parseColor(strOptString3));
            m41459a(obj, "onViewBgColorChanged", strOptString2);
            C13219q0.m37813a("OperateViews", "setViewBgColor instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "setViewBgColor failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: H */
    public void m41446H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            if (jSONObjectOptJSONObject2 == null) {
                m41458a(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            Rect rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
            int iOptInt = jSONObjectOptJSONObject2.optInt("width");
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "setViewRect failed: instanceId not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view is null");
                C13219q0.m37813a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            if (view.getParent() != null) {
                view.setLayoutParams(m41454a(view.getLayoutParams(), rect, iOptInt, iOptInt2));
                view.requestLayout();
            } else {
                if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).setRect(rect);
                    ((MBridgeBTWebView) view).setLayout(iOptInt, iOptInt2);
                }
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).setRect(rect);
                    ((MBridgeBTVideoView) view).setLayout(iOptInt, iOptInt2);
                }
            }
            m41467b(obj, strOptString2);
            m41459a(obj, "onViewRectChanged", strOptString2);
            C13219q0.m37813a("OperateViews", "setViewRect instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "setViewRect failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: I */
    public void m41447I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("vertical", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "setViewScale failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setScaleX((float) dOptDouble2);
            view.setScaleY((float) dOptDouble);
            m41467b(obj, strOptString2);
            m41459a(obj, "onViewScaleChanged", strOptString2);
            C13219q0.m37813a("OperateViews", "setViewScale instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "setViewScale failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: J */
    public void m41448J(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "showView failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "showView failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setVisibility(0);
            m41467b(obj, strOptString2);
            m41459a(obj, "onShowView", strOptString2);
            C13219q0.m37813a("OperateViews", "showView instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "showView failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: K */
    public void m41449K(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString3 = jSONObjectOptJSONObject.optString(C11744X3.i.f26373j0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("eventData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, rid);
            if (linkedHashMapM41466b.size() <= 0) {
                m41458a(obj, "unitId not exist");
                C13219q0.m37813a("OperateViews", "webviewFireEvent failed: unitId not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof WindVaneWebView) {
                        C13392f.m38726a().m38728a((WebView) childAt, strOptString3, Base64.encodeToString(jSONObjectOptJSONObject2.toString().getBytes(), 2));
                        m41467b(obj, strOptString2);
                        C13219q0.m37813a("OperateViews", "webviewFireEvent instanceId = " + strOptString2);
                        return;
                    }
                }
            }
            m41458a(obj, "instanceId not exist");
            C13219q0.m37813a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "webviewFireEvent failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m41450L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "webviewGoBack failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewGoBack()) {
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "webviewGoBack instanceId = " + strOptString2);
                return;
            }
            m41458a(obj, "webviewGoBack failed");
            C13219q0.m37813a("OperateViews", "webviewGoBack failed instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "webviewGoBack failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: M */
    public void m41451M(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "webviewGoForward failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewGoForward()) {
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "webviewGoForward instanceId = " + strOptString2);
                return;
            }
            m41458a(obj, "webviewGoForward failed");
            C13219q0.m37813a("OperateViews", "webviewGoForward failed instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "webviewGoForward failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.mbridge.msdk.video.bt.component.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.mbridge.msdk.video.bt.module.BTBaseView, com.mbridge.msdk.video.bt.module.MBridgeBTWebView] */
    /* JADX INFO: renamed from: N */
    public void m41452N(Object obj, JSONObject jSONObject) {
        ?? r3;
        String str;
        int iOptInt;
        WindVaneWebView windVaneWebView;
        ?? r2 = obj;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) r2).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(r2, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 == null) {
                m41458a(r2, "content is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("fileURL");
            String strOptString4 = jSONObjectOptJSONObject2.optString(C11661S5.c.f25654c);
            String strOptString5 = jSONObjectOptJSONObject2.optString("html");
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4) && TextUtils.isEmpty(strOptString5)) {
                m41458a(r2, "url is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONArrayOptJSONArray.getJSONObject(i));
                    if (campaignWithBackData != null) {
                        campaignWithBackData.setCampaignUnitId(strOptString);
                        arrayList.add(campaignWithBackData);
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArray;
                }
            }
            String strOptString6 = jSONObjectOptJSONObject2.optString("unitId");
            C14223c c14223cM42681a = C14223c.m42681a(jSONObjectOptJSONObject2.optJSONObject("unitSetting"));
            if (c14223cM42681a != null) {
                c14223cM42681a.m42727h(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject3 != null) {
                try {
                    str = "OperateViews";
                    try {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject3.optInt("left", -999), jSONObjectOptJSONObject3.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject3.optInt("right", -999), jSONObjectOptJSONObject3.optInt("bottom", -999));
                        int iOptInt2 = jSONObjectOptJSONObject3.optInt("width");
                        iOptInt = jSONObjectOptJSONObject3.optInt("height");
                        r3 = rect2;
                        r2 = iOptInt2;
                    } catch (Throwable th) {
                        th = th;
                        r2 = obj;
                        r3 = str;
                        m41458a(r2, th.getMessage());
                        C13219q0.m37813a((String) r3, "webviewLoad failed: " + th.getMessage());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = "OperateViews";
                    r2 = obj;
                    r3 = str;
                    m41458a(r2, th.getMessage());
                    C13219q0.m37813a((String) r3, "webviewLoad failed: " + th.getMessage());
                }
            } else {
                str = "OperateViews";
                iOptInt = 0;
                r2 = 0;
                r3 = rect;
            }
            int iOptInt3 = jSONObjectOptJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            try {
                if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                    m41458a(obj, "instanceId not exist");
                    C13219q0.m37813a(str, "webviewLoad failed: instanceId not exist instanceId = " + strOptString2);
                    return;
                }
                View view = linkedHashMapM41466b.get(strOptString2);
                if (!(view instanceof MBridgeBTWebView)) {
                    m41458a(obj, "view not exist");
                    C13219q0.m37813a(str, "webviewLoad failed: view not exist instanceId = " + strOptString2);
                    return;
                }
                ?? r5 = (MBridgeBTWebView) view;
                r5.setHtml(strOptString5);
                r5.setFilePath(strOptString4);
                r5.setFileURL(strOptString3);
                r5.setRect(r3);
                r5.setLayout(r2, iOptInt);
                r5.setCampaigns(arrayList);
                r5.setRewardUnitSetting(c14223cM42681a);
                r5.webviewLoad(iOptInt3);
                Object obj2 = obj;
                try {
                    m41467b(obj2, strOptString2);
                    C13219q0.m37813a(str, "webviewLoad instanceId = " + strOptString2);
                } catch (Throwable th3) {
                    th = th3;
                    r2 = obj2;
                    r3 = str;
                    m41458a(r2, th.getMessage());
                    C13219q0.m37813a((String) r3, "webviewLoad failed: " + th.getMessage());
                }
            } catch (Throwable th4) {
                th = th4;
                m41458a(r2, th.getMessage());
                C13219q0.m37813a((String) r3, "webviewLoad failed: " + th.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            r3 = "OperateViews";
        }
    }

    /* JADX INFO: renamed from: O */
    public void m41453O(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "webviewReload failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewReload()) {
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "webviewReload instanceId = " + strOptString2);
                return;
            }
            m41458a(obj, "reload failed");
            C13219q0.m37813a("OperateViews", "webviewReload failed reload failed instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "webviewReload failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX INFO: renamed from: a */
    public ViewGroup.LayoutParams m41454a(ViewGroup.LayoutParams layoutParams, Rect rect, int i, int i2) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                int i3 = rect.left;
                if (i3 != -999) {
                    layoutParams2.leftMargin = C13229v0.m37876a(contextM36542d, i3);
                }
                int i4 = rect.top;
                if (i4 != -999) {
                    layoutParams2.topMargin = C13229v0.m37876a(contextM36542d, i4);
                }
                int i5 = rect.right;
                if (i5 != -999) {
                    layoutParams2.rightMargin = C13229v0.m37876a(contextM36542d, i5);
                }
                int i6 = rect.bottom;
                if (i6 != -999) {
                    layoutParams2.bottomMargin = C13229v0.m37876a(contextM36542d, i6);
                }
                if (i > 0) {
                    layoutParams2.width = C13229v0.m37876a(contextM36542d, i);
                }
                if (i2 > 0) {
                    layoutParams2.height = C13229v0.m37876a(contextM36542d, i2);
                }
                return layoutParams2;
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                int i7 = rect.left;
                if (i7 != -999) {
                    layoutParams3.leftMargin = C13229v0.m37876a(contextM36542d, i7);
                }
                int i8 = rect.top;
                if (i8 != -999) {
                    layoutParams3.topMargin = C13229v0.m37876a(contextM36542d, i8);
                }
                int i9 = rect.right;
                if (i9 != -999) {
                    layoutParams3.rightMargin = C13229v0.m37876a(contextM36542d, i9);
                }
                int i10 = rect.bottom;
                if (i10 != -999) {
                    layoutParams3.bottomMargin = C13229v0.m37876a(contextM36542d, i10);
                }
                if (i > 0) {
                    layoutParams3.width = C13229v0.m37876a(contextM36542d, i);
                }
                if (i2 > 0) {
                    layoutParams3.height = C13229v0.m37876a(contextM36542d, i2);
                }
                return layoutParams3;
            }
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i11 = rect.left;
                if (i11 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = C13229v0.m37876a(contextM36542d, i11);
                }
                int i12 = rect.top;
                if (i12 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = C13229v0.m37876a(contextM36542d, i12);
                }
                int i13 = rect.right;
                if (i13 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = C13229v0.m37876a(contextM36542d, i13);
                }
                int i14 = rect.bottom;
                if (i14 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C13229v0.m37876a(contextM36542d, i14);
                }
                if (i > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = C13229v0.m37876a(contextM36542d, i);
                }
                if (i2 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = C13229v0.m37876a(contextM36542d, i2);
                }
            }
        }
        return layoutParams;
    }

    /* JADX INFO: renamed from: a */
    public void m41455a(int i, int i2, int i3, int i4, int i5) {
        C13219q0.m37813a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        f39680k = C13190d0.m37652a(i, i2, i3, i4, i5);
        f39681l = i;
        f39682m = i2;
        f39683n = i3;
        f39684o = i4;
        f39685p = i5;
    }

    /* JADX INFO: renamed from: a */
    public void m41456a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39679j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C13392f.m38726a().m38731b(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13219q0.m37813a("OperateViews", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41457a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39678i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38728a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m41456a(webView, e.getMessage());
            C13219q0.m37813a("OperateViews", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41458a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39679j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13219q0.m37813a("OperateViews", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41459a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39678i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38730a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m41458a(obj, e.getMessage());
            C13219q0.m37813a("OperateViews", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41460a(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString3) || !linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId is not exist");
                C13219q0.m37813a("OperateViews", "appendSubView failed: instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapM41466b.get(strOptString2);
            View view = linkedHashMapM41466b.get(strOptString3);
            C13197f1.m37674a(view);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                if (view instanceof MBTempContainer) {
                    C13219q0.m37816b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f39681l), Integer.valueOf(f39682m), Integer.valueOf(f39683n), Integer.valueOf(f39684o), Integer.valueOf(f39685p)));
                    ((MBTempContainer) view).setNotchPadding(f39681l, f39682m, f39683n, f39684o, f39685p);
                    for (View view2 : linkedHashMapM41466b.values()) {
                        if (view2 instanceof MBridgeBTContainer) {
                            C13197f1.m37674a(view);
                            try {
                                MBTempContainer mBTempContainer = (MBTempContainer) view;
                                C14191k c14191k = (C14191k) ((C13387a) obj).f37156b.getObject();
                                mBTempContainer.setAdEvents(c14191k.m42351j());
                                mBTempContainer.setAdSession(c14191k.m42352k());
                                mBTempContainer.setVideoEvents(c14191k.m42356o());
                            } catch (Exception e) {
                                C13219q0.m37816b("OperateViews", e.getMessage());
                            }
                            ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        iOptInt = ((BTBaseView) view).getViewWidth();
                        iOptInt2 = ((BTBaseView) view).getViewHeight();
                    } else {
                        rect = null;
                        iOptInt2 = 0;
                        iOptInt = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsM41454a = m41454a(layoutParams, rect, iOptInt, iOptInt2);
                    C13197f1.m37674a(view);
                    viewGroup.addView(view, layoutParamsM41454a);
                }
                m41467b(obj, strOptString2);
                m41459a(obj, "onAppendView", strOptString2);
                C13219q0.m37813a("OperateViews", "appendSubView parentId = " + strOptString2 + " childId = " + strOptString3);
                return;
            }
            m41458a(obj, "view is not exist");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41461a(Object obj, JSONObject jSONObject, boolean z) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2) || !linkedHashMapM41466b.containsKey(strOptString3)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            View view2 = linkedHashMapM41466b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt = ((BTBaseView) view).getViewWidth();
                iOptInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
                rect = null;
                iOptInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams layoutParamsM41454a = m41454a(layoutParams, rect, iOptInt, iOptInt2);
            if (z) {
                C13197f1.m37674a(view);
            }
            viewGroup.addView(view, iIndexOfChild + 1, layoutParamsM41454a);
            m41467b(obj, strOptString2);
            m41459a(obj, "onInsertViewAbove", strOptString2);
            C13219q0.m37813a("OperateViews", "insertViewAbove instanceId = " + strOptString2 + " brotherId = " + strOptString3);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41462a(String str) {
        if (f39674e.containsKey(str)) {
            f39674e.remove(str);
        }
        if (f39673d.containsKey(str)) {
            f39673d.remove(str);
        }
        if (f39672c.containsKey(str)) {
            f39672c.remove(str);
        }
        if (f39671b.containsKey(str)) {
            f39671b.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41463a(String str, int i) {
        f39675f.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m41464a(String str, Activity activity) {
        f39676g.put(str, activity);
    }

    /* JADX INFO: renamed from: b */
    public String m41465b() {
        f39677h++;
        return String.valueOf(f39677h);
    }

    /* JADX INFO: renamed from: b */
    public synchronized LinkedHashMap<String, View> m41466b(String str, String str2) {
        if (f39670a.containsKey(str + "_" + str2)) {
            return f39670a.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f39670a.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public void m41467b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39678i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m41458a(obj, e.getMessage());
            C13219q0.m37813a("OperateViews", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41468b(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
                if (!linkedHashMapM41466b.containsKey(strOptString2) || !linkedHashMapM41466b.containsKey(strOptString3)) {
                    m41458a(obj, "instanceId is not exist");
                    C13219q0.m37813a("OperateViews", "appendViewTo failed: instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapM41466b.get(strOptString3);
                View view = linkedHashMapM41466b.get(strOptString2);
                C13197f1.m37674a(view);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        for (View view2 : linkedHashMapM41466b.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                C13197f1.m37674a(view);
                                ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                            iOptInt = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt = ((BTBaseView) view).getViewWidth();
                            iOptInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                            rect = null;
                            iOptInt2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams layoutParamsM41454a = m41454a(layoutParams, rect, iOptInt, iOptInt2);
                        C13197f1.m37674a(view);
                        viewGroup.addView(view, layoutParamsM41454a);
                    }
                    m41467b(obj, strOptString2);
                    m41459a(obj, "onAppendViewTo", strOptString2);
                    C13219q0.m37813a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                    return;
                }
                m41458a(obj, "view is not exist");
                return;
            }
            m41458a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41469b(Object obj, JSONObject jSONObject, boolean z) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2) || !linkedHashMapM41466b.containsKey(strOptString3)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            View view2 = linkedHashMapM41466b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt = ((BTBaseView) view).getViewWidth();
                iOptInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                rect = null;
                iOptInt = 0;
                iOptInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams layoutParamsM41454a = m41454a(layoutParams, rect, iOptInt, iOptInt2);
            if (z) {
                C13197f1.m37674a(view);
            }
            int i = iIndexOfChild - 1;
            viewGroup.addView(view, i > -1 ? i : 0, layoutParamsM41454a);
            m41467b(obj, strOptString2);
            m41459a(obj, "onInsertViewBelow", strOptString2);
            C13219q0.m37813a("OperateViews", "insertViewBelow instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "insertViewBelow failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41470b(String str) {
        if (f39675f.containsKey(str)) {
            f39675f.remove(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public CampaignEx m41471c(String str) {
        if (f39672c.containsKey(str)) {
            return f39672c.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m41472c(Object obj, String str) {
        C13219q0.m37813a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strM37887a = C13229v0.m37887a(jSONObject.optString("url"), "&tun=", C13211m0.m37715A() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    C12682a.m34605a(C13008c.m36588n().m36542d(), (CampaignEx) null, "", strM37887a, false, iOptInt != 0);
                } else {
                    C12682a.m34606a(C13008c.m36588n().m36542d(), (CampaignEx) null, "", strM37887a, false, iOptInt != 0, iOptInt2);
                }
            }
            try {
                m41467b(obj, "");
            } catch (Throwable th) {
                th = th;
                C13219q0.m37817b("OperateViews", "reportUrls", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41473c(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId is not exist");
                C13219q0.m37813a("OperateViews", "bringViewToFront failed: instanceId is not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null || view.getParent() == null) {
                m41458a(obj, "view is null");
                C13219q0.m37813a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                m41458a(obj, "parent is null");
                C13219q0.m37813a("OperateViews", "bringViewToFront failed: parent is null");
                return;
            }
            viewGroup.bringChildToFront(view);
            m41467b(obj, strOptString2);
            m41459a(obj, "onBringViewToFront", strOptString2);
            C13219q0.m37813a("OperateViews", "bringViewToFront instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "bringViewToFront failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41474c(String str, String str2) {
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(str, str2);
            if (linkedHashMapM41466b != null && !linkedHashMapM41466b.isEmpty()) {
                for (View view : linkedHashMapM41466b.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("OperateViews", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public C14223c m41475d(String str) {
        if (f39673d.containsKey(str)) {
            return f39673d.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m41476d(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString(C11744X3.i.f26373j0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, rid);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                m41458a(obj, "unitId not exist");
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                }
                if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                }
            }
            m41467b(obj, "");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "broadcast failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m41477d(String str, String str2) {
        f39671b.put(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public String m41478e(String str) {
        return f39671b.containsKey(str) ? f39671b.get(str) : "";
    }

    /* JADX INFO: renamed from: e */
    public void m41479e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (linkedHashMapM41466b.size() <= 0) {
                m41458a(obj, "unitId or instanceId not exist");
                C13219q0.m37813a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + strOptString);
                return;
            }
            MBridgeBTContainer mBridgeBTContainer = null;
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTContainer) {
                    mBridgeBTContainer = (MBridgeBTContainer) view;
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onDestory();
                } else if (view instanceof MBridgeBTVideoView) {
                    C13891b.m41504a().m41506a(((MBridgeBTVideoView) view).getInstanceId());
                    ((MBridgeBTVideoView) view).onDestory();
                } else if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onDestroy();
                }
            }
            if (mBridgeBTContainer == null) {
                m41458a(obj, "not found MBridgeBTContainer");
                C13219q0.m37813a("OperateViews", "closeAd successed");
                return;
            }
            mBridgeBTContainer.onAdClose();
            f39670a.remove(linkedHashMapM41466b);
            linkedHashMapM41466b.clear();
            f39670a.remove(strOptString + "_" + strM41478e);
            m41467b(obj, strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "closeAd failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public String m41480f(String str) {
        return f39674e.containsKey(str) ? f39674e.get(str) : "";
    }

    /* JADX INFO: renamed from: f */
    public void m41481f(Object obj, JSONObject jSONObject) {
        C13219q0.m37813a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                C14223c c14223cM42681a = C14223c.m42681a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (c14223cM42681a != null) {
                    c14223cM42681a.m42727h(strOptString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(C13008c.m36588n().m36542d());
                mBridgeBTNativeEC.setCampaign(campaignWithBackData);
                C14191k c14191k = new C14191k(null, campaignWithBackData);
                c14191k.setUnitId(strOptString);
                mBridgeBTNativeEC.setJSCommon(c14191k);
                mBridgeBTNativeEC.setUnitId(strOptString);
                mBridgeBTNativeEC.setRewardUnitSetting(c14223cM42681a);
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, rid);
                String strM41465b = m41465b();
                f39671b.put(strM41465b, rid);
                mBridgeBTNativeEC.setInstanceId(strM41465b);
                linkedHashMapM41466b.put(strM41465b, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (campaignWithBackData == null) {
                    m41458a(obj, "campaign is null");
                    C13219q0.m37813a("OperateViews", "createNativeEC failed");
                    return;
                } else {
                    m41467b(obj, strM41465b);
                    C13219q0.m37813a("OperateViews", "createNativeEC instanceId = " + strM41465b);
                    return;
                }
            }
            m41458a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "createNativeEC failed：" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public int m41482g(String str) {
        if (f39675f.containsKey(str)) {
            return f39675f.get(str).intValue();
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public void m41483g(Object obj, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("show_time", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("show_mute", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("show_close", 0);
                int iOptInt4 = jSONObjectOptJSONObject.optInt("orientation", 1);
                int iOptInt5 = jSONObjectOptJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(C13008c.m36588n().m36542d());
                try {
                    C14191k c14191k = (C14191k) ((C13387a) obj).f37156b.getObject();
                    mBridgeBTVideoView.setAdEvents(c14191k.m42351j());
                    mBridgeBTVideoView.setAdSession(c14191k.m42352k());
                    mBridgeBTVideoView.setVideoEvents(c14191k.m42356o());
                } catch (Exception e) {
                    C13219q0.m37816b("OperateViews", e.getMessage());
                }
                mBridgeBTVideoView.setCampaign(campaignWithBackData);
                mBridgeBTVideoView.setUnitId(strOptString);
                mBridgeBTVideoView.setShowMute(iOptInt2);
                mBridgeBTVideoView.setShowTime(iOptInt);
                mBridgeBTVideoView.setShowClose(iOptInt3);
                mBridgeBTVideoView.setOrientation(iOptInt4);
                mBridgeBTVideoView.setProgressBarState(iOptInt5);
                WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, rid);
                String strM41465b = m41465b();
                f39671b.put(strM41465b, rid);
                mBridgeBTVideoView.setInstanceId(strM41465b);
                linkedHashMapM41466b.put(strM41465b, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (campaignWithBackData == null) {
                    m41458a(obj, "campaign is null");
                    C13219q0.m37813a("OperateViews", "createPlayerView failed");
                } else {
                    m41467b(obj, strM41465b);
                    C13219q0.m37813a("OperateViews", "createPlayerView instanceId = " + strM41465b);
                }
                C13891b.m41504a().m41507a(strM41465b, mBridgeBTVideoView);
                return;
            }
            m41458a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "createPlayerView failed：" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m41484h(Object obj, JSONObject jSONObject) {
        String str;
        WindVaneWebView windVaneWebView;
        String str2 = "OperateViews";
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                int iOptInt = jSONObjectOptJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                C14223c c14223cM42681a = C14223c.m42681a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (c14223cM42681a != null) {
                    c14223cM42681a.m42727h(strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("userId");
                if (TextUtils.isEmpty(rid) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    rid = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, rid);
                String strM41465b = m41465b();
                f39671b.put(strM41465b, rid);
                MBTempContainer mBTempContainer = new MBTempContainer(C13008c.m36588n().m36542d());
                try {
                    C14191k c14191k = (C14191k) ((C13387a) obj).f37156b.getObject();
                    mBTempContainer.setAdEvents(c14191k.m42351j());
                    mBTempContainer.setAdSession(c14191k.m42352k());
                    mBTempContainer.setVideoEvents(c14191k.m42356o());
                } catch (Exception e) {
                    C13219q0.m37816b("OperateViews", e.getMessage());
                }
                mBTempContainer.setInstanceId(strM41465b);
                mBTempContainer.setUnitId(strOptString);
                mBTempContainer.setCampaign(campaignWithBackData);
                mBTempContainer.setRewardUnitSetting(c14223cM42681a);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(strOptString2)) {
                    mBTempContainer.setUserId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C12538u.f32489j);
                if (jSONObjectOptJSONObject2 != null) {
                    try {
                        String strOptString3 = jSONObjectOptJSONObject2.optString("id");
                        str = "OperateViews";
                        try {
                            C14216c c14216c = new C14216c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                            if (!TextUtils.isEmpty(strOptString3)) {
                                mBTempContainer.setRewardId(strOptString3);
                            }
                            if (!TextUtils.isEmpty(c14216c.m42626c())) {
                                mBTempContainer.setReward(c14216c);
                            }
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            m41458a(obj, th.getMessage());
                            C13219q0.m37813a(str2, "createSubPlayTemplateView failed：" + th.getMessage());
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        m41458a(obj, th.getMessage());
                        C13219q0.m37813a(str2, "createSubPlayTemplateView failed：" + th.getMessage());
                        return;
                    }
                } else {
                    str = "OperateViews";
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("extra");
                if (!TextUtils.isEmpty(strOptString4)) {
                    mBTempContainer.setDeveloperExtraData(strOptString4);
                }
                mBTempContainer.setMute(iOptInt);
                linkedHashMapM41466b.put(strM41465b, mBTempContainer);
                f39674e.put(strM41465b, strOptString);
                f39672c.put(strM41465b, campaignWithBackData);
                f39673d.put(strM41465b, c14223cM42681a);
                m41467b(obj, strM41465b);
                C13219q0.m37813a(str, "createSubPlayTemplateView instanceId = " + strM41465b);
                return;
            }
            m41458a(obj, "unitId or data is empty");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m41485h(String str) {
        f39676g.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m41486i(Object obj, JSONObject jSONObject) {
        Object obj2;
        Throwable th;
        int i;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(strOptString)) {
                    m41458a(obj, "unitId is empty");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
                jSONObjectOptJSONObject.optString("fileURL");
                jSONObjectOptJSONObject.optString(C11661S5.c.f25654c);
                jSONObjectOptJSONObject.optString("html");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i = iOptInt3;
                } else {
                    i = 0;
                    iOptInt = 0;
                }
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new a(obj2, strOptString, rect, i, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
        th = th;
        m41458a(obj2, th.getMessage());
        C13219q0.m37813a("OperateViews", "create view failed：" + th.getMessage());
    }

    /* JADX INFO: renamed from: j */
    public void m41487j(Object obj, JSONObject jSONObject) {
        Object obj2;
        Throwable th;
        int i;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(strOptString)) {
                    m41458a(obj, "unitId is empty");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
                String strOptString2 = jSONObjectOptJSONObject.optString("fileURL");
                String strOptString3 = jSONObjectOptJSONObject.optString(C11661S5.c.f25654c);
                String strOptString4 = jSONObjectOptJSONObject.optString("html");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i = iOptInt3;
                } else {
                    i = 0;
                    iOptInt = 0;
                }
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(obj2, strOptString, strOptString2, strOptString3, strOptString4, rect, i, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
        th = th;
        m41458a(obj2, th.getMessage());
        C13219q0.m37813a("OperateViews", "createWebview failed：" + th.getMessage());
    }

    /* JADX INFO: renamed from: k */
    public void m41488k(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(strOptString)) {
                String strM41478e = m41478e(strOptString2);
                if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    strM41478e = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
                if (linkedHashMapM41466b == null || !linkedHashMapM41466b.containsKey(strOptString2)) {
                    m41458a(obj, "unitId or instanceId not exist");
                    C13219q0.m37813a("OperateViews", "destroyComponent failed");
                    return;
                }
                View view = linkedHashMapM41466b.get(strOptString2);
                linkedHashMapM41466b.remove(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = viewGroup2.getChildAt(i);
                                if (childAt instanceof MBridgeBTWebView) {
                                    linkedHashMapM41466b.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                    ((MBridgeBTWebView) childAt).onDestory();
                                } else if (childAt instanceof MBridgeBTVideoView) {
                                    linkedHashMapM41466b.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                    ((MBridgeBTVideoView) childAt).onDestory();
                                } else if (childAt instanceof MBTempContainer) {
                                    linkedHashMapM41466b.remove(((MBTempContainer) childAt).getInstanceId());
                                    ((MBTempContainer) childAt).onDestroy();
                                }
                            }
                        }
                    }
                }
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onDestroy();
                }
                if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onDestory();
                }
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onDestory();
                }
                m41467b(obj, strOptString2);
                m41459a(obj, "onComponentDestroy", strOptString2);
                C13219q0.m37813a("OperateViews", "destroyComponent instanceId = " + strOptString2);
                return;
            }
            m41458a(obj, "unidId or data is empty");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "destroyComponent failed");
        }
    }

    /* JADX INFO: renamed from: l */
    public void m41489l(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String strOptString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
            } else {
                m41467b(obj, strOptString);
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m41490m(Object obj, JSONObject jSONObject) {
        int i;
        boolean z;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "params is null");
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                C13219q0.m37813a("OperateViews", e.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject2.put("message", "");
                JSONArray jSONArray = jSONObject.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    try {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                        jSONObject2.put("message", "resource is null");
                        C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e2) {
                        C13219q0.m37813a("OperateViews", e2.getMessage());
                        return;
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    String strOptString = jSONObject3.optString("ref", str2);
                    int i4 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i4 != i2 || TextUtils.isEmpty(strOptString)) {
                        str2 = str2;
                        i = length;
                        z = false;
                        if (i4 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else if (i4 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                File file = new File(strOptString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C13219q0.m37813a("OperateViews", "getFileInfo Mraid file " + strOptString);
                                    str = "file:////" + strOptString;
                                } else {
                                    str = str2;
                                }
                            } catch (Throwable th) {
                                if (MBridgeConstans.DEBUG) {
                                    th.printStackTrace();
                                }
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", str);
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i4 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", C13227u0.m37853a(strOptString) == null ? str2 : C13227u0.m37853a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        C13079m c13079mM36727b = C13023m.m36721a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36727b(strOptString);
                        if (c13079mM36727b != null) {
                            C13219q0.m37813a("OperateViews", "VideoBean not null");
                            jSONObject8.put("type", 1);
                            i = length;
                            jSONObject8.put("videoDataLength", c13079mM36727b.m36948d());
                            String strM36949e = c13079mM36727b.m36949e();
                            if (TextUtils.isEmpty(strM36949e)) {
                                C13219q0.m37813a("OperateViews", "VideoPath null");
                                jSONObject8.put("path", str2);
                                jSONObject8.put("path4Web", str2);
                            } else {
                                C13219q0.m37813a("OperateViews", "VideoPath not null");
                                jSONObject8.put("path", strM36949e);
                                jSONObject8.put("path4Web", strM36949e);
                            }
                            if (c13079mM36727b.m36943b() == 5) {
                                jSONObject8.put("downloaded", 1);
                                z = false;
                            } else {
                                z = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        } else {
                            str2 = str2;
                            i = length;
                            z = false;
                            C13219q0.m37813a("OperateViews", "VideoBean null");
                        }
                    }
                    i3++;
                    jSONArray = jSONArray3;
                    length = i;
                    str2 = str2;
                    i2 = 1;
                }
                jSONObject2.put("resource", jSONArray2);
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (Throwable th2) {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", th2.getLocalizedMessage());
                C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e3) {
            C13219q0.m37813a("OperateViews", e3.getMessage());
            return;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m41491n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "hideView failed: instanceId not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "hideView failed: view not exist");
                return;
            }
            view.setVisibility(8);
            m41467b(obj, strOptString2);
            m41459a(obj, "onHideView", strOptString2);
            C13219q0.m37813a("OperateViews", "hideView instanceId = " + strOptString2);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "hideView failed: + " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m41492o(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                m41458a(obj, "data camapign is empty");
            } else {
                m41436a(campaignWithBackData);
                m41467b(obj, "");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public void m41493p(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString3) || !linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId is not exist");
                C13219q0.m37813a("OperateViews", "appendSubView failed: instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapM41466b.get(strOptString2);
            View view = linkedHashMapM41466b.get(strOptString3);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                if (view instanceof MBTempContainer) {
                    C13219q0.m37816b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f39681l), Integer.valueOf(f39682m), Integer.valueOf(f39683n), Integer.valueOf(f39684o), Integer.valueOf(f39685p)));
                    ((MBTempContainer) view).setNotchPadding(f39681l, f39682m, f39683n, f39684o, f39685p);
                    for (View view2 : linkedHashMapM41466b.values()) {
                        if (view2 instanceof MBridgeBTContainer) {
                            C13197f1.m37674a(view);
                            ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        iOptInt = ((BTBaseView) view).getViewWidth();
                        iOptInt2 = ((BTBaseView) view).getViewHeight();
                    } else {
                        rect = null;
                        iOptInt2 = 0;
                        iOptInt = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, m41454a(layoutParams, rect, iOptInt, iOptInt2));
                }
                m41467b(obj, strOptString2);
                m41459a(obj, "onAppendView", strOptString2);
                C13219q0.m37813a("OperateViews", "appendSubView parentId = " + strOptString2 + " childId = " + strOptString3);
                return;
            }
            m41458a(obj, "view is not exist");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m41494q(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
                if (!linkedHashMapM41466b.containsKey(strOptString2) || !linkedHashMapM41466b.containsKey(strOptString3)) {
                    m41458a(obj, "instanceId is not exist");
                    C13219q0.m37813a("OperateViews", "appendViewTo failed: instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapM41466b.get(strOptString3);
                View view = linkedHashMapM41466b.get(strOptString2);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        for (View view2 : linkedHashMapM41466b.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                C13197f1.m37674a(view);
                                ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                            iOptInt = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt = ((BTBaseView) view).getViewWidth();
                            iOptInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                            rect = null;
                            iOptInt2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, m41454a(layoutParams, rect, iOptInt, iOptInt2));
                    }
                    m41467b(obj, strOptString2);
                    m41459a(obj, "onAppendViewTo", strOptString2);
                    C13219q0.m37813a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                    return;
                }
                m41458a(obj, "view is not exist");
                return;
            }
            m41458a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m41495r(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m41458a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2) || !linkedHashMapM41466b.containsKey(strOptString3)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            View view2 = linkedHashMapM41466b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m41458a(obj, "view not exist");
                C13219q0.m37813a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt("right", -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt = ((BTBaseView) view).getViewWidth();
                iOptInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
                rect = null;
                iOptInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, iIndexOfChild + 1, m41454a(layoutParams, rect, iOptInt, iOptInt2));
            m41467b(obj, strOptString2);
            m41459a(obj, "onInsertViewAbove", strOptString2);
            C13219q0.m37813a("OperateViews", "insertViewAbove instanceId = " + strOptString2 + " brotherId = " + strOptString3);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public void m41496s(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "playerGetMuteState failed instanceId not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            int mute = ((MBridgeBTVideoView) view).getMute();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39678i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", strOptString2);
            jSONObject3.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, mute);
            jSONObject2.put("data", jSONObject3);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            C13219q0.m37813a("OperateViews", "playerGetMuteState successed mute = " + mute);
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerGetMuteState failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m41497t(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exist");
                C13219q0.m37813a("OperateViews", "playerMute failed: instanceId is not exist");
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerMute failed: instanceId is not player");
            } else if (((MBridgeBTVideoView) view).playMute()) {
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "playerMute success");
            } else {
                m41458a(obj, "set mute failed");
                C13219q0.m37813a("OperateViews", "playerMute failed set mute failed");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerMute failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    public void m41498u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exit");
                C13219q0.m37813a("OperateViews", "playerPause failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).pause();
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "playerPause success");
            } else {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerPause failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerPause failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m41499v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exit");
                C13219q0.m37813a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + strOptString2);
                return;
            }
            MBridgeBTVideoView mBridgeBTVideoView = (MBridgeBTVideoView) view;
            MBridgeBTContainer mBridgeBTContainerM41434a = m41434a(strOptString, strM41478e);
            if (mBridgeBTContainerM41434a != null) {
                mBridgeBTVideoView.setAdEvents(mBridgeBTContainerM41434a.getAdEvents());
                mBridgeBTVideoView.setAdSession(mBridgeBTContainerM41434a.getAdSession());
                mBridgeBTVideoView.setVideoEvents(mBridgeBTContainerM41434a.getVideoEvents());
            }
            mBridgeBTVideoView.play();
            m41467b(obj, strOptString2);
            C13219q0.m37813a("OperateViews", "playerPlay success");
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerPlay failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public void m41500w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exit");
                C13219q0.m37813a("OperateViews", "playerResume failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).resume();
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "playerResume success");
            } else {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerResume failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerResume failed: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m41501x(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
            } else {
                m41458a(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m41502y(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m41503z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM41478e = m41478e(strOptString2);
            if (TextUtils.isEmpty(strM41478e) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                strM41478e = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m41458a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM41466b = m41466b(strOptString, strM41478e);
            if (!linkedHashMapM41466b.containsKey(strOptString2)) {
                m41458a(obj, "instanceId not exit");
                C13219q0.m37813a("OperateViews", "playerStop failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapM41466b.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).stop();
                m41467b(obj, strOptString2);
                C13219q0.m37813a("OperateViews", "playerStop success");
            } else {
                m41458a(obj, "instanceId is not player");
                C13219q0.m37813a("OperateViews", "playerStop failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th) {
            m41458a(obj, th.getMessage());
            C13219q0.m37813a("OperateViews", "playerStop failed: " + th.getMessage());
        }
    }
}
