package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.InterfaceC14079b;
import com.mbridge.msdk.video.signal.InterfaceC14080c;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14178g;
import com.mbridge.msdk.video.signal.InterfaceC14180i;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.factory.C14176a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a */
    private int f40874a;

    /* JADX INFO: renamed from: b */
    private int f40875b;

    /* JADX INFO: renamed from: c */
    protected Activity f40876c;

    /* JADX INFO: renamed from: d */
    protected String f40877d;

    /* JADX INFO: renamed from: e */
    protected String f40878e;

    /* JADX INFO: renamed from: f */
    protected C14223c f40879f;

    /* JADX INFO: renamed from: g */
    protected String f40880g;

    /* JADX INFO: renamed from: h */
    protected C14216c f40881h;

    /* JADX INFO: renamed from: i */
    protected String f40882i;

    /* JADX INFO: renamed from: j */
    protected int f40883j;

    /* JADX INFO: renamed from: k */
    protected boolean f40884k;

    /* JADX INFO: renamed from: l */
    protected boolean f40885l;

    /* JADX INFO: renamed from: m */
    protected int f40886m;

    /* JADX INFO: renamed from: n */
    protected int f40887n;

    /* JADX INFO: renamed from: o */
    protected int f40888o;

    /* JADX INFO: renamed from: p */
    protected boolean f40889p;

    /* JADX INFO: renamed from: q */
    protected IJSFactory f40890q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f40874a = 0;
        this.f40875b = 1;
        this.f40883j = 2;
        this.f40884k = false;
        this.f40885l = false;
        this.f40889p = false;
        this.f40890q = new C14176a();
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40874a = 0;
        this.f40875b = 1;
        this.f40883j = 2;
        this.f40884k = false;
        this.f40885l = false;
        this.f40889p = false;
        this.f40890q = new C14176a();
    }

    /* JADX INFO: renamed from: i */
    private boolean m42334i(int i) {
        try {
            if (i == 1) {
                this.f40876c.setRequestedOrientation(12);
            } else {
                if (i != 2) {
                    return false;
                }
                this.f40876c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("AbstractJSContainer", th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    protected int m42335a(CampaignEx campaignEx) {
        C14191k c14191kM42339b = m42339b(campaignEx);
        if (c14191kM42339b != null) {
            return c14191kM42339b.m42355n();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    protected void m42336a(C14223c c14223c, CampaignEx campaignEx) {
        CampaignEx.C13066c rewardTemplateMode;
        if (m42335a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : m42334i(rewardTemplateMode.m36778g())) || c14223c == null) {
            return;
        }
        m42334i(this.f40879f.m42762y());
    }

    /* JADX INFO: renamed from: a */
    protected void m42337a(Object obj) {
        C13392f.m38726a().m38731b(obj, m42341h(this.f40874a));
    }

    /* JADX INFO: renamed from: a */
    protected void m42338a(Object obj, String str) {
        C13392f.m38726a().m38729a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* JADX INFO: renamed from: b */
    protected C14191k m42339b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        C14200a.a aVarM42394a = C14200a.m42394a(this.f40884k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (aVarM42394a != null && aVarM42394a.m42410c()) {
            WindVaneWebView windVaneWebViewM42409b = aVarM42394a.m42409b();
            if (windVaneWebViewM42409b.getObject() instanceof C14191k) {
                return (C14191k) windVaneWebViewM42409b.getObject();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected void m42340b(Object obj, String str) {
        C13392f.m38726a().m38731b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    /* JADX INFO: renamed from: b */
    protected void mo41591b(String str) {
        C13219q0.m37816b("AbstractJSContainer", str);
        Activity activity = this.f40876c;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14079b getActivityProxy() {
        return this.f40890q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14180i getIJSRewardVideoV1() {
        return this.f40890q.getIJSRewardVideoV1();
    }

    protected String getInnerPlacementId() {
        C14223c c14223c;
        return (!TextUtils.isEmpty(this.f40878e) || (c14223c = this.f40879f) == null || TextUtils.isEmpty(c14223c.m42752t())) ? this.f40878e : this.f40879f.m42752t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14080c getJSBTModule() {
        return this.f40890q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14173d getJSCommon() {
        return this.f40890q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14175f getJSContainerModule() {
        return this.f40890q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14178g getJSNotifyProxy() {
        return this.f40890q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14199j getJSVideoModule() {
        return this.f40890q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f40878e;
    }

    public String getUnitId() {
        return this.f40877d;
    }

    /* JADX INFO: renamed from: h */
    protected String m42341h(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42230a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42231b();
        }
    }

    public void onPause() {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42236g();
        }
        getActivityProxy().mo42229a(1);
    }

    public void onRestart() {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42235f();
        }
        getActivityProxy().mo42229a(4);
    }

    public void onResume() {
        if (C13084b.f35793f) {
            return;
        }
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42233d();
        }
        getActivityProxy().mo42229a(0);
    }

    public void onStart() {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42237h();
        }
        getActivityProxy().mo42229a(2);
    }

    public void onStop() {
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42232c();
        }
        getActivityProxy().mo42229a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f40890q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f40876c = activity;
    }

    public void setBidCampaign(boolean z) {
        this.f40885l = z;
    }

    public void setBigOffer(boolean z) {
        this.f40889p = z;
    }

    public void setIV(boolean z) {
        this.f40884k = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f40886m = i;
        this.f40887n = i2;
        this.f40888o = i3;
    }

    public void setMute(int i) {
        this.f40883j = i;
    }

    public void setPlacementId(String str) {
        this.f40878e = str;
    }

    public void setReward(C14216c c14216c) {
        this.f40881h = c14216c;
    }

    public void setRewardId(String str) {
        this.f40882i = str;
    }

    public void setRewardUnitSetting(C14223c c14223c) {
        this.f40879f = c14223c;
    }

    public void setUnitId(String str) {
        this.f40877d = str;
    }

    public void setUserId(String str) {
        this.f40880g = str;
    }
}
