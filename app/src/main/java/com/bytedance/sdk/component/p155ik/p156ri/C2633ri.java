package com.bytedance.sdk.component.p155ik.p156ri;

import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ik.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2633ri {

    /* JADX INFO: renamed from: di */
    long f7404di;

    /* JADX INFO: renamed from: fi */
    long f7405fi;

    /* JADX INFO: renamed from: ik */
    long f7406ik;

    /* JADX INFO: renamed from: ka */
    long f7407ka;

    /* JADX INFO: renamed from: lr */
    long f7408lr;

    /* JADX INFO: renamed from: mj */
    long f7409mj;

    /* JADX INFO: renamed from: ri */
    long f7410ri = SystemClock.elapsedRealtime();
    long xha;

    /* JADX INFO: renamed from: aw */
    public void m9747aw() {
        this.f7409mj = SystemClock.elapsedRealtime();
    }

    public long bgr() {
        return this.f7408lr;
    }

    /* JADX INFO: renamed from: co */
    public long m9748co() {
        return this.f7409mj;
    }

    /* JADX INFO: renamed from: di */
    public long m9749di() {
        return this.f7404di;
    }

    /* JADX INFO: renamed from: fi */
    public void m9750fi() {
        this.f7404di = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ik */
    public void m9751ik() {
        this.f7405fi = SystemClock.elapsedRealtime();
    }

    public long jbs() {
        return this.f7405fi;
    }

    /* JADX INFO: renamed from: ka */
    public long m9752ka() {
        return this.f7410ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m9753lr() {
        this.f7407ka = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: mj */
    public long m9754mj() {
        return this.f7407ka;
    }

    /* JADX INFO: renamed from: qt */
    public long m9755qt() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    public void m9756ri() {
        this.f7406ik = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: sf */
    public void m9757sf() {
        this.xha = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.f7410ri + ", asyncCallExecTs=" + this.f7408lr + ", requestStartExecTs=" + this.f7406ik + ", requestConnectStartTs=" + this.f7407ka + ", requestConnectFinishTs=" + this.f7405fi + ", reqCallServerStartTs=" + this.xha + ", reqCallServerFinishTs=" + this.f7409mj + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: vr */
    public void m9758vr() {
        this.f7408lr = SystemClock.elapsedRealtime();
    }

    public long xha() {
        return this.f7406ik;
    }
}
