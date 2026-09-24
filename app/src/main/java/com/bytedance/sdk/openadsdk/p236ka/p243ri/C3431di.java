package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2556ik;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2558lr;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.p139lr.C2560lr;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.p139lr.C2561ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.settings.xha;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3400fi;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3520ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3525ka;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3431di implements InterfaceC2556ik {

    /* JADX INFO: renamed from: lr */
    private final C3438ri f12424lr = C3438ri.m15689ri();

    /* JADX INFO: renamed from: ri */
    public wjv<C3430ri> f12425ri;

    /* JADX INFO: renamed from: ik */
    private boolean m15657ik(List<C3430ri> list) {
        JSONObject jSONObjectMo15406ik;
        if (list == null || list.size() == 0 || (jSONObjectMo15406ik = list.get(0).mo15406ik()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectMo15406ik.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public HashMap<String, List<InterfaceC2552ri>> m15658ka(List<InterfaceC2552ri> list) {
        HashMap<String, List<InterfaceC2552ri>> map = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2552ri interfaceC2552ri = list.get(i);
            JSONObject jSONObjectMo9282di = interfaceC2552ri.mo9282di();
            if (jSONObjectMo9282di != null) {
                String strOptString = jSONObjectMo9282di.optString("app_log_url");
                List<InterfaceC2552ri> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(interfaceC2552ri);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m15661ri(List<C3430ri> list, C3400fi c3400fi) {
        return !m15657ik(list) && c3400fi.f12128lr >= 400 && c3400fi.f12128lr < 500;
    }

    /* JADX INFO: renamed from: lr */
    public C3400fi m15662lr(List<C3525ka.ri> list) {
        if (this.f12425ri == null) {
            this.f12425ri = C3299nr.m14638ik();
        }
        if (list != null && list.size() != 0 && xha.m14907ri()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<C3525ka.ri> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().f12795lr);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strM14689ka = C3304qt.m14669lr().m14689ka();
                if (strM14689ka == null) {
                    strM14689ka = "";
                }
                StringBuilder sb = new StringBuilder(C3593su.m16658ri());
                sb.append("-");
                sb.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", C2717fi.m10220ri(strM14689ka + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", C2717fi.m10220ri(sb.toString()));
                return this.f12425ri.mo12634lr(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public C3400fi m15663ri(List<C3430ri> list) {
        if (this.f12425ri == null) {
            this.f12425ri = C3299nr.m14638ik();
        }
        if (this.f12425ri == null) {
            return null;
        }
        return this.f12425ri.mo12636ri(this.f12424lr.m15697ri(this.f12424lr.m15693ik(list), System.currentTimeMillis(), this.f12424lr.m15695lr()), this.f12424lr.m15696ri(list), this.f12424lr.m15694lr(list));
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2556ik
    /* JADX INFO: renamed from: ri */
    public void mo9318ri(final List<InterfaceC2552ri> list, final InterfaceC2558lr interfaceC2558lr) {
        InterfaceC2552ri interfaceC2552ri;
        if (list == null || list.isEmpty() || C3307lr.m14718ri().m14722fi() || (interfaceC2552ri = list.get(0)) == null) {
            return;
        }
        byte bMo9286ka = interfaceC2552ri.mo9286ka();
        final ArrayList arrayList = new ArrayList();
        if (bMo9286ka == 0) {
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.1
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("applog");
                    return c3481ri;
                }
            });
            dzy.m16393fi(new AbstractRunnableC2676ik("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = C3431di.this.m15658ka(list).entrySet().iterator();
                    } catch (Throwable th) {
                        C2707ac.m10196ik("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        InterfaceC2558lr interfaceC2558lr2 = interfaceC2558lr;
                        if (interfaceC2558lr2 != null) {
                            interfaceC2558lr2.mo9332ri(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            List<InterfaceC2552ri> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (InterfaceC2552ri interfaceC2552ri2 : list2) {
                                arrayList2.add(new C3430ri(interfaceC2552ri2.mo9284ik(), interfaceC2552ri2.mo9282di()));
                            }
                            C3400fi c3400fiM15663ri = C3431di.this.m15663ri(arrayList2);
                            if (interfaceC2558lr != null && c3400fiM15663ri != null) {
                                boolean z = c3400fiM15663ri.f12127ka;
                                if (C3431di.this.m15661ri(arrayList2, c3400fiM15663ri)) {
                                    z = true;
                                }
                                boolean z2 = z;
                                arrayList.add(new C2561ri(new C2560lr(c3400fiM15663ri.f12129ri, c3400fiM15663ri.f12128lr, c3400fiM15663ri.f12126ik, z2, ""), list2));
                                if (c3400fiM15663ri.f12128lr == 200) {
                                    C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.1
                                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                        /* JADX INFO: renamed from: ri */
                                        public C3481ri mo10650ri() {
                                            C3481ri c3481ri = new C3481ri();
                                            c3481ri.m15784lr("applog");
                                            return c3481ri;
                                        }
                                    });
                                } else if (z2) {
                                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.2
                                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                        /* JADX INFO: renamed from: ri */
                                        public C3481ri mo10650ri() {
                                            C3481ri c3481ri = new C3481ri();
                                            c3481ri.m15784lr("applog");
                                            return c3481ri;
                                        }
                                    });
                                } else {
                                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.3
                                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                        /* JADX INFO: renamed from: ri */
                                        public C3481ri mo10650ri() {
                                            C3481ri c3481ri = new C3481ri();
                                            c3481ri.m15784lr("applog");
                                            return c3481ri;
                                        }
                                    });
                                }
                            }
                            if (interfaceC2558lr != null && c3400fiM15663ri == null) {
                                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.4
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("applog");
                                        return c3481ri;
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            C2707ac.m10196ik("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    InterfaceC2558lr interfaceC2558lr3 = interfaceC2558lr;
                    if (interfaceC2558lr3 != null) {
                        interfaceC2558lr3.mo9332ri(arrayList);
                    }
                }
            });
            return;
        }
        if (bMo9286ka == 1) {
            if (C3520ik.m15934lr()) {
                if (interfaceC2558lr != null) {
                    arrayList.add(new C2561ri(new C2560lr(true, 200, "", false, ""), list));
                    interfaceC2558lr.mo9332ri(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (InterfaceC2552ri interfaceC2552ri2 : list) {
                arrayList2.add(new C3525ka.ri(interfaceC2552ri2.mo9284ik(), interfaceC2552ri2.mo9282di()));
            }
            if (arrayList2.size() > 0) {
                C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.3
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("stats");
                        return c3481ri;
                    }
                });
                dzy.m16393fi(new AbstractRunnableC2676ik("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4
                    @Override // java.lang.Runnable
                    public void run() {
                        C3400fi c3400fiM15662lr = C3431di.this.m15662lr(arrayList2);
                        if (interfaceC2558lr != null && c3400fiM15662lr != null) {
                            arrayList.add(new C2561ri(new C2560lr(c3400fiM15662lr.f12129ri, c3400fiM15662lr.f12128lr, c3400fiM15662lr.f12126ik, c3400fiM15662lr.f12127ka, ""), list));
                            interfaceC2558lr.mo9332ri(arrayList);
                            if (c3400fiM15662lr.f12128lr == 200) {
                                C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.1
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("stats");
                                        return c3481ri;
                                    }
                                });
                            } else if (c3400fiM15662lr.f12127ka) {
                                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.2
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("stats");
                                        return c3481ri;
                                    }
                                });
                            } else {
                                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.3
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("stats");
                                        return c3481ri;
                                    }
                                });
                            }
                        }
                        if (interfaceC2558lr == null || c3400fiM15662lr != null) {
                            return;
                        }
                        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.4
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr("stats");
                                return c3481ri;
                            }
                        });
                    }
                });
            }
        }
    }
}
