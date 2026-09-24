package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13954g;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a */
/* JADX INFO: compiled from: MOfferEnergize.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13965a {

    /* JADX INFO: renamed from: c */
    private static volatile C13965a f40008c;

    /* JADX INFO: renamed from: a */
    private Map<String, SoftReference<MOfferModel>> f40009a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private int f40010b = 500;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$a */
    /* JADX INFO: compiled from: MOfferEnergize.java */
    class a implements InterfaceC13954g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f40011a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MOfferModel f40012b;

        a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f40011a = viewGroup;
            this.f40012b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13954g
        /* JADX INFO: renamed from: a */
        public void mo41781a(int i, String str) {
            C13219q0.m37816b("MOfferEnergize", str);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13954g
        /* JADX INFO: renamed from: a */
        public void mo41782a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f40011a) == null) {
                return;
            }
            try {
                C13965a.this.m41793a(this.f40012b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e) {
                C13219q0.m37816b("MOfferEnergize", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$b */
    /* JADX INFO: compiled from: MOfferEnergize.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MOfferModel f40014a;

        b(MOfferModel mOfferModel) {
            this.f40014a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f40014a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$c */
    /* JADX INFO: compiled from: MOfferEnergize.java */
    class c implements InterfaceC13954g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MOfferModel f40016a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f40017b;

        c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f40016a = mOfferModel;
            this.f40017b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13954g
        /* JADX INFO: renamed from: a */
        public void mo41781a(int i, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13954g
        /* JADX INFO: renamed from: a */
        public void mo41782a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                C13965a.this.m41793a(this.f40016a, this.f40017b, viewGroup, campaignUnit);
            } catch (Exception e) {
                C13219q0.m37816b("MOfferEnergize", e.getMessage());
            }
        }
    }

    private C13965a() {
    }

    /* JADX INFO: renamed from: a */
    private int m41788a(String str) {
        return C13203i0.m37707a(C13008c.m36588n().m36542d(), str, "id");
    }

    /* JADX INFO: renamed from: a */
    public static C13965a m41789a() {
        C13965a c13965a;
        if (f40008c != null) {
            return f40008c;
        }
        synchronized (C13965a.class) {
            if (f40008c == null) {
                f40008c = new C13965a();
            }
            c13965a = f40008c;
        }
        return c13965a;
    }

    /* JADX INFO: renamed from: a */
    private void m41790a(ViewGroup viewGroup) {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = C13008c.m36588n().m36542d().getResources().getDrawable(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable != null && (viewFindViewById = viewGroup.findViewById(m41788a("mbridge_moreoffer_hls"))) != null) {
                    viewFindViewById.setBackground(drawable);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MOfferEnergize", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41791a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                RelativeLayout relativeLayout = ((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess() ? (RelativeLayout) viewGroup.findViewById(-1642631508) : (RelativeLayout) viewGroup.findViewById(m41788a("mbridge_native_ec_layout"));
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new C13975b().m41851a(arrayList, 0, C13229v0.m37876a(C13008c.m36588n().m36542d(), 100.0f), this.f40010b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(m41788a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 == null) {
                viewGroup.addView(viewGroup2);
            } else if (viewGroup.isShown()) {
                relativeLayout2.setVisibility(0);
                relativeLayout2.addView(viewGroup2);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX INFO: renamed from: a */
    private void m41792a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        int iM36778g;
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        if (mOfferModel != null) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() == null || mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() == null) {
                    iM36778g = 1;
                } else {
                    iM36778g = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().m36778g();
                    if (iM36778g == 0) {
                        iM36778g = C13211m0.m37728G(C13008c.m36588n().m36542d());
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            iM36778g = 1;
        }
        if (iM36778g != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
            ImageView imageView2 = ((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess() ? (ImageView) viewGroup.findViewById(-1803557032) : (ImageView) viewGroup.findViewById(m41788a("mbridge_iv_adbanner"));
            int iM37933h = C13229v0.m37933h(C13008c.m36588n().m36542d()) - C13229v0.m37876a(C13008c.m36588n().m36542d(), 220.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.height = iM37933h;
            layoutParams.width = (iM37933h * 16) / 9;
            imageView2.setLayoutParams(layoutParams);
        }
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                imageView = (ImageView) viewGroup.findViewById(389008949);
                textView = (TextView) viewGroup.findViewById(1561614848);
            } else {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(m41788a("mbridge_native_ec_layout"));
                imageView = (ImageView) viewGroup.findViewById(m41788a("mbridge_iv_flag"));
                textView = (TextView) viewGroup.findViewById(m41788a("mbridge_tv_flag"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(imageView);
            arrayList.add(textView);
            new C13975b().m41851a(arrayList, 0, C13229v0.m37876a(C13008c.m36588n().m36542d(), 100.0f), this.f40010b);
        } else {
            relativeLayout = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, 0);
        viewGroup2.setLayoutParams(layoutParams2);
        if (relativeLayout != null) {
            relativeLayout.addView(viewGroup2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41793a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f);
        layoutParams.setMargins(iM37876a, iM37876a, iM37876a, iM37876a);
        m41790a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            m41792a(mOfferModel, viewGroup, viewGroup2);
        } else {
            m41791a(viewGroup, viewGroup2);
        }
        new C13975b().m41849a(viewGroup2, 0, C13229v0.m37930g(C13008c.m36588n().m36542d()), 0, C13229v0.m37876a(C13008c.m36588n().m36542d(), 100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.f40010b + 500);
    }

    /* JADX INFO: renamed from: a */
    private void m41794a(MOfferModel mOfferModel, ViewGroup viewGroup, InterfaceC14058a interfaceC14058a) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new a(viewGroup, mOfferModel), interfaceC14058a);
        mOfferModel.showView();
    }

    /* JADX INFO: renamed from: a */
    public void m41796a(ViewGroup viewGroup, String str, InterfaceC14058a interfaceC14058a) {
        if (viewGroup == null || interfaceC14058a == null || this.f40009a == null || TextUtils.isEmpty(str) || !this.f40009a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f40009a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        m41794a(mOfferModel, viewGroup, interfaceC14058a);
    }

    /* JADX INFO: renamed from: a */
    public void m41797a(CampaignEx campaignEx, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f40009a == null) {
            this.f40009a = new ConcurrentHashMap();
        }
        if (this.f40009a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f40009a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41798a(CampaignEx campaignEx, ViewGroup viewGroup, InterfaceC14058a interfaceC14058a, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f40009a == null) {
            this.f40009a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f40009a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), interfaceC14058a);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41799b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f40009a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f40009a.clear();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m41800b(String str) {
        if (this.f40009a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f40009a.containsKey(str);
    }
}
