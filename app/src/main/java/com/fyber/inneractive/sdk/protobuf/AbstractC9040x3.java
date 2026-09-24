package com.fyber.inneractive.sdk.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.x3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9040x3 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f21170a;

    /* JADX INFO: renamed from: b */
    public static final Class f21171b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC9035w3 f21172c;

    /* JADX INFO: renamed from: d */
    public static final boolean f21173d;

    /* JADX INFO: renamed from: e */
    public static final boolean f21174e;

    /* JADX INFO: renamed from: f */
    public static final long f21175f;

    /* JADX INFO: renamed from: g */
    public static final long f21176g;

    /* JADX INFO: renamed from: h */
    public static final boolean f21177h;

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[PHI: r3
  0x00a4: PHI (r3v21 java.lang.reflect.Field) = (r3v19 java.lang.reflect.Field), (r3v24 java.lang.reflect.Field) binds: [B:39:0x00b8, B:31:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    static {
        Unsafe unsafe;
        AbstractC9035w3 c9030v3;
        Field declaredField;
        Field field = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C9015s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f21170a = unsafe;
        f21171b = AbstractC8922d.f20995a;
        boolean zM21837c = m21837c(Long.TYPE);
        boolean zM21837c2 = m21837c(Integer.TYPE);
        if (unsafe == null) {
            c9030v3 = null;
        } else if (!AbstractC8922d.m21528a()) {
            c9030v3 = new C9030v3(unsafe);
        } else if (zM21837c) {
            c9030v3 = new C9025u3(unsafe);
        } else if (zM21837c2) {
            c9030v3 = new C9020t3(unsafe);
        } else {
            c9030v3 = null;
        }
        f21172c = c9030v3;
        f21173d = c9030v3 == null ? false : c9030v3.mo21762b();
        f21174e = c9030v3 == null ? false : c9030v3.mo21816a();
        f21175f = m21827a(byte[].class);
        m21827a(boolean[].class);
        m21834b(boolean[].class);
        m21827a(int[].class);
        m21834b(int[].class);
        m21827a(long[].class);
        m21834b(long[].class);
        m21827a(float[].class);
        m21834b(float[].class);
        m21827a(double[].class);
        m21834b(double[].class);
        m21827a(Object[].class);
        m21834b(Object[].class);
        if (AbstractC8922d.m21528a()) {
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused2) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                } catch (Throwable unused3) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField.getType() == Long.TYPE) {
                    field = declaredField;
                }
            }
        } else {
            declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            if (declaredField != null) {
                field = declaredField;
            }
        }
        f21176g = (field == null || c9030v3 == null) ? -1L : c9030v3.f21158a.objectFieldOffset(field);
        f21177h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static byte m21826a(Object obj, long j) {
        return (byte) ((m21836c(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: a */
    public static int m21827a(Class cls) {
        if (f21174e) {
            return f21172c.f21158a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m21828a(long j, Object obj, Object obj2) {
        f21172c.f21158a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: a */
    public static void m21829a(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM21836c = m21836c(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m21830a(obj, j2, ((255 & b) << i) | (iM21836c & (~(255 << i))));
    }

    /* JADX INFO: renamed from: a */
    public static void m21830a(Object obj, long j, int i) {
        f21172c.f21158a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m21831a(Object obj, long j, long j2) {
        f21172c.f21158a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: a */
    public static void m21832a(Throwable th) {
        Logger.getLogger(AbstractC9040x3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static byte m21833b(Object obj, long j) {
        return (byte) ((m21836c(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: b */
    public static void m21834b(Class cls) {
        if (f21174e) {
            f21172c.f21158a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21835b(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m21830a(obj, j2, ((255 & b) << i) | (m21836c(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: c */
    public static int m21836c(Object obj, long j) {
        return f21172c.f21158a.getInt(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m21837c(Class cls) {
        if (!AbstractC8922d.m21528a()) {
            return false;
        }
        try {
            Class cls2 = f21171b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m21838d(Object obj, long j) {
        return f21172c.f21158a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: e */
    public static Object m21839e(Object obj, long j) {
        return f21172c.f21158a.getObject(obj, j);
    }
}
