package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13941b;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13949b;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13950c;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.moffer.C13965a;
import com.mbridge.msdk.video.dynview.wrapper.C13987c;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13937f;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m */
    private MBridgeOrderCampView f40099m;

    /* JADX INFO: renamed from: n */
    private List<CampaignEx> f40100n;

    /* JADX INFO: renamed from: o */
    private int f40101o;

    /* JADX INFO: renamed from: p */
    private int f40102p;

    /* JADX INFO: renamed from: q */
    private int f40103q;

    /* JADX INFO: renamed from: r */
    private int f40104r;

    /* JADX INFO: renamed from: s */
    private String f40105s;

    /* JADX INFO: renamed from: t */
    private FeedBackButton f40106t;

    /* JADX INFO: renamed from: u */
    private ImageView f40107u;

    /* JADX INFO: renamed from: v */
    private boolean f40108v;

    /* JADX INFO: renamed from: w */
    private InterfaceC13950c f40109w;

    /* JADX INFO: renamed from: x */
    private InterfaceC13949b f40110x;

    /* JADX INFO: renamed from: y */
    private boolean f40111y;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView$a */
    class C13981a implements InterfaceC13950c {
        C13981a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13950c
        /* JADX INFO: renamed from: a */
        public void mo41778a(CampaignEx campaignEx, int i) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.m41880a(campaignEx, 0, i);
                } catch (Exception e) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13950c
        public void close() {
            MBridgeOrderCampView.this.m41890g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView$b */
    class C13982b implements InterfaceC13955h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f40113a;

        C13982b(ViewGroup viewGroup) {
            this.f40113a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41638a(C13940a c13940a) {
            if (c13940a != null) {
                try {
                    MBridgeOrderCampView.this.f40099m.addView(c13940a.m41699b());
                    MBridgeOrderCampView.this.f40108v = c13940a.m41700c();
                    this.f40113a.removeAllViews();
                    this.f40113a.addView(MBridgeOrderCampView.this.f40099m);
                    C13937f.m41692a(C13008c.m36588n().m36542d(), (List<CampaignEx>) MBridgeOrderCampView.this.f40100n, ((CampaignEx) MBridgeOrderCampView.this.f40100n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f40110x != null) {
                        MBridgeOrderCampView.this.f40110x.mo41776a();
                    }
                } catch (Exception e) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41639a(EnumC13946a enumC13946a) {
            try {
                C13937f.m41693a(C13008c.m36588n().m36542d(), (List<CampaignEx>) MBridgeOrderCampView.this.f40100n, ((CampaignEx) MBridgeOrderCampView.this.f40100n.get(0)).getCampaignUnitId(), enumC13946a.m41772h());
                if (MBridgeOrderCampView.this.f40110x != null) {
                    MBridgeOrderCampView.this.f40110x.mo41777b();
                }
            } catch (Exception e) {
                C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView$c */
    class C13983c implements InterfaceC13083a {
        C13983c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView$d */
    class ViewOnClickListenerC13984d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f40116a;

        ViewOnClickListenerC13984d(String str) {
            this.f40116a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C12684c.m34661e(((MBridgeBaseView) MBridgeOrderCampView.this).f40201a, this.f40116a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f40108v = false;
        this.f40109w = new C13981a();
        this.f40111y = false;
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40108v = false;
        this.f40109w = new C13981a();
        this.f40111y = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41880a(CampaignEx campaignEx, int i, int i2) {
        JSONException jSONException;
        JSONObject jSONObject;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.C13066c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.m36782k() + "";
                }
                String str2 = str;
                C13148j.m37386a(C13008c.m36588n().m36542d(), "order_view_click" + str2, campaignEx.getCampaignUnitId(), campaignEx.isBidCampaign(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2);
            } catch (Exception e) {
                C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C13088a.f35868j, m41939a(i));
                jSONObject.put("camp_position", i2);
            } catch (JSONException e2) {
                jSONException = e2;
                jSONException.printStackTrace();
            }
        } catch (JSONException e3) {
            jSONException = e3;
            jSONObject = null;
        }
        InterfaceC14058a interfaceC14058a = this.notifyListener;
        if (interfaceC14058a != null) {
            interfaceC14058a.mo41600a(105, jSONObject);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m41888e() {
        List<CampaignEx> list = this.f40100n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f40106t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f40105s = this.f40100n.get(0).getCampaignUnitId();
        this.f40202b = this.f40100n.get(0);
        C13084b.m37036b().m37046a(this.f40105s + "_2", this.f40202b);
        if (this.f40106t == null) {
            return;
        }
        if (!C13084b.m37036b().m37050a()) {
            this.f40106t.setVisibility(8);
            return;
        }
        C13084b.m37036b().m37047a(this.f40105s + "_2", new C13983c());
        C13084b.m37036b().m37048a(this.f40105s + "_2", this.f40106t);
    }

    /* JADX INFO: renamed from: f */
    private void m41889f() {
        if (this.f40107u == null) {
            return;
        }
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            this.f40107u.setVisibility(8);
            return;
        }
        String strM39479c = c13635gM39718d.m39479c();
        if (TextUtils.isEmpty(strM39479c)) {
            this.f40107u.setVisibility(8);
        }
        this.f40107u.setOnClickListener(new ViewOnClickListenerC13984d(strM39479c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m41890g() {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", 2);
            C13156d.m37475b().m37486a("2000152", c13157e);
            C13156d.m37475b().m37482a("2000134", this.f40202b);
        } catch (Throwable th) {
            C13219q0.m37813a(MBridgeBaseView.TAG, th.getMessage());
        }
        try {
            C13965a.m41789a().m41799b();
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
        InterfaceC14058a interfaceC14058a = this.notifyListener;
        if (interfaceC14058a != null) {
            interfaceC14058a.mo41600a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f40100n == null) {
            InterfaceC13949b interfaceC13949b = this.f40110x;
            if (interfaceC13949b != null) {
                interfaceC13949b.mo41777b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f40109w);
        C13941b.m41701a().m41704a(new C13987c().m41936b(C13008c.m36588n().m36542d(), this.f40100n), new C13982b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f40099m = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        JSONException e;
        JSONObject jSONObject;
        super.onAttachedToWindow();
        if (this.f40100n == null) {
            return;
        }
        for (int i = 0; i < this.f40100n.size(); i++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i);
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (JSONException e3) {
                e = e3;
                jSONObject = null;
            }
            InterfaceC14058a interfaceC14058a = this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(InterfaceC13949b interfaceC13949b) {
        this.f40110x = interfaceC13949b;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f40100n = list;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.f40101o = i;
        this.f40102p = i2;
        this.f40103q = i3;
        this.f40104r = i4;
        setViewStatus();
    }

    public void setRewarded(boolean z) {
        this.f40111y = z;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f40099m;
        if (mBridgeOrderCampView == null || !this.f40111y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f40108v, "mbridge_native_order_camp_controller"));
        this.f40106t = (FeedBackButton) this.f40099m.findViewById(filterFindViewId(this.f40108v, "mbridge_native_order_camp_feed_btn"));
        this.f40107u = (ImageView) this.f40099m.findViewById(filterFindViewId(this.f40108v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f40101o, this.f40103q, this.f40102p, this.f40104r);
        }
        if (this.f40106t != null) {
            try {
                m41888e();
            } catch (Exception e) {
                C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
            }
        }
        if (this.f40107u != null) {
            try {
                m41889f();
            } catch (Exception e2) {
                C13219q0.m37816b(MBridgeBaseView.TAG, e2.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f40099m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f40099m.startAnimation(translateAnimation);
    }
}
