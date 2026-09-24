package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.apm.insight.runtime.c */
/* JADX INFO: compiled from: CallbackCenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1461c {

    /* JADX INFO: renamed from: a */
    private final List<ICrashCallback> f841a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private final List<ICrashCallback> f842b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private final List<ICrashCallback> f843c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    private final List<ICrashCallback> f844d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    private final List<IOOMCallback> f845e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CallbackCenter.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f846a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f846a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f846a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f846a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f846a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f846a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<IOOMCallback> m1615a() {
        return this.f845e;
    }

    /* JADX INFO: renamed from: a */
    final void m1616a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f846a[crashType.ordinal()];
        if (i == 1) {
            this.f841a.add(iCrashCallback);
            this.f842b.add(iCrashCallback);
            this.f843c.add(iCrashCallback);
            this.f844d.add(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.f844d.add(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.f842b.add(iCrashCallback);
        } else if (i == 4) {
            this.f841a.add(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.f843c.add(iCrashCallback);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m1617a(IOOMCallback iOOMCallback) {
        this.f845e.add(iOOMCallback);
    }

    /* JADX INFO: renamed from: b */
    public final List<ICrashCallback> m1618b() {
        return this.f841a;
    }

    /* JADX INFO: renamed from: b */
    final void m1619b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f846a[crashType.ordinal()];
        if (i == 1) {
            this.f841a.remove(iCrashCallback);
            this.f842b.remove(iCrashCallback);
            this.f843c.remove(iCrashCallback);
            this.f844d.remove(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.f844d.remove(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.f842b.remove(iCrashCallback);
        } else if (i == 4) {
            this.f841a.remove(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.f843c.remove(iCrashCallback);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m1620b(IOOMCallback iOOMCallback) {
        this.f845e.remove(iOOMCallback);
    }

    /* JADX INFO: renamed from: c */
    public final List<ICrashCallback> m1621c() {
        return this.f842b;
    }

    /* JADX INFO: renamed from: d */
    public final List<ICrashCallback> m1622d() {
        return this.f843c;
    }

    /* JADX INFO: renamed from: e */
    public final List<ICrashCallback> m1623e() {
        return this.f844d;
    }
}
