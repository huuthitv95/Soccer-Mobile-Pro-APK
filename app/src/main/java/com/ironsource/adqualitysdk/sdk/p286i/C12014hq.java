package com.ironsource.adqualitysdk.sdk.p286i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hq */
/* JADX INFO: loaded from: classes6.dex */
public class C12014hq {

    /* JADX INFO: renamed from: ﻐ */
    private List<Field> f29205;

    /* JADX INFO: renamed from: ﻛ */
    private b f29206;

    /* JADX INFO: renamed from: ﾇ */
    private C12010hm f29207;

    /* JADX INFO: renamed from: ﾇ */
    public final Field m30311(Class cls, final String str) {
        b bVar = new b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hq.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12014hq.b
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo30312(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (C12014hq.class) {
            if (this.f29205 == null) {
                this.f29205 = new ArrayList();
            }
            this.f29205.clear();
            m30304(cls, bVar, this.f29205);
            if (this.f29205.isEmpty()) {
                return null;
            }
            return this.f29205.get(0);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final <T> Field m30308(Class cls, Class<T> cls2) {
        Field fieldM30310;
        synchronized (C12072ju.class) {
            if (this.f29207 == null) {
                this.f29207 = new C12010hm();
            }
            this.f29207.m30283(cls2);
            fieldM30310 = m30310(cls, this.f29207);
        }
        return fieldM30310;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final Field m30310(Class cls, C12010hm c12010hm) {
        synchronized (C12072ju.class) {
            if (this.f29205 == null) {
                this.f29205 = new ArrayList();
            }
            this.f29205.clear();
            m30303(cls, c12010hm, this.f29205);
            if (this.f29205.isEmpty()) {
                return null;
            }
            return this.f29205.get(0);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final List<Field> m30309(Class cls, C12010hm c12010hm) {
        ArrayList arrayList = new ArrayList();
        m30303(cls, c12010hm, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m30303(Class cls, C12010hm c12010hm, List<Field> list) {
        synchronized (C12014hq.class) {
            if (this.f29206 == null) {
                this.f29206 = new b(this);
            }
            this.f29206.m30314(c12010hm);
            m30304(cls, this.f29206, list);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static C12010hm.c m30306() {
        return new C12010hm.c();
    }

    /* JADX INFO: renamed from: ﾇ */
    public static Field[] m30305(Class cls, boolean z, int i, List<String> list) {
        while (cls != null && !C12079ka.m30832(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM30834 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM30834 = C12079ka.m30834(declaredFields, fields);
            if (!z) {
                return fieldArrM30834;
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    fieldArrM30834 = C12079ka.m30834(fieldArrM30834, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM30834 = C12079ka.m30834(fieldArrM30834, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM30834;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m30304(Class cls, b bVar, List<Field> list) {
        for (Field field : m30307(cls, bVar.m30313())) {
            if (bVar.mo30312(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static Field[] m30307(Class cls, C12010hm c12010hm) {
        if (c12010hm != null && c12010hm.m30298()) {
            return m30305(cls, c12010hm.m30298(), c12010hm.m30296(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hq$b */
    class b {

        /* JADX INFO: renamed from: ﻐ */
        private C12010hm f29209;

        /* JADX INFO: renamed from: ｋ */
        private int f29210;

        private b() {
        }

        /* synthetic */ b(C12014hq c12014hq) {
            this();
        }

        /* JADX INFO: renamed from: ﾇ */
        public final void m30314(C12010hm c12010hm) {
            this.f29209 = c12010hm;
            this.f29210 = c12010hm.m30278();
        }

        /* JADX INFO: renamed from: ｋ */
        public final C12010hm m30313() {
            return this.f29209;
        }

        /* JADX INFO: renamed from: ﻛ */
        public boolean mo30312(Field field) {
            boolean zIsAssignableFrom;
            if (this.f29209 == null || (field.getModifiers() & this.f29209.m30297()) != this.f29209.m30297() || (field.getModifiers() & this.f29209.m30295()) != 0 || this.f29209.m30281().contains(field.getType())) {
                return false;
            }
            if (this.f29209.m30279()) {
                zIsAssignableFrom = field.getType().equals(this.f29209.m30280());
            } else {
                zIsAssignableFrom = this.f29209.m30280().isAssignableFrom(field.getType());
            }
            if (zIsAssignableFrom) {
                int i = this.f29210;
                if (i == 0) {
                    return true;
                }
                this.f29210 = i - 1;
            }
            return false;
        }
    }
}
