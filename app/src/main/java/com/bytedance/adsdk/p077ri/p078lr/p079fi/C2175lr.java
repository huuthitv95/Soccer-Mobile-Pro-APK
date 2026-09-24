package com.bytedance.adsdk.p077ri.p078lr.p079fi;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2196ka;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.AbstractC2203bu;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2202aw;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2204co;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2205di;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2206fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2207ik;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2208ka;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2209lr;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2210mj;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2211nr;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2213ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2214sf;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.bgr;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.jbs;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.tan;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2175lr {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.lr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5409ri;

        static {
            int[] iArr = new int[EnumC2195ik.values().length];
            f5409ri = iArr;
            try {
                iArr[EnumC2195ik.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5409ri[EnumC2195ik.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5409ri[EnumC2195ik.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5409ri[EnumC2195ik.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5409ri[EnumC2195ik.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5409ri[EnumC2195ik.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5409ri[EnumC2195ik.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5409ri[EnumC2195ik.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5409ri[EnumC2195ik.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5409ri[EnumC2195ik.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5409ri[EnumC2195ik.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5409ri[EnumC2195ik.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5409ri[EnumC2195ik.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    private static void m7220ik(List<InterfaceC2200ri> list, String str, int i) {
        Iterator<InterfaceC2200ri> it = list.iterator();
        while (it.hasNext()) {
            if (EnumC2196ka.m7283ri(it.next().mo7292ri())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private static Deque<InterfaceC2200ri> m7221lr(List<InterfaceC2200ri> list, String str, int i) {
        LinkedList<InterfaceC2200ri> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (InterfaceC2200ri interfaceC2200ri : linkedList) {
                if (!linkedList2.isEmpty() && EnumC2195ik.m7279ri(((InterfaceC2200ri) linkedList2.peekLast()).mo7292ri()) && ((EnumC2195ik) ((InterfaceC2200ri) linkedList2.peekLast()).mo7292ri()).m7280lr() == i2) {
                    InterfaceC2200ri interfaceC2200ri2 = (InterfaceC2200ri) linkedList2.pollLast();
                    InterfaceC2200ri interfaceC2200ri3 = (InterfaceC2200ri) linkedList2.pollLast();
                    if (EnumC2195ik.m7279ri(interfaceC2200ri3.mo7292ri()) || EnumC2195ik.m7279ri(interfaceC2200ri.mo7292ri())) {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                    linkedList2.addLast(m7222ri(interfaceC2200ri3, interfaceC2200ri2, interfaceC2200ri));
                } else {
                    linkedList2.addLast(interfaceC2200ri);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: ri */
    private static InterfaceC2200ri m7222ri(InterfaceC2200ri interfaceC2200ri, InterfaceC2200ri interfaceC2200ri2, InterfaceC2200ri interfaceC2200ri3) {
        AbstractC2203bu c2214sf;
        switch (AnonymousClass1.f5409ri[((EnumC2195ik) interfaceC2200ri2.mo7292ri()).ordinal()]) {
            case 1:
                c2214sf = new C2214sf();
                break;
            case 2:
                c2214sf = new C2211nr();
                break;
            case 3:
                c2214sf = new C2213ri();
                break;
            case 4:
                c2214sf = new C2202aw();
                break;
            case 5:
                c2214sf = new C2204co();
                break;
            case 6:
                c2214sf = new C2208ka();
                break;
            case 7:
                c2214sf = new bgr();
                break;
            case 8:
                c2214sf = new C2205di();
                break;
            case 9:
                c2214sf = new jbs();
                break;
            case 10:
                c2214sf = new C2206fi();
                break;
            case 11:
                c2214sf = new C2210mj();
                break;
            case 12:
                c2214sf = new C2209lr();
                break;
            case 13:
                c2214sf = new C2207ik();
                break;
            default:
                throw new UnsupportedOperationException(interfaceC2200ri2.mo7292ri().toString());
        }
        c2214sf.m7295ri(interfaceC2200ri);
        c2214sf.m7294lr(interfaceC2200ri3);
        return c2214sf;
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2200ri m7223ri(List<InterfaceC2200ri> list, String str, int i) {
        m7220ik(list, str, i);
        Deque<InterfaceC2200ri> dequeM7224ri = m7224ri(m7221lr(list, str, i));
        if (dequeM7224ri.size() == 1) {
            return dequeM7224ri.getFirst();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ri */
    private static Deque<InterfaceC2200ri> m7224ri(Deque<InterfaceC2200ri> deque) {
        LinkedList linkedList = new LinkedList();
        for (InterfaceC2200ri interfaceC2200ri : deque) {
            if (linkedList.isEmpty() || ((InterfaceC2200ri) linkedList.peekLast()).mo7292ri() != EnumC2195ik.COLON) {
                linkedList.addLast(interfaceC2200ri);
            } else {
                linkedList.pollLast();
                InterfaceC2200ri interfaceC2200ri2 = (InterfaceC2200ri) linkedList.pollLast();
                if (((InterfaceC2200ri) linkedList.pollLast()).mo7292ri() != EnumC2195ik.QUESTION) {
                    throw new IllegalStateException();
                }
                InterfaceC2200ri interfaceC2200ri3 = (InterfaceC2200ri) linkedList.pollLast();
                tan tanVar = new tan();
                tanVar.mo7290ri(interfaceC2200ri3);
                tanVar.mo7289lr(interfaceC2200ri2);
                tanVar.mo7288ik(interfaceC2200ri);
                linkedList.addLast(tanVar);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m7225ri(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
