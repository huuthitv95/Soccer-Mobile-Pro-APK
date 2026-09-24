package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.InterfaceC12693j;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13181a0;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13217p0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.middle.C13664d;
import com.mbridge.msdk.splash.report.C13665a;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v */
    private static final AtomicInteger f38460v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    protected String f38461a;

    /* JADX INFO: renamed from: b */
    protected String f38462b;

    /* JADX INFO: renamed from: c */
    private int f38463c;

    /* JADX INFO: renamed from: d */
    private CampaignEx f38464d;

    /* JADX INFO: renamed from: e */
    protected C13664d f38465e;

    /* JADX INFO: renamed from: f */
    private ImageView f38466f;

    /* JADX INFO: renamed from: g */
    private ImageView f38467g;

    /* JADX INFO: renamed from: h */
    private ImageView f38468h;

    /* JADX INFO: renamed from: i */
    private ImageView f38469i;

    /* JADX INFO: renamed from: j */
    private TextView f38470j;

    /* JADX INFO: renamed from: k */
    private TextView f38471k;

    /* JADX INFO: renamed from: l */
    private TextView f38472l;

    /* JADX INFO: renamed from: m */
    private int f38473m;

    /* JADX INFO: renamed from: n */
    protected Handler f38474n;

    /* JADX INFO: renamed from: o */
    private boolean f38475o;

    /* JADX INFO: renamed from: p */
    protected C12682a f38476p;

    /* JADX INFO: renamed from: q */
    private InterfaceC12693j f38477q;

    /* JADX INFO: renamed from: r */
    private Runnable f38478r;

    /* JADX INFO: renamed from: s */
    private Runnable f38479s;

    /* JADX INFO: renamed from: t */
    View.OnClickListener f38480t;

    /* JADX INFO: renamed from: u */
    View.OnClickListener f38481u;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$a */
    class C13687a implements InterfaceC12693j {
        C13687a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iM37876a;
            int iM37876a2;
            if (BaseSplashPopView.this.f38463c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iM37876a3 = (C13229v0.m37876a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iM37876a = C13229v0.m37876a(BaseSplashPopView.this.getContext(), 23.0f) + iM37876a3;
                iM37876a2 = C13229v0.m37876a(BaseSplashPopView.this.getContext(), 10.0f) + iM37876a3;
            } else {
                iM37876a = 0;
                iM37876a2 = 0;
            }
            C13227u0.m37861a(campaign, BaseSplashPopView.this, iM37876a, iM37876a2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$b */
    class C13688b implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f38483a;

        C13688b(boolean z) {
            this.f38483a = z;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapM37811b = this.f38483a ? C13217p0.m37811b(bitmap) : C13217p0.m37810a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f38466f;
                if (bitmapM37811b != null) {
                    bitmap = bitmapM37811b;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                C13219q0.m37816b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$c */
    class C13689c implements InterfaceC13101c {
        C13689c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f38468h.setImageBitmap(C13181a0.m37594a(bitmap, 10));
            } catch (Throwable th) {
                C13219q0.m37816b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$d */
    class C13690d implements InterfaceC13101c {
        C13690d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f38467g.setImageBitmap(C13217p0.m37810a(bitmap, 1, 16));
            } catch (Throwable th) {
                C13219q0.m37816b("MBSplashPopView", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$e */
    class RunnableC13691e implements Runnable {
        RunnableC13691e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f38472l != null) {
                if (BaseSplashPopView.this.f38473m != 0) {
                    BaseSplashPopView.m40121g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f38472l.setText(String.valueOf(BaseSplashPopView.this.f38473m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f38474n.postDelayed(baseSplashPopView.f38478r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f38473m = -1;
                BaseSplashPopView.this.m40122g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f38474n.removeCallbacks(baseSplashPopView2.f38478r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                C13664d c13664d = baseSplashPopView3.f38465e;
                if (c13664d != null) {
                    c13664d.m40012a(new MBridgeIds(baseSplashPopView3.f38461a, baseSplashPopView3.f38462b), 5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$f */
    class RunnableC13692f implements Runnable {
        RunnableC13692f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            C13664d c13664d = baseSplashPopView.f38465e;
            if (c13664d != null) {
                c13664d.m40013a(new MBridgeIds(baseSplashPopView.f38461a, baseSplashPopView.f38462b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f38463c);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$g */
    class ViewOnClickListenerC13693g implements View.OnClickListener {
        ViewOnClickListenerC13693g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f38465e != null) {
                baseSplashPopView.mo40127b(baseSplashPopView.f38464d);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$h */
    class ViewOnClickListenerC13694h implements View.OnClickListener {
        ViewOnClickListenerC13694h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            C13664d c13664d;
            if (BaseSplashPopView.this.f38473m <= 0 && (c13664d = (baseSplashPopView = BaseSplashPopView.this).f38465e) != null) {
                c13664d.m40012a(new MBridgeIds(baseSplashPopView.f38461a, baseSplashPopView.f38462b), 4);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.BaseSplashPopView$i */
    public static class C13695i {

        /* JADX INFO: renamed from: a */
        private String f38491a;

        /* JADX INFO: renamed from: b */
        private String f38492b;

        /* JADX INFO: renamed from: c */
        private int f38493c;

        /* JADX INFO: renamed from: d */
        private CampaignEx f38494d;

        public C13695i(String str, String str2, int i, CampaignEx campaignEx) {
            this.f38491a = str;
            this.f38492b = str2;
            this.f38493c = i;
            this.f38494d = campaignEx;
        }

        /* JADX INFO: renamed from: a */
        public CampaignEx m40128a() {
            return this.f38494d;
        }

        /* JADX INFO: renamed from: b */
        public String m40129b() {
            return this.f38491a;
        }

        /* JADX INFO: renamed from: c */
        public String m40130c() {
            return this.f38492b;
        }

        /* JADX INFO: renamed from: d */
        public int m40131d() {
            return this.f38493c;
        }
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f38463c = 1;
        this.f38473m = -1;
        this.f38474n = new Handler();
        this.f38475o = false;
        this.f38477q = new C13687a();
        this.f38478r = new RunnableC13691e();
        this.f38479s = new RunnableC13692f();
        this.f38480t = new ViewOnClickListenerC13693g();
        this.f38481u = new ViewOnClickListenerC13694h();
        this.f38463c = 1;
        C13219q0.m37818c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38463c = 1;
        this.f38473m = -1;
        this.f38474n = new Handler();
        this.f38475o = false;
        this.f38477q = new C13687a();
        this.f38478r = new RunnableC13691e();
        this.f38479s = new RunnableC13692f();
        this.f38480t = new ViewOnClickListenerC13693g();
        this.f38481u = new ViewOnClickListenerC13694h();
        this.f38463c = 1;
        C13219q0.m37818c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38463c = 1;
        this.f38473m = -1;
        this.f38474n = new Handler();
        this.f38475o = false;
        this.f38477q = new C13687a();
        this.f38478r = new RunnableC13691e();
        this.f38479s = new RunnableC13692f();
        this.f38480t = new ViewOnClickListenerC13693g();
        this.f38481u = new ViewOnClickListenerC13694h();
        this.f38463c = 1;
        C13219q0.m37818c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f38463c = 1;
        this.f38473m = -1;
        this.f38474n = new Handler();
        this.f38475o = false;
        this.f38477q = new C13687a();
        this.f38478r = new RunnableC13691e();
        this.f38479s = new RunnableC13692f();
        this.f38480t = new ViewOnClickListenerC13693g();
        this.f38481u = new ViewOnClickListenerC13694h();
        this.f38463c = 1;
        C13219q0.m37818c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, C13695i c13695i, C13664d c13664d) {
        super(context);
        this.f38463c = 1;
        this.f38473m = -1;
        this.f38474n = new Handler();
        this.f38475o = false;
        this.f38477q = new C13687a();
        this.f38478r = new RunnableC13691e();
        this.f38479s = new RunnableC13692f();
        this.f38480t = new ViewOnClickListenerC13693g();
        this.f38481u = new ViewOnClickListenerC13694h();
        if (c13695i == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f38462b = c13695i.m40130c();
        this.f38461a = c13695i.m40129b();
        this.f38463c = c13695i.m40131d();
        this.f38464d = c13695i.m40128a();
        this.f38465e = c13664d;
        m40109a();
    }

    /* JADX INFO: renamed from: a */
    private void m40109a() {
        if (this.f38464d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.f38463c;
        if (i == 1) {
            m40114c();
            return;
        }
        if (i == 2) {
            m40120f();
        } else if (i == 3) {
            m40118e();
        } else {
            if (i != 4) {
                return;
            }
            m40116d();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40110a(String str, boolean z) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new C13688b(z));
    }

    /* JADX INFO: renamed from: b */
    private void m40112b() {
        String language;
        this.f38469i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 32.0f), C13229v0.m37876a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f38466f.getId());
        this.f38469i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            C13219q0.m37816b("MBSplashPopView", th.getMessage());
            language = "ZH";
        }
        this.f38469i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", C13008c.m36588n().m36550i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", C13008c.m36588n().m36550i()));
        addView(this.f38469i);
    }

    /* JADX INFO: renamed from: c */
    private void m40114c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 80.0f), C13229v0.m37876a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = C13229v0.m37876a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", C13008c.m36588n().m36550i()));
        this.f38466f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 60.0f), C13229v0.m37876a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = C13229v0.m37876a(getContext(), 7.0f);
        layoutParams2.leftMargin = C13229v0.m37876a(getContext(), 10.0f);
        this.f38466f.setId(generateViewId());
        this.f38466f.setLayoutParams(layoutParams2);
        this.f38466f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f38464d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            m40110a(this.f38464d.getIconUrl(), true);
        }
        this.f38472l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = C13229v0.m37876a(getContext(), 62.0f);
        layoutParams3.bottomMargin = C13229v0.m37876a(getContext(), 70.0f);
        this.f38472l.setId(generateViewId());
        this.f38472l.setTextSize(10.0f);
        this.f38472l.setTextColor(-1);
        this.f38472l.setGravity(17);
        this.f38472l.setMinWidth(C13229v0.m37876a(getContext(), 16.0f));
        this.f38472l.setMaxHeight(C13229v0.m37876a(getContext(), 16.0f));
        this.f38472l.setLayoutParams(layoutParams3);
        this.f38472l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", C13008c.m36588n().m36550i()));
        addView(imageView);
        addView(this.f38472l);
        addView(this.f38466f);
        CampaignEx campaignEx2 = this.f38464d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            m40122g();
        }
        CampaignEx campaignEx3 = this.f38464d;
        if (campaignEx3 != null) {
            C13185b1.m37632a(this, campaignEx3.getLocalRequestId(), this.f38464d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f38480t);
        this.f38472l.setOnClickListener(this.f38481u);
    }

    /* JADX INFO: renamed from: d */
    private void m40116d() {
        this.f38468h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C13229v0.m37876a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f38468h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f38468h.setId(generateViewId());
        this.f38468h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f38464d.getImageUrl());
        this.f38467g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, C13229v0.m37876a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f38467g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f38467g.setId(generateViewId());
        this.f38467g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f38464d.getImageUrl());
        this.f38466f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 50.0f), C13229v0.m37876a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f38468h.getId());
        layoutParams3.topMargin = 20;
        this.f38466f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f38466f.setId(generateViewId());
        this.f38466f.setLayoutParams(layoutParams3);
        m40110a(this.f38464d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f38466f.getId());
        layoutParams4.addRule(6, this.f38466f.getId());
        layoutParams4.addRule(8, this.f38466f.getId());
        layoutParams4.leftMargin = C13229v0.m37876a(getContext(), 8.0f);
        layoutParams4.rightMargin = C13229v0.m37876a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f38470j = textView;
        textView.setId(generateViewId());
        this.f38470j.setGravity(16);
        this.f38470j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f38470j.setTextSize(12.0f);
        this.f38470j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f38470j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f38470j.setMarqueeRepeatLimit(-1);
        this.f38470j.setSelected(true);
        this.f38470j.setSingleLine(true);
        this.f38470j.setText(this.f38464d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f38471k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f38470j.getId());
        layoutParams5.addRule(3, this.f38470j.getId());
        layoutParams5.topMargin = C13229v0.m37876a(getContext(), 4.0f);
        layoutParams5.rightMargin = C13229v0.m37876a(getContext(), 36.0f);
        this.f38471k.setGravity(16);
        this.f38471k.setLayoutParams(layoutParams5);
        this.f38471k.setTextSize(8.0f);
        this.f38471k.setTextColor(-10066330);
        this.f38471k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f38471k.setMarqueeRepeatLimit(-1);
        this.f38471k.setSelected(true);
        this.f38471k.setSingleLine(true);
        this.f38471k.setText(this.f38464d.getAppDesc());
        relativeLayout.addView(this.f38470j);
        relativeLayout.addView(this.f38471k);
        addView(this.f38468h);
        addView(this.f38467g);
        addView(this.f38466f);
        addView(relativeLayout);
        m40112b();
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 297);
        if (TextUtils.isEmpty(this.f38464d.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        C13185b1.m37632a(this, C13156d.m37475b().m37478a(true, this.f38464d.getBidToken(), c13157e, this.f38464d, this.f38462b).m37463t(), this.f38464d.getLocalAllowTrackClick());
        setOnClickListener(this.f38480t);
    }

    /* JADX INFO: renamed from: e */
    private void m40118e() {
        int iM37876a = C13229v0.m37876a(getContext(), 4.0f);
        this.f38466f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 50.0f), C13229v0.m37876a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f38466f.setId(generateViewId());
        this.f38466f.setLayoutParams(layoutParams);
        this.f38466f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f38466f.setPadding(iM37876a, iM37876a, iM37876a, iM37876a);
        m40110a(this.f38464d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f38466f.getId());
        layoutParams2.addRule(6, this.f38466f.getId());
        layoutParams2.addRule(8, this.f38466f.getId());
        layoutParams2.leftMargin = C13229v0.m37876a(getContext(), 8.0f);
        layoutParams2.rightMargin = C13229v0.m37876a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f38470j = textView;
        textView.setId(generateViewId());
        this.f38470j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f38470j.setGravity(16);
        this.f38470j.setTextSize(12.0f);
        this.f38470j.setSelected(true);
        this.f38470j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f38470j.setMarqueeRepeatLimit(-1);
        this.f38470j.setSingleLine(true);
        this.f38470j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f38470j.setText(this.f38464d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f38471k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f38470j.getId());
        layoutParams3.addRule(3, this.f38470j.getId());
        layoutParams3.topMargin = C13229v0.m37876a(getContext(), 4.0f);
        layoutParams3.rightMargin = C13229v0.m37876a(getContext(), 36.0f);
        this.f38471k.setGravity(16);
        this.f38471k.setLayoutParams(layoutParams3);
        this.f38471k.setTextSize(8.0f);
        this.f38471k.setTextColor(-10066330);
        this.f38471k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f38471k.setMarqueeRepeatLimit(-1);
        this.f38471k.setSelected(true);
        this.f38471k.setSingleLine(true);
        this.f38471k.setText(this.f38464d.getAppDesc());
        relativeLayout.addView(this.f38470j);
        relativeLayout.addView(this.f38471k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", C13008c.m36588n().m36550i()));
        addView(this.f38466f);
        addView(relativeLayout);
        m40112b();
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 297);
        if (TextUtils.isEmpty(this.f38464d.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        C13185b1.m37632a(this, C13156d.m37475b().m37478a(true, this.f38464d.getBidToken(), c13157e, this.f38464d, this.f38462b).m37463t(), this.f38464d.getLocalAllowTrackClick());
        setOnClickListener(this.f38480t);
    }

    /* JADX INFO: renamed from: f */
    private void m40120f() {
        int iM37876a = C13229v0.m37876a(getContext(), 4.0f);
        this.f38466f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 28.0f), C13229v0.m37876a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f38466f.setId(generateViewId());
        this.f38466f.setLayoutParams(layoutParams);
        this.f38466f.setPadding(iM37876a, iM37876a, iM37876a, iM37876a);
        this.f38466f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        m40110a(this.f38464d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f38470j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f38466f.getId());
        layoutParams2.addRule(6, this.f38466f.getId());
        layoutParams2.addRule(8, this.f38466f.getId());
        layoutParams2.leftMargin = C13229v0.m37876a(getContext(), 4.0f);
        layoutParams2.rightMargin = C13229v0.m37876a(getContext(), 40.0f);
        this.f38470j.setLayoutParams(layoutParams2);
        this.f38470j.setGravity(16);
        this.f38470j.setTextSize(10.0f);
        this.f38470j.setSelected(true);
        this.f38470j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f38470j.setMarqueeRepeatLimit(-1);
        this.f38470j.setSingleLine(true);
        this.f38470j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f38470j.setText(this.f38464d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", C13008c.m36588n().m36550i()));
        addView(this.f38466f);
        addView(this.f38470j);
        m40112b();
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 297);
        if (TextUtils.isEmpty(this.f38464d.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        C13185b1.m37632a(this, C13156d.m37475b().m37478a(true, this.f38464d.getBidToken(), c13157e, this.f38464d, this.f38462b).m37463t(), this.f38464d.getLocalAllowTrackClick());
        setOnClickListener(this.f38480t);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ int m40121g(BaseSplashPopView baseSplashPopView) {
        int i = baseSplashPopView.f38473m;
        baseSplashPopView.f38473m = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m40122g() {
        TextView textView = this.f38472l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C13229v0.m37876a(getContext(), 16.0f);
            layoutParams.height = C13229v0.m37876a(getContext(), 16.0f);
            this.f38472l.setLayoutParams(layoutParams);
            this.f38472l.setText("");
            this.f38472l.setSelected(true);
            this.f38472l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", C13008c.m36588n().m36550i()));
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f38460v;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    private void setBackgroundImage(String str) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new C13689c());
    }

    private void setForegroundImage(String str) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new C13690d());
    }

    /* JADX INFO: renamed from: a */
    protected void m40126a(CampaignEx campaignEx) {
        if (this.f38476p == null) {
            C12682a c12682a = new C12682a(C13008c.m36588n().m36542d(), this.f38462b);
            this.f38476p = c12682a;
            c12682a.m34632a(this.f38477q);
        }
        campaignEx.setCampaignUnitId(this.f38462b);
        this.f38476p.m34633a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            C13665a.m40018a(C13008c.m36588n().m36542d(), campaignEx);
        }
        C13664d c13664d = this.f38465e;
        if (c13664d != null) {
            c13664d.m40011a(new MBridgeIds(this.f38461a, this.f38462b));
            this.f38465e.m40012a(new MBridgeIds(this.f38461a, this.f38462b), 6);
        }
    }

    /* JADX INFO: renamed from: b */
    protected void mo40127b(CampaignEx campaignEx) {
        C13665a.m40021a(campaignEx, this.f38462b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38465e != null) {
            postDelayed(this.f38479s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f38475o = true;
        if (this.f38472l != null) {
            this.f38474n.removeCallbacks(this.f38478r);
        }
    }

    public void reStartCountDown() {
        if (this.f38475o) {
            this.f38475o = false;
            int i = this.f38473m;
            if (i == -1 || i == 0) {
                m40122g();
                return;
            }
            TextView textView = this.f38472l;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                this.f38474n.postDelayed(this.f38478r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f38474n.removeCallbacks(this.f38479s);
            this.f38474n.removeCallbacks(this.f38478r);
            this.f38478r = null;
            detachAllViewsFromParent();
            this.f38464d = null;
            this.f38465e = null;
        } catch (Exception e) {
            C13219q0.m37816b("MBSplashPopView", e.getMessage());
        }
    }

    public void setPopViewType(C13695i c13695i, C13664d c13664d) {
        if (c13695i == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f38462b = c13695i.m40130c();
        this.f38461a = c13695i.m40129b();
        this.f38463c = c13695i.m40131d();
        this.f38464d = c13695i.m40128a();
        this.f38465e = c13664d;
        m40109a();
    }

    public void startCountDown() {
        this.f38474n.removeCallbacks(this.f38478r);
        CampaignEx campaignEx = this.f38464d;
        if (campaignEx == null || this.f38463c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            m40122g();
            return;
        }
        this.f38473m = flbSkipTime;
        TextView textView = this.f38472l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f38474n.postDelayed(this.f38478r, 1000L);
        }
    }
}
