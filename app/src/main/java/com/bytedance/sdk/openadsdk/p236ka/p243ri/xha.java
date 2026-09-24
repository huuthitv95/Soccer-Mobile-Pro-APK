package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.content.Context;
import android.os.HandlerThread;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2533di;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p132di.C2537ka;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p159ka.C2643ri;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3309ri;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC2540fi {

    /* JADX INFO: renamed from: ri */
    private final String f12472ri = "[7911]";

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: aw */
    public boolean mo9212aw() {
        return C3606fi.m16704ri("batch_log_config", C12364a.f31324j, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    public boolean bgr() {
        return C3606fi.m16704ri("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: co */
    public long mo9213co() {
        long jM16703ri = C3606fi.m16703ri("log_queue_timeout", 40000);
        if (jM16703ri < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS || jM16703ri > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jM16703ri;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: di */
    public int mo9214di() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: fi */
    public Executor mo9215fi() {
        return dzy.m16404mj();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ik */
    public int mo9216ik(String str) {
        C3437qt c3437qtM14868pu = C3322sf.m14819lr().m14868pu();
        if (c3437qtM14868pu == null) {
            return 3;
        }
        return c3437qtM14868pu.m15678ri(str);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ik */
    public boolean mo9217ik() {
        return true;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    public String jbs() {
        return C3571ig.m16449ka();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ka */
    public Executor mo9218ka() {
        return dzy.m16397ka();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: lr */
    public String mo9219lr(String str) {
        return C2643ri.m9836ri(str, C3309ri.m14750ri());
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: lr */
    public boolean mo9220lr() {
        return false;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: mj */
    public boolean mo9221mj() {
        return true;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: qt */
    public InterfaceC2542ik mo9222qt() {
        if (C3307lr.m14718ri().m14722fi()) {
            return null;
        }
        return new C3433ik();
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public HandlerThread mo9223ri(String str, int i) {
        return C2723mj.m10251ri(str, i);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public InterfaceC2552ri mo9224ri(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public String mo9225ri(String str) {
        return C2643ri.m9833lr(str, C3309ri.m14750ri());
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public void mo9226ri(boolean z, int i, long j, C2537ka c2537ka) {
        Runnable runnableM9205ri;
        if (c2537ka == null) {
            return;
        }
        if (z) {
            C3521ka.m15952ri("track_link_result", false, new jbs(true, c2537ka));
            return;
        }
        C3437qt c3437qtM14868pu = C3322sf.m14819lr().m14868pu();
        if (c3437qtM14868pu == null || c2537ka.m9199ka() >= c3437qtM14868pu.m15678ri(c2537ka.m9195di())) {
            C3521ka.m15952ri("track_link_result", false, new jbs(false, c2537ka));
        } else {
            if (!c3437qtM14868pu.m15682ri() || (runnableM9205ri = c2537ka.m9205ri(C3089aw.m12377ri(C3299nr.m14642ri()), null)) == null) {
                return;
            }
            dzy.m16408ri().schedule(runnableM9205ri, c3437qtM14868pu.m15677lr(c2537ka.m9195di()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public boolean mo9227ri() {
        return false;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: ri */
    public boolean mo9228ri(Context context) {
        return C2724nr.m10259ri(context);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: sf */
    public InterfaceC2533di mo9229sf() {
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    /* JADX INFO: renamed from: vr */
    public int mo9230vr() {
        return C3606fi.m16704ri("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi
    public boolean xha() {
        return false;
    }
}
