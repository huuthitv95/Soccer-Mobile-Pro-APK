package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.common.C12654c;
import com.mbridge.msdk.advanced.manager.C12656b;
import com.mbridge.msdk.advanced.manager.C12657c;
import com.mbridge.msdk.advanced.manager.C12658d;
import com.mbridge.msdk.advanced.signal.C12675a;
import com.mbridge.msdk.advanced.view.C12680a;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C13384a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c */
/* JADX INFO: compiled from: NativeAdvancedProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12661c {

    /* JADX INFO: renamed from: G */
    private static String f33514G = "NativeAdvancedProvider";

    /* JADX INFO: renamed from: A */
    private boolean f33515A;

    /* JADX INFO: renamed from: B */
    private boolean f33516B;

    /* JADX INFO: renamed from: C */
    private boolean f33517C;

    /* JADX INFO: renamed from: a */
    private String f33521a;

    /* JADX INFO: renamed from: b */
    private String f33522b;

    /* JADX INFO: renamed from: c */
    private MBridgeIds f33523c;

    /* JADX INFO: renamed from: d */
    private C12656b f33524d;

    /* JADX INFO: renamed from: e */
    private C12657c f33525e;

    /* JADX INFO: renamed from: f */
    private C12660b f33526f;

    /* JADX INFO: renamed from: g */
    private NativeAdvancedAdListener f33527g;

    /* JADX INFO: renamed from: h */
    private C12662d f33528h;

    /* JADX INFO: renamed from: i */
    private MBNativeAdvancedView f33529i;

    /* JADX INFO: renamed from: j */
    private MBNativeAdvancedWebview f33530j;

    /* JADX INFO: renamed from: k */
    private C12680a f33531k;

    /* JADX INFO: renamed from: l */
    private C13640l f33532l;

    /* JADX INFO: renamed from: m */
    private boolean f33533m;

    /* JADX INFO: renamed from: n */
    private C13638j f33534n;

    /* JADX INFO: renamed from: x */
    private JSONObject f33544x;

    /* JADX INFO: renamed from: z */
    private MBOutNativeAdvancedViewGroup f33546z;

    /* JADX INFO: renamed from: o */
    private int f33535o = -1;

    /* JADX INFO: renamed from: p */
    private boolean f33536p = false;

    /* JADX INFO: renamed from: q */
    private int f33537q = 0;

    /* JADX INFO: renamed from: r */
    private boolean f33538r = false;

    /* JADX INFO: renamed from: s */
    private int f33539s = 0;

    /* JADX INFO: renamed from: t */
    private boolean f33540t = false;

    /* JADX INFO: renamed from: u */
    private int f33541u = 0;

    /* JADX INFO: renamed from: v */
    private int f33542v = 0;

    /* JADX INFO: renamed from: w */
    private Object f33543w = new Object();

    /* JADX INFO: renamed from: y */
    private boolean f33545y = false;

    /* JADX INFO: renamed from: D */
    private boolean f33518D = true;

    /* JADX INFO: renamed from: E */
    public boolean f33519E = false;

    /* JADX INFO: renamed from: F */
    private ViewTreeObserver.OnScrollChangedListener f33520F = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a */
    /* JADX INFO: compiled from: NativeAdvancedProvider.java */
    class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedProvider.java */
        class RunnableC15550a implements Runnable {
            RunnableC15550a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12661c.this.f33518D = true;
            }
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (C12661c.this.f33518D) {
                C12661c.this.f33518D = false;
                if (C12661c.this.f33546z != null) {
                    C12661c.this.f33546z.postDelayed(new RunnableC15550a(), 1000L);
                }
                try {
                    C12661c.this.m34502i();
                } catch (Exception e) {
                    C13219q0.m37816b(C12661c.f33514G, e.getMessage());
                }
            }
        }
    }

    public C12661c(String str, String str2, Activity activity) {
        this.f33522b = TextUtils.isEmpty(str) ? "" : str;
        this.f33521a = str2;
        this.f33523c = new MBridgeIds(str, str2);
        m34490a(activity);
    }

    /* JADX INFO: renamed from: a */
    private void m34488a(int i) {
        if (this.f33536p) {
            this.f33535o = i;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i2 = this.f33535o;
            if (i2 == 1) {
                this.f33525e.m34401a(true);
                C12675a.m34575a(this.f33530j, "showCloseButton", "", null);
            } else if (i2 == 0) {
                this.f33525e.m34401a(false);
                C12675a.m34575a(this.f33530j, "hideCloseButton", "", null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34489a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f33542v = i;
        this.f33541u = i2;
        this.f33546z.setLayoutParams(new ViewGroup.LayoutParams(i2, i));
    }

    /* JADX INFO: renamed from: a */
    private void m34490a(Activity activity) {
        C12680a c12680a;
        Context context;
        if (this.f33525e == null) {
            C12657c c12657c = new C12657c(C13008c.m36588n().m36542d(), this.f33522b, this.f33521a);
            this.f33525e = c12657c;
            c12657c.m34397a(this);
        }
        if (this.f33530j == null) {
            try {
                this.f33530j = new MBNativeAdvancedWebview(C13008c.m36588n().m36542d());
            } catch (Exception e) {
                C13219q0.m37816b(f33514G, e.getMessage());
            }
            if (this.f33531k == null) {
                try {
                    this.f33531k = new C12680a(this.f33521a, this.f33525e.m34402b(), this);
                } catch (Exception e2) {
                    C13219q0.m37816b(f33514G, e2.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
            if (mBNativeAdvancedWebview != null && (c12680a = this.f33531k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(c12680a);
            }
        }
        if (this.f33529i == null) {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (activity == null) {
                context = activity;
                context = contextM36542d;
            }
            context = activity;
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f33529i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f33530j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f33530j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f33529i.addView(this.f33530j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f33546z == null) {
            this.f33546z = new MBOutNativeAdvancedViewGroup(C13008c.m36588n().m36542d());
            this.f33546z.setLayoutParams((this.f33541u == 0 || this.f33542v == 0) ? new ViewGroup.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(this.f33541u, this.f33542v));
            this.f33546z.setProvider(this);
            this.f33546z.addView(this.f33529i);
            this.f33546z.getViewTreeObserver().addOnScrollChangedListener(this.f33520F);
        }
        if (this.f33534n == null) {
            this.f33534n = new C13638j();
        }
        this.f33534n.m39744a(C13008c.m36588n().m36542d(), C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c(), this.f33521a);
    }

    /* JADX INFO: renamed from: a */
    private void m34491a(CampaignEx campaignEx) {
        if (C12658d.m34480a(this.f33529i, campaignEx, this.f33522b, this.f33521a)) {
            this.f33525e.m34398a(this.f33528h);
            C13219q0.m37816b(f33514G, "start show process");
            this.f33525e.m34399a(campaignEx, this.f33529i, true);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34492a(String str, int i) throws Throwable {
        boolean zM38711b;
        this.f33518D = true;
        synchronized (this.f33543w) {
            if (this.f33533m) {
                if (this.f33526f != null) {
                    this.f33526f.m34484a(new C13082b(880016, "current unit is loading"), i);
                    this.f33533m = true;
                }
                return;
            }
            this.f33533m = true;
            if (this.f33541u == 0 || this.f33542v == 0) {
                if (this.f33526f != null) {
                    this.f33526f.m34484a(new C13082b(880028), i);
                    return;
                }
                return;
            }
            if (this.f33529i == null) {
                if (this.f33526f != null) {
                    this.f33526f.m34484a(new C13082b(880030), i);
                    return;
                }
                return;
            }
            try {
                zM38711b = C13384a.m38711b(C13008c.m36588n().m36542d());
            } catch (Exception e) {
                C13219q0.m37816b(f33514G, e.getMessage());
                zM38711b = false;
            }
            if (!zM38711b) {
                if (this.f33526f != null) {
                    this.f33526f.m34484a(new C13082b(880029), i);
                    return;
                }
                return;
            }
            this.f33529i.clearResStateAndRemoveClose();
            C13640l c13640lM39709a = C13636h.m39706b().m39709a(C13008c.m36588n().m36533b(), this.f33521a);
            this.f33532l = c13640lM39709a;
            if (c13640lM39709a == null) {
                this.f33532l = C13640l.m39755k(this.f33521a);
            }
            if (this.f33524d == null) {
                this.f33524d = new C12656b(this.f33522b, this.f33521a, 0L);
            }
            C12660b c12660b = this.f33526f;
            if (c12660b != null) {
                c12660b.m34486a(str);
                this.f33524d.m34460a(this.f33526f);
            }
            this.f33529i.resetLoadState();
            this.f33524d.m34461a(this.f33529i);
            this.f33524d.m34462a(this.f33532l);
            this.f33524d.m34459a(this.f33541u, this.f33542v);
            this.f33524d.m34458a(this.f33535o);
            this.f33524d.m34463b(str, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34493a(JSONObject jSONObject) {
        if (this.f33545y) {
            this.f33544x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            C12675a.m34575a(this.f33530j, "setStyleList", "", jSONObject);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m34497c(int i) {
        if (this.f33538r) {
            this.f33537q = i;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            C12675a.m34575a(this.f33530j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    private void m34499e(int i) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f33530j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i);
                C13392f.m38726a().m38728a((WebView) this.f33530j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            C13219q0.m37813a(f33514G, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    private void m34500g(int i) {
        if (this.f33540t) {
            this.f33539s = i;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f33530j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            C12675a.m34575a(this.f33530j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m34501h() {
        C12657c c12657c = this.f33525e;
        if (c12657c != null) {
            c12657c.m34404e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m34502i() {
        if (this.f33515A && this.f33516B && this.f33517C) {
            CampaignEx campaignExM34473a = C12658d.m34473a(this.f33529i, this.f33522b, this.f33521a, "", this.f33535o, true, true);
            C12657c c12657c = this.f33525e;
            if (c12657c != null) {
                c12657c.m34405f();
            }
            m34511b(campaignExM34473a);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m34503j() {
        m34488a(this.f33535o);
        m34497c(this.f33537q);
        m34500g(this.f33539s);
        m34493a(this.f33544x);
        m34499e(C13211m0.m37770s(C13008c.m36588n().m36542d()));
    }

    /* JADX INFO: renamed from: a */
    public String m34504a(String str) {
        C12656b c12656b = this.f33524d;
        return c12656b != null ? c12656b.m34457a(str) : "";
    }

    /* JADX INFO: renamed from: a */
    void m34505a(CampaignEx campaignEx, boolean z) {
        m34503j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f33546z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z) {
            if (this.f33532l == null) {
                this.f33532l = C13636h.m39706b().m39716c(C13008c.m36588n().m36533b(), this.f33521a);
            }
            this.f33528h = new C12662d(this, this.f33527g, campaignEx);
        }
        if (this.f33525e == null) {
            C12657c c12657c = new C12657c(C13008c.m36588n().m36542d(), this.f33522b, this.f33521a);
            this.f33525e = c12657c;
            c12657c.m34397a(this);
        }
        m34491a(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public void m34506a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f33527g = nativeAdvancedAdListener;
    }

    /* JADX INFO: renamed from: a */
    public void m34507a(boolean z) {
        this.f33533m = z;
    }

    /* JADX INFO: renamed from: b */
    public void m34508b() {
        if (this.f33527g != null) {
            this.f33527g = null;
        }
        if (this.f33526f != null) {
            this.f33526f = null;
        }
        if (this.f33528h != null) {
            this.f33528h = null;
        }
        C12656b c12656b = this.f33524d;
        if (c12656b != null) {
            c12656b.m34461a((MBNativeAdvancedView) null);
            this.f33524d.m34466e();
        }
        C12657c c12657c = this.f33525e;
        if (c12657c != null) {
            c12657c.m34406g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f33529i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        C12654c.m34381b(this.f33522b + this.f33521a + m34519e());
        C12680a c12680a = this.f33531k;
        if (c12680a != null) {
            c12680a.m34595b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f33546z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.f33520F);
            this.f33546z.removeAllViews();
            this.f33546z = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m34509b(int i) {
        this.f33536p = true;
        m34488a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m34510b(int i, int i2) {
        m34489a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m34511b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f33532l == null) {
                this.f33532l = C13636h.m39706b().m39716c(C13008c.m36588n().m36533b(), this.f33521a);
            }
            this.f33528h = new C12662d(this, this.f33527g, campaignEx);
            C13219q0.m37813a(f33514G, "show start");
            if (this.f33541u != 0 && this.f33542v != 0) {
                m34505a(campaignEx, false);
                return;
            }
            C12662d c12662d = this.f33528h;
            if (c12662d != null) {
                c12662d.m34526a(this.f33523c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m34512b(JSONObject jSONObject) {
        this.f33545y = true;
        m34493a(jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public boolean m34513b(String str) {
        return (this.f33546z == null || C12658d.m34473a(this.f33529i, this.f33522b, this.f33521a, str, this.f33535o, false, true) == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public String m34514c() {
        if (this.f33519E) {
            C12657c c12657c = this.f33525e;
            return c12657c != null ? c12657c.m34396a() : "";
        }
        C12656b c12656b = this.f33524d;
        return c12656b != null ? c12656b.m34464c() : "";
    }

    /* JADX INFO: renamed from: c */
    public void m34515c(String str) throws Throwable {
        C12660b c12660b = new C12660b(this, this.f33523c);
        this.f33526f = c12660b;
        c12660b.m34485a(this.f33527g);
        this.f33526f.m34486a(str);
        m34492a(str, 2);
    }

    /* JADX INFO: renamed from: d */
    public MBOutNativeAdvancedViewGroup m34516d() {
        return this.f33546z;
    }

    /* JADX INFO: renamed from: d */
    public void m34517d(int i) {
        this.f33538r = true;
        m34497c(i);
    }

    /* JADX INFO: renamed from: d */
    public void m34518d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            m34515c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33527g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f33523c, "bid  token is null or empty");
        }
    }

    /* JADX INFO: renamed from: e */
    public String m34519e() {
        if (this.f33519E) {
            C12657c c12657c = this.f33525e;
            return c12657c != null ? c12657c.m34403c() : "";
        }
        C12656b c12656b = this.f33524d;
        return c12656b != null ? c12656b.m34465d() : "";
    }

    /* JADX INFO: renamed from: f */
    public int m34520f() {
        return this.f33535o;
    }

    /* JADX INFO: renamed from: f */
    public void m34521f(int i) {
        if (i == 1) {
            this.f33515A = false;
        } else if (i == 2) {
            this.f33516B = false;
        } else if (i == 3) {
            this.f33517C = false;
        }
        m34501h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m34522g() {
        return this.f33533m;
    }

    /* JADX INFO: renamed from: h */
    public void m34523h(int i) {
        this.f33540t = true;
        m34500g(i);
    }

    /* JADX INFO: renamed from: i */
    public void m34524i(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.f33517C) {
                        return;
                    } else {
                        this.f33517C = true;
                    }
                }
            } else if (this.f33516B) {
                return;
            } else {
                this.f33516B = true;
            }
        } else if (this.f33515A) {
            return;
        } else {
            this.f33515A = true;
        }
        try {
            m34502i();
        } catch (Exception e) {
            C13219q0.m37816b(f33514G, e.getMessage());
        }
    }
}
