package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.C2232ka;
import com.bytedance.adsdk.ugeno.core.C2233lr;
import com.bytedance.adsdk.ugeno.core.InterfaceC2231ik;
import com.bytedance.adsdk.ugeno.core.p088lr.InterfaceC2237ka;
import com.bytedance.adsdk.ugeno.core.p089ri.InterfaceC2245ri;
import com.bytedance.adsdk.ugeno.p094ik.InterfaceC2269ri;
import com.bytedance.adsdk.ugeno.p101ka.C2286fi;
import com.bytedance.adsdk.ugeno.p101ka.C2292ka;
import com.bytedance.adsdk.ugeno.p101ka.C2310qt;
import com.bytedance.adsdk.ugeno.p101ka.C2311ri;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2287ik;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2309mj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2260fi {

    /* JADX INFO: renamed from: ri */
    private static volatile C2260fi f5633ri;

    /* JADX INFO: renamed from: di */
    private InterfaceC2237ka f5634di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2269ri f5635fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2231ik f5636ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2324ri f5637ka;

    /* JADX INFO: renamed from: lr */
    private List<C2233lr> f5638lr;
    private InterfaceC2245ri xha;

    private C2260fi() {
    }

    /* JADX INFO: renamed from: di */
    private void m7536di() {
        ArrayList arrayList = new ArrayList();
        this.f5638lr = arrayList;
        InterfaceC2231ik interfaceC2231ik = this.f5636ik;
        if (interfaceC2231ik != null) {
            arrayList.addAll(interfaceC2231ik.mo7358ri());
        }
        C2232ka.m7360ri(this.f5638lr);
    }

    /* JADX INFO: renamed from: ri */
    public static C2260fi m7537ri() {
        if (f5633ri == null) {
            synchronized (C2260fi.class) {
                if (f5633ri == null) {
                    f5633ri = new C2260fi();
                }
            }
        }
        return f5633ri;
    }

    /* JADX INFO: renamed from: fi */
    public InterfaceC2245ri m7538fi() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2269ri m7539ik() {
        return this.f5635fi;
    }

    /* JADX INFO: renamed from: ka */
    public InterfaceC2237ka m7540ka() {
        return this.f5634di;
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2324ri m7541lr() {
        return this.f5637ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m7542ri(Context context, InterfaceC2231ik interfaceC2231ik, InterfaceC2324ri interfaceC2324ri) {
        this.f5636ik = interfaceC2231ik;
        this.f5637ka = interfaceC2324ri;
        m7536di();
    }

    /* JADX INFO: renamed from: ri */
    public void m7543ri(InterfaceC2269ri interfaceC2269ri) {
        this.f5635fi = interfaceC2269ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7544ri(InterfaceC2287ik interfaceC2287ik) {
        ArrayList arrayList = new ArrayList(new C2286fi().mo7757ri());
        if (interfaceC2287ik != null) {
            arrayList.addAll(interfaceC2287ik.mo7757ri());
        }
        C2292ka.m7775ri(arrayList);
    }

    /* JADX INFO: renamed from: ri */
    public void m7545ri(InterfaceC2309mj interfaceC2309mj) {
        ArrayList arrayList = new ArrayList(new C2311ri().mo7803ri());
        if (interfaceC2309mj != null) {
            arrayList.addAll(interfaceC2309mj.mo7803ri());
        }
        C2310qt.m7805ri(arrayList);
    }
}
