package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9001q0 extends AbstractC8916c implements InterfaceC8936f1, RandomAccess, InterfaceC8985n2 {

    /* JADX INFO: renamed from: d */
    public static final C9001q0 f21092d;

    /* JADX INFO: renamed from: b */
    public float[] f21093b;

    /* JADX INFO: renamed from: c */
    public int f21094c;

    static {
        C9001q0 c9001q0 = new C9001q0(new float[0], 0);
        f21092d = c9001q0;
        c9001q0.f20989a = false;
    }

    public C9001q0() {
        this.f21093b = new float[10];
        this.f21094c = 0;
    }

    public C9001q0(float[] fArr, int i) {
        this.f21093b = fArr;
        this.f21094c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21706a(float f) {
        m21521c();
        int i = this.f21094c;
        float[] fArr = this.f21093b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f21093b = fArr2;
        }
        float[] fArr3 = this.f21093b;
        int i2 = this.f21094c;
        this.f21094c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m21521c();
        if (i < 0 || i > (i2 = this.f21094c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21094c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        float[] fArr = this.f21093b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f21093b, i, fArr2, i + 1, this.f21094c - i);
            this.f21093b = fArr2;
        }
        this.f21093b[i] = fFloatValue;
        this.f21094c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21706a(((Float) obj).floatValue());
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21521c();
        Charset charset = AbstractC8972l1.f21064a;
        collection.getClass();
        if (!(collection instanceof C9001q0)) {
            return super.addAll(collection);
        }
        C9001q0 c9001q0 = (C9001q0) collection;
        int i = c9001q0.f21094c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21094c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f21093b;
        if (i3 > fArr.length) {
            this.f21093b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c9001q0.f21093b, 0, this.f21093b, this.f21094c, c9001q0.f21094c);
        this.f21094c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C9001q0 mo21502b(int i) {
        if (i >= this.f21094c) {
            return new C9001q0(Arrays.copyOf(this.f21093b, i), this.f21094c);
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
        if (!(obj instanceof C9001q0)) {
            return super.equals(obj);
        }
        C9001q0 c9001q0 = (C9001q0) obj;
        if (this.f21094c != c9001q0.f21094c) {
            return false;
        }
        float[] fArr = c9001q0.f21093b;
        for (int i = 0; i < this.f21094c; i++) {
            if (Float.floatToIntBits(this.f21093b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.f21094c) {
            return Float.valueOf(this.f21093b[i]);
        }
        StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
        sbM21088a.append(this.f21094c);
        throw new IndexOutOfBoundsException(sbM21088a.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f21094c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21093b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f21094c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21093b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m21521c();
        if (i < 0 || i >= (i2 = this.f21094c)) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21094c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        float[] fArr = this.f21093b;
        float f = fArr[i];
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f21094c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21521c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f21093b;
        System.arraycopy(fArr, i2, fArr, i, this.f21094c - i2);
        this.f21094c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m21521c();
        if (i < 0 || i >= this.f21094c) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Index:", i, ", Size:");
            sbM21088a.append(this.f21094c);
            throw new IndexOutOfBoundsException(sbM21088a.toString());
        }
        float[] fArr = this.f21093b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21094c;
    }
}
