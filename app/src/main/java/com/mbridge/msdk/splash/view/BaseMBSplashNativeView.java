package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13217p0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.shake.AbstractC13648b;
import com.mbridge.msdk.shake.C13647a;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.common.C13651c;
import com.mbridge.msdk.splash.common.util.C13652a;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* JADX INFO: loaded from: classes7.dex */
public class BaseMBSplashNativeView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    private int f38408A;

    /* JADX INFO: renamed from: B */
    private int f38409B;

    /* JADX INFO: renamed from: C */
    private int f38410C;

    /* JADX INFO: renamed from: D */
    private float f38411D;

    /* JADX INFO: renamed from: E */
    private float f38412E;

    /* JADX INFO: renamed from: F */
    private boolean f38413F;

    /* JADX INFO: renamed from: G */
    private boolean f38414G;

    /* JADX INFO: renamed from: H */
    protected boolean f38415H;

    /* JADX INFO: renamed from: I */
    protected boolean f38416I;

    /* JADX INFO: renamed from: J */
    protected boolean f38417J;

    /* JADX INFO: renamed from: K */
    protected String f38418K;

    /* JADX INFO: renamed from: L */
    private String f38419L;

    /* JADX INFO: renamed from: M */
    protected MBSplashView f38420M;

    /* JADX INFO: renamed from: N */
    protected CampaignEx f38421N;

    /* JADX INFO: renamed from: O */
    protected MBShakeView f38422O;

    /* JADX INFO: renamed from: P */
    private String f38423P;

    /* JADX INFO: renamed from: Q */
    private String f38424Q;

    /* JADX INFO: renamed from: R */
    private String f38425R;

    /* JADX INFO: renamed from: S */
    protected AbstractC13648b f38426S;

    /* JADX INFO: renamed from: a */
    private MBNoRecycledCrashImageView f38427a;

    /* JADX INFO: renamed from: b */
    private MBNoRecycledCrashImageView f38428b;

    /* JADX INFO: renamed from: c */
    private RelativeLayout f38429c;

    /* JADX INFO: renamed from: d */
    private ImageView f38430d;

    /* JADX INFO: renamed from: e */
    private FeedBackButton f38431e;

    /* JADX INFO: renamed from: f */
    protected TextView f38432f;

    /* JADX INFO: renamed from: g */
    private RelativeLayout f38433g;

    /* JADX INFO: renamed from: h */
    private MBNoRecycledCrashImageView f38434h;

    /* JADX INFO: renamed from: i */
    private TextView f38435i;

    /* JADX INFO: renamed from: j */
    private MBNoRecycledCrashImageView f38436j;

    /* JADX INFO: renamed from: k */
    private TextView f38437k;

    /* JADX INFO: renamed from: l */
    private TextView f38438l;

    /* JADX INFO: renamed from: m */
    protected RelativeLayout f38439m;

    /* JADX INFO: renamed from: n */
    protected TextView f38440n;

    /* JADX INFO: renamed from: o */
    protected TextView f38441o;

    /* JADX INFO: renamed from: p */
    protected TextView f38442p;

    /* JADX INFO: renamed from: q */
    protected TextView f38443q;

    /* JADX INFO: renamed from: r */
    protected MBSplashClickView f38444r;

    /* JADX INFO: renamed from: s */
    protected int f38445s;

    /* JADX INFO: renamed from: t */
    private int f38446t;

    /* JADX INFO: renamed from: u */
    private int f38447u;

    /* JADX INFO: renamed from: v */
    private int f38448v;

    /* JADX INFO: renamed from: w */
    protected int f38449w;

    /* JADX INFO: renamed from: x */
    protected int f38450x;

    /* JADX INFO: renamed from: y */
    protected int f38451y;

    /* JADX INFO: renamed from: z */
    protected int f38452z;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$a */
    class C13680a implements InterfaceC13101c {
        C13680a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseMBSplashNativeView.this.f38414G = true;
                        BaseMBSplashNativeView.this.f38433g.setVisibility(4);
                        BaseMBSplashNativeView.this.f38428b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f38428b.setImageBitmap(bitmap);
                    } else if (BaseMBSplashNativeView.this.f38408A == 1) {
                        BaseMBSplashNativeView.this.f38433g.setVisibility(0);
                        try {
                            Bitmap bitmapM37810a = C13217p0.m37810a(bitmap, 1, C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f));
                            if (bitmapM37810a != null && !bitmapM37810a.isRecycled()) {
                                BaseMBSplashNativeView.this.f38436j.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseMBSplashNativeView.this.f38436j.setImageBitmap(bitmapM37810a);
                            }
                        } catch (Throwable th) {
                            try {
                                C13219q0.m37816b("MBSplashNativeView", th.getMessage());
                                BaseMBSplashNativeView.this.f38436j.setImageBitmap(bitmap);
                            } catch (Throwable th2) {
                                C13219q0.m37816b("MBSplashNativeView", th2.getMessage());
                            }
                        }
                        BaseMBSplashNativeView.this.f38435i.setText(BaseMBSplashNativeView.this.f38421N.getAppName());
                        BaseMBSplashNativeView.this.m40096f();
                        try {
                            try {
                                Bitmap bitmapM37809a = C13217p0.m37809a(bitmap);
                                if (bitmapM37809a != null && !bitmapM37809a.isRecycled()) {
                                    BaseMBSplashNativeView.this.f38428b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    BaseMBSplashNativeView.this.f38428b.setImageBitmap(bitmapM37809a);
                                }
                            } catch (Throwable th3) {
                                C13219q0.m37816b("MBSplashNativeView", th3.getMessage());
                            }
                        } catch (Throwable unused) {
                            BaseMBSplashNativeView.this.f38428b.setImageBitmap(bitmap);
                        }
                    } else {
                        BaseMBSplashNativeView.this.f38433g.setVisibility(4);
                        BaseMBSplashNativeView.this.f38428b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f38428b.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap bitmapM37809a2 = C13217p0.m37809a(bitmap);
                        if (bitmapM37809a2 == null || bitmapM37809a2.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f38427a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        BaseMBSplashNativeView.this.f38427a.setImageBitmap(bitmapM37809a2);
                    } catch (Throwable unused2) {
                        BaseMBSplashNativeView.this.f38428b.setImageBitmap(bitmap);
                    }
                } catch (Throwable th4) {
                    C13219q0.m37816b("MBSplashNativeView", th4.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$b */
    class C13681b implements InterfaceC13101c {
        C13681b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f38434h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapM37810a;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseMBSplashNativeView.this.f38434h == null || (bitmapM37810a = C13217p0.m37810a(bitmap, 1, C13229v0.m37876a(C13008c.m36588n().m36542d(), 40.0f))) == null || bitmapM37810a.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f38434h.setImageBitmap(bitmapM37810a);
                        return;
                    } catch (Throwable th) {
                        C13219q0.m37816b("MBSplashNativeView", th.getMessage());
                        BaseMBSplashNativeView.this.f38434h.setImageBitmap(bitmap);
                        return;
                    }
                    C13219q0.m37816b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th2) {
                    C13219q0.m37816b("MBSplashNativeView", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$c */
    class C13682c implements InterfaceC13083a {
        C13682c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$d */
    class ViewOnClickListenerC13683d implements View.OnClickListener {
        ViewOnClickListenerC13683d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.m40104a(1);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$e */
    class ViewOnClickListenerC13684e implements View.OnClickListener {
        ViewOnClickListenerC13684e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.m40104a(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$f */
    class ViewOnClickListenerC13685f implements View.OnClickListener {
        ViewOnClickListenerC13685f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.f38415H) {
                if (baseMBSplashNativeView.f38420M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.f38420M.getSplashSignalCommunicationImpl().m40062a() != null) {
                    BaseMBSplashNativeView.this.f38420M.getSplashSignalCommunicationImpl().m40062a().close();
                }
                BaseMBSplashNativeView.this.f38432f.setVisibility(4);
                BaseMBSplashNativeView.this.f38432f.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseMBSplashNativeView$g */
    class C13686g implements InterfaceC13083a {
        C13686g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.f38417J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.f38416I = false;
        this.f38417J = false;
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38416I = false;
        this.f38417J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, C13651c c13651c) {
        super(context);
        this.f38416I = false;
        this.f38417J = false;
        if (c13651c == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f38418K = c13651c.m39794l();
        this.f38419L = c13651c.m39790h();
        this.f38421N = c13651c.m39784b();
        this.f38420M = mBSplashView;
        this.f38445s = c13651c.m39786d();
        this.f38448v = c13651c.m39785c();
        this.f38447u = c13651c.m39788f();
        this.f38449w = c13651c.m39783a();
        this.f38450x = c13651c.m39791i();
        this.f38451y = c13651c.m39792j();
        this.f38452z = c13651c.m39793k();
        this.f38408A = c13651c.m39789g();
        this.f38415H = c13651c.m39795m();
        this.f38409B = c13651c.m39787e();
        m40094d();
        m40092c();
    }

    /* JADX INFO: renamed from: a */
    private void m40087a() {
        CampaignEx campaignEx = this.f38421N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f38418K);
            C13084b.m37036b().m37040a(this.f38418K, 3);
            C13084b.m37036b().m37046a(this.f38418K, this.f38421N);
        }
        if (C13084b.m37036b().m37050a()) {
            C13084b.m37036b().m37047a(this.f38418K, new C13686g());
            C13084b.m37036b().m37048a(this.f38418K, this.f38431e);
            C13084b.m37036b().m37040a(this.f38418K, 3);
            C13084b.m37036b().m37046a(this.f38418K, this.f38421N);
            return;
        }
        FeedBackButton feedBackButton = this.f38431e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m40092c() {
        try {
            this.f38413F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashNativeView", th.getMessage());
        }
        m40087a();
        m40099g();
        m40101h();
        mo40106e();
        m40102i();
        m40103j();
        mo40105b();
        updateCountDown(this.f38445s);
    }

    /* JADX INFO: renamed from: d */
    private void m40094d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f38408A == 1 ? C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_portrait", "layout") : C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_landscape", "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.f38427a = (MBNoRecycledCrashImageView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f38428b = (MBNoRecycledCrashImageView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f38429c = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f38430d = (ImageView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f38431e = (FeedBackButton) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f38432f = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f38433g = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f38434h = (MBNoRecycledCrashImageView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f38435i = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f38436j = (MBNoRecycledCrashImageView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f38437k = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f38439m = (RelativeLayout) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f38440n = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f38441o = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f38442p = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f38443q = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f38444r = (MBSplashClickView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.f38438l = (TextView) viewInflate.findViewById(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iM37707a = C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING);
            int iM37707a2 = C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING);
            int iM37707a3 = C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING);
            this.f38424Q = getContext().getResources().getString(iM37707a);
            this.f38425R = getContext().getResources().getString(iM37707a2);
            this.f38423P = getContext().getResources().getString(iM37707a3);
            this.f38410C = C13229v0.m37876a(getContext(), 9.0f);
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashNativeView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m40096f() {
        if (TextUtils.isEmpty(this.f38421N.getIconUrl())) {
            this.f38434h.setVisibility(4);
        } else {
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f38421N.getIconUrl(), new C13681b());
        }
    }

    /* JADX INFO: renamed from: g */
    private void m40099g() {
        if (TextUtils.isEmpty(this.f38421N.getImageUrl())) {
            this.f38428b.setVisibility(4);
        } else {
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f38421N.getImageUrl(), new C13680a());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m40101h() {
        Drawable drawable;
        C13229v0.m37892a(3, this.f38430d, this.f38421N, getContext(), true, new C13682c());
        try {
            drawable = getResources().getDrawable(C13203i0.m37707a(getContext().getApplicationContext(), "mbridge_splash_m_circle", "drawable"));
            try {
                drawable.setBounds(0, 0, C13229v0.m37876a(getContext(), 10.0f), C13229v0.m37876a(getContext(), 10.0f));
            } catch (Throwable th) {
                th = th;
                C13219q0.m37816b("MBSplashNativeView", th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        if (this.f38408A == 1 && this.f38414G) {
            if (this.f38409B != 0 && drawable != null) {
                this.f38438l.setCompoundDrawables(drawable, null, null, null);
            }
            this.f38438l.setText(this.f38413F ? "广告" : "AD");
            this.f38437k.setVisibility(4);
            return;
        }
        if (this.f38409B != 0 && drawable != null) {
            this.f38437k.setCompoundDrawables(drawable, null, null, null);
        }
        this.f38437k.setText(this.f38413F ? "广告" : "AD");
        this.f38438l.setVisibility(4);
    }

    /* JADX INFO: renamed from: i */
    private void m40102i() {
        if (this.f38448v == 1) {
            this.f38444r.setVisibility(8);
        } else if (this.f38450x == 1) {
            this.f38444r.setVisibility(8);
        } else {
            this.f38444r.initView(this.f38421N.getAdCall());
        }
    }

    /* JADX INFO: renamed from: j */
    private void m40103j() {
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 297);
        if (TextUtils.isEmpty(this.f38421N.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        C13154c c13154cM37478a = C13156d.m37475b().m37478a(true, this.f38421N.getBidToken(), c13157e, this.f38421N, this.f38418K);
        if (this.f38447u == 1) {
            C13185b1.m37632a(this, c13154cM37478a.m37463t(), this.f38421N.getLocalAllowTrackClick());
            setOnClickListener(new ViewOnClickListenerC13683d());
        } else {
            C13185b1.m37632a(this.f38444r, c13154cM37478a.m37463t(), this.f38421N.getLocalAllowTrackClick());
            this.f38444r.setOnClickListener(new ViewOnClickListenerC13684e());
        }
        this.f38432f.setOnClickListener(new ViewOnClickListenerC13685f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z) {
        if (this.f38420M.getSplashSignalCommunicationImpl() == null || this.f38420M.getSplashSignalCommunicationImpl().m40062a() == null) {
            return;
        }
        this.f38420M.getSplashSignalCommunicationImpl().m40062a().mo39870a(z ? 2 : 1, this.f38446t);
    }

    /* JADX INFO: renamed from: a */
    protected void m40104a(int i) {
        if (this.f38420M.getSplashSignalCommunicationImpl() == null || this.f38420M.getSplashSignalCommunicationImpl().m40062a() == null) {
            return;
        }
        try {
            this.f38420M.getSplashSignalCommunicationImpl().m40062a().mo39871a(C13652a.m39824a(C13652a.m39825a(i, this.f38411D, this.f38412E), this.f38421N));
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashNativeView", th.getMessage());
            this.f38420M.getSplashSignalCommunicationImpl().m40062a().mo39871a(this.f38421N);
        }
    }

    /* JADX INFO: renamed from: b */
    protected void mo40105b() {
    }

    /* JADX INFO: renamed from: e */
    protected void mo40106e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f38450x != 1 || this.f38422O == null || this.f38426S == null) {
                return;
            }
            C13647a.m39776a().m39778a(this.f38426S);
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashNativeView", th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f38411D = motionEvent.getRawX();
        this.f38412E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.f38426S != null) {
                C13647a.m39776a().m39780b(this.f38426S);
                this.f38426S = null;
            }
            C13084b.m37036b().m37054d(this.f38418K);
            detachAllViewsFromParent();
        } catch (Exception e) {
            C13219q0.m37816b("MBSplashNativeView", e.getMessage());
        }
    }

    public void setIsPause(boolean z) {
        this.f38416I = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        try {
            RelativeLayout relativeLayout = this.f38429c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i5 = this.f38410C;
            layoutParams.leftMargin = i + i5;
            layoutParams.rightMargin = i2 + i5;
            layoutParams.topMargin = i3 + i5;
            layoutParams.bottomMargin = i5 + i4;
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashNativeView", th.getMessage());
        }
    }

    public void updateCountDown(int i) {
        String str;
        if (this.f38432f != null) {
            this.f38446t = i;
            if (this.f38415H) {
                str = this.f38424Q + " " + i + this.f38423P;
            } else {
                str = i + this.f38423P + " " + this.f38425R;
            }
            this.f38432f.setText(str);
        }
    }
}
