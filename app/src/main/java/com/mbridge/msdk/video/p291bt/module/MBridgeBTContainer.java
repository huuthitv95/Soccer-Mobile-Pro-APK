package com.mbridge.msdk.video.p291bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.gadsme.nativeplugin.BuildConfig;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.C11744X3;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13012b;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13941b;
import com.mbridge.msdk.video.dynview.energize.C13944a;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13951d;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.module.report.C14074a;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13934c;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import com.mbridge.msdk.video.signal.InterfaceC14080c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.video.signal.impl.AbstractC14181a;
import com.mbridge.msdk.video.signal.impl.C14184d;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.mbridge.msdk.widget.FeedBackButton;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements InterfaceC14080c {

    /* JADX INFO: renamed from: V */
    private static final String f39791V = "MBridgeBTContainer";

    /* JADX INFO: renamed from: A */
    private boolean f39792A;

    /* JADX INFO: renamed from: B */
    private boolean f39793B;

    /* JADX INFO: renamed from: C */
    private String f39794C;

    /* JADX INFO: renamed from: D */
    private boolean f39795D;

    /* JADX INFO: renamed from: E */
    private List<CampaignEx> f39796E;

    /* JADX INFO: renamed from: F */
    private List<C14202a> f39797F;

    /* JADX INFO: renamed from: G */
    private InterfaceC13930a f39798G;

    /* JADX INFO: renamed from: H */
    private InterfaceC13939h f39799H;

    /* JADX INFO: renamed from: I */
    private InterfaceC13939h f39800I;

    /* JADX INFO: renamed from: J */
    private InterfaceC13931b f39801J;

    /* JADX INFO: renamed from: K */
    private String f39802K;

    /* JADX INFO: renamed from: L */
    private String f39803L;

    /* JADX INFO: renamed from: M */
    private String f39804M;

    /* JADX INFO: renamed from: N */
    private boolean f39805N;

    /* JADX INFO: renamed from: O */
    private int f39806O;

    /* JADX INFO: renamed from: P */
    private String f39807P;

    /* JADX INFO: renamed from: Q */
    private InterfaceC13951d f39808Q;

    /* JADX INFO: renamed from: R */
    private C13154c f39809R;

    /* JADX INFO: renamed from: S */
    private AdSession f39810S;

    /* JADX INFO: renamed from: T */
    private MediaEvents f39811T;

    /* JADX INFO: renamed from: U */
    private AdEvents f39812U;

    /* JADX INFO: renamed from: r */
    private int f39813r;

    /* JADX INFO: renamed from: s */
    private int f39814s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f39815t;

    /* JADX INFO: renamed from: u */
    private MBridgeBTLayout f39816u;

    /* JADX INFO: renamed from: v */
    private WindVaneWebView f39817v;

    /* JADX INFO: renamed from: w */
    private LayoutInflater f39818w;

    /* JADX INFO: renamed from: x */
    private Context f39819x;

    /* JADX INFO: renamed from: y */
    private TextView f39820y;

    /* JADX INFO: renamed from: z */
    private ImageView f39821z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$a */
    class C13910a implements InterfaceC13083a {
        C13910a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBTContainer.f39791V, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBTContainer.f39791V, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBTContainer.f39791V, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$b */
    class C13911b implements InterfaceC13955h {
        C13911b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41638a(C13940a c13940a) {
            CampaignEx campaignEx;
            String str;
            if (c13940a != null) {
                if (MBridgeBTContainer.this.f39815t == null || c13940a.m41699b() == null) {
                    MBridgeBTContainer.this.mo41591b("nativeview is null");
                    return;
                }
                MBridgeBTContainer.this.f39815t.removeAllViews();
                MBridgeBTContainer.this.f39815t.addView(c13940a.m41699b());
                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                mBridgeBTContainer.f39820y = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                mBridgeBTContainer2.f39821z = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                if (MBridgeBTContainer.this.f39798G != null) {
                    MBridgeBTContainer.this.f39798G.mo39340a();
                    MBridgeBTContainer.this.f39798G.mo39341a(2, ((AbstractJSContainer) MBridgeBTContainer.this).f40878e, ((AbstractJSContainer) MBridgeBTContainer.this).f40877d);
                }
                if (MBridgeBTContainer.this.f39796E == null || MBridgeBTContainer.this.f39796E.size() <= 0 || (campaignEx = (CampaignEx) MBridgeBTContainer.this.f39796E.get(0)) == null) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    MBridgeBTContainer.this.m41617d(campaignEx);
                }
                String onlyImpressionURL = campaignEx.getOnlyImpressionURL();
                C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), ((AbstractJSContainer) MBridgeBTContainer.this).f40877d);
                int iM42682A = c14223cM42671c != null ? c14223cM42671c.m42682A() : 1;
                if (campaignEx.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + iM42682A;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + iM42682A;
                }
                C12682a.m34606a(C13008c.m36588n().m36542d(), campaignEx, ((AbstractJSContainer) MBridgeBTContainer.this).f40877d, str, false, true, C12701a.f33767n);
                C13091b.f35901l.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                MBridgeBTContainer.this.m41637e(campaignEx);
                try {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("type", "choseFromTwoShow");
                    C14074a.m42193a("2000103", campaignEx, c13157e);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41639a(EnumC13946a enumC13946a) {
            String str;
            if (enumC13946a != null) {
                str = "errorCode:" + enumC13946a.m41771g() + "Msg:" + enumC13946a.m41772h();
            } else {
                str = "";
            }
            MBridgeBTContainer.this.mo41591b("nativeview is null" + str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$c */
    class C13912c implements InterfaceC13931b {
        C13912c() {
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41640a(String str) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f40878e);
                    jSONObject2.put("unitId", ((AbstractJSContainer) MBridgeBTContainer.this).f40877d);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onAdShow " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41641a(String str, int i, String str2, String str3) {
            if (MBridgeBTContainer.this.f39799H != null) {
                MBridgeBTContainer.this.f39799H.mo39289a(i, str2, str3);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41642a(String str, String str2) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f40878e);
                    jSONObject2.put("unitId", ((AbstractJSContainer) MBridgeBTContainer.this).f40877d);
                    jSONObject2.put("error", str2);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onShowFail " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41643a(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("convert", true);
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onVideoComplete " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41644a(String str, boolean z, C14216c c14216c) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    if (c14216c != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", c14216c.m42626c());
                        jSONObject3.put("amount", c14216c.m42623a());
                        jSONObject2.put(C12538u.f32489j, jSONObject3);
                    }
                    jSONObject2.put("isComplete", z);
                    jSONObject2.put("convert", z ? 1 : 2);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onAdClose " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: a */
        public void mo41645a(boolean z, int i) {
            MBridgeBTContainer.this.f39805N = z;
            MBridgeBTContainer.this.f39806O = i;
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: b */
        public void mo41646b(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b
        /* JADX INFO: renamed from: c */
        public void mo41647c(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.f39817v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, " BT Call H5 onEndcardShow " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(MBridgeBTContainer.f39791V, e.getMessage());
                }
                C13392f.m38726a().m38728a((WebView) MBridgeBTContainer.this.f39817v, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$d */
    class ViewOnClickListenerC13913d implements View.OnClickListener {
        ViewOnClickListenerC13913d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeBTContainer.this.onAdClose();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$e */
    private static final class RunnableC13914e implements Runnable {

        /* JADX INFO: renamed from: a */
        private List<CampaignEx> f39826a;

        /* JADX INFO: renamed from: b */
        private Context f39827b;

        /* JADX INFO: renamed from: c */
        private String f39828c;

        /* JADX INFO: renamed from: d */
        private String f39829d;

        public RunnableC13914e(List<CampaignEx> list, Context context, String str, String str2) {
            this.f39826a = list;
            this.f39827b = context;
            this.f39828c = str;
            this.f39829d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<CampaignEx> list = this.f39826a;
            if (list == null || list.size() <= 0) {
                return;
            }
            try {
                C13015e.m36643a(C13017g.m36693a(this.f39827b)).m36662a(this.f39828c, this.f39826a);
                C14201a.m42411a().m42429b(this.f39829d, this.f39826a.get(0).getAdType());
            } catch (Exception unused) {
                C13219q0.m37813a(MBridgeBTContainer.f39791V, "remove campaign failed");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$f */
    private class C13915f extends AbstractC14181a.a {
        private C13915f() {
        }

        /* synthetic */ C13915f(MBridgeBTContainer mBridgeBTContainer, C13910a c13910a) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41601a() {
            super.mo41601a();
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41602a(int i, String str) {
            super.mo41602a(i, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41603a(boolean z) {
            super.mo41603a(z);
            if (MBridgeBTContainer.this.f39811T != null) {
                try {
                    MBridgeBTContainer.this.f39811T.adUserInteraction(InteractionType.CLICK);
                    C13219q0.m37813a("omsdk", "btc adUserInteraction click");
                } catch (Exception e) {
                    C13219q0.m37813a("omsdk", e.getMessage());
                }
            }
            MBridgeBTContainer.this.f39800I.mo39295a(z, ((AbstractJSContainer) MBridgeBTContainer.this).f40878e, ((AbstractJSContainer) MBridgeBTContainer.this).f40877d);
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            C13227u0.m37860a(campaign, MBridgeBTContainer.this.f39815t);
            if (campaign == null || !(campaign instanceof CampaignEx)) {
                return;
            }
            try {
                CampaignEx campaignEx = (CampaignEx) campaign;
                String strOptString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals(BuildConfig.VERSION_NAME) && ((AbstractJSContainer) MBridgeBTContainer.this).f40876c != null) {
                    if (MBridgeBTContainer.this.f39793B) {
                        MBridgeBTContainer.this.onAdClose();
                    } else {
                        ((AbstractJSContainer) MBridgeBTContainer.this).f40876c.finish();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.video.signal.InterfaceC14078a.a
        public void onInitSuccess() {
            super.onInitSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            C13227u0.m37860a(campaign, MBridgeBTContainer.this.f39815t);
        }

        @Override // com.mbridge.msdk.video.signal.impl.AbstractC14181a.a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            C13227u0.m37863b(campaign, MBridgeBTContainer.this.f39815t);
        }
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.f39813r = 0;
        this.f39814s = 1;
        this.f39792A = false;
        this.f39793B = true;
        this.f39795D = false;
        this.f39810S = null;
        this.f39811T = null;
        this.f39812U = null;
        init(context);
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39813r = 0;
        this.f39814s = 1;
        this.f39792A = false;
        this.f39793B = true;
        this.f39795D = false;
        this.f39810S = null;
        this.f39811T = null;
        this.f39812U = null;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private void m41608a(int i, int i2, int i3, int i4) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<CampaignEx> list = this.f39796E;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (this.f39796E.get(0).isDynamicView() && (textView = this.f39820y) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                if (i > 0) {
                    layoutParams.leftMargin = i;
                }
                if (i3 > 0) {
                    layoutParams.rightMargin = i3;
                }
                if (i2 > 0) {
                    layoutParams.topMargin = i2;
                }
                if (i4 > 0) {
                    layoutParams.bottomMargin = i4;
                }
                this.f39820y.setLayoutParams(layoutParams);
                if (this.f39821z != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f39821z.getLayoutParams());
                        layoutParams2.leftMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        this.f39821z.setLayoutParams(layoutParams2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e2) {
            C13219q0.m37816b(f39791V, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41609a(Context context) {
        if (this.f39808Q == null) {
            mo41591b("ChoiceOneCallback is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("choice_one_callback", this.f39808Q);
        C13941b.m41701a().m41702a(context, this.f39796E, new C13911b(), map);
    }

    /* JADX INFO: renamed from: c */
    private WindVaneWebView m41613c(String str) {
        C14200a.a aVarM42399b = C14200a.m42399b(str);
        if (aVarM42399b == null) {
            return null;
        }
        this.f39794C = aVarM42399b.m42405a();
        C13219q0.m37813a(f39791V, "get BT wraper.getTag = " + this.f39794C);
        aVarM42399b.m42407a("");
        return aVarM42399b.m42409b();
    }

    /* JADX INFO: renamed from: c */
    private C14202a m41614c(CampaignEx campaignEx) {
        List<C14202a> list = this.f39797F;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (C14202a c14202a : list) {
            if (c14202a.m42497h().getId().equals(campaignEx.getId())) {
                C13219q0.m37813a(f39791V, "tempContainer task initSuccess");
                return c14202a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m41617d(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap map = new HashMap();
                List<C13070d> listM36624a = C13012b.m36621a(C13008c.m36588n().m36542d()).m36624a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (listM36624a == null || listM36624a.size() <= 0 || listM36624a.get(0) == null) {
                    return;
                }
                int iM36807c = listM36624a.get(0).m36807c();
                String strM36804b = listM36624a.get(0).m36804b();
                if (iM36807c == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + strM36804b);
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private InterfaceC13931b m41626k() {
        if (this.f39801J == null) {
            this.f39801J = new C13912c();
        }
        return this.f39801J;
    }

    /* JADX INFO: renamed from: l */
    private void m41628l() {
        AdSession adSession = this.f39810S;
        if (adSession != null) {
            try {
                adSession.registerAdView(this);
                this.f39810S.start();
                C13219q0.m37813a("omsdk", "btc:  adSession.start();");
                if (this.f39812U != null) {
                    C13219q0.m37813a("omsdk", "btc:   adEvents.loaded");
                    this.f39812U.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    C13219q0.m37813a("omsdk", "btc:   adEvents.impressionOccurred");
                    this.f39812U.impressionOccurred();
                }
            } catch (Exception e) {
                C13219q0.m37813a("omsdk", e.getMessage());
            }
        }
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
            int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 48.0f);
            int iM37876a2 = C13229v0.m37876a(C13008c.m36588n().m36542d(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM37876a, iM37876a);
            layoutParams.setMargins(iM37876a2, iM37876a2, iM37876a2, iM37876a2);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_close", "drawable"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new ViewOnClickListenerC13913d());
            addView(imageView);
        } catch (Throwable th) {
            C13219q0.m37816b(f39791V, th.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context contextM36542d = C13008c.m36588n().m36542d();
                int iOptInt = jSONObject.optInt("left", -999);
                int iOptInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999);
                int iOptInt3 = jSONObject.optInt("right", -999);
                int iOptInt4 = jSONObject.optInt("bottom", -999);
                if (iOptInt != -999 && contextM36542d != null) {
                    layoutParams.leftMargin = C13229v0.m37876a(contextM36542d, iOptInt);
                }
                if (iOptInt2 != -999 && contextM36542d != null) {
                    layoutParams.topMargin = C13229v0.m37876a(contextM36542d, iOptInt2);
                }
                if (iOptInt3 != -999 && contextM36542d != null) {
                    layoutParams.rightMargin = C13229v0.m37876a(contextM36542d, iOptInt3);
                }
                if (iOptInt4 != -999 && contextM36542d != null) {
                    layoutParams.bottomMargin = C13229v0.m37876a(contextM36542d, iOptInt4);
                }
                int iOptInt5 = jSONObject.optInt("width");
                int iOptInt6 = jSONObject.optInt("height");
                if (iOptInt5 > 0) {
                    layoutParams.width = iOptInt5;
                }
                if (iOptInt6 > 0) {
                    layoutParams.height = iOptInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.f40876c);
            mBTempContainer.setMute(this.f40883j);
            mBTempContainer.setBidCampaign(this.f39792A);
            mBTempContainer.setIV(this.f40884k);
            mBTempContainer.setBigOffer(this.f39793B);
            mBTempContainer.setIVRewardEnable(this.f40886m, this.f40887n, this.f40888o);
            mBTempContainer.setShowRewardListener(this.f39800I);
            mBTempContainer.setCampaignDownLoadTask(m41614c(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(m41626k());
            mBTempContainer.setWebViewFront(getJSCommon().mo42213b());
            mBTempContainer.init(this.f39819x);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    /* JADX INFO: renamed from: b */
    protected void mo41591b(String str) {
        InterfaceC13939h interfaceC13939h = this.f39799H;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39291a(this.f39809R, str);
        }
        super.mo41591b(str);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f39817v != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, this.f39813r);
                jSONObject2.put("id", this.f39794C);
                jSONObject2.put(C11744X3.i.f26373j0, str);
                jSONObject2.put("data", jSONObject);
                C13392f.m38726a().m38728a((WebView) this.f39817v, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C13893d.m41513c().m41457a((WebView) this.f39817v, "broadcast", this.f39794C);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14174e
    public void click(int i, String str) {
    }

    /* JADX INFO: renamed from: e */
    protected void m41637e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    C12682a.m34605a(C13008c.m36588n().m36542d(), campaignEx2, this.f40877d, it.next(), false, true);
                    campaignEx = campaignEx2;
                }
            } catch (Throwable th) {
                C13219q0.m37816b(f39791V, th.getMessage());
            }
        }
    }

    public int findID(String str) {
        return C13203i0.m37707a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C13203i0.m37707a(getContext(), str, "layout");
    }

    public AdEvents getAdEvents() {
        return this.f39812U;
    }

    public AdSession getAdSession() {
        return this.f39810S;
    }

    public List<CampaignEx> getCampaigns() {
        return this.f39796E;
    }

    public MediaEvents getVideoEvents() {
        return this.f39811T;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14174e
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.f39819x = context;
        this.f39818w = LayoutInflater.from(context);
    }

    public void onAdClose() {
        Activity activity = this.f40876c;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onBackPressed();
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onBackPressed();
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onCreate(boolean z) {
        String cMPTEntryUrl;
        CampaignEx campaignEx;
        try {
            int iFindLayout = findLayout("mbridge_bt_container");
            if (!C13203i0.m37709a(iFindLayout)) {
                mo41591b("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f39818w.inflate(iFindLayout, this);
            this.f39815t = frameLayout;
            if (frameLayout == null) {
                mo41591b("ViewIds null");
                return;
            }
            this.f39803L = "";
            List<CampaignEx> list = this.f39796E;
            if (list == null || list.size() <= 0) {
                cMPTEntryUrl = "";
            } else {
                CampaignEx campaignEx2 = this.f39796E.get(0);
                cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                this.f39803L = campaignEx2.getRequestId();
                this.f39804M = campaignEx2.getCurrentLocalRid();
            }
            this.f39817v = m41613c(this.f40877d + "_" + this.f39803L + "_" + cMPTEntryUrl);
            C14200a.m42404e(this.f40877d + "_" + this.f39803L + "_" + cMPTEntryUrl);
            m41628l();
            WindVaneWebView windVaneWebView = this.f39817v;
            if (windVaneWebView == null) {
                List<CampaignEx> list2 = this.f39796E;
                if (list2 == null || list2.size() <= 0 || (campaignEx = this.f39796E.get(0)) == null || !(z || campaignEx.isDynamicView())) {
                    mo41591b("big template webview is null");
                    return;
                } else {
                    m41609a(this.f39819x);
                    return;
                }
            }
            C14177b c14177b = new C14177b(this.f40876c, this, windVaneWebView);
            registerJsFactory(c14177b);
            this.f39817v.setApiManagerJSFactory(c14177b);
            if (this.f39817v.getParent() != null) {
                mo41591b("preload template webview is null or load error");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = null;
            if (this.f39817v.getObject() instanceof C14191k) {
                c14177b.m42342a((C14191k) this.f39817v.getObject());
                if (this.f39817v != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C13088a.f35870l, C13229v0.m37918d(getContext()));
                    try {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f40881h.m42626c());
                            jSONObject2.put("amount", this.f40881h.m42623a());
                            jSONObject2.put("id", this.f40882i);
                            jSONObject.put("userId", this.f40880g);
                            jSONObject.put(C12538u.f32489j, jSONObject2);
                            jSONObject.put("playVideoMute", this.f40883j);
                            jSONObject.put("extra", this.f39807P);
                        } catch (JSONException e) {
                            C13219q0.m37813a(f39791V, e.getMessage());
                        }
                    } catch (Exception e2) {
                        C13219q0.m37813a(f39791V, e2.getMessage());
                    }
                    this.f39800I = new C13934c(m41626k(), "");
                    String string = jSONObject.toString();
                    try {
                        C13157e c13157e = new C13157e();
                        c13157e.m37501a("type", 1);
                        C13156d.m37475b().m37487a("2000133", this.f39796E, c13157e);
                    } catch (Exception unused) {
                    }
                    getJSNotifyProxy().mo42348a(string);
                    getJSCommon().mo42215b(true);
                    getJSCommon().mo42209a(new C13915f(this, null == true ? 1 : 0));
                }
                ((C14184d) getJSCommon()).f40919m.onInitSuccess();
            }
            this.f39817v.setBackgroundColor(0);
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || !linkedHashMapM41466b.containsKey(this.f39794C)) {
                mo41591b("big template webviewLayout is null");
                return;
            }
            View view = linkedHashMapM41466b.get(this.f39794C);
            if (view instanceof MBridgeBTLayout) {
                MBridgeBTLayout mBridgeBTLayout = (MBridgeBTLayout) view;
                this.f39816u = mBridgeBTLayout;
                try {
                    WindVaneWebView windVaneWebView2 = (WindVaneWebView) mBridgeBTLayout.getBtWebView();
                    C14191k c14191k = (C14191k) windVaneWebView2.getObject();
                    c14191k.setAdEvents(this.f39812U);
                    c14191k.setVideoEvents(this.f39811T);
                    c14191k.setAdSession(this.f39810S);
                    windVaneWebView2.setObject(c14191k);
                } catch (Exception e3) {
                    C13219q0.m37816b(f39791V, e3.getMessage());
                }
                C13084b.m37036b().m37047a(this.f40877d + "_1", new C13910a());
                this.f39816u.addView(this.f39817v, 0, new FrameLayout.LayoutParams(-1, -1));
                C13084b.m37036b().m37054d(this.f40877d + "_2");
                FeedBackButton feedBackButtonM37039a = C13084b.m37036b().m37039a(this.f40877d + "_1");
                if (C13084b.m37036b().m37050a() && feedBackButtonM37039a != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM37039a.getLayoutParams();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(C13084b.f35792e, C13084b.f35791d);
                    }
                    layoutParams.topMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
                    layoutParams.leftMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
                    feedBackButtonM37039a.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonM37039a.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonM37039a);
                    }
                    this.f39816u.addView(feedBackButtonM37039a);
                }
                this.f39816u.setTag(this.f39794C);
                linkedHashMapM41466b.put(this.f39794C, this.f39816u);
                for (View view2 : linkedHashMapM41466b.values()) {
                    if (view2 instanceof MBridgeBTRootLayout) {
                        MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) view2;
                        this.f39802K = mBridgeBTRootLayout.getInstanceId();
                        this.f39815t.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                linkedHashMapM41466b.remove(this.f39802K);
                linkedHashMapM41466b.put(this.f39802K, this);
            }
            C13893d.m41513c().m41463a(this.f40877d, this.f40883j);
            C13893d.m41513c().m41477d(this.f39794C, this.f39803L);
            C13893d.m41513c().m41477d(this.f39802K, this.f39803L);
            C13893d.m41513c().m41464a(this.f40877d + "_" + this.f39803L, this.f40876c);
            try {
                C13167a.m37543b().execute(new RunnableC13914e(this.f39796E, getContext().getApplicationContext(), this.f40877d, this.f40878e));
            } catch (Throwable unused2) {
                C13219q0.m37813a(f39791V, "remove campaign failed");
            }
            List<CampaignEx> list3 = this.f39796E;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            m42336a(this.f40879f, this.f39796E.get(0));
        } catch (Throwable th) {
            mo41591b("onCreate exception " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f39795D) {
            return;
        }
        this.f39795D = true;
        if (this.f39810S != null) {
            C13219q0.m37816b("omsdk", "btc onDestroy");
            this.f39810S.finish();
        }
        super.onDestroy();
        C13893d.m41513c().m41485h(this.f40877d + "_" + this.f39803L);
        try {
            WindVaneWebView windVaneWebView = this.f39817v;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f39817v.clearWebView();
                this.f39817v.release();
            }
            if (this.f39801J != null) {
                this.f39801J = null;
            }
            if (this.f39798G != null) {
                this.f39798G = null;
            }
            if (this.f39819x != null) {
                this.f39819x = null;
            }
            List<CampaignEx> list = this.f39796E;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f39796E) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        C14200a.m42404e(this.f40877d + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().m36781j());
                    }
                }
                C13944a.m41754a().m41762d();
            }
            C13893d.m41513c().m41462a(this.f39794C);
            C13893d.m41513c().m41470b(this.f40877d);
            C13893d.m41513c().m41466b(this.f40877d, this.f39803L).remove(this.f39794C);
            C13893d.m41513c().m41466b(this.f40877d, this.f39803L).remove(this.f39802K);
            C13893d.m41513c().m41466b(this.f40877d, this.f39803L).clear();
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        CampaignEx campaignEx;
        super.onPause();
        List<CampaignEx> list = this.f39796E;
        if (list != null && list.size() > 0 && (campaignEx = this.f39796E.get(0)) != null && campaignEx.isDynamicView()) {
            C13944a.m41754a().m41760b();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        super.onResume();
        List<CampaignEx> list = this.f39796E;
        if (list != null && list.size() > 0 && (campaignEx = this.f39796E.get(0)) != null && campaignEx.isDynamicView()) {
            C13944a.m41754a().m41761c();
        }
        if (C13084b.f35793f) {
            return;
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onResume();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.f39796E;
        if (list != null && list.size() > 0 && (campaignEx = this.f39796E.get(0)) != null && campaignEx.isDynamicView()) {
            C13944a.m41754a().m41762d();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14080c
    public void reactDeveloper(Object obj, String str) {
        JSONObject jSONObjectOptJSONObject;
        int i;
        if (this.f39798G == null || TextUtils.isEmpty(str)) {
            m42338a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            String strOptString = jSONObject.optString("unitId", getUnitId());
            String strOptString2 = jSONObject.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            CampaignEx campaignEx = this.f39796E.get(0);
            boolean z = true;
            if (iOptInt == 1 && jSONObjectOptJSONObject2 != null) {
                boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean("expired");
                if (campaignEx != null) {
                    if (zOptBoolean) {
                        campaignEx.setSpareOfferFlag(1);
                    } else {
                        campaignEx.setSpareOfferFlag(0);
                    }
                }
            }
            setCBT(campaignEx);
            switch (iOptInt) {
                case 1:
                    this.f39798G.mo39340a();
                    this.f39798G.mo39341a(2, strOptString2, strOptString);
                    m42337a(obj);
                    break;
                case 2:
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject("error") : null;
                    this.f39798G.mo39342a(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString(NotificationCompat.CATEGORY_MESSAGE) : "");
                    this.f39798G.mo39341a(4, strOptString2, strOptString);
                    m42337a(obj);
                    break;
                case 3:
                    this.f39798G.mo39347b(strOptString2, strOptString);
                    this.f39798G.mo39341a(5, strOptString2, strOptString);
                    m42337a(obj);
                    break;
                case 4:
                    try {
                        C13157e c13157e = new C13157e();
                        c13157e.m37501a("type", 2);
                        C13156d.m37475b().m37487a("2000147", this.f39796E, c13157e);
                    } catch (Throwable th) {
                        C13219q0.m37816b(f39791V, th.getMessage());
                    }
                    this.f39798G.mo39343a(strOptString2, strOptString);
                    this.f39798G.mo39341a(6, strOptString2, strOptString);
                    m42337a(obj);
                    break;
                case 5:
                    this.f39798G.mo39346a(jSONObject.optBoolean("isAutoClick"), strOptString2, strOptString);
                    m42337a(obj);
                    break;
                case 6:
                    if (jSONObjectOptJSONObject2 != null) {
                        if (jSONObjectOptJSONObject2.optInt("convert") != 1) {
                            z = false;
                        }
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(C12538u.f32489j);
                        String strOptString3 = jSONObjectOptJSONObject2.optString("extra");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            this.f39807P = strOptString3;
                        }
                    } else {
                        z = false;
                        jSONObjectOptJSONObject = null;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject2.optJSONObject("campaign"));
                    C14216c c14216cM42620a = C14216c.m42620a(jSONObjectOptJSONObject);
                    if (c14216cM42620a == null) {
                        c14216cM42620a = this.f40881h;
                    }
                    this.f39798G.mo39341a(7, strOptString2, strOptString);
                    try {
                        C13157e c13157e2 = new C13157e();
                        c13157e2.m37501a("type", 2);
                        C13156d.m37475b().m37486a("2000152", c13157e2);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (this.f40884k && ((i = this.f40886m) == C13088a.f35842H || i == C13088a.f35843I)) {
                        this.f39798G.mo39344a(this.f39805N, this.f39806O);
                    }
                    if (!z) {
                        c14216cM42620a.m42624a(0);
                        C13219q0.m37813a("omsdk", "bt videoEvents :" + this.f39811T);
                        MediaEvents mediaEvents = this.f39811T;
                        if (mediaEvents != null) {
                            try {
                                mediaEvents.skipped();
                                this.f39811T = null;
                            } catch (Exception e2) {
                                C13219q0.m37813a("omsdk", e2.getMessage());
                            }
                        }
                    }
                    this.f39798G.mo39345a(z, c14216cM42620a);
                    C13219q0.m37813a(f39791V, "sendToServerRewardInfo");
                    if (!this.f40884k && z) {
                        if (campaignWithBackData != null) {
                            C14075b.m42198a(campaignWithBackData, c14216cM42620a, strOptString, this.f40880g, this.f39807P);
                        } else {
                            C14075b.m42198a(campaignEx, c14216cM42620a, strOptString, this.f40880g, this.f39807P);
                        }
                    }
                    C13156d.m37475b().m37482a("2000134", campaignWithBackData);
                    m42337a(obj);
                    break;
                default:
                    m42337a(obj);
                    break;
            }
        } catch (JSONException e3) {
            m42338a(obj, e3.getMessage());
            C13219q0.m37813a(f39791V, e3.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14080c
    public void reportUrls(Object obj, String str) {
        C13219q0.m37813a(f39791V, "reportUrls:" + str);
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
                    Context contextM36542d = C13008c.m36588n().m36542d();
                    List<CampaignEx> list = this.f39796E;
                    C12682a.m34605a(contextM36542d, list != null ? list.get(0) : null, "", strM37887a, false, iOptInt != 0);
                } else {
                    Context contextM36542d2 = C13008c.m36588n().m36542d();
                    List<CampaignEx> list2 = this.f39796E;
                    C12682a.m34606a(contextM36542d2, list2 != null ? list2.get(0) : null, "", strM37887a, false, iOptInt != 0, iOptInt2);
                }
            }
            m42340b(obj, "");
        } catch (Throwable th) {
            C13219q0.m37817b(f39791V, "reportUrls", th);
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f39812U = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.f39810S = adSession;
    }

    public void setBTContainerCallback(InterfaceC13930a interfaceC13930a) {
        this.f39798G = interfaceC13930a;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() != 1) {
                campaignEx.setCbt(0);
                return;
            }
            C14223c c14223c = this.f40879f;
            if (c14223c != null) {
                if (c14223c.m42682A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        }
    }

    public void setCampaignDownLoadTasks(List<C14202a> list) {
        this.f39797F = list;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.f39796E = list;
        String currentLocalRid = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    currentLocalRid = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.f39809R = C13156d.m37475b().m37489b(currentLocalRid);
        }
        if (this.f39809R == null) {
            this.f39809R = new C13154c();
        }
        this.f39809R.m37446i(currentLocalRid);
        this.f39809R.m37429b(list);
    }

    public void setChoiceOneCallback(InterfaceC13951d interfaceC13951d) {
        this.f39808Q = interfaceC13951d;
    }

    public void setDeveloperExtraData(String str) {
        this.f39807P = str;
    }

    public void setJSFactory(C14177b c14177b) {
        this.f40890q = c14177b;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5;
        try {
            String strM37652a = C13190d0.m37652a(i, i2, i3, i4, i5);
            C13219q0.m37816b(f39791V, strM37652a);
            WindVaneWebView windVaneWebView = this.f39817v;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof C14191k) && !TextUtils.isEmpty(strM37652a)) {
                ((C14191k) this.f39817v.getObject()).mo42210a(strM37652a);
                C13392f.m38726a().m38728a((WebView) this.f39817v, "oncutoutfetched", Base64.encodeToString(strM37652a.getBytes(), 0));
            }
            m41608a(i2, i4, i3, i6);
            C13893d.m41513c().m41455a(i, i2, i3, i4, i6);
            LinkedHashMap<String, View> linkedHashMapM41466b = C13893d.m41513c().m41466b(this.f40877d, this.f39803L);
            if (linkedHashMapM41466b == null || linkedHashMapM41466b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM41466b.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).setNotchPadding(i2, i3, i4, i6);
                }
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).setNotchPadding(i, i2, i3, i4, i6);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(strM37652a)) {
                    C13392f.m38726a().m38730a(view, "oncutoutfetched", Base64.encodeToString(strM37652a.getBytes(), 0));
                }
                i6 = i5;
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f39791V, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(InterfaceC13939h interfaceC13939h) {
        this.f39799H = interfaceC13939h;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f39811T = mediaEvents;
    }
}
