package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p054lr.C1978ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2983aw {

    /* JADX INFO: renamed from: di */
    protected boolean f9090di;

    /* JADX INFO: renamed from: fi */
    protected final AtomicBoolean f9091fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    protected final String f9092ik;

    /* JADX INFO: renamed from: ka */
    protected boolean f9093ka;

    /* JADX INFO: renamed from: lr */
    protected final C3289ri f9094lr;

    /* JADX INFO: renamed from: mj */
    private final ri f9095mj;

    /* JADX INFO: renamed from: ri */
    protected final Context f9096ri;
    protected boolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.aw$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        Intent mo11627ri(Context context, wjv wjvVar, Activity activity);

        /* JADX INFO: renamed from: ri */
        void mo11628ri(Intent intent, Activity activity, wjv wjvVar, boolean z);

        /* JADX INFO: renamed from: ri */
        void mo11629ri(wjv wjvVar);

        /* JADX INFO: renamed from: ri */
        void mo11630ri(boolean z);
    }

    public C2983aw(Context context, C3289ri c3289ri, String str, ri riVar) {
        this.f9096ri = context == null ? C3299nr.m14642ri() : context;
        this.f9094lr = c3289ri;
        this.f9092ik = str;
        this.f9093ka = false;
        this.f9095mj = riVar;
    }

    /* JADX INFO: renamed from: ka */
    private void m11616ka() {
        List<wjv> listM14252ka = this.f9094lr.m14252ka();
        if (listM14252ka != null) {
            Iterator<wjv> it = listM14252ka.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.m15814lr(this.f9096ri, it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11617ri(long j) {
        C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.3
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("start_activity");
                c3481ri.m15780ka(C2983aw.this.f9092ik);
                return c3481ri;
            }
        });
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        C3521ka.m15952ri("start_activity_action", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.4
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                return C3531ka.m15967lr().m15985ri("start_activity_action").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m11618ri(Context context, Intent intent, final wjv wjvVar, boolean z) {
        final boolean z2 = C3606fi.m16703ri("start_activity_async", 0) == 1;
        if (z2) {
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.1
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("start_activity");
                    c3481ri.m15780ka(C2983aw.this.f9092ik);
                    return c3481ri;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2722lr.m10244ri(context, intent, new C2722lr.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.2
            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10245ri() {
                if (z2) {
                    C2983aw.this.m11617ri(jElapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10246ri(Throwable th) {
                C3429qt.m15620ri(wjvVar, "show_ad_fail", C2983aw.this.f9092ik, "activity_start_fail");
                if (z2) {
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.component.reward.aw.2.1
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("start_activity");
                            c3481ri.m15780ka(C2983aw.this.f9092ik);
                            return c3481ri;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: renamed from: ik */
    public boolean m11620ik() {
        return this.f9093ka;
    }

    /* JADX INFO: renamed from: lr */
    public Map<String, Object> m11621lr() {
        C3289ri c3289ri = this.f9094lr;
        if (c3289ri == null || c3289ri.m14248di() == null) {
            return null;
        }
        return this.f9094lr.m14248di().iyl();
    }

    /* JADX INFO: renamed from: ri */
    public Object m11622ri(String str) {
        C3289ri c3289ri = this.f9094lr;
        if (c3289ri == null || c3289ri.m14248di() == null || this.f9094lr.m14248di().iyl() == null) {
            return null;
        }
        try {
            return this.f9094lr.m14248di().iyl().get(str);
        } catch (Throwable th) {
            C2707ac.m10196ik(this.f9092ik, th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11623ri() {
        if (this.f9091fi.get()) {
            return;
        }
        this.f9093ka = true;
    }

    /* JADX INFO: renamed from: ri */
    public void m11624ri(Activity activity) {
        wjv wjvVarM14248di;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        C3289ri c3289ri = this.f9094lr;
        if (c3289ri == null || !c3289ri.m14249fi() || (wjvVarM14248di = this.f9094lr.m14248di()) == null) {
            return;
        }
        if (!C1978ri.m6210ri()) {
            C3429qt.m15620ri(wjvVarM14248di, "show_ad_fail", this.f9092ik, "not_called_on_main_thread");
            throw new IllegalStateException("Cannot be called in a child thread —— " + this.f9092ik + ".show");
        }
        m11616ka();
        if (!this.f9091fi.compareAndSet(false, true)) {
            C3429qt.m15620ri(wjvVarM14248di, "show_ad_fail", this.f9092ik, "repeat_play");
            return;
        }
        if (wjvVarM14248di.m14389eu() == null && wjvVarM14248di.rbz().isEmpty()) {
            C3429qt.m15620ri(wjvVarM14248di, "show_ad_fail", this.f9092ik, "video_or_image_empty");
            return;
        }
        C3429qt.m15620ri(wjvVarM14248di, "show_start", this.f9092ik, (String) null);
        Context contextM14642ri = activity == null ? this.f9096ri : activity;
        if (contextM14642ri == null) {
            contextM14642ri = C3299nr.m14642ri();
        }
        Intent intentMo11627ri = this.f9095mj.mo11627ri(contextM14642ri, wjvVarM14248di, activity);
        if (intentMo11627ri == null) {
            return;
        }
        intentMo11627ri.putExtra("start_show_time", SystemClock.elapsedRealtime());
        boolean zJbs = C3606fi.jbs();
        intentMo11627ri.putExtra("enable_new_arch", zJbs);
        this.f9095mj.mo11628ri(intentMo11627ri, activity, wjvVarM14248di, zJbs);
        this.f9095mj.mo11630ri(zJbs);
        m11618ri(contextM14642ri, intentMo11627ri, wjvVarM14248di, zJbs);
        this.f9095mj.mo11629ri(wjvVarM14248di);
    }

    /* JADX INFO: renamed from: ri */
    public void m11625ri(Double d) {
        if (this.f9090di) {
            return;
        }
        C3289ri c3289ri = this.f9094lr;
        if (c3289ri != null && c3289ri.m14248di() != null) {
            ory.m16564ri(this.f9094lr.m14248di(), d);
        }
        this.f9090di = true;
    }

    /* JADX INFO: renamed from: ri */
    public void m11626ri(Double d, String str, String str2) {
        if (this.xha) {
            return;
        }
        C3289ri c3289ri = this.f9094lr;
        if (c3289ri != null && c3289ri.m14248di() != null) {
            ory.m16565ri(this.f9094lr.m14248di(), d, str, str2);
        }
        this.xha = true;
    }
}
