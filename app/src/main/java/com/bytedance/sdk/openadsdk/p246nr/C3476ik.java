package com.bytedance.sdk.openadsdk.p246nr;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.metadata.C12364a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3476ik {

    /* JADX INFO: renamed from: ik */
    private static volatile HandlerThread f12569ik = C2723mj.m10251ri("pag__bus_monitor", 0);

    /* JADX INFO: renamed from: ka */
    private static volatile Handler f12570ka;

    /* JADX INFO: renamed from: lr */
    private static Boolean f12571lr;

    /* JADX INFO: renamed from: ri */
    private static volatile C3482ri f12572ri;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public static Handler m15756fi() {
        if (f12569ik == null || !f12569ik.isAlive()) {
            synchronized (C3332vr.class) {
                if (f12569ik == null || !f12569ik.isAlive()) {
                    f12569ik = C2723mj.m10251ri("pag_init_handle", -1);
                    f12570ka = new Handler(f12569ik.getLooper());
                }
            }
        } else if (f12570ka == null) {
            synchronized (C3332vr.class) {
                if (f12570ka == null) {
                    f12570ka = new Handler(f12569ik.getLooper());
                }
            }
        }
        return f12570ka;
    }

    /* JADX INFO: renamed from: ik */
    public static void m15758ik(InterfaceC3478ka interfaceC3478ka) {
        m15762ri().m15806ri(new C3475fi(interfaceC3478ka, 0, 0, 1));
    }

    /* JADX INFO: renamed from: lr */
    public static void m15760lr() {
        m15762ri().m15807ri(true);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15761lr(InterfaceC3478ka interfaceC3478ka) {
        m15762ri().m15806ri(new C3475fi(interfaceC3478ka, 0, 1, 0));
    }

    /* JADX INFO: renamed from: ri */
    public static C3482ri m15762ri() {
        if (f12572ri == null) {
            synchronized (C3476ik.class) {
                if (f12572ri == null) {
                    f12572ri = C3482ri.m15802ri(new InterfaceC3480lr() { // from class: com.bytedance.sdk.openadsdk.nr.ik.1
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public Context getContext() {
                            return C3299nr.m14642ri();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public Handler getHandler() {
                            return C3476ik.m15756fi();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public int getOnceLogCount() {
                            int iM16704ri = C3606fi.m16704ri("bus_monitor_config", "once_count", 10);
                            if (iM16704ri > 100 || iM16704ri < 5) {
                                return 10;
                            }
                            return iM16704ri;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public int getOnceLogInterval() {
                            int iM16704ri = C3606fi.m16704ri("bus_monitor_config", "once_interval", 10000);
                            if (iM16704ri < 10000) {
                                return 10000;
                            }
                            return iM16704ri;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public HandlerThread getSafeHandlerThread(String str, int i) {
                            return C2723mj.m10251ri(str, i);
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public int getUploadIntervalTime() {
                            int iM16704ri = C3606fi.m16704ri("bus_monitor_config", "interval", 86400000);
                            if (iM16704ri < 3600000) {
                                return 86400000;
                            }
                            return iM16704ri;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public boolean isMonitorOpen() {
                            if (C3476ik.f12571lr != null) {
                                return C3476ik.f12571lr.booleanValue();
                            }
                            Boolean unused = C3476ik.f12571lr = Boolean.valueOf(C3606fi.m16704ri("bus_monitor_config", C12364a.f31324j, 1) == 1);
                            return C3476ik.f12571lr.booleanValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3480lr
                        public void onMonitorUpload(List<C3481ri> list) {
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            for (final C3481ri c3481ri : list) {
                                C3521ka.m15952ri("bus_monitor", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.nr.ik.1.1
                                    @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                                    /* JADX INFO: renamed from: ri */
                                    public InterfaceC3530ik mo11574ri() throws Exception {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("sdk_version", c3481ri.m15781lr());
                                            jSONObject.put("scene", c3481ri.m15775ik());
                                            jSONObject.put("start_count", c3481ri.m15778ka());
                                            jSONObject.put("success_count", c3481ri.m15773fi());
                                            jSONObject.put("fail_count", c3481ri.m15771di());
                                            jSONObject.put("rit", c3481ri.xha());
                                            jSONObject.put(ViewHierarchyConstants.TAG_KEY, c3481ri.m15785mj());
                                            jSONObject.put("label", c3481ri.jbs());
                                            jSONObject.put("mediation", c3481ri.m15791sf());
                                            jSONObject.put("is_init", c3481ri.m15770co());
                                            jSONObject.put("extra", c3481ri.m15769aw());
                                            jSONObject.put("date_device", c3481ri.m15786qt());
                                            return C3531ka.m15967lr().m15985ri("bus_monitor").m15980lr(jSONObject.toString());
                                        } catch (Exception e) {
                                            C2707ac.m10206ri("BusMonitorUtils", "onMonitorUpload: ", e);
                                            return null;
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
        return f12572ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m15764ri(InterfaceC3478ka interfaceC3478ka) {
        m15762ri().m15806ri(new C3475fi(interfaceC3478ka, 1, 0, 0));
    }
}
