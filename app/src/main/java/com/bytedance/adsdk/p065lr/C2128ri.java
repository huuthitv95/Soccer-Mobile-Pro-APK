package com.bytedance.adsdk.p065lr;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public final class C2128ri<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: di */
    private static int f5170di;

    /* JADX INFO: renamed from: fi */
    private static Object[] f5171fi;

    /* JADX INFO: renamed from: ik */
    private static final int[] f5172ik = new int[0];

    /* JADX INFO: renamed from: ka */
    private static final Object[] f5173ka = new Object[0];

    /* JADX INFO: renamed from: mj */
    private static int f5174mj;
    private static Object[] xha;
    private int[] jbs;

    /* JADX INFO: renamed from: lr */
    int f5175lr;

    /* JADX INFO: renamed from: qt */
    private AbstractC2161vr<E, E> f5176qt;

    /* JADX INFO: renamed from: ri */
    Object[] f5177ri;

    public C2128ri() {
        this(0);
    }

    public C2128ri(int i) {
        if (i == 0) {
            this.jbs = f5172ik;
            this.f5177ri = f5173ka;
        } else {
            m7067ka(i);
        }
        this.f5175lr = 0;
    }

    /* JADX INFO: renamed from: ka */
    private void m7067ka(int i) {
        if (i == 8) {
            synchronized (C2128ri.class) {
                Object[] objArr = xha;
                if (objArr != null) {
                    this.f5177ri = objArr;
                    xha = (Object[]) objArr[0];
                    this.jbs = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5174mj--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2128ri.class) {
                Object[] objArr2 = f5171fi;
                if (objArr2 != null) {
                    this.f5177ri = objArr2;
                    f5171fi = (Object[]) objArr2[0];
                    this.jbs = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5170di--;
                    return;
                }
            }
        }
        this.jbs = new int[i];
        this.f5177ri = new Object[i];
    }

    /* JADX INFO: renamed from: lr */
    private AbstractC2161vr<E, E> m7068lr() {
        if (this.f5176qt == null) {
            this.f5176qt = new AbstractC2161vr<E, E>() { // from class: com.bytedance.adsdk.lr.ri.1
                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: ik */
                protected void mo7076ik() {
                    C2128ri.this.clear();
                }

                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: lr */
                protected Map<E, E> mo7077lr() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: ri */
                protected int mo7078ri() {
                    return C2128ri.this.f5175lr;
                }

                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: ri */
                protected int mo7079ri(Object obj) {
                    return C2128ri.this.m7074ri(obj);
                }

                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: ri */
                protected Object mo7080ri(int i, int i2) {
                    return C2128ri.this.f5177ri[i];
                }

                @Override // com.bytedance.adsdk.p065lr.AbstractC2161vr
                /* JADX INFO: renamed from: ri */
                protected void mo7081ri(int i) {
                    C2128ri.this.m7072ik(i);
                }
            };
        }
        return this.f5176qt;
    }

    /* JADX INFO: renamed from: ri */
    private int m7069ri() {
        int i = this.f5175lr;
        if (i == 0) {
            return -1;
        }
        int iM7013ri = C2122lr.m7013ri(this.jbs, i, 0);
        if (iM7013ri < 0 || this.f5177ri[iM7013ri] == null) {
            return iM7013ri;
        }
        int i2 = iM7013ri + 1;
        while (i2 < i && this.jbs[i2] == 0) {
            if (this.f5177ri[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM7013ri - 1; i3 >= 0 && this.jbs[i3] == 0; i3--) {
            if (this.f5177ri[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ri */
    private int m7070ri(Object obj, int i) {
        int i2 = this.f5175lr;
        if (i2 == 0) {
            return -1;
        }
        int iM7013ri = C2122lr.m7013ri(this.jbs, i2, i);
        if (iM7013ri < 0 || obj.equals(this.f5177ri[iM7013ri])) {
            return iM7013ri;
        }
        int i3 = iM7013ri + 1;
        while (i3 < i2 && this.jbs[i3] == i) {
            if (obj.equals(this.f5177ri[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM7013ri - 1; i4 >= 0 && this.jbs[i4] == i; i4--) {
            if (obj.equals(this.f5177ri[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ri */
    private static void m7071ri(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2128ri.class) {
                if (f5174mj < 10) {
                    objArr[0] = xha;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    xha = objArr;
                    f5174mj++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2128ri.class) {
                if (f5170di < 10) {
                    objArr[0] = f5171fi;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5171fi = objArr;
                    f5170di++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iM7070ri;
        if (e == null) {
            iM7070ri = m7069ri();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM7070ri = m7070ri(e, iHashCode);
        }
        if (iM7070ri >= 0) {
            return false;
        }
        int i2 = ~iM7070ri;
        int i3 = this.f5175lr;
        int[] iArr = this.jbs;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f5177ri;
            m7067ka(i4);
            int[] iArr2 = this.jbs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5177ri, 0, objArr.length);
            }
            m7071ri(iArr, objArr, this.f5175lr);
        }
        int i5 = this.f5175lr;
        if (i2 < i5) {
            int[] iArr3 = this.jbs;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f5177ri;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f5175lr - i2);
        }
        this.jbs[i2] = i;
        this.f5177ri[i2] = e;
        this.f5175lr++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m7075ri(this.f5175lr + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f5175lr;
        if (i != 0) {
            m7071ri(this.jbs, this.f5177ri, i);
            this.jbs = f5172ik;
            this.f5177ri = f5173ka;
            this.f5175lr = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m7074ri(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f5175lr; i++) {
                try {
                    if (!set.contains(m7073lr(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.jbs;
        int i = this.f5175lr;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: ik */
    public E m7072ik(int i) {
        Object[] objArr = this.f5177ri;
        E e = (E) objArr[i];
        int i2 = this.f5175lr;
        if (i2 <= 1) {
            m7071ri(this.jbs, objArr, i2);
            this.jbs = f5172ik;
            this.f5177ri = f5173ka;
            this.f5175lr = 0;
            return e;
        }
        int[] iArr = this.jbs;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f5175lr = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f5177ri;
                System.arraycopy(objArr2, i4, objArr2, i, this.f5175lr - i);
            }
            this.f5177ri[this.f5175lr] = null;
            return e;
        }
        m7067ka(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f5175lr--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.jbs, 0, i);
            System.arraycopy(objArr, 0, this.f5177ri, 0, i);
        }
        int i5 = this.f5175lr;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.jbs, i, i5 - i);
            System.arraycopy(objArr, i6, this.f5177ri, i, this.f5175lr - i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5175lr <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m7068lr().m7177ka().iterator();
    }

    /* JADX INFO: renamed from: lr */
    public E m7073lr(int i) {
        return (E) this.f5177ri[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iM7074ri = m7074ri(obj);
        if (iM7074ri < 0) {
            return false;
        }
        m7072ik(iM7074ri);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f5175lr - 1; i >= 0; i--) {
            if (!collection.contains(this.f5177ri[i])) {
                m7072ik(i);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ri */
    public int m7074ri(Object obj) {
        return obj == null ? m7069ri() : m7070ri(obj, obj.hashCode());
    }

    /* JADX INFO: renamed from: ri */
    public void m7075ri(int i) {
        int[] iArr = this.jbs;
        if (iArr.length < i) {
            Object[] objArr = this.f5177ri;
            m7067ka(i);
            int i2 = this.f5175lr;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.jbs, 0, i2);
                System.arraycopy(objArr, 0, this.f5177ri, 0, this.f5175lr);
            }
            m7071ri(iArr, objArr, this.f5175lr);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f5175lr;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f5175lr;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5177ri, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f5175lr) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5175lr));
        }
        System.arraycopy(this.f5177ri, 0, tArr, 0, this.f5175lr);
        int length = tArr.length;
        int i = this.f5175lr;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f5175lr * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.f5175lr; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eM7073lr = m7073lr(i);
            if (eM7073lr != this) {
                sb.append(eM7073lr);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
