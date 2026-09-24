package com.ironsource.adqualitysdk.sdk.p286i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ht */
/* JADX INFO: loaded from: classes6.dex */
public final class C12017ht {

    /* JADX INFO: renamed from: ﾇ */
    private C11901dl f29227;

    /* JADX INFO: renamed from: ﾒ */
    private C12017ht f29228;

    /* JADX INFO: renamed from: ﾒ */
    public static List<Method> m30349(Class cls, C12016hs c12016hs) {
        ArrayList arrayList = new ArrayList();
        m30346(cls, c12016hs, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m30346(Class cls, C12016hs c12016hs, List<Method> list) {
        e eVar = new e((byte) 0);
        eVar.m30356(c12016hs);
        m30348(cls, eVar, list);
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30348(Class cls, e eVar, List<Method> list) {
        List<Method> listAsList;
        C12016hs c12016hsM30357 = eVar.m30357();
        if (c12016hsM30357 != null && c12016hsM30357.m30298()) {
            listAsList = m30347(cls, c12016hsM30357.m30298(), c12016hsM30357.m30296());
        } else {
            listAsList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : listAsList) {
            if (eVar.m30358(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List<Method> m30347(Class cls, boolean z, int i) {
        Method[] methodArrM30835 = new Method[0];
        if (cls != null) {
            methodArrM30835 = C12079ka.m30835(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return Arrays.asList(methodArrM30835);
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                methodArrM30835 = C12079ka.m30835(C12079ka.m30835(methodArrM30835, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM30835);
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ht$e */
    static class e {

        /* JADX INFO: renamed from: ﻛ */
        private int f29229;

        /* JADX INFO: renamed from: ﾇ */
        private C12016hs f29230;

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        /* JADX INFO: renamed from: ﻛ */
        public final void m30356(C12016hs c12016hs) {
            this.f29230 = c12016hs;
            this.f29229 = c12016hs.m30331();
        }

        /* JADX INFO: renamed from: ｋ */
        public final C12016hs m30357() {
            return this.f29230;
        }

        /* JADX INFO: renamed from: ｋ */
        public final boolean m30358(Method method) {
            boolean zIsAssignableFrom;
            if (this.f29230 == null || (method.getModifiers() & this.f29230.m30297()) != this.f29230.m30297() || (method.getModifiers() & this.f29230.m30295()) != 0 || this.f29230.m30330().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f29230.m30326() != -1 && this.f29230.m30326() != parameterTypes.length) {
                return false;
            }
            List<Class> listM30329 = this.f29230.m30329();
            if (listM30329 != null) {
                if (listM30329.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < listM30329.size(); i++) {
                    if (!listM30329.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (this.f29230.m30327() == null) {
                zIsAssignableFrom = true;
            } else if (this.f29230.m30328()) {
                zIsAssignableFrom = method.getReturnType().equals(this.f29230.m30327());
            } else {
                zIsAssignableFrom = this.f29230.m30327().isAssignableFrom(method.getReturnType());
            }
            if (zIsAssignableFrom) {
                int i2 = this.f29229;
                if (i2 == 0) {
                    return true;
                }
                this.f29229 = i2 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static Method m30345(Class cls, C12016hs c12016hs) {
        ArrayList arrayList = new ArrayList();
        m30346(cls, c12016hs, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    public C12017ht() {
    }

    public C12017ht(C11901dl c11901dl, C12017ht c12017ht) {
        this.f29227 = c11901dl;
        this.f29228 = c12017ht;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m30353() {
        return this.f29227.m30024();
    }

    /* JADX INFO: renamed from: ﻛ */
    public final C12017ht m30350() {
        return this.f29228;
    }

    /* JADX INFO: renamed from: ｋ */
    public final List<String> m30351() {
        ArrayList arrayList = new ArrayList(this.f29227.m30022());
        C12017ht c12017ht = this.f29228;
        if (c12017ht != null) {
            arrayList.addAll(c12017ht.m30351());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final List<C11905dp> m30355() {
        ArrayList arrayList = new ArrayList(this.f29227.m30019());
        C12017ht c12017ht = this.f29228;
        if (c12017ht != null) {
            arrayList.addAll(c12017ht.m30355());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final C11902dm m30352(String str) {
        C11902dm c11902dm;
        C12017ht c12017ht = this;
        do {
            c11902dm = c12017ht.f29227.m30020().get(str);
            if (c11902dm != null) {
                break;
            }
            c12017ht = c12017ht.f29228;
        } while (c12017ht != null);
        return c11902dm;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final C11906dq m30354(String str) {
        C11906dq c11906dq;
        C12017ht c12017ht = this;
        do {
            c11906dq = c12017ht.f29227.m30025().get(str);
            if (c11906dq != null) {
                break;
            }
            c12017ht = c12017ht.f29228;
        } while (c12017ht != null);
        return c11906dq;
    }
}
