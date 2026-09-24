package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.ironsource.C11540L6;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.su */
/* JADX INFO: loaded from: classes3.dex */
public class C3330su {

    /* JADX INFO: renamed from: ik */
    private static final AtomicInteger f11681ik;

    /* JADX INFO: renamed from: ka */
    private static final AtomicInteger f11682ka;

    /* JADX INFO: renamed from: lr */
    private static final AtomicInteger f11683lr;

    /* JADX INFO: renamed from: ri */
    private static final AtomicInteger f11684ri;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        f11684ri = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f11683lr = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f11681ik = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        f11682ka = atomicInteger4;
        atomicInteger.addAndGet(C3535ri.m16063ri("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(C3535ri.m16063ri("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(C3535ri.m16063ri("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(C3535ri.m16063ri("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    /* JADX INFO: renamed from: lr */
    private static void m14967lr() {
        final int i = f11684ri.get();
        final int i2 = f11683lr.get();
        final int i3 = f11681ik.get();
        final int i4 = f11682ka.get();
        C3521ka.m15952ri("crypt_v4_statistics", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.su.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable unused) {
                }
                return C3531ka.m15967lr().m15985ri("crypt_v4_statistics").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static synchronized void m14968lr(boolean z) {
        try {
            if (z) {
                C3535ri.m16074ri("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(f11684ri.incrementAndGet()));
            } else {
                C3535ri.m16074ri("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f11683lr.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14969ri() {
        try {
            long jM16065ri = C3535ri.m16065ri("encrypt_statistics_file", "upload_time_key", 0L);
            if (jM16065ri <= 0 || System.currentTimeMillis() - jM16065ri < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (jM16065ri <= 0 || jM16065ri > System.currentTimeMillis()) {
                    C3535ri.m16075ri("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            m14967lr();
            synchronized (C3330su.class) {
                f11684ri.set(0);
                f11683lr.set(0);
                f11681ik.set(0);
                f11682ka.set(0);
                C3535ri.m16071ri("encrypt_statistics_file");
                C3535ri.m16075ri("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14970ri(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        C3521ka.m15952ri("crypt_v4_fail", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.su.2
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put(C11540L6.f24899B, Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return C3531ka.m15967lr().m15985ri("crypt_v4_fail").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m14971ri(JSONObject jSONObject) {
        m14968lr(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    /* JADX INFO: renamed from: ri */
    public static synchronized void m14972ri(boolean z) {
        try {
            if (z) {
                C3535ri.m16074ri("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f11681ik.incrementAndGet()));
            } else {
                C3535ri.m16074ri("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f11681ik.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
