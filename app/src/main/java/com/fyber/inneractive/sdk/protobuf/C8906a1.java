package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.a1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8906a1 extends AbstractC8916c implements InterfaceC8942g1, RandomAccess, InterfaceC8985n2 {

    /* JADX INFO: renamed from: d */
    public static final C8906a1 f20976d;

    /* JADX INFO: renamed from: b */
    public int[] f20977b;

    /* JADX INFO: renamed from: c */
    public int f20978c;

    static {
        C8906a1 c8906a1 = new C8906a1(new int[0], 0);
        f20976d = c8906a1;
        c8906a1.f20989a = false;
    }

    public C8906a1() {
        this.f20977b = new int[10];
        this.f20978c = 0;
    }

    public C8906a1(int[] iArr, int i) {
        this.f20977b = iArr;
        this.f20978c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m21521c();
        if (i < 0 || i > (i2 = this.f20978c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f20978c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        int[] iArr = this.f20977b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f20977b, i, iArr2, i + 1, this.f20978c - i);
            this.f20977b = iArr2;
        }
        this.f20977b[i] = iIntValue;
        this.f20978c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21503c(((Integer) obj).intValue());
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21521c();
        Charset charset = AbstractC8972l1.f21064a;
        collection.getClass();
        if (!(collection instanceof C8906a1)) {
            return super.addAll(collection);
        }
        C8906a1 c8906a1 = (C8906a1) collection;
        int i = c8906a1.f20978c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20978c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f20977b;
        if (i3 > iArr.length) {
            this.f20977b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c8906a1.f20977b, 0, this.f20977b, this.f20978c, c8906a1.f20978c);
        this.f20978c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m21503c(int i) {
        m21521c();
        int i2 = this.f20978c;
        int[] iArr = this.f20977b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f20977b = iArr2;
        }
        int[] iArr3 = this.f20977b;
        int i3 = this.f20978c;
        this.f20978c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m21504d(int i) {
        if (i < 0 || i >= this.f20978c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f20978c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C8906a1 mo21502b(int i) {
        if (i >= this.f20978c) {
            return new C8906a1(Arrays.copyOf(this.f20977b, i), this.f20978c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8906a1)) {
            return super.equals(obj);
        }
        C8906a1 c8906a1 = (C8906a1) obj;
        if (this.f20978c != c8906a1.f20978c) {
            return false;
        }
        int[] iArr = c8906a1.f20977b;
        for (int i = 0; i < this.f20978c; i++) {
            if (this.f20977b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m21504d(i);
        return Integer.valueOf(this.f20977b[i]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20978c; i2++) {
            i = (i * 31) + this.f20977b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f20978c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20977b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21521c();
        m21504d(i);
        int[] iArr = this.f20977b;
        int i2 = iArr[i];
        int i3 = this.f20978c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f20978c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21521c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f20977b;
        System.arraycopy(iArr, i2, iArr, i, this.f20978c - i2);
        this.f20978c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m21521c();
        m21504d(i);
        int[] iArr = this.f20977b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20978c;
    }
}
