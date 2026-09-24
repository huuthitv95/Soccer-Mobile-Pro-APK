package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.vast.C8227d;
import com.fyber.inneractive.sdk.flow.vast.C8230g;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8293b implements InterfaceC9091i {

    /* JADX INFO: renamed from: a */
    public String f18499a;

    /* JADX INFO: renamed from: b */
    public String f18500b;

    /* JADX INFO: renamed from: d */
    public final PriorityQueue f18502d;

    /* JADX INFO: renamed from: f */
    public C8306o f18504f;

    /* JADX INFO: renamed from: g */
    public final PriorityQueue f18505g;

    /* JADX INFO: renamed from: h */
    public final Comparator f18506h;

    /* JADX INFO: renamed from: o */
    public C8093k f18513o;

    /* JADX INFO: renamed from: p */
    public C8313v f18514p;

    /* JADX INFO: renamed from: e */
    public final ArrayList f18503e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f18507i = 0;

    /* JADX INFO: renamed from: j */
    public int f18508j = 0;

    /* JADX INFO: renamed from: k */
    public final ArrayList f18509k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f18510l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f18511m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public String f18512n = "";

    /* JADX INFO: renamed from: c */
    public final HashMap f18501c = new HashMap();

    public C8293b(C8230g c8230g, C8227d c8227d) {
        this.f18502d = new PriorityQueue(1, c8230g);
        this.f18506h = c8227d;
        this.f18505g = new PriorityQueue(1, c8227d);
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public final List mo20518a(EnumC8315x enumC8315x) {
        HashMap map;
        if (enumC8315x == null || (map = this.f18501c) == null) {
            return null;
        }
        return (List) map.get(enumC8315x);
    }

    /* JADX INFO: renamed from: a */
    public final void m20699a(EnumC8315x enumC8315x, String str) {
        List arrayList = (List) this.f18501c.get(enumC8315x);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f18501c.put(enumC8315x, arrayList);
        }
        arrayList.add(str);
    }
}
