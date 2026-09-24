package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri;

import android.content.Context;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import java.io.File;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2607lr implements InterfaceC2597lr, Cloneable {
    private static volatile InterfaceC2597lr jbs;

    /* JADX INFO: renamed from: di */
    private boolean f7349di;

    /* JADX INFO: renamed from: fi */
    private boolean f7350fi;

    /* JADX INFO: renamed from: ik */
    private int f7351ik;

    /* JADX INFO: renamed from: ka */
    private int f7352ka;

    /* JADX INFO: renamed from: lr */
    private int f7353lr;

    /* JADX INFO: renamed from: mj */
    private File f7354mj;

    /* JADX INFO: renamed from: ri */
    private long f7355ri;
    private boolean xha;

    public C2607lr(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public C2607lr(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.f7355ri = j;
        this.f7353lr = i;
        this.f7351ik = i2;
        this.f7352ka = i3;
        this.f7350fi = z;
        this.f7349di = z2;
        this.f7354mj = file;
        this.xha = i3 != 0;
    }

    public static InterfaceC2597lr jbs() {
        return jbs;
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2597lr m9701ri(File file) {
        long jMo9579ri;
        int iMo9575ik;
        int iMo9576ka;
        file.mkdirs();
        if (jbs == null) {
            iMo9575ik = 10;
            iMo9576ka = 14;
            jMo9579ri = 20;
        } else {
            jMo9579ri = jbs.mo9579ri();
            iMo9575ik = jbs.mo9575ik();
            iMo9576ka = jbs.mo9576ka();
        }
        return new C2607lr(0, iMo9575ik, iMo9576ka, jMo9579ri, file);
    }

    /* JADX INFO: renamed from: ri */
    public static void m9702ri(Context context, InterfaceC2597lr interfaceC2597lr) {
        if (interfaceC2597lr != null) {
            jbs = interfaceC2597lr;
        } else {
            jbs = m9701ri(new File(context.getCacheDir(), "image"));
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: di */
    public boolean mo9573di() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: fi */
    public boolean mo9574fi() {
        return this.f7350fi;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: ik */
    public int mo9575ik() {
        return this.f7351ik;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: ka */
    public int mo9576ka() {
        return this.f7352ka;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: lr */
    public int mo9577lr() {
        return this.f7353lr;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: mj */
    public File mo9578mj() {
        return this.f7354mj;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    /* JADX INFO: renamed from: ri */
    public long mo9579ri() {
        return this.f7355ri;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2597lr
    public boolean xha() {
        return this.f7349di;
    }
}
