package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12082kd {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29804 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static long f29805 = 828878012297588863L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29806 = 1;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kd$a */
    public interface a {
        /* JADX INFO: renamed from: ﻛ */
        void mo29840(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ｋ */
    public static Object m30863(Class<?> cls, Object obj, a aVar) {
        int i = 2 % 2;
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, InterfaceC12003hf.class}, new c(obj, aVar));
            int i2 = f29806 + 71;
            f29804 = i2 % 128;
            if (i2 % 2 == 0) {
                return objNewProxyInstance;
            }
            throw null;
        } catch (Throwable th) {
            C12080kb.m30845(m30864("〯\u202cၒd炂悏働䃱넛ꄥ", Process.getGidForName("") + 4130).intern(), m30864("〺켐츷쵇챹쯎쪸짚좷젙윯옥앂쑲쎌슜쇝샽쀍\udf21\ude7f\udd7b\udc62\udb8b\udab5\ud9cb\ud8f9\ud81f휡혖핮풕펫튪톅탯퀎\uef3a\uee72\ued7b\uec99\uebae\uead8\ue9d8\ue8f7\ue825\ue725\ue64d\ue57c\ue481\ue399\ue2d7\ue1fa\ue11a\ue004Ｖ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 65308).intern(), th, true);
            try {
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, InterfaceC12003hf.class}, new c(obj, aVar));
            } catch (Throwable th2) {
                C12080kb.m30845(m30864("〯\u202cၒd炂悏働䃱넛ꄥ", AndroidCharacter.getMirror('0') + 4081).intern(), m30864("〺\u0000倗ꀷ\uf039쀞ၘ恊뀷聩킏ₕ炂䂢邬\ue0ecポÍ僭ꃱ\uf13f섋ᄂ愻넵腛텙⅏煡䄦醎\ue185ㆫƺ凥ꇟ\uf1ce쇪ᇒ懨눖舙툮∜爬䉗鉍\ue279㉽", MotionEvent.axisFromString("") + 12302).intern(), th2, true);
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static boolean m30865(Object obj) {
        int i = 2 % 2;
        if (obj == null || !Proxy.isProxyClass(obj.getClass())) {
            return false;
        }
        int i2 = f29806;
        int i3 = i2 + 45;
        f29804 = i3 % 128;
        boolean z = obj instanceof InterfaceC12003hf;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (!z) {
            return false;
        }
        int i4 = i2 + 83;
        f29804 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kd$c */
    static class c implements InvocationHandler {

        /* JADX INFO: renamed from: ﮐ */
        private static int f29807 = 0;

        /* JADX INFO: renamed from: ﱟ */
        private static int f29808 = 1;

        /* JADX INFO: renamed from: ﻏ */
        private static char f29809 = 28710;

        /* JADX INFO: renamed from: ﻐ */
        private static char f29810 = 60844;

        /* JADX INFO: renamed from: ｋ */
        private static char f29811 = 10974;

        /* JADX INFO: renamed from: ﾇ */
        private static char f29812 = 14549;

        /* JADX INFO: renamed from: ﻛ */
        private Object f29813;

        /* JADX INFO: renamed from: ﾒ */
        private a f29814;

        c(Object obj, a aVar) {
            this.f29813 = obj;
            this.f29814 = aVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            int i2 = f29807 + 51;
            f29808 = i2 % 128;
            if (i2 % 2 == 0) {
                m30870(method);
                throw null;
            }
            if (m30870(method)) {
                try {
                    return m30869(method);
                } catch (Throwable th) {
                    String strIntern = m30868("媛㻼㨣앺\ue454僎酜폙庖\ue8aa", 10 - TextUtils.getCapsMode("", 0, 0)).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m30868("ꇾ୩\uf25b쾙浦鯒肁㺝磶瀂醮髹ᡄ붧싔텆逪ᑪ명띹\ud94dᄅ痺膙\ue329\u0bbdᷱ鏎\ue282\ue906", 30 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
                    sb.append(method.getName());
                    C12080kb.m30845(strIntern, sb.toString(), th, true);
                    return null;
                }
            }
            try {
                this.f29814.mo29840(obj, method, objArr);
                int i3 = f29808 + 109;
                f29807 = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th2) {
                String strIntern2 = m30868("媛㻼㨣앺\ue454僎酜폙庖\ue8aa", Drawable.resolveOpacity(0, 0) + 10).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m30868("ꇾ୩\uf25b쾙浦鯒肁㺝磶瀂醮髹㐊뀓坞媥侐\ue4a3先\ue5f0퉬ూ\ueeea緫", 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                Object obj2 = this.f29813;
                sb2.append(obj2 != null ? obj2.toString() : m30868("㹪漛㩸깹", 4 - Drawable.resolveOpacity(0, 0)).intern());
                sb2.append(m30868("痺膙\ue329\u0bbdᷱ鏎쇰휟", 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(method.getName());
                C12080kb.m30845(strIntern2, sb2.toString(), th2, true);
            }
            Object obj3 = this.f29813;
            if (obj3 != null) {
                return method.invoke(obj3, objArr);
            }
            if (Object.class.equals(method.getDeclaringClass())) {
                int i5 = f29807 + 11;
                f29808 = i5 % 128;
                int i6 = i5 % 2;
                return method.invoke(this, m30867(objArr));
            }
            int i7 = f29808 + 95;
            f29807 = i7 % 128;
            int i8 = i7 % 2;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0049 A[Catch: all -> 0x0054, PHI: r5
  0x0049: PHI (r5v4 java.lang.Object) = (r5v3 java.lang.Object), (r5v7 java.lang.Object) binds: [B:14:0x003f, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0054, blocks: (B:5:0x0010, B:10:0x0025, B:15:0x0041, B:17:0x004c, B:16:0x0049, B:13:0x0035, B:18:0x004f), top: B:25:0x0010 }] */
        /* JADX INFO: renamed from: ﻛ */
        private static Object[] m30867(Object[] objArr) {
            Object obj;
            int i = 2 % 2;
            int i2 = f29808 + 65;
            f29807 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                super.hashCode();
                throw null;
            }
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = objArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = f29808 + 15;
                        f29807 = i4 % 128;
                        if (i4 % 2 == 0) {
                            obj = objArr[i3];
                            if (Proxy.isProxyClass(obj.getClass())) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                            } else {
                                arrayList.add(obj);
                            }
                        } else {
                            obj = objArr[i3];
                            int i5 = 22 / 0;
                            if (Proxy.isProxyClass(obj.getClass())) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                            } else {
                                arrayList.add(obj);
                            }
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    C12080kb.m30845(m30868("媛㻼㨣앺\ue454僎酜폙庖\ue8aa", 10 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), m30868("ꇾ୩\uf25b쾙浦鯒쫞謆或㸗肁㺝㢐\ue53f肁㺝磶瀂뤻꒕酜폙綴\uecd2ᡄ붧龉ྀ蔼Ǉ", 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, true);
                }
            }
            return objArr;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static boolean m30870(Method method) {
            int i = 2 % 2;
            int i2 = f29808 + 49;
            f29807 = i2 % 128;
            if (i2 % 2 == 0) {
                String name = method.getName();
                if (name.hashCode() != 1622498214 || !name.equals(m30868("쫞謆襾獮ㅴ㞼쟺䦟\uddc4授㨂䄉佡\ue04f㩸깹ꭚ\uef9f푣쁅", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20).intern())) {
                    return false;
                }
                int i3 = f29808 + 79;
                f29807 = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                int i4 = 3 / 2;
                return true;
            }
            method.getName().hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        private Object m30869(Method method) {
            int i = 2 % 2;
            int i2 = f29807 + 41;
            int i3 = i2 % 128;
            f29808 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (method != null) {
                int i4 = i3 + 25;
                f29807 = i4 % 128;
                if (i4 % 2 == 0) {
                    String name = method.getName();
                    if (name.hashCode() == 1622498214 && name.equals(m30868("쫞謆襾獮ㅴ㞼쟺䦟\uddc4授㨂䄉佡\ue04f㩸깹ꭚ\uef9f푣쁅", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20).intern())) {
                        int i5 = f29808 + 69;
                        f29807 = i5 % 128;
                        if (i5 % 2 == 0) {
                            return m30866();
                        }
                    }
                } else {
                    method.getName().hashCode();
                    throw null;
                }
            }
            int i6 = f29807 + 15;
            f29808 = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ */
        private Object m30866() {
            int i = 2 % 2;
            int i2 = f29807;
            int i3 = i2 + 103;
            f29808 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = this.f29813;
            int i5 = i2 + 77;
            f29808 = i5 % 128;
            if (i5 % 2 != 0) {
                return obj;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30868(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C12078k.f29776) {
                char[] cArr2 = new char[cArr.length];
                C12078k.f29775 = 0;
                char[] cArr3 = new char[2];
                while (C12078k.f29775 < cArr.length) {
                    cArr3[0] = cArr[C12078k.f29775];
                    cArr3[1] = cArr[C12078k.f29775 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29811)) ^ ((c2 >>> 5) + f29809)));
                        cArr3[1] = c3;
                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29810) ^ ((c3 + i2) ^ ((c3 << 4) + f29812))));
                        i2 -= 40503;
                    }
                    cArr2[C12078k.f29775] = cArr3[0];
                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                    C12078k.f29775 += 2;
                }
                str2 = new String(cArr2, 0, i);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30864(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29805);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
