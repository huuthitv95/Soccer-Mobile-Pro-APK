package com.bytedance.adsdk.ugeno.p108ri;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.di */
/* JADX INFO: loaded from: classes9.dex */
public class C2325di {

    /* JADX INFO: renamed from: ik */
    private Context f6005ik;

    /* JADX INFO: renamed from: ka */
    private AbstractViewOnTouchListenerC2318ik f6006ka;

    /* JADX INFO: renamed from: lr */
    private List<C2335ri> f6007lr;

    /* JADX INFO: renamed from: ri */
    private List<C2327ik> f6008ri;

    public C2325di(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, List<C2327ik> list) {
        this.f6006ka = abstractViewOnTouchListenerC2318ik;
        this.f6005ik = context;
        this.f6008ri = list;
        m7950ka();
    }

    /* JADX INFO: renamed from: ka */
    private void m7950ka() {
        this.f6007lr = new ArrayList();
        List<C2327ik> list = this.f6008ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.f6008ri.size(); i++) {
            C2327ik c2327ik = this.f6008ri.get(i);
            if (c2327ik != null) {
                this.f6007lr.add(new C2335ri(this.f6005ik, this.f6006ka, c2327ik));
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m7951ik() {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8005ik();
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m7952lr() {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8009ri();
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m7953lr(Canvas canvas) {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8008lr(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public C2335ri m7954ri(String str) {
        List<C2335ri> list = this.f6007lr;
        if (list != null && !list.isEmpty()) {
            for (C2335ri c2335ri : this.f6007lr) {
                if (c2335ri != null && TextUtils.equals(c2335ri.m8004fi(), str)) {
                    return c2335ri;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m7955ri() {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8006ka();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7956ri(int i, int i2) {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8010ri(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7957ri(Canvas canvas) {
        List<C2335ri> list = this.f6007lr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2335ri c2335ri : this.f6007lr) {
            if (c2335ri != null) {
                c2335ri.m8011ri(canvas);
            }
        }
    }
}
