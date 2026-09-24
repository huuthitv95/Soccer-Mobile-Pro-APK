package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.C3298zf;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ri */
    private static volatile IPBroadcastReceiver f12606ri;

    /* JADX INFO: renamed from: ik */
    private InterfaceC3488ri f12607ik;

    /* JADX INFO: renamed from: ka */
    private int f12608ka = 0;

    /* JADX INFO: renamed from: lr */
    private final LruCache<String, wjv> f12609lr;

    private IPBroadcastReceiver() {
        int i = 10;
        int iM16704ri = C3606fi.m16704ri("ip_data_config", "ip_ad_cache_count", 10);
        if (iM16704ri > 0 && iM16704ri <= 200) {
            i = iM16704ri;
        }
        Integer.valueOf(i);
        this.f12609lr = new LruCache<>(i);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15814lr(final Context context, final wjv wjvVar) {
        C3298zf c3298zfM14562xz;
        if (f12606ri != null || wjvVar == null || (c3298zfM14562xz = wjvVar.m14562xz()) == null) {
            return;
        }
        if (c3298zfM14562xz.xha() || c3298zfM14562xz.m14630mj()) {
            C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.m15817ri(C3299nr.m14643ri(context), wjvVar);
                    } catch (Throwable th) {
                        C2707ac.m10206ri("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m15815lr(final Intent intent) {
        if (intent == null) {
            return;
        }
        dzy.m16401lr(new AbstractRunnableC2676ik("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int iM15825ri = C3487lr.m15825ri(intExtra);
                        final int iM15824lr = C3487lr.m15824lr(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(iM15825ri), Integer.valueOf(iM15824lr));
                        InterfaceC3488ri interfaceC3488ri = IPBroadcastReceiver.this.f12607ik;
                        if (iM15825ri > 0 && interfaceC3488ri != null) {
                            interfaceC3488ri.mo15826ri(stringExtra3, iM15825ri);
                        }
                        final wjv wjvVarM15820ri = IPBroadcastReceiver.this.m15820ri(stringExtra3);
                        if (wjvVarM15820ri != null) {
                            C3414ik.m15532ri(System.currentTimeMillis(), wjvVarM15820ri, C3571ig.m16476ri(wjvVarM15820ri), "ip_listener_log", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                                /* JADX INFO: renamed from: ri */
                                public JSONObject mo10798ri() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", iM15825ri);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", iM15824lr);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.f12608ka);
                                        wjv wjvVar = wjvVarM15820ri;
                                        if (wjvVar != null) {
                                            jSONObject.put("ip_is_w2a", wjvVar.m14458nr());
                                            if (wjvVarM15820ri.m14562xz() != null) {
                                                jSONObject.put("ip_oem_type", wjvVarM15820ri.m14562xz().m14617di());
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        C2707ac.m10206ri("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    C2707ac.m10206ri("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.f12608ka = 2;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static IPBroadcastReceiver m15817ri(Context context, wjv wjvVar) {
        C3298zf c3298zfM14562xz;
        int iM16704ri = C3606fi.m16704ri("ip_data_config", "ip_link_listener", 0);
        Integer.valueOf(iM16704ri);
        if (iM16704ri == 0 || wjvVar == null || (c3298zfM14562xz = wjvVar.m14562xz()) == null) {
            return null;
        }
        if (f12606ri == null) {
            synchronized (IPBroadcastReceiver.class) {
                if (f12606ri == null) {
                    f12606ri = new IPBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    if (c3298zfM14562xz.xha()) {
                        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    } else if (c3298zfM14562xz.m14630mj()) {
                        intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                    }
                    if (Build.VERSION.SDK_INT < 34 || C3571ig.m16434di(context) < 34) {
                        context.registerReceiver(f12606ri, intentFilter);
                    } else {
                        context.registerReceiver(f12606ri, intentFilter, 2);
                    }
                }
            }
        }
        return f12606ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m15819ri(final Intent intent) {
        if (intent == null) {
            return;
        }
        dzy.m16401lr(new AbstractRunnableC2676ik("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i;
                final int i2;
                final int i3;
                try {
                    int intExtra = 0;
                    final int intExtra2 = intent.getIntExtra("errorCode", 0);
                    if (intExtra2 < 0) {
                        int intExtra3 = intent.getIntExtra("reason", 0);
                        if (intExtra2 == -4 && intExtra3 == -1) {
                            return;
                        } else {
                            i = intExtra3;
                        }
                    } else {
                        i = 0;
                    }
                    if (intExtra2 == 5) {
                        int intExtra4 = intent.getIntExtra("status", 0);
                        if (intExtra4 == -2) {
                            try {
                                intExtra = intent.getIntExtra("progress", 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.f12608ka = 1;
                            }
                            if (intExtra < 100) {
                                return;
                            }
                        }
                        i2 = intExtra4;
                        i3 = intExtra;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    String stringExtra = intent.getStringExtra("packageName");
                    InterfaceC3488ri interfaceC3488ri = IPBroadcastReceiver.this.f12607ik;
                    if (intExtra2 > 0 && interfaceC3488ri != null) {
                        interfaceC3488ri.mo15826ri(stringExtra, intExtra2);
                    }
                    final wjv wjvVarM15820ri = IPBroadcastReceiver.this.m15820ri(stringExtra);
                    Integer.valueOf(intExtra2);
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Integer.valueOf(i3);
                    if (wjvVarM15820ri != null) {
                        C3414ik.m15532ri(System.currentTimeMillis(), wjvVarM15820ri, C3571ig.m16476ri(wjvVarM15820ri), "ip_listener_log", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                            /* JADX INFO: renamed from: ri */
                            public JSONObject mo10798ri() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra2);
                                    wjv wjvVar = wjvVarM15820ri;
                                    if (wjvVar != null) {
                                        jSONObject.put("ip_is_w2a", wjvVar.m14458nr());
                                    }
                                    int i4 = intExtra2;
                                    if (i4 > 0) {
                                        if (i4 == 5) {
                                            jSONObject.put("ip_status", i2);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.f12608ka);
                                        }
                                        if (i2 == -2) {
                                            jSONObject.put("ip_progress", i3);
                                        }
                                    }
                                    if (intExtra2 < 0) {
                                        jSONObject.put("ip_reason", i);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    C2707ac.m10206ri("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    C2707ac.m10206ri("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            m15819ri(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            m15815lr(intent);
        }
    }

    /* JADX INFO: renamed from: ri */
    public wjv m15820ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12609lr.get(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m15821ri() {
        this.f12607ik = null;
    }

    /* JADX INFO: renamed from: ri */
    public void m15822ri(InterfaceC3488ri interfaceC3488ri) {
        this.f12607ik = interfaceC3488ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15823ri(String str, wjv wjvVar) {
        if (TextUtils.isEmpty(str) || wjvVar == null || this.f12609lr.get(str) != null) {
            return;
        }
        this.f12609lr.put(str, wjvVar);
    }
}
