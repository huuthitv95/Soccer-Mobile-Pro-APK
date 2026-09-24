package com.bytedance.sdk.component.p130di.p131ri.p138lr;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;
import com.bytedance.sdk.component.p130di.p131ri.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2562ri {
    /* JADX INFO: renamed from: di */
    public static boolean m9370di() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9453di())) ? false : true;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m9371fi() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9455ik())) ? false : true;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m9372ik() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9456ka())) ? false : true;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m9373ka() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9454fi())) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    private static long m9374lr(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i, 10) : Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i, 10) : Math.min(j * 10, i);
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m9375lr() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9457lr())) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static long m9376ri(int i, Context context) {
        return m9374lr(i, context);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9377ri() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        return (interfaceC2566fiM9530ik == null || TextUtils.isEmpty(interfaceC2566fiM9530ik.mo9459ri())) ? false : true;
    }
}
