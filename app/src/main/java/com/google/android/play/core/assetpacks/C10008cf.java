package com.google.android.play.core.assetpacks;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.cf */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10008cf {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22160a = new C10116o("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: b */
    private final byte[] f22161b = new byte[8192];

    /* JADX INFO: renamed from: c */
    private final C9983bh f22162c;

    /* JADX INFO: renamed from: d */
    private final C10017co f22163d;

    /* JADX INFO: renamed from: e */
    private final C10057ea f22164e;

    /* JADX INFO: renamed from: f */
    private final C10097aq f22165f;

    /* JADX INFO: renamed from: g */
    private final C10097aq f22166g;

    C10008cf(C9983bh c9983bh, C10097aq c10097aq, C10097aq c10097aq2, C10017co c10017co, C10057ea c10057ea) {
        this.f22162c = c9983bh;
        this.f22165f = c10097aq;
        this.f22166g = c10097aq2;
        this.f22163d = c10017co;
        this.f22164e = c10057ea;
    }

    /* JADX INFO: renamed from: b */
    private final File m22615b(C10007ce c10007ce) {
        File fileM22572p = this.f22162c.m22572p(c10007ce.f22256l, c10007ce.f22150a, c10007ce.f22151b, c10007ce.f22153d);
        if (!fileM22572p.exists()) {
            fileM22572p.mkdirs();
        }
        return fileM22572p;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x031c  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f5 A[EDGE_INSN: B:141:0x01f5->B:78:0x01f5 BREAK  A[LOOP:0: B:61:0x0192->B:143:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019c A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0211 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0217 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x022a A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0230 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x023f A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0245 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x026d A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0275 A[Catch: all -> 0x0294, TryCatch #1 {all -> 0x0294, blocks: (B:60:0x0189, B:61:0x0192, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01ae, B:71:0x01d2, B:72:0x01de, B:73:0x01e2, B:74:0x01e9, B:76:0x01ef, B:78:0x01f5, B:80:0x01fb, B:81:0x020b, B:83:0x0211, B:85:0x0217, B:86:0x022a, B:88:0x0230, B:89:0x023f, B:91:0x0245, B:97:0x0286, B:94:0x026d, B:95:0x0274, B:96:0x0275, B:50:0x0148, B:51:0x014d, B:52:0x0159, B:53:0x015a, B:54:0x017c), top: B:129:0x0035 }] */
    /* JADX INFO: renamed from: a */
    public final void m22616a(C10007ce c10007ce) throws Throwable {
        Throwable th;
        int i;
        int iMin;
        int iMax;
        InputStream sequenceInputStream;
        int i2;
        C9998bw c9998bw;
        AbstractC10075es abstractC10075esM22606b;
        File fileM22683c;
        long length;
        C9983bh c9983bh = this.f22162c;
        String str = c10007ce.f22256l;
        int i3 = c10007ce.f22150a;
        long j = c10007ce.f22151b;
        String str2 = c10007ce.f22153d;
        C10069em c10069em = new C10069em(c9983bh, str, i3, j, str2);
        File fileM22571o = c9983bh.m22571o(str, i3, j, str2);
        if (!fileM22571o.exists()) {
            fileM22571o.mkdirs();
        }
        try {
            InputStream inputStream = c10007ce.f22159j;
            InputStream gZIPInputStream = c10007ce.f22154e != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                try {
                    try {
                        if (c10007ce.f22155f > 0) {
                            try {
                                AbstractC10068el abstractC10068elM22682b = c10069em.m22682b();
                                int iMo22587b = abstractC10068elM22682b.mo22587b();
                                int i4 = c10007ce.f22155f;
                                if (iMo22587b != i4 - 1) {
                                    throw new C10013ck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i4), Integer.valueOf(abstractC10068elM22682b.mo22587b())), c10007ce.f22255k);
                                }
                                int iMo22586a = abstractC10068elM22682b.mo22586a();
                                try {
                                    if (iMo22586a == 1) {
                                        f22160a.m22749a("Resuming zip entry from last chunk during file %s.", abstractC10068elM22682b.mo22590e());
                                        File file = new File(abstractC10068elM22682b.mo22590e());
                                        if (!file.exists()) {
                                            throw new C10013ck("Partial file specified in checkpoint does not exist. Corrupt directory.", c10007ce.f22255k);
                                        }
                                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                        randomAccessFile.seek(abstractC10068elM22682b.mo22588c());
                                        long jMo22589d = abstractC10068elM22682b.mo22589d();
                                        i = 3;
                                        do {
                                            iMin = (int) Math.min(jMo22589d, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                                            iMax = Math.max(gZIPInputStream.read(this.f22161b, 0, iMin), 0);
                                            if (iMax > 0) {
                                                randomAccessFile.write(this.f22161b, 0, iMax);
                                            }
                                            jMo22589d -= (long) iMax;
                                            if (jMo22589d <= 0) {
                                                break;
                                            }
                                        } while (iMax > 0);
                                        long length2 = randomAccessFile.length();
                                        randomAccessFile.close();
                                        if (iMax != iMin) {
                                            f22160a.m22749a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                            c10069em.m22687g(file.getCanonicalPath(), length2, jMo22589d, c10007ce.f22155f);
                                        }
                                        if (sequenceInputStream != null) {
                                            c9998bw = new C9998bw(sequenceInputStream);
                                            File fileM22615b = m22615b(c10007ce);
                                            do {
                                                abstractC10075esM22606b = c9998bw.m22606b();
                                                if (!abstractC10075esM22606b.mo22595e()) {
                                                    if (abstractC10075esM22606b.m22699h()) {
                                                        c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                                    } else {
                                                        c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                                    }
                                                }
                                                if (!c9998bw.m22608d()) {
                                                    break;
                                                    break;
                                                }
                                            } while (!c9998bw.m22607c());
                                            if (c9998bw.m22607c()) {
                                                f22160a.m22749a("Writing central directory metadata.", new Object[0]);
                                                c10069em.m22691k(abstractC10075esM22606b.mo22596f(), sequenceInputStream);
                                            }
                                            if (!c10007ce.m22614a()) {
                                                if (abstractC10075esM22606b.mo22595e()) {
                                                    f22160a.m22749a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                                    c10069em.m22688h(abstractC10075esM22606b.mo22596f(), c10007ce.f22155f);
                                                } else if (c9998bw.m22607c()) {
                                                    f22160a.m22749a("Writing slice checkpoint for central directory.", new Object[0]);
                                                    c10069em.m22686f(c10007ce.f22155f);
                                                } else {
                                                    if (abstractC10075esM22606b.mo22591a() == 0) {
                                                        f22160a.m22749a("Writing slice checkpoint for partial file.", new Object[0]);
                                                        fileM22683c = new File(m22615b(c10007ce), abstractC10075esM22606b.mo22593c());
                                                        length = abstractC10075esM22606b.mo22592b() - c9998bw.m22605a();
                                                        if (fileM22683c.length() == length) {
                                                            throw new C10013ck("Partial file is of unexpected size.");
                                                        }
                                                    } else {
                                                        f22160a.m22749a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                                        fileM22683c = c10069em.m22683c();
                                                        length = fileM22683c.length();
                                                    }
                                                    c10069em.m22687g(fileM22683c.getCanonicalPath(), length, c9998bw.m22605a(), c10007ce.f22155f);
                                                }
                                            }
                                        }
                                        gZIPInputStream.close();
                                        if (c10007ce.m22614a()) {
                                            c10069em.m22689i(c10007ce.f22155f);
                                        }
                                        C10116o c10116o = f22160a;
                                        Integer numValueOf = Integer.valueOf(c10007ce.f22155f);
                                        String str3 = c10007ce.f22153d;
                                        String str4 = c10007ce.f22256l;
                                        Integer numValueOf2 = Integer.valueOf(c10007ce.f22255k);
                                        Object[] objArr = new Object[4];
                                        objArr[0] = numValueOf;
                                        objArr[1] = str3;
                                        objArr[2] = str4;
                                        objArr[i] = numValueOf2;
                                        c10116o.m22752d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", objArr);
                                        ((InterfaceC10145y) this.f22165f.mo22526a()).mo22522g(c10007ce.f22255k, c10007ce.f22256l, c10007ce.f22153d, c10007ce.f22155f);
                                        c10007ce.f22159j.close();
                                        i2 = i;
                                        if (c10007ce.f22158i == i2) {
                                            C9977bb c9977bb = (C9977bb) this.f22166g.mo22526a();
                                            String str5 = c10007ce.f22256l;
                                            long j2 = c10007ce.f22157h;
                                            c9977bb.m22534d(AssetPackState.m22476a(str5, 3, 0, j2, j2, this.f22163d.m22624b(str5, c10007ce), 1, c10007ce.f22152c, this.f22164e.m22673a(c10007ce.f22256l)));
                                        }
                                    }
                                    if (iMo22586a == 2) {
                                        f22160a.m22749a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                                        File fileM22569m = this.f22162c.m22569m(c10007ce.f22256l, c10007ce.f22150a, c10007ce.f22151b, c10007ce.f22153d);
                                        if (!fileM22569m.exists()) {
                                            throw new C10013ck("Checkpoint extension file not found.", c10007ce.f22255k);
                                        }
                                        gZIPInputStream = gZIPInputStream;
                                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileM22569m), gZIPInputStream);
                                        i = 3;
                                    } else {
                                        if (iMo22586a != 3) {
                                            throw new C10013ck(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(abstractC10068elM22682b.mo22586a())), c10007ce.f22255k);
                                        }
                                        f22160a.m22749a("Resuming central directory from last chunk.", new Object[0]);
                                        c10069em.m22684d(gZIPInputStream, abstractC10068elM22682b.mo22588c());
                                        if (!c10007ce.m22614a()) {
                                            throw new C10013ck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", c10007ce.f22255k);
                                        }
                                        i = 3;
                                    }
                                    if (sequenceInputStream != null) {
                                        c9998bw = new C9998bw(sequenceInputStream);
                                        File fileM22615b2 = m22615b(c10007ce);
                                        do {
                                            abstractC10075esM22606b = c9998bw.m22606b();
                                            if (!abstractC10075esM22606b.mo22595e() && !c9998bw.m22607c()) {
                                                if (abstractC10075esM22606b.m22699h() || abstractC10075esM22606b.m22698g()) {
                                                    c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                                } else {
                                                    c10069em.m22690j(abstractC10075esM22606b.mo22596f());
                                                    File file2 = new File(fileM22615b2, abstractC10075esM22606b.mo22593c());
                                                    file2.getParentFile().mkdirs();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                    int i5 = c9998bw.read(this.f22161b, 0, 8192);
                                                    while (i5 > 0) {
                                                        fileOutputStream.write(this.f22161b, 0, i5);
                                                        i5 = c9998bw.read(this.f22161b, 0, 8192);
                                                    }
                                                    fileOutputStream.close();
                                                }
                                            }
                                            if (!c9998bw.m22608d()) {
                                                break;
                                            }
                                        } while (!c9998bw.m22607c());
                                        if (c9998bw.m22607c()) {
                                            f22160a.m22749a("Writing central directory metadata.", new Object[0]);
                                            c10069em.m22691k(abstractC10075esM22606b.mo22596f(), sequenceInputStream);
                                        }
                                        if (!c10007ce.m22614a()) {
                                            if (abstractC10075esM22606b.mo22595e()) {
                                                f22160a.m22749a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                                c10069em.m22688h(abstractC10075esM22606b.mo22596f(), c10007ce.f22155f);
                                            } else if (c9998bw.m22607c()) {
                                                f22160a.m22749a("Writing slice checkpoint for central directory.", new Object[0]);
                                                c10069em.m22686f(c10007ce.f22155f);
                                            } else {
                                                if (abstractC10075esM22606b.mo22591a() == 0) {
                                                    f22160a.m22749a("Writing slice checkpoint for partial file.", new Object[0]);
                                                    fileM22683c = new File(m22615b(c10007ce), abstractC10075esM22606b.mo22593c());
                                                    length = abstractC10075esM22606b.mo22592b() - c9998bw.m22605a();
                                                    if (fileM22683c.length() == length) {
                                                        throw new C10013ck("Partial file is of unexpected size.");
                                                    }
                                                } else {
                                                    f22160a.m22749a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                                    fileM22683c = c10069em.m22683c();
                                                    length = fileM22683c.length();
                                                }
                                                c10069em.m22687g(fileM22683c.getCanonicalPath(), length, c9998bw.m22605a(), c10007ce.f22155f);
                                            }
                                        }
                                    }
                                    gZIPInputStream.close();
                                    if (c10007ce.m22614a()) {
                                        try {
                                            c10069em.m22689i(c10007ce.f22155f);
                                        } catch (IOException e) {
                                            f22160a.m22750b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                                            throw new C10013ck("Writing extraction finished checkpoint failed.", e, c10007ce.f22255k);
                                        }
                                    }
                                    C10116o c10116o2 = f22160a;
                                    Integer numValueOf3 = Integer.valueOf(c10007ce.f22155f);
                                    String str6 = c10007ce.f22153d;
                                    String str7 = c10007ce.f22256l;
                                    Integer numValueOf4 = Integer.valueOf(c10007ce.f22255k);
                                    Object[] objArr2 = new Object[4];
                                    objArr2[0] = numValueOf3;
                                    objArr2[1] = str6;
                                    objArr2[2] = str7;
                                    objArr2[i] = numValueOf4;
                                    c10116o2.m22752d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", objArr2);
                                    ((InterfaceC10145y) this.f22165f.mo22526a()).mo22522g(c10007ce.f22255k, c10007ce.f22256l, c10007ce.f22153d, c10007ce.f22155f);
                                    c10007ce.f22159j.close();
                                    i2 = i;
                                    if (c10007ce.f22158i == i2) {
                                        C9977bb c9977bb2 = (C9977bb) this.f22166g.mo22526a();
                                        String str8 = c10007ce.f22256l;
                                        long j3 = c10007ce.f22157h;
                                        c9977bb2.m22534d(AssetPackState.m22476a(str8, 3, 0, j3, j3, this.f22163d.m22624b(str8, c10007ce), 1, c10007ce.f22152c, this.f22164e.m22673a(c10007ce.f22256l)));
                                    }
                                    sequenceInputStream = null;
                                    if (sequenceInputStream != null) {
                                        c9998bw = new C9998bw(sequenceInputStream);
                                        File fileM22615b3 = m22615b(c10007ce);
                                        do {
                                            abstractC10075esM22606b = c9998bw.m22606b();
                                            if (!abstractC10075esM22606b.mo22595e()) {
                                                if (abstractC10075esM22606b.m22699h()) {
                                                    c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                                } else {
                                                    c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                                }
                                            }
                                            if (!c9998bw.m22608d()) {
                                                break;
                                                break;
                                            }
                                        } while (!c9998bw.m22607c());
                                        if (c9998bw.m22607c()) {
                                            f22160a.m22749a("Writing central directory metadata.", new Object[0]);
                                            c10069em.m22691k(abstractC10075esM22606b.mo22596f(), sequenceInputStream);
                                        }
                                        if (!c10007ce.m22614a()) {
                                            if (abstractC10075esM22606b.mo22595e()) {
                                                f22160a.m22749a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                                c10069em.m22688h(abstractC10075esM22606b.mo22596f(), c10007ce.f22155f);
                                            } else if (c9998bw.m22607c()) {
                                                f22160a.m22749a("Writing slice checkpoint for central directory.", new Object[0]);
                                                c10069em.m22686f(c10007ce.f22155f);
                                            } else {
                                                if (abstractC10075esM22606b.mo22591a() == 0) {
                                                    f22160a.m22749a("Writing slice checkpoint for partial file.", new Object[0]);
                                                    fileM22683c = new File(m22615b(c10007ce), abstractC10075esM22606b.mo22593c());
                                                    length = abstractC10075esM22606b.mo22592b() - c9998bw.m22605a();
                                                    if (fileM22683c.length() == length) {
                                                        throw new C10013ck("Partial file is of unexpected size.");
                                                    }
                                                } else {
                                                    f22160a.m22749a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                                    fileM22683c = c10069em.m22683c();
                                                    length = fileM22683c.length();
                                                }
                                                c10069em.m22687g(fileM22683c.getCanonicalPath(), length, c9998bw.m22605a(), c10007ce.f22155f);
                                            }
                                        }
                                    }
                                    gZIPInputStream.close();
                                    if (c10007ce.m22614a()) {
                                        c10069em.m22689i(c10007ce.f22155f);
                                    }
                                    C10116o c10116o3 = f22160a;
                                    Integer numValueOf5 = Integer.valueOf(c10007ce.f22155f);
                                    String str9 = c10007ce.f22153d;
                                    String str10 = c10007ce.f22256l;
                                    Integer numValueOf6 = Integer.valueOf(c10007ce.f22255k);
                                    Object[] objArr3 = new Object[4];
                                    objArr3[0] = numValueOf5;
                                    objArr3[1] = str9;
                                    objArr3[2] = str10;
                                    objArr3[i] = numValueOf6;
                                    c10116o3.m22752d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", objArr3);
                                    ((InterfaceC10145y) this.f22165f.mo22526a()).mo22522g(c10007ce.f22255k, c10007ce.f22256l, c10007ce.f22153d, c10007ce.f22155f);
                                    c10007ce.f22159j.close();
                                    i2 = i;
                                    if (c10007ce.f22158i == i2) {
                                        C9977bb c9977bb3 = (C9977bb) this.f22166g.mo22526a();
                                        String str11 = c10007ce.f22256l;
                                        long j4 = c10007ce.f22157h;
                                        c9977bb3.m22534d(AssetPackState.m22476a(str11, 3, 0, j4, j4, this.f22163d.m22624b(str11, c10007ce), 1, c10007ce.f22152c, this.f22164e.m22673a(c10007ce.f22256l)));
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    gZIPInputStream = gZIPInputStream;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                                throw th;
                            }
                        }
                        i = 3;
                        c10007ce.f22159j.close();
                        i2 = i;
                    } catch (IOException unused) {
                        C10116o c10116o4 = f22160a;
                        Integer numValueOf7 = Integer.valueOf(c10007ce.f22155f);
                        String str12 = c10007ce.f22153d;
                        String str13 = c10007ce.f22256l;
                        i2 = i;
                        Object[] objArr4 = new Object[i2];
                        objArr4[0] = numValueOf7;
                        objArr4[1] = str12;
                        objArr4[2] = str13;
                        c10116o4.m22753e("Could not close file for chunk %s of slice %s of pack %s.", objArr4);
                    }
                    gZIPInputStream = gZIPInputStream;
                    sequenceInputStream = gZIPInputStream;
                    if (sequenceInputStream != null) {
                        c9998bw = new C9998bw(sequenceInputStream);
                        File fileM22615b4 = m22615b(c10007ce);
                        do {
                            abstractC10075esM22606b = c9998bw.m22606b();
                            if (!abstractC10075esM22606b.mo22595e()) {
                                if (abstractC10075esM22606b.m22699h()) {
                                    c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                } else {
                                    c10069em.m22691k(abstractC10075esM22606b.mo22596f(), c9998bw);
                                }
                            }
                            if (!c9998bw.m22608d()) {
                                break;
                                break;
                            }
                        } while (!c9998bw.m22607c());
                        if (c9998bw.m22607c()) {
                            f22160a.m22749a("Writing central directory metadata.", new Object[0]);
                            c10069em.m22691k(abstractC10075esM22606b.mo22596f(), sequenceInputStream);
                        }
                        if (!c10007ce.m22614a()) {
                            if (abstractC10075esM22606b.mo22595e()) {
                                f22160a.m22749a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                c10069em.m22688h(abstractC10075esM22606b.mo22596f(), c10007ce.f22155f);
                            } else if (c9998bw.m22607c()) {
                                f22160a.m22749a("Writing slice checkpoint for central directory.", new Object[0]);
                                c10069em.m22686f(c10007ce.f22155f);
                            } else {
                                if (abstractC10075esM22606b.mo22591a() == 0) {
                                    f22160a.m22749a("Writing slice checkpoint for partial file.", new Object[0]);
                                    fileM22683c = new File(m22615b(c10007ce), abstractC10075esM22606b.mo22593c());
                                    length = abstractC10075esM22606b.mo22592b() - c9998bw.m22605a();
                                    if (fileM22683c.length() == length) {
                                        throw new C10013ck("Partial file is of unexpected size.");
                                    }
                                } else {
                                    f22160a.m22749a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                    fileM22683c = c10069em.m22683c();
                                    length = fileM22683c.length();
                                }
                                c10069em.m22687g(fileM22683c.getCanonicalPath(), length, c9998bw.m22605a(), c10007ce.f22155f);
                            }
                        }
                    }
                    gZIPInputStream.close();
                    if (c10007ce.m22614a()) {
                        c10069em.m22689i(c10007ce.f22155f);
                    }
                    C10116o c10116o5 = f22160a;
                    Integer numValueOf8 = Integer.valueOf(c10007ce.f22155f);
                    String str14 = c10007ce.f22153d;
                    String str15 = c10007ce.f22256l;
                    Integer numValueOf9 = Integer.valueOf(c10007ce.f22255k);
                    Object[] objArr5 = new Object[4];
                    objArr5[0] = numValueOf8;
                    objArr5[1] = str14;
                    objArr5[2] = str15;
                    objArr5[i] = numValueOf9;
                    c10116o5.m22752d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", objArr5);
                    ((InterfaceC10145y) this.f22165f.mo22526a()).mo22522g(c10007ce.f22255k, c10007ce.f22256l, c10007ce.f22153d, c10007ce.f22155f);
                    if (c10007ce.f22158i == i2) {
                        C9977bb c9977bb4 = (C9977bb) this.f22166g.mo22526a();
                        String str16 = c10007ce.f22256l;
                        long j5 = c10007ce.f22157h;
                        c9977bb4.m22534d(AssetPackState.m22476a(str16, 3, 0, j5, j5, this.f22163d.m22624b(str16, c10007ce), 1, c10007ce.f22152c, this.f22164e.m22673a(c10007ce.f22256l)));
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e2) {
            f22160a.m22750b("IOException during extraction %s.", e2.getMessage());
            throw new C10013ck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c10007ce.f22155f), c10007ce.f22153d, c10007ce.f22256l, Integer.valueOf(c10007ce.f22255k)), e2, c10007ce.f22255k);
        }
    }
}
