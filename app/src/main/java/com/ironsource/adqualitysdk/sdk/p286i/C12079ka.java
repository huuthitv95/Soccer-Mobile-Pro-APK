package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ka */
/* JADX INFO: loaded from: classes6.dex */
public class C12079ka {

    /* JADX INFO: renamed from: ﱟ */
    private static int f29777 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29778;

    /* JADX INFO: renamed from: ﻐ */
    private static boolean f29779;

    /* JADX INFO: renamed from: ﻛ */
    private static Map<e, Method> f29780;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f29781;

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f29782;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29783;

    /* JADX INFO: renamed from: ﻛ */
    static void m30826() {
        f29782 = true;
        f29779 = true;
        f29783 = 256;
        f29781 = new char[]{338, 357, 358, 364, 355, 372, 361, 367, 366, 341, 371, 323, 353, 288, 373, 356, 325, 370, 359, 360, 365, 334, 295, 302, 369, 377};
    }

    static {
        m30826();
        f29780 = new ConcurrentHashMap();
        int i = f29777 + 103;
        f29778 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static Class m30818(String str, boolean z) {
        int i = 2 % 2;
        int i2 = f29778 + 59;
        f29777 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                return Class.forName(str);
            }
            Class.forName(str);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            if (z) {
                String strIntern = m30836(null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m30836(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u008e\u008b\u008b\u008d\u0084\u008c").intern());
                sb.append(str);
                sb.append(m30836(null, View.MeasureSpec.getSize(0) + 127, null, "\u0090\u0089\u008f\u0088\u0083\u008e\u0086\u0088\u0089\u008e").intern());
                C11875cm.m29607(strIntern, sb.toString(), th);
                int i3 = f29777 + 49;
                f29778 = i3 % 128;
                int i4 = i3 % 2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public static Object m30831(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = 2 % 2;
        int i2 = f29777 + 59;
        f29778 = i2 % 128;
        int i3 = i2 % 2;
        Constructor constructor = cls.getConstructor(clsArr);
        Object[] array = list.toArray();
        if (i3 == 0) {
            return constructor.newInstance(array);
        }
        constructor.newInstance(array);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static Object m30819(Class cls, List<Object> list) throws Exception {
        int i = 2 % 2;
        int i2 = f29778 + 45;
        f29777 = i2 % 128;
        int i3 = i2 % 2;
        Object objNewInstance = m30823(cls, list).newInstance(list.toArray());
        int i4 = f29777 + 7;
        f29778 = i4 % 128;
        if (i4 % 2 == 0) {
            return objNewInstance;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static Constructor m30823(Class cls, List<Object> list) {
        int i = 2 % 2;
        Constructor<?>[] constructors = cls.getConstructors();
        int i2 = f29778 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29777 = i2 % 128;
        int i3 = i2 % 2;
        for (Constructor<?> constructor : constructors) {
            int i4 = f29777 + 111;
            f29778 = i4 % 128;
            int i5 = i4 % 2;
            if (constructor.getParameterTypes().length == list.size()) {
                int i6 = f29778 + 41;
                f29777 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 45 / 0;
                    if (m30827(constructor, list)) {
                        return constructor;
                    }
                } else if (m30827(constructor, list)) {
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ */
    public static Method m30829(Object obj, String str, List<Object> list) {
        Method methodM30824;
        int i = 2 % 2;
        e eVar = new e(obj, str, m30825(list));
        Method method = f29780.get(eVar);
        if (method != null) {
            int i2 = f29777 + 101;
            f29778 = i2 % 128;
            if (i2 % 2 == 0) {
                if (m30822(method.getParameterTypes(), list)) {
                    return method;
                }
                String strIntern = m30836(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m30836(null, 127 - Color.green(0), null, "\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0090\u0082\u0094\u0085\u008d\u0085\u008e\u0093\u0089\u0087\u0086\u0086\u0082\u0093\u008e\u0092\u0088\u0092\u0092\u0091").intern());
                sb.append(eVar);
                C11875cm.m29607(strIntern, sb.toString(), null);
            } else {
                m30822(method.getParameterTypes(), list);
                throw null;
            }
        }
        if (obj instanceof Class) {
            int i3 = f29778 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29777 = i3 % 128;
            int i4 = i3 % 2;
            methodM30824 = m30828((Class) obj, str, list, true);
            if (methodM30824 == null) {
                methodM30824 = m30824(Class.class, str, list);
            }
        } else {
            methodM30824 = m30824(obj, str, list);
        }
        if (methodM30824 != null) {
            f29780.put(eVar, methodM30824);
        }
        return methodM30824;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static List<Class> m30825(List<Object> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = f29778 + 1;
        f29777 = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : list) {
            int i4 = f29778 + 7;
            f29777 = i4 % 128;
            int i5 = i4 % 2;
            if (obj != null) {
                arrayList.add(obj.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static Method m30824(Object obj, String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f29778 + 57;
        f29777 = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = obj.getClass();
        Method methodM30828 = i3 == 0 ? m30828(cls, str, list, true) : m30828(cls, str, list, false);
        int i4 = f29777 + 3;
        f29778 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return methodM30828;
    }

    /* JADX INFO: renamed from: ｋ */
    private static Method m30828(Class cls, String str, List<Object> list, boolean z) {
        int i = 2 % 2;
        int i2 = f29777 + 89;
        f29778 = i2 % 128;
        int i3 = i2 % 2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= length) {
                return null;
            }
            Method method = methods[i4];
            if (method.getName().equals(str)) {
                int i5 = f29778 + 21;
                f29777 = i5 % 128;
                if (i5 % 2 != 0) {
                    if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m30833(method, list)) {
                        int i6 = f29777 + 59;
                        f29778 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return method;
                        }
                        super.hashCode();
                        throw null;
                    }
                } else {
                    int length2 = method.getParameterTypes().length;
                    list.size();
                    super.hashCode();
                    throw null;
                }
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static boolean m30833(Method method, List<Object> list) {
        int i = 2 % 2;
        int i2 = f29777 + 21;
        f29778 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30822 = m30822(method.getParameterTypes(), list);
        int i4 = f29778 + 13;
        f29777 = i4 % 128;
        if (i4 % 2 != 0) {
            return zM30822;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static boolean m30827(Constructor constructor, List<Object> list) {
        int i = 2 % 2;
        int i2 = f29778 + 45;
        f29777 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i3 != 0) {
            return m30822(parameterTypes, list);
        }
        m30822(parameterTypes, list);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static boolean m30822(Class[] clsArr, List<Object> list) {
        int i = 2 % 2;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 < clsArr.length) {
                int i3 = f29778 + 81;
                f29777 = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj2 = list.get(i2);
                    if ((obj2 == null && !Object.class.isAssignableFrom(clsArr[i2])) || (obj2 != null && !m30821(clsArr[i2], obj2))) {
                        return false;
                    }
                    i2++;
                } else {
                    list.get(i2);
                    super.hashCode();
                    throw null;
                }
            } else {
                int i4 = f29778 + 55;
                f29777 = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                super.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01db  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ba  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:109:0x01f2
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ﻐ */
    private static boolean m30821(java.lang.Class r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12079ka.m30821(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ﻐ */
    public static Method m30820(Object obj, String str, List<Class> list) {
        int i = 2 % 2;
        int i2 = f29777 + 59;
        f29778 = i2 % 128;
        Object obj2 = null;
        try {
            if (i2 % 2 == 0) {
                Class<?>[] clsArrM30830 = m30830(list);
                if (obj instanceof Class) {
                    try {
                        obj = ((Class) obj).getMethod(str, clsArrM30830);
                        return obj;
                    } catch (NoSuchMethodException unused) {
                        return Class.class.getMethod(str, clsArrM30830);
                    }
                }
                Method method = obj.getClass().getMethod(str, clsArrM30830);
                int i3 = f29777 + 73;
                f29778 = i3 % 128;
                if (i3 % 2 == 0) {
                    return method;
                }
                super.hashCode();
                throw null;
            }
            m30830(list);
            boolean z = obj instanceof Class;
            super.hashCode();
            throw null;
        } catch (NoSuchMethodException e2) {
            String strIntern = m30836(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30836(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u0097\u008e\u0088\u0096").intern());
            sb.append(str);
            sb.append(m30836(null, 127 - (Process.myTid() >> 22), null, "\u008e\u0092\u0088\u0083\u008e\u0090\u0089\u008f\u0088\u0083\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0097").intern());
            sb.append(obj);
            C11875cm.m29607(strIntern, sb.toString(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public static Field[] m30834(Field[] fieldArr, Field[] fieldArr2) {
        int i = 2 % 2;
        int i2 = f29778 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29777 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length >> length2];
            System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
            System.arraycopy(fieldArr2, 1, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static Method[] m30835(Method[] methodArr, Method[] methodArr2) {
        Method[] methodArr3;
        int i = 2 % 2;
        int i2 = f29778 + 41;
        f29777 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            methodArr3 = new Method[length << length2];
            System.arraycopy(methodArr, 0, methodArr3, 1, length);
            System.arraycopy(methodArr2, 1, methodArr3, length, length2);
        } else {
            int length3 = methodArr.length;
            int length4 = methodArr2.length;
            methodArr3 = new Method[length3 + length4];
            System.arraycopy(methodArr, 0, methodArr3, 0, length3);
            System.arraycopy(methodArr2, 0, methodArr3, length3, length4);
        }
        int i3 = f29778 + 21;
        f29777 = i3 % 128;
        int i4 = i3 % 2;
        return methodArr3;
    }

    /* JADX INFO: renamed from: ｋ */
    private static Class[] m30830(List<Class> list) {
        int i = 2 % 2;
        Class[] clsArr = new Class[list.size()];
        int i2 = f29777 + 13;
        f29778 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = f29778 + 103;
            f29777 = i5 % 128;
            int i6 = i5 % 2;
            clsArr[i4] = list.get(i4);
        }
        return clsArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[PHI: r2
  0x005f: PHI (r2v19 java.lang.String) = (r2v18 java.lang.String), (r2v23 java.lang.String) binds: [B:22:0x005d, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e A[ADDED_TO_REGION, EDGE_INSN: B:51:0x008e->B:33:0x008e BREAK  A[LOOP:0: B:14:0x002e->B:56:0x002e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[EDGE_INSN: B:54:0x008e->B:33:0x008e BREAK  A[LOOP:0: B:14:0x002e->B:56:0x002e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x002e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ */
    public static boolean m30832(Class cls, List<String> list) {
        Iterator<String> it;
        Object obj;
        int i;
        String next;
        int i2;
        int i3 = 2 % 2;
        if (cls != null) {
            int i4 = f29777 + 73;
            f29778 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
                if (list != null) {
                    if (!list.isEmpty()) {
                        it = list.iterator();
                        int i6 = f29777 + 103;
                        f29778 = i6 % 128;
                        int i7 = i6 % 2;
                        while (true) {
                            obj = null;
                            if (!(!it.hasNext())) {
                                i = f29777 + 69;
                                f29778 = i % 128;
                                if (i % 2 != 0) {
                                    next = it.next();
                                    if (next.equals("")) {
                                        if (cls.getPackage() != null) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                } else {
                                    next = it.next();
                                    int i8 = 30 / 0;
                                    if (next.equals("")) {
                                        if (cls.getPackage() != null && !cls.getPackage().getName().equals("")) {
                                            break;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (!next.equals("")) {
                                    i2 = f29778 + 85;
                                    f29777 = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        cls.getName().startsWith(next);
                                        super.hashCode();
                                        throw null;
                                    }
                                    if (cls.getName().startsWith(next)) {
                                        break;
                                    }
                                }
                            } else if (!C12079ka.class.getName().startsWith(m30836(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u009a\u0086\u0087\u0084\u008d\u008f\u0099\u0090\u008d\u0098\u0082\u0085\u0092\u008f\u0088\u008b\u0089\u0088\u0092\u0087\u0098\u0095\u0088\u0085").intern())) {
                                int i9 = f29777 + 43;
                                f29778 = i9 % 128;
                                int i10 = i9 % 2;
                                return (C12079ka.class.getPackage() != null && cls.getPackage() == null) || (C12079ka.class.getPackage() != null && C12079ka.class.getPackage().equals(cls.getPackage()));
                            }
                        }
                        return true;
                    }
                }
            } else if (list != null) {
                if (!list.isEmpty()) {
                    it = list.iterator();
                    int i11 = f29777 + 103;
                    f29778 = i11 % 128;
                    int i12 = i11 % 2;
                    while (true) {
                        obj = null;
                        if (!(!it.hasNext())) {
                            i = f29777 + 69;
                            f29778 = i % 128;
                            if (i % 2 != 0) {
                                next = it.next();
                                if (next.equals("")) {
                                    if (cls.getPackage() != null) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                next = it.next();
                                int i13 = 30 / 0;
                                if (next.equals("")) {
                                    if (cls.getPackage() != null) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            }
                            if (!next.equals("")) {
                                i2 = f29778 + 85;
                                f29777 = i2 % 128;
                                if (i2 % 2 != 0) {
                                    cls.getName().startsWith(next);
                                    super.hashCode();
                                    throw null;
                                }
                                if (cls.getName().startsWith(next)) {
                                    break;
                                    break;
                                }
                            }
                        } else if (!C12079ka.class.getName().startsWith(m30836(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u009a\u0086\u0087\u0084\u008d\u008f\u0099\u0090\u008d\u0098\u0082\u0085\u0092\u008f\u0088\u008b\u0089\u0088\u0092\u0087\u0098\u0095\u0088\u0085").intern())) {
                            int i14 = f29777 + 43;
                            f29778 = i14 % 128;
                            int i15 = i14 % 2;
                            if (C12079ka.class.getPackage() != null) {
                            }
                        }
                    }
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ka$e */
    static class e {

        /* JADX INFO: renamed from: ﮐ */
        private static int f29784 = 1;

        /* JADX INFO: renamed from: ﱟ */
        private static short[] f29785 = null;

        /* JADX INFO: renamed from: ﱡ */
        private static byte[] f29786 = {-108, 38, -113, Ascii.f22493FS, -110, 34, -116, -118, -120, 104, 41, Ascii.f22493FS, -114, Ascii.f22494GS, -106, -127, -3, 55, 37, -52, 32, 2, 40, -47, -50, 63, 38, -43, 112, -126, 98, -50, -71, 112, 87, -59, 86, -51, -62, 106, Ascii.f22499SI, 86, -97, -29, -89, -39, -57, -84, 0, -107, -84, -24, -115, 36, -83, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ﺙ */
        private static int f29787 = 1791319303;

        /* JADX INFO: renamed from: ﻏ */
        private static int f29788 = 0;

        /* JADX INFO: renamed from: ﻐ */
        private static int f29789 = 113;

        /* JADX INFO: renamed from: ﾒ */
        private static int f29790 = 529990942;

        /* JADX INFO: renamed from: ﻛ */
        private List<Class> f29791;

        /* JADX INFO: renamed from: ｋ */
        private String f29792;

        /* JADX INFO: renamed from: ﾇ */
        private Class f29793;

        public e(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f29793 = (Class) obj;
            } else {
                this.f29793 = obj.getClass();
            }
            this.f29792 = str;
            this.f29791 = list;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = f29784 + 69;
            f29788 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                super.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                int i3 = f29784 + 3;
                f29788 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            e eVar = (e) obj;
            if (this.f29793.equals(eVar.f29793) && this.f29792.equals(eVar.f29792)) {
                return this.f29791.equals(eVar.f29791);
            }
            return false;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = f29784 + 1;
            f29788 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.f29793.hashCode() * 31) + this.f29792.hashCode()) * 31) + this.f29791.hashCode();
            int i4 = f29784 + 9;
            f29788 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(m30837(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 529990941, (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 88), (-1791319226) - (ViewConfiguration.getTouchSlop() >> 8), (byte) (49 - View.MeasureSpec.getSize(0)), (-96) - View.combineMeasuredStates(0, 0)).intern());
            sb.append(m30837((-529990926) - View.resolveSize(0, 0), (short) (TextUtils.indexOf("", "", 0, 0) - 5), Color.red(0) - 1791319194, (byte) (50 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 100).intern());
            sb.append(this.f29793);
            sb.append(m30837((-529990915) - Process.getGidForName(""), (short) (109 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1791319259) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((Process.myPid() >> 22) + 54), (-98) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb.append(this.f29792);
            sb.append('\'');
            sb.append(m30837((-529990899) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58), (-1791319259) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (19 - Color.red(0)), (-99) - TextUtils.indexOf("", "", 0, 0)).intern());
            sb.append(this.f29791);
            sb.append(AbstractJsonLexerKt.END_OBJ);
            String string = sb.toString();
            int i2 = f29784 + 47;
            f29788 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return string;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30837(int i, short s, int i2, byte b, int i3) {
            String string;
            synchronized (C12086m.f29832) {
                StringBuilder sb = new StringBuilder();
                int i4 = f29789;
                int i5 = i3 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f29786;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f29790 + i] + i4);
                    } else {
                        i5 = (short) (f29785[f29790 + i] + i4);
                    }
                }
                if (i5 > 0) {
                    C12086m.f29836 = ((i + i5) - 2) + f29790 + i6;
                    C12086m.f29833 = b;
                    C12086m.f29837 = (char) (i2 + f29787);
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835 = 1;
                    while (C12086m.f29835 < i5) {
                        byte[] bArr2 = f29786;
                        if (bArr2 != null) {
                            int i7 = C12086m.f29836;
                            C12086m.f29836 = i7 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                        } else {
                            short[] sArr = f29785;
                            int i8 = C12086m.f29836;
                            C12086m.f29836 = i8 - 1;
                            C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                        }
                        sb.append(C12086m.f29837);
                        C12086m.f29834 = C12086m.f29837;
                        C12086m.f29835++;
                    }
                }
                string = sb.toString();
            }
            return string;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30836(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f29781;
            int i2 = f29783;
            if (f29779) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f29782) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
