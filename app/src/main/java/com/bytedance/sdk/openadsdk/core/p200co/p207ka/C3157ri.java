package com.bytedance.sdk.openadsdk.core.p200co.p207ka;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3157ri implements slm, InterfaceC2247vr {

    /* JADX INFO: renamed from: ik */
    private ri f10387ik;

    /* JADX INFO: renamed from: ka */
    private slm f10388ka;

    /* JADX INFO: renamed from: lr */
    private AbstractViewOnTouchListenerC2318ik<View> f10389lr;

    /* JADX INFO: renamed from: ri */
    private final Context f10390ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ka.ri$ri */
    interface ri {
        /* JADX INFO: renamed from: ri */
        void mo13180ri(C2226aw c2226aw);
    }

    public C3157ri(Context context) {
        this.f10390ri = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13184lr(JSONObject jSONObject, JSONObject jSONObject2, InterfaceC3186ka interfaceC3186ka) {
        try {
            C2228co c2228co = new C2228co(this.f10390ri);
            AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7345ri = c2228co.m7345ri(jSONObject);
            this.f10389lr = abstractViewOnTouchListenerC2318ikM7345ri;
            if (abstractViewOnTouchListenerC2318ikM7345ri == null) {
                if (interfaceC3186ka != null) {
                    interfaceC3186ka.mo10893ri(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View viewM7879sf = abstractViewOnTouchListenerC2318ikM7345ri.m7879sf();
            if (viewM7879sf != null) {
                viewM7879sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.ri.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            c2228co.m7349ri((InterfaceC2247vr) this);
            c2228co.m7348ri((slm) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", C3089aw.m12375lr());
                    jSONObject2.put(C11540L6.f24911F, C11744X3.f26142d);
                } catch (JSONException unused) {
                }
            }
            c2228co.m7342lr(jSONObject2);
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10894ri(this.f10389lr);
            }
        } catch (Exception e) {
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(3000, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7436ri(C2226aw c2226aw, InterfaceC2247vr.lr lrVar, InterfaceC2247vr.ri riVar) {
        ri riVar2;
        if (c2226aw == null) {
            return;
        }
        if ((c2226aw.m7322lr() == 1 || c2226aw.m7322lr() == 4) && (riVar2 = this.f10387ik) != null) {
            riVar2.mo13180ri(c2226aw);
        }
        if (lrVar == null || c2226aw.m7321ka() == null) {
            return;
        }
        lrVar.mo7438ri(c2226aw.m7321ka());
    }

    /* JADX INFO: renamed from: ri */
    public void m13186ri(slm slmVar) {
        this.f10388ka = slmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    /* JADX INFO: renamed from: ri */
    public void mo7435ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        slm slmVar = this.f10388ka;
        if (slmVar != null) {
            slmVar.mo7435ri(abstractViewOnTouchListenerC2318ik, motionEvent);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7437ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13187ri(ri riVar) {
        this.f10387ik = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m13188ri(final JSONObject jSONObject, final JSONObject jSONObject2, final InterfaceC3186ka interfaceC3186ka) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m13184lr(jSONObject, jSONObject2, interfaceC3186ka);
        } else {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C3157ri.this.m13184lr(jSONObject, jSONObject2, interfaceC3186ka);
                }
            });
        }
    }
}
