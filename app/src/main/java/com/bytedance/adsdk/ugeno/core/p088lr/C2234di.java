package com.bytedance.adsdk.ugeno.core.p088lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.jbs;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2234di implements jbs.InterfaceC2344ri {

    /* JADX INFO: renamed from: di */
    private AbstractViewOnTouchListenerC2318ik f5517di;

    /* JADX INFO: renamed from: fi */
    private C2226aw f5518fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2247vr f5519ik;

    /* JADX INFO: renamed from: ka */
    private Context f5520ka;

    /* JADX INFO: renamed from: lr */
    private int f5521lr;

    /* JADX INFO: renamed from: ri */
    private boolean f5522ri;
    private Handler xha = new jbs(Looper.getMainLooper(), this);

    public C2234di(Context context, C2226aw c2226aw, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5520ka = context;
        this.f5518fi = c2226aw;
        this.f5517di = abstractViewOnTouchListenerC2318ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m7363ri() {
        C2226aw c2226aw = this.f5518fi;
        if (c2226aw == null) {
            return;
        }
        JSONObject jSONObjectM7320ik = c2226aw.m7320ik();
        try {
            this.f5521lr = Integer.parseInt(C2268lr.m7663ri(jSONObjectM7320ik.optString("interval", "8000"), this.f5517di.m7834co()));
            this.f5522ri = jSONObjectM7320ik.optBoolean("repeat");
            this.xha.sendEmptyMessageDelayed(1001, this.f5521lr);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.InterfaceC2344ri
    /* JADX INFO: renamed from: ri */
    public void mo7364ri(Message message) {
        if (message.what != 1001) {
            return;
        }
        InterfaceC2247vr interfaceC2247vr = this.f5519ik;
        if (interfaceC2247vr != null) {
            C2226aw c2226aw = this.f5518fi;
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f5517di;
            interfaceC2247vr.mo7436ri(c2226aw, abstractViewOnTouchListenerC2318ik, abstractViewOnTouchListenerC2318ik);
        }
        if (this.f5522ri) {
            this.xha.sendEmptyMessageDelayed(1001, this.f5521lr);
        } else {
            this.xha.removeMessages(1001);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7365ri(InterfaceC2247vr interfaceC2247vr) {
        this.f5519ik = interfaceC2247vr;
    }
}
