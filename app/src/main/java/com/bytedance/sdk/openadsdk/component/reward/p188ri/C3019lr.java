package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3019lr {
    /* JADX INFO: renamed from: ri */
    public static wjv m11950ri(Intent intent, Bundle bundle, InterfaceC3118lr interfaceC3118lr) {
        C3289ri c3289riM13344lr = C3197dw.m13337ri().m13344lr(C3197dw.m13336ri(intent));
        wjv wjvVarJbs = c3289riM13344lr != null ? c3289riM13344lr.jbs() : null;
        if (interfaceC3118lr != null) {
            interfaceC3118lr.mo10575ri(bundle);
        }
        C3197dw.m13337ri().m13339fi();
        if (bundle != null) {
            try {
                wjvVarJbs = C3197dw.m13337ri().m13350ri(bundle.getInt("meta_index", -1));
                Objects.toString(wjvVarJbs);
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.RFDM", "", th);
            }
        }
        if (wjvVarJbs != null) {
            wjvVarJbs.m14488ri(wjvVarJbs.m14567zb(), 7);
        }
        return wjvVarJbs;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11951ri(Intent intent, Activity activity, boolean z, C3289ri c3289ri, String str) {
        int rotation;
        if (activity != null) {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                C2707ac.m10206ri("TTAD.RFDM", "", e);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            C3197dw.m13337ri().m13339fi();
            intent.putExtra("meta_index", C3197dw.m13337ri().m13347ri(c3289ri));
            intent.putExtra("single_process_listener_key", str);
        }
        intent.addFlags(268435456);
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        C3197dw.m13337ri().m13339fi();
        intent.putExtra("meta_index", C3197dw.m13337ri().m13347ri(c3289ri));
        intent.putExtra("single_process_listener_key", str);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11952ri(Intent intent, C3022ri c3022ri) {
        if (intent == null) {
            return;
        }
        c3022ri.ihz.m12133ik(intent.getBooleanExtra("video_is_cached", false));
        c3022ri.feb = intent.getStringExtra("multi_process_listener_key");
        c3022ri.rzk = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11953ri(Bundle bundle, C3022ri c3022ri) {
        if (bundle == null) {
            return;
        }
        c3022ri.feb = bundle.getString("multi_process_listener_key");
        c3022ri.ihz.m12133ik(bundle.getBoolean("video_is_cached", false));
        c3022ri.zyn = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            c3022ri.ihz.m12140lr(bundle.getLong("video_current", 0L));
        }
        c3022ri.m12005ri(bundle.getBoolean("has_show_skip_btn"));
    }

    /* JADX INFO: renamed from: ri */
    public static void m11954ri(C3022ri c3022ri, Intent intent, Bundle bundle) {
        m11952ri(intent, c3022ri);
        m11953ri(bundle, c3022ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11955ri(C3022ri c3022ri, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            bundle.putString("multi_process_listener_key", c3022ri.feb);
            bundle.putBoolean("video_is_cached", c3022ri.ihz.m12170xd());
            bundle.putLong("video_current", c3022ri.ihz.m12122aw());
            bundle.putBoolean("is_mute", c3022ri.zyn);
            bundle.putBoolean("has_show_skip_btn", c3022ri.f9398qh);
        } catch (Throwable th) {
            C2707ac.m10206ri("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11956ri(wjv wjvVar, Intent intent, Bundle bundle, int i) {
        if (bundle == null || wjvVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            Objects.toString(wjvVar);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            C2707ac.m10206ri("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }
}
