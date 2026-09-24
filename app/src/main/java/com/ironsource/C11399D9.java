package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.D9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11399D9 extends AbstractC12295l3 {

    /* JADX INFO: renamed from: R */
    private static C11399D9 f24205R;

    /* JADX INFO: renamed from: P */
    private String f24206P;

    /* JADX INFO: renamed from: Q */
    private final InterfaceC11524K8 f24207Q = C11455Gb.m25891U().mo25852s();

    private C11399D9() {
        this.f30802H = "ironbeast";
        this.f30801G = 2;
        this.f30803I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f24206P = "";
    }

    /* JADX INFO: renamed from: i */
    public static synchronized C11399D9 m25613i() {
        if (f24205R == null) {
            C11399D9 c11399d9 = new C11399D9();
            f24205R = c11399d9;
            c11399d9.m32042e();
        }
        return f24205R;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: c */
    protected int mo25614c(C12580w5 c12580w5) {
        int iM32043f = m32043f(c12580w5.m34046c());
        if (iM32043f == AbstractC12295l3.e.BANNER.m32048b()) {
            return this.f24207Q.mo26265a(IronSource.EnumC12328a.BANNER);
        }
        return iM32043f == AbstractC12295l3.e.NATIVE_AD.m32048b() ? this.f24207Q.mo26265a(IronSource.EnumC12328a.NATIVE_AD) : this.f24207Q.mo26265a(IronSource.EnumC12328a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected boolean mo25616d(C12580w5 c12580w5) {
        int iM34046c = c12580w5.m34046c();
        return iM34046c == EnumC12598x5.IS_CALLBACK_LOAD_SUCCESS.m34138b() || iM34046c == EnumC12598x5.IS_INSTANCE_OPENED.m34138b() || iM34046c == EnumC12598x5.IS_INSTANCE_CLOSED.m34138b() || iM34046c == EnumC12598x5.IS_AUCTION_SUCCESS.m34138b() || iM34046c == EnumC12598x5.IS_AUCTION_FAILED.m34138b() || iM34046c == EnumC12598x5.BN_INSTANCE_SHOW.m34138b() || iM34046c == EnumC12598x5.BN_AUCTION_SUCCESS.m34138b() || iM34046c == EnumC12598x5.BN_AUCTION_FAILED.m34138b() || iM34046c == EnumC12598x5.NT_INSTANCE_LOAD_SUCCESS.m34138b() || iM34046c == EnumC12598x5.NT_INSTANCE_SHOW.m34138b() || iM34046c == EnumC12598x5.NT_AUCTION_SUCCESS.m34138b() || iM34046c == EnumC12598x5.NT_AUCTION_FAILED.m34138b();
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: e */
    protected String mo25617e(int i) {
        return this.f24206P;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: f */
    protected void mo25618f(C12580w5 c12580w5) {
        this.f24206P = c12580w5.m34045b().optString("placement");
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: j */
    protected boolean mo25619j(C12580w5 c12580w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected void mo25615d() {
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_LOAD_CALLED.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_CALLBACK_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_LOAD_FAILED.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_LOAD_NO_FILL.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_READY_TRUE.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.IS_INSTANCE_READY_FALSE.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_CALLBACK_LOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_RELOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_CALLBACK_RELOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_CALLBACK_RELOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_RELOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_LOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_RELOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_RELOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.BN_INSTANCE_SHOW.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_CALLBACK_LOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_INSTANCE_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_INSTANCE_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_INSTANCE_LOAD_ERROR.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.NT_INSTANCE_SHOW.m34138b()));
    }
}
