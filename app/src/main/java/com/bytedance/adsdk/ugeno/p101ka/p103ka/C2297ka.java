package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.C2314lr;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.C2315ri;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2312ik;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2313ka;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2297ka extends AbstractC2296ik implements InterfaceC2313ka {

    /* JADX INFO: renamed from: sf */
    private InterfaceC2312ik f5821sf;

    public C2297ka(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2313ka
    /* JADX INFO: renamed from: ri */
    public void mo7792ri(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        C2315ri c2315riM7846jc = this.f5814lr.m7846jc();
        if (c2315riM7846jc == null) {
            return false;
        }
        InterfaceC2312ik interfaceC2312ikM7809ri = c2315riM7846jc.m7809ri(this.f5810di);
        this.f5821sf = interfaceC2312ikM7809ri;
        if (interfaceC2312ikM7809ri != null) {
            interfaceC2312ikM7809ri.mo7807ri(this);
            return false;
        }
        c2315riM7846jc.m7810ri(this.f5810di, new C2314lr());
        return false;
    }
}
