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
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3529fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qt.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3305ik {

    /* JADX INFO: renamed from: lr */
    private InterfaceC3306ka f11529lr;

    /* JADX INFO: renamed from: ri */
    private final AtomicInteger f11530ri = new AtomicInteger(0);

    /* JADX INFO: renamed from: ik */
    private final Runnable f11528ik = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.3
        @Override // java.lang.Runnable
        public void run() {
            C3305ik.this.m14715ri();
        }
    };

    /* JADX INFO: renamed from: ik */
    private JSONObject m14705ik() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", C3304qt.m14669lr().m14689ka());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    private JSONObject m14706lr(JSONObject jSONObject) {
        return C3112ay.m12608ri(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m14707lr() {
        if (!C3307lr.m14718ri().xha()) {
            m14712ri(false);
            return;
        }
        int iIncrementAndGet = this.f11530ri.incrementAndGet();
        if (iIncrementAndGet > 3) {
            m14712ri(false);
        } else {
            C3332vr.m14978lr().removeCallbacks(this.f11528ik);
            C3332vr.m14978lr().postDelayed(this.f11528ik, iIncrementAndGet * 10000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public JSONObject m14708ri(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", C2724nr.m10259ri(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m14712ri(boolean z) {
        InterfaceC3306ka interfaceC3306ka = this.f11529lr;
        if (interfaceC3306ka != null) {
            interfaceC3306ka.mo14717ri(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m14714ri(JSONObject jSONObject) {
        int iM14723ik = C3307lr.m14718ri().m14723ik();
        if (jSONObject.has("app_reg")) {
            iM14723ik = jSONObject.optInt("app_reg", -1);
            C3307lr.m14718ri().m14729ri(iM14723ik);
        }
        return iM14723ik == 1;
    }

    /* JADX INFO: renamed from: ri */
    public void m14715ri() {
        try {
            if (C3307lr.m14718ri().m14721di()) {
                m14712ri(true);
                return;
            }
            JSONObject jSONObjectM14705ik = m14705ik();
            C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
            final String strM16477ri = C3571ig.m16477ri("/api/ad/union/sdk/register_status/", false, true);
            c2741kaM10412lr.m10365ik(strM16477ri);
            c2741kaM10412lr.m10372lr("User-Agent", "");
            c2741kaM10412lr.m10385fi(m14706lr(jSONObjectM14705ik).toString());
            c2741kaM10412lr.m10373ri(6);
            c2741kaM10412lr.m10371lr("register_stats");
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.1
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("register_status");
                    c3481ri.xha(C3305ik.this.m14708ri(C3299nr.m14642ri()).toString());
                    return c3481ri;
                }
            });
            c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    String strM10357ka = c2739lr.m10357ka();
                    if (!c2739lr.m10354di() || TextUtils.isEmpty(strM10357ka)) {
                        C3305ik.this.m14707lr();
                        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.2
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr("register_status");
                                c3481ri.xha(C3305ik.this.m14708ri(C3299nr.m14642ri()).toString());
                                return c3481ri;
                            }
                        });
                        if (abstractC2740ik != null) {
                            C3594uq.m16664ri(abstractC2740ik.m10363fi());
                            C3529fi.m15965ri("register_status", strM16477ri, c2739lr.m10359ri(), c2739lr.m10358lr(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.1
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr("register_status");
                                c3481ri.xha(C3305ik.this.m14708ri(C3299nr.m14642ri()).toString());
                                return c3481ri;
                            }
                        });
                        C3594uq.m16661lr();
                        JSONObject jSONObject = new JSONObject(strM10357ka);
                        String strM12606ri = C3112ay.m12606ri(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                        if (TextUtils.isEmpty(strM12606ri)) {
                            C3305ik.this.m14707lr();
                            return;
                        }
                        C3305ik.this.m14712ri(C3305ik.this.m14714ri(new JSONObject(strM12606ri)));
                    } catch (Throwable unused) {
                        C3305ik.this.m14707lr();
                    }
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    C3305ik.this.m14707lr();
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.ik.2.3
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("register_status");
                            c3481ri.xha(C3305ik.this.m14708ri(C3299nr.m14642ri()).toString());
                            return c3481ri;
                        }
                    });
                    if (abstractC2740ik != null) {
                        C3594uq.m16664ri(abstractC2740ik.m10363fi());
                        C3529fi.m15965ri("register_status", abstractC2740ik.m10363fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            m14707lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14716ri(InterfaceC3306ka interfaceC3306ka) {
        this.f11529lr = interfaceC3306ka;
    }
}
