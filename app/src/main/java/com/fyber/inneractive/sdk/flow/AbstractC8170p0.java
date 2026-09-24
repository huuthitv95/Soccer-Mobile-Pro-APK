package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9132a;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.p0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8170p0 extends AbstractC8076b0 implements InterfaceC8265f {

    /* JADX INFO: renamed from: k */
    public InterfaceC8264e f18192k;

    /* JADX INFO: renamed from: l */
    public Runnable f18193l;

    /* JADX INFO: renamed from: m */
    public C9197v1 f18194m;

    /* JADX INFO: renamed from: n */
    public Runnable f18195n;

    /* JADX INFO: renamed from: o */
    public C9197v1 f18196o;

    /* JADX INFO: renamed from: r */
    public long f18199r;

    /* JADX INFO: renamed from: w */
    public CountDownTimerC8134m0 f18204w;

    /* JADX INFO: renamed from: p */
    public boolean f18197p = false;

    /* JADX INFO: renamed from: q */
    public boolean f18198q = false;

    /* JADX INFO: renamed from: s */
    public boolean f18200s = false;

    /* JADX INFO: renamed from: t */
    public boolean f18201t = false;

    /* JADX INFO: renamed from: u */
    public final C9132a f18202u = new C9132a();

    /* JADX INFO: renamed from: v */
    public final C9132a f18203v = new C9132a();

    /* JADX INFO: renamed from: I */
    public abstract boolean mo20585I();

    /* JADX INFO: renamed from: J */
    public final void m20586J() {
        if (this.f18193l == null) {
            long jMo20589M = mo20589M();
            this.f18199r = jMo20589M;
            this.f18193l = new RunnableC8132l0(this, jMo20589M);
            IAlog.m21945a("%senabling close with delay %d", IAlog.m21943a(this), Long.valueOf(this.f18199r));
            AbstractC8236x abstractC8236x = this.f17958b;
            boolean zMo20596b = abstractC8236x != null ? mo20596b(abstractC8236x) : false;
            if (!zMo20596b || mo20585I()) {
                if (this.f18198q) {
                    return;
                }
                this.f18198q = true;
                C9197v1 c9197v1 = new C9197v1(TimeUnit.MILLISECONDS, this.f18199r);
                this.f18194m = c9197v1;
                c9197v1.f21502e = new C8136n0(this);
                c9197v1.f21501d = false;
                c9197v1.f21500c.sendEmptyMessage(1932593528);
                return;
            }
            if (zMo20596b) {
                InterfaceC8264e interfaceC8264e = this.f18192k;
                if (interfaceC8264e != null) {
                    interfaceC8264e.showCloseCountdown();
                }
                CountDownTimerC8134m0 countDownTimerC8134m0 = new CountDownTimerC8134m0(this, this.f18199r + 100);
                this.f18204w = countDownTimerC8134m0;
                countDownTimerC8134m0.start();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract int mo20587K();

    /* JADX INFO: renamed from: L */
    public abstract int mo20588L();

    /* JADX INFO: renamed from: M */
    public abstract long mo20589M();

    /* JADX INFO: renamed from: N */
    public abstract boolean mo20590N();

    /* JADX INFO: renamed from: a */
    public abstract long mo20591a(long j);

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public void mo20592a(InterfaceC8213a interfaceC8213a) {
        IAlog.m21950f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public void mo20593a(InterfaceC8264e interfaceC8264e, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f17957a == null) {
            IAlog.m21950f("%sYou must set the spot to render before calling renderAd", IAlog.m21943a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (interfaceC8264e != null) {
            this.f18192k = interfaceC8264e;
        } else {
            IAlog.m21950f("%srenderAd called with a null activity!", IAlog.m21943a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: b */
    public void mo20594b(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: b */
    public boolean mo20595b(InterfaceC8213a interfaceC8213a) {
        IAlog.m21950f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo20596b(AbstractC8236x abstractC8236x);

    /* JADX INFO: renamed from: d */
    public final void m20597d(boolean z) {
        C8428w c8428w;
        if (this.f17958b == null) {
            EnumC8424u enumC8424u = EnumC8424u.MRAID_CUSTOM_CLOSE_DETECTED;
            c8428w = new C8428w((AbstractC9087e) null);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = null;
            c8428w.f18756d = null;
        } else {
            EnumC8424u enumC8424u2 = EnumC8424u.MRAID_CUSTOM_CLOSE_DETECTED;
            AbstractC8236x abstractC8236x = this.f17958b;
            InneractiveAdRequest inneractiveAdRequest = abstractC8236x.f18373a;
            AbstractC9087e abstractC9087e = abstractC8236x.f18374b;
            JSONArray jSONArrayM20435b = abstractC8236x.f18375c.m20435b();
            c8428w = new C8428w(abstractC9087e);
            c8428w.f18755c = enumC8424u2;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", boolValueOf);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", boolValueOf);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f18193l;
        if (runnable != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnable);
            this.f18193l = null;
        }
        Runnable runnable2 = this.f18195n;
        if (runnable2 != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnable2);
            this.f18195n = null;
        }
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.destroy();
        }
        this.f18192k = null;
        CountDownTimerC8134m0 countDownTimerC8134m0 = this.f18204w;
        if (countDownTimerC8134m0 != null) {
            countDownTimerC8134m0.cancel();
            this.f18204w = null;
        }
        C9197v1 c9197v1 = this.f18196o;
        if (c9197v1 != null) {
            c9197v1.f21502e = null;
            this.f18196o = null;
        }
        C9197v1 c9197v2 = this.f18194m;
        if (c9197v2 != null) {
            c9197v2.f21502e = null;
            this.f18194m = null;
        }
        super.destroy();
    }

    /* JADX INFO: renamed from: e */
    public final void m20598e(boolean z) {
        C8428w c8428w;
        this.f18197p = true;
        if (z) {
            if (this.f17958b == null) {
                EnumC8424u enumC8424u = EnumC8424u.FAIL_SAFE_ACTIVATED;
                c8428w = new C8428w((AbstractC9087e) null);
                c8428w.f18755c = enumC8424u;
                c8428w.f18753a = null;
                c8428w.f18756d = null;
            } else {
                EnumC8424u enumC8424u2 = EnumC8424u.FAIL_SAFE_ACTIVATED;
                AbstractC8236x abstractC8236x = this.f17958b;
                InneractiveAdRequest inneractiveAdRequest = abstractC8236x.f18373a;
                AbstractC9087e abstractC9087e = abstractC8236x.f18374b;
                JSONArray jSONArrayM20435b = abstractC8236x.f18375c.m20435b();
                c8428w = new C8428w(abstractC9087e);
                c8428w.f18755c = enumC8424u2;
                c8428w.f18753a = inneractiveAdRequest;
                c8428w.f18756d = jSONArrayM20435b;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean boolValueOf = Boolean.valueOf(mo20590N());
            try {
                jSONObject.put("is_endcard", boolValueOf);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "is_endcard", boolValueOf);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
        }
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.showCloseButton(z, mo20588L(), mo20587K());
            if (z) {
                return;
            }
            C9132a c9132a = this.f18203v;
            c9132a.f21432d = 0L;
            c9132a.f21433e = 0L;
            c9132a.f21434f = 0L;
            c9132a.f21430b = false;
            c9132a.m21953a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f18203v.f21429a = inneractiveAdSpot;
        this.f18202u.f21429a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: x */
    public final View mo20491x() {
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e != null) {
            return interfaceC8264e.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: y */
    public final int mo20492y() {
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e == null || interfaceC8264e.getLayout() == null) {
            return 1;
        }
        return this.f18192k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: z */
    public final int mo20493z() {
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e == null || interfaceC8264e.getLayout() == null) {
            return 1;
        }
        return this.f18192k.getLayout().getWidth();
    }
}
