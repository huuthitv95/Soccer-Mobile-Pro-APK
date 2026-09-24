package com.fyber.inneractive.sdk.p278ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.mraid.AbstractC8326e;
import com.fyber.inneractive.sdk.mraid.AbstractC8328f;
import com.fyber.inneractive.sdk.mraid.AbstractC8334j;
import com.fyber.inneractive.sdk.mraid.C8327e0;
import com.fyber.inneractive.sdk.mraid.C8330g;
import com.fyber.inneractive.sdk.mraid.C8332h;
import com.fyber.inneractive.sdk.mraid.C8333i;
import com.fyber.inneractive.sdk.mraid.C8336l;
import com.fyber.inneractive.sdk.mraid.C8337m;
import com.fyber.inneractive.sdk.mraid.C8338n;
import com.fyber.inneractive.sdk.mraid.C8339o;
import com.fyber.inneractive.sdk.mraid.C8340p;
import com.fyber.inneractive.sdk.mraid.C8341q;
import com.fyber.inneractive.sdk.mraid.C8342r;
import com.fyber.inneractive.sdk.mraid.C8343s;
import com.fyber.inneractive.sdk.mraid.C8344t;
import com.fyber.inneractive.sdk.mraid.C8345u;
import com.fyber.inneractive.sdk.mraid.C8346v;
import com.fyber.inneractive.sdk.mraid.C8347w;
import com.fyber.inneractive.sdk.mraid.EnumC8329f0;
import com.fyber.inneractive.sdk.mraid.EnumC8335k;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.C9230f0;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.EnumC9221c0;
import com.fyber.inneractive.sdk.web.EnumC9224d0;
import com.fyber.inneractive.sdk.web.EnumC9277z;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9233g0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class IAmraidWebViewController extends AbstractC9239i0 {

    /* JADX INFO: renamed from: r0 */
    public final RunnableC9127e f21398r0;

    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError() {
            super("an MRAID video has not started playing in a timely fashion");
        }
    }

    public IAmraidWebViewController(boolean z, EnumC9221c0 enumC9221c0, EnumC9277z enumC9277z, EnumC9224d0 enumC9224d0, boolean z2, C8271e c8271e, C8006r c8006r) {
        super(z, enumC9221c0, enumC9277z, enumC9224d0, c8271e, c8006r);
        this.f21398r0 = new RunnableC9127e(this);
        this.f21619F = z2;
        this.f21565b.setId(C7809R.id.ia_inneractive_webview_mraid);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9239i0, com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: a */
    public final void mo21933a(boolean z) {
        C9248m c9248m;
        super.mo21933a(z);
        if (this.f21617D && this.f21616C && this.f21614A && (c9248m = this.f21565b) != null) {
            StringBuilder sb = new StringBuilder("FyberMraidVideoController.");
            sb.append(z ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb.append("();");
            c9248m.m22085a(sb.toString());
        }
        if (this.f21565b == null || !z) {
            return;
        }
        Handler handler = AbstractC9183r.f21478b;
        handler.postDelayed(new RunnableC9128f(this), 1L);
        handler.postDelayed(new RunnableC9128f(this), 100L);
        handler.postDelayed(new RunnableC9128f(this), 250L);
        handler.postDelayed(new RunnableC9128f(this), 1000L);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9239i0, com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public final boolean mo21934a(WebView webView, String str) {
        C8006r c8006r;
        IAlog.m21945a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f21565b == null) {
            IAlog.m21945a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
        if (lowerCase != null) {
            Locale locale = Locale.US;
            if (lowerCase.startsWith("FyMraidVideo".toLowerCase(locale))) {
                if (lowerCase.endsWith("fyMraidVideoAd".toLowerCase(locale))) {
                    C8040s c8040s = IAConfigManager.f17654M.f17688t;
                    C8021o c8021o = c8040s != null ? c8040s.f17862b : null;
                    if (c8021o == null ? false : c8021o.m20446a(false, "e_61")) {
                        IAlog.m21949e("Dispatching MRAID Video detection event", new Object[0]);
                        AbstractC9087e abstractC9087e = this.f21583t;
                        if (abstractC9087e == null) {
                            AbstractC8236x abstractC8236x = this.f21582s;
                            abstractC9087e = abstractC8236x == null ? null : abstractC8236x.f18374b;
                        }
                        EnumC8424u enumC8424u = EnumC8424u.MRAID_VIDEO_DETECTED;
                        InneractiveAdRequest inneractiveAdRequest = this.f21581r;
                        AbstractC8236x abstractC8236x2 = this.f21582s;
                        JSONArray jSONArrayM20435b = (abstractC8236x2 == null || (c8006r = abstractC8236x2.f18375c) == null) ? null : c8006r.m20435b();
                        C8428w c8428w = new C8428w(abstractC9087e);
                        c8428w.f18755c = enumC8424u;
                        c8428w.f18753a = inneractiveAdRequest;
                        c8428w.f18756d = jSONArrayM20435b;
                        c8428w.m20808a((String) null);
                    } else {
                        IAlog.m21945a("%sEvent 61 is disabled", IAlog.m21943a(this));
                    }
                    this.f21617D = true;
                    mo21939n();
                } else if (lowerCase.endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase(locale))) {
                    IAlog.m21946b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                    InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
                    if (interfaceC9243j1 != null) {
                        this.f21595X = false;
                        if (interfaceC9243j1 != null) {
                            ((InterfaceC9218b0) interfaceC9243j1).mo20926b(false);
                        }
                        EnumC8415t enumC8415t = EnumC8415t.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                        InneractiveAdRequest inneractiveAdRequest2 = this.f21581r;
                        AbstractC8236x abstractC8236x3 = this.f21582s;
                        AbstractC9087e abstractC9087e2 = abstractC8236x3 == null ? null : abstractC8236x3.f18374b;
                        JSONArray jSONArrayM20435b2 = abstractC8236x3 == null ? null : abstractC8236x3.f18375c.m20435b();
                        C8428w c8428w2 = new C8428w(abstractC9087e2);
                        c8428w2.f18754b = enumC8415t;
                        c8428w2.f18753a = inneractiveAdRequest2;
                        c8428w2.f18756d = jSONArrayM20435b2;
                        c8428w2.m20807a("video_timeout_in_msecs", String.valueOf(5000)).m20808a((String) null);
                    }
                    InterfaceC9243j1 interfaceC9243j2 = this.f21570g;
                    if (interfaceC9243j2 != null) {
                        ((InterfaceC9218b0) interfaceC9243j2).mo20922a(new MraidVideoFailedToDisplayError());
                    }
                } else if (str.toLowerCase(locale).endsWith("fyMraidVideoAdCompleted".toLowerCase(locale))) {
                    InterfaceC9243j1 interfaceC9243j3 = this.f21570g;
                    if (interfaceC9243j3 instanceof InterfaceC9233g0) {
                        ((InterfaceC9233g0) interfaceC9243j3).mo21868b();
                    }
                }
                return true;
            }
        }
        return super.mo21934a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: a */
    public final boolean mo21935a(String str, C9152g1 c9152g1) {
        AbstractC8328f c8330g;
        C9248m c9248m;
        Uri uri = Uri.parse(str);
        String string = uri.toString();
        uri.getScheme();
        if (string.startsWith("iaadfinishedloading")) {
            if (string.endsWith("success")) {
                IAlog.m21949e("received iaadfinishedloading success", new Object[0]);
                if (!this.f21564a && this.f21569f != null && (c9248m = this.f21565b) != null) {
                    c9248m.m22084a();
                    this.f21564a = true;
                    m22079q();
                }
            }
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        C9248m c9248m2 = this.f21565b;
        if (c9248m2 != null && c9248m2.isShown() && this.f21585N != EnumC8329f0.HIDDEN) {
            if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                return false;
            }
            URI uriCreate = URI.create(str);
            String host = uriCreate.getHost();
            try {
                LinkedHashMap linkedHashMapM22067a = AbstractC9239i0.m22067a(uriCreate);
                switch (AbstractC8334j.f18605a[EnumC8335k.m20722a(host).ordinal()]) {
                    case 1:
                        c8330g = new C8330g(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 2:
                        c8330g = new C8333i(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 3:
                        c8330g = new C8347w(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 4:
                        c8330g = new C8341q(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 5:
                        c8330g = new C8343s(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 6:
                        c8330g = new C8339o(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 7:
                        c8330g = new C8345u(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 8:
                        c8330g = new C8344t(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 9:
                        c8330g = new C8342r(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 10:
                        c8330g = new C8346v(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 11:
                        c8330g = new C8336l(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 12:
                        c8330g = new C8337m(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 13:
                        c8330g = new C8338n(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 14:
                        c8330g = new C8340p(linkedHashMapM22067a, this, c9152g1);
                        break;
                    case 15:
                        c8330g = new C8332h(linkedHashMapM22067a, this, c9152g1);
                        break;
                    default:
                        c8330g = null;
                        break;
                }
                if (c8330g == null || ((c8330g instanceof C8333i) && this.f21588Q == EnumC9221c0.INTERSTITIAL)) {
                    C9248m c9248m3 = this.f21565b;
                    if (c9248m3 != null) {
                        c9248m3.m22085a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                } else {
                    c8330g.f18600a = host;
                    IAlog.m21949e("Processing MRaid command: %s", host);
                    if (c8330g instanceof AbstractC8326e) {
                        m22060a(new C9230f0(this, (AbstractC8326e) c8330g));
                    } else {
                        if (c8330g.mo20717b()) {
                            m22064i();
                        }
                        c8330g.mo20721a();
                    }
                    C9248m c9248m4 = this.f21565b;
                    if (c9248m4 != null) {
                        c9248m4.m22085a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: e */
    public final void mo21936e() {
        mo22061b(false);
        Handler handler = AbstractC9183r.f21478b;
        handler.removeCallbacks(this.f21398r0);
        handler.removeCallbacks(this.f21623J);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: f */
    public final AbstractC8280e mo21937f() {
        return this.f21622I;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    @Override // com.fyber.inneractive.sdk.web.AbstractC9239i0, com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: k */
    public final void mo21938k() {
        boolean z;
        String externalStorageState;
        int size;
        super.mo21938k();
        C9248m c9248m = this.f21565b;
        if (c9248m == null || c9248m.getContext() == null) {
            z = false;
        } else {
            try {
                size = AbstractC9174o.f21470a.getPackageManager().queryIntentActivities(new Intent(this.f21565b.getContext(), (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class), 0).size();
            } catch (Throwable unused) {
                size = 0;
            }
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        C8327e0 c8327e0 = new C8327e0();
        c8327e0.f18596b = AbstractC9162k.m21978n();
        c8327e0.f18595a = AbstractC9162k.m21978n();
        c8327e0.f18597c = true;
        c8327e0.f18599e = z;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Throwable unused2) {
            externalStorageState = "";
        }
        c8327e0.f18598d = "mounted".equals(externalStorageState) && AbstractC9174o.f21470a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        m22081a(c8327e0);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: n */
    public final void mo21939n() {
        C9248m c9248m;
        if (this.f21616C && this.f21617D && this.f21614A && (c9248m = this.f21565b) != null) {
            c9248m.m22085a("FyberMraidVideoController.play()");
            RunnableC9127e runnableC9127e = this.f21398r0;
            if (runnableC9127e != null) {
                AbstractC9183r.f21478b.postDelayed(runnableC9127e, 5000L);
            }
            if (this.f21618E) {
                this.f21565b.m22085a("FyberMraidVideoController.mute(true)");
            }
        }
    }
}
