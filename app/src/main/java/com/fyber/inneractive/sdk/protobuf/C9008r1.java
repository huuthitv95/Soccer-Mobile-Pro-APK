package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.r1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9008r1 extends AbstractC9018t1 {

    /* JADX INFO: renamed from: c */
    public static final Class f21100c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: a */
    public static List m21708a(Object obj, long j, int i) {
        List listMo21502b;
        List list = (List) AbstractC9040x3.m21839e(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC9002q1) {
                listMo21502b = new C8996p1(i);
            } else {
                listMo21502b = ((list instanceof InterfaceC8985n2) && (list instanceof InterfaceC8966k1)) ? ((InterfaceC8966k1) list).mo21502b(i) : new ArrayList(i);
            }
            AbstractC9040x3.m21828a(j, obj, listMo21502b);
            return listMo21502b;
        }
        if (f21100c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            AbstractC9040x3.m21828a(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof C9010r3) {
            C8996p1 c8996p1 = new C8996p1(list.size() + i);
            c8996p1.addAll((C9010r3) list);
            AbstractC9040x3.m21828a(j, obj, c8996p1);
            return c8996p1;
        }
        if ((list instanceof InterfaceC8985n2) && (list instanceof InterfaceC8966k1)) {
            InterfaceC8966k1 interfaceC8966k1 = (InterfaceC8966k1) list;
            if (!((AbstractC8916c) interfaceC8966k1).f20989a) {
                InterfaceC8966k1 interfaceC8966k1Mo21502b = interfaceC8966k1.mo21502b(list.size() + i);
                AbstractC9040x3.m21828a(j, obj, interfaceC8966k1Mo21502b);
                return interfaceC8966k1Mo21502b;
            }
        }
        return list;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: a */
    public final void mo21709a(long j, Object obj, Object obj2) {
        List list = (List) AbstractC9040x3.m21839e(obj2, j);
        List listM21708a = m21708a(obj, j, list.size());
        int size = listM21708a.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM21708a.addAll(list);
        }
        if (size > 0) {
            list = listM21708a;
        }
        AbstractC9040x3.m21828a(j, obj, list);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: a */
    public final void mo21710a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) AbstractC9040x3.m21839e(obj, j);
        if (list instanceof InterfaceC9002q1) {
            objUnmodifiableList = ((InterfaceC9002q1) list).mo21694a();
        } else {
            if (f21100c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC8985n2) && (list instanceof InterfaceC8966k1)) {
                AbstractC8916c abstractC8916c = (AbstractC8916c) ((InterfaceC8966k1) list);
                if (abstractC8916c.f20989a) {
                    abstractC8916c.f20989a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC9040x3.m21828a(j, obj, objUnmodifiableList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: b */
    public final List mo21711b(Object obj, long j) {
        return m21708a(obj, j, 10);
    }
}
