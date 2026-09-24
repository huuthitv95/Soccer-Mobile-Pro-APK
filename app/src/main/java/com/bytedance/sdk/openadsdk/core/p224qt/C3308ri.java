package com.bytedance.sdk.openadsdk.core.p224qt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.core.C3112ay;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3529fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.ironsource.C11540L6;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3308ri {

    /* JADX INFO: renamed from: ik */
    private boolean f11545ik;

    /* JADX INFO: renamed from: ri */
    private final AtomicInteger f11548ri = new AtomicInteger(0);

    /* JADX INFO: renamed from: lr */
    private InterfaceC3306ka f11547lr = null;

    /* JADX INFO: renamed from: ka */
    private final Runnable f11546ka = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.3
        @Override // java.lang.Runnable
        public void run() {
            C3308ri.this.m14746ri();
        }
    };

    public C3308ri(boolean z) {
        this.f11545ik = false;
        this.f11545ik = z;
    }

    /* JADX INFO: renamed from: ik */
    private JSONObject m14735ik() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tcstring", C3322sf.m14820lr(C3299nr.m14642ri()));
            jSONObject.put("tcf_gdpr", C3322sf.m14822ri(C3299nr.m14642ri()));
            jSONObject.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    private JSONObject m14736lr(JSONObject jSONObject) {
        return C3112ay.m12608ri(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m14737lr() {
        if (!C3307lr.m14718ri().m14728qt()) {
            m14743ri(false);
            return;
        }
        int iIncrementAndGet = this.f11548ri.incrementAndGet();
        if (iIncrementAndGet > 3) {
            m14743ri(false);
        } else {
            C3332vr.m14978lr().removeCallbacks(this.f11546ka);
            C3332vr.m14978lr().postDelayed(this.f11546ka, iIncrementAndGet * 10000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public JSONObject m14739ri(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", C2724nr.m10259ri(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m14743ri(boolean z) {
        InterfaceC3306ka interfaceC3306ka = this.f11547lr;
        if (interfaceC3306ka != null) {
            interfaceC3306ka.mo14717ri(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m14745ri(JSONObject jSONObject) {
        int iM14727mj = C3307lr.m14718ri().m14727mj();
        if (jSONObject.has("user_compliance_status")) {
            iM14727mj = jSONObject.optInt("user_compliance_status", -1);
            C3307lr.m14718ri().m14726lr(iM14727mj);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            C3307lr.m14718ri().m14732ri(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            C3307lr.m14718ri().m14730ri(jSONObject.optLong("allow_req_time", C3307lr.f11538ri.longValue()));
        }
        return iM14727mj == 1 || iM14727mj == 2;
    }

    /* JADX INFO: renamed from: ri */
    public void m14746ri() {
        try {
            if (!this.f11545ik) {
                String strM14820lr = C3322sf.m14820lr(C3299nr.m14642ri());
                int iM14822ri = C3322sf.m14822ri(C3299nr.m14642ri());
                if (TextUtils.equals(strM14820lr, C3322sf.f11622ka) && iM14822ri == C3322sf.f11619fi && C3307lr.m14718ri().jbs()) {
                    m14743ri(true);
                    return;
                }
            }
            JSONObject jSONObjectM14735ik = m14735ik();
            C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
            final String strM16477ri = C3571ig.m16477ri("/api/ad/union/sdk/compliance_status/", false, true);
            c2741kaM10412lr.m10365ik(strM16477ri);
            c2741kaM10412lr.m10372lr("User-Agent", "");
            c2741kaM10412lr.m10385fi(m14736lr(jSONObjectM14735ik).toString());
            c2741kaM10412lr.m10373ri(6);
            c2741kaM10412lr.m10371lr("compliance_stats");
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.1
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("compliance_status");
                    c3481ri.xha(C3308ri.this.m14739ri(C3299nr.m14642ri()).toString());
                    return c3481ri;
                }
            });
            c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    String strM10357ka = c2739lr.m10357ka();
                    if (!c2739lr.m10354di() || TextUtils.isEmpty(strM10357ka)) {
                        C3308ri.this.m14737lr();
                        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.2
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr("compliance_status");
                                c3481ri.xha(C3308ri.this.m14739ri(C3299nr.m14642ri()).toString());
                                return c3481ri;
                            }
                        });
                        if (abstractC2740ik != null) {
                            C3594uq.m16664ri(abstractC2740ik.m10363fi());
                            C3529fi.m15965ri("compliance_status", strM16477ri, c2739lr.m10359ri(), c2739lr.m10358lr(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.1
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr("compliance_status");
                                c3481ri.xha(C3308ri.this.m14739ri(C3299nr.m14642ri()).toString());
                                return c3481ri;
                            }
                        });
                        C3594uq.m16661lr();
                        JSONObject jSONObject = new JSONObject(strM10357ka);
                        String strM12606ri = C3112ay.m12606ri(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                        if (TextUtils.isEmpty(strM12606ri)) {
                            C3308ri.this.m14737lr();
                            return;
                        }
                        if (!C3308ri.this.m14745ri(new JSONObject(strM12606ri))) {
                            C3308ri.this.m14743ri(false);
                        } else if (!C3308ri.this.f11545ik || TextUtils.isEmpty(C3322sf.m14819lr().m14884ta())) {
                            C3308ri.this.m14743ri(true);
                        } else {
                            C3308ri.this.m14743ri(false);
                        }
                    } catch (Throwable unused) {
                        C3308ri.this.m14737lr();
                    }
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    C3308ri.this.m14737lr();
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ri.2.3
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("compliance_status");
                            c3481ri.xha(C3308ri.this.m14739ri(C3299nr.m14642ri()).toString());
                            return c3481ri;
                        }
                    });
                    if (abstractC2740ik != null) {
                        C3594uq.m16664ri(abstractC2740ik.m10363fi());
                        C3529fi.m15965ri("compliance_status", abstractC2740ik.m10363fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            m14737lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14747ri(InterfaceC3306ka interfaceC3306ka) {
        this.f11547lr = interfaceC3306ka;
    }
}
