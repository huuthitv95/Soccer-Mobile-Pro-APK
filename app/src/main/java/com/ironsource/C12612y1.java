package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12612y1 extends AbstractC12295l3 {
    public C12612y1() {
        this.f30802H = "outcome";
        this.f30801G = 4;
        this.f30803I = IronSourceConstants.APP_EVENT_TYPE;
        m32042e();
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: c */
    protected int mo25614c(C12580w5 c12580w5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected void mo25615d() {
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: e */
    protected String mo25617e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: f */
    protected void mo25618f(C12580w5 c12580w5) {
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: h */
    protected boolean mo28078h(C12580w5 c12580w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: j */
    protected boolean mo25619j(C12580w5 c12580w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: d */
    protected boolean mo25616d(C12580w5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iM34046c = event.m34046c();
        return iM34046c == EnumC12598x5.FIRST_INSTANCE.m34138b() || iM34046c == EnumC12598x5.INIT_COMPLETE.m34138b() || iM34046c == EnumC12598x5.SDK_INIT_FAILED.m34138b() || iM34046c == EnumC12598x5.SDK_INIT_SUCCESS.m34138b();
    }
}
