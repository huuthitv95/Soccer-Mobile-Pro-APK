package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.omsdk.C13439b;
import java.util.Iterator;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.kit.a */
/* JADX INFO: compiled from: OmSdkKit.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12754a {

    /* JADX INFO: renamed from: a */
    private AdSession f33923a;

    /* JADX INFO: renamed from: b */
    private AdEvents f33924b;

    /* JADX INFO: renamed from: c */
    private MediaEvents f33925c;

    /* JADX INFO: renamed from: d */
    private C12894a f33926d;

    /* JADX INFO: renamed from: b */
    private void m35076b() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSDKResume");
            this.f33925c.resume();
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m35077c() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f33925c.bufferFinish();
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m35078d() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f33925c.bufferStart();
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m35079e() {
    }

    /* JADX INFO: renamed from: f */
    private void m35080f() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSdkClick");
            this.f33925c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m35081g() {
        if (this.f33923a != null) {
            try {
                C13219q0.m37816b("OMSDK_TAG", "onOMSdkDestory");
                this.f33923a.removeAllFriendlyObstructions();
                this.f33923a.finish();
                this.f33923a = null;
            } catch (Exception e) {
                C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35082h() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSdkPause");
            this.f33925c.pause();
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m35083i() {
    }

    /* JADX INFO: renamed from: j */
    private void m35084j() {
        if (this.f33925c == null) {
            return;
        }
        try {
            C13219q0.m37816b("OMSDK_TAG", "onOMSdkSkipped");
            this.f33925c.skipped();
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m35085k() {
        if (this.f33923a != null) {
            try {
                C13219q0.m37816b("OMSDK_TAG", "onOMSdkStart");
                this.f33923a.start();
                if (this.f33924b != null) {
                    this.f33924b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.f33924b.impressionOccurred();
                }
                C12894a c12894a = this.f33926d;
                if (c12894a != null && !c12894a.m36057d()) {
                    Object objM36051b = this.f33926d.m36051b("viewTag");
                    Object objM36051b2 = this.f33926d.m36051b("rootView");
                    if ((objM36051b instanceof String) && (objM36051b2 instanceof ViewGroup)) {
                        String strValueOf = String.valueOf(objM36051b);
                        ViewGroup viewGroup = (ViewGroup) objM36051b2;
                        this.f33923a.registerAdView(viewGroup.findViewWithTag(strValueOf));
                        Iterator<View> it = C12770c.m35201a(viewGroup, strValueOf).iterator();
                        while (it.hasNext()) {
                            this.f33923a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e) {
                C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35086a(String str, C12894a c12894a) {
        this.f33926d = c12894a;
        m35075a(str);
    }

    /* JADX INFO: renamed from: a */
    private void m35075a(String str) {
        if (this.f33926d == null) {
            return;
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "onDestroy":
                m35081g();
                break;
            case "PlayerPlayPlaying":
                m35076b();
                break;
            case "PlayerPlayPause":
                m35082h();
                break;
            case "PlayerPlayStart":
                m35085k();
                break;
            case "onAdClick":
                m35080f();
                break;
            case "onBufferingEnd":
                m35077c();
                break;
            case "onCreate":
                m35074a();
                break;
            case "PlayerPlayMuteChanged":
                m35079e();
                break;
            case "PlayerProgressChanged":
                m35083i();
                break;
            case "onBufferingStart":
                m35078d();
                break;
            case "skipped":
                m35084j();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35074a() {
        try {
            if (this.f33926d.m36050a((Object) "g0")) {
                Object objM36051b = this.f33926d.m36051b("g0");
                if (objM36051b instanceof C12894a) {
                    C12894a c12894a = (C12894a) objM36051b;
                    AdSession adSessionM38946a = C13439b.m38946a(C13008c.m36588n().m36542d(), false, String.valueOf(c12894a.m36051b(CampaignEx.KEY_OMID)), String.valueOf(c12894a.m36051b("requestId")), String.valueOf(c12894a.m36051b("id")), String.valueOf(c12894a.m36051b("campaignUnitId")), String.valueOf(c12894a.m36051b("videoURL")), String.valueOf(c12894a.m36051b("requestNoticeId")));
                    this.f33923a = adSessionM38946a;
                    if (adSessionM38946a != null) {
                        this.f33924b = AdEvents.createAdEvents(adSessionM38946a);
                        this.f33925c = MediaEvents.createMediaEvents(this.f33923a);
                    }
                }
            }
        } catch (Exception e) {
            C13219q0.m37817b("OmSdkKit", e.getMessage(), e);
        }
    }
}
