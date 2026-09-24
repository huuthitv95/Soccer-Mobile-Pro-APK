package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hw */
/* JADX INFO: loaded from: classes6.dex */
public final class C12020hw {

    /* JADX INFO: renamed from: ﻐ */
    private d f29234;

    /* JADX INFO: renamed from: ﻛ */
    private InterfaceC12021hx f29235;

    /* JADX INFO: renamed from: ﾇ */
    private InterfaceC12011hn f29236;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m30368(int i, int i2) {
        return i >= i2;
    }

    /* synthetic */ C12020hw(byte b) {
        this();
    }

    private C12020hw() {
        this.f29234 = new d();
    }

    /* JADX INFO: renamed from: ﻐ */
    public final InterfaceC12021hx m30370() {
        return this.f29235;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final InterfaceC12011hn m30379() {
        return this.f29236;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final List<String> m30377() {
        return this.f29234.f29247;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final int m30372() {
        return this.f29234.f29250;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m30373(int i) {
        return m30368(i, this.f29234.f29245);
    }

    /* JADX INFO: renamed from: ｋ */
    public final int m30374(int i) {
        if (m30368(i, this.f29234.f29246)) {
            return this.f29234.f29244;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final boolean m30380(int i) {
        return m30368(i, this.f29234.f29243);
    }

    /* JADX INFO: renamed from: ﻐ */
    public final boolean m30371(int i) {
        return m30368(i, this.f29234.f29239);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m30378(int i) {
        return m30368(i, this.f29234.f29241);
    }

    /* JADX INFO: renamed from: ﱟ */
    public final boolean m30369(int i) {
        return m30368(i, this.f29234.f29242);
    }

    /* JADX INFO: renamed from: ｋ */
    public final boolean m30375() {
        return this.f29234.f29238;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final d m30376(Class cls) {
        this.f29234.f29248 = cls;
        return this.f29234;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hw$d */
    static class d {

        /* JADX INFO: renamed from: ﮉ */
        private Object f29240;

        /* JADX INFO: renamed from: ﻐ */
        private List<String> f29247;

        /* JADX INFO: renamed from: ﻛ */
        private Class f29248;

        /* JADX INFO: renamed from: ｋ */
        private Class f29249;

        /* JADX INFO: renamed from: ﾇ */
        private int f29250;

        /* JADX INFO: renamed from: ﾒ */
        private Class f29251;

        /* JADX INFO: renamed from: ﺙ */
        private int f29245 = -1;

        /* JADX INFO: renamed from: ﻏ */
        private int f29246 = -1;

        /* JADX INFO: renamed from: ﱡ */
        private int f29244 = -1;

        /* JADX INFO: renamed from: ﱟ */
        private int f29243 = -1;

        /* JADX INFO: renamed from: ﮐ */
        private int f29242 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭸ */
        private int f29239 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﮌ */
        private int f29241 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ */
        private boolean f29238 = true;

        d() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f29250 != dVar.f29250 || this.f29245 != dVar.f29245 || this.f29246 != dVar.f29246 || this.f29244 != dVar.f29244 || this.f29243 != dVar.f29243 || this.f29242 != dVar.f29242 || this.f29239 != dVar.f29239 || this.f29241 != dVar.f29241 || this.f29238 != dVar.f29238) {
                    return false;
                }
                Class cls = this.f29248;
                if (cls == null ? dVar.f29248 != null : !cls.equals(dVar.f29248)) {
                    return false;
                }
                Class cls2 = this.f29251;
                if (cls2 == null ? dVar.f29251 != null : !cls2.equals(dVar.f29251)) {
                    return false;
                }
                Class cls3 = this.f29249;
                if (cls3 == null ? dVar.f29249 != null : !cls3.equals(dVar.f29249)) {
                    return false;
                }
                List<String> list = this.f29247;
                if (list == null ? dVar.f29247 != null : !list.equals(dVar.f29247)) {
                    return false;
                }
                Object obj2 = this.f29240;
                Object obj3 = dVar.f29240;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f29248;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f29251;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f29249;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f29247;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f29250) * 31) + this.f29245) * 31) + this.f29246) * 31) + this.f29244) * 31) + this.f29243) * 31) + this.f29242) * 31) + this.f29239) * 31) + this.f29241) * 31) + (this.f29238 ? 1 : 0)) * 31;
            Object obj = this.f29240;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hw$c */
    public static class c {

        /* JADX INFO: renamed from: ﾒ */
        private C12020hw f29237 = new C12020hw(0);

        /* JADX INFO: renamed from: ﻐ */
        public final c m30384(int i) {
            this.f29237.f29234.f29245 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final c m30394(int i) {
            this.f29237.f29234.f29246 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final c m30386(int i) {
            this.f29237.f29234.f29244 = i;
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        public final c m30389(int i) {
            this.f29237.f29234.f29243 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final c m30392(int i) {
            this.f29237.f29234.f29239 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ */
        public final c m30382(int i) {
            this.f29237.f29234.f29242 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﮐ */
        public final c m30381(int i) {
            this.f29237.f29234.f29241 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ */
        public final c m30383(boolean z) {
            this.f29237.f29234.f29238 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final c m30387(Object obj) {
            this.f29237.f29234.f29240 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        public final C12020hw m30391(InterfaceC12021hx interfaceC12021hx, List<String> list, int i) {
            return m30396(interfaceC12021hx, null, list, i);
        }

        /* JADX INFO: renamed from: ﾒ */
        public final C12020hw m30396(InterfaceC12021hx interfaceC12021hx, InterfaceC12011hn interfaceC12011hn, List<String> list, int i) {
            this.f29237.f29235 = interfaceC12021hx;
            this.f29237.f29236 = interfaceC12011hn;
            this.f29237.f29234.f29247 = list;
            this.f29237.f29234.f29250 = i;
            this.f29237.f29234.f29251 = interfaceC12021hx.getClass();
            this.f29237.f29234.f29249 = interfaceC12011hn != null ? interfaceC12011hn.getClass() : null;
            return this.f29237;
        }

        /* JADX INFO: renamed from: ｋ */
        public final c m30390(boolean z) {
            this.f29237.f29234.f29246 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final c m30395(boolean z) {
            this.f29237.f29234.f29243 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        public final c m30385(boolean z) {
            this.f29237.f29234.f29239 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final c m30388(boolean z) {
            this.f29237.f29234.f29242 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final c m30393(boolean z) {
            this.f29237.f29234.f29241 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }
}
