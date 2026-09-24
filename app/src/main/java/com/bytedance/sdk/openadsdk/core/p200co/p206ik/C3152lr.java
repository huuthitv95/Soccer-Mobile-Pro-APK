package com.bytedance.sdk.openadsdk.core.p200co.p206ik;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.C3276bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3152lr {

    /* JADX INFO: renamed from: fi */
    private final boolean f10357fi;

    /* JADX INFO: renamed from: ik */
    private wjv f10358ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC3153ri f10359ka;

    /* JADX INFO: renamed from: lr */
    private Context f10360lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC3150ik f10361ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ik.lr$ri */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static InterfaceC3150ik m13164ri(Context context, wjv wjvVar, boolean z) {
            if (C3276bu.m14027ri(wjvVar, z)) {
                return new C3151ka(context, wjvVar, z);
            }
            return null;
        }
    }

    public C3152lr(Context context, wjv wjvVar) {
        this(context, wjvVar, false);
    }

    public C3152lr(Context context, wjv wjvVar, boolean z) {
        this.f10360lr = context;
        this.f10358ik = wjvVar;
        this.f10357fi = z;
    }

    /* JADX INFO: renamed from: ik */
    public View m13157ik() {
        InterfaceC3150ik interfaceC3150ik = this.f10361ri;
        if (interfaceC3150ik != null) {
            return interfaceC3150ik.mo13145ka();
        }
        return null;
    }

    /* JADX INFO: renamed from: ka */
    public void m13158ka() {
        InterfaceC3150ik interfaceC3150ik = this.f10361ri;
        if (interfaceC3150ik != null) {
            interfaceC3150ik.mo13144ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m13159lr() {
        InterfaceC3150ik interfaceC3150ik = this.f10361ri;
        if (interfaceC3150ik != null) {
            interfaceC3150ik.mo13146lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC3150ik m13160ri() {
        return this.f10361ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13161ri(int i) {
        dzy dzyVarM13154fi;
        InterfaceC3150ik interfaceC3150ik = this.f10361ri;
        if (!(interfaceC3150ik instanceof C3151ka) || (dzyVarM13154fi = ((C3151ka) interfaceC3150ik).m13154fi()) == null || dzyVarM13154fi.m13431ri() == null) {
            return;
        }
        dzyVarM13154fi.m13431ri().mo11094ri(i);
    }

    /* JADX INFO: renamed from: ri */
    public void m13162ri(InterfaceC3153ri interfaceC3153ri) {
        this.f10359ka = interfaceC3153ri;
        InterfaceC3150ik interfaceC3150ik = this.f10361ri;
        if (interfaceC3150ik != null) {
            interfaceC3150ik.mo13148ri(interfaceC3153ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13163ri(InterfaceC3247vr interfaceC3247vr) {
        InterfaceC3150ik interfaceC3150ikM13164ri = ri.m13164ri(this.f10360lr, this.f10358ik, this.f10357fi);
        this.f10361ri = interfaceC3150ikM13164ri;
        if (interfaceC3150ikM13164ri != null) {
            interfaceC3150ikM13164ri.mo13147ri();
            this.f10361ri.mo13149ri(interfaceC3247vr);
        }
    }
}
