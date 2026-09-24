package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8804c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8775l {

    /* JADX INFO: renamed from: a */
    public final File f20508a;

    /* JADX INFO: renamed from: b */
    public final C8773j f20509b;

    /* JADX INFO: renamed from: d */
    public final C8772i f20511d;

    /* JADX INFO: renamed from: f */
    public C8764a f20513f;

    /* JADX INFO: renamed from: c */
    public final HashMap f20510c = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f20512e = new HashMap();

    public C8775l(File file, C8773j c8773j) {
        this.f20508a = file;
        this.f20509b = c8773j;
        this.f20511d = new C8772i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new C8774k(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[PHI: r4
  0x00d5: PHI (r4v6 java.io.DataInputStream) = (r4v3 java.io.DataInputStream), (r4v12 java.io.DataInputStream) binds: [B:54:0x00d3, B:36:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00f7, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static void m21299a(C8775l c8775l) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        File[] fileArrListFiles;
        C8776m c8776mM21306a;
        if (!c8775l.f20508a.exists()) {
            c8775l.f20508a.mkdirs();
            return;
        }
        C8772i c8772i = c8775l.f20511d;
        if (c8772i.f20502f) {
            throw new IllegalStateException();
        }
        DataInputStream dataInputStream3 = null;
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c8772i.f20499c.m21320a());
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    if (dataInputStream.readInt() == 1) {
                        try {
                            if ((dataInputStream.readInt() & 1) != 0) {
                                if (c8772i.f20500d != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream.readFully(bArr);
                                    try {
                                        c8772i.f20500d.init(2, c8772i.f20501e, new IvParameterSpec(bArr));
                                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, c8772i.f20500d));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                                C8804c c8804c = c8772i.f20499c;
                                c8804c.f20611a.delete();
                                c8804c.f20612b.delete();
                                c8772i.f20497a.clear();
                                c8772i.f20498b.clear();
                                fileArrListFiles = c8775l.f20508a.listFiles();
                                if (fileArrListFiles == null) {
                                    return;
                                }
                                for (File file : fileArrListFiles) {
                                    if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                                        if (file.length() > 0) {
                                            c8776mM21306a = C8776m.m21306a(file, c8775l.f20511d);
                                        } else {
                                            c8776mM21306a = null;
                                        }
                                        if (c8776mM21306a != null) {
                                            c8775l.m21304a(c8776mM21306a);
                                        } else {
                                            file.delete();
                                        }
                                    }
                                }
                                c8775l.f20511d.m21296a();
                                c8775l.f20511d.m21297b();
                            }
                            if (c8772i.f20500d != null) {
                                c8772i.f20502f = true;
                            }
                            int i = dataInputStream.readInt();
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                int i4 = dataInputStream.readInt();
                                String utf = dataInputStream.readUTF();
                                C8771h c8771h = new C8771h(i4, utf, dataInputStream.readLong());
                                c8772i.f20497a.put(utf, c8771h);
                                c8772i.f20498b.put(i4, utf);
                                int iHashCode = utf.hashCode();
                                long j = c8771h.f20496d;
                                i2 += ((iHashCode + (i4 * 31)) * 31) + ((int) (j ^ (j >>> 32)));
                            }
                            if (dataInputStream.readInt() != i2) {
                                AbstractC8827z.m21384a(dataInputStream);
                                C8804c c8804c2 = c8772i.f20499c;
                                c8804c2.f20611a.delete();
                                c8804c2.f20612b.delete();
                                c8772i.f20497a.clear();
                                c8772i.f20498b.clear();
                            } else {
                                AbstractC8827z.m21384a(dataInputStream);
                            }
                            fileArrListFiles = c8775l.f20508a.listFiles();
                            if (fileArrListFiles == null) {
                                return;
                            }
                            while (i < r3) {
                                if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                                    if (file.length() > 0) {
                                        c8776mM21306a = C8776m.m21306a(file, c8775l.f20511d);
                                    } else {
                                        c8776mM21306a = null;
                                    }
                                    if (c8776mM21306a != null) {
                                        c8775l.m21304a(c8776mM21306a);
                                    } else {
                                        file.delete();
                                    }
                                }
                            }
                            c8775l.f20511d.m21296a();
                            c8775l.f20511d.m21297b();
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream3 = dataInputStream;
                            dataInputStream2 = dataInputStream3;
                            if (dataInputStream2 != null) {
                                AbstractC8827z.m21384a(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                    AbstractC8827z.m21384a(dataInputStream);
                } catch (FileNotFoundException unused) {
                    if (dataInputStream != null) {
                        AbstractC8827z.m21384a(dataInputStream);
                    }
                } catch (IOException e3) {
                    e = e3;
                    Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                    if (dataInputStream != null) {
                        AbstractC8827z.m21384a(dataInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream2 != null) {
                    AbstractC8827z.m21384a(dataInputStream2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            dataInputStream = null;
        } catch (IOException e4) {
            e = e4;
            dataInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        C8804c c8804c3 = c8772i.f20499c;
        c8804c3.f20611a.delete();
        c8804c3.f20612b.delete();
        c8772i.f20497a.clear();
        c8772i.f20498b.clear();
        fileArrListFiles = c8775l.f20508a.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        while (i < r3) {
            if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                if (file.length() > 0) {
                    c8776mM21306a = C8776m.m21306a(file, c8775l.f20511d);
                } else {
                    c8776mM21306a = null;
                }
                if (c8776mM21306a != null) {
                    c8775l.m21304a(c8776mM21306a);
                } else {
                    file.delete();
                }
            }
        }
        c8775l.f20511d.m21296a();
        c8775l.f20511d.m21297b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m21300a(String str) {
        C8771h c8771h;
        c8771h = (C8771h) this.f20511d.f20497a.get(str);
        return c8771h == null ? -1L : c8771h.f20496d;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C8776m m21301a(String str, long j) {
        String str2;
        C8776m c8776mM21294a;
        C8764a c8764a = this.f20513f;
        if (c8764a != null) {
            throw c8764a;
        }
        C8771h c8771h = (C8771h) this.f20511d.f20497a.get(str);
        if (c8771h == null) {
            str2 = str;
            c8776mM21294a = new C8776m(str2, j, -1L, -9223372036854775807L, null);
        } else {
            str2 = str;
            while (true) {
                c8776mM21294a = c8771h.m21294a(j);
                if (!c8776mM21294a.f20490d || c8776mM21294a.f20491e.length() == c8776mM21294a.f20489c) {
                    break;
                }
                m21302a();
            }
        }
        if (!c8776mM21294a.f20490d) {
            if (this.f20510c.containsKey(str2)) {
                return null;
            }
            this.f20510c.put(str2, c8776mM21294a);
            return c8776mM21294a;
        }
        C8771h c8771h2 = (C8771h) this.f20511d.f20497a.get(str2);
        if (!c8771h2.f20495c.remove(c8776mM21294a)) {
            throw new IllegalStateException();
        }
        int i = c8771h2.f20493a;
        if (!c8776mM21294a.f20490d) {
            throw new IllegalStateException();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File parentFile = c8776mM21294a.f20491e.getParentFile();
        long j2 = c8776mM21294a.f20488b;
        Pattern pattern = C8776m.f20514g;
        File file = new File(parentFile, i + "." + j2 + "." + jCurrentTimeMillis + ".v3.exo");
        C8776m c8776m = new C8776m(c8776mM21294a.f20487a, c8776mM21294a.f20488b, c8776mM21294a.f20489c, jCurrentTimeMillis, file);
        if (!c8776mM21294a.f20491e.renameTo(file)) {
            throw new C8764a("Renaming of " + c8776mM21294a.f20491e + " to " + file + " failed.");
        }
        c8771h2.f20495c.add(c8776m);
        ArrayList arrayList = (ArrayList) this.f20512e.get(c8776mM21294a.f20487a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8773j c8773j = (C8773j) arrayList.get(size);
                c8773j.f20504a.remove(c8776mM21294a);
                c8773j.f20505b -= c8776mM21294a.f20489c;
                c8773j.f20504a.add(c8776m);
                c8773j.f20505b += c8776m.f20489c;
                c8773j.m21298a(this, 0L);
            }
        }
        C8773j c8773j2 = this.f20509b;
        c8773j2.f20504a.remove(c8776mM21294a);
        c8773j2.f20505b -= c8776mM21294a.f20489c;
        c8773j2.f20504a.add(c8776m);
        c8773j2.f20505b += c8776m.f20489c;
        c8773j2.m21298a(this, 0L);
        return c8776m;
    }

    /* JADX INFO: renamed from: a */
    public final void m21302a() throws Throwable {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f20511d.f20497a.values().iterator();
        while (it.hasNext()) {
            for (AbstractC8770g abstractC8770g : ((C8771h) it.next()).f20495c) {
                if (abstractC8770g.f20491e.length() != abstractC8770g.f20489c) {
                    linkedList.add(abstractC8770g);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            m21303a((AbstractC8770g) it2.next(), false);
        }
        this.f20511d.m21296a();
        this.f20511d.m21297b();
    }

    /* JADX INFO: renamed from: a */
    public final void m21303a(AbstractC8770g abstractC8770g, boolean z) throws Throwable {
        C8771h c8771h = (C8771h) this.f20511d.f20497a.get(abstractC8770g.f20487a);
        if (c8771h == null || !c8771h.f20495c.remove(abstractC8770g)) {
            return;
        }
        abstractC8770g.f20491e.delete();
        if (z && c8771h.f20495c.isEmpty()) {
            C8772i c8772i = this.f20511d;
            C8771h c8771h2 = (C8771h) c8772i.f20497a.remove(c8771h.f20494b);
            if (c8771h2 != null) {
                if (!c8771h2.f20495c.isEmpty()) {
                    throw new IllegalStateException();
                }
                c8772i.f20498b.remove(c8771h2.f20493a);
                c8772i.f20502f = true;
            }
            this.f20511d.m21297b();
        }
        ArrayList arrayList = (ArrayList) this.f20512e.get(abstractC8770g.f20487a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8773j c8773j = (C8773j) arrayList.get(size);
                c8773j.f20504a.remove(abstractC8770g);
                c8773j.f20505b -= abstractC8770g.f20489c;
            }
        }
        C8773j c8773j2 = this.f20509b;
        c8773j2.f20504a.remove(abstractC8770g);
        c8773j2.f20505b -= abstractC8770g.f20489c;
    }

    /* JADX INFO: renamed from: a */
    public final void m21304a(C8776m c8776m) {
        C8772i c8772i = this.f20511d;
        String str = c8776m.f20487a;
        C8771h c8771hM21295a = (C8771h) c8772i.f20497a.get(str);
        if (c8771hM21295a == null) {
            c8771hM21295a = c8772i.m21295a(str, -1L);
        }
        c8771hM21295a.f20495c.add(c8776m);
        ArrayList arrayList = (ArrayList) this.f20512e.get(c8776m.f20487a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8773j c8773j = (C8773j) arrayList.get(size);
                c8773j.f20504a.add(c8776m);
                c8773j.f20505b += c8776m.f20489c;
                c8773j.m21298a(this, 0L);
            }
        }
        C8773j c8773j2 = this.f20509b;
        c8773j2.f20504a.add(c8776m);
        c8773j2.f20505b += c8776m.f20489c;
        c8773j2.m21298a(this, 0L);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m21305b(C8776m c8776m) {
        if (c8776m != this.f20510c.remove(c8776m.f20487a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }
}
