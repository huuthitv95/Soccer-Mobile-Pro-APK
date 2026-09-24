package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.q */
/* JADX INFO: loaded from: classes4.dex */
public class C9000q extends AbstractC8994p {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d */
    public final byte[] f21091d;

    public C9000q(byte[] bArr) {
        bArr.getClass();
        this.f21091d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: a */
    public final int mo21700a(int i, int i2) {
        byte[] bArr = this.f21091d;
        int iMo21671g = mo21671g();
        Charset charset = AbstractC8972l1.f21064a;
        for (int i3 = iMo21671g; i3 < iMo21671g + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: a */
    public void mo21668a(int i, byte[] bArr) {
        System.arraycopy(this.f21091d, 0, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: a */
    public final void mo21701a(AbstractC8964k abstractC8964k) {
        abstractC8964k.mo21482a(this.f21091d, mo21671g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: c */
    public byte mo21669c(int i) {
        return this.f21091d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: c */
    public final boolean mo21702c() {
        int iMo21671g = mo21671g();
        return AbstractC8927d4.f21001a.m21852b(this.f21091d, iMo21671g, size() + iMo21671g);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: d */
    public byte mo21670d(int i) {
        return this.f21091d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: d */
    public final AbstractC9031w mo21703d() {
        byte[] bArr = this.f21091d;
        int iMo21671g = mo21671g();
        int size = size();
        C9016t c9016t = new C9016t(bArr, iMo21671g, size, true);
        try {
            c9016t.mo21722d(size);
            return c9016t;
        } catch (C8984n1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: e */
    public final AbstractC9011s mo21704e(int i) {
        int iM21712a = AbstractC9011s.m21712a(0, i, size());
        return iM21712a == 0 ? AbstractC9011s.f21106b : new C8982n(this.f21091d, mo21671g(), iM21712a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    /* JADX INFO: renamed from: e */
    public final String mo21705e() {
        return new String(this.f21091d, mo21671g(), size(), AbstractC8972l1.f21064a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9011s) || size() != ((AbstractC9011s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C9000q)) {
            return obj.equals(this);
        }
        C9000q c9000q = (C9000q) obj;
        int i = this.f21108a;
        int i2 = c9000q.f21108a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c9000q.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c9000q.size()) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Ran off end of other: 0, ", size, ", ");
            sbM21088a.append(c9000q.size());
            throw new IllegalArgumentException(sbM21088a.toString());
        }
        byte[] bArr = this.f21091d;
        byte[] bArr2 = c9000q.f21091d;
        int iMo21671g = mo21671g() + size;
        int iMo21671g2 = mo21671g();
        int iMo21671g3 = c9000q.mo21671g();
        while (iMo21671g2 < iMo21671g) {
            if (bArr[iMo21671g2] != bArr2[iMo21671g3]) {
                return false;
            }
            iMo21671g2++;
            iMo21671g3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public int mo21671g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9011s
    public int size() {
        return this.f21091d.length;
    }
}
