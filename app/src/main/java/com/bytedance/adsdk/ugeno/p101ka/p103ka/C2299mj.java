package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2299mj extends AbstractC2296ik {

    /* JADX INFO: renamed from: aw */
    private int f5823aw;

    /* JADX INFO: renamed from: co */
    private int f5824co;

    /* JADX INFO: renamed from: sf */
    private int f5825sf;

    public C2299mj(Context context) {
        super(context);
        this.f5825sf = -1;
        this.f5824co = -1;
        this.f5823aw = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iM8030ri = C2343ik.m8030ri(String.valueOf(objArr[0]), -1);
            int iM8030ri2 = C2343ik.m8030ri(String.valueOf(objArr[1]), -1);
            int iM8030ri3 = C2343ik.m8030ri(String.valueOf(objArr[2]), -1);
            if (this.f5811fi == null || this.f5811fi.isEmpty()) {
                HashMap map = new HashMap();
                map.put("fromIndex", Integer.valueOf(iM8030ri));
                map.put("toIndex", Integer.valueOf(iM8030ri2));
                map.put("type", Integer.valueOf(iM8030ri3));
                Iterator<C2285di.ri> it = this.f5812ik.m7744lr().iterator();
                while (it.hasNext()) {
                    it.next().m7753lr(map);
                }
                this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
            } else {
                this.f5825sf = C2343ik.m8030ri(this.f5811fi.get("fromIndex"), -1);
                this.f5824co = C2343ik.m8030ri(this.f5811fi.get("toIndex"), -1);
                int iM8030ri4 = C2343ik.m8030ri(this.f5811fi.get("type"), -1);
                this.f5823aw = iM8030ri4;
                if (iM8030ri == this.f5825sf && iM8030ri2 == this.f5824co && iM8030ri3 == iM8030ri4) {
                    this.f5817ri.mo7771ri(this.f5814lr, this.f5810di, this.f5812ik.m7744lr());
                }
            }
        }
        return false;
    }
}
