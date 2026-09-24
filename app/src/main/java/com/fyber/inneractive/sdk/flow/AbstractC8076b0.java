package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.click.AbstractC7927a;
import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.C7930d;
import com.fyber.inneractive.sdk.click.C7933g;
import com.fyber.inneractive.sdk.click.C7934h;
import com.fyber.inneractive.sdk.click.C7935i;
import com.fyber.inneractive.sdk.click.C7936j;
import com.fyber.inneractive.sdk.click.C7938l;
import com.fyber.inneractive.sdk.click.C7944r;
import com.fyber.inneractive.sdk.click.EnumC7943q;
import com.fyber.inneractive.sdk.click.InterfaceC7932f;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.config.C7961e;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7976d;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.model.vast.C8291a;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.network.C8381h1;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.C8430x;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.renderers.C9056c0;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9207y0;
import com.fyber.inneractive.sdk.util.C9209z0;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import com.fyber.inneractive.sdk.web.InterfaceC9266t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.b0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8076b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, InterfaceC7932f, InterfaceC9266t0 {

    /* JADX INFO: renamed from: a */
    public InneractiveAdSpot f17957a;

    /* JADX INFO: renamed from: b */
    public AbstractC8236x f17958b;

    /* JADX INFO: renamed from: c */
    public InneractiveUnitController.EventsListener f17959c;

    /* JADX INFO: renamed from: d */
    public boolean f17960d = false;

    /* JADX INFO: renamed from: e */
    public boolean f17961e = false;

    /* JADX INFO: renamed from: f */
    public boolean f17962f = true;

    /* JADX INFO: renamed from: g */
    public Runnable f17963g;

    /* JADX INFO: renamed from: h */
    public C7944r f17964h;

    /* JADX INFO: renamed from: i */
    public C8239z f17965i;

    /* JADX INFO: renamed from: j */
    public View f17966j;

    /* JADX INFO: renamed from: A */
    public final boolean m20471A() {
        C8006r c8006r;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || (c8006r = abstractC8236x.f18375c) == null || c8006r.m20432a(C7975c.class) == null) {
            return false;
        }
        C7975c c7975c = (C7975c) this.f17958b.f18375c.m20432a(C7975c.class);
        c7975c.getClass();
        return new ArrayList(c7975c.f17758c.values()).size() > 0;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo20472B() {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo20473C() {
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            return abstractC8236x.mo20599b();
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo20474D() {
        return this instanceof C9056c0;
    }

    /* JADX INFO: renamed from: E */
    public final void m20475E() {
        AbstractC9087e abstractC9087e;
        mo20490w();
        if (this.f17961e || this.f17959c == null) {
            return;
        }
        IAlog.m21945a("%sCalling external interface onAdImpression", IAlog.m21943a(this));
        this.f17959c.onAdImpression(this.f17957a);
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null && (abstractC9087e = abstractC8236x.f18374b) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            C8051x0 c8051x0 = iAConfigManager.f17691w;
            if (c8051x0 != null) {
                UnitDisplayType unitDisplayType = abstractC9087e.f21314n;
                ImpressionData impressionData = abstractC9087e.f21318r;
                c8051x0.m20458a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                c8051x0.m20458a(unitDisplayType, "LAST_APP_BUNDLE_ID", abstractC9087e.f21324x);
                if (this.f17958b.isVideoAd()) {
                    c8051x0.m20458a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                    c8051x0.m20458a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                c8051x0.m20458a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
            }
            C9207y0 c9207y0 = iAConfigManager.f17694z;
            InterfaceC8041s0 interfaceC8041s0 = this.f17958b.f18376d;
            ImpressionData impressionData2 = abstractC9087e.f21318r;
            if (interfaceC8041s0 != null) {
                OnGlobalImpressionDataListener onGlobalImpressionDataListener = c9207y0.f21513a;
                if (onGlobalImpressionDataListener != null) {
                    C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
                    onGlobalImpressionDataListener.onImpression(c8028r0.f17812b, c8028r0.f17811a, impressionData2);
                }
            } else {
                c9207y0.getClass();
            }
            InneractiveUnitController.EventsListener eventsListener = this.f17959c;
            if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f17957a, abstractC9087e.f21318r);
            } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f17957a, abstractC9087e.f21318r);
            }
        }
        this.f17961e = true;
    }

    /* JADX INFO: renamed from: F */
    public final void m20476F() {
        if (this.f17959c != null) {
            IAlog.m21945a("%sCalling external interface onAdWillOpenExternalApp", IAlog.m21943a(this));
            this.f17959c.onAdWillOpenExternalApp(this.f17957a);
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo20477G() {
        View viewMo20491x = mo20491x();
        if (viewMo20491x == null || this.f17966j == null || viewMo20491x.getParent() == null || !(viewMo20491x.getParent() instanceof ViewGroup)) {
            return;
        }
        viewMo20491x.getLayoutParams();
        ((ViewGroup) viewMo20491x.getParent()).removeView(this.f17966j);
        mo20486e(this.f17966j);
        this.f17966j = null;
    }

    /* JADX INFO: renamed from: H */
    public final void m20478H() {
        AbstractC9087e abstractC9087e;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || (abstractC9087e = abstractC8236x.f18374b) == null) {
            return;
        }
        String str = abstractC9087e.f21315o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.m21949e("%sfiring rewarded completion!", IAlog.m21943a(this));
        IAlog.m21948d("AD_REWARDED_COMPLETION", new Object[0]);
        C8435z0.m20813b(str);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:0: B:70:0x0126->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bf  */
    /* JADX INFO: renamed from: a */
    public final C9142d0 m20479a(Context context, String str, C9152g1 c9152g1, EnumC9150g enumC9150g, boolean z, InterfaceC7941o interfaceC7941o) {
        String queryParameter;
        String strReplace;
        boolean z2;
        String str2;
        C7944r c7944r;
        AbstractC8236x abstractC8236x;
        C9270v0 c9270v0Mo20633a;
        AbstractC8236x abstractC8236x2;
        boolean z3;
        AbstractC8236x abstractC8236x3;
        C7944r c7944r2;
        AbstractC8236x abstractC8236x4;
        EnumC8253m enumC8253m;
        InneractiveAdSpot inneractiveAdSpot;
        String localUniqueId;
        AbstractC9087e abstractC9087e;
        Iterator it;
        C8381h1 c8381h1;
        C9209z0 c9209z0;
        C7961e c7961e;
        boolean z4;
        AbstractC9087e abstractC9087e2;
        if (!z && (!this.f17962f || this.f17960d)) {
            String str3 = this.f17960d ? "external/browser is already open" : "click is in grace period";
            IAlog.m21945a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str3);
            return new C9142d0(EnumC9151g0.FAILED, new Exception(str3));
        }
        if (context != null) {
            IAlog.m21945a("%sBlocking clicks until grace has ended", IAlog.m21943a(this));
            this.f17962f = false;
            Runnable runnable = this.f17963g;
            if (runnable != null) {
                AbstractC9183r.f21478b.removeCallbacks(runnable);
            }
            RunnableC8074a0 runnableC8074a0 = new RunnableC8074a0(this);
            this.f17963g = runnableC8074a0;
            AbstractC9183r.f21478b.postDelayed(runnableC8074a0, 1000L);
        }
        float f = c9152g1.f21450a;
        m20484c(z);
        if (TextUtils.isEmpty(str)) {
            IAlog.m21945a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new Object[0]);
            return new C9142d0(EnumC9151g0.FAILED, new Exception("empty url"));
        }
        AbstractC8236x abstractC8236x5 = this.f17958b;
        if (abstractC8236x5 != null && (abstractC9087e2 = abstractC8236x5.f18374b) != null && abstractC9087e2.m21893a()) {
            C8248h c8248h = IAConfigManager.f17654M.f17660D;
            if (c8248h.f18412f) {
                c8248h.m20645a((InterfaceC4257a) null);
            }
        }
        this.f17965i = new C8239z(this, c9152g1, enumC9150g, interfaceC7941o);
        if (TextUtils.isEmpty(str)) {
            queryParameter = null;
        } else {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) {
                queryParameter = null;
            } else {
                queryParameter = uri.getQueryParameter("url");
            }
        }
        String scheme2 = !TextUtils.isEmpty(str) ? Uri.parse(str).getScheme() : null;
        if (TextUtils.isEmpty(queryParameter)) {
            strReplace = str;
            if (!strReplace.contains("FYBER_OPEN_BROWSER")) {
                z2 = true;
            }
            if (strReplace.contains("[IS_CTA_CLICK]")) {
                if (mo20472B() || enumC9150g != EnumC9150g.VIDEO_CTA) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z4));
            }
            str2 = strReplace;
            if (mo20491x() != null) {
                mo20489v();
            }
            c7944r = this.f17964h;
            if (c7944r != null) {
                c7944r.f17645f = true;
                it = c7944r.f17649j.iterator();
                while (it.hasNext()) {
                    ((AbstractC7927a) it.next()).mo20366a();
                }
                c7944r.f17649j.clear();
                c8381h1 = c7944r.f17648i;
                if (c8381h1 != null) {
                    c8381h1.f18711a = true;
                }
                c9209z0 = c7944r.f17640a;
                c9209z0.f21517c = false;
                c7961e = IAConfigManager.f17654M.f17691w.f17889b;
                if (c7961e != null) {
                    c7961e.f17716a.remove(c9209z0);
                }
                c7944r.f17644e = null;
                this.f17964h = null;
            }
            C7944r c7944r3 = new C7944r(z2, this.f17958b);
            c7944r3.f17649j.addAll(Arrays.asList(new C7935i(!z2, scheme2), new C7933g(this, c9152g1, enumC9150g), new C7930d(), new C7934h(), new C7938l()));
            this.f17964h = c7944r3;
            abstractC8236x = this.f17958b;
            if (abstractC8236x != null) {
                c9270v0Mo20633a = abstractC8236x.mo20633a();
            } else {
                c9270v0Mo20633a = null;
            }
            if (c9270v0Mo20633a != null) {
                c9270v0Mo20633a.f21685i = this;
            }
            abstractC8236x2 = this.f17958b;
            if (abstractC8236x2 == null && abstractC8236x2.mo20635a(c9152g1.f21452c, enumC9150g)) {
                z3 = true;
            } else {
                z3 = false;
            }
            abstractC8236x3 = this.f17958b;
            if (abstractC8236x3 != null && abstractC8236x3.f18374b != null) {
                abstractC8236x3.mo20637e();
            }
            c7944r2 = this.f17964h;
            if (c7944r2 != null) {
                C8239z c8239z = this.f17965i;
                abstractC8236x4 = this.f17958b;
                if (abstractC8236x4 != null || (abstractC9087e = abstractC8236x4.f18374b) == null) {
                    enumC8253m = EnumC8253m.NONE;
                } else {
                    enumC8253m = abstractC9087e.f21295E;
                }
                EnumC8253m enumC8253m2 = enumC8253m;
                inneractiveAdSpot = this.f17957a;
                if (inneractiveAdSpot != null) {
                    localUniqueId = inneractiveAdSpot.getLocalUniqueId();
                } else {
                    localUniqueId = null;
                }
                c7944r2.m20373a(context, str2, c8239z, c9270v0Mo20633a, z3, enumC8253m2, localUniqueId);
            }
            EnumC9151g0 enumC9151g0 = EnumC9151g0.OPEN_IN_EXTERNAL_APPLICATION;
            context.getClass();
            return new C9142d0(enumC9151g0, null);
        }
        strReplace = queryParameter;
        z2 = false;
        if (strReplace.contains("[IS_CTA_CLICK]")) {
            if (mo20472B()) {
                z4 = false;
            } else {
                z4 = false;
            }
            strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z4));
        }
        str2 = strReplace;
        if (mo20491x() != null) {
            mo20489v();
        }
        c7944r = this.f17964h;
        if (c7944r != null) {
            c7944r.f17645f = true;
            it = c7944r.f17649j.iterator();
            while (it.hasNext()) {
                ((AbstractC7927a) it.next()).mo20366a();
            }
            c7944r.f17649j.clear();
            c8381h1 = c7944r.f17648i;
            if (c8381h1 != null) {
                c8381h1.f18711a = true;
            }
            c9209z0 = c7944r.f17640a;
            c9209z0.f21517c = false;
            c7961e = IAConfigManager.f17654M.f17691w.f17889b;
            if (c7961e != null) {
                c7961e.f17716a.remove(c9209z0);
            }
            c7944r.f17644e = null;
            this.f17964h = null;
        }
        C7944r c7944r4 = new C7944r(z2, this.f17958b);
        c7944r4.f17649j.addAll(Arrays.asList(new C7935i(!z2, scheme2), new C7933g(this, c9152g1, enumC9150g), new C7930d(), new C7934h(), new C7938l()));
        this.f17964h = c7944r4;
        abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            c9270v0Mo20633a = abstractC8236x.mo20633a();
        } else {
            c9270v0Mo20633a = null;
        }
        if (c9270v0Mo20633a != null) {
            c9270v0Mo20633a.f21685i = this;
        }
        abstractC8236x2 = this.f17958b;
        if (abstractC8236x2 == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        abstractC8236x3 = this.f17958b;
        if (abstractC8236x3 != null) {
            abstractC8236x3.mo20637e();
        }
        c7944r2 = this.f17964h;
        if (c7944r2 != null) {
            C8239z c8239z2 = this.f17965i;
            abstractC8236x4 = this.f17958b;
            if (abstractC8236x4 != null) {
                enumC8253m = EnumC8253m.NONE;
            } else {
                enumC8253m = EnumC8253m.NONE;
            }
            EnumC8253m enumC8253m3 = enumC8253m;
            inneractiveAdSpot = this.f17957a;
            if (inneractiveAdSpot != null) {
                localUniqueId = inneractiveAdSpot.getLocalUniqueId();
            } else {
                localUniqueId = null;
            }
            c7944r2.m20373a(context, str2, c8239z2, c9270v0Mo20633a, z3, enumC8253m3, localUniqueId);
        }
        EnumC9151g0 enumC9151g1 = EnumC9151g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new C9142d0(enumC9151g1, null);
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC7932f
    /* JADX INFO: renamed from: a */
    public final void mo20327a(C7928b c7928b, C9152g1 c9152g1, EnumC9150g enumC9150g) {
        m20482b(c7928b, c9152g1, enumC9150g);
    }

    /* JADX INFO: renamed from: a */
    public final void m20480a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        AbstractC8236x abstractC8236x = this.f17958b;
        AbstractC8434z.m20811a(simpleName, message, abstractC8236x != null ? abstractC8236x.f18373a : null, abstractC8236x != null ? abstractC8236x.f18374b : null);
        if (this.f17959c != null) {
            IAlog.m21945a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.m21943a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f17959c.onAdEnteredErrorState(this.f17957a, webViewRendererProcessHasGoneError);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20481a(String str, EnumC7943q enumC7943q) {
        JSONArray jSONArrayM20435b;
        AbstractC9087e abstractC9087e;
        InneractiveAdRequest inneractiveAdRequest;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            abstractC9087e = abstractC8236x.f18374b;
            inneractiveAdRequest = abstractC8236x.f18373a;
            C8006r c8006r = abstractC8236x.f18375c;
            jSONArrayM20435b = c8006r != null ? c8006r.m20435b() : null;
        } else {
            jSONArrayM20435b = null;
            abstractC9087e = null;
            inneractiveAdRequest = null;
        }
        EnumC8424u enumC8424u = EnumC8424u.EXTERNAL_BROWSER_OPENED;
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        c8428w.m20807a("url", str).m20807a("fallback", (enumC7943q == EnumC7943q.OPENED_USING_CHROME_NAVIGATE || enumC7943q == EnumC7943q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").m20808a((String) null);
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6  */
    /* JADX INFO: renamed from: b */
    public final void m20482b(C7928b c7928b, C9152g1 c9152g1, EnumC9150g enumC9150g) {
        boolean z;
        C8006r c8006r;
        C8006r c8006r2;
        C8006r c8006r3;
        AbstractC8236x abstractC8236x = this.f17958b;
        InneractiveAdRequest inneractiveAdRequest = abstractC8236x != null ? abstractC8236x.f18373a : null;
        AbstractC9087e abstractC9087e = abstractC8236x != null ? abstractC8236x.f18374b : null;
        JSONArray jSONArrayM20435b = (abstractC8236x == null || (c8006r3 = abstractC8236x.f18375c) == null) ? null : c8006r3.m20435b();
        EnumC8424u enumC8424u = EnumC8424u.FYBER_SUCCESS_CLICK;
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        C8430x c8430x = new C8430x();
        int iMo20493z = mo20493z();
        int iMo20492y = mo20492y();
        long j = c7928b.f17611e;
        if (j != 0) {
            c8430x.m20809a(Long.valueOf(j), "time_passed");
        }
        JSONArray jSONArray = new JSONArray();
        for (C7936j c7936j : c7928b.f17612f) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", c7936j.f17629a);
                jSONObject.put("success", c7936j.f17630b);
                jSONObject.put("opened_by", c7936j.f17631c);
                jSONObject.put("reason", c7936j.f17632d);
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        c8430x.m20809a(jSONArray, "urls");
        c8430x.m20809a(enumC9150g, "origin");
        if (enumC9150g == EnumC9150g.FMP_ENDCARD) {
            c8430x.m20809a(enumC9150g.m21961a(), "version");
        }
        if (c9152g1 != null && c9152g1.f21452c) {
            c8430x.m20809a(Boolean.TRUE, "is_auto_click");
        }
        boolean z2 = false;
        if (c9152g1 != null) {
            if (c9152g1.f21450a > 0.0f && c9152g1.f21451b > 0.0f) {
                int iM21998b = mo20473C() ? iMo20493z : AbstractC9174o.m21998b(iMo20493z);
                float f = iM21998b == 0 ? 0.0f : c9152g1.f21450a / iM21998b;
                int iM21998b2 = mo20473C() ? iMo20492y : AbstractC9174o.m21998b(iMo20492y);
                float f2 = iM21998b2 != 0 ? c9152g1.f21451b / iM21998b2 : 0.0f;
                IAlog.m21945a("Point location -  x - %.2f , y- %.2f", Float.valueOf(f), Float.valueOf(f2));
                mo20473C();
                Locale locale = Locale.ENGLISH;
                C8430x c8430xM20809a = c8430x.m20809a(String.format(locale, "%.2f", Float.valueOf(f)), "td_x");
                mo20473C();
                c8430xM20809a.m20809a(String.format(locale, "%.2f", Float.valueOf(f2)), "td_y");
            }
        }
        if (mo20473C() || mo20474D()) {
            c8430x.m20809a(AbstractC9174o.m22000c() == 1 ? "p" : CmcdData.Factory.STREAM_TYPE_LIVE, "o");
        } else if (iMo20493z > 0 || iMo20492y > 0) {
            c8430x.m20809a(Integer.valueOf(iMo20493z), "b_w");
            c8430x.m20809a(Integer.valueOf(iMo20492y), "b_h");
        }
        AbstractC8236x abstractC8236x2 = this.f17958b;
        C7976d c7976d = (abstractC8236x2 == null || (c8006r2 = abstractC8236x2.f18375c) == null) ? null : (C7976d) c8006r2.m20432a(C7976d.class);
        if (c7976d != null) {
            C8291a c8291a = c7976d.f17756e;
            if (c8291a != null ? c8291a.f18497d : false) {
                if (EnumC9150g.DEFAULT_ENDCARD.equals(enumC9150g) || EnumC9150g.VIDEO_CTA.equals(enumC9150g)) {
                    z2 = true;
                } else if (EnumC9150g.VIDEO_CLICK.equals(enumC9150g)) {
                    AbstractC8236x abstractC8236x3 = this.f17958b;
                    C7994v c7994v = (abstractC8236x3 == null || (c8006r = abstractC8236x3.f18375c) == null) ? null : (C7994v) c8006r.m20432a(C7994v.class);
                    if (c7994v == null) {
                        z = false;
                    } else {
                        Boolean boolMo20420c = c7994v.mo20420c("show_cta");
                        if (boolMo20420c != null ? boolMo20420c.booleanValue() : true) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        z2 = true;
                    }
                }
            }
        }
        if (z2) {
            c8430x.m20809a(IAConfigManager.f17654M.f17683o, "cta_lng");
        }
        c8428w.f18758f.put(c8430x.f18760a);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: c */
    public final Context m20483c(View view) {
        View view2;
        View[] viewArr = {view, mo20491x()};
        for (int i = 0; i < 2; i++) {
            view2 = viewArr[i];
            if (view2 != null) {
                return AbstractC9174o.m21989a(view2);
            }
        }
        view2 = null;
        return AbstractC9174o.m21989a(view2);
    }

    /* JADX INFO: renamed from: c */
    public final void m20484c(boolean z) {
        AbstractC9087e abstractC9087e;
        if (z) {
            IAlog.m21945a("%s : will not notify click on fallback", IAlog.m21943a(this));
            return;
        }
        if (this.f17959c != null) {
            IAlog.m21945a("%sCalling external interface onAdClicked", IAlog.m21943a(this));
            this.f17959c.onAdClicked(this.f17957a);
        }
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || (abstractC9087e = abstractC8236x.f18374b) == null) {
            return;
        }
        IAConfigManager.f17654M.f17691w.m20458a(abstractC9087e.f21314n, "LAST_CLICKED", "1");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void mo20485d(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f17960d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f17960d = false;
        }
        Runnable runnable = this.f17963g;
        if (runnable != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnable);
            this.f17963g = null;
        }
        this.f17958b = null;
        this.f17959c = null;
        this.f17957a = null;
        if (this.f17964h != null) {
            mo20477G();
            C7944r c7944r = this.f17964h;
            c7944r.f17645f = true;
            Iterator it = c7944r.f17649j.iterator();
            while (it.hasNext()) {
                ((AbstractC7927a) it.next()).mo20366a();
            }
            c7944r.f17649j.clear();
            C8381h1 c8381h1 = c7944r.f17648i;
            if (c8381h1 != null) {
                c8381h1.f18711a = true;
            }
            C9209z0 c9209z0 = c7944r.f17640a;
            c9209z0.f21517c = false;
            C7961e c7961e = IAConfigManager.f17654M.f17691w.f17889b;
            if (c7961e != null) {
                c7961e.f17716a.remove(c9209z0);
            }
            c7944r.f17644e = null;
            this.f17964h = null;
            this.f17965i = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo20486e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f17957a = inneractiveAdSpot;
        this.f17958b = inneractiveAdSpot.getAdContent();
        this.f17959c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    /* JADX INFO: renamed from: o */
    public final EnumC8253m m20487o() {
        AbstractC9087e abstractC9087e;
        AbstractC8236x abstractC8236x = this.f17958b;
        return (abstractC8236x == null || !abstractC8236x.mo20636c() || (abstractC9087e = this.f17958b.f18374b) == null) ? EnumC8253m.NONE : abstractC9087e.f21295E;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        m20476F();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.m21945a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f17960d) {
            this.f17960d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f17959c != null) {
            IAlog.m21945a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m21943a(this));
            this.f17959c.onAdWillCloseInternalBrowser(this.f17957a);
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo20488t() {
        m20475E();
    }

    /* JADX INFO: renamed from: v */
    public void mo20489v() {
        View viewMo20491x = mo20491x();
        if (viewMo20491x == null || viewMo20491x.getParent() == null || !(viewMo20491x.getParent() instanceof ViewGroup) || this.f17966j != null) {
            return;
        }
        View viewInflate = View.inflate(viewMo20491x.getContext(), C7809R.layout.ia_layout_click_overlay, null);
        this.f17966j = viewInflate;
        if (viewInflate != null) {
            ((ViewGroup) viewMo20491x.getParent()).addView(this.f17966j, viewMo20491x.getLayoutParams());
            mo20485d(this.f17966j);
        }
    }

    /* JADX INFO: renamed from: w */
    public Context mo20490w() {
        return AbstractC9174o.m21989a(mo20491x());
    }

    /* JADX INFO: renamed from: x */
    public abstract View mo20491x();

    /* JADX INFO: renamed from: y */
    public int mo20492y() {
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public int mo20493z() {
        return -1;
    }
}
