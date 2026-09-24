package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.dh */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10037dh {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22257a = new C10116o("ExtractorTaskFinder");

    /* JADX INFO: renamed from: b */
    private final C10034de f22258b;

    /* JADX INFO: renamed from: c */
    private final C9983bh f22259c;

    /* JADX INFO: renamed from: d */
    private final C9996bu f22260d;

    C10037dh(C10034de c10034de, C9983bh c9983bh, C9996bu c9996bu) {
        this.f22258b = c10034de;
        this.f22259c = c9983bh;
        this.f22260d = c9996bu;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m22650b(C10031db c10031db, C10032dc c10032dc) {
        C10030da c10030da = c10031db.f22237c;
        String str = c10030da.f22229a;
        long j = c10030da.f22230b;
        return new C10069em(this.f22259c, str, c10031db.f22236b, j, c10032dc.f22238a).m22693m();
    }

    /* JADX INFO: renamed from: c */
    private static boolean m22651c(C10032dc c10032dc) {
        int i = c10032dc.f22243f;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x03ee A[PHI: r12
  0x03ee: PHI (r12v2 com.google.android.play.core.assetpacks.dg) = (r12v1 com.google.android.play.core.assetpacks.dg), (r12v4 com.google.android.play.core.assetpacks.dg) binds: [B:21:0x00a2, B:33:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    final C10036dg m22652a() {
        int i;
        C10036dg c10052dw;
        C10036dg c10036dg;
        int i2;
        C10036dg c10007ce;
        char c;
        C10061ee c10061ee;
        int iM22681a;
        try {
            this.f22258b.m22643j();
            ArrayList arrayList = new ArrayList();
            for (C10031db c10031db : this.f22258b.m22640g().values()) {
                if (C9982bg.m22537b(c10031db.f22237c.f22232d)) {
                    arrayList.add(c10031db);
                }
            }
            if (arrayList.isEmpty()) {
                c10036dg = null;
            } else {
                Map mapM22576t = this.f22259c.m22576t();
                Iterator it = arrayList.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        c10052dw = null;
                        break;
                    }
                    C10031db c10031db2 = (C10031db) it.next();
                    Long l = (Long) mapM22576t.get(c10031db2.f22237c.f22229a);
                    if (l != null && c10031db2.f22237c.f22230b == l.longValue()) {
                        f22257a.m22749a("Found promote pack task for session %s with pack %s.", Integer.valueOf(c10031db2.f22235a), c10031db2.f22237c.f22229a);
                        int i3 = c10031db2.f22235a;
                        String str = c10031db2.f22237c.f22229a;
                        c10052dw = new C10064eh(i3, str, this.f22259c.m22557a(str), c10031db2.f22236b, c10031db2.f22237c.f22230b);
                        break;
                    }
                }
                if (c10052dw == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c10052dw = null;
                            break;
                        }
                        C10031db c10031db3 = (C10031db) it2.next();
                        try {
                            C9983bh c9983bh = this.f22259c;
                            C10030da c10030da = c10031db3.f22237c;
                            if (c9983bh.m22558b(c10030da.f22229a, c10031db3.f22236b, c10030da.f22230b) == c10031db3.f22237c.f22234f.size()) {
                                f22257a.m22749a("Found final move task for session %s with pack %s.", Integer.valueOf(c10031db3.f22235a), c10031db3.f22237c.f22229a);
                                int i4 = c10031db3.f22235a;
                                C10030da c10030da2 = c10031db3.f22237c;
                                c10052dw = new C10052dw(i4, c10030da2.f22229a, c10031db3.f22236b, c10030da2.f22230b, c10030da2.f22231c);
                                break;
                            }
                        } catch (IOException e) {
                            throw new C10013ck(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(c10031db3.f22235a), c10031db3.f22237c.f22229a), e, c10031db3.f22235a);
                        }
                    }
                    if (c10052dw == null) {
                        Iterator it3 = arrayList.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                i2 = i;
                                c10007ce = null;
                                break;
                            }
                            C10031db c10031db4 = (C10031db) it3.next();
                            C10030da c10030da3 = c10031db4.f22237c;
                            if (C9982bg.m22537b(c10030da3.f22232d)) {
                                Iterator it4 = c10030da3.f22234f.iterator();
                                while (it4.hasNext()) {
                                    C10032dc c10032dc = (C10032dc) it4.next();
                                    C9983bh c9983bh2 = this.f22259c;
                                    C10030da c10030da4 = c10031db4.f22237c;
                                    i2 = i;
                                    Iterator it5 = it4;
                                    if (c9983bh2.m22573q(c10030da4.f22229a, c10031db4.f22236b, c10030da4.f22230b, c10032dc.f22238a).exists()) {
                                        C10116o c10116o = f22257a;
                                        Integer numValueOf = Integer.valueOf(c10031db4.f22235a);
                                        String str2 = c10031db4.f22237c.f22229a;
                                        String str3 = c10032dc.f22238a;
                                        Object[] objArr = new Object[3];
                                        objArr[i2] = numValueOf;
                                        objArr[1] = str2;
                                        objArr[2] = str3;
                                        c10116o.m22749a("Found merge task for session %s with pack %s and slice %s.", objArr);
                                        int i5 = c10031db4.f22235a;
                                        C10030da c10030da5 = c10031db4.f22237c;
                                        c10007ce = new C10049dt(i5, c10030da5.f22229a, c10031db4.f22236b, c10030da5.f22230b, c10032dc.f22238a);
                                        break loop3;
                                    }
                                    i = i2;
                                    it4 = it5;
                                }
                            }
                        }
                        if (c10007ce == null) {
                            Iterator it6 = arrayList.iterator();
                            loop5: while (true) {
                                if (!it6.hasNext()) {
                                    c10007ce = null;
                                    break;
                                }
                                C10031db c10031db5 = (C10031db) it6.next();
                                C10030da c10030da6 = c10031db5.f22237c;
                                if (C9982bg.m22537b(c10030da6.f22232d)) {
                                    for (C10032dc c10032dc2 : c10030da6.f22234f) {
                                        if (m22650b(c10031db5, c10032dc2)) {
                                            C9983bh c9983bh3 = this.f22259c;
                                            C10030da c10030da7 = c10031db5.f22237c;
                                            if (c9983bh3.m22572p(c10030da7.f22229a, c10031db5.f22236b, c10030da7.f22230b, c10032dc2.f22238a).exists()) {
                                                C10116o c10116o2 = f22257a;
                                                Integer numValueOf2 = Integer.valueOf(c10031db5.f22235a);
                                                String str4 = c10031db5.f22237c.f22229a;
                                                String str5 = c10032dc2.f22238a;
                                                Object[] objArr2 = new Object[3];
                                                objArr2[i2] = numValueOf2;
                                                objArr2[1] = str4;
                                                objArr2[2] = str5;
                                                c10116o2.m22749a("Found verify task for session %s with pack %s and slice %s.", objArr2);
                                                int i6 = c10031db5.f22235a;
                                                C10030da c10030da8 = c10031db5.f22237c;
                                                c10007ce = new C10072ep(i6, c10030da8.f22229a, c10031db5.f22236b, c10030da8.f22230b, c10032dc2.f22238a, c10032dc2.f22239b, c10032dc2.f22240c);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (c10007ce == null) {
                                Iterator it7 = arrayList.iterator();
                                loop7: while (true) {
                                    if (!it7.hasNext()) {
                                        c = 3;
                                        c10007ce = null;
                                        break;
                                    }
                                    C10031db c10031db6 = (C10031db) it7.next();
                                    C10030da c10030da9 = c10031db6.f22237c;
                                    if (C9982bg.m22537b(c10030da9.f22232d)) {
                                        for (C10032dc c10032dc3 : c10030da9.f22234f) {
                                            if (!m22651c(c10032dc3)) {
                                                C9983bh c9983bh4 = this.f22259c;
                                                C10030da c10030da10 = c10031db6.f22237c;
                                                Iterator it8 = it7;
                                                try {
                                                    iM22681a = new C10069em(c9983bh4, c10030da10.f22229a, c10031db6.f22236b, c10030da10.f22230b, c10032dc3.f22238a).m22681a();
                                                } catch (IOException e2) {
                                                    C10116o c10116o3 = f22257a;
                                                    Object[] objArr3 = new Object[1];
                                                    objArr3[i2] = e2;
                                                    c10116o3.m22750b("Slice checkpoint corrupt, restarting extraction. %s", objArr3);
                                                    iM22681a = i2;
                                                }
                                                if (iM22681a != -1 && ((C10028cz) c10032dc3.f22241d.get(iM22681a)).f22227a) {
                                                    C10116o c10116o4 = f22257a;
                                                    Integer numValueOf3 = Integer.valueOf(c10032dc3.f22242e);
                                                    Integer numValueOf4 = Integer.valueOf(c10031db6.f22235a);
                                                    String str6 = c10031db6.f22237c.f22229a;
                                                    String str7 = c10032dc3.f22238a;
                                                    Integer numValueOf5 = Integer.valueOf(iM22681a);
                                                    c = 3;
                                                    Object[] objArr4 = new Object[5];
                                                    objArr4[i2] = numValueOf3;
                                                    objArr4[1] = numValueOf4;
                                                    objArr4[2] = str6;
                                                    objArr4[3] = str7;
                                                    objArr4[4] = numValueOf5;
                                                    c10116o4.m22749a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", objArr4);
                                                    InputStream inputStreamM22602a = this.f22260d.m22602a(c10031db6.f22235a, c10031db6.f22237c.f22229a, c10032dc3.f22238a, iM22681a);
                                                    int i7 = c10031db6.f22235a;
                                                    C10030da c10030da11 = c10031db6.f22237c;
                                                    String str8 = c10030da11.f22229a;
                                                    int i8 = c10031db6.f22236b;
                                                    long j = c10030da11.f22230b;
                                                    String str9 = c10030da11.f22231c;
                                                    String str10 = c10032dc3.f22238a;
                                                    int i9 = c10032dc3.f22242e;
                                                    int size = c10032dc3.f22241d.size();
                                                    C10030da c10030da12 = c10031db6.f22237c;
                                                    c10007ce = new C10007ce(i7, str8, i8, j, str9, str10, i9, iM22681a, size, c10030da12.f22233e, c10030da12.f22232d, inputStreamM22602a);
                                                    break loop7;
                                                }
                                                it7 = it8;
                                            }
                                        }
                                    }
                                }
                                if (c10007ce == null) {
                                    Iterator it9 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it9.hasNext()) {
                                            c10061ee = null;
                                            break;
                                        }
                                        C10031db c10031db7 = (C10031db) it9.next();
                                        C10030da c10030da13 = c10031db7.f22237c;
                                        if (C9982bg.m22537b(c10030da13.f22232d)) {
                                            for (C10032dc c10032dc4 : c10030da13.f22234f) {
                                                if (m22651c(c10032dc4)) {
                                                    if (((C10028cz) c10032dc4.f22241d.get(i2)).f22227a && !m22650b(c10031db7, c10032dc4)) {
                                                        C10116o c10116o5 = f22257a;
                                                        Integer numValueOf6 = Integer.valueOf(c10032dc4.f22243f);
                                                        Integer numValueOf7 = Integer.valueOf(c10031db7.f22235a);
                                                        String str11 = c10031db7.f22237c.f22229a;
                                                        String str12 = c10032dc4.f22238a;
                                                        Object[] objArr5 = new Object[4];
                                                        objArr5[0] = numValueOf6;
                                                        objArr5[1] = numValueOf7;
                                                        objArr5[2] = str11;
                                                        objArr5[c] = str12;
                                                        c10116o5.m22749a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", objArr5);
                                                        InputStream inputStreamM22602a2 = this.f22260d.m22602a(c10031db7.f22235a, c10031db7.f22237c.f22229a, c10032dc4.f22238a, 0);
                                                        int i10 = c10031db7.f22235a;
                                                        String str13 = c10031db7.f22237c.f22229a;
                                                        c10061ee = new C10061ee(i10, str13, this.f22259c.m22557a(str13), this.f22259c.m22559c(c10031db7.f22237c.f22229a), c10031db7.f22236b, c10031db7.f22237c.f22230b, c10032dc4.f22243f, c10032dc4.f22238a, c10032dc4.f22240c, inputStreamM22602a2);
                                                        break loop9;
                                                    }
                                                    i2 = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (c10061ee != null) {
                                        this.f22258b.m22645l();
                                        return c10061ee;
                                    }
                                    c10036dg = null;
                                }
                            }
                        }
                        c10036dg = c10007ce;
                    } else {
                        c10036dg = c10052dw;
                    }
                } else {
                    c10036dg = c10052dw;
                }
            }
            this.f22258b.m22645l();
            return c10036dg;
        } catch (Throwable th) {
            this.f22258b.m22645l();
            throw th;
        }
    }
}
