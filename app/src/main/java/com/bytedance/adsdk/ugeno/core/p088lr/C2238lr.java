package com.bytedance.adsdk.ugeno.core.p088lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.C2242qt;
import com.bytedance.adsdk.ugeno.core.C2243ri;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.jbs;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2238lr implements jbs.InterfaceC2344ri {

    /* JADX INFO: renamed from: di */
    private Handler f5541di = new jbs(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: fi */
    private AbstractViewOnTouchListenerC2318ik f5542fi;

    /* JADX INFO: renamed from: ik */
    private Context f5543ik;

    /* JADX INFO: renamed from: ka */
    private C2226aw f5544ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2247vr f5545lr;

    /* JADX INFO: renamed from: ri */
    private int f5546ri;

    public C2238lr(Context context, C2226aw c2226aw, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5543ik = context;
        this.f5544ka = c2226aw;
        this.f5542fi = abstractViewOnTouchListenerC2318ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m7375ri() {
        C2226aw c2226aw = this.f5544ka;
        if (c2226aw == null) {
            return;
        }
        try {
            int i = Integer.parseInt(C2268lr.m7663ri(c2226aw.m7320ik().optString("delay"), this.f5542fi.m7834co()));
            this.f5546ri = i;
            this.f5541di.sendEmptyMessageDelayed(1001, i);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.InterfaceC2344ri
    /* JADX INFO: renamed from: ri */
    public void mo7364ri(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectM7320ik = this.f5544ka.m7320ik();
        if (TextUtils.equals(jSONObjectM7320ik.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectM7320ik.optString("nodeId");
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f5542fi;
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7849lr(abstractViewOnTouchListenerC2318ik).m7839fi(strOptString);
            new C2242qt(abstractViewOnTouchListenerC2318ikM7839fi.m7879sf(), C2243ri.m7395ri(jSONObjectM7320ik.optJSONObject("animatorSet"), abstractViewOnTouchListenerC2318ikM7839fi)).m7390ri();
        } else {
            InterfaceC2247vr interfaceC2247vr = this.f5545lr;
            if (interfaceC2247vr != null) {
                C2226aw c2226aw = this.f5544ka;
                AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik2 = this.f5542fi;
                interfaceC2247vr.mo7436ri(c2226aw, abstractViewOnTouchListenerC2318ik2, abstractViewOnTouchListenerC2318ik2);
            }
        }
        this.f5541di.removeMessages(1001);
    }

    /* JADX INFO: renamed from: ri */
    public void m7376ri(InterfaceC2247vr interfaceC2247vr) {
        this.f5545lr = interfaceC2247vr;
    }
}
