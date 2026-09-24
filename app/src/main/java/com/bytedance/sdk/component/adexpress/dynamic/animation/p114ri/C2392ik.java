package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2392ik {

    /* JADX INFO: renamed from: ri */
    private static volatile C2392ik f6410ri;

    private C2392ik() {
    }

    /* JADX INFO: renamed from: ri */
    public static C2392ik m8292ri() {
        if (f6410ri == null) {
            synchronized (C2392ik.class) {
                if (f6410ri == null) {
                    f6410ri = new C2392ik();
                }
            }
        }
        return f6410ri;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2393ka m8293ri(View view, C2477ri c2477ri) {
        if (c2477ri == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(c2477ri.jbs())) {
            return new C2398sf(view, c2477ri);
        }
        if ("translate".equals(c2477ri.jbs())) {
            return new C2399vr(view, c2477ri);
        }
        if ("ripple".equals(c2477ri.jbs())) {
            return new C2395mj(view, c2477ri);
        }
        if ("marquee".equals(c2477ri.jbs())) {
            return new xha(view, c2477ri);
        }
        if ("waggle".equals(c2477ri.jbs())) {
            return new slm(view, c2477ri);
        }
        if ("shine".equals(c2477ri.jbs())) {
            return new C2389co(view, c2477ri);
        }
        if ("swing".equals(c2477ri.jbs())) {
            return new bgr(view, c2477ri);
        }
        if ("fade".equals(c2477ri.jbs())) {
            return new C2397ri(view, c2477ri);
        }
        if ("rubIn".equals(c2477ri.jbs())) {
            return new C2396qt(view, c2477ri);
        }
        if ("rotate".equals(c2477ri.jbs())) {
            return new jbs(view, c2477ri);
        }
        if ("cutIn".equals(c2477ri.jbs())) {
            return new C2390di(view, c2477ri);
        }
        if ("stretch".equals(c2477ri.jbs())) {
            return new C2388aw(view, c2477ri);
        }
        if ("bounce".equals(c2477ri.jbs())) {
            return new C2391fi(view, c2477ri);
        }
        return null;
    }
}
