package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C7851v;
import com.fyber.inneractive.sdk.bidder.adm.C7854y;
import com.fyber.inneractive.sdk.bidder.adm.EnumC7832c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a;
import com.fyber.inneractive.sdk.network.timeouts.request.C8421b;
import com.fyber.inneractive.sdk.network.timeouts.request.C8422c;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.nativead.C9095a;
import com.fyber.inneractive.sdk.util.AbstractC9173n1;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.f1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8375f1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18649p;

    /* JADX INFO: renamed from: q */
    public final C7854y f18650q;

    /* JADX INFO: renamed from: r */
    public int f18651r;

    /* JADX INFO: renamed from: s */
    public final AbstractC9087e f18652s;

    /* JADX INFO: renamed from: t */
    public final C8006r f18653t;

    /* JADX INFO: renamed from: u */
    public final AbstractC8420a f18654u;

    public C8375f1(C7851v c7851v, String str, C7854y c7854y, C8006r c8006r, AbstractC9087e abstractC9087e) {
        UnitDisplayType unitDisplayType;
        super(c7851v, C8377g0.f18655c.m20755a(), c8006r);
        this.f18651r = 0;
        this.f18725o = true;
        this.f18649p = str;
        this.f18650q = c7854y;
        this.f18652s = abstractC9087e;
        this.f18653t = c8006r;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String strName = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = strName.toLowerCase(locale);
        if (abstractC9087e == null || (unitDisplayType = abstractC9087e.f21314n) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = c7854y.f17514a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = AbstractC9173n1.m21986a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.f17654M.f17680l;
        C7983k c7983k = (C7983k) c8006r.m20432a(C7983k.class);
        this.f18654u = TextUtils.isEmpty(str2) ? new C8421b(c7983k, lowerCase) : new C8422c(lowerCase, c7983k, str2);
    }

    public C8375f1(C8375f1 c8375f1) {
        super(c8375f1);
        this.f18651r = 0;
        this.f18725o = true;
        this.f18649p = c8375f1.f18649p;
        this.f18650q = c8375f1.f18650q;
        this.f18652s = c8375f1.f18652s;
        this.f18653t = c8375f1.f18653t;
        this.f18654u = c8375f1.f18654u;
        this.f18651r = c8375f1.f18651r;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8391l mo20744a(String str) {
        IAlog.m21945a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.m21943a(this), Integer.valueOf(this.f18651r), Integer.valueOf(mo20752p().f18679a), Integer.valueOf(mo20752p().f18680b));
        return super.mo20744a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0, C8417t1 {
        C8401o0 c8401o0 = new C8401o0();
        try {
            InputStream inputStream = c8391l.f18668c;
            if (inputStream != null) {
                mo20749d(System.currentTimeMillis());
                StringBuffer stringBufferM22033b = AbstractC9195v.m22033b(inputStream);
                mo20746b(System.currentTimeMillis());
                String string = stringBufferM22033b.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f18650q.f17514a;
                int iMo20330a = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().mo20330a() : EnumC7832c.OTHER.mo20330a();
                C7854y c7854y = this.f18650q;
                c7854y.f17516c = string;
                AbstractC9087e abstractC9087eM20787a = m20787a(iMo20330a, (InterfaceC8400o) null, c7854y);
                abstractC9087eM20787a.f21308h = string;
                c8401o0.f18690a = abstractC9087eM20787a;
            }
            return c8401o0;
        } catch (C8359b e) {
            e = e;
            IAlog.m21945a("failed parse adm network request but will re-try url: %s msg: %s", this.f18649p, e.getMessage());
            mo20746b(System.currentTimeMillis());
            throw new C8417t1(e);
        } catch (C9095a e2) {
            mo20746b(System.currentTimeMillis());
            throw new C8398n0(e2.getMessage(), e2);
        } catch (SocketTimeoutException e3) {
            e = e3;
            IAlog.m21945a("failed parse adm network request but will re-try url: %s msg: %s", this.f18649p, e.getMessage());
            mo20746b(System.currentTimeMillis());
            throw new C8417t1(e);
        } catch (UnknownHostException e4) {
            e = e4;
            IAlog.m21945a("failed parse adm network request but will re-try url: %s msg: %s", this.f18649p, e.getMessage());
            mo20746b(System.currentTimeMillis());
            throw new C8417t1(e);
        } catch (Exception e5) {
            mo20746b(System.currentTimeMillis());
            IAlog.m21945a("failed parse adm network request url: %s msg: %s", this.f18649p, e5.getMessage());
            throw new C8398n0(e5);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final void mo20745a(long j) {
        super.mo20745a(j);
        IAlog.m21945a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.m21943a(this), Integer.valueOf(super.mo20753q()));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: b */
    public final void mo20746b(long j) {
        super.mo20746b(j);
        IAlog.m21945a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.m21943a(this), Integer.valueOf(super.mo20753q()));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: c */
    public final void mo20747c(long j) {
        super.mo20747c(j);
        IAlog.m21945a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: d */
    public final void mo20748d() {
        super.mo20748d();
        IAlog.m21945a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.m21943a(this), Integer.valueOf(this.f18651r));
        C8392l0 c8392l0 = IAConfigManager.f17654M.f17686r;
        this.f18711a = true;
        C8375f1 c8375f1 = new C8375f1(this);
        if ((c8392l0 instanceof C8392l0) && c8392l0.m20770c(c8375f1)) {
            return;
        }
        IAlog.m21945a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.m21943a(this), Integer.valueOf(this.f18651r));
        m20789a((Object) null, new Exception("Bidding ad request passed allowed time"), false);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: d */
    public final void mo20749d(long j) {
        super.mo20749d(j);
        IAlog.m21945a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return this.f18654u.mo20803c();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: j */
    public final int mo20750j() {
        int iMo20753q = super.mo20753q();
        AbstractC8420a abstractC8420a = this.f18654u;
        return ((abstractC8420a.mo20803c() + abstractC8420a.f18731f) * this.f18651r) + iMo20753q;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: k */
    public final C8006r mo20751k() {
        return this.f18653t;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: p */
    public final C8393l1 mo20752p() {
        AbstractC8420a abstractC8420a = this.f18654u;
        return new C8393l1(abstractC8420a.f18735i, abstractC8420a.f18734h);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: q */
    public final int mo20753q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return this.f18649p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: s */
    public final int mo20754s() {
        return this.f18654u.f18731f;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        if (this.f18711a) {
            return false;
        }
        int i = this.f18651r + 1;
        this.f18651r = i;
        if (i > this.f18654u.mo20801b()) {
            IAlog.m21945a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.m21943a(this), Integer.valueOf(this.f18651r - 1), Integer.valueOf(this.f18654u.mo20801b()), this.f18717g);
            return false;
        }
        IAlog.m21945a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.m21943a(this), Integer.valueOf(this.f18651r - 1), Integer.valueOf(this.f18654u.mo20801b()), this.f18717g);
        this.f18654u.mo20798a(this.f18651r);
        return true;
    }
}
