package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.j0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8959j0 {
    /* JADX INFO: renamed from: a */
    public static Object m21658a(InterfaceC9014s2 interfaceC9014s2, C9037x0 c9037x0, C8947h0 c8947h0, C8983n0 c8983n0, Object obj, C8992o3 c8992o3) {
        Object objValueOf;
        ArrayList arrayList;
        C9032w0 c9032w0 = c9037x0.f21166d;
        int i = c9032w0.f21150b;
        if (c9032w0.f21152d && c9032w0.f21153e) {
            switch (AbstractC8953i0.f21029a[c9032w0.f21151c.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21594j(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21581d(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21596k(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21565a(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21604o(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21602n(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21584e(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21598l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21591i(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21586f(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21600m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21577c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21588g(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC9014s2.mo21606p(arrayList);
                    obj = AbstractC9024u2.m21782a(i, arrayList, c9037x0.f21166d.f21149a, obj, c8992o3);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c9037x0.f21166d.f21151c);
            }
            c8983n0.m21681c(c9037x0.f21166d, arrayList);
            return obj;
        }
        EnumC8963j4 enumC8963j4 = c9032w0.f21151c;
        if (enumC8963j4 != EnumC8963j4.ENUM) {
            switch (AbstractC8953i0.f21029a[enumC8963j4.ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC9014s2.mo21589h());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC9014s2.mo21595k());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC9014s2.mo21603o());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC9014s2.mo21585f());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC9014s2.mo21578d());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC9014s2.mo21587g());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC9014s2.mo21607q());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC9014s2.mo21609r());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC9014s2.mo21574c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC9014s2.mo21599m());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC9014s2.mo21611t());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC9014s2.mo21593j());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC9014s2.mo21597l());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC9014s2.mo21560a();
                    break;
                case 16:
                    objValueOf = interfaceC9014s2.mo21601n();
                    break;
                case 17:
                    objValueOf = interfaceC9014s2.mo21562a(c9037x0.f21165c.getClass(), c8947h0);
                    break;
                case 18:
                    objValueOf = interfaceC9014s2.mo21570b(c9037x0.f21165c.getClass(), c8947h0);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iMo21578d = interfaceC9014s2.mo21578d();
            if (c9037x0.f21166d.f21149a.mo20329a(iMo21578d) == null) {
                return AbstractC9024u2.m21781a(i, iMo21578d, obj, c8992o3);
            }
            objValueOf = Integer.valueOf(iMo21578d);
        }
        C9032w0 c9032w1 = c9037x0.f21166d;
        if (c9032w1.f21152d) {
            c8983n0.m21679a(c9032w1, objValueOf);
            return obj;
        }
        int i2 = AbstractC8953i0.f21029a[c9032w1.f21151c.ordinal()];
        if (i2 == 17 || i2 == 18) {
            Object obj2 = c8983n0.f21073a.get(c9037x0.f21166d);
            if (obj2 != null) {
                objValueOf = AbstractC8972l1.m21664a(obj2, objValueOf);
            }
        }
        c8983n0.m21681c(c9037x0.f21166d, objValueOf);
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m21659a(C8917c0 c8917c0, Map.Entry entry) {
        C9032w0 c9032w0 = (C9032w0) entry.getKey();
        if (c9032w0.f21152d) {
            switch (AbstractC8953i0.f21029a[c9032w0.f21151c.ordinal()]) {
                case 1:
                    AbstractC9024u2.m21792b(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 2:
                    AbstractC9024u2.m21801f(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 3:
                    AbstractC9024u2.m21804h(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 4:
                    AbstractC9024u2.m21810n(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 5:
                    AbstractC9024u2.m21803g(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 6:
                    AbstractC9024u2.m21799e(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 7:
                    AbstractC9024u2.m21797d(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 8:
                    AbstractC9024u2.m21786a(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 9:
                    AbstractC9024u2.m21809m(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 10:
                    AbstractC9024u2.m21805i(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 11:
                    AbstractC9024u2.m21806j(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 12:
                    AbstractC9024u2.m21807k(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 13:
                    AbstractC9024u2.m21808l(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 14:
                    AbstractC9024u2.m21803g(c9032w0.f21150b, (List) entry.getValue(), c8917c0, c9032w0.f21153e);
                    break;
                case 15:
                    AbstractC9024u2.m21784a(c9032w0.f21150b, (List) entry.getValue(), c8917c0);
                    break;
                case 16:
                    AbstractC9024u2.m21790b(c9032w0.f21150b, (List) entry.getValue(), c8917c0);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC9024u2.m21785a(c9032w0.f21150b, (List) entry.getValue(), c8917c0, C8997p2.f21087c.m21698a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC9024u2.m21791b(c9032w0.f21150b, (List) entry.getValue(), c8917c0, C8997p2.f21087c.m21698a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AbstractC8953i0.f21029a[c9032w0.f21151c.ordinal()]) {
            case 1:
                c8917c0.m21522a(c9032w0.f21150b, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                c8917c0.m21523a(c9032w0.f21150b, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                c8917c0.f20990a.mo21484b(c9032w0.f21150b, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                c8917c0.f20990a.mo21484b(c9032w0.f21150b, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                c8917c0.f20990a.mo21483b(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                c8917c0.f20990a.mo21475a(c9032w0.f21150b, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                c8917c0.f20990a.mo21474a(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                c8917c0.f20990a.mo21479a(c9032w0.f21150b, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                c8917c0.f20990a.mo21491d(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                c8917c0.f20990a.mo21474a(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                c8917c0.f20990a.mo21475a(c9032w0.f21150b, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                c8917c0.m21524a(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                c8917c0.m21525a(c9032w0.f21150b, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                c8917c0.f20990a.mo21483b(c9032w0.f21150b, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                c8917c0.f20990a.mo21478a(c9032w0.f21150b, (AbstractC9011s) entry.getValue());
                break;
            case 16:
                int i = c9032w0.f21150b;
                c8917c0.f20990a.mo21481a((String) entry.getValue(), i);
                break;
            case 17:
                c8917c0.m21526a(c9032w0.f21150b, entry.getValue(), C8997p2.f21087c.m21698a(entry.getValue().getClass()));
                break;
            case 18:
                int i2 = c9032w0.f21150b;
                Object value = entry.getValue();
                c8917c0.f20990a.mo21477a(i2, (InterfaceC8925d2) value, C8997p2.f21087c.m21698a(entry.getValue().getClass()));
                break;
        }
    }
}
