package com.bytedance.sdk.openadsdk.p251qt;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.ironsource.C11794a2;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3492lr<T> implements slm<T> {

    /* JADX INFO: renamed from: ik */
    private final slm<T> f12648ik;

    /* JADX INFO: renamed from: ka */
    private final wjv f12649ka;

    /* JADX INFO: renamed from: lr */
    private final String f12650lr;

    /* JADX INFO: renamed from: ri */
    private final long f12651ri = SystemClock.elapsedRealtime();

    public C3492lr(final wjv wjvVar, String str, slm<T> slmVar) {
        this.f12648ik = slmVar;
        this.f12649ka = wjvVar;
        this.f12650lr = str;
        C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.1
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("load_img");
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 != null) {
                    c3481ri.m15777ik(wjvVar2.hcw(C11794a2.f26725f));
                    c3481ri.m15780ka(C3571ig.m16444ik(wjvVar.m14404go()));
                }
                c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                return c3481ri;
            }
        });
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8254ri(final int i, final String str, final Throwable th) {
        slm<T> slmVar = this.f12648ik;
        if (slmVar != null) {
            slmVar.mo8254ri(i, str, th);
        }
        wjv wjvVar = this.f12649ka;
        if (wjvVar != null) {
            if (!TextUtils.isEmpty(C3571ig.m16476ri(wjvVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12651ri;
                C3521ka.m15952ri("load_image_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.qt.lr.4
                    @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                    /* JADX INFO: renamed from: ri */
                    public InterfaceC3530ik mo11574ri() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", C3492lr.this.f12650lr);
                        jSONObject.put("error_code", i);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", C3492lr.this.f12649ka.m14552vz());
                        jSONObject.put("use_new_img", 1);
                        return C3531ka.m15967lr().m15985ri("load_image_error").m15984ri(C3492lr.this.f12649ka.m14404go()).m15980lr(jSONObject.toString());
                    }
                });
            }
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.5
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("load_img");
                    if (C3492lr.this.f12649ka != null) {
                        c3481ri.m15777ik(C3492lr.this.f12649ka.hcw(C11794a2.f26725f));
                        c3481ri.m15780ka(C3571ig.m16444ik(C3492lr.this.f12649ka.m14404go()));
                    }
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    return c3481ri;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8255ri(InterfaceC2630sf<T> interfaceC2630sf) {
        slm<T> slmVar = this.f12648ik;
        if (slmVar != null) {
            slmVar.mo8255ri(interfaceC2630sf);
        }
        if (this.f12649ka != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12651ri;
            final int iXha = interfaceC2630sf.xha() / 1024;
            final int i = interfaceC2630sf.mo9669di() ? 1 : 0;
            C3521ka.m15952ri("load_image_success", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.qt.lr.2
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", C3492lr.this.f12650lr);
                    jSONObject.put("preload_size", iXha);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", C3492lr.this.f12649ka.m14552vz());
                    jSONObject.put("use_new_img", 1);
                    return C3531ka.m15967lr().m15985ri("load_image_success").m15984ri(C3492lr.this.f12649ka.m14404go()).m15980lr(jSONObject.toString());
                }
            });
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.qt.lr.3
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("load_img");
                    if (C3492lr.this.f12649ka != null) {
                        c3481ri.m15777ik(C3492lr.this.f12649ka.hcw(C11794a2.f26725f));
                        c3481ri.m15780ka(C3571ig.m16444ik(C3492lr.this.f12649ka.m14404go()));
                    }
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    return c3481ri;
                }
            });
        }
    }
}
