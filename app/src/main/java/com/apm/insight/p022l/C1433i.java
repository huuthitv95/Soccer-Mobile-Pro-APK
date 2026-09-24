package com.apm.insight.p022l;

import android.app.ActivityManager;

/* JADX INFO: renamed from: com.apm.insight.l.i */
/* JADX INFO: compiled from: JellyBeanV16Compat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433i {

    /* JADX INFO: renamed from: a */
    private static a f735a = new b(0);

    /* JADX INFO: renamed from: com.apm.insight.l.i$a */
    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    static class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public long mo1366a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.l.i$b */
    /* JADX INFO: compiled from: JellyBeanV16Compat.java */
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.apm.insight.p022l.C1433i.a
        /* JADX INFO: renamed from: a */
        public final long mo1366a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m1365a(ActivityManager.MemoryInfo memoryInfo) {
        return f735a.mo1366a(memoryInfo);
    }
}
