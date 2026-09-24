package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8923d0 extends AbstractC8916c implements InterfaceC8918c1, RandomAccess, InterfaceC8985n2 {

    /* JADX INFO: renamed from: d */
    public static final C8923d0 f20997d;

    /* JADX INFO: renamed from: b */
    public double[] f20998b;

    /* JADX INFO: renamed from: c */
    public int f20999c;

    static {
        C8923d0 c8923d0 = new C8923d0(new double[0], 0);
        f20997d = c8923d0;
        c8923d0.f20989a = false;
    }

    public C8923d0() {
        this.f20998b = new double[10];
        this.f20999c = 0;
    }

    public C8923d0(double[] dArr, int i) {
        this.f20998b = dArr;
        this.f20999c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21529a(double d) {
        m21521c();
        int i = this.f20999c;
        double[] dArr = this.f20998b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f20998b = dArr2;
        }
        double[] dArr3 = this.f20998b;
        int i2 = this.f20999c;
        this.f20999c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m21521c();
        if (i < 0 || i > (i2 = this.f20999c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f20999c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        double[] dArr = this.f20998b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f20998b, i, dArr2, i + 1, this.f20999c - i);
            this.f20998b = dArr2;
        }
        this.f20998b[i] = dDoubleValue;
        this.f20999c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21529a(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21521c();
        Charset charset = AbstractC8972l1.f21064a;
        collection.getClass();
        if (!(collection instanceof C8923d0)) {
            return super.addAll(collection);
        }
        C8923d0 c8923d0 = (C8923d0) collection;
        int i = c8923d0.f20999c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20999c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f20998b;
        if (i3 > dArr.length) {
            this.f20998b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c8923d0.f20998b, 0, this.f20998b, this.f20999c, c8923d0.f20999c);
        this.f20999c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C8923d0 mo21502b(int i) {
        if (i >= this.f20999c) {
            return new C8923d0(Arrays.copyOf(this.f20998b, i), this.f20999c);
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
        if (!(obj instanceof C8923d0)) {
            return super.equals(obj);
        }
        C8923d0 c8923d0 = (C8923d0) obj;
        if (this.f20999c != c8923d0.f20999c) {
            return false;
        }
        double[] dArr = c8923d0.f20998b;
        for (int i = 0; i < this.f20999c; i++) {
            if (Double.doubleToLongBits(this.f20998b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f20999c) {
            return Double.valueOf(this.f20998b[i]);
        }
        StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
        sbM21088a.append(this.f20999c);
        throw new IndexOutOfBoundsException(sbM21088a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20999c; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f20998b[i2]);
            Charset charset = AbstractC8972l1.f21064a;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f20999c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20998b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m21521c();
        if (i < 0 || i >= (i2 = this.f20999c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f20999c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        double[] dArr = this.f20998b;
        double d = dArr[i];
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f20999c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21521c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f20998b;
        System.arraycopy(dArr, i2, dArr, i, this.f20999c - i2);
        this.f20999c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m21521c();
        if (i < 0 || i >= this.f20999c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f20999c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        double[] dArr = this.f20998b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20999c;
    }
}
