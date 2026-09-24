package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8958j extends AbstractC8916c implements InterfaceC8912b1, RandomAccess, InterfaceC8985n2 {

    /* JADX INFO: renamed from: d */
    public static final C8958j f21051d;

    /* JADX INFO: renamed from: b */
    public boolean[] f21052b;

    /* JADX INFO: renamed from: c */
    public int f21053c;

    static {
        C8958j c8958j = new C8958j(new boolean[0], 0);
        f21051d = c8958j;
        c8958j.f20989a = false;
    }

    public C8958j() {
        this.f21052b = new boolean[10];
        this.f21053c = 0;
    }

    public C8958j(boolean[] zArr, int i) {
        this.f21052b = zArr;
        this.f21053c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21656a(boolean z) {
        m21521c();
        int i = this.f21053c;
        boolean[] zArr = this.f21052b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f21052b = zArr2;
        }
        boolean[] zArr3 = this.f21052b;
        int i2 = this.f21053c;
        this.f21053c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21521c();
        if (i < 0 || i > (i2 = this.f21053c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21053c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        boolean[] zArr = this.f21052b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f21052b, i, zArr2, i + 1, this.f21053c - i);
            this.f21052b = zArr2;
        }
        this.f21052b[i] = zBooleanValue;
        this.f21053c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21656a(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21521c();
        Charset charset = AbstractC8972l1.f21064a;
        collection.getClass();
        if (!(collection instanceof C8958j)) {
            return super.addAll(collection);
        }
        C8958j c8958j = (C8958j) collection;
        int i = c8958j.f21053c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21053c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f21052b;
        if (i3 > zArr.length) {
            this.f21052b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c8958j.f21052b, 0, this.f21052b, this.f21053c, c8958j.f21053c);
        this.f21053c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C8958j mo21502b(int i) {
        if (i >= this.f21053c) {
            return new C8958j(Arrays.copyOf(this.f21052b, i), this.f21053c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8958j)) {
            return super.equals(obj);
        }
        C8958j c8958j = (C8958j) obj;
        if (this.f21053c != c8958j.f21053c) {
            return false;
        }
        boolean[] zArr = c8958j.f21052b;
        for (int i = 0; i < this.f21053c; i++) {
            if (this.f21052b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f21053c) {
            return Boolean.valueOf(this.f21052b[i]);
        }
        StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
        sbM21088a.append(this.f21053c);
        throw new IndexOutOfBoundsException(sbM21088a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21053c; i2++) {
            int i3 = i * 31;
            boolean z = this.f21052b[i2];
            Charset charset = AbstractC8972l1.f21064a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f21053c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21052b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m21521c();
        if (i < 0 || i >= (i2 = this.f21053c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21053c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        boolean[] zArr = this.f21052b;
        boolean z = zArr[i];
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f21053c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21521c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21052b;
        System.arraycopy(zArr, i2, zArr, i, this.f21053c - i2);
        this.f21053c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21521c();
        if (i < 0 || i >= this.f21053c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21053c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        boolean[] zArr = this.f21052b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21053c;
    }
}
