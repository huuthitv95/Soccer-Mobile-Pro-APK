package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.Td */
/* JADX INFO: loaded from: classes6.dex */
public class C11686Td extends AbstractC12295l3 {

    /* JADX INFO: renamed from: R */
    private static C11686Td f25817R;

    /* JADX INFO: renamed from: P */
    private String f25818P;

    /* JADX INFO: renamed from: Q */
    private final InterfaceC11524K8 f25819Q = C11455Gb.m25891U().mo25852s();

    private C11686Td() {
        this.f30802H = "outcome";
        this.f30801G = 3;
        this.f30803I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f25818P = "";
    }

    /* JADX INFO: renamed from: i */
    public static synchronized C11686Td m27533i() {
        if (f25817R == null) {
            C11686Td c11686Td = new C11686Td();
            f25817R = c11686Td;
            c11686Td.m32042e();
        }
        return f25817R;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: c */
    protected int mo25614c(C12580w5 c12580w5) {
        return this.f25819Q.mo26265a(IronSource.EnumC12328a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected boolean mo25616d(C12580w5 c12580w5) {
        int iM34046c = c12580w5.m34046c();
        return iM34046c == EnumC12598x5.FIRST_INSTANCE.m34138b() || iM34046c == EnumC12598x5.INIT_COMPLETE.m34138b() || iM34046c == EnumC12598x5.SDK_INIT_FAILED.m34138b() || iM34046c == EnumC12598x5.SDK_INIT_SUCCESS.m34138b() || iM34046c == EnumC12598x5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.m34138b() || iM34046c == EnumC12598x5.RV_BUSINESS_INSTANCE_OPENED.m34138b() || iM34046c == EnumC12598x5.RV_INSTANCE_CLOSED.m34138b() || iM34046c == EnumC12598x5.RV_BUSINESS_INSTANCE_REWARDED.m34138b() || iM34046c == EnumC12598x5.RV_AUCTION_FAILED.m34138b() || iM34046c == EnumC12598x5.RV_AUCTION_SUCCESS.m34138b();
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: e */
    protected String mo25617e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f25818P : "";
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: f */
    protected void mo25618f(C12580w5 c12580w5) {
        if (c12580w5.m34046c() == 15 || (c12580w5.m34046c() >= 300 && c12580w5.m34046c() < 400)) {
            this.f25818P = c12580w5.m34045b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: j */
    protected boolean mo25619j(C12580w5 c12580w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected void mo25615d() {
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_BUSINESS_MEDIATION_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_LOAD_FAILED.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_SHOW_CHANCE.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_READY_TRUE.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_READY_FALSE.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_LOAD_FAILED_REASON.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_INSTANCE_LOAD_NO_FILL.m34138b()));
        this.f30804J.add(Integer.valueOf(EnumC12598x5.RV_MEDIATION_LOAD_ERROR.m34138b()));
    }
}
