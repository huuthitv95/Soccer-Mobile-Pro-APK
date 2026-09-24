package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7990r;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.EnumC8250j;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import com.fyber.inneractive.sdk.web.C9272w0;
import com.fyber.inneractive.sdk.web.RunnableC9251n0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.w */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8234w extends AbstractC8236x {

    /* JADX INFO: renamed from: g */
    public C9270v0 f18353g;

    /* JADX INFO: renamed from: h */
    public final C8222v f18354h;

    public AbstractC8234w(InterfaceC8041s0 interfaceC8041s0, C8006r c8006r) {
        super(interfaceC8041s0, c8006r);
        this.f18354h = new C8222v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: a */
    public final C9270v0 mo20633a() {
        return this.f18353g;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: a */
    public final void mo20634a(String str) {
        EnumC8253m enumC8253m;
        AbstractC9087e abstractC9087e;
        EnumC8253m enumC8253m2 = EnumC8253m.NONE;
        AbstractC9087e abstractC9087e2 = this.f18374b;
        if (abstractC9087e2 != null) {
            EnumC8253m enumC8253m3 = abstractC9087e2.f21295E;
            enumC8253m3.getClass();
            enumC8253m = EnumC8253m.SINGLE_TAP;
            if (enumC8253m3 != enumC8253m) {
                EnumC8253m enumC8253m4 = this.f18374b.f21295E;
                enumC8253m4.getClass();
                if (enumC8253m4 != EnumC8253m.TRUE_SINGLE_TAP || isVideoAd()) {
                    enumC8253m = this.f18374b.f21295E;
                } else {
                    this.f18354h.m20626a(EnumC8415t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                }
            }
        } else {
            enumC8253m = enumC8253m2;
        }
        C8248h c8248h = IAConfigManager.f17654M.f17660D;
        if (!c8248h.f18412f || (abstractC9087e = this.f18374b) == null || !abstractC9087e.m21893a() || !c8248h.m20650n()) {
            AbstractC9087e abstractC9087e3 = this.f18374b;
            if (abstractC9087e3 != null) {
                abstractC9087e3.f21295E = enumC8253m2;
                return;
            }
            return;
        }
        AbstractC9087e abstractC9087e4 = this.f18374b;
        String str2 = abstractC9087e4 != null ? abstractC9087e4.f21324x : null;
        C9272w0 c9272w0 = new C9272w0();
        c9272w0.f21704a = str2;
        c9272w0.f21705b = enumC8253m;
        c9272w0.f21706c = str;
        c9272w0.f21707d = this.f18375c;
        c9272w0.f21708e = abstractC9087e4 != null ? abstractC9087e4.f21294D : null;
        c9272w0.f21709f = abstractC9087e4 != null ? abstractC9087e4.f21296F : null;
        c9272w0.f21710g = this.f18354h;
        C9270v0 c9270v0 = new C9270v0(c9272w0);
        this.f18353g = c9270v0;
        C7990r c7990r = (C7990r) this.f18375c.m20432a(C7990r.class);
        if (c7990r == null || str2 == null) {
            return;
        }
        String strMo20417a = c7990r.mo20417a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
        c9270v0.m22092e(strMo20417a == null ? "" : strMo20417a.replace("[BUNDLE_ID]", str2));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: a */
    public final boolean mo20635a(boolean z, EnumC9150g enumC9150g) {
        AbstractC9087e abstractC9087e = this.f18374b;
        EnumC8253m enumC8253m = abstractC9087e != null ? abstractC9087e.f21295E : EnumC8253m.NONE;
        if (z || enumC8253m == null || enumC8253m != EnumC8253m.TRUE_SINGLE_TAP) {
            return false;
        }
        return enumC9150g == EnumC9150g.VIDEO_CTA || enumC9150g == EnumC9150g.DEFAULT_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: c */
    public final boolean mo20636c() {
        C9270v0 c9270v0 = this.f18353g;
        return c9270v0 != null && c9270v0.f21688l;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: e */
    public final void mo20637e() {
        AbstractC9087e abstractC9087e;
        AbstractC9087e abstractC9087e2;
        C8248h c8248h = IAConfigManager.f17654M.f17660D;
        if (!c8248h.f18412f || (abstractC9087e = this.f18374b) == null || !abstractC9087e.m21893a() || !c8248h.m20650n() || mo20636c() || (abstractC9087e2 = this.f18374b) == null) {
            return;
        }
        EnumC8253m enumC8253m = abstractC9087e2.f21295E;
        EnumC8253m enumC8253m2 = EnumC8253m.NONE;
        if (enumC8253m != enumC8253m2) {
            IAlog.m21945a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
            AbstractC9087e abstractC9087e3 = this.f18374b;
            if (enumC8253m2 == null) {
                abstractC9087e3.getClass();
            }
            abstractC9087e3.f21295E = enumC8253m2;
            C9270v0 c9270v0 = this.f18353g;
            if (c9270v0 != null) {
                RunnableC9251n0 runnableC9251n0 = c9270v0.f21692p;
                if (runnableC9251n0 != null) {
                    AbstractC9183r.f21478b.removeCallbacks(runnableC9251n0);
                    c9270v0.f21692p = null;
                }
                if (!c9270v0.f21701y) {
                    c9270v0.f21677a.stopLoading();
                }
                this.f18354h.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.f18353g.f21687k, EnumC8250j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.m20652a(), this.f18374b.f21295E);
            }
        }
    }
}
