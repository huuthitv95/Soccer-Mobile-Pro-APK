package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.p235ik.C3377ik;
import com.bytedance.sdk.openadsdk.tool.C3539ri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TTDelegateActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: ka */
    private static final Map<String, com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri> f8033ka = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ik */
    private ory f8034ik;

    /* JADX INFO: renamed from: lr */
    private Intent f8035lr;

    /* JADX INFO: renamed from: ri */
    wjv f8036ri = null;

    /* JADX INFO: renamed from: fi */
    private void m10594fi() {
        int intExtra = this.f8035lr.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (this.f8036ri == null) {
                this.f8036ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(this.f8035lr));
            }
            wjv wjvVar = this.f8036ri;
            if (wjvVar == null) {
                finish();
            } else {
                m10602ri(wjvVar.yjg(), C3539ri.m16095ri(this.f8036ri.m14409ib()), this.f8035lr.getStringExtra("closed_listener_key"), this.f8036ri);
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m10596ka() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: ri */
    public static void m10599ri(wjv wjvVar, String str) {
        m10600ri(wjvVar, str, null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m10600ri(wjv wjvVar, String str, com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri interfaceC3266ri) {
        if (wjvVar == null) {
            return;
        }
        Intent intent = new Intent(C3299nr.m14642ri(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(wjvVar));
        if (interfaceC3266ri != null) {
            f8033ka.put(str, interfaceC3266ri);
        }
        C2722lr.m10241ri(C3299nr.m14642ri(), intent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10601ri(String str) {
        Map<String, com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri> map = f8033ka;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (C2730vr.m10314ik()) {
            map.size();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m10602ri(String str, String str2, final String str3, wjv wjvVar) {
        if (str2 != null && str != null && this.f8034ik == null) {
            C3377ik c3377ik = new C3377ik(this, str, C3539ri.m16096ri(str2), wjvVar);
            this.f8034ik = c3377ik;
            c3377ik.mo14649ri(new ory.InterfaceC3301ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.ory.InterfaceC3301ri
                /* JADX INFO: renamed from: ri */
                public void mo10603ri() {
                    if (!((C3377ik) TTDelegateActivity.this.f8034ik).m15288ik()) {
                        TTDelegateActivity.this.m10601ri(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((C3377ik) TTDelegateActivity.this.f8034ik).m15289ri(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.ory.InterfaceC3301ri
                /* JADX INFO: renamed from: ri */
                public void mo10604ri(int i, String str4) {
                    com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri interfaceC3266riM14683fi;
                    if (TTDelegateActivity.f8033ka != null && TTDelegateActivity.f8033ka.size() > 0 && !TextUtils.isEmpty(str3)) {
                        com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri interfaceC3266ri = (com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri) TTDelegateActivity.f8033ka.get(str3);
                        if (interfaceC3266ri != null) {
                            interfaceC3266ri.mo13880ri();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (interfaceC3266riM14683fi = C3304qt.m14669lr().m14683fi(str3)) != null) {
                        interfaceC3266riM14683fi.mo13880ri();
                        C3304qt.m14669lr().m14682di(str3);
                    }
                    TTDelegateActivity.this.m10601ri(str3);
                    TTDelegateActivity.this.finish();
                }
            });
        }
        ory oryVar = this.f8034ik;
        if (oryVar != null) {
            oryVar.mo14648ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        m10596ka();
        this.f8035lr = getIntent();
        if (C3299nr.m14642ri() == null) {
            C3299nr.m14641lr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ory oryVar = this.f8034ik;
        if (oryVar != null) {
            oryVar.mo14647lr();
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C3299nr.m14642ri() == null) {
            C3299nr.m14641lr(this);
        }
        setIntent(intent);
        this.f8035lr = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        ory oryVar = this.f8034ik;
        if ((oryVar == null || ((C3377ik) oryVar).f12012ri == null || !((C3377ik) this.f8034ik).f12012ri.isShowing()) && this.f8035lr != null) {
            m10594fi();
        }
    }
}
