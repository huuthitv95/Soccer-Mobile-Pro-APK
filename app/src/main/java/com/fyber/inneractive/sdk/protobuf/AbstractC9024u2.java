package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.u2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9024u2 {

    /* JADX INFO: renamed from: a */
    public static final Class f21133a;

    /* JADX INFO: renamed from: b */
    public static final C8992o3 f21134b;

    /* JADX INFO: renamed from: c */
    public static final C8992o3 f21135c;

    /* JADX INFO: renamed from: d */
    public static final C8992o3 f21136d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f21133a = cls;
        f21134b = m21780a(false);
        f21135c = m21780a(true);
        f21136d = new C8992o3();
    }

    /* JADX INFO: renamed from: a */
    public static int m21778a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8911b0.m21514b(i) + 4) * size;
    }

    /* JADX INFO: renamed from: a */
    public static int m21779a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8906a1)) {
            int iM21510a = 0;
            while (i < size) {
                iM21510a += AbstractC8911b0.m21510a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM21510a;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int iM21510a2 = 0;
        while (i < size) {
            c8906a1.m21504d(i);
            iM21510a2 += AbstractC8911b0.m21510a(c8906a1.f20977b[i]);
            i++;
        }
        return iM21510a2;
    }

    /* JADX INFO: renamed from: a */
    public static C8992o3 m21780a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C8992o3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m21781a(int i, int i2, Object obj, C8992o3 c8992o3) {
        if (obj == null) {
            c8992o3.getClass();
            obj = new C8986n3();
        }
        c8992o3.getClass();
        ((C8986n3) obj).m21688a(i << 3, Long.valueOf(i2));
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static Object m21782a(int i, AbstractList abstractList, InterfaceC8930e1 interfaceC8930e1, Object obj, C8992o3 c8992o3) {
        if (interfaceC8930e1 == null) {
            return obj;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (interfaceC8930e1.mo20329a(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj = m21781a(i, iIntValue, obj, c8992o3);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static Object m21783a(int i, List list, Object obj, C8992o3 c8992o3) {
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m21784a(int i, List list, C8917c0 c8917c0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8917c0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8917c0.f20990a.mo21478a(i, (AbstractC9011s) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21785a(int i, List list, C8917c0 c8917c0, InterfaceC9019t2 interfaceC9019t2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8917c0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8917c0.m21526a(i, list.get(i2), interfaceC9019t2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21786a(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21479a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3++;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21473a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21787a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m21788b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8911b0.m21514b(i) + 8) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m21789b(List list) {
        int iM21516c;
        int iM21516c2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8906a1)) {
            int i2 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                if (iIntValue >= 0) {
                    iM21516c = AbstractC8911b0.m21516c(iIntValue);
                } else {
                    Logger logger = AbstractC8911b0.f20983b;
                    iM21516c = 10;
                }
                i2 += iM21516c;
                i++;
            }
            return i2;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = 0;
        while (i < size) {
            c8906a1.m21504d(i);
            int i4 = c8906a1.f20977b[i];
            if (i4 >= 0) {
                iM21516c2 = AbstractC8911b0.m21516c(i4);
            } else {
                Logger logger2 = AbstractC8911b0.f20983b;
                iM21516c2 = 10;
            }
            i3 += iM21516c2;
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static void m21790b(int i, List list, C8917c0 c8917c0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8917c0.getClass();
        int i2 = 0;
        if (!(list instanceof InterfaceC9002q1)) {
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21481a((String) list.get(i2), i);
                i2++;
            }
            return;
        }
        InterfaceC9002q1 interfaceC9002q1 = (InterfaceC9002q1) list;
        while (i2 < list.size()) {
            Object objMo21695a = interfaceC9002q1.mo21695a(i2);
            if (objMo21695a instanceof String) {
                c8917c0.f20990a.mo21481a((String) objMo21695a, i);
            } else {
                c8917c0.f20990a.mo21478a(i, (AbstractC9011s) objMo21695a);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21791b(int i, List list, C8917c0 c8917c0, InterfaceC9019t2 interfaceC9019t2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c8917c0.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c8917c0.f20990a.mo21477a(i, (InterfaceC8925d2) list.get(i2), interfaceC9019t2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21792b(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                AbstractC8911b0 abstractC8911b0 = c8917c0.f20990a;
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC8911b0.getClass();
                abstractC8911b0.mo21475a(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 8;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            AbstractC8911b0 abstractC8911b1 = c8917c0.f20990a;
            double dDoubleValue2 = ((Double) list.get(i2)).doubleValue();
            abstractC8911b1.getClass();
            abstractC8911b1.mo21490c(Double.doubleToRawLongBits(dDoubleValue2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m21793c(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM21514b = AbstractC8911b0.m21514b(i) * size;
        if (!(list instanceof InterfaceC9002q1)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM21514b = (obj instanceof AbstractC9011s ? AbstractC8911b0.m21512a((AbstractC9011s) obj) : AbstractC8911b0.m21513a((String) obj)) + iM21514b;
                i2++;
            }
            return iM21514b;
        }
        InterfaceC9002q1 interfaceC9002q1 = (InterfaceC9002q1) list;
        while (i2 < size) {
            Object objMo21695a = interfaceC9002q1.mo21695a(i2);
            iM21514b = (objMo21695a instanceof AbstractC9011s ? AbstractC8911b0.m21512a((AbstractC9011s) objMo21695a) : AbstractC8911b0.m21513a((String) objMo21695a)) + iM21514b;
            i2++;
        }
        return iM21514b;
    }

    /* JADX INFO: renamed from: c */
    public static int m21794c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9023u1)) {
            int iM21511a = 0;
            while (i < size) {
                iM21511a += AbstractC8911b0.m21511a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM21511a;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int iM21511a2 = 0;
        while (i < size) {
            c9023u1.m21776c(i);
            iM21511a2 += AbstractC8911b0.m21511a(c9023u1.f21131b[i]);
            i++;
        }
        return iM21511a2;
    }

    /* JADX INFO: renamed from: c */
    public static void m21795c(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21483b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21510a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21510a += AbstractC8911b0.m21510a(((Integer) list.get(i3)).intValue());
        }
        c8917c0.f20990a.mo21498g(iM21510a);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21496f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m21796d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8906a1)) {
            int iM21516c = 0;
            while (i < size) {
                iM21516c += AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(((Integer) list.get(i)).intValue()));
                i++;
            }
            return iM21516c;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int iM21516c2 = 0;
        while (i < size) {
            c8906a1.m21504d(i);
            iM21516c2 += AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(c8906a1.f20977b[i]));
            i++;
        }
        return iM21516c2;
    }

    /* JADX INFO: renamed from: d */
    public static void m21797d(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21474a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 4;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21493e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m21798e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9023u1)) {
            int iM21511a = 0;
            while (i < size) {
                iM21511a += AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(((Long) list.get(i)).longValue()));
                i++;
            }
            return iM21511a;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int iM21511a2 = 0;
        while (i < size) {
            c9023u1.m21776c(i);
            iM21511a2 += AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(c9023u1.f21131b[i]));
            i++;
        }
        return iM21511a2;
    }

    /* JADX INFO: renamed from: e */
    public static void m21799e(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21475a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 8;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21490c(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m21800f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8906a1)) {
            int iM21516c = 0;
            while (i < size) {
                iM21516c += AbstractC8911b0.m21516c(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM21516c;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int iM21516c2 = 0;
        while (i < size) {
            c8906a1.m21504d(i);
            iM21516c2 += AbstractC8911b0.m21516c(c8906a1.f20977b[i]);
            i++;
        }
        return iM21516c2;
    }

    /* JADX INFO: renamed from: f */
    public static void m21801f(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                AbstractC8911b0 abstractC8911b0 = c8917c0.f20990a;
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                abstractC8911b0.getClass();
                abstractC8911b0.mo21474a(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 4;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            AbstractC8911b0 abstractC8911b1 = c8917c0.f20990a;
            float fFloatValue2 = ((Float) list.get(i2)).floatValue();
            abstractC8911b1.getClass();
            abstractC8911b1.mo21493e(Float.floatToRawIntBits(fFloatValue2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m21802g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C9023u1)) {
            int iM21511a = 0;
            while (i < size) {
                iM21511a += AbstractC8911b0.m21511a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM21511a;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int iM21511a2 = 0;
        while (i < size) {
            c9023u1.m21776c(i);
            iM21511a2 += AbstractC8911b0.m21511a(c9023u1.f21131b[i]);
            i++;
        }
        return iM21511a2;
    }

    /* JADX INFO: renamed from: g */
    public static void m21803g(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21483b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21516c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iM21516c += iIntValue >= 0 ? AbstractC8911b0.m21516c(iIntValue) : 10;
        }
        c8917c0.f20990a.mo21498g(iM21516c);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21496f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m21804h(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21484b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21511a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21511a += AbstractC8911b0.m21511a(((Long) list.get(i3)).longValue());
        }
        c8917c0.f20990a.mo21498g(iM21511a);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21492d(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m21805i(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21474a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 4;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21493e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m21806j(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21475a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC8911b0.f20983b;
            i3 += 8;
        }
        c8917c0.f20990a.mo21498g(i3);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21490c(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21807k(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21491d(i, AbstractC8911b0.m21517d(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21516c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21516c += AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(((Integer) list.get(i3)).intValue()));
        }
        c8917c0.f20990a.mo21498g(iM21516c);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21498g(AbstractC8911b0.m21517d(((Integer) list.get(i2)).intValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m21808l(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21484b(i, AbstractC8911b0.m21515b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21511a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21511a += AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(((Long) list.get(i3)).longValue()));
        }
        c8917c0.f20990a.mo21498g(iM21511a);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21492d(AbstractC8911b0.m21515b(((Long) list.get(i2)).longValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m21809m(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21491d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21516c = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21516c += AbstractC8911b0.m21516c(((Integer) list.get(i3)).intValue());
        }
        c8917c0.f20990a.mo21498g(iM21516c);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21498g(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m21810n(int i, List list, C8917c0 c8917c0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c8917c0.getClass();
            while (i2 < list.size()) {
                c8917c0.f20990a.mo21484b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c8917c0.f20990a.mo21489c(i, 2);
        int iM21511a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM21511a += AbstractC8911b0.m21511a(((Long) list.get(i3)).longValue());
        }
        c8917c0.f20990a.mo21498g(iM21511a);
        while (i2 < list.size()) {
            c8917c0.f20990a.mo21492d(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
