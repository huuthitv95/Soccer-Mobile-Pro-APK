package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13941b;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.wrapper.C13987c;
import com.mbridge.msdk.video.module.listener.impl.C14063e;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    public InterfaceC13994f ctaClickCallBack;

    /* JADX INFO: renamed from: m */
    private ViewGroup f40213m;

    /* JADX INFO: renamed from: n */
    private ImageView f40214n;

    /* JADX INFO: renamed from: o */
    private TextView f40215o;

    /* JADX INFO: renamed from: p */
    private TextView f40216p;

    /* JADX INFO: renamed from: q */
    private String f40217q;

    /* JADX INFO: renamed from: r */
    private float f40218r;

    /* JADX INFO: renamed from: s */
    private float f40219s;

    /* JADX INFO: renamed from: t */
    private int f40220t;

    /* JADX INFO: renamed from: u */
    private ObjectAnimator f40221u;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$a */
    class C13989a implements InterfaceC13955h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f40222a;

        C13989a(ViewGroup viewGroup) {
            this.f40222a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41638a(C13940a c13940a) {
            if (c13940a != null) {
                this.f40222a.addView(c13940a.m41699b());
                MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                mBridgeClickCTAView.f40205e = mBridgeClickCTAView.m41950h();
                MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                mBridgeClickCTAView2.f40216p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                MBridgeClickCTAView.this.mo41941d();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41639a(EnumC13946a enumC13946a) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "errorMsg:" + enumC13946a.m41772h());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$b */
    class C13990b extends AbstractViewOnClickListenerC14227a {
        C13990b() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.m41947e();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$c */
    class C13991c extends AbstractViewOnClickListenerC14227a {
        C13991c() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.m41947e();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$d */
    class ViewOnClickListenerC13992d implements View.OnClickListener {
        ViewOnClickListenerC13992d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$e */
    class C13993e extends C14063e {
        C13993e(ImageView imageView, CampaignEx campaignEx, String str) {
            super(imageView, campaignEx, str);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.C14063e, com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            super.onFailedLoad(str, str2);
            MBridgeClickCTAView.this.m41949g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickCTAView$f */
    public interface InterfaceC13994f {
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m41943a(ViewGroup viewGroup, CampaignEx campaignEx) {
        C13941b.m41701a().m41703a(new C13987c().m41935a(viewGroup, campaignEx), new C13989a(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m41947e() {
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.C13066c rewardTemplateMode = this.f40202b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.m36782k() + "";
                }
                C13148j.m37386a(C13008c.m36588n().m36542d(), "cta_click", this.f40202b.getCampaignUnitId(), this.f40202b.isBidCampaign(), this.f40202b.getRequestId(), this.f40202b.getRequestIdNotice(), this.f40202b.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C13088a.f35868j, m41939a(0));
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
        this.f40202b.setTriggerClickSource(1);
        this.f40202b.setClickTempSource(1);
        this.notifyListener.mo41600a(105, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    private void m41948f() {
        int iFindLayout = findLayout("mbridge_reward_clickable_cta");
        if (C13203i0.m37709a(iFindLayout)) {
            this.f40203c.inflate(iFindLayout, this);
            this.f40205e = m41950h();
            mo41941d();
            m41951i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m41949g() {
        ImageView imageView = this.f40214n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m41950h() {
        this.f40213m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f40214n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f40215o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f40213m, this.f40214n, this.f40215o, textView);
    }

    /* JADX INFO: renamed from: i */
    private void m41951i() {
        setWrapContent();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        super.mo41941d();
        if (this.f40205e) {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                C13185b1.m37632a(this, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                setOnClickListener(new C13990b());
            }
            CampaignEx campaignEx2 = this.f40202b;
            if (campaignEx2 != null) {
                C13185b1.m37632a(this.ctaTv, campaignEx2.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            }
            this.ctaTv.setOnClickListener(new C13991c());
            ImageView imageView = this.f40214n;
            if (imageView != null) {
                imageView.setOnClickListener(new ViewOnClickListenerC13992d());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f40221u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f40221u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f40218r = motionEvent.getRawX();
        this.f40219s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f40220t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(C14177b c14177b) {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                m41943a(this, this.f40202b);
            } else {
                m41948f();
            }
            if (this.f40205e) {
                if (C13884b.m41421a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f40202b.getAdCall());
                if (TextUtils.isEmpty(this.f40202b.getIconUrl())) {
                    m41949g();
                } else {
                    C13100b.m37152a(this.f40201a.getApplicationContext()).m37155a(this.f40202b.getIconUrl(), new C13993e(this.f40214n, this.f40202b, this.f40217q));
                }
                if (this.f40215o != null && !TextUtils.isEmpty(this.f40202b.getAppName())) {
                    this.f40215o.setText(this.f40202b.getAppName());
                }
                if (this.f40216p == null || TextUtils.isEmpty(this.f40202b.getAppDesc())) {
                    return;
                }
                this.f40216p.setText(this.f40202b.getAppDesc());
            }
        }
    }

    public void setCtaClickCallBack(InterfaceC13994f interfaceC13994f) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f40221u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f40217q = str;
    }
}
