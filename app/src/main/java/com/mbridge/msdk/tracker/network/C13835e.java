package com.mbridge.msdk.tracker.network;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.e */
/* JADX INFO: compiled from: DefaultRetryPolicy.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13835e implements InterfaceC13869x {

    /* JADX INFO: renamed from: a */
    private int f39440a;

    /* JADX INFO: renamed from: b */
    private long f39441b;

    /* JADX INFO: renamed from: c */
    private int f39442c;

    /* JADX INFO: renamed from: d */
    private final int f39443d;

    public C13835e() {
        this(2500, 1);
    }

    public C13835e(int i, int i2) {
        this(i, 60000L, i2);
    }

    public C13835e(int i, long j, int i2) {
        this.f39441b = j;
        this.f39440a = i;
        this.f39443d = i2;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13869x
    /* JADX INFO: renamed from: a */
    public long mo41098a() {
        return this.f39441b;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13869x
    /* JADX INFO: renamed from: a */
    public boolean mo41099a(AbstractC13831b0 abstractC13831b0) {
        int i = this.f39442c + 1;
        this.f39442c = i;
        return i <= this.f39443d;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13869x
    /* JADX INFO: renamed from: b */
    public int mo41100b() {
        return this.f39440a;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13869x
    /* JADX INFO: renamed from: c */
    public int mo41101c() {
        return this.f39442c;
    }
}
