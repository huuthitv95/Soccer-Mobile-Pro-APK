package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.c */
/* JADX INFO: compiled from: ByteArrayPool.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13853c {

    /* JADX INFO: renamed from: e */
    protected static final Comparator<byte[]> f39549e = new a();

    /* JADX INFO: renamed from: a */
    private final List<byte[]> f39550a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<byte[]> f39551b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    private int f39552c = 0;

    /* JADX INFO: renamed from: d */
    private final int f39553d;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.c$a */
    /* JADX INFO: compiled from: ByteArrayPool.java */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C13853c(int i) {
        this.f39553d = i;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m41259a() {
        while (this.f39552c > this.f39553d) {
            byte[] bArrRemove = this.f39550a.remove(0);
            this.f39551b.remove(bArrRemove);
            this.f39552c -= bArrRemove.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m41260a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f39553d) {
                this.f39550a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f39551b, bArr, f39549e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f39551b.add(iBinarySearch, bArr);
                this.f39552c += bArr.length;
                m41259a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m41261a(int i) {
        for (int i2 = 0; i2 < this.f39551b.size(); i2++) {
            byte[] bArr = this.f39551b.get(i2);
            if (bArr.length >= i) {
                this.f39552c -= bArr.length;
                this.f39551b.remove(i2);
                this.f39550a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
