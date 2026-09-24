package com.bytedance.sdk.openadsdk.slm.p261ri;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3571ig;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3532lr {

    /* JADX INFO: renamed from: di */
    private String f12814di;

    /* JADX INFO: renamed from: fi */
    private boolean f12815fi;

    /* JADX INFO: renamed from: ik */
    private String f12816ik;

    /* JADX INFO: renamed from: ka */
    private int f12817ka;

    /* JADX INFO: renamed from: lr */
    private wjv f12818lr;

    /* JADX INFO: renamed from: ri */
    private String f12820ri;
    private int xha;

    /* JADX INFO: renamed from: mj */
    private int f12819mj = 0;
    private int jbs = 0;

    /* JADX INFO: renamed from: di */
    public String m15987di() {
        return this.f12814di;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m15988fi() {
        return this.f12815fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m15989ik() {
        wjv wjvVar;
        if (TextUtils.isEmpty(this.f12816ik) && (wjvVar = this.f12818lr) != null) {
            this.f12816ik = C3571ig.m16476ri(wjvVar);
        }
        return this.f12816ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m15990ik(String str) {
        this.f12814di = str;
    }

    public int jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public int m15991ka() {
        return this.f12817ka;
    }

    /* JADX INFO: renamed from: lr */
    public wjv m15992lr() {
        return this.f12818lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m15993lr(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m15994lr(String str) {
        this.f12816ik = str;
    }

    /* JADX INFO: renamed from: mj */
    public int m15995mj() {
        return this.f12819mj;
    }

    /* JADX INFO: renamed from: ri */
    public String m15996ri() {
        return this.f12820ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15997ri(int i) {
        this.f12817ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15998ri(wjv wjvVar) {
        this.f12818lr = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m15999ri(String str) {
        this.f12820ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m16000ri(boolean z) {
        this.f12815fi = z;
    }

    public int xha() {
        return this.xha;
    }
}
