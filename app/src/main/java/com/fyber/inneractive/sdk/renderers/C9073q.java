package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8085c;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.network.C8360b0;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8454a0;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C9073q implements InterfaceC8454a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9074r f21234a;

    public C9073q(C9074r c9074r) {
        this.f21234a = c9074r;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20884a(C9152g1 c9152g1, EnumC9150g enumC9150g) {
        AbstractC9087e abstractC9087e;
        C8293b c8293b;
        C9074r c9074r = this.f21234a;
        Context context = c9074r.f21236m.getContext() == null ? AbstractC9174o.f21470a : this.f21234a.f21236m.getContext();
        AbstractC8236x abstractC8236x = this.f21234a.f17958b;
        return c9074r.m20479a(context, (abstractC8236x == null || (abstractC9087e = ((C8219t0) abstractC8236x).f18374b) == null || (c8293b = ((C9089g) abstractC9087e).f21329L) == null) ? null : c8293b.f18500b, c9152g1, enumC9150g, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20885a(String str, C9152g1 c9152g1, boolean z) {
        String str2;
        AbstractC9062f0 abstractC9062f0;
        AbstractC8236x abstractC8236x;
        C8293b c8293b;
        if (TextUtils.isEmpty(str) && (abstractC8236x = this.f21234a.f17958b) != null) {
            AbstractC9087e abstractC9087e = ((C8219t0) abstractC8236x).f18374b;
            str = (abstractC9087e == null || (c8293b = ((C9089g) abstractC9087e).f21329L) == null) ? null : c8293b.f18500b;
        }
        C9074r c9074r = this.f21234a;
        InterfaceC9124b interfaceC9124b = (InterfaceC8455b) c9074r.f21202k;
        if (interfaceC9124b == null && (abstractC9062f0 = c9074r.f21240q) != null) {
            interfaceC9124b = abstractC9062f0.f21205a;
        }
        C8093k c8093kM20944j = interfaceC9124b != null ? ((AbstractC8485z) interfaceC9124b).m20944j() : null;
        AbstractC8084b abstractC8084bM20530a = c8093kM20944j != null ? c8093kM20944j.f18001b.m20530a() : null;
        if (abstractC8084bM20530a instanceof AbstractC8085c) {
            String str3 = ((AbstractC8085c) abstractC8084bM20530a).f17988g.f18521g;
            if (TextUtils.isEmpty(str3)) {
                str2 = str;
            } else {
                str2 = str3;
            }
        } else {
            str2 = str;
        }
        C9074r c9074r2 = this.f21234a;
        return c9074r2.m20479a(c9074r2.m20483c((View) c9074r2.f21239p), str2, c9152g1, z ? EnumC9150g.DEFAULT_ENDCARD : EnumC9150g.VAST_ENDCARD, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20886a(int i, boolean z) {
        InterfaceC8889m interfaceC8889m;
        C9074r c9074r = this.f21234a;
        VideoContentListener videoContentListener = c9074r.f21237n;
        if (videoContentListener == null || (interfaceC8889m = c9074r.f21236m) == null || !((AbstractC8881e) interfaceC8889m).f20880e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20887a(View view) {
        C9074r c9074r = this.f21234a;
        if (c9074r.f17959c != null) {
            c9074r.m20483c(view);
            c9074r.m20484c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20888a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f21234a.m20483c(view), str);
            this.f21234a.m20484c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20889a(String str, String str2) {
        C9074r c9074r = this.f21234a;
        c9074r.getClass();
        IAlog.m21945a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.m21943a(c9074r));
        ViewGroup viewGroup = this.f21234a.f21239p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        C9074r c9074r2 = this.f21234a;
        if (c9074r2.f21244u) {
            c9074r2.getClass();
            IAlog.m21945a("%s redirect already reported for this ad", IAlog.m21943a(c9074r2));
            return;
        }
        C8360b0.m20734a(c9074r2.f21239p.getContext(), str, str2, this.f21234a.f17958b);
        C9074r c9074r3 = this.f21234a;
        c9074r3.f21244u = true;
        c9074r3.getClass();
        IAlog.m21945a("%s reporting auto redirect", IAlog.m21943a(c9074r3));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20890a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20891a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: c */
    public final void mo20892c() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: e */
    public final void mo20893e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: f */
    public final void mo20894f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: g */
    public final void mo20895g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: h */
    public final void mo20896h() {
        this.f21234a.m20480a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: i */
    public final void mo20897i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: j */
    public final void mo20898j() {
        this.f21234a.mo21862I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: o */
    public final EnumC8253m mo20899o() {
        return EnumC8253m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onPlayerError() {
        InterfaceC8889m interfaceC8889m;
        C9074r c9074r = this.f21234a;
        VideoContentListener videoContentListener = c9074r.f21237n;
        if (videoContentListener == null || (interfaceC8889m = c9074r.f21236m) == null || !((AbstractC8881e) interfaceC8889m).f20880e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onProgress(int i, int i2) {
        InterfaceC8889m interfaceC8889m;
        C9074r c9074r = this.f21234a;
        VideoContentListener videoContentListener = c9074r.f21237n;
        if (videoContentListener == null || (interfaceC8889m = c9074r.f21236m) == null || !((AbstractC8881e) interfaceC8889m).f20880e) {
            return;
        }
        videoContentListener.onProgress(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9125c
    /* JADX INFO: renamed from: t */
    public final void mo20488t() {
        this.f21234a.mo21862I();
    }
}
