package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Za */
/* JADX INFO: loaded from: classes6.dex */
public final class C11785Za {

    /* JADX INFO: renamed from: a */
    private final C11440Fe f26695a;

    public C11785Za(C11440Fe response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f26695a = response;
    }

    /* JADX INFO: renamed from: a */
    public final C11768Ya m28074a() {
        C11609P3.a.c cVarM26832f;
        C11609P3.a.g gVarM26834h;
        C11609P3.a aVarM26821e = this.f26695a.m25800d().m26821e();
        return new C11768Ya((aVarM26821e == null || (gVarM26834h = aVarM26821e.m26834h()) == null) ? null : m28072a(gVarM26834h, this.f26695a.m25801e().m33819h()), (aVarM26821e == null || (cVarM26832f = aVarM26821e.m26832f()) == null) ? null : m28071a(cVarM26832f, this.f26695a.m25801e().m33817f()), null, this.f26695a.m25802f());
    }

    /* JADX INFO: renamed from: a */
    private final C12190f6 m28072a(C11609P3.a.g gVar, Map<String, ? extends List<String>> map) {
        C11609P3.c cVarM26823g = this.f26695a.m25800d().m26823g();
        C11609P3.c.a aVarM27008k = cVarM26823g != null ? cVarM26823g.m27008k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer numM26960A = gVar.m26960A();
        int iIntValue = numM26960A != null ? numM26960A.intValue() : 2;
        Integer numM26982s = gVar.m26982s();
        boolean z = true;
        if (numM26982s != null && numM26982s.intValue() != 1) {
            z = false;
        }
        boolean z2 = z;
        Long lM26985v = gVar.m26985v();
        long jLongValue = lM26985v != null ? lM26985v.longValue() : 3000L;
        List listEmptyList = CollectionsKt.emptyList();
        C12413p c12413pM28073a = m28073a(aVarM27008k, aVarM27008k != null ? aVarM27008k.m27019A() : null);
        Integer numM26981r = gVar.m26981r();
        int iIntValue2 = numM26981r != null ? numM26981r.intValue() : 60;
        Integer numM26987x = gVar.m26987x();
        return new C12190f6(map2, iIntValue, z2, jLongValue, listEmptyList, c12413pM28073a, iIntValue2, Integer.valueOf(numM26987x != null ? numM26987x.intValue() : -1));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX INFO: renamed from: a */
    private final C12190f6 m28071a(C11609P3.a.c cVar, Map<String, ? extends List<String>> map) {
        boolean z;
        C11609P3.c cVarM26823g = this.f26695a.m25800d().m26823g();
        C11609P3.c.a aVarM27008k = cVarM26823g != null ? cVarM26823g.m27008k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer numM26866A = cVar.m26866A();
        int iIntValue = numM26866A != null ? numM26866A.intValue() : 2;
        Integer numM26888s = cVar.m26888s();
        if (numM26888s != null) {
            z = numM26888s.intValue() == 1;
        }
        boolean z2 = z;
        Long lM26891v = cVar.m26891v();
        long jLongValue = lM26891v != null ? lM26891v.longValue() : 3000L;
        List listEmptyList = CollectionsKt.emptyList();
        C12413p c12413pM28073a = m28073a(aVarM27008k, aVarM27008k != null ? aVarM27008k.m27046y() : null);
        Integer numM26887r = cVar.m26887r();
        int iIntValue2 = numM26887r != null ? numM26887r.intValue() : 60;
        Integer numM26894y = cVar.m26894y();
        return new C12190f6(map2, iIntValue, z2, jLongValue, listEmptyList, c12413pM28073a, iIntValue2, Integer.valueOf(numM26894y != null ? numM26894y.intValue() : -1));
    }

    /* JADX INFO: renamed from: a */
    private final C12413p m28073a(C11609P3.c.a aVar, C11609P3.c.a.C15512a c15512a) {
        String strM27036o;
        String strM27040s;
        Boolean boolM27061l;
        Boolean boolM27020B;
        Integer numM27044w;
        Boolean boolM27043v;
        Boolean boolM27042u;
        Integer numM27037p;
        Long lM27038q;
        Integer numM27039r;
        String strM27045x;
        String str = "";
        if (aVar == null || (strM27036o = aVar.m27036o()) == null) {
            strM27036o = "";
        }
        if (aVar == null || (strM27040s = aVar.m27040s()) == null) {
            strM27040s = "";
        }
        if (aVar != null && (strM27045x = aVar.m27045x()) != null) {
            str = strM27045x;
        }
        int iIntValue = 2;
        int iIntValue2 = (aVar == null || (numM27039r = aVar.m27039r()) == null) ? 2 : numM27039r.intValue();
        long jLongValue = (aVar == null || (lM27038q = aVar.m27038q()) == null) ? 10000L : lM27038q.longValue();
        int iIntValue3 = (aVar == null || (numM27037p = aVar.m27037p()) == null) ? 15 : numM27037p.intValue();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (aVar == null || (boolM27042u = aVar.m27042u()) == null) ? false : boolM27042u.booleanValue();
        if (aVar != null && (boolM27043v = aVar.m27043v()) != null) {
            zBooleanValue = boolM27043v.booleanValue();
        }
        if (aVar != null && (numM27044w = aVar.m27044w()) != null) {
            iIntValue = numM27044w.intValue();
        }
        boolean zBooleanValue3 = true;
        boolean zBooleanValue4 = (aVar == null || (boolM27020B = aVar.m27020B()) == null) ? true : boolM27020B.booleanValue();
        if (c15512a != null && (boolM27061l = c15512a.m27061l()) != null) {
            zBooleanValue3 = boolM27061l.booleanValue();
        }
        return new C12413p(strM27036o, strM27040s, str, iIntValue2, jLongValue, iIntValue3, zBooleanValue2, zBooleanValue, iIntValue, zBooleanValue4, zBooleanValue3);
    }
}
