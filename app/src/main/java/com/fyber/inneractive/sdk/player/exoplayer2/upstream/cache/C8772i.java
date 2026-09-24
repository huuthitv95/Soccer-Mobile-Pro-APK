package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8803b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8804c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8817p;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8772i {

    /* JADX INFO: renamed from: c */
    public final C8804c f20499c;

    /* JADX INFO: renamed from: f */
    public boolean f20502f;

    /* JADX INFO: renamed from: g */
    public C8817p f20503g;

    /* JADX INFO: renamed from: d */
    public final Cipher f20500d = null;

    /* JADX INFO: renamed from: e */
    public final SecretKeySpec f20501e = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f20497a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final SparseArray f20498b = new SparseArray();

    public C8772i(File file) {
        this.f20499c = new C8804c(new File(file, CachedContentIndex.FILE_NAME));
    }

    /* JADX INFO: renamed from: a */
    public final C8771h m21295a(String str, long j) {
        SparseArray sparseArray = this.f20498b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C8771h c8771h = new C8771h(iKeyAt, str, j);
        this.f20497a.put(str, c8771h);
        this.f20498b.put(iKeyAt, str);
        this.f20502f = true;
        return c8771h;
    }

    /* JADX INFO: renamed from: a */
    public final void m21296a() {
        LinkedList linkedList = new LinkedList();
        for (C8771h c8771h : this.f20497a.values()) {
            if (c8771h.f20495c.isEmpty()) {
                linkedList.add(c8771h.f20494b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C8771h c8771h2 = (C8771h) this.f20497a.remove((String) it.next());
            if (c8771h2 != null) {
                if (!c8771h2.f20495c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f20498b.remove(c8771h2.f20493a);
                this.f20502f = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21297b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e;
        Throwable th;
        if (!this.f20502f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            C8803b c8803bM21321b = this.f20499c.m21321b();
            C8817p c8817p = this.f20503g;
            if (c8817p == null) {
                this.f20503g = new C8817p(c8803bM21321b);
            } else {
                c8817p.m21368a(c8803bM21321b);
            }
            dataOutputStream = new DataOutputStream(this.f20503g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f20500d != null ? 1 : 0);
                if (this.f20500d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f20500d.init(1, this.f20501e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f20503g, this.f20500d));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f20497a.size());
                int i = 0;
                for (C8771h c8771h : this.f20497a.values()) {
                    dataOutputStream2.writeInt(c8771h.f20493a);
                    dataOutputStream2.writeUTF(c8771h.f20494b);
                    dataOutputStream2.writeLong(c8771h.f20496d);
                    int iHashCode = (c8771h.f20494b.hashCode() + (c8771h.f20493a * 31)) * 31;
                    long j = c8771h.f20496d;
                    i += iHashCode + ((int) (j ^ (j >>> 32)));
                }
                dataOutputStream2.writeInt(i);
                C8804c c8804c = this.f20499c;
                c8804c.getClass();
                dataOutputStream2.close();
                c8804c.f20612b.delete();
                int i2 = AbstractC8827z.f20671a;
                this.f20502f = false;
            } catch (IOException e4) {
                e = e4;
                try {
                    throw new C8764a(e);
                } catch (Throwable th2) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th2;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th3 = th;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    AbstractC8827z.m21384a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                AbstractC8827z.m21384a(dataOutputStream);
                throw th;
            }
        } catch (IOException e5) {
            dataOutputStream = dataOutputStream2;
            e = e5;
        } catch (Throwable th5) {
            th = th5;
            Throwable th6 = th;
            dataOutputStream = dataOutputStream2;
            th = th6;
            AbstractC8827z.m21384a(dataOutputStream);
            throw th;
        }
    }
}
