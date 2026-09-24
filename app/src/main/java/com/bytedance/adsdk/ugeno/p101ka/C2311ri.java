package com.bytedance.adsdk.ugeno.p101ka;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2293co;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2295fi;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2298lr;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2300qt;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2302sf;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.jbs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2311ri implements InterfaceC2309mj {
    @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2309mj
    /* JADX INFO: renamed from: ri */
    public List<xha> mo7803ri() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xha("slide") { // from class: com.bytedance.adsdk.ugeno.ka.ri.1
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new C2295fi(context);
            }
        });
        arrayList.add(new xha("tap") { // from class: com.bytedance.adsdk.ugeno.ka.ri.2
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new jbs(context);
            }
        });
        arrayList.add(new xha("timer") { // from class: com.bytedance.adsdk.ugeno.ka.ri.3
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new C2300qt(context);
            }
        });
        arrayList.add(new xha("touchStart") { // from class: com.bytedance.adsdk.ugeno.ka.ri.4
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new C2293co(context);
            }
        });
        arrayList.add(new xha("touchEnd") { // from class: com.bytedance.adsdk.ugeno.ka.ri.5
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new C2302sf(context);
            }
        });
        arrayList.add(new xha("animateState") { // from class: com.bytedance.adsdk.ugeno.ka.ri.6
            @Override // com.bytedance.adsdk.ugeno.p101ka.xha
            /* JADX INFO: renamed from: ri */
            public AbstractC2296ik mo7806ri(Context context) {
                return new C2298lr(context);
            }
        });
        return arrayList;
    }
}
