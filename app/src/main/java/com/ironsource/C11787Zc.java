package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.Zc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11787Zc extends AbstractC12295l3 {

    /* JADX INFO: renamed from: P */
    public static final C11787Zc f26696P;

    static {
        C11787Zc c11787Zc = new C11787Zc();
        f26696P = c11787Zc;
        c11787Zc.f30802H = "outcome";
        c11787Zc.f30801G = 0;
        c11787Zc.f30803I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c11787Zc.m32042e();
    }

    private C11787Zc() {
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: a */
    protected void mo28076a(ArrayList<C12580w5> arrayList) {
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
    /* JADX INFO: renamed from: d */
    protected boolean mo25616d(C12580w5 c12580w5) {
        return true;
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
    /* JADX INFO: renamed from: g */
    protected boolean mo28077g(C12580w5 c12580w5) {
        return false;
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: h */
    protected boolean mo28078h(C12580w5 c12580w5) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m28079i() throws JSONException {
        new C11648R9().m27351b(ContextProvider.getInstance().getApplicationContext());
        mo25281a(new C12580w5(EnumC12598x5.INIT_DEFERRED_DATA, new C11766Y8().m28018a()));
    }

    @Override // com.ironsource.AbstractC12295l3
    /* JADX INFO: renamed from: j */
    protected boolean mo25619j(C12580w5 c12580w5) {
        return false;
    }
}
