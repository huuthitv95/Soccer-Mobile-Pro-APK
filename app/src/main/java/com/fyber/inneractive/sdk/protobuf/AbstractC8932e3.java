package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.e3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8932e3 extends AbstractMap {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f21003h = 0;

    /* JADX INFO: renamed from: a */
    public final int f21004a;

    /* JADX INFO: renamed from: d */
    public boolean f21007d;

    /* JADX INFO: renamed from: e */
    public volatile C8926d3 f21008e;

    /* JADX INFO: renamed from: g */
    public volatile C9039x2 f21010g;

    /* JADX INFO: renamed from: b */
    public List f21005b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f21006c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: f */
    public Map f21009f = Collections.EMPTY_MAP;

    public AbstractC8932e3(int i) {
        this.f21004a = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m21534a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f21005b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((C8914b3) this.f21005b.get(i3)).f20986a);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C8914b3) this.f21005b.get(i4)).f20986a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((C8914b3) this.f21005b.get(i3)).f20986a);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m21535a(Comparable comparable, Object obj) {
        m21536a();
        int iM21534a = m21534a(comparable);
        if (iM21534a >= 0) {
            return ((C8914b3) this.f21005b.get(iM21534a)).setValue(obj);
        }
        m21536a();
        if (this.f21005b.isEmpty() && !(this.f21005b instanceof ArrayList)) {
            this.f21005b = new ArrayList(this.f21004a);
        }
        int i = -(iM21534a + 1);
        if (i >= this.f21004a) {
            return m21538c().put(comparable, obj);
        }
        int size = this.f21005b.size();
        int i2 = this.f21004a;
        if (size == i2) {
            C8914b3 c8914b3 = (C8914b3) this.f21005b.remove(i2 - 1);
            m21538c().put(c8914b3.f20986a, c8914b3.f20987b);
        }
        this.f21005b.add(i, new C8914b3(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m21536a() {
        if (this.f21007d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Iterable m21537b() {
        return this.f21006c.isEmpty() ? AbstractC8908a3.f20982b : this.f21006c.entrySet();
    }

    /* JADX INFO: renamed from: c */
    public final SortedMap m21538c() {
        m21536a();
        if (this.f21006c.isEmpty() && !(this.f21006c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21006c = treeMap;
            this.f21009f = treeMap.descendingMap();
        }
        return (SortedMap) this.f21006c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m21536a();
        if (!this.f21005b.isEmpty()) {
            this.f21005b.clear();
        }
        if (this.f21006c.isEmpty()) {
            return;
        }
        this.f21006c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m21534a(comparable) >= 0 || this.f21006c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f21008e == null) {
            this.f21008e = new C8926d3(this);
        }
        return this.f21008e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC8932e3)) {
            return super.equals(obj);
        }
        AbstractC8932e3 abstractC8932e3 = (AbstractC8932e3) obj;
        int size = size();
        if (size != abstractC8932e3.size()) {
            return false;
        }
        int size2 = this.f21005b.size();
        if (size2 != abstractC8932e3.f21005b.size()) {
            return entrySet().equals(abstractC8932e3.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!((Map.Entry) this.f21005b.get(i)).equals((Map.Entry) abstractC8932e3.f21005b.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f21006c.equals(abstractC8932e3.f21006c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM21534a = m21534a(comparable);
        return iM21534a >= 0 ? ((C8914b3) this.f21005b.get(iM21534a)).f20987b : this.f21006c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f21005b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C8914b3) this.f21005b.get(i)).hashCode();
        }
        return this.f21006c.size() > 0 ? this.f21006c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m21536a();
        Comparable comparable = (Comparable) obj;
        int iM21534a = m21534a(comparable);
        if (iM21534a < 0) {
            if (this.f21006c.isEmpty()) {
                return null;
            }
            return this.f21006c.remove(comparable);
        }
        m21536a();
        Object obj2 = ((C8914b3) this.f21005b.remove(iM21534a)).f20987b;
        if (!this.f21006c.isEmpty()) {
            Iterator it = m21538c().entrySet().iterator();
            this.f21005b.add(new C8914b3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21006c.size() + this.f21005b.size();
    }
}
