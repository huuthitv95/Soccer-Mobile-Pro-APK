package com.bytedance.sdk.openadsdk.core.p226sf;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.lr */
/* JADX INFO: loaded from: classes3.dex */
class C3325lr {

    /* JADX INFO: renamed from: ri */
    private static C3326ri f11652ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.lr$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private static final C3325lr f11653ri = new C3325lr();
    }

    private C3325lr() {
        f11652ri = new C3326ri();
    }

    /* JADX INFO: renamed from: lr */
    public static C3325lr m14921lr() {
        return ri.f11653ri;
    }

    /* JADX INFO: renamed from: di */
    public long m14922di() {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            return c3326ri.m14938di();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: fi */
    public String m14923fi() {
        C3326ri c3326ri = f11652ri;
        return c3326ri != null ? c3326ri.m14939fi() : "";
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14924ik() {
        C3326ri c3326ri = f11652ri;
        if (c3326ri == null) {
            return false;
        }
        return c3326ri.m14943lr();
    }

    /* JADX INFO: renamed from: ka */
    public String m14925ka() {
        String strM14941ka;
        C3326ri c3326ri = f11652ri;
        return (c3326ri == null || (strM14941ka = c3326ri.m14941ka()) == null) ? "" : strM14941ka;
    }

    /* JADX INFO: renamed from: lr */
    public void m14926lr(String str) {
        C3326ri c3326ri;
        if (TextUtils.isEmpty(str) || (c3326ri = f11652ri) == null) {
            return;
        }
        c3326ri.m14942lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public Map<String, String> m14927ri(String str, byte[] bArr) {
        C3326ri c3326ri = f11652ri;
        return c3326ri != null ? c3326ri.m14944ri(str, bArr) : new HashMap();
    }

    /* JADX INFO: renamed from: ri */
    public void m14928ri() {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            c3326ri.m14940ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14929ri(MotionEvent motionEvent) {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            c3326ri.m14946ri(motionEvent);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14930ri(String str) {
        C3326ri c3326ri;
        if (TextUtils.isEmpty(str) || (c3326ri = f11652ri) == null) {
            return;
        }
        c3326ri.m14947ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m14931ri(String str, Map<String, Object> map) {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            c3326ri.m14948ri(str, map);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14932ri(Map<String, Object> map) {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            c3326ri.m14949ri(map);
        }
    }

    public int xha() {
        C3326ri c3326ri = f11652ri;
        if (c3326ri != null) {
            return c3326ri.xha();
        }
        return 1;
    }
}
