package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.p219ik.C3216di;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class wjv extends GestureDetector {

    /* JADX INFO: renamed from: lr */
    private final C3216di f10910lr;

    /* JADX INFO: renamed from: ri */
    private final C3248ri f10911ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.wjv$ri */
    static class C3248ri extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: ri */
        boolean f10912ri = false;

        C3248ri() {
        }

        /* JADX INFO: renamed from: lr */
        boolean m13746lr() {
            return this.f10912ri;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f10912ri = true;
            return super.onSingleTapUp(motionEvent);
        }

        /* JADX INFO: renamed from: ri */
        void m13747ri() {
            this.f10912ri = false;
        }
    }

    public wjv(Context context) {
        this(context, new C3248ri());
    }

    public wjv(Context context, C3248ri c3248ri) {
        super(context, c3248ri);
        this.f10911ri = c3248ri;
        this.f10910lr = new C3216di();
        setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: lr */
    public boolean m13743lr() {
        return this.f10911ri.m13746lr();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10910lr.m13513ri(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ri */
    public C3277co m13744ri(Context context, View view) {
        if (this.f10910lr == null) {
            return new C3277co.ri().m14066ri();
        }
        return new C3277co.ri().m14046di(this.f10910lr.f10670ri).m14048fi(this.f10910lr.f10667lr).m14052ka(this.f10910lr.f10665ik).m14050ik(this.f10910lr.f10666ka).m14056lr(this.f10910lr.f10664fi).m14061ri(this.f10910lr.f10663di).m14065ri(C3583qd.m16626ri(view)).m14058lr(C3583qd.m16585ik(view)).m14053ka(this.f10910lr.xha).m14049fi(this.f10910lr.f10668mj).m14047di(this.f10910lr.jbs).m14062ri(this.f10910lr.f10662co).m14055lr(C3304qt.m14669lr().m14700ri() ? 1 : 2).m14063ri("vessel").m14059ri(C3583qd.m16598mj(context)).m14051ik(C3583qd.m16600qt(context)).m14054lr(C3583qd.jbs(context)).m14066ri();
    }

    /* JADX INFO: renamed from: ri */
    void m13745ri() {
        this.f10911ri.m13747ri();
    }
}
