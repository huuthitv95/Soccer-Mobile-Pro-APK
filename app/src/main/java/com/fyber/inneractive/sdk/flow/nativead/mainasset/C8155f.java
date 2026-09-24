package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.C8220u;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.nativead.C8142f;
import com.fyber.inneractive.sdk.flow.nativead.EnumC8138b;
import com.fyber.inneractive.sdk.player.InterfaceC8875s;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.response.nativead.C9099e;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.mainasset.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8155f implements InterfaceC8153d, InterfaceC8875s {

    /* JADX INFO: renamed from: a */
    public final C8006r f18154a;

    /* JADX INFO: renamed from: b */
    public final C9100f f18155b;

    /* JADX INFO: renamed from: c */
    public C9089g f18156c;

    /* JADX INFO: renamed from: d */
    public InneractiveAdRequest f18157d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8152c f18158e;

    /* JADX INFO: renamed from: g */
    public EnumC8138b f18160g = EnumC8138b.UNINITIALIZED;

    /* JADX INFO: renamed from: f */
    public C8220u f18159f = new C8220u();

    public C8155f(C9100f c9100f, C8006r c8006r, C9089g c9089g, InneractiveAdRequest inneractiveAdRequest, String str, C8142f c8142f) {
        this.f18155b = c9100f;
        this.f18154a = c8006r;
        this.f18156c = c9089g;
        this.f18157d = inneractiveAdRequest;
        this.f18158e = c8142f;
    }

    @Override // com.fyber.inneractive.sdk.player.InterfaceC8875s
    /* JADX INFO: renamed from: a */
    public final void mo20570a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), EnumC8125i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.f18160g = EnumC8138b.FAILED;
        InterfaceC8152c interfaceC8152c = this.f18158e;
        if (interfaceC8152c != null) {
            ((C8142f) interfaceC8152c).m20565a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: a */
    public final boolean mo20562a() {
        return this.f18160g == EnumC8138b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    /* JADX INFO: renamed from: b */
    public final void mo20563b() {
        C9100f c9100f;
        C9099e c9099e;
        String str;
        C9089g c9089g;
        if (this.f18159f != null && (c9100f = this.f18155b) != null && (c9099e = c9100f.f21344c) != null && (str = c9099e.f21341a) != null && !str.trim().isEmpty() && (c9089g = this.f18156c) != null) {
            this.f18160g = EnumC8138b.LOADING;
            this.f18159f.m20623a(this.f18154a, c9089g, this.f18157d, this);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.VIDEO_ERROR_NULL);
        this.f18160g = EnumC8138b.FAILED;
        InterfaceC8152c interfaceC8152c = this.f18158e;
        if (interfaceC8152c != null) {
            ((C8142f) interfaceC8152c).m20565a(inneractiveInfrastructureError, "mVideoContentLoader is null, can't start loading");
        }
        IAlog.m21946b("%smVideoContentLoader is null, can't start loading", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.InterfaceC8875s
    /* JADX INFO: renamed from: c */
    public final void mo20571c() throws Throwable {
        C8220u c8220u;
        this.f18160g = EnumC8138b.LOADED;
        InterfaceC8152c interfaceC8152c = this.f18158e;
        if (interfaceC8152c == null || (c8220u = this.f18159f) == null) {
            IAlog.m21946b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", IAlog.m21943a(this), Boolean.valueOf(this.f18158e == null), Boolean.valueOf(this.f18159f == null));
            return;
        }
        C8219t0 c8219t0 = (C8219t0) c8220u.f18091c;
        C8142f c8142f = (C8142f) interfaceC8152c;
        c8142f.getClass();
        if (c8219t0 == null) {
            c8142f.m20565a(new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, EnumC8125i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
            return;
        }
        if (c8219t0 != null) {
            c8142f.f18118e = c8219t0;
        }
        c8142f.m20564a();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8139c
    public final void destroy() {
        C8220u c8220u = this.f18159f;
        if (c8220u != null) {
            AbstractC8236x abstractC8236x = c8220u.f18091c;
            if (abstractC8236x != null) {
                ((C8219t0) abstractC8236x).destroy();
            }
            C8220u c8220u2 = this.f18159f;
            c8220u2.getClass();
            IAlog.m21945a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.m21943a(c8220u2));
            AbstractC9183r.f21478b.removeCallbacks(c8220u2.f18100l);
            c8220u2.f18099k.m20496a();
            this.f18159f = null;
        }
        this.f18158e = null;
        this.f18157d = null;
        this.f18156c = null;
        this.f18160g = EnumC8138b.DESTROYED;
    }
}
