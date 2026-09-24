package com.bytedance.sdk.openadsdk.p251qt;

import android.content.Context;
import com.bytedance.sdk.component.p145fi.InterfaceC2589ac;
import com.bytedance.sdk.component.p145fi.InterfaceC2594fi;
import com.bytedance.sdk.component.p145fi.InterfaceC2596ka;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2631vr;
import com.bytedance.sdk.component.p145fi.ihz;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2599fi;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2602lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.C2607lr;
import com.bytedance.sdk.component.p145fi.p154ri.C2626ik;
import com.bytedance.sdk.component.p145fi.p154ri.C2627ka;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.C2647di;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.utils.C2725qt;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3597xd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3491ka {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.ka$ri */
    private static final class ri {

        /* JADX INFO: renamed from: lr */
        private static final InterfaceC2631vr f12646lr = m15846ri(C3299nr.m14642ri());

        /* JADX INFO: renamed from: ik */
        private static int f12644ik = 10;

        /* JADX INFO: renamed from: ka */
        private static int f12645ka = 15;

        /* JADX INFO: renamed from: fi */
        private static int f12643fi = 30;

        /* JADX INFO: renamed from: ri */
        public static boolean f12647ri = false;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.ka$ri$ri, reason: collision with other inner class name */
        private static class C15471ri implements InterfaceC2596ka {
            private C15471ri() {
            }

            /* JADX INFO: renamed from: ri */
            private C2626ik m15850ri(C2627ka c2627ka, Throwable th) {
                th.getMessage();
                if (c2627ka != null) {
                    c2627ka.m9736ik(System.currentTimeMillis());
                }
                C2626ik c2626ik = new C2626ik(98765, th, "net failed");
                c2626ik.m9735ri(c2627ka);
                return c2626ik;
            }

            /* JADX INFO: renamed from: ri */
            private Map<String, String> m15851ri(InterfaceC2594fi interfaceC2594fi, bgr bgrVar) {
                if (!interfaceC2594fi.mo9565lr()) {
                    return null;
                }
                C2647di c2647diXha = bgrVar.xha();
                HashMap map = new HashMap();
                int iM9910ri = c2647diXha.m9910ri();
                for (int i = 0; i < iM9910ri; i++) {
                    String strM9911ri = c2647diXha.m9911ri(i);
                    String strM9909lr = c2647diXha.m9909lr(i);
                    if (strM9911ri != null) {
                        map.put(strM9911ri, strM9909lr);
                    }
                }
                return map;
            }

            @Override // com.bytedance.sdk.component.p145fi.InterfaceC2596ka
            /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
            public C2626ik mo9572ri(InterfaceC2594fi interfaceC2594fi) {
                AbstractC2671sf abstractC2671sfXha = C2751lr.m10463lr().m10466ik().xha();
                AbstractC2646co abstractC2646coM9898lr = new AbstractC2646co.ri().m9896lr(interfaceC2594fi.mo9566ri()).m9899ri().m9898lr();
                bgr bgrVarMo9923lr = null;
                C2627ka c2627ka = interfaceC2594fi.mo9564ik() ? new C2627ka() : null;
                if (c2627ka != null) {
                    c2627ka.m9738ri(System.currentTimeMillis());
                }
                try {
                    bgrVarMo9923lr = abstractC2671sfXha.mo9987ri(abstractC2646coM9898lr).mo9923lr();
                    if (c2627ka != null) {
                        c2627ka.m9737lr(System.currentTimeMillis());
                    }
                    C2626ik c2626ik = new C2626ik(bgrVarMo9923lr.mo9878ik(), bgrVarMo9923lr.mo9876di().mo9983ka(), "", m15851ri(interfaceC2594fi, bgrVarMo9923lr));
                    C2725qt.m10269ri(bgrVarMo9923lr);
                    return c2626ik;
                } catch (Throwable th) {
                    try {
                        return m15850ri(c2627ka, th);
                    } finally {
                        C2725qt.m10269ri(bgrVarMo9923lr);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static InterfaceC2624qt m15838lr(C3286nr c3286nr) {
            return m15843ri(f12646lr.mo9680ri(c3286nr.m14220ri()).mo9660ri(c3286nr.m14217lr()).mo9655lr(c3286nr.m14215ik()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9665ri(c3286nr.xha()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static InterfaceC2624qt m15839lr(String str) {
            return m15843ri(f12646lr.mo9680ri(str).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static InputStream m15841lr(String str, String str2) {
            return f12646lr.mo9681ri(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lr */
        public static boolean m15842lr(String str, String str2, String str3) {
            return f12646lr.mo9682ri(str, str2, str3);
        }

        /* JADX INFO: renamed from: ri */
        private static InterfaceC2624qt m15843ri(InterfaceC2624qt interfaceC2624qt) {
            return C3597xd.m16680ri() ? interfaceC2624qt.mo9664ri(new C3489fi()) : interfaceC2624qt;
        }

        /* JADX INFO: renamed from: ri */
        private static InterfaceC2631vr m15846ri(Context context) {
            m15848ri();
            return C2602lr.m9679ri(context, new C2599fi.ri().m9607ri(new C2607lr(0, f12644ik, f12645ka, f12643fi, new File(CacheDirFactory.getImageCacheDir("image_p")))).m9608ri(f12647ri).m9604ri(new InterfaceC2589ac() { // from class: com.bytedance.sdk.openadsdk.qt.ka.ri.2
                @Override // com.bytedance.sdk.component.p145fi.InterfaceC2589ac
                /* JADX INFO: renamed from: lr */
                public ExecutorService mo9553lr() {
                    return dzy.m16394ik();
                }

                @Override // com.bytedance.sdk.component.p145fi.InterfaceC2589ac
                /* JADX INFO: renamed from: ri */
                public ExecutorService mo9554ri() {
                    return dzy.m16400lr();
                }
            }).m9605ri(new ihz() { // from class: com.bytedance.sdk.openadsdk.qt.ka.ri.1
                @Override // com.bytedance.sdk.component.p145fi.ihz
                /* JADX INFO: renamed from: ri */
                public void mo9567ri(int i, String str) {
                    C3521ka.m15950ri(str, true);
                }
            }).m9606ri(new C15471ri()).m9609ri());
        }

        /* JADX INFO: renamed from: ri */
        public static void m15848ri() {
            f12644ik = C3606fi.m16704ri("image_config", "bitmap_cache_count", 10);
            f12645ka = C3606fi.m16704ri("image_config", "data_cache_count", 15);
            f12643fi = C3606fi.m16704ri("image_config", "disk_cache_count", 30);
            f12647ri = C3606fi.m16703ri("img_need_scale", 0) == 1;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m15832lr() {
        return ri.f12647ri;
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2624qt m15833ri(C3286nr c3286nr) {
        return ri.m15838lr(c3286nr);
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2624qt m15834ri(String str) {
        return ri.m15839lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2631vr m15835ri() {
        return ri.f12646lr;
    }

    /* JADX INFO: renamed from: ri */
    public static InputStream m15836ri(String str, String str2) {
        return ri.m15841lr(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15837ri(String str, String str2, String str3) {
        return ri.m15842lr(str, str2, str3);
    }
}
