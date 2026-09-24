package com.bytedance.sdk.openadsdk.p172ac.p173ri;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p172ac.C2752ri;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2755ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.ri.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo10483ri(int i, String str, Throwable th);

        /* JADX INFO: renamed from: ri */
        void mo10484ri(String str, C2754lr c2754lr);
    }

    /* JADX INFO: renamed from: ri */
    private int m10480ri(InterfaceC2630sf interfaceC2630sf) {
        Object obj;
        Map<String, String> mapMo9672ka = interfaceC2630sf.mo9672ka();
        if (mapMo9672ka == null || (obj = mapMo9672ka.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ri */
    protected void m10481ri(int i, String str, Throwable th, ri riVar) {
        if (riVar != null) {
            riVar.mo10483ri(i, str, th);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void mo10474ri(InterfaceC2630sf interfaceC2630sf, ri riVar) {
        if (riVar != null) {
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            int iM10480ri = m10480ri(interfaceC2630sf);
            if (objMo9673lr instanceof Drawable) {
                riVar.mo10484ri(interfaceC2630sf.mo9676ri(), new C2754lr((Drawable) objMo9673lr, iM10480ri));
                return;
            }
            if (objMo9673lr instanceof byte[]) {
                riVar.mo10484ri(interfaceC2630sf.mo9676ri(), new C2754lr((byte[]) objMo9673lr, iM10480ri));
                return;
            }
            if (objMo9673lr instanceof Bitmap) {
                riVar.mo10484ri(interfaceC2630sf.mo9676ri(), new C2754lr((Bitmap) objMo9673lr, interfaceC2630sf.mo9671ik() instanceof Bitmap ? (Bitmap) interfaceC2630sf.mo9671ik() : null, iM10480ri));
            } else {
                riVar.mo10483ri(0, "not bitmap or gif result!", null);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10482ri(C2752ri c2752ri, final ri riVar, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, wjv wjvVar) {
        InterfaceC2624qt interfaceC2624qtMo9666ri = C3491ka.m15834ri(c2752ri.f7943ri).mo9665ri(c2752ri.f7942lr).mo9660ri(i).mo9655lr(i2).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9656lr(str).mo9662ri(scaleType).mo9666ri(!TextUtils.isEmpty(str));
        if (i3 <= 0 || Build.VERSION.SDK_INT < 26) {
            interfaceC2624qtMo9666ri.mo9652ik(1);
        } else {
            interfaceC2624qtMo9666ri.mo9652ik(2).mo9663ri(new InterfaceC2622mj() { // from class: com.bytedance.sdk.openadsdk.ac.ri.ri.1
                @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
                /* JADX INFO: renamed from: ri */
                public Bitmap mo8253ri(Bitmap bitmap) {
                    return C2498ri.m8826ri(C3299nr.m14642ri(), bitmap, i3);
                }
            });
        }
        interfaceC2624qtMo9666ri.mo9658ri(new C3492lr(wjvVar, c2752ri.f7943ri, new slm() { // from class: com.bytedance.sdk.openadsdk.ac.ri.ri.2
            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8254ri(int i4, String str2, Throwable th) {
                C2755ri.this.m10481ri(i4, str2, th, riVar);
            }

            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                C2755ri.this.mo10474ri(interfaceC2630sf, riVar);
            }
        }));
    }
}
