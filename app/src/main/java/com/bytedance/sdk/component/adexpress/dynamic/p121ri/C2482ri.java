package com.bytedance.sdk.component.adexpress.dynamic.p121ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2403lr;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.InterfaceC2437mj;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.adexpress.p125lr.xha;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.jbs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2482ri implements InterfaceC2505ka<DynamicRootView>, InterfaceC2510sf {

    /* JADX INFO: renamed from: di */
    private C2500aw f6834di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2507mj f6835fi;

    /* JADX INFO: renamed from: ik */
    private Context f6836ik;

    /* JADX INFO: renamed from: ka */
    private xha f6837ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2437mj f6838lr;

    /* JADX INFO: renamed from: mj */
    private AtomicBoolean f6839mj = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    private DynamicRootView f6840ri;
    private ScheduledFuture<?> xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ri.ri$ri */
    private class ri implements Runnable {

        /* JADX INFO: renamed from: lr */
        private int f6846lr;

        public ri(int i) {
            this.f6846lr = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6846lr == 2) {
                C2482ri.this.f6840ri.callBackRenderFail(C2482ri.this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    public C2482ri(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, InterfaceC2437mj interfaceC2437mj, C2500aw c2500aw, InterfaceC2404ri interfaceC2404ri) {
        this.f6836ik = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, c2500aw, interfaceC2404ri);
        this.f6840ri = dynamicRootView;
        this.f6838lr = interfaceC2437mj;
        this.f6834di = c2500aw;
        dynamicRootView.setRenderListener(this);
        this.f6834di = c2500aw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m8737di() {
        this.f6834di.m8881fi().mo8992lr(mo8752ik());
        JSONObject jSONObjectM8883ik = this.f6834di.m8883ik();
        if (C2523lr.m9121ri(jSONObjectM8883ik)) {
            this.f6838lr.mo8408ri(new InterfaceC2403lr() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2403lr
                /* JADX INFO: renamed from: ri */
                public void mo8306ri(final C2475mj c2475mj) {
                    C2482ri.this.m8746mj();
                    C2482ri.this.f6834di.m8881fi().mo8989ik(C2482ri.this.mo8752ik());
                    C2482ri.this.m8748ri(c2475mj);
                    C2482ri.this.m8743lr(c2475mj);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        C2482ri.this.m8740ik(c2475mj);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2482ri.this.m8740ik(c2475mj);
                            }
                        });
                    }
                    if (C2482ri.this.f6840ri == null || c2475mj == null) {
                        return;
                    }
                    C2482ri.this.f6840ri.setBgColor(c2475mj.m8628ri());
                    C2482ri.this.f6840ri.setBgMaterialCenterCalcColor(c2475mj.m8621lr());
                }
            });
            this.f6838lr.mo8409ri(this.f6834di);
            return;
        }
        int i = this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113;
        DynamicRootView dynamicRootView = this.f6840ri;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectM8883ik == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m8740ik(C2475mj c2475mj) {
        if (c2475mj == null) {
            this.f6840ri.callBackRenderFail(this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113, "layoutUnit is null");
            return;
        }
        this.f6834di.m8881fi().mo8991ka(mo8752ik());
        try {
            this.f6840ri.render(c2475mj, mo8752ik());
        } catch (Exception e) {
            int i = this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.f6840ri.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m8743lr(C2475mj c2475mj) {
        float fXha;
        float fM8591di;
        List<C2475mj> listM8638sf;
        if (c2475mj == null) {
            return;
        }
        List<C2475mj> listM8638sf2 = c2475mj.m8638sf();
        if (listM8638sf2 == null || listM8638sf2.size() <= 0) {
            fXha = 0.0f;
        } else {
            fXha = 0.0f;
            for (C2475mj c2475mj2 : listM8638sf2) {
                if (c2475mj2.xha() > c2475mj.xha() - c2475mj2.jbs() || (listM8638sf = c2475mj2.m8638sf()) == null || listM8638sf.size() <= 0) {
                    fM8591di = 0.0f;
                } else {
                    fM8591di = 0.0f;
                    for (C2475mj c2475mj3 : listM8638sf) {
                        if (c2475mj3.m8627qt().m8596lr().equals("logo-union")) {
                            fM8591di = c2475mj3.m8627qt().m8591di();
                            fXha = (((-fM8591di) + c2475mj.xha()) - c2475mj2.xha()) + c2475mj2.m8627qt().m8592fi().zxp();
                        }
                    }
                }
                m8743lr(c2475mj2);
                if (fM8591di <= -15.0f) {
                    c2475mj2.m8613di(c2475mj2.jbs() - fM8591di);
                    c2475mj2.m8620ka(c2475mj2.xha() + fM8591di);
                    for (C2475mj c2475mj4 : c2475mj2.m8638sf()) {
                        c2475mj4.m8620ka(c2475mj4.xha() - fM8591di);
                    }
                }
            }
        }
        C2475mj c2475mjM8611co = c2475mj.m8611co();
        if (c2475mjM8611co == null) {
            return;
        }
        float fM8612di = c2475mj.m8612di() - c2475mjM8611co.m8612di();
        float fXha2 = c2475mj.xha() - c2475mjM8611co.xha();
        c2475mj.m8617ik(fM8612di);
        c2475mj.m8620ka(fXha2);
        if (fXha > 0.0f) {
            c2475mj.m8620ka(c2475mj.xha() - fXha);
            c2475mj.m8613di(c2475mj.jbs() + fXha);
            for (C2475mj c2475mj5 : c2475mj.m8638sf()) {
                c2475mj5.m8620ka(c2475mj5.xha() + fXha);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public void m8746mj() {
        try {
            ScheduledFuture<?> scheduledFuture = this.xha;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.xha.cancel(false);
            this.xha = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private void m8747ri(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                m8747ri(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof dzy) {
            ((dzy) view).mo8296lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8748ri(C2475mj c2475mj) {
        List<C2475mj> listM8638sf;
        if (c2475mj == null || (listM8638sf = c2475mj.m8638sf()) == null || listM8638sf.size() <= 0) {
            return;
        }
        Collections.sort(listM8638sf, new Comparator<C2475mj>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(C2475mj c2475mj2, C2475mj c2475mj3) {
                C2470di c2470diM8592fi = c2475mj2.m8627qt().m8592fi();
                C2470di c2470diM8592fi2 = c2475mj3.m8627qt().m8592fi();
                if (c2470diM8592fi == null || c2470diM8592fi2 == null) {
                    return 0;
                }
                return c2470diM8592fi.m8537nh() >= c2470diM8592fi2.m8537nh() ? 1 : -1;
            }
        });
        for (C2475mj c2475mj2 : listM8638sf) {
            if (c2475mj2 != null) {
                m8748ri(c2475mj2);
            }
        }
    }

    private boolean xha() {
        DynamicRootView dynamicRootView = this.f6840ri;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ik */
    public int mo8752ik() {
        return this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? 3 : 2;
    }

    /* JADX INFO: renamed from: ka */
    public DynamicRootView m8753ka() {
        return this.f6840ri;
    }

    /* JADX INFO: renamed from: lr */
    public void mo8754lr() {
        m8747ri(mo8751fi());
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public DynamicRootView mo8751fi() {
        return m8753ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8756ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        InterfaceC2507mj interfaceC2507mj = this.f6835fi;
        if (interfaceC2507mj != null) {
            interfaceC2507mj.mo9002ri(view, i, interfaceC2488ik);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf
    /* JADX INFO: renamed from: ri */
    public void mo8757ri(bgr bgrVar) {
        if (this.f6839mj.get()) {
            return;
        }
        this.f6839mj.set(true);
        if (!bgrVar.m8959lr() || !xha()) {
            this.f6837ka.mo8981ri(bgrVar.m8961qt(), bgrVar.jbs());
            return;
        }
        this.f6840ri.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6837ka.mo8982ri(mo8751fi(), bgrVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m8758ri(InterfaceC2507mj interfaceC2507mj) {
        this.f6835fi = interfaceC2507mj;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(xha xhaVar) {
        this.f6837ka = xhaVar;
        int iM8880di = this.f6834di.m8880di();
        if (iM8880di < 0) {
            this.f6840ri.callBackRenderFail(this.f6838lr instanceof com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(iM8880di)));
            return;
        }
        this.xha = C2495ka.m8820ri(new ri(2), iM8880di, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() != Looper.myLooper() || this.f6834di.jbs() > 0) {
            jbs.m10234lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C2482ri.this.m8737di();
                }
            }, this.f6834di.jbs());
        } else {
            m8737di();
        }
    }
}
