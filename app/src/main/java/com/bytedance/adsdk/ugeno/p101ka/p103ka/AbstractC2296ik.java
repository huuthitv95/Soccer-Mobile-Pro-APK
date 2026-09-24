package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.C2310qt;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2316sf;
import com.bytedance.adsdk.ugeno.p101ka.xha;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2296ik {

    /* JADX INFO: renamed from: di */
    protected String f5810di;

    /* JADX INFO: renamed from: fi */
    protected Map<String, String> f5811fi;

    /* JADX INFO: renamed from: ik */
    protected C2285di f5812ik;
    protected String jbs;

    /* JADX INFO: renamed from: ka */
    protected C2285di.ri f5813ka;

    /* JADX INFO: renamed from: lr */
    protected AbstractViewOnTouchListenerC2318ik f5814lr;

    /* JADX INFO: renamed from: mj */
    protected String f5815mj;

    /* JADX INFO: renamed from: qt */
    protected Context f5816qt;

    /* JADX INFO: renamed from: ri */
    protected InterfaceC2316sf f5817ri;
    protected String xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.ik$ri */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static AbstractC2296ik m7789ri(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject, JSONObject jSONObject2) {
            C2285di c2285diM7743ri;
            C2285di.ri riVarM7745ri;
            if (abstractViewOnTouchListenerC2318ik == null || jSONObject == null || (c2285diM7743ri = C2285di.m7743ri(jSONObject, jSONObject2)) == null || (riVarM7745ri = c2285diM7743ri.m7745ri()) == null) {
                return null;
            }
            String strM7754ri = riVarM7745ri.m7754ri();
            if (TextUtils.equals(strM7754ri, "custom")) {
                C2297ka c2297ka = new C2297ka(context);
                c2297ka.m7788ri(abstractViewOnTouchListenerC2318ik);
                c2297ka.m7786ri(c2285diM7743ri);
                c2297ka.m7784ik();
                return c2297ka;
            }
            xha xhaVarM7804ri = (TextUtils.isEmpty(strM7754ri) || TextUtils.equals(strM7754ri, "global")) ? C2310qt.m7804ri(riVarM7745ri.m7751lr()) : C2310qt.m7804ri(riVarM7745ri.m7746fi());
            if (xhaVarM7804ri == null) {
                return null;
            }
            AbstractC2296ik abstractC2296ikMo7806ri = xhaVarM7804ri.mo7806ri(context);
            abstractC2296ikMo7806ri.m7788ri(abstractViewOnTouchListenerC2318ik);
            abstractC2296ikMo7806ri.m7786ri(c2285diM7743ri);
            abstractC2296ikMo7806ri.m7784ik();
            return abstractC2296ikMo7806ri;
        }
    }

    public AbstractC2296ik(Context context) {
        this.f5816qt = context;
    }

    /* JADX INFO: renamed from: di */
    public String m7782di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: fi */
    public String m7783fi() {
        return this.f5815mj;
    }

    /* JADX INFO: renamed from: ik */
    public void m7784ik() {
        this.f5813ka = this.f5812ik.m7745ri();
        C2285di c2285di = this.f5812ik;
        if (c2285di == null) {
            return;
        }
        C2285di.ri riVarM7745ri = c2285di.m7745ri();
        this.f5813ka = riVarM7745ri;
        if (riVarM7745ri == null) {
            return;
        }
        this.f5811fi = riVarM7745ri.m7747ik();
        this.f5810di = this.f5813ka.m7751lr();
        this.xha = this.f5813ka.m7754ri();
        this.f5815mj = this.f5813ka.m7749ka();
        this.jbs = this.f5813ka.m7746fi();
    }

    /* JADX INFO: renamed from: ka */
    public String m7785ka() {
        return this.f5810di;
    }

    /* JADX INFO: renamed from: ri */
    public void m7786ri(C2285di c2285di) {
        this.f5812ik = c2285di;
    }

    /* JADX INFO: renamed from: ri */
    public void m7787ri(InterfaceC2316sf interfaceC2316sf) {
        this.f5817ri = interfaceC2316sf;
    }

    /* JADX INFO: renamed from: ri */
    public void m7788ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5814lr = abstractViewOnTouchListenerC2318ik;
    }

    /* JADX INFO: renamed from: ri */
    public abstract boolean mo7777ri(Object... objArr);

    public C2285di xha() {
        return this.f5812ik;
    }
}
