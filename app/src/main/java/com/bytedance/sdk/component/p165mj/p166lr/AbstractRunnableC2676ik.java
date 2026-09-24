package com.bytedance.sdk.component.p165mj.p166lr;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC2676ik implements Comparable<AbstractRunnableC2676ik>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;

    /* JADX INFO: renamed from: di */
    private long f7642di;

    /* JADX INFO: renamed from: fi */
    private long f7643fi;

    /* JADX INFO: renamed from: ik */
    private Runnable f7644ik;

    /* JADX INFO: renamed from: ka */
    private long f7645ka;

    /* JADX INFO: renamed from: lr */
    private String f7646lr;

    /* JADX INFO: renamed from: ri */
    private int f7647ri;

    public AbstractRunnableC2676ik(int i, String str, Runnable runnable) {
        this.f7647ri = i;
        this.f7646lr = str;
        this.f7644ik = runnable;
    }

    public AbstractRunnableC2676ik(String str) {
        this.f7647ri = 5;
        this.f7646lr = str;
    }

    public AbstractRunnableC2676ik(String str, int i) {
        this.f7647ri = i;
        this.f7646lr = str;
    }

    public AbstractRunnableC2676ik(String str, Runnable runnable) {
        this.f7647ri = 5;
        this.f7646lr = str;
        this.f7644ik = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (getPriority() < abstractRunnableC2676ik.getPriority()) {
            return 1;
        }
        return getPriority() >= abstractRunnableC2676ik.getPriority() ? -1 : 0;
    }

    public long getAfterTimestamp() {
        return this.f7642di;
    }

    public long getBeforeTimestamp() {
        return this.f7643fi;
    }

    public String getName() {
        return this.f7646lr;
    }

    public int getPriority() {
        return this.f7647ri;
    }

    public long getRunTime() {
        return this.f7642di - this.f7643fi;
    }

    public long getSubmitTimestamp() {
        return this.f7645ka;
    }

    public Runnable getTarget() {
        return this.f7644ik;
    }

    public long getWaitTime() {
        return this.f7643fi - this.f7645ka;
    }

    public void setAfterTimestamp(long j) {
        this.f7642di = j;
    }

    public void setBeforeTimestamp(long j) {
        this.f7643fi = j;
    }

    public void setPriority(int i) {
        this.f7647ri = i;
    }

    public void setSubmitTimestamp(long j) {
        this.f7645ka = j;
    }

    public void setTarget(Runnable runnable) {
        this.f7644ik = runnable;
    }
}
