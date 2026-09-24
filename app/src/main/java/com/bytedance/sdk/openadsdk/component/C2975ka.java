package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2975ka extends PAGAppOpenAd {

    /* JADX INFO: renamed from: ik */
    private final AdSlot f9049ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private InterfaceC3498lr f9050ka;

    /* JADX INFO: renamed from: lr */
    private final wjv f9051lr;

    /* JADX INFO: renamed from: mj */
    private boolean f9052mj;

    /* JADX INFO: renamed from: ri */
    private final Context f9053ri;
    private final boolean xha;

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f9048fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: di */
    private final String f9047di = C3593su.m16658ri();

    public C2975ka(Context context, wjv wjvVar, boolean z, AdSlot adSlot) {
        this.f9053ri = context;
        this.f9051lr = wjvVar;
        this.xha = z;
        this.f9049ik = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        wjv wjvVar = this.f9051lr;
        if (wjvVar == null || wjvVar.iyl() == null) {
            return null;
        }
        try {
            return this.f9051lr.iyl().get(str);
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        wjv wjvVar = this.f9051lr;
        if (wjvVar != null) {
            return wjvVar.iyl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.f9051lr != null && System.currentTimeMillis() / 1000 <= this.f9051lr.cem();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.jbs) {
            return;
        }
        ory.m16565ri(this.f9051lr, d, str, str2);
        this.jbs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.f9050ka = new C2961fi(pAGAppOpenAdInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.f9050ka = new C2961fi(pAGAppOpenAdInteractionListener);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.f9048fi.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.m15814lr(this.f9053ri, this.f9051lr);
        Context contextM14642ri = activity != null ? activity : this.f9053ri;
        if (contextM14642ri == null) {
            contextM14642ri = C3299nr.m14642ri();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.f9051lr.hcw() ? new Intent(contextM14642ri, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextM14642ri, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra(FirebaseAnalytics.Param.AD_SOURCE, this.xha ? 1 : 2);
        boolean zJbs = C3606fi.jbs();
        intent.putExtra("enable_new_arch", zJbs);
        C3197dw.m13337ri().m13339fi();
        intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(this.f9051lr));
        if (zJbs) {
            intent.putExtra("single_process_listener_key", this.f9047di);
            C3197dw.m13337ri().m13356ri(this.f9047di, this.f9050ka);
        } else {
            C3197dw.m13337ri().m13355ri(this.f9050ka);
        }
        this.f9050ka = null;
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.f9049ik;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.f9051lr.m14388eb() != null) {
                cacheTime = this.f9051lr.m14388eb().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        C2722lr.m10241ri(contextM14642ri, intent, new C2722lr.lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.1
            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10245ri() {
            }

            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10246ri(Throwable th) {
            }
        });
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ka.2
            @Override // java.lang.Runnable
            public void run() {
                if (C2975ka.this.f9049ik != null) {
                    try {
                        if (C2975ka.this.f9051lr == null || wjv.m14331di(C2975ka.this.f9051lr) || C2975ka.this.f9051lr.m14367bl()) {
                            return;
                        }
                        C2958di.m11449ri(C2975ka.this.f9053ri).m11462ri(Integer.parseInt(C2975ka.this.f9049ik.getCodeId()), C2975ka.this.f9051lr.m14424jf());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.f9052mj) {
            return;
        }
        ory.m16564ri(this.f9051lr, d);
        this.f9052mj = true;
    }
}
