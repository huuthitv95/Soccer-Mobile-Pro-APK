package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.endcard.C8107m;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.player.C8437b;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8901g;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.t0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8219t0 extends AbstractC8234w {

    /* JADX INFO: renamed from: i */
    public C8876t f18321i;

    /* JADX INFO: renamed from: j */
    public boolean f18322j;

    public C8219t0(InterfaceC8041s0 interfaceC8041s0, C8006r c8006r, C9089g c9089g, InneractiveAdRequest inneractiveAdRequest) {
        super(interfaceC8041s0, c8006r);
        this.f18322j = false;
        this.f18374b = c9089g;
        this.f18373a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: b */
    public final boolean mo20599b() {
        C8043t0 c8043t0;
        InterfaceC8041s0 interfaceC8041s0 = this.f18376d;
        if (interfaceC8041s0 == null || (c8043t0 = ((C8028r0) interfaceC8041s0).f17816f) == null) {
            IAlog.m21950f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.m21943a(this), this.f18376d);
            return false;
        }
        UnitDisplayType unitDisplayType = c8043t0.f17876j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: d */
    public final boolean mo20600d() {
        return this.f18321i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public final void destroy() {
        C8870n c8870n;
        if (this.f18353g != null && mo20599b()) {
            C9270v0 c9270v0 = this.f18353g;
            c9270v0.f21701y = true;
            c9270v0.f21675D = false;
            c9270v0.f21678b.f18414h.remove(c9270v0);
            c9270v0.f21685i = null;
            IAlog.m21945a("destroy internalStoreWebpageController", new Object[0]);
            this.f18353g = null;
        }
        C8876t c8876t = this.f18321i;
        if (c8876t != null) {
            C8437b c8437b = c8876t.f20848a;
            if (c8437b != null && (c8870n = c8437b.f18772b) != null) {
                c8870n.f20780i = true;
                IAlog.m21945a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                c8870n.m21399a();
                AbstractC8084b abstractC8084bM20530a = c8870n.f20838t.f18001b.m20530a();
                if (abstractC8084bM20530a != null) {
                    abstractC8084bM20530a.destroy();
                }
                if (c8870n.f20772a != null) {
                    IAlog.m21945a("%s : destroy() : playerController being destroyed", InneractiveMediationDefs.GENDER_FEMALE);
                    c8870n.f20772a.mo20835a();
                    c8870n.f20772a = null;
                }
                c8870n.f20783l = null;
                C8093k c8093k = c8870n.f20838t;
                if (c8093k != null) {
                    C8107m c8107m = c8093k.f18001b;
                    Iterator it = c8107m.f18036a.iterator();
                    while (it.hasNext()) {
                        ((AbstractC8084b) it.next()).destroy();
                    }
                    c8107m.f18036a.clear();
                    c8107m.f18037b.clear();
                    c8107m.f18038c = -1;
                }
                C8901g c8901g = c8870n.f20839u;
                if (c8901g != null) {
                    c8901g.f20953a.m21462a();
                }
                C8178b c8178b = c8870n.f20840v;
                if (c8178b != null) {
                    c8178b.f18211a.m20615a();
                    c8178b.m20601a();
                    c8178b.f18215e = null;
                    c8178b.f18218h.clear();
                }
            }
            this.f18321i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public boolean isVideoAd() {
        return true;
    }
}
