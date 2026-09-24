package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.EnumC8049w0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.endcard.C8109o;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9236h0;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8482w extends AbstractC9236h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8485z f18893a;

    public C8482w(AbstractC8485z abstractC8485z) {
        this.f18893a = abstractC8485z;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20920a(String str, C9152g1 c9152g1) {
        Object obj;
        AbstractC8085c abstractC8085c;
        AbstractC8085c abstractC8085c2;
        AbstractC8085c abstractC8085c3;
        AbstractC8485z abstractC8485z = this.f18893a;
        abstractC8485z.getClass();
        IAlog.m21945a("%sweb view callback: onClicked", IAlog.m21943a(abstractC8485z));
        this.f18893a.m20934a(EnumC8049w0.COMPANION.m20455a());
        AbstractC8485z abstractC8485z2 = this.f18893a;
        if (abstractC8485z2.f18903g == null) {
            return new C9142d0(EnumC9151g0.FAILED, new Exception("mListener is null, internal SDK fatal error"));
        }
        AbstractC8846f abstractC8846f = abstractC8485z2.f18897a;
        if (abstractC8846f != null) {
            C8870n c8870n = (C8870n) abstractC8846f;
            C8093k c8093k = c8870n.f20838t;
            AbstractC8084b abstractC8084bM20530a = c8093k.f18001b.m20530a();
            if (abstractC8084bM20530a != null && abstractC8084bM20530a.mo20514j() && (abstractC8085c = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Other)) == null && (abstractC8085c2 = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Html)) == null && (abstractC8085c3 = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Iframe)) == null) {
                obj = abstractC8084bM20530a;
                obj = abstractC8084bM20530a;
                obj = abstractC8085c;
                obj = abstractC8085c2;
                obj = abstractC8085c3;
                obj = (AbstractC8085c) c8093k.f18001b.m20531a(EnumC8300i.Static);
            }
            obj = abstractC8084bM20530a;
            obj = abstractC8084bM20530a;
            obj = abstractC8085c;
            obj = abstractC8085c2;
            obj = abstractC8085c3;
            obj = abstractC8084bM20530a;
            obj = abstractC8084bM20530a;
            obj = abstractC8085c;
            obj = abstractC8085c2;
            obj = abstractC8084bM20530a;
            obj = abstractC8084bM20530a;
            obj = abstractC8085c;
            obj = abstractC8084bM20530a;
            obj = abstractC8084bM20530a;
            obj = abstractC8084bM20530a;
            AbstractC8084b abstractC8084bM20530a2 = c8870n.f20838t.f18001b.m20530a();
            EnumC8315x enumC8315x = EnumC8315x.EVENT_CLICK;
            InterfaceC9091i interfaceC9091i = obj instanceof InterfaceC9091i ? (InterfaceC9091i) obj : null;
            List listMo20518a = interfaceC9091i != null ? interfaceC9091i.mo20518a(enumC8315x) : null;
            if (listMo20518a == null || listMo20518a.isEmpty()) {
                this.f18893a.getClass();
                if ((abstractC8084bM20530a2 instanceof C8109o) && ((C8109o) abstractC8084bM20530a2).f18041h.f21519b > 0) {
                    c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.COMPANION, enumC8315x);
                }
            } else {
                abstractC8846f.mo21401a((InterfaceC9091i) obj, VideoClickOrigin.COMPANION, enumC8315x);
            }
        }
        IAlog.m21948d("AD_CLICKED", new Object[0]);
        AbstractC8902s abstractC8902s = this.f18893a.f18900d;
        if (abstractC8902s != null) {
            abstractC8902s.mo21445g();
        }
        return this.f18893a.f18903g.mo20885a(str, c9152g1, false);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20921a() {
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20896h();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20922a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20923a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        AbstractC8485z abstractC8485z = this.f18893a;
        abstractC8485z.getClass();
        sb.append(IAlog.m21943a(abstractC8485z));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.m21945a(sb.toString(), new Object[0]);
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20889a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20924a(boolean z, Orientation orientation) {
        AbstractC8485z abstractC8485z = this.f18893a;
        abstractC8485z.getClass();
        IAlog.m21945a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.m21943a(abstractC8485z), Boolean.valueOf(z), orientation.toString());
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20891a(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final boolean mo20925a(String str) {
        View endCardView = this.f18893a.f18900d.getEndCardView();
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 == null) {
            return false;
        }
        interfaceC8466g0.mo20888a(endCardView, str);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: b */
    public final void mo20926b(boolean z) {
        AbstractC8485z abstractC8485z = this.f18893a;
        abstractC8485z.getClass();
        IAlog.m21945a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.m21943a(abstractC8485z), Boolean.valueOf(z));
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 == null || !z) {
            return;
        }
        interfaceC8466g0.mo20894f();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: c */
    public final void mo20927c() {
        AbstractC8485z abstractC8485z = this.f18893a;
        if (abstractC8485z.f18903g != null) {
            AbstractC8902s abstractC8902s = abstractC8485z.f18900d;
            this.f18893a.f18903g.mo20887a(abstractC8902s != null ? abstractC8902s.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: d */
    public final void mo20928d() {
        AbstractC8485z abstractC8485z = this.f18893a;
        if (abstractC8485z.f18903g != null) {
            AbstractC8902s abstractC8902s = abstractC8485z.f18900d;
            this.f18893a.f18903g.mo20887a(abstractC8902s != null ? abstractC8902s.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: e */
    public final void mo20929e() {
        AbstractC8485z abstractC8485z = this.f18893a;
        abstractC8485z.getClass();
        IAlog.m21945a("%sweb view callback: onClickedAndOpen", IAlog.m21943a(abstractC8485z));
        this.f18893a.m20934a(EnumC8049w0.COMPANION.m20455a());
        AbstractC8485z abstractC8485z2 = this.f18893a;
        if (abstractC8485z2.f18903g != null) {
            AbstractC8846f abstractC8846f = abstractC8485z2.f18897a;
            if (abstractC8846f != null) {
                AbstractC8084b abstractC8084bM20530a = ((C8870n) abstractC8846f).f20838t.f18001b.m20530a();
                if (abstractC8084bM20530a instanceof AbstractC8085c) {
                    abstractC8846f.mo21401a((AbstractC8085c) abstractC8084bM20530a, VideoClickOrigin.COMPANION, EnumC8315x.EVENT_CLICK);
                }
            }
            IAlog.m21948d("AD_CLICKED", new Object[0]);
            this.f18893a.f18903g.mo20893e();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    public final void onClose() {
        InterfaceC8466g0 interfaceC8466g0 = this.f18893a.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20897i();
        }
    }
}
