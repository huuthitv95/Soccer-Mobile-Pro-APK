package com.bytedance.sdk.openadsdk.p236ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan implements InterfaceC3418fi {

    /* JADX INFO: renamed from: di */
    private JSONObject f12473di;

    /* JADX INFO: renamed from: fi */
    private Boolean f12474fi;

    /* JADX INFO: renamed from: ik */
    private Boolean f12475ik;

    /* JADX INFO: renamed from: ka */
    private Boolean f12476ka;

    /* JADX INFO: renamed from: lr */
    private wjv f12477lr;

    /* JADX INFO: renamed from: mj */
    private JSONArray f12478mj;

    /* JADX INFO: renamed from: ri */
    private String f12479ri;
    private JSONArray xha;

    protected tan() {
        this.f12479ri = "embeded_ad";
        this.f12475ik = Boolean.FALSE;
        this.f12476ka = Boolean.FALSE;
        this.f12474fi = Boolean.FALSE;
    }

    public tan(int i, String str, wjv wjvVar) {
        this.f12479ri = "embeded_ad";
        this.f12475ik = Boolean.FALSE;
        this.f12476ka = Boolean.FALSE;
        this.f12474fi = Boolean.FALSE;
        this.f12479ri = str;
        this.f12477lr = wjvVar;
        this.f12473di = new JSONObject();
        this.xha = new JSONArray();
        this.f12478mj = new JSONArray();
        m15713ri(this.f12473di, "webview_source", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15712ri(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15713ri(JSONObject jSONObject, String str, Object obj) {
        m15714ri(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15714ri(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean slm() {
        if (this.f12474fi.booleanValue()) {
            return true;
        }
        return this.f12476ka.booleanValue() && this.f12475ik.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3421lr
    /* JADX INFO: renamed from: aw */
    public void mo15601aw() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3420ka
    public void bgr() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3421lr
    /* JADX INFO: renamed from: co */
    public void mo15602co() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                tan.this.m15713ri(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                tan tanVar2 = tan.this;
                tanVar2.m15713ri(tanVar2.f12473di, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3419ik
    /* JADX INFO: renamed from: di */
    public void mo15594di() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.31
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: di */
    public void mo15604di(final String str) {
        try {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: fi */
    public void mo15582fi() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.29
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: fi */
    public void mo15605fi(final String str) {
        try {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3419ik
    /* JADX INFO: renamed from: ik */
    public void mo15595ik() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: ik */
    public void mo15606ik(final int i, final String str) {
        try {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.22
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan.this.m15713ri(jSONObject, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.valueOf(i));
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: ik */
    public void mo15607ik(final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3419ik
    public void jbs() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "type", "native_enterForeground");
                tan tanVar = tan.this;
                tanVar.m15712ri(tanVar.xha, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: ka */
    public void mo15583ka() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15714ri(tanVar.f12473di, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: ka */
    public void mo15608ka(final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3420ka
    /* JADX INFO: renamed from: lr */
    public void mo15597lr() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: lr */
    public void mo15584lr(final int i) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (tan.this.f12477lr != null) {
                    if (tan.this.f12477lr.nbc()) {
                        tan.this.m15713ri(jSONObject, "engine_version", "v3");
                    } else {
                        tan.this.m15713ri(jSONObject, "engine_version", "v1");
                    }
                }
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "before_webview_request", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: lr */
    public void mo15609lr(final int i, final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.valueOf(i));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: lr */
    public void mo15585lr(final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "jsb", str);
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: lr */
    public void mo15586lr(final String str, final long j, final long j2, final int i) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.6
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "start_ts", Long.valueOf(j));
                tan.this.m15713ri(jSONObject, "end_ts", Long.valueOf(j2));
                tan.this.m15713ri(jSONObject, "intercept_type", Integer.valueOf(i));
                tan.this.m15713ri(jSONObject, "type", "intercept_js");
                tan.this.m15713ri(jSONObject, "url", str);
                tan.this.m15713ri(jSONObject, "duration", Long.valueOf(j2 - j));
                tan tanVar = tan.this;
                tanVar.m15712ri(tanVar.f12478mj, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: lr */
    public void mo15587lr(final JSONObject jSONObject) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (tan.this.f12473di == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, next, jSONObject.opt(next));
                }
                tan.this.f12476ka = Boolean.TRUE;
                tan.this.mo15593sf();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3419ik
    /* JADX INFO: renamed from: mj */
    public void mo15596mj() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "type", "native_enterBackground");
                tan tanVar = tan.this;
                tanVar.m15712ri(tanVar.xha, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi
    /* JADX INFO: renamed from: qt */
    public void mo15591qt() {
        this.f12475ik = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3420ka
    /* JADX INFO: renamed from: ri */
    public void mo15598ri() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(jSONObject, "render_sequence", Integer.valueOf(tanVar.f12477lr.hpn()));
                if (tan.this.f12477lr != null) {
                    if (tan.this.f12477lr.sez() != null) {
                        if (tan.this.f12477lr.sez().m14582co()) {
                            tan.this.m15713ri(jSONObject, "webview_count", Integer.valueOf(C2483fi.m8762ri().m8766ka()));
                            tan.this.m15713ri(jSONObject, "available_cache_count", Integer.valueOf(C2483fi.m8762ri().m8766ka()));
                        } else {
                            tan.this.m15713ri(jSONObject, "webview_count", Integer.valueOf(C2483fi.m8762ri().m8764ik()));
                            tan.this.m15713ri(jSONObject, "available_cache_count", Integer.valueOf(C2483fi.m8762ri().m8764ik()));
                        }
                    } else if (tan.this.f12477lr.m14575zv() != null) {
                        tan.this.m15713ri(jSONObject, "webview_count", Integer.valueOf(C2483fi.m8762ri().m8766ka()));
                        tan.this.m15713ri(jSONObject, "available_cache_count", Integer.valueOf(C2483fi.m8762ri().m8766ka()));
                    }
                }
                tan tanVar2 = tan.this;
                tanVar2.m15713ri(tanVar2.f12473di, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3421lr
    /* JADX INFO: renamed from: ri */
    public void mo15603ri(final int i) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "backup_type", Integer.valueOf(i));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3420ka
    /* JADX INFO: renamed from: ri */
    public void mo15599ri(final int i, final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    tan.this.m15713ri(jSONObject, "reason", str2);
                }
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: ri */
    public void mo15588ri(final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan.this.m15713ri(jSONObject, "jsb", str);
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: ri */
    public void mo15589ri(final String str, final long j, final long j2, final int i) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "start_ts", Long.valueOf(j));
                tan.this.m15713ri(jSONObject, "end_ts", Long.valueOf(j2));
                tan.this.m15713ri(jSONObject, "intercept_type", Integer.valueOf(i));
                tan.this.m15713ri(jSONObject, "type", "intercept_html");
                tan.this.m15713ri(jSONObject, "url", str);
                tan.this.m15713ri(jSONObject, "duration", Long.valueOf(j2 - j));
                tan tanVar = tan.this;
                tanVar.m15712ri(tanVar.f12478mj, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    /* JADX INFO: renamed from: ri */
    public void mo15610ri(final String str, final boolean z) {
        try {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan.this.m15713ri(jSONObject, "isReuse", Integer.valueOf(z ? 1 : 0));
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3417di
    /* JADX INFO: renamed from: ri */
    public void mo15590ri(final JSONObject jSONObject) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.30
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                tan.this.m15713ri(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi
    /* JADX INFO: renamed from: ri */
    public void mo15592ri(boolean z) {
        this.f12474fi = Boolean.valueOf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi
    /* JADX INFO: renamed from: sf */
    public void mo15593sf() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.10
            @Override // java.lang.Runnable
            public void run() {
                if (tan.this.slm()) {
                    if (tan.this.xha != null && tan.this.xha.length() != 0) {
                        try {
                            tan.this.f12473di.put("native_switchBackgroundAndForeground", tan.this.xha);
                        } catch (Exception unused) {
                        }
                    }
                    if (tan.this.f12478mj != null && tan.this.f12478mj.length() != 0) {
                        try {
                            tan.this.f12473di.put("intercept_source", tan.this.f12478mj);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", tan.this.f12473di);
                    } catch (JSONException e) {
                        C2707ac.m10206ri("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (C3304qt.m14669lr().m14703vr() && tan.this.f12473di != null) {
                        JSONObject unused3 = tan.this.f12473di;
                    }
                    C3414ik.m15522lr(tan.this.f12477lr, tan.this.f12479ri, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3420ka
    /* JADX INFO: renamed from: vr */
    public void mo15600vr() {
        try {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    tan tanVar = tan.this;
                    tanVar.m15713ri(tanVar.f12473di, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3419ik
    public void xha() {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3422ri
    public void xha(final String str) {
        jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.tan.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                tan.this.m15713ri(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                tan tanVar = tan.this;
                tanVar.m15713ri(tanVar.f12473di, str, jSONObject);
            }
        });
    }
}
