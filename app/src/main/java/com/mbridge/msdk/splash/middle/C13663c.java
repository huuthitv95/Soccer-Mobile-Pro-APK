package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C13384a;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.splash.manager.C13657d;
import com.mbridge.msdk.splash.manager.C13658e;
import com.mbridge.msdk.splash.manager.C13659f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.middle.c */
/* JADX INFO: compiled from: SplashProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13663c {

    /* JADX INFO: renamed from: D */
    private static String f38319D = "SplashProvider";

    /* JADX INFO: renamed from: A */
    private CampaignEx f38320A;

    /* JADX INFO: renamed from: B */
    private MBSplashPopView f38321B;

    /* JADX INFO: renamed from: a */
    private String f38323a;

    /* JADX INFO: renamed from: b */
    private String f38324b;

    /* JADX INFO: renamed from: c */
    private MBridgeIds f38325c;

    /* JADX INFO: renamed from: e */
    private long f38327e;

    /* JADX INFO: renamed from: f */
    private C13658e f38328f;

    /* JADX INFO: renamed from: g */
    private C13659f f38329g;

    /* JADX INFO: renamed from: h */
    private C13662b f38330h;

    /* JADX INFO: renamed from: i */
    private MBSplashShowListener f38331i;

    /* JADX INFO: renamed from: j */
    private C13664d f38332j;

    /* JADX INFO: renamed from: k */
    private MBSplashView f38333k;

    /* JADX INFO: renamed from: l */
    private ViewGroup f38334l;

    /* JADX INFO: renamed from: m */
    private View f38335m;

    /* JADX INFO: renamed from: n */
    private C13640l f38336n;

    /* JADX INFO: renamed from: o */
    private boolean f38337o;

    /* JADX INFO: renamed from: p */
    private ViewGroup f38338p;

    /* JADX INFO: renamed from: q */
    private C13638j f38339q;

    /* JADX INFO: renamed from: r */
    private boolean f38340r;

    /* JADX INFO: renamed from: y */
    private Activity f38347y;

    /* JADX INFO: renamed from: z */
    private boolean f38348z;

    /* JADX INFO: renamed from: d */
    private int f38326d = 5;

    /* JADX INFO: renamed from: s */
    private int f38341s = 1;

    /* JADX INFO: renamed from: t */
    private int f38342t = C13211m0.m37760n(C13008c.m36588n().m36542d());

    /* JADX INFO: renamed from: u */
    private int f38343u = C13211m0.m37757m(C13008c.m36588n().m36542d());

    /* JADX INFO: renamed from: v */
    private Object f38344v = new Object();

    /* JADX INFO: renamed from: w */
    private Object f38345w = new Object();

    /* JADX INFO: renamed from: x */
    public boolean f38346x = false;

    /* JADX INFO: renamed from: C */
    private boolean f38322C = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.middle.c$a */
    /* JADX INFO: compiled from: SplashProvider.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38349a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38350b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f38351c;

        a(CampaignEx campaignEx, int i, boolean z) {
            this.f38349a = campaignEx;
            this.f38350b = i;
            this.f38351c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13663c.this.m39970a(this.f38349a, this.f38350b - 1, this.f38351c);
        }
    }

    public C13663c(Activity activity, String str, String str2) {
        this.f38324b = TextUtils.isEmpty(str) ? "" : str;
        this.f38323a = str2;
        this.f38325c = new MBridgeIds(str, str2);
        this.f38347y = activity;
        m39973b(activity);
    }

    /* JADX INFO: renamed from: a */
    private ViewGroup m39968a(Activity activity) {
        Throwable th;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            C13219q0.m37820d(f38319D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Exception e) {
                    e.printStackTrace();
                    return viewGroup;
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th3) {
            th = th3;
            viewGroup = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39969a(int i, int i2) {
        int iM37760n = C13211m0.m37760n(C13008c.m36588n().m36542d());
        int iM37757m = C13211m0.m37757m(C13008c.m36588n().m36542d());
        int i3 = this.f38341s;
        if (i3 == 1) {
            if (iM37757m >= i2 * 4) {
                this.f38343u = iM37757m - i2;
                this.f38342t = iM37760n;
                return;
            } else {
                this.f38343u = 0;
                this.f38342t = 0;
                return;
            }
        }
        if (i3 == 2) {
            if (iM37760n >= i * 4) {
                this.f38342t = iM37760n - i;
                this.f38343u = iM37757m;
            } else {
                this.f38343u = 0;
                this.f38342t = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39970a(CampaignEx campaignEx, int i, boolean z) {
        if (!C13657d.m39884a(this.f38333k, campaignEx)) {
            if (i > 0) {
                this.f38329g.f38219y.postDelayed(new a(campaignEx, i, z), 1L);
                return;
            }
            C13664d c13664d = this.f38332j;
            if (c13664d != null) {
                c13664d.m40015a(this.f38325c, "campaignEx is not ready");
                return;
            }
            return;
        }
        m39985a(true);
        ViewGroup.LayoutParams layoutParams = this.f38334l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f38334l.setLayoutParams(layoutParams);
        this.f38334l.removeAllViews();
        this.f38329g.m39864c(this.f38326d);
        this.f38329g.m39855a(this.f38338p);
        this.f38329g.m39858a(this.f38332j);
        C13219q0.m37816b(f38319D, "start show process");
        ViewGroup viewGroup = this.f38334l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            C13197f1.m37674a(this.f38333k);
            this.f38334l.addView(this.f38333k);
        }
        this.f38329g.m39859a(this.f38340r);
        this.f38329g.m39856a(campaignEx, this.f38333k);
    }

    /* JADX INFO: renamed from: a */
    private void m39972a(String str, int i) {
        boolean zM38711b;
        synchronized (this.f38344v) {
            if (this.f38337o) {
                if (this.f38330h != null) {
                    this.f38330h.m39965a(new C13082b(880016, "current unit is loading"), i);
                    this.f38337o = true;
                }
                return;
            }
            this.f38337o = true;
            int i2 = this.f38326d;
            if (i2 < 2 || i2 > 10) {
                if (this.f38330h != null) {
                    C13082b c13082b = new C13082b(880037);
                    c13082b.m37024c("countDownTime must in 2 - 10");
                    this.f38330h.m39965a(c13082b, i);
                    return;
                }
                return;
            }
            if (this.f38342t == 0 || this.f38343u == 0) {
                if (this.f38330h != null) {
                    this.f38330h.m39965a(new C13082b(880028), i);
                    return;
                }
                return;
            }
            try {
                zM38711b = C13384a.m38711b(C13008c.m36588n().m36542d());
            } catch (Exception unused) {
                zM38711b = false;
            }
            if (!zM38711b) {
                if (this.f38330h != null) {
                    this.f38330h.m39965a(new C13082b(880029), i);
                    return;
                }
                return;
            }
            this.f38333k.clearResState();
            this.f38336n = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f38323a);
            if (this.f38328f == null) {
                this.f38328f = new C13658e(this.f38324b, this.f38323a, this.f38327e * 1000);
            }
            C13662b c13662b = this.f38330h;
            if (c13662b != null) {
                c13662b.m39967a(str);
                this.f38328f.m39932a(this.f38330h);
            }
            this.f38333k.resetLoadState();
            this.f38328f.m39929a(this.f38326d);
            this.f38328f.m39933a(this.f38333k);
            this.f38328f.m39931a(this.f38336n);
            this.f38328f.m39930a(this.f38342t, this.f38343u);
            this.f38328f.m39935a(this.f38340r);
            this.f38328f.m39936b(this.f38341s);
            this.f38328f.m39934a(str, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m39973b(Activity activity) {
        if (this.f38329g == null) {
            if (activity != null) {
                this.f38329g = new C13659f(activity, this.f38324b, this.f38323a);
            } else {
                this.f38329g = new C13659f(C13008c.m36588n().m36542d(), this.f38324b, this.f38323a);
            }
        }
        if (this.f38333k == null) {
            if (activity != null) {
                this.f38333k = new MBSplashView(activity);
            } else {
                this.f38333k = new MBSplashView(C13008c.m36588n().m36542d());
            }
        }
        if (this.f38339q == null) {
            this.f38339q = new C13638j();
        }
        this.f38339q.m39744a(C13008c.m36588n().m36542d(), C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c(), this.f38323a);
    }

    /* JADX INFO: renamed from: a */
    public ViewGroup m39974a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(C13008c.m36588n().m36542d(), new BaseSplashPopView.C13695i(this.f38324b, this.f38323a, zoomOutTypeEnum.getIndex(), this.f38320A), this.f38332j);
        this.f38321B = mBSplashPopView;
        return mBSplashPopView;
    }

    /* JADX INFO: renamed from: a */
    public void m39975a() {
        this.f38320A = null;
        if (this.f38331i != null) {
            this.f38331i = null;
        }
        if (this.f38330h != null) {
            this.f38330h = null;
        }
        if (this.f38332j != null) {
            this.f38332j = null;
        }
        C13658e c13658e = this.f38328f;
        if (c13658e != null) {
            c13658e.m39939e();
        }
        C13659f c13659f = this.f38329g;
        if (c13659f != null) {
            c13659f.m39868h();
        }
        if (this.f38347y != null) {
            this.f38347y = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39976a(int i) {
        this.f38341s = i;
    }

    /* JADX INFO: renamed from: a */
    public void m39977a(int i, int i2, int i3, int i4) {
        try {
            MBSplashView mBSplashView = this.f38333k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i, i2, i3, i4);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f38319D, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39978a(long j) {
        this.f38327e = j;
    }

    /* JADX INFO: renamed from: a */
    public void m39979a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f38335m = view;
        if (view != null) {
            m39969a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f38333k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39980a(ViewGroup viewGroup) {
        this.f38338p = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public void m39981a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f38330h == null) {
            this.f38330h = new C13662b(this, this.f38325c);
        }
        this.f38330h.m39966a(mBSplashLoadListener);
    }

    /* JADX INFO: renamed from: a */
    public void m39982a(MBSplashShowListener mBSplashShowListener) {
        this.f38331i = mBSplashShowListener;
    }

    /* JADX INFO: renamed from: a */
    public void m39983a(String str, Activity activity) {
        ViewGroup viewGroupM39968a = m39968a(activity);
        if (viewGroupM39968a != null) {
            m39984a(str, viewGroupM39968a);
        } else if (this.f38330h != null) {
            this.f38330h.m39965a(new C13082b(880036), 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39984a(String str, ViewGroup viewGroup) {
        this.f38334l = viewGroup;
        MBSplashView mBSplashView = this.f38333k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        m39972a(str, 2);
    }

    /* JADX INFO: renamed from: a */
    public void m39985a(boolean z) {
        MBSplashView mBSplashView = this.f38333k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m39986a(String str) {
        return C13657d.m39877a(this.f38333k, this.f38324b, this.f38323a, str, this.f38340r, this.f38326d, false, true) != null;
    }

    /* JADX INFO: renamed from: b */
    public String m39987b() {
        if (this.f38346x) {
            C13659f c13659f = this.f38329g;
            return c13659f != null ? c13659f.m39863c() : "";
        }
        C13658e c13658e = this.f38328f;
        return c13658e != null ? c13658e.m39937c() : "";
    }

    /* JADX INFO: renamed from: b */
    public void m39988b(int i) {
        this.f38326d = i;
    }

    /* JADX INFO: renamed from: b */
    public void m39989b(int i, int i2) {
        m39969a(i2, i);
    }

    /* JADX INFO: renamed from: b */
    void m39990b(CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && z) {
            if (this.f38336n == null) {
                this.f38336n = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f38323a);
            }
            this.f38332j = new C13664d(this, this.f38331i, campaignEx);
        }
        ViewGroup viewGroup = this.f38334l;
        if (viewGroup == null) {
            C13664d c13664d = this.f38332j;
            if (c13664d != null) {
                c13664d.m40015a(this.f38325c, "container is null");
                return;
            }
            return;
        }
        if (this.f38329g == null) {
            this.f38329g = new C13659f(viewGroup.getContext(), this.f38324b, this.f38323a);
        }
        this.f38320A = campaignEx;
        m39970a(campaignEx, i, z);
    }

    /* JADX INFO: renamed from: b */
    public void m39991b(String str) {
        m39972a(str, 1);
    }

    /* JADX INFO: renamed from: b */
    public void m39992b(String str, Activity activity) {
        ViewGroup viewGroupM39968a = m39968a(activity);
        if (viewGroupM39968a != null) {
            m39993b(str, viewGroupM39968a);
        } else if (this.f38330h != null) {
            this.f38330h.m39965a(new C13082b(880036), 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39993b(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str)) {
            m39984a(str, viewGroup);
        } else if (this.f38330h != null) {
            this.f38330h.m39965a(new C13082b(880035), 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39994b(boolean z) {
        this.f38337o = z;
    }

    /* JADX INFO: renamed from: c */
    public String m39995c() {
        if (this.f38346x) {
            C13659f c13659f = this.f38329g;
            return c13659f != null ? c13659f.m39865d() : "";
        }
        C13658e c13658e = this.f38328f;
        return c13658e != null ? c13658e.m39938d() : "";
    }

    /* JADX INFO: renamed from: c */
    public void m39996c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m39991b(str);
        } else if (this.f38330h != null) {
            this.f38330h.m39965a(new C13082b(880035), 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39997c(String str, Activity activity) {
        ViewGroup viewGroupM39968a = m39968a(activity);
        if (viewGroupM39968a != null) {
            m39998c(str, viewGroupM39968a);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f38331i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f38325c, "activity is except,please check it");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39998c(String str, ViewGroup viewGroup) {
        this.f38334l = viewGroup;
        MBSplashView mBSplashView = this.f38333k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExM39877a = C13657d.m39877a(this.f38333k, this.f38324b, this.f38323a, str, this.f38340r, this.f38326d, true, false);
        if (campaignExM39877a == null) {
            MBSplashShowListener mBSplashShowListener = this.f38331i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f38325c, "campaignEx is vali");
                return;
            }
            return;
        }
        if (this.f38336n == null) {
            this.f38336n = C13636h.m39706b().m39719d(C13008c.m36588n().m36533b(), this.f38323a);
        }
        C13664d c13664d = new C13664d(this, this.f38331i, campaignExM39877a);
        this.f38332j = c13664d;
        if (this.f38342t == 0 || this.f38343u == 0) {
            c13664d.m40015a(this.f38325c, "width or height is 0  or width or height is too small");
            return;
        }
        int i = this.f38326d;
        if (i >= 2 && i <= 10) {
            m39990b(campaignExM39877a, this.f38336n.m39608E(), false);
            return;
        }
        c13664d.m40015a(this.f38325c, "countDownTime must in 2 - 10 ,but now is " + this.f38326d);
    }

    /* JADX INFO: renamed from: c */
    public void m39999c(boolean z) {
        this.f38340r = z;
    }

    /* JADX INFO: renamed from: d */
    public int m40000d() {
        return this.f38326d;
    }

    /* JADX INFO: renamed from: d */
    public void m40001d(String str, Activity activity) {
        ViewGroup viewGroupM39968a = m39968a(activity);
        if (viewGroupM39968a != null) {
            m40002d(str, viewGroupM39968a);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f38331i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f38325c, "activity is except,please check it");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m40002d(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str)) {
            m39998c(str, viewGroup);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f38331i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f38325c, "token is null or empty");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m40003d(boolean z) {
        this.f38348z = z;
    }

    /* JADX INFO: renamed from: e */
    public long m40004e() {
        return this.f38327e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m40005f() {
        return this.f38340r;
    }

    /* JADX INFO: renamed from: g */
    public boolean m40006g() {
        return this.f38337o;
    }

    /* JADX INFO: renamed from: h */
    public void m40007h() {
        C13659f c13659f = this.f38329g;
        if (c13659f != null) {
            c13659f.m39866f();
        }
        MBSplashPopView mBSplashPopView = this.f38321B;
        if (mBSplashPopView == null || !this.f38322C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    /* JADX INFO: renamed from: i */
    public void m40008i() {
        C13659f c13659f = this.f38329g;
        if (c13659f != null) {
            c13659f.m39867g();
        }
        MBSplashPopView mBSplashPopView = this.f38321B;
        if (mBSplashPopView == null || !this.f38322C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    /* JADX INFO: renamed from: j */
    public void m40009j() {
        this.f38322C = true;
        MBSplashPopView mBSplashPopView = this.f38321B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m40010k() {
        this.f38322C = false;
        MBSplashShowListener mBSplashShowListener = this.f38331i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f38324b, this.f38323a));
        }
        MBSplashPopView mBSplashPopView = this.f38321B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }
}
