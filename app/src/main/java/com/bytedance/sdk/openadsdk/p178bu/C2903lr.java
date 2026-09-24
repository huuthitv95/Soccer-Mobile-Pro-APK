package com.bytedance.sdk.openadsdk.p178bu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bu.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2903lr {

    /* JADX INFO: renamed from: fi */
    public static int f8679fi = 3;

    /* JADX INFO: renamed from: ik */
    public static int f8680ik = 1;

    /* JADX INFO: renamed from: ka */
    public static int f8681ka = 2;

    /* JADX INFO: renamed from: lr */
    public static int f8682lr = 0;

    /* JADX INFO: renamed from: ri */
    public static int f8683ri = -1;

    /* JADX INFO: renamed from: di */
    private int f8684di = f8683ri;
    private long xha = 0;

    /* JADX INFO: renamed from: mj */
    private long f8685mj = 0;
    private final List<C2902ik> jbs = new ArrayList();

    /* JADX INFO: renamed from: qt */
    private long f8686qt = 0;

    /* JADX INFO: renamed from: ik */
    public void m11183ik(long j) {
        int i;
        int i2 = this.f8684di;
        if (i2 == f8683ri || i2 == (i = f8681ka) || i2 == f8679fi) {
            return;
        }
        this.f8684di = i;
        this.f8686qt = j;
    }

    /* JADX INFO: renamed from: ka */
    public void m11184ka(long j) {
        int i = this.f8684di;
        if (i == f8683ri || i != f8681ka) {
            return;
        }
        this.f8684di = f8680ik;
        this.jbs.add(new C2902ik(this.f8686qt, j));
        this.f8686qt = 0L;
    }

    /* JADX INFO: renamed from: lr */
    public void m11185lr(long j) {
        int i;
        int i2 = this.f8684di;
        if (i2 == f8683ri || i2 == (i = f8679fi)) {
            return;
        }
        this.f8684di = i;
        this.f8685mj = j;
    }

    /* JADX INFO: renamed from: ri */
    public int m11186ri() {
        return this.f8684di;
    }

    /* JADX INFO: renamed from: ri */
    public long m11187ri(long j, long j2) {
        long j3;
        long j4;
        long jM11181lr;
        long j5 = this.f8685mj;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (C2902ik c2902ik : this.jbs) {
            if (c2902ik.m11181lr() > j) {
                if (j < c2902ik.m11182ri()) {
                    j4 = i;
                    jM11181lr = c2902ik.m11181lr() - c2902ik.m11182ri();
                } else {
                    j4 = i;
                    jM11181lr = c2902ik.m11181lr() - j;
                }
                i = (int) (j4 + jM11181lr);
            }
        }
        long j6 = this.xha;
        if (j6 < j) {
            long j7 = this.f8686qt;
            if (j7 == 0) {
                j7 = this.f8685mj;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - ((long) i);
        }
        long j8 = this.f8686qt;
        if (j8 == 0) {
            j8 = this.f8685mj;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - ((long) i);
        return j3 - ((long) i);
    }

    /* JADX INFO: renamed from: ri */
    public void m11188ri(long j) {
        this.f8684di = f8682lr;
        this.xha = j;
    }
}
