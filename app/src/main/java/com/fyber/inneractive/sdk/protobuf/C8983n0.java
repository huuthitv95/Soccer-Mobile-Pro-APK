package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.n0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8983n0 {

    /* JADX INFO: renamed from: d */
    public static final C8983n0 f21072d = new C8983n0(0);

    /* JADX INFO: renamed from: a */
    public final AbstractC8932e3 f21073a;

    /* JADX INFO: renamed from: b */
    public boolean f21074b;

    /* JADX INFO: renamed from: c */
    public boolean f21075c;

    public C8983n0() {
        int i = AbstractC8932e3.f21003h;
        this.f21073a = new C9029v2(16);
    }

    public C8983n0(int i) {
        int i2 = AbstractC8932e3.f21003h;
        this.f21073a = new C9029v2(0);
        m21685e();
        m21685e();
    }

    /* JADX INFO: renamed from: a */
    public static int m21672a(EnumC8963j4 enumC8963j4, Object obj) {
        int serializedSize;
        int iM21516c;
        switch (AbstractC8977m0.f21069b[enumC8963j4.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = AbstractC8911b0.f20983b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC8911b0.f20983b;
                return 4;
            case 3:
                return AbstractC8911b0.m21511a(((Long) obj).longValue());
            case 4:
                return AbstractC8911b0.m21511a(((Long) obj).longValue());
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= 0) {
                    return AbstractC8911b0.m21516c(iIntValue);
                }
                Logger logger3 = AbstractC8911b0.f20983b;
                return 10;
            case 6:
                ((Long) obj).getClass();
                Logger logger4 = AbstractC8911b0.f20983b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger5 = AbstractC8911b0.f20983b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger6 = AbstractC8911b0.f20983b;
                return 1;
            case 9:
                Logger logger7 = AbstractC8911b0.f20983b;
                return ((InterfaceC8925d2) obj).getSerializedSize();
            case 10:
                Logger logger8 = AbstractC8911b0.f20983b;
                serializedSize = ((InterfaceC8925d2) obj).getSerializedSize();
                iM21516c = AbstractC8911b0.m21516c(serializedSize);
                break;
            case 11:
                return obj instanceof AbstractC9011s ? AbstractC8911b0.m21512a((AbstractC9011s) obj) : AbstractC8911b0.m21513a((String) obj);
            case 12:
                if (obj instanceof AbstractC9011s) {
                    return AbstractC8911b0.m21512a((AbstractC9011s) obj);
                }
                Logger logger9 = AbstractC8911b0.f20983b;
                serializedSize = ((byte[]) obj).length;
                iM21516c = AbstractC8911b0.m21516c(serializedSize);
                break;
            case 13:
                return AbstractC8911b0.m21516c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = AbstractC8911b0.f20983b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = AbstractC8911b0.f20983b;
                return 8;
            case 16:
                return AbstractC8911b0.m21516c(AbstractC8911b0.m21517d(((Integer) obj).intValue()));
            case 17:
                return AbstractC8911b0.m21511a(AbstractC8911b0.m21515b(((Long) obj).longValue()));
            case 18:
                return obj instanceof InterfaceC8924d1 ? AbstractC8911b0.m21510a(((InterfaceC8924d1) obj).mo20330a()) : AbstractC8911b0.m21510a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM21516c + serializedSize;
    }

    /* JADX INFO: renamed from: a */
    public static int m21673a(Map.Entry entry) {
        C9032w0 c9032w0 = (C9032w0) entry.getKey();
        Object value = entry.getValue();
        if (c9032w0.f21151c.m21661a() != EnumC8969k4.MESSAGE || c9032w0.f21152d || c9032w0.f21153e) {
            return m21674b(c9032w0, value);
        }
        int i = ((C9032w0) entry.getKey()).f21150b;
        int iM21516c = AbstractC8911b0.m21516c(i) + AbstractC8911b0.m21514b(2) + (AbstractC8911b0.m21514b(1) * 2);
        int iM21514b = AbstractC8911b0.m21514b(3);
        int serializedSize = ((InterfaceC8925d2) value).getSerializedSize();
        return AbstractC8971l0.m21663a(serializedSize, serializedSize, iM21514b, iM21516c);
    }

    /* JADX INFO: renamed from: b */
    public static int m21674b(C9032w0 c9032w0, Object obj) {
        int iM21514b;
        int iM21672a;
        EnumC8963j4 enumC8963j4 = c9032w0.f21151c;
        int i = c9032w0.f21150b;
        if (c9032w0.f21152d) {
            int iM21672a2 = 0;
            if (!c9032w0.f21153e) {
                for (Object obj2 : (List) obj) {
                    int iM21514b2 = AbstractC8911b0.m21514b(i);
                    if (enumC8963j4 == EnumC8963j4.GROUP) {
                        iM21514b2 *= 2;
                    }
                    iM21672a2 += m21672a(enumC8963j4, obj2) + iM21514b2;
                }
                return iM21672a2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM21672a2 += m21672a(enumC8963j4, it.next());
            }
            iM21514b = AbstractC8911b0.m21514b(i) + iM21672a2;
            iM21672a = AbstractC8911b0.m21516c(iM21672a2);
        } else {
            iM21514b = AbstractC8911b0.m21514b(i);
            if (enumC8963j4 == EnumC8963j4.GROUP) {
                iM21514b *= 2;
            }
            iM21672a = m21672a(enumC8963j4, obj);
        }
        return iM21672a + iM21514b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21675b(Map.Entry entry) {
        C9032w0 c9032w0 = (C9032w0) entry.getKey();
        if (c9032w0.f21151c.m21661a() != EnumC8969k4.MESSAGE) {
            return true;
        }
        if (!c9032w0.f21152d) {
            Object value = entry.getValue();
            if (value instanceof InterfaceC8925d2) {
                return ((InterfaceC8925d2) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((InterfaceC8925d2) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX INFO: renamed from: d */
    public static void m21676d(C9032w0 c9032w0, Object obj) {
        boolean z;
        EnumC8963j4 enumC8963j4 = c9032w0.f21151c;
        Charset charset = AbstractC8972l1.f21064a;
        obj.getClass();
        switch (AbstractC8977m0.f21068a[enumC8963j4.m21661a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof AbstractC9011s) || (obj instanceof byte[])) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC8924d1)) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 9:
                z = obj instanceof InterfaceC8925d2;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c9032w0.f21150b), c9032w0.f21151c.m21661a(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m21677a() {
        int iM21673a = 0;
        for (int i = 0; i < this.f21073a.f21005b.size(); i++) {
            iM21673a += m21673a((Map.Entry) this.f21073a.f21005b.get(i));
        }
        Iterator it = this.f21073a.m21537b().iterator();
        while (it.hasNext()) {
            iM21673a += m21673a((Map.Entry) it.next());
        }
        return iM21673a;
    }

    /* JADX INFO: renamed from: a */
    public final void m21678a(C8983n0 c8983n0) {
        for (int i = 0; i < c8983n0.f21073a.f21005b.size(); i++) {
            m21682c((Map.Entry) c8983n0.f21073a.f21005b.get(i));
        }
        Iterator it = c8983n0.f21073a.m21537b().iterator();
        while (it.hasNext()) {
            m21682c((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21679a(C9032w0 c9032w0, Object obj) {
        List arrayList;
        if (!c9032w0.f21152d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m21676d(c9032w0, obj);
        Object obj2 = this.f21073a.get(c9032w0);
        if (obj2 == null) {
            arrayList = new ArrayList();
            this.f21073a.m21535a(c9032w0, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public final int m21680b() {
        int iM21674b = 0;
        for (int i = 0; i < this.f21073a.f21005b.size(); i++) {
            Map.Entry entry = (Map.Entry) this.f21073a.f21005b.get(i);
            iM21674b += m21674b((C9032w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f21073a.m21537b()) {
            iM21674b += m21674b((C9032w0) entry2.getKey(), entry2.getValue());
        }
        return iM21674b;
    }

    /* JADX INFO: renamed from: c */
    public final void m21681c(C9032w0 c9032w0, Object obj) {
        if (!c9032w0.f21152d) {
            m21676d(c9032w0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m21676d(c9032w0, it.next());
            }
            obj = arrayList;
        }
        this.f21073a.m21535a(c9032w0, obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m21682c(Map.Entry entry) {
        C9032w0 c9032w0 = (C9032w0) entry.getKey();
        Object value = entry.getValue();
        if (c9032w0.f21152d) {
            Object arrayList = this.f21073a.get(c9032w0);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            this.f21073a.m21535a(c9032w0, arrayList);
            return;
        }
        if (c9032w0.f21151c.m21661a() != EnumC8969k4.MESSAGE) {
            AbstractC8932e3 abstractC8932e3 = this.f21073a;
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            abstractC8932e3.m21535a(c9032w0, value);
            return;
        }
        Object obj2 = this.f21073a.get(c9032w0);
        if (obj2 != null) {
            AbstractC9017t0 abstractC9017t0 = (AbstractC9017t0) ((InterfaceC8925d2) obj2).toBuilder();
            abstractC9017t0.m21753c();
            AbstractC9017t0.m21748a(abstractC9017t0.f21118b, (AbstractC9047z0) ((InterfaceC8925d2) value));
            this.f21073a.m21535a(c9032w0, abstractC9017t0.m21751a());
            return;
        }
        AbstractC8932e3 abstractC8932e4 = this.f21073a;
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        abstractC8932e4.m21535a(c9032w0, value);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21683c() {
        for (int i = 0; i < this.f21073a.f21005b.size(); i++) {
            if (!m21675b((Map.Entry) this.f21073a.f21005b.get(i))) {
                return false;
            }
        }
        Iterator it = this.f21073a.m21537b().iterator();
        while (it.hasNext()) {
            if (!m21675b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final C8983n0 m43994clone() {
        C8983n0 c8983n0 = new C8983n0();
        for (int i = 0; i < this.f21073a.f21005b.size(); i++) {
            Map.Entry entry = (Map.Entry) this.f21073a.f21005b.get(i);
            c8983n0.m21681c((C9032w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f21073a.m21537b()) {
            c8983n0.m21681c((C9032w0) entry2.getKey(), entry2.getValue());
        }
        c8983n0.f21075c = this.f21075c;
        return c8983n0;
    }

    /* JADX INFO: renamed from: d */
    public final Iterator m21684d() {
        return this.f21075c ? new C8990o1(this.f21073a.entrySet().iterator()) : this.f21073a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: e */
    public final void m21685e() {
        if (this.f21074b) {
            return;
        }
        C9029v2 c9029v2 = (C9029v2) this.f21073a;
        if (!c9029v2.f21007d) {
            for (int i = 0; i < c9029v2.f21005b.size(); i++) {
                Map.Entry entry = (Map.Entry) c9029v2.f21005b.get(i);
                if (((C9032w0) entry.getKey()).f21152d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c9029v2.m21537b()) {
                if (((C9032w0) entry2.getKey()).f21152d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c9029v2.f21007d) {
            c9029v2.f21006c = c9029v2.f21006c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c9029v2.f21006c);
            c9029v2.f21009f = c9029v2.f21009f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c9029v2.f21009f);
            c9029v2.f21007d = true;
        }
        this.f21074b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8983n0) {
            return this.f21073a.equals(((C8983n0) obj).f21073a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21073a.hashCode();
    }
}
