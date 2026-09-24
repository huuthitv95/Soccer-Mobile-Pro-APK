package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8557b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8566k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.RunnableC8563h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8722g;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8723h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8733r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8548i implements InterfaceC8734s {

    /* JADX INFO: renamed from: a */
    public final C8566k f19244a;

    /* JADX INFO: renamed from: b */
    public final C8541b f19245b;

    /* JADX INFO: renamed from: d */
    public final C8721f f19247d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8760b f19248e;

    /* JADX INFO: renamed from: i */
    public final long f19252i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8733r f19253j;

    /* JADX INFO: renamed from: k */
    public int f19254k;

    /* JADX INFO: renamed from: l */
    public boolean f19255l;

    /* JADX INFO: renamed from: m */
    public C8741z f19256m;

    /* JADX INFO: renamed from: n */
    public C8553n[] f19257n;

    /* JADX INFO: renamed from: o */
    public C8553n[] f19258o;

    /* JADX INFO: renamed from: p */
    public C8723h f19259p;

    /* JADX INFO: renamed from: c */
    public final int f19246c = 3;

    /* JADX INFO: renamed from: f */
    public final IdentityHashMap f19249f = new IdentityHashMap();

    /* JADX INFO: renamed from: g */
    public final C8554o f19250g = new C8554o();

    /* JADX INFO: renamed from: h */
    public final Handler f19251h = new Handler();

    public C8548i(C8566k c8566k, C8541b c8541b, C8721f c8721f, InterfaceC8760b interfaceC8760b, long j) {
        this.f19244a = c8566k;
        this.f19245b = c8541b;
        this.f19247d = c8721f;
        this.f19248e = interfaceC8760b;
        this.f19252i = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final long mo21071a(long j) {
        this.f19250g.f19293a.clear();
        for (C8553n c8553n : this.f19258o) {
            c8553n.m21097c(j);
        }
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final long mo21072a(AbstractC8748b[] abstractC8748bArr, boolean[] zArr, InterfaceC8737v[] interfaceC8737vArr, boolean[] zArr2, long j) {
        int[] iArr;
        int i;
        boolean z;
        InterfaceC8737v[] interfaceC8737vArr2;
        int i2;
        int[] iArr2 = new int[abstractC8748bArr.length];
        int[] iArr3 = new int[abstractC8748bArr.length];
        for (int i3 = 0; i3 < abstractC8748bArr.length; i3++) {
            InterfaceC8737v interfaceC8737v = interfaceC8737vArr[i3];
            iArr2[i3] = interfaceC8737v == null ? -1 : ((Integer) this.f19249f.get(interfaceC8737v)).intValue();
            iArr3[i3] = -1;
            AbstractC8748b abstractC8748b = abstractC8748bArr[i3];
            if (abstractC8748b != null) {
                C8740y c8740y = abstractC8748b.f20434a;
                int i4 = 0;
                while (true) {
                    C8553n[] c8553nArr = this.f19257n;
                    if (i4 >= c8553nArr.length) {
                        break;
                    }
                    C8741z c8741z = c8553nArr[i4].f19287t;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= c8741z.f20426a) {
                            i5 = -1;
                            break;
                        }
                        if (c8741z.f20427b[i5] == c8740y) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 != -1) {
                        iArr3[i3] = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.f19249f.clear();
        int length = abstractC8748bArr.length;
        InterfaceC8737v[] interfaceC8737vArr3 = new InterfaceC8737v[length];
        InterfaceC8737v[] interfaceC8737vArr4 = new InterfaceC8737v[abstractC8748bArr.length];
        int length2 = abstractC8748bArr.length;
        AbstractC8748b[] abstractC8748bArr2 = new AbstractC8748b[length2];
        ArrayList arrayList = new ArrayList(this.f19257n.length);
        int i6 = 0;
        boolean z2 = false;
        while (i6 < this.f19257n.length) {
            int i7 = 0;
            while (true) {
                iArr = iArr2;
                if (i7 >= abstractC8748bArr.length) {
                    break;
                }
                interfaceC8737vArr4[i7] = iArr[i7] == i6 ? interfaceC8737vArr[i7] : null;
                abstractC8748bArr2[i7] = iArr3[i7] == i6 ? abstractC8748bArr[i7] : null;
                i7++;
                iArr2 = iArr;
            }
            C8553n c8553n = this.f19257n[i6];
            boolean z3 = this.f19255l;
            if (!c8553n.f19282o) {
                throw new IllegalStateException();
            }
            int i8 = 0;
            while (i8 < length2) {
                InterfaceC8737v interfaceC8737v2 = interfaceC8737vArr4[i8];
                if (interfaceC8737v2 == null || (abstractC8748bArr2[i8] != null && zArr[i8])) {
                    i2 = i8;
                } else {
                    i2 = i8;
                    int i9 = ((C8550k) interfaceC8737v2).f19265a;
                    boolean[] zArr3 = c8553n.f19289v;
                    if (!zArr3[i9]) {
                        throw new IllegalStateException();
                    }
                    zArr3[i9] = false;
                    c8553n.f19283p--;
                    ((C8538g) c8553n.f19277j.valueAt(i9)).m21056b();
                    interfaceC8737vArr4[i2] = null;
                }
                i8 = i2 + 1;
                iArr3 = iArr3;
            }
            int[] iArr4 = iArr3;
            int i10 = 0;
            boolean z4 = false;
            AbstractC8748b abstractC8748b2 = null;
            while (i10 < length2) {
                if (interfaceC8737vArr4[i10] == null) {
                    i = i10;
                    AbstractC8748b abstractC8748b3 = abstractC8748bArr2[i];
                    z = z3;
                    if (abstractC8748b3 != null) {
                        C8741z c8741z2 = c8553n.f19287t;
                        interfaceC8737vArr2 = interfaceC8737vArr4;
                        C8740y c8740y2 = abstractC8748b3.f20434a;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= c8741z2.f20426a) {
                                i11 = -1;
                                break;
                            }
                            if (c8741z2.f20427b[i11] == c8740y2) {
                                break;
                            }
                            i11++;
                        }
                        boolean[] zArr4 = c8553n.f19289v;
                        if (zArr4[i11]) {
                            throw new IllegalStateException();
                        }
                        zArr4[i11] = true;
                        c8553n.f19283p++;
                        if (i11 == c8553n.f19288u) {
                            c8553n.f19270c.f19219p = abstractC8748b3;
                            abstractC8748b2 = abstractC8748b3;
                        }
                        interfaceC8737vArr2[i] = new C8550k(c8553n, i11);
                        zArr2[i] = true;
                        z4 = true;
                    }
                    i10 = i + 1;
                    z3 = z;
                    interfaceC8737vArr4 = interfaceC8737vArr2;
                    length2 = length2;
                    abstractC8748bArr2 = abstractC8748bArr2;
                } else {
                    i = i10;
                    z = z3;
                }
                interfaceC8737vArr2 = interfaceC8737vArr4;
                i10 = i + 1;
                z3 = z;
                interfaceC8737vArr4 = interfaceC8737vArr2;
                length2 = length2;
                abstractC8748bArr2 = abstractC8748bArr2;
            }
            InterfaceC8737v[] interfaceC8737vArr5 = interfaceC8737vArr4;
            int i12 = length2;
            AbstractC8748b[] abstractC8748bArr3 = abstractC8748bArr2;
            if (!z3) {
                int size = c8553n.f19277j.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (!c8553n.f19289v[i13]) {
                        ((C8538g) c8553n.f19277j.valueAt(i13)).m21056b();
                    }
                }
                if (abstractC8748b2 != null && !c8553n.f19278k.isEmpty()) {
                    abstractC8748b2.mo21067d();
                    if (abstractC8748b2.f20436c[abstractC8748b2.mo21064a()] != c8553n.f19270c.f19209f.m21279a(((C8547h) c8553n.f19278k.getLast()).f20335c)) {
                        c8553n.m21097c(c8553n.f19290w);
                    }
                }
            }
            if (c8553n.f19283p == 0) {
                c8553n.f19270c.f19213j = null;
                c8553n.f19284q = null;
                c8553n.f19278k.clear();
                if (c8553n.f19274g.m21287a()) {
                    c8553n.f19274g.f20453b.m21318a(false);
                }
            }
            z2 |= z4;
            boolean z5 = false;
            for (int i14 = 0; i14 < abstractC8748bArr.length; i14++) {
                if (iArr4[i14] == i6) {
                    InterfaceC8737v interfaceC8737v3 = interfaceC8737vArr5[i14];
                    if (interfaceC8737v3 == null) {
                        throw new IllegalStateException();
                    }
                    interfaceC8737vArr3[i14] = interfaceC8737v3;
                    this.f19249f.put(interfaceC8737vArr5[i14], Integer.valueOf(i6));
                    z5 = true;
                } else if (iArr[i14] == i6 && interfaceC8737vArr5[i14] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z5) {
                arrayList.add(this.f19257n[i6]);
            }
            i6++;
            iArr2 = iArr;
            iArr3 = iArr4;
            interfaceC8737vArr4 = interfaceC8737vArr5;
            length2 = i12;
            abstractC8748bArr2 = abstractC8748bArr3;
        }
        System.arraycopy(interfaceC8737vArr3, 0, interfaceC8737vArr, 0, length);
        C8553n[] c8553nArr2 = new C8553n[arrayList.size()];
        this.f19258o = c8553nArr2;
        arrayList.toArray(c8553nArr2);
        C8553n[] c8553nArr3 = this.f19258o;
        if (c8553nArr3.length > 0) {
            c8553nArr3[0].f19270c.f19211h = true;
            int i15 = 1;
            while (true) {
                C8553n[] c8553nArr4 = this.f19258o;
                if (i15 >= c8553nArr4.length) {
                    break;
                }
                c8553nArr4[i15].f19270c.f19211h = false;
                i15++;
            }
        }
        this.f19259p = new C8723h(this.f19258o);
        if (this.f19255l && z2) {
            mo21071a(j);
            for (int i16 = 0; i16 < abstractC8748bArr.length; i16++) {
                if (interfaceC8737vArr[i16] != null) {
                    zArr2[i16] = true;
                }
            }
        }
        this.f19255l = true;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final C8741z mo21073a() {
        return this.f19256m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final void mo21074a(InterfaceC8733r interfaceC8733r) {
        C8538g c8538g;
        this.f19244a.f19375g.add(this);
        this.f19253j = interfaceC8733r;
        C8557b c8557b = this.f19244a.f19378j;
        ArrayList arrayList = new ArrayList(c8557b.f19304b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C8556a c8556a = (C8556a) arrayList.get(i);
            C8708o c8708o = c8556a.f19303b;
            if (c8708o.f20300k <= 0) {
                String str = c8708o.f20292c;
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (strArrSplit[i2].startsWith("avc")) {
                                arrayList2.add(c8556a);
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                String str2 = c8556a.f19303b.f20292c;
                if (!TextUtils.isEmpty(str2)) {
                    for (String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
                        if (str3.startsWith("mp4a")) {
                            arrayList3.add(c8556a);
                            break;
                        }
                    }
                }
            } else {
                arrayList2.add(c8556a);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = c8557b.f19305c;
        List list2 = c8557b.f19306d;
        int size = list2.size() + list.size() + 1;
        this.f19257n = new C8553n[size];
        this.f19254k = size;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C8556a[] c8556aArr = new C8556a[arrayList.size()];
        arrayList.toArray(c8556aArr);
        C8708o c8708o2 = c8557b.f19307e;
        C8545f c8545f = new C8545f(this.f19244a, c8556aArr, this.f19245b, this.f19250g, c8557b.f19308f);
        C8553n c8553n = new C8553n(0, this, c8545f, this.f19248e, this.f19252i, c8708o2, this.f19246c, this.f19247d);
        this.f19257n[0] = c8553n;
        c8545f.f19211h = true;
        if (!c8553n.f19282o) {
            c8553n.mo21075b(c8553n.f19290w);
        }
        int i3 = 0;
        int i4 = 1;
        while (i3 < list.size()) {
            C8553n c8553n2 = new C8553n(1, this, new C8545f(this.f19244a, new C8556a[]{(C8556a) list.get(i3)}, this.f19245b, this.f19250g, Collections.EMPTY_LIST), this.f19248e, this.f19252i, null, this.f19246c, this.f19247d);
            int i5 = i4 + 1;
            this.f19257n[i4] = c8553n2;
            if (!c8553n2.f19282o) {
                c8553n2.mo21075b(c8553n2.f19290w);
            }
            i3++;
            i4 = i5;
        }
        int i6 = 0;
        while (i6 < list2.size()) {
            C8556a c8556a2 = (C8556a) list2.get(i6);
            C8545f c8545f2 = new C8545f(this.f19244a, new C8556a[]{c8556a2}, this.f19245b, this.f19250g, Collections.EMPTY_LIST);
            InterfaceC8760b interfaceC8760b = this.f19248e;
            C8553n c8553n3 = new C8553n(3, this, c8545f2, interfaceC8760b, this.f19252i, null, this.f19246c, this.f19247d);
            C8708o c8708o3 = c8556a2.f19303b;
            if (c8553n3.f19277j.indexOfKey(0) >= 0) {
                c8538g = (C8538g) c8553n3.f19277j.get(0);
            } else {
                c8538g = new C8538g(interfaceC8760b);
                c8538g.f19189n = c8553n3;
                c8538g.f19178c.f19150r = c8553n3.f19285r;
                c8553n3.f19277j.put(0, c8538g);
            }
            c8538g.mo21053a(c8708o3);
            c8553n3.f19281n = true;
            c8553n3.m21098h();
            this.f19257n[i4] = c8553n3;
            i6++;
            i4++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: b */
    public final boolean mo21075b(long j) {
        return this.f19259p.mo21075b(j);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: c */
    public final long mo21076c() {
        long jMax;
        long jMin = Long.MAX_VALUE;
        for (C8553n c8553n : this.f19258o) {
            if (c8553n.f19292y) {
                jMax = Long.MIN_VALUE;
            } else {
                jMax = c8553n.f19291x;
                if (jMax == -9223372036854775807L) {
                    jMax = c8553n.f19290w;
                    C8547h c8547h = (C8547h) c8553n.f19278k.getLast();
                    if (!c8547h.f19226F) {
                        if (c8553n.f19278k.size() > 1) {
                            LinkedList linkedList = c8553n.f19278k;
                            c8547h = (C8547h) linkedList.get(linkedList.size() - 2);
                        } else {
                            c8547h = null;
                        }
                    }
                    if (c8547h != null) {
                        jMax = Math.max(jMax, c8547h.f20339g);
                    }
                    int size = c8553n.f19277j.size();
                    for (int i = 0; i < size; i++) {
                        jMax = Math.max(jMax, ((C8538g) c8553n.f19277j.valueAt(i)).m21058d());
                    }
                }
            }
            if (jMax != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMax);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: d */
    public final void mo21077d() throws IOException {
        C8553n[] c8553nArr = this.f19257n;
        if (c8553nArr != null) {
            for (C8553n c8553n : c8553nArr) {
                c8553n.f19274g.m21288b();
                C8545f c8545f = c8553n.f19270c;
                C8722g c8722g = c8545f.f19213j;
                if (c8722g != null) {
                    throw c8722g;
                }
                C8556a c8556a = c8545f.f19214k;
                if (c8556a != null) {
                    RunnableC8563h runnableC8563h = (RunnableC8563h) c8545f.f19208e.f19372d.get(c8556a);
                    runnableC8563h.f19359b.m21288b();
                    IOException iOException = runnableC8563h.f19367j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: f */
    public final long mo21078f() {
        return this.f19259p.mo21078f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: g */
    public final long mo21079g() {
        return -9223372036854775807L;
    }
}
