package com.bytedance.sdk.openadsdk.core.p200co.jbs;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.core.C2246sf;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.jbs.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3154ri implements slm, InterfaceC2247vr {

    /* JADX INFO: renamed from: ik */
    private AbstractViewOnTouchListenerC2318ik f10362ik;

    /* JADX INFO: renamed from: lr */
    private C2228co f10363lr;

    /* JADX INFO: renamed from: ri */
    private Context f10364ri;

    public C3154ri(Context context) {
        this.f10364ri = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13166lr(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, InterfaceC3186ka interfaceC3186ka) {
        this.f10363lr = new C2228co(this.f10364ri);
        m13167ri();
        this.f10363lr.m7349ri((InterfaceC2247vr) this);
        this.f10363lr.m7348ri((slm) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7346ri = this.f10363lr.m7346ri(jSONObject, jSONObject2, jSONObject3);
            this.f10362ik = abstractViewOnTouchListenerC2318ikM7346ri;
            if (abstractViewOnTouchListenerC2318ikM7346ri != null) {
                interfaceC3186ka.mo10894ri(abstractViewOnTouchListenerC2318ikM7346ri);
            } else if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(TsExtractor.TS_STREAM_TYPE_DTS_UHD, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (interfaceC3186ka != null) {
                interfaceC3186ka.mo10893ri(138, "ugen render error");
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13167ri() {
        C2246sf c2246sf = new C2246sf();
        c2246sf.m7432ri(this.f10364ri);
        this.f10363lr.m7353ri("page", c2246sf);
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7436ri(C2226aw c2226aw, InterfaceC2247vr.lr lrVar, InterfaceC2247vr.ri riVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    /* JADX INFO: renamed from: ri */
    public void mo7435ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7437ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13169ri(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final InterfaceC3186ka interfaceC3186ka) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m13166lr(jSONObject, jSONObject2, jSONObject3, interfaceC3186ka);
        } else {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.jbs.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C3154ri.this.m13166lr(jSONObject, jSONObject2, jSONObject3, interfaceC3186ka);
                }
            });
        }
    }
}
