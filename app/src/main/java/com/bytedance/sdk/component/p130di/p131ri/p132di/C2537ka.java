package com.bytedance.sdk.component.p130di.p131ri.p132di;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2537ka {

    /* JADX INFO: renamed from: di */
    private final String f7044di;

    /* JADX INFO: renamed from: fi */
    private final int f7045fi;

    /* JADX INFO: renamed from: ik */
    private final boolean f7046ik;

    /* JADX INFO: renamed from: lr */
    private final String f7048lr;

    /* JADX INFO: renamed from: mj */
    private String f7049mj;

    /* JADX INFO: renamed from: ri */
    private final String f7051ri;

    /* JADX INFO: renamed from: sf */
    private boolean f7052sf;
    private String xha;

    /* JADX INFO: renamed from: ka */
    private int f7047ka = -1;
    private int jbs = 0;

    /* JADX INFO: renamed from: qt */
    private String f7050qt = null;

    C2537ka(String str, String str2, boolean z, int i, String str3) {
        this.f7051ri = str;
        this.f7048lr = str2;
        this.f7046ik = z;
        this.f7045fi = i;
        this.f7044di = str3;
    }

    /* JADX INFO: renamed from: di */
    public String m9195di() {
        return this.f7044di;
    }

    /* JADX INFO: renamed from: fi */
    public int m9196fi() {
        return this.f7045fi;
    }

    /* JADX INFO: renamed from: ik */
    public void m9197ik(String str) {
        this.f7050qt = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.f7049mj)) {
            this.f7049mj = String.valueOf(this.f7050qt);
            return;
        }
        this.f7049mj += "," + this.f7050qt;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m9198ik() {
        return this.f7046ik;
    }

    public String jbs() {
        return this.f7049mj;
    }

    /* JADX INFO: renamed from: ka */
    public int m9199ka() {
        return this.f7047ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m9200lr() {
        return this.f7048lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m9201lr(int i) {
        this.jbs = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.xha)) {
            this.xha = String.valueOf(this.jbs);
            return;
        }
        this.xha += "," + this.jbs;
    }

    /* JADX INFO: renamed from: lr */
    public void m9202lr(String str) {
        this.f7049mj = str;
    }

    /* JADX INFO: renamed from: mj */
    public int m9203mj() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m9204qt() {
        return this.f7052sf;
    }

    /* JADX INFO: renamed from: ri */
    public Runnable m9205ri(String str, Map<String, String> map) {
        return C2539ri.m9211ri().mo9189ri(this, str, map);
    }

    /* JADX INFO: renamed from: ri */
    public String m9206ri() {
        return this.f7051ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m9207ri(int i) {
        this.f7047ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m9208ri(String str) {
        this.xha = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m9209ri(boolean z) {
        this.f7052sf = z;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m9210sf() {
        return this.f7047ka == -1;
    }

    public String xha() {
        return this.xha;
    }
}
