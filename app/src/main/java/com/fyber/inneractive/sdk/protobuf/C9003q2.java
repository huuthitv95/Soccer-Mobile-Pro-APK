package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9003q2 extends AbstractC8916c implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C9003q2 f21095d;

    /* JADX INFO: renamed from: b */
    public Object[] f21096b;

    /* JADX INFO: renamed from: c */
    public int f21097c;

    static {
        C9003q2 c9003q2 = new C9003q2(new Object[0], 0);
        f21095d = c9003q2;
        c9003q2.f20989a = false;
    }

    public C9003q2(Object[] objArr, int i) {
        this.f21096b = objArr;
        this.f21097c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m21521c();
        if (i < 0 || i > (i2 = this.f21097c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21097c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        Object[] objArr = this.f21096b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f21096b, i, objArr2, i + 1, this.f21097c - i);
            this.f21096b = objArr2;
        }
        this.f21096b[i] = obj;
        this.f21097c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21521c();
        int i = this.f21097c;
        Object[] objArr = this.f21096b;
        if (i == objArr.length) {
            this.f21096b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f21096b;
        int i2 = this.f21097c;
        this.f21097c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: b */
    public final InterfaceC8966k1 mo21502b(int i) {
        if (i >= this.f21097c) {
            return new C9003q2(Arrays.copyOf(this.f21096b, i), this.f21097c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f21097c) {
            return this.f21096b[i];
        }
        StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
        sbM21088a.append(this.f21097c);
        throw new IndexOutOfBoundsException(sbM21088a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m21521c();
        if (i < 0 || i >= (i2 = this.f21097c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21097c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        Object[] objArr = this.f21096b;
        Object obj = objArr[i];
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f21097c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m21521c();
        if (i < 0 || i >= this.f21097c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21097c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        Object[] objArr = this.f21096b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21097c;
    }
}
