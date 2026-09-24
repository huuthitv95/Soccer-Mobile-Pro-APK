package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.common.C0684C;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.shake.AbstractC13648b;
import com.mbridge.msdk.shake.C13647a;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.dynview.C13940a;
import com.mbridge.msdk.video.dynview.C13941b;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13955h;
import com.mbridge.msdk.video.dynview.moffer.C13965a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.wrapper.C13987c;
import com.mbridge.msdk.video.module.listener.impl.C14068j;
import com.mbridge.msdk.video.module.report.C14074a;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {

    /* JADX INFO: renamed from: A */
    private LinearLayout f40317A;

    /* JADX INFO: renamed from: B */
    private Runnable f40318B;

    /* JADX INFO: renamed from: C */
    private Runnable f40319C;

    /* JADX INFO: renamed from: D */
    private RelativeLayout f40320D;

    /* JADX INFO: renamed from: E */
    private C14177b f40321E;

    /* JADX INFO: renamed from: F */
    private boolean f40322F;

    /* JADX INFO: renamed from: G */
    private boolean f40323G;

    /* JADX INFO: renamed from: H */
    private boolean f40324H;

    /* JADX INFO: renamed from: I */
    private boolean f40325I;

    /* JADX INFO: renamed from: J */
    private int f40326J;

    /* JADX INFO: renamed from: K */
    private AlphaAnimation f40327K;

    /* JADX INFO: renamed from: L */
    private int f40328L;

    /* JADX INFO: renamed from: M */
    private int f40329M;

    /* JADX INFO: renamed from: N */
    private int f40330N;

    /* JADX INFO: renamed from: O */
    private int f40331O;

    /* JADX INFO: renamed from: P */
    private Bitmap f40332P;

    /* JADX INFO: renamed from: Q */
    private View f40333Q;

    /* JADX INFO: renamed from: R */
    private FeedBackButton f40334R;

    /* JADX INFO: renamed from: S */
    private String f40335S;

    /* JADX INFO: renamed from: T */
    private CampaignUnit f40336T;

    /* JADX INFO: renamed from: U */
    private MBShakeView f40337U;

    /* JADX INFO: renamed from: V */
    private AbstractC13648b f40338V;

    /* JADX INFO: renamed from: W */
    private MBridgeBaitClickView f40339W;

    /* JADX INFO: renamed from: a0 */
    private boolean f40340a0;

    /* JADX INFO: renamed from: b0 */
    private int f40341b0;

    /* JADX INFO: renamed from: c0 */
    private String f40342c0;

    /* JADX INFO: renamed from: m */
    private ViewGroup f40343m;

    /* JADX INFO: renamed from: n */
    private ViewGroup f40344n;

    /* JADX INFO: renamed from: o */
    private RelativeLayout f40345o;

    /* JADX INFO: renamed from: p */
    private ImageView f40346p;

    /* JADX INFO: renamed from: q */
    private ImageView f40347q;

    /* JADX INFO: renamed from: r */
    private ImageView f40348r;

    /* JADX INFO: renamed from: s */
    private ImageView f40349s;

    /* JADX INFO: renamed from: t */
    private TextView f40350t;

    /* JADX INFO: renamed from: u */
    private ImageView f40351u;

    /* JADX INFO: renamed from: v */
    private ImageView f40352v;

    /* JADX INFO: renamed from: w */
    private TextView f40353w;

    /* JADX INFO: renamed from: x */
    private TextView f40354x;

    /* JADX INFO: renamed from: y */
    private TextView f40355y;

    /* JADX INFO: renamed from: z */
    private LinearLayout f40356z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$a */
    class C14013a extends AbstractViewOnClickListenerC14227a {
        C14013a() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!C13884b.m41421a()) {
                    MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.m42013c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.m42013c(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$b */
    class RunnableC14014b implements Runnable {
        RunnableC14014b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeNativeEndCardView.this.f40320D != null) {
                CampaignEx campaignEx = MBridgeNativeEndCardView.this.f40202b;
                if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f40202b.getAdSpaceT() != 2) {
                    MBridgeNativeEndCardView.this.f40320D.setPadding(MBridgeNativeEndCardView.this.f40328L, MBridgeNativeEndCardView.this.f40330N, MBridgeNativeEndCardView.this.f40329M, MBridgeNativeEndCardView.this.f40331O);
                    MBridgeNativeEndCardView.this.f40320D.startAnimation(MBridgeNativeEndCardView.this.f40327K);
                }
                MBridgeNativeEndCardView.this.f40320D.setVisibility(0);
            }
            if (MBridgeNativeEndCardView.this.f40333Q != null && MBridgeNativeEndCardView.this.f40333Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.f40323G) {
                MBridgeNativeEndCardView.this.f40333Q.setVisibility(0);
            }
            MBridgeNativeEndCardView.this.m42019f();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$c */
    class C14015c implements InterfaceC13083a {
        C14015c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            MBridgeNativeEndCardView.this.f40325I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            MBridgeNativeEndCardView.this.f40325I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            MBridgeNativeEndCardView.this.f40325I = false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$d */
    class ViewOnClickListenerC14016d implements View.OnClickListener {
        ViewOnClickListenerC14016d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.m42013c(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$e */
    class C14017e extends AbstractC13648b {
        C14017e(int i, int i2) {
            super(i, i2);
        }

        @Override // com.mbridge.msdk.shake.AbstractC13648b
        /* JADX INFO: renamed from: a */
        public void mo36324a() {
            if ((C13884b.m41421a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.f40325I || !MBridgeNativeEndCardView.this.f40324H) {
                return;
            }
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.f40206f = 0.0f;
            mBridgeNativeEndCardView.f40207g = 0.0f;
            mBridgeNativeEndCardView.f40202b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.m42013c(4);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$f */
    class ViewOnClickListenerC14018f implements View.OnClickListener {
        ViewOnClickListenerC14018f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.m42013c(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$g */
    class RunnableC14019g implements Runnable {
        RunnableC14019g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f40202b.setClickType(1);
            MBridgeNativeEndCardView.this.m42013c(2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$h */
    class RunnableC14020h implements Runnable {
        RunnableC14020h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f40202b.setClickType(1);
            MBridgeNativeEndCardView.this.m42013c(2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$i */
    class RunnableC14021i implements Runnable {
        RunnableC14021i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f40323G = true;
            if (MBridgeNativeEndCardView.this.f40333Q != null) {
                MBridgeNativeEndCardView.this.f40333Q.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$j */
    class C14022j implements InterfaceC13955h {
        C14022j() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41638a(C13940a c13940a) {
            if (c13940a != null) {
                MBridgeNativeEndCardView.this.addView(c13940a.m41699b());
                MBridgeNativeEndCardView.this.f40340a0 = c13940a.m41700c();
                if (MBridgeNativeEndCardView.this.ctaViewCanGet(c13940a.m41699b(), MBridgeNativeEndCardView.this.f40340a0)) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView.f40205e = mBridgeNativeEndCardView.m42003a(c13940a.m41699b());
                    MBridgeNativeEndCardView.this.m42030l();
                } else {
                    MBridgeNativeEndCardView.this.f40340a0 = false;
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f40208h = false;
                    mBridgeNativeEndCardView2.m42027j();
                }
                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                CampaignEx campaignEx = mBridgeNativeEndCardView3.f40202b;
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.f40340a0);
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13955h
        /* JADX INFO: renamed from: a */
        public void mo41639a(EnumC13946a enumC13946a) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "errorMsg:" + enumC13946a.m41772h());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$k */
    class C14023k implements InterfaceC13101c {
        C14023k() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (MBridgeNativeEndCardView.this.f40347q != null) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    if (mBridgeNativeEndCardView.f40208h) {
                        mBridgeNativeEndCardView.f40347q.setBackground(null);
                    }
                    MBridgeNativeEndCardView.this.f40347q.setImageBitmap(bitmap);
                }
                MBridgeNativeEndCardView.this.setBannerBackGroundBlurBimap(bitmap);
            } catch (Throwable unused) {
                if (MBridgeNativeEndCardView.this.f40346p != null) {
                    MBridgeNativeEndCardView.this.f40346p.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$l */
    class C14024l implements InterfaceC13083a {
        C14024l() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            MBridgeNativeEndCardView.this.f40325I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            MBridgeNativeEndCardView.this.f40325I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            MBridgeNativeEndCardView.this.f40325I = false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$m */
    class RunnableC14025m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f40369a;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$m$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                if (mBridgeNativeEndCardView.f40208h) {
                    mBridgeNativeEndCardView.f40346p.setBackground(null);
                }
                C13219q0.m37816b("async", "执行异步加载图");
                MBridgeNativeEndCardView.this.f40346p.setImageBitmap(MBridgeNativeEndCardView.this.f40332P);
            }
        }

        RunnableC14025m(Bitmap bitmap) {
            this.f40369a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.f40332P = mBridgeNativeEndCardView.blurBitmap(this.f40369a);
            if (MBridgeNativeEndCardView.this.f40332P == null || MBridgeNativeEndCardView.this.f40332P.isRecycled() || MBridgeNativeEndCardView.this.f40346p == null) {
                return;
            }
            MBridgeNativeEndCardView.this.f40346p.post(new a());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$n */
    class ViewOnClickListenerC14026n implements View.OnClickListener {
        ViewOnClickListenerC14026n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.f40322F) {
                MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
                MBridgeNativeEndCardView.this.m42013c(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$o */
    class ViewOnClickListenerC14027o implements View.OnClickListener {
        ViewOnClickListenerC14027o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.f40208h) {
                try {
                    C13965a.m41789a().m41799b();
                } catch (Exception e) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                }
                try {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f40202b;
                    if (campaignEx != null) {
                        String strM37645a = C13188c1.m37645a(campaignEx.getendcard_url(), "ecid");
                        String strM37645a2 = C13188c1.m37645a(MBridgeNativeEndCardView.this.f40202b.getendcard_url(), "mof");
                        C13157e c13157e = new C13157e();
                        c13157e.m37501a("type", "choseFromTwoClose");
                        c13157e.m37501a("endcard_id", strM37645a);
                        c13157e.m37501a("mof", strM37645a2);
                        C14074a.m42193a("2000103", MBridgeNativeEndCardView.this.f40202b, c13157e);
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
            try {
                C13157e c13157e2 = new C13157e();
                c13157e2.m37501a("type", 2);
                C13156d.m37475b().m37486a("2000152", c13157e2);
                C13156d.m37475b().m37482a("2000134", MBridgeNativeEndCardView.this.f40202b);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
            MBridgeNativeEndCardView.this.notifyListener.mo41600a(104, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$p */
    class C14028p extends AbstractViewOnClickListenerC14227a {
        C14028p() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(1);
            MBridgeNativeEndCardView.this.m42013c(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeNativeEndCardView$q */
    class C14029q extends AbstractViewOnClickListenerC14227a {
        C14029q() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!C13884b.m41421a()) {
                    MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.m42013c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f40202b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.m42013c(0);
                }
            }
        }
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.f40322F = false;
        this.f40323G = false;
        this.f40324H = false;
        this.f40325I = false;
        this.f40326J = 0;
        this.f40340a0 = false;
        this.f40341b0 = 1;
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40322F = false;
        this.f40323G = false;
        this.f40324H = false;
        this.f40325I = false;
        this.f40326J = 0;
        this.f40340a0 = false;
        this.f40341b0 = 1;
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet, z, i, z2, i2, i3);
        this.f40322F = false;
        this.f40323G = false;
        this.f40324H = false;
        this.f40325I = false;
        this.f40326J = 0;
        this.f40340a0 = false;
        this.f40341b0 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m42003a(View view) {
        try {
            this.f40345o = (RelativeLayout) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_native_ec_layout"));
            this.f40347q = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_adbanner"));
            this.f40348r = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_icon"));
            this.f40349s = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_flag"));
            this.f40350t = (TextView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_tv_flag"));
            this.f40351u = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_logo"));
            this.f40352v = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_link"));
            this.f40353w = (TextView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_tv_apptitle"));
            this.f40356z = (LinearLayout) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_sv_starlevel"));
            this.f40317A = (LinearLayout) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_sv_heat_count_level"));
            this.f40333Q = view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_tv_cta"));
            this.f40334R = (FeedBackButton) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_native_endcard_feed_btn"));
            this.f40320D = (RelativeLayout) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_native_ec_controller"));
            this.f40346p = (ImageView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_iv_adbanner_bg"));
            this.f40339W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f40340a0, "mbridge_animation_click_view"));
            this.f40354x = (TextView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_tv_appdesc"));
            if (!this.f40208h) {
                TextView textView = (TextView) view.findViewById(filterFindViewId(this.f40340a0, "mbridge_tv_number"));
                this.f40355y = textView;
                return isNotNULL(this.f40347q, this.f40348r, this.f40353w, this.f40354x, textView, this.f40356z, this.f40333Q, this.ctaView);
            }
            ImageView imageView = this.f40347q;
            if (imageView != null && (imageView instanceof RoundImageView)) {
                ((RoundImageView) imageView).setBorderRadius(10);
            }
            ImageView imageView2 = this.f40348r;
            if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                ((RoundImageView) imageView2).setBorderRadius(10);
            }
            return isNotNULL(this.f40347q, this.f40348r, this.f40353w, this.f40356z, this.f40333Q, this.ctaView);
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42008b(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f40321E);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            m42003a(view);
            mo41941d();
        }
        m42036o();
    }

    /* JADX INFO: renamed from: b */
    private boolean m42010b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f40203c.inflate(i, (ViewGroup) null);
            this.f40344n = viewGroup;
            addView(viewGroup);
            return m42003a(this.f40344n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f40203c.inflate(i, (ViewGroup) null);
        this.f40343m = viewGroup2;
        addView(viewGroup2);
        return m42003a(this.f40343m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m42013c(int i) {
        JSONException jSONException;
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.C13066c rewardTemplateMode = this.f40202b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.m36782k() + "";
                }
                C13148j.m37386a(C13008c.m36588n().m36542d(), "end_card_click", this.f40202b.getCampaignUnitId(), this.f40202b.isBidCampaign(), this.f40202b.getRequestId(), this.f40202b.getRequestIdNotice(), this.f40202b.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C13088a.f35868j, m41939a(i));
                if (this.f40202b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e2) {
                jSONException = e2;
                jSONException.printStackTrace();
            }
        } catch (JSONException e3) {
            jSONException = e3;
            jSONObject = null;
        }
        this.f40202b.setClickTempSource(2);
        this.notifyListener.mo41600a(105, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    private void m42017e() {
        int i;
        MBridgeBaitClickView mBridgeBaitClickView;
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f40202b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f40202b.getEndScreenUrl();
                }
                String strM37645a = C13188c1.m37645a(endScreenUrl, "bait_click");
                try {
                    i = Integer.parseInt(strM37645a);
                } catch (Throwable th) {
                    C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                    i = 1;
                }
                if (TextUtils.isEmpty(strM37645a) || i == 0 || (mBridgeBaitClickView = this.f40339W) == null) {
                    return;
                }
                mBridgeBaitClickView.setVisibility(0);
                this.f40339W.init(C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN, i);
                if (this.f40202b.getEcTemplateId() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN);
                    gradientDrawable.setStroke(0, SupportMenu.CATEGORY_MASK);
                    gradientDrawable.setCornerRadius(25.0f);
                    this.f40339W.setBackground(gradientDrawable);
                }
                this.f40339W.startAnimation();
                C13185b1.m37632a(this.f40339W, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                this.f40339W.setOnClickListener(new ViewOnClickListenerC14018f());
            }
        } catch (Throwable th2) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m42019f() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f40335S);
            C13084b.m37036b().m37046a(this.f40335S + "_2", this.f40202b);
        }
        if (!C13084b.m37036b().m37050a()) {
            FeedBackButton feedBackButton = this.f40334R;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        C13084b.m37036b().m37047a(this.f40335S + "_2", new C14015c());
        C13084b.m37036b().m37054d(this.f40335S + "_1");
        if (this.f40334R != null) {
            C13084b.m37036b().m37048a(this.f40335S + "_2", this.f40334R);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m42021g() {
        int i;
        int i2;
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f40202b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f40202b.getEndScreenUrl();
                }
                String strM37645a = C13188c1.m37645a(endScreenUrl, "shake_show");
                String strM37645a2 = C13188c1.m37645a(endScreenUrl, "shake_strength");
                String strM37645a3 = C13188c1.m37645a(endScreenUrl, "shake_time");
                if (!TextUtils.isEmpty(strM37645a) && strM37645a.equals("1") && this.f40337U == null) {
                    MBridgeBaitClickView mBridgeBaitClickView = this.f40339W;
                    if (mBridgeBaitClickView != null) {
                        mBridgeBaitClickView.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.f40337U = mBShakeView;
                    mBShakeView.initView(this.f40202b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f40340a0, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.f40337U.setPadding(0, 0, 0, C13229v0.m37876a(getContext(), 20.0f));
                    }
                    this.f40337U.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f40345o;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f40345o.addView(this.f40337U);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        C13185b1.m37632a(this.f40337U, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                        this.f40337U.setOnClickListener(new ViewOnClickListenerC14016d());
                        int i3 = 10;
                        if (!TextUtils.isEmpty(strM37645a2) && (i2 = Integer.parseInt(strM37645a2)) > 0) {
                            i3 = i2;
                        }
                        int i4 = 5000;
                        if (!TextUtils.isEmpty(strM37645a3) && (i = Integer.parseInt(strM37645a3)) > 0) {
                            i4 = i * 1000;
                        }
                        this.f40338V = new C14017e(i3, i4);
                        C13647a.m39776a().m39778a(this.f40338V);
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m42023h() {
        C13100b.m37152a(this.f40201a.getApplicationContext()).m37155a(this.f40202b.getImageUrl(), new C14023k());
        C13100b.m37152a(this.f40201a.getApplicationContext()).m37155a(this.f40202b.getIconUrl(), new C14068j(this.f40348r, C13229v0.m37876a(C13008c.m36588n().m36542d(), 8.0f)));
        this.f40353w.setText(this.f40202b.getAppName());
        TextView textView = this.ctaView;
        if (textView != null) {
            textView.setText(this.f40202b.getAdCall());
        }
        TextView textView2 = this.f40354x;
        if (textView2 != null) {
            textView2.setText(this.f40202b.getAppDesc());
        }
        TextView textView3 = this.f40355y;
        if (textView3 != null) {
            textView3.setText(this.f40202b.getNumberRating() + ")");
        }
        this.f40356z.removeAllViews();
        double rating = this.f40202b.getRating();
        if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            rating = 5.0d;
        }
        LinearLayout linearLayout = this.f40356z;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(rating);
        }
        LinearLayout linearLayout2 = this.f40356z;
        if (linearLayout2 instanceof MBridgeLevelLayoutView) {
            ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f40202b.getNumberRating());
        }
        LinearLayout linearLayout3 = this.f40356z;
        if (linearLayout3 instanceof MBStarLevelLayoutView) {
            ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
        }
        LinearLayout linearLayout4 = this.f40317A;
        if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
            ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f40202b.getNumberRating());
        }
        if (!TextUtils.isEmpty(this.f40202b.getendcard_url()) && this.f40202b.getendcard_url().contains("alecfc=1")) {
            this.f40322F = true;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f40349s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", C13008c.m36588n().m36550i())));
            this.f40342c0 = "AD";
        } else {
            this.f40349s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", C13008c.m36588n().m36550i())));
            this.f40342c0 = "广告";
        }
        if (this.f40341b0 == 0) {
            ImageView imageView = this.f40349s;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ImageView imageView2 = this.f40351u;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView4 = this.f40350t;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f40350t.setText(this.f40342c0);
            }
        }
        C13229v0.m37892a(2, this.f40352v, this.f40202b, this.f40201a, true, new C14024l());
        if (this.f40323G) {
            return;
        }
        this.f40333Q.setVisibility(8);
    }

    /* JADX INFO: renamed from: i */
    private void m42025i() throws Throwable {
        C13942c c13942cM41933a = new C13987c().m41933a(getContext(), this.f40202b, this.f40209i, C13884b.m41421a() ? "cn_" : "en_");
        this.f40341b0 = c13942cM41933a.m41719o();
        C13941b.m41701a().m41703a(c13942cM41933a, new C14022j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m42027j() {
        int iM42028k = m42028k();
        if (C13203i0.m37709a(iM42028k)) {
            this.f40205e = m42010b(iM42028k);
            m42030l();
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[PHI: r3
  0x0033: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:21:0x002a, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k */
    private int m42028k() {
        int i = this.f40211k;
        String str = "mbridge_reward_endcard_native_half_landscape";
        String str2 = "mbridge_reward_endcard_native_half_portrait";
        if (i == 0) {
            str2 = this.f40210j ? "mbridge_reward_endcard_native_half_portrait" : "mbridge_reward_endcard_native_hor";
            if (!isLandscape()) {
                str = str2;
            } else if (!this.f40210j) {
                str = "mbridge_reward_endcard_native_land";
            }
        } else {
            if (i != 1) {
                str2 = "";
            } else if (!this.f40210j) {
                str2 = "mbridge_reward_endcard_native_hor";
            }
            if (i != 2) {
                str = str2;
            } else if (!this.f40210j) {
                str = "mbridge_reward_endcard_native_land";
            }
        }
        return findLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m42030l() {
        mo41941d();
        if (!this.f40205e) {
            this.notifyListener.mo41600a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f40327K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: renamed from: m */
    private void m42032m() {
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f40202b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f40202b.getEndScreenUrl();
                }
                String strM37645a = C13188c1.m37645a(endScreenUrl, "alac");
                if (!TextUtils.isEmpty(strM37645a) && strM37645a.equals("1") && this.f40202b.getAutoShowStoreMiniCard() != 1) {
                    postDelayed(new RunnableC14019g(), 1000L);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    private void m42034n() {
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.f40202b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.f40202b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.f40319C == null) {
                    this.f40319C = new RunnableC14020h();
                }
                postDelayed(this.f40319C, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o */
    private void m42036o() {
        RelativeLayout relativeLayout;
        if (!this.f40205e || (relativeLayout = this.f40320D) == null) {
            return;
        }
        relativeLayout.postDelayed(new RunnableC14014b(), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerBackGroundBlurBimap(Bitmap bitmap) {
        try {
            C13167a.m37542a().execute(new RunnableC14025m(bitmap));
        } catch (Exception e) {
            C13219q0.m37813a(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f40201a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.f40333Q;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView() || (campaignUnit = this.f40336T) == null || campaignUnit.getAds() == null || this.f40336T.getAds().size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f40336T.getAds()) {
            if (!TextUtils.isEmpty(campaignEx2.getIconUrl())) {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37154a(campaignEx2.getIconUrl());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        if (this.f40205e) {
            C13185b1.m37632a(this.f40345o, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            this.f40345o.setOnClickListener(new ViewOnClickListenerC14026n());
            this.f40333Q.setOnClickListener(new ViewOnClickListenerC14027o());
            TextView textView = this.ctaView;
            if (textView != null) {
                C13185b1.m37632a(textView, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                this.ctaView.setOnClickListener(new C14028p());
            }
            C13185b1.m37632a(this.f40348r, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            this.f40348r.setOnClickListener(new C14029q());
            C13185b1.m37632a(this.f40347q, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            this.f40347q.setOnClickListener(new C14013a());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f40340a0;
    }

    public void notifyShowListener() {
        this.notifyListener.mo41600a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40318B == null) {
            this.f40318B = new RunnableC14021i();
        }
        Runnable runnable = this.f40318B;
        if (runnable != null) {
            postDelayed(runnable, this.f40326J * 1000);
            if (!this.f40324H) {
                this.f40324H = true;
            }
            m42032m();
        }
        m42017e();
        m42021g();
        m42034n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f40318B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f40319C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.f40338V != null) {
            C13647a.m39776a().m39780b(this.f40338V);
            this.f40338V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            RelativeLayout relativeLayout = this.f40320D;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i = configuration.orientation;
            this.f40204d = i;
            if (i == 2) {
                removeView(this.f40343m);
                m42008b(this.f40344n);
            } else {
                removeView(this.f40344n);
                m42008b(this.f40343m);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff
    public void preLoadData(C14177b c14177b) {
        this.f40321E = c14177b;
        try {
            if (this.f40202b == null || !this.f40205e) {
                return;
            }
            m42023h();
        } catch (Throwable th) {
            C13219q0.m37813a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f40327K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f40318B = null;
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setCloseBtnDelay(int i) {
        this.f40326J = i;
    }

    public void setLayout() {
        if (this.f40208h) {
            m42025i();
        } else {
            m42027j();
        }
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            return;
        }
        this.f40336T = campaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null || this.f40336T.getAds().size() <= 5 || (mBShakeView = this.f40337U) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, C13229v0.m37876a(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        C13219q0.m37816b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.f40328L = i;
        this.f40329M = i2;
        this.f40330N = i3;
        this.f40331O = i4;
        m42036o();
    }

    public void setOnPause() {
        this.f40324H = false;
    }

    public void setOnResume() {
        this.f40324H = true;
    }

    public void setUnitId(String str) {
        this.f40335S = str;
    }
}
