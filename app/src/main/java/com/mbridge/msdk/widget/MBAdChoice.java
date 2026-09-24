package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: loaded from: classes7.dex */
public class MBAdChoice extends MBImageView {

    /* JADX INFO: renamed from: c */
    private final Context f41166c;

    /* JADX INFO: renamed from: d */
    private String f41167d;

    /* JADX INFO: renamed from: e */
    private String f41168e;

    /* JADX INFO: renamed from: f */
    private String f41169f;

    /* JADX INFO: renamed from: g */
    private CampaignEx f41170g;

    /* JADX INFO: renamed from: h */
    private InterfaceC13083a f41171h;

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.MBAdChoice$a */
    class C14224a implements InterfaceC13083a {
        C14224a() {
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

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.MBAdChoice$b */
    class C14225b implements InterfaceC13101c {
        C14225b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.f41167d = "";
        this.f41168e = "";
        this.f41169f = "";
        this.f41166c = context;
        m42772b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41167d = "";
        this.f41168e = "";
        this.f41169f = "";
        this.f41166c = context;
        m42772b();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41167d = "";
        this.f41168e = "";
        this.f41169f = "";
        this.f41166c = context;
        m42772b();
    }

    /* JADX INFO: renamed from: a */
    private void m42769a() {
        if (this.f41166c != null) {
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f41167d, new C14225b());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42770a(CampaignEx campaignEx, C13635g c13635g) {
        this.f41170g = campaignEx;
        if (campaignEx == null) {
            if (c13635g != null) {
                this.f41167d = c13635g.m39470b();
                return;
            }
            return;
        }
        CampaignEx.C13064a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f41167d = adchoice.m36758g();
        }
        if (!TextUtils.isEmpty(this.f41167d) || c13635g == null) {
            return;
        }
        this.f41167d = c13635g.m39470b();
    }

    /* JADX INFO: renamed from: a */
    private boolean m42771a(CampaignEx campaignEx) {
        this.f41170g = campaignEx;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        m42774c(campaignEx, c13635gM39718d);
        m42770a(campaignEx, c13635gM39718d);
        m42773b(campaignEx, c13635gM39718d);
        boolean z = (TextUtils.isEmpty(this.f41167d) || TextUtils.isEmpty(this.f41168e) || TextUtils.isEmpty(this.f41169f)) ? false : true;
        setImageUrl(this.f41167d);
        return z;
    }

    /* JADX INFO: renamed from: b */
    private void m42772b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    /* JADX INFO: renamed from: b */
    private void m42773b(CampaignEx campaignEx, C13635g c13635g) {
        this.f41170g = campaignEx;
        if (campaignEx == null) {
            if (c13635g != null) {
                this.f41169f = c13635g.m39488d();
                return;
            }
            return;
        }
        CampaignEx.C13064a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f41169f = adchoice.m36762i();
        }
        if (!TextUtils.isEmpty(this.f41169f) || c13635g == null) {
            return;
        }
        this.f41169f = c13635g.m39488d();
    }

    /* JADX INFO: renamed from: c */
    private void m42774c(CampaignEx campaignEx, C13635g c13635g) {
        this.f41170g = campaignEx;
        if (campaignEx == null) {
            if (c13635g != null) {
                this.f41168e = c13635g.m39479c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.f41168e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.C13064a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.f41168e = adchoice.m36760h();
            }
            if (TextUtils.isEmpty(this.f41168e) && c13635g != null) {
                this.f41168e = c13635g.m39479c();
            }
            if (TextUtils.isEmpty(this.f41168e)) {
                this.f41168e = C13121d.m37226h().f36030g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f41171h == null) {
            this.f41171h = new C14224a();
        }
        C13229v0.m37895a(this.f41170g, this.f41171h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.f41170g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.f41170g = campaignEx;
        if (m42771a(campaignEx)) {
            m42769a();
        }
    }

    public void setFeedbackDialogEventListener(InterfaceC13083a interfaceC13083a) {
        this.f41171h = interfaceC13083a;
    }
}
