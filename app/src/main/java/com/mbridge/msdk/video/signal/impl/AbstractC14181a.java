package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.InterfaceC14078a;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.videocommon.setting.C14223c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a */
/* JADX INFO: compiled from: BaseDefaultJSCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14181a implements InterfaceC14173d {

    /* JADX INFO: renamed from: j */
    protected String f40916j;

    /* JADX INFO: renamed from: k */
    protected C14223c f40917k;

    /* JADX INFO: renamed from: l */
    protected C12682a f40918l;

    /* JADX INFO: renamed from: a */
    protected boolean f40907a = false;

    /* JADX INFO: renamed from: b */
    protected boolean f40908b = false;

    /* JADX INFO: renamed from: c */
    protected int f40909c = 0;

    /* JADX INFO: renamed from: d */
    protected int f40910d = 0;

    /* JADX INFO: renamed from: e */
    protected int f40911e = 0;

    /* JADX INFO: renamed from: f */
    protected int f40912f = 0;

    /* JADX INFO: renamed from: g */
    protected int f40913g = 0;

    /* JADX INFO: renamed from: h */
    protected int f40914h = 1;

    /* JADX INFO: renamed from: i */
    protected int f40915i = -1;

    /* JADX INFO: renamed from: m */
    public InterfaceC14078a.a f40919m = new a();

    /* JADX INFO: renamed from: n */
    protected int f40920n = 2;

    /* JADX INFO: renamed from: o */
    protected int f40921o = 2;

    /* JADX INFO: renamed from: p */
    private AdSession f40922p = null;

    /* JADX INFO: renamed from: q */
    private MediaEvents f40923q = null;

    /* JADX INFO: renamed from: r */
    private AdEvents f40924r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a */
    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class a implements InterfaceC14078a.a {
        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41601a() {
            C13219q0.m37813a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41602a(int i, String str) {
            C13219q0.m37813a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41603a(boolean z) {
            C13219q0.m37813a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            C13219q0.m37813a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            C13219q0.m37813a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            C13219q0.m37813a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            C13219q0.m37813a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            C13219q0.m37813a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        public void onInitSuccess() {
            C13219q0.m37813a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            C13219q0.m37813a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            C13219q0.m37813a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            C13219q0.m37813a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            C13219q0.m37813a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$b */
    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class b implements InterfaceC14078a.a {

        /* JADX INFO: renamed from: a */
        private InterfaceC14173d f40925a;

        /* JADX INFO: renamed from: b */
        private InterfaceC14078a.a f40926b;

        public b(InterfaceC14173d interfaceC14173d, InterfaceC14078a.a aVar) {
            this.f40925a = interfaceC14173d;
            this.f40926b = aVar;
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41601a() {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.mo41601a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41602a(int i, String str) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.mo41602a(i, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        /* JADX INFO: renamed from: a */
        public void mo41603a(boolean z) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.mo41603a(z);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onDownloadProgress(i);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onFinishRedirection(campaign, str);
            }
            InterfaceC14173d interfaceC14173d = this.f40925a;
            if (interfaceC14173d != null) {
                interfaceC14173d.mo42223f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.InterfaceC14078a.a
        public void onInitSuccess() {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            InterfaceC14078a.a aVar = this.f40926b;
            return aVar != null && aVar.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onRedirectionFailed(campaign, str);
            }
            InterfaceC14173d interfaceC14173d = this.f40925a;
            if (interfaceC14173d != null) {
                interfaceC14173d.mo42223f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            InterfaceC14078a.a aVar = this.f40926b;
            if (aVar != null) {
                aVar.onStartRedirection(campaign, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42207a(int i) {
        this.f40915i = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42208a(int i, String str) {
        C13219q0.m37813a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42209a(InterfaceC14078a.a aVar) {
        C13219q0.m37813a("DefaultJSCommon", "setTrackingListener:" + aVar);
        this.f40919m = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42210a(String str) {
        C13219q0.m37813a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public void mo42211a(boolean z) {
        C13219q0.m37813a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.f40908b = z;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: a */
    public boolean mo42212a() {
        return this.f40907a;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: b */
    public int mo42213b() {
        return this.f40913g;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: b */
    public void mo42214b(int i) {
        this.f40909c = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: b */
    public void mo42215b(boolean z) {
        this.f40907a = z;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: c */
    public String mo42216c() {
        C13219q0.m37813a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: c */
    public void mo42217c(int i) {
        this.f40911e = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14174e
    public void click(int i, String str) {
        C13219q0.m37813a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: d */
    public int mo42218d() {
        C13219q0.m37813a("DefaultJSCommon", "getAlertDialogRole " + this.f40914h);
        return this.f40914h;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: d */
    public void mo42219d(int i) {
        C13219q0.m37813a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.f40914h = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: e */
    public String mo42220e() {
        C13219q0.m37813a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: e */
    public void mo42221e(int i) {
        this.f40910d = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: f */
    public String mo42222f(int i) {
        C13219q0.m37813a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: f */
    public void mo42223f() {
        C13219q0.m37813a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: g */
    public String mo42224g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: g */
    public void mo42225g(int i) {
        this.f40920n = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: h */
    public void mo42226h() {
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14174e
    public void handlerH5Exception(int i, String str) {
        C13219q0.m37813a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    /* JADX INFO: renamed from: i */
    public int mo42227i() {
        return this.f40915i;
    }

    /* JADX INFO: renamed from: j */
    public AdEvents m42351j() {
        return this.f40924r;
    }

    /* JADX INFO: renamed from: k */
    public AdSession m42352k() {
        return this.f40922p;
    }

    /* JADX INFO: renamed from: l */
    public int m42353l() {
        if (this.f40909c == 0 && this.f40908b) {
            this.f40909c = 1;
        }
        return this.f40909c;
    }

    /* JADX INFO: renamed from: m */
    public int m42354m() {
        if (this.f40910d == 0 && this.f40908b) {
            this.f40910d = 1;
        }
        return this.f40910d;
    }

    /* JADX INFO: renamed from: n */
    public int m42355n() {
        if (this.f40911e == 0 && this.f40908b) {
            this.f40911e = 1;
        }
        return this.f40911e;
    }

    /* JADX INFO: renamed from: o */
    public MediaEvents m42356o() {
        return this.f40923q;
    }

    /* JADX INFO: renamed from: p */
    public boolean m42357p() {
        return this.f40908b;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void release() {
        C13219q0.m37813a("DefaultJSCommon", "release");
        C12682a c12682a = this.f40918l;
        if (c12682a != null) {
            c12682a.m34638a(false);
            this.f40918l.m34636a((NativeListener.NativeTrackingListener) null);
            this.f40918l.m34640c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setActivity(Activity activity) {
        C13219q0.m37813a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setAdEvents(AdEvents adEvents) {
        this.f40924r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setAdSession(AdSession adSession) {
        this.f40922p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setRewardUnitSetting(C14223c c14223c) {
        C13219q0.m37813a("DefaultJSCommon", "setSetting:" + c14223c);
        this.f40917k = c14223c;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setUnitId(String str) {
        C13219q0.m37813a("DefaultJSCommon", "setUnitId:" + str);
        this.f40916j = str;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f40923q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14078a
    public void setWebViewFront(int i) {
        this.f40913g = i;
    }
}
