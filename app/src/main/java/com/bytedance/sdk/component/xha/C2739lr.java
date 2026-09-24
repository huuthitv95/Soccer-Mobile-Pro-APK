package com.bytedance.sdk.component.xha;

import com.bytedance.sdk.component.p160lr.p161ri.C2660qt;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2739lr {

    /* JADX INFO: renamed from: di */
    final long f7816di;

    /* JADX INFO: renamed from: fi */
    final long f7817fi;

    /* JADX INFO: renamed from: ik */
    final Map<String, String> f7818ik;
    private final boolean jbs;

    /* JADX INFO: renamed from: ka */
    final String f7819ka;

    /* JADX INFO: renamed from: lr */
    final String f7820lr;

    /* JADX INFO: renamed from: mj */
    private File f7821mj = null;

    /* JADX INFO: renamed from: qt */
    private byte[] f7822qt = null;

    /* JADX INFO: renamed from: ri */
    final int f7823ri;
    C2660qt xha;

    public C2739lr(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.jbs = z;
        this.f7823ri = i;
        this.f7820lr = str;
        this.f7818ik = map;
        this.f7819ka = str2;
        this.f7817fi = j;
        this.f7816di = j2;
    }

    /* JADX INFO: renamed from: di */
    public boolean m10354di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: fi */
    public File m10355fi() {
        return this.f7821mj;
    }

    /* JADX INFO: renamed from: ik */
    public Map<String, String> m10356ik() {
        return this.f7818ik;
    }

    /* JADX INFO: renamed from: ka */
    public String m10357ka() {
        return this.f7819ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m10358lr() {
        return this.f7820lr;
    }

    /* JADX INFO: renamed from: ri */
    public int m10359ri() {
        return this.f7823ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m10360ri(C2660qt c2660qt) {
        this.xha = c2660qt;
    }

    /* JADX INFO: renamed from: ri */
    public void m10361ri(File file) {
        this.f7821mj = file;
    }

    /* JADX INFO: renamed from: ri */
    public void m10362ri(byte[] bArr) {
        this.f7822qt = bArr;
    }

    public C2660qt xha() {
        return this.xha;
    }
}
