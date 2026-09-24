package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.u1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9023u1 extends AbstractC8916c implements InterfaceC8960j1, RandomAccess, InterfaceC8985n2 {

    /* JADX INFO: renamed from: d */
    public static final C9023u1 f21130d;

    /* JADX INFO: renamed from: b */
    public long[] f21131b;

    /* JADX INFO: renamed from: c */
    public int f21132c;

    static {
        C9023u1 c9023u1 = new C9023u1(new long[0], 0);
        f21130d = c9023u1;
        c9023u1.f20989a = false;
    }

    public C9023u1() {
        this.f21131b = new long[10];
        this.f21132c = 0;
    }

    public C9023u1(long[] jArr, int i) {
        this.f21131b = jArr;
        this.f21132c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21775a(long j) {
        m21521c();
        int i = this.f21132c;
        long[] jArr = this.f21131b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f21131b = jArr2;
        }
        long[] jArr3 = this.f21131b;
        int i2 = this.f21132c;
        this.f21132c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m21521c();
        if (i < 0 || i > (i2 = this.f21132c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21132c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        long[] jArr = this.f21131b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f21131b, i, jArr2, i + 1, this.f21132c - i);
            this.f21131b = jArr2;
        }
        this.f21131b[i] = jLongValue;
        this.f21132c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21775a(((Long) obj).longValue());
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21521c();
        Charset charset = AbstractC8972l1.f21064a;
        collection.getClass();
        if (!(collection instanceof C9023u1)) {
            return super.addAll(collection);
        }
        C9023u1 c9023u1 = (C9023u1) collection;
        int i = c9023u1.f21132c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21132c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f21131b;
        if (i3 > jArr.length) {
            this.f21131b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c9023u1.f21131b, 0, this.f21131b, this.f21132c, c9023u1.f21132c);
        this.f21132c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m21776c(int i) {
        if (i < 0 || i >= this.f21132c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21132c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C9023u1 mo21502b(int i) {
        if (i >= this.f21132c) {
            return new C9023u1(Arrays.copyOf(this.f21131b, i), this.f21132c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9023u1)) {
            return super.equals(obj);
        }
        C9023u1 c9023u1 = (C9023u1) obj;
        if (this.f21132c != c9023u1.f21132c) {
            return false;
        }
        long[] jArr = c9023u1.f21131b;
        for (int i = 0; i < this.f21132c; i++) {
            if (this.f21131b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m21776c(i);
        return Long.valueOf(this.f21131b[i]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21132c; i2++) {
            long j = this.f21131b[i2];
            Charset charset = AbstractC8972l1.f21064a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f21132c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21131b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21521c();
        m21776c(i);
        long[] jArr = this.f21131b;
        long j = jArr[i];
        int i2 = this.f21132c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f21132c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21521c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f21131b;
        System.arraycopy(jArr, i2, jArr, i, this.f21132c - i2);
        this.f21132c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m21521c();
        m21776c(i);
        long[] jArr = this.f21131b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21132c;
    }
}
