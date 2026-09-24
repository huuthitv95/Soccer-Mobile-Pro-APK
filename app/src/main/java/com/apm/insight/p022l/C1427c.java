package com.apm.insight.p022l;

import android.os.Debug;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.l.c */
/* JADX INFO: compiled from: DebugMemInfoCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1427c {

    /* JADX INFO: renamed from: a */
    private static a f714a = new b(0);

    /* JADX INFO: renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    public static /* synthetic */ class AnonymousClass1 {
        /* JADX INFO: renamed from: a */
        public static int m1303a(Object obj, int i) {
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                if (obj instanceof String) {
                    try {
                        return Integer.parseInt(String.valueOf(obj));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: a */
        public static Float m1304a(Map<? super String, Float> map) {
            float fFloatValue = 0.0f;
            for (Float f : map.values()) {
                if (f != null) {
                    fFloatValue += f.floatValue();
                }
            }
            return Float.valueOf(fFloatValue);
        }

        /* JADX INFO: renamed from: a */
        public static Long m1305a(Map<? super String, Long> map, String str, Long l) {
            if (str == null || map == null) {
                return -1L;
            }
            Long l2 = map.get(str);
            if (l2 != null) {
                l = Long.valueOf(l2.longValue() + l.longValue());
            }
            map.put(str, l);
            return l;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$a */
    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    /* JADX INFO: loaded from: classes9.dex */
    static class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public int mo1306a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public int mo1307b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public int mo1308c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$b */
    /* JADX INFO: compiled from: DebugMemInfoCompat.java */
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.apm.insight.p022l.C1427c.a
        /* JADX INFO: renamed from: a */
        public final int mo1306a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.p022l.C1427c.a
        /* JADX INFO: renamed from: b */
        public final int mo1307b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.p022l.C1427c.a
        /* JADX INFO: renamed from: c */
        public final int mo1308c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m1300a(Debug.MemoryInfo memoryInfo) {
        return f714a.mo1306a(memoryInfo);
    }

    /* JADX INFO: renamed from: b */
    public static int m1301b(Debug.MemoryInfo memoryInfo) {
        return f714a.mo1307b(memoryInfo);
    }

    /* JADX INFO: renamed from: c */
    public static int m1302c(Debug.MemoryInfo memoryInfo) {
        return f714a.mo1308c(memoryInfo);
    }
}
