package com.bytedance.sdk.component.p130di.p131ri.p132di;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.AbstractRunnableC2541fi;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import com.tiktok.util.UrlConst;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2536ik implements InterfaceC2538lr {

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2535fi f7031lr;

    /* JADX INFO: renamed from: ri */
    private final Context f7032ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.di.ik$ri */
    private class ri extends AbstractRunnableC2541fi {

        /* JADX INFO: renamed from: ik */
        private final String f7040ik;

        /* JADX INFO: renamed from: ka */
        private final Map<String, String> f7041ka;

        /* JADX INFO: renamed from: lr */
        private final C2537ka f7042lr;

        private ri(C2537ka c2537ka, String str, Map<String, String> map) {
            super("AdsStats");
            this.f7042lr = c2537ka;
            this.f7040ik = str;
            this.f7041ka = map;
        }

        /* JADX INFO: renamed from: ik */
        private String m9192ik(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.f7040ik)) ? str.replace("{UID}", this.f7040ik).replace("__UID__", this.f7040ik) : str;
        }

        /* JADX INFO: renamed from: lr */
        String m9193lr(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(C2536ik.m9183ik().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        /* JADX INFO: renamed from: ri */
        boolean m9194ri(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith(UrlConst.HTTPS);
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2543ka interfaceC2543kaMo9234ri;
            InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
            if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || !interfaceC2540fiM9549vr.mo9217ik() || !m9194ri(this.f7042lr.m9200lr())) {
                return;
            }
            if (this.f7042lr.m9199ka() >= interfaceC2540fiM9549vr.mo9216ik(this.f7042lr.m9195di())) {
                C2536ik.this.f7031lr.mo9178ik(this.f7042lr);
                return;
            }
            try {
                if (this.f7042lr.m9210sf()) {
                    C2536ik.this.f7031lr.mo9182ri(this.f7042lr);
                }
                if (interfaceC2540fiM9549vr.mo9228ri(C2536ik.this.m9188ri())) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM9200lr = this.f7042lr.m9200lr();
                    if (interfaceC2540fiM9549vr.mo9214di() == 0) {
                        strM9200lr = m9192ik(this.f7042lr.m9200lr());
                        if (this.f7042lr.m9198ik()) {
                            strM9200lr = m9193lr(strM9200lr);
                        }
                    }
                    InterfaceC2542ik interfaceC2542ikMo9222qt = interfaceC2540fiM9549vr.mo9222qt();
                    if (interfaceC2542ikMo9222qt == null) {
                        return;
                    }
                    interfaceC2542ikMo9222qt.mo9236ri("User-Agent", interfaceC2540fiM9549vr.jbs());
                    interfaceC2542ikMo9222qt.mo9236ri("csj_client_source_from", "1");
                    if (this.f7041ka != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.f7041ka.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        interfaceC2542ikMo9222qt.mo9236ri("csj_extra_info", jSONObject.toString());
                    }
                    interfaceC2542ikMo9222qt.mo9235ri(strM9200lr);
                    try {
                        interfaceC2543kaMo9234ri = interfaceC2542ikMo9222qt.mo9234ri();
                        try {
                            interfaceC2543kaMo9234ri.mo9239ri();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        interfaceC2543kaMo9234ri = null;
                    }
                    C2537ka c2537ka = this.f7042lr;
                    c2537ka.m9207ri(c2537ka.m9199ka() + 1);
                    if (interfaceC2543kaMo9234ri != null && interfaceC2543kaMo9234ri.mo9239ri()) {
                        C2536ik.this.f7031lr.mo9178ik(this.f7042lr);
                        this.f7042lr.m9200lr();
                        interfaceC2540fiM9549vr.mo9226ri(true, 200, System.currentTimeMillis() - jCurrentTimeMillis, this.f7042lr);
                        return;
                    }
                    if (interfaceC2543kaMo9234ri != null) {
                        this.f7042lr.m9201lr(interfaceC2543kaMo9234ri.mo9238lr());
                        this.f7042lr.m9197ik(interfaceC2543kaMo9234ri.mo9237ik());
                    }
                    if (interfaceC2543kaMo9234ri == null || interfaceC2543kaMo9234ri.mo9238lr() != 8848) {
                        this.f7042lr.m9200lr();
                        if (this.f7042lr.m9199ka() >= interfaceC2540fiM9549vr.mo9216ik(this.f7042lr.m9195di())) {
                            C2536ik.this.f7031lr.mo9178ik(this.f7042lr);
                            this.f7042lr.m9200lr();
                        } else {
                            C2536ik.this.f7031lr.mo9179lr(this.f7042lr);
                        }
                    } else {
                        interfaceC2543kaMo9234ri.mo9237ik();
                        C2536ik.this.f7031lr.mo9178ik(this.f7042lr);
                    }
                    interfaceC2540fiM9549vr.mo9226ri(false, this.f7042lr.m9203mj(), System.currentTimeMillis() - jCurrentTimeMillis, this.f7042lr);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public C2536ik(Context context, InterfaceC2535fi interfaceC2535fi) {
        this.f7032ri = context;
        this.f7031lr = interfaceC2535fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static Random m9183ik() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9187ri(List<C2537ka> list, String str, boolean z) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        for (C2537ka c2537ka : list) {
            if (interfaceC2540fiM9549vr == null || interfaceC2540fiM9549vr.mo9218ka() == null) {
                str2 = str;
            } else {
                c2537ka.m9209ri(z);
                str2 = str;
                interfaceC2540fiM9549vr.mo9218ka().execute(new ri(c2537ka, str2, null));
            }
            str = str2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public Context m9188ri() {
        Context context = this.f7032ri;
        return context == null ? xha.m9524di().m9528fi() : context;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2538lr
    /* JADX INFO: renamed from: ri */
    public Runnable mo9189ri(final C2537ka c2537ka, final String str, final Map<String, String> map) {
        if (c2537ka == null || TextUtils.isEmpty(c2537ka.m9206ri())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.di.ri.di.ik.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2536ik.this.f7031lr.mo9180ri(c2537ka.m9206ri()) != null) {
                    new ri(c2537ka, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2538lr
    /* JADX INFO: renamed from: ri */
    public void mo9190ri(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || interfaceC2540fiM9549vr.mo9218ka() == null || !interfaceC2540fiM9549vr.mo9217ik() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            interfaceC2540fiM9549vr.mo9218ka().execute(new ri(new C2537ka(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2538lr
    /* JADX INFO: renamed from: ri */
    public void mo9191ri(final String str, final boolean z) {
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr == null || xha.m9524di().m9528fi() == null || !interfaceC2540fiM9549vr.mo9217ik()) {
            return;
        }
        AbstractRunnableC2541fi abstractRunnableC2541fi = new AbstractRunnableC2541fi("trackFailedUrls") { // from class: com.bytedance.sdk.component.di.ri.di.ik.2
            @Override // java.lang.Runnable
            public void run() {
                C2536ik.this.m9187ri(C2536ik.this.f7031lr.mo9181ri(), str, z);
            }
        };
        abstractRunnableC2541fi.m9233ri(1);
        if (interfaceC2540fiM9549vr.mo9218ka() != null) {
            interfaceC2540fiM9549vr.mo9218ka().execute(abstractRunnableC2541fi);
        }
    }
}
