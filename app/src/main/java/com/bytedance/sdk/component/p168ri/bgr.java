package com.bytedance.sdk.component.p168ri;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: di */
    public final String f7688di;

    /* JADX INFO: renamed from: fi */
    public final String f7689fi;

    /* JADX INFO: renamed from: ik */
    public final String f7690ik;

    /* JADX INFO: renamed from: ka */
    public final String f7691ka;

    /* JADX INFO: renamed from: lr */
    public final String f7692lr;

    /* JADX INFO: renamed from: mj */
    public final String f7693mj;

    /* JADX INFO: renamed from: ri */
    public final int f7694ri;
    public final String xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ri.bgr$ri */
    public static final class C2692ri {

        /* JADX INFO: renamed from: di */
        private String f7695di;

        /* JADX INFO: renamed from: fi */
        private String f7696fi;

        /* JADX INFO: renamed from: ik */
        private String f7697ik;

        /* JADX INFO: renamed from: ka */
        private String f7698ka;

        /* JADX INFO: renamed from: lr */
        private String f7699lr;

        /* JADX INFO: renamed from: ri */
        private String f7700ri;
        private String xha;

        private C2692ri() {
        }

        /* JADX INFO: renamed from: di */
        public C2692ri m10124di(String str) {
            this.f7695di = str;
            return this;
        }

        /* JADX INFO: renamed from: fi */
        public C2692ri m10125fi(String str) {
            this.f7696fi = str;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public C2692ri m10126ik(String str) {
            this.f7697ik = str;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public C2692ri m10127ka(String str) {
            this.f7698ka = str;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C2692ri m10128lr(String str) {
            this.f7699lr = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2692ri m10129ri(String str) {
            this.f7700ri = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public bgr m10130ri() {
            return new bgr(this);
        }

        public C2692ri xha(String str) {
            this.xha = str;
            return this;
        }
    }

    private bgr(C2692ri c2692ri) {
        this.f7692lr = c2692ri.f7700ri;
        this.f7690ik = c2692ri.f7699lr;
        this.f7691ka = c2692ri.f7697ik;
        this.f7689fi = c2692ri.f7698ka;
        this.f7688di = c2692ri.f7696fi;
        this.xha = c2692ri.f7695di;
        this.f7694ri = 1;
        this.f7693mj = c2692ri.xha;
    }

    private bgr(String str, int i) {
        this.f7692lr = null;
        this.f7690ik = null;
        this.f7691ka = null;
        this.f7689fi = null;
        this.f7688di = str;
        this.xha = null;
        this.f7694ri = i;
        this.f7693mj = null;
    }

    /* JADX INFO: renamed from: ri */
    public static C2692ri m10115ri() {
        return new C2692ri();
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m10116ri(String str, int i) {
        return new bgr(str, i);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10117ri(bgr bgrVar) {
        return bgrVar == null || bgrVar.f7694ri != 1 || TextUtils.isEmpty(bgrVar.f7691ka) || TextUtils.isEmpty(bgrVar.f7689fi);
    }

    public String toString() {
        return "methodName: " + this.f7691ka + ", params: " + this.f7689fi + ", callbackId: " + this.f7688di + ", type: " + this.f7690ik + ", version: " + this.f7692lr + ", ";
    }
}
