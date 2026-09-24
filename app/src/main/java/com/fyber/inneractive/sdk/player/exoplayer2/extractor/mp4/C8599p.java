package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8571m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8704s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8831c;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8599p implements InterfaceC8567i, InterfaceC8628q {

    /* JADX INFO: renamed from: p */
    public static final int f19725p = AbstractC8827z.m21379a("qt  ");

    /* JADX INFO: renamed from: e */
    public int f19730e;

    /* JADX INFO: renamed from: f */
    public int f19731f;

    /* JADX INFO: renamed from: g */
    public long f19732g;

    /* JADX INFO: renamed from: h */
    public int f19733h;

    /* JADX INFO: renamed from: i */
    public C8815n f19734i;

    /* JADX INFO: renamed from: j */
    public int f19735j;

    /* JADX INFO: renamed from: k */
    public int f19736k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8568j f19737l;

    /* JADX INFO: renamed from: m */
    public C8598o[] f19738m;

    /* JADX INFO: renamed from: n */
    public long f19739n;

    /* JADX INFO: renamed from: o */
    public boolean f19740o;

    /* JADX INFO: renamed from: c */
    public final C8815n f19728c = new C8815n(16);

    /* JADX INFO: renamed from: d */
    public final Stack f19729d = new Stack();

    /* JADX INFO: renamed from: a */
    public final C8815n f19726a = new C8815n(AbstractC8813l.f20635a);

    /* JADX INFO: renamed from: b */
    public final C8815n f19727b = new C8815n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        C8598o[] c8598oArr;
        boolean z;
        while (true) {
            int i = this.f19730e;
            boolean z2 = false;
            if (i == 0) {
                if (this.f19733h == 0) {
                    if (!c8527b.m21027b(this.f19728c.f20643a, 0, 8, true)) {
                        return -1;
                    }
                    this.f19733h = 8;
                    this.f19728c.m21347e(0);
                    this.f19732g = this.f19728c.m21353k();
                    this.f19731f = this.f19728c.m21340b();
                }
                if (this.f19732g == 1) {
                    c8527b.m21027b(this.f19728c.f20643a, 8, 8, false);
                    this.f19733h += 8;
                    this.f19732g = this.f19728c.m21356n();
                }
                int i2 = this.f19731f;
                if (i2 == AbstractC8586c.f19532C || i2 == AbstractC8586c.f19536E || i2 == AbstractC8586c.f19538F || i2 == AbstractC8586c.f19540G || i2 == AbstractC8586c.f19542H || i2 == AbstractC8586c.f19559Q) {
                    long j = (c8527b.f19124c + this.f19732g) - ((long) this.f19733h);
                    this.f19729d.add(new C8584a(this.f19731f, j));
                    if (this.f19732g == this.f19733h) {
                        m21142c(j);
                    } else {
                        this.f19730e = 0;
                        this.f19733h = 0;
                    }
                } else if (i2 != AbstractC8586c.f19561S && i2 != AbstractC8586c.f19534D && i2 != AbstractC8586c.f19562T && i2 != AbstractC8586c.f19563U && i2 != AbstractC8586c.f19593m0 && i2 != AbstractC8586c.f19595n0 && i2 != AbstractC8586c.f19597o0 && i2 != AbstractC8586c.f19560R && i2 != AbstractC8586c.f19599p0 && i2 != AbstractC8586c.f19601q0 && i2 != AbstractC8586c.f19603r0 && i2 != AbstractC8586c.f19605s0 && i2 != AbstractC8586c.f19607t0 && i2 != AbstractC8586c.f19558P && i2 != AbstractC8586c.f19570b && i2 != AbstractC8586c.f19529A0) {
                    this.f19734i = null;
                    this.f19730e = 1;
                } else {
                    if (this.f19733h != 8) {
                        throw new IllegalStateException();
                    }
                    long j2 = this.f19732g;
                    if (j2 > 2147483647L) {
                        throw new IllegalStateException();
                    }
                    C8815n c8815n = new C8815n((int) j2);
                    this.f19734i = c8815n;
                    System.arraycopy(this.f19728c.f20643a, 0, c8815n.f20643a, 0, 8);
                    this.f19730e = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    long j3 = Long.MAX_VALUE;
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        c8598oArr = this.f19738m;
                        if (i4 >= c8598oArr.length) {
                            break;
                        }
                        C8598o c8598o = c8598oArr[i4];
                        int i5 = c8598o.f19724d;
                        C8605v c8605v = c8598o.f19722b;
                        if (i5 != c8605v.f19773a) {
                            long j4 = c8605v.f19774b[i5];
                            if (j4 < j3) {
                                i3 = i4;
                                j3 = j4;
                            }
                        }
                        i4++;
                    }
                    if (i3 == -1) {
                        return -1;
                    }
                    C8598o c8598o2 = c8598oArr[i3];
                    InterfaceC8629r interfaceC8629r = c8598o2.f19723c;
                    int i6 = c8598o2.f19724d;
                    C8605v c8605v2 = c8598o2.f19722b;
                    long j5 = c8605v2.f19774b[i6];
                    int i7 = c8605v2.f19775c[i6];
                    if (c8598o2.f19721a.f19748g == 1) {
                        j5 += 8;
                        i7 -= 8;
                    }
                    long j6 = (j5 - c8527b.f19124c) + ((long) this.f19735j);
                    if (j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        c8607o.f19793a = j5;
                        return 1;
                    }
                    c8527b.m21023a((int) j6);
                    int i8 = c8598o2.f19721a.f19752k;
                    if (i8 == 0) {
                        while (true) {
                            int i9 = this.f19735j;
                            if (i9 >= i7) {
                                break;
                            }
                            int iMo21046a = interfaceC8629r.mo21046a(c8527b, i7 - i9, false);
                            this.f19735j += iMo21046a;
                            this.f19736k -= iMo21046a;
                        }
                    } else {
                        byte[] bArr = this.f19727b.f20643a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i10 = 4 - i8;
                        while (this.f19735j < i7) {
                            int i11 = this.f19736k;
                            if (i11 == 0) {
                                c8527b.m21027b(this.f19727b.f20643a, i10, i8, false);
                                this.f19727b.m21347e(0);
                                this.f19736k = this.f19727b.m21355m();
                                this.f19726a.m21347e(0);
                                interfaceC8629r.mo21049a(4, this.f19726a);
                                this.f19735j += 4;
                                i7 += i10;
                            } else {
                                int iMo21046a2 = interfaceC8629r.mo21046a(c8527b, i11, false);
                                this.f19735j += iMo21046a2;
                                this.f19736k -= iMo21046a2;
                            }
                        }
                    }
                    C8605v c8605v3 = c8598o2.f19722b;
                    interfaceC8629r.mo21051a(c8605v3.f19777e[i6], c8605v3.f19778f[i6], i7, 0, null);
                    c8598o2.f19724d++;
                    this.f19735j = 0;
                    this.f19736k = 0;
                    return 0;
                }
                long j7 = this.f19732g;
                int i12 = this.f19733h;
                long j8 = j7 - ((long) i12);
                long j9 = c8527b.f19124c + j8;
                C8815n c8815n2 = this.f19734i;
                if (c8815n2 != null) {
                    c8527b.m21027b(c8815n2.f20643a, i12, (int) j8, false);
                    if (this.f19731f == AbstractC8586c.f19570b) {
                        C8815n c8815n3 = this.f19734i;
                        c8815n3.m21347e(8);
                        if (c8815n3.m21340b() != f19725p) {
                            c8815n3.m21347e(c8815n3.f20644b + 4);
                            while (true) {
                                if (c8815n3.f20645c - c8815n3.f20644b <= 0) {
                                    z = false;
                                    break;
                                }
                                if (c8815n3.m21340b() == f19725p) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                            break;
                        }
                        this.f19740o = z;
                    } else if (!this.f19729d.isEmpty()) {
                        ((C8584a) this.f19729d.peek()).f19525Q0.add(new C8585b(this.f19731f, this.f19734i));
                    }
                } else if (j8 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    c8527b.m21023a((int) j8);
                } else {
                    c8607o.f19793a = j9;
                    z2 = true;
                }
                m21142c(j9);
                if (z2 && this.f19730e != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        int i;
        long j2 = Long.MAX_VALUE;
        for (C8598o c8598o : this.f19738m) {
            C8605v c8605v = c8598o.f19722b;
            int iM21380a = AbstractC8827z.m21380a(c8605v.f19777e, j, false);
            while (true) {
                i = -1;
                if (iM21380a < 0) {
                    iM21380a = -1;
                    break;
                }
                if ((c8605v.f19778f[iM21380a] & 1) != 0) {
                    break;
                }
                iM21380a--;
            }
            if (iM21380a != -1) {
                i = iM21380a;
                break;
            }
            iM21380a = AbstractC8827z.m21381a(c8605v.f19777e, j, true, false);
            while (iM21380a < c8605v.f19777e.length) {
                if ((c8605v.f19778f[iM21380a] & 1) != 0) {
                    i = iM21380a;
                    break;
                }
                iM21380a++;
            }
            long j3 = c8605v.f19774b[i];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        int i;
        this.f19729d.clear();
        this.f19733h = 0;
        this.f19735j = 0;
        this.f19736k = 0;
        if (j == 0) {
            this.f19730e = 0;
            this.f19733h = 0;
            return;
        }
        C8598o[] c8598oArr = this.f19738m;
        if (c8598oArr != null) {
            for (C8598o c8598o : c8598oArr) {
                C8605v c8605v = c8598o.f19722b;
                int iM21380a = AbstractC8827z.m21380a(c8605v.f19777e, j2, false);
                while (true) {
                    i = -1;
                    if (iM21380a < 0) {
                        iM21380a = -1;
                        break;
                    } else if ((c8605v.f19778f[iM21380a] & 1) != 0) {
                        break;
                    } else {
                        iM21380a--;
                    }
                }
                if (iM21380a != -1) {
                    i = iM21380a;
                    break;
                    break;
                }
                iM21380a = AbstractC8827z.m21381a(c8605v.f19777e, j2, true, false);
                while (iM21380a < c8605v.f19777e.length) {
                    if ((c8605v.f19778f[iM21380a] & 1) != 0) {
                        i = iM21380a;
                        break;
                    }
                    iM21380a++;
                }
                c8598o.f19724d = i;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19737l = interfaceC8568j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        return AbstractC8601r.m21144a(c8527b, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19739n;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0218 A[Catch: all -> 0x024c, TRY_LEAVE, TryCatch #0 {all -> 0x024c, blocks: (B:32:0x00ae, B:34:0x00b2, B:36:0x00c1, B:39:0x00d5, B:41:0x00da, B:44:0x00e2, B:45:0x00e9, B:37:0x00cd, B:46:0x00f1, B:48:0x00f5, B:49:0x00fc, B:51:0x0100, B:52:0x0107, B:54:0x010b, B:56:0x0115, B:58:0x0119, B:59:0x0120, B:61:0x0124, B:62:0x012a, B:64:0x012e, B:65:0x0135, B:67:0x0139, B:68:0x0140, B:70:0x0144, B:71:0x014b, B:73:0x014f, B:74:0x0156, B:76:0x015a, B:77:0x0161, B:79:0x0165, B:80:0x016c, B:82:0x0170, B:83:0x0178, B:85:0x017c, B:86:0x0184, B:88:0x0188, B:89:0x018f, B:91:0x0193, B:92:0x019b, B:94:0x019f, B:129:0x0218, B:95:0x01a5, B:97:0x01ad, B:98:0x01b3, B:100:0x01b7, B:103:0x01bd, B:105:0x01c1, B:108:0x01c6, B:110:0x01ca, B:111:0x01d2, B:113:0x01d6, B:114:0x01de, B:116:0x01e2, B:117:0x01ea, B:119:0x01ee, B:120:0x01f6, B:122:0x01fa, B:123:0x0202, B:125:0x0206, B:126:0x020c, B:128:0x0210, B:131:0x0230, B:132:0x0238), top: B:401:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:205:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:207:0x0400 A[ADDED_TO_REGION, ALLOW_MULTIPLE_INSNS_LOOP_COND, LOOP:6: B:207:0x0400->B:210:0x0408, LOOP_START, PHI: r2 r11 r31
  0x0400: PHI (r2v61 long) = (r2v57 long), (r2v65 long) binds: [B:206:0x03fe, B:210:0x0408] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r11v17 int) = (r11v16 int), (r11v29 int) binds: [B:206:0x03fe, B:210:0x0408] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r31v12 long) = (r31v10 long), (r31v14 long) binds: [B:206:0x03fe, B:210:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x0402  */
    /* JADX WARN: Code duplicated, block: B:210:0x0408 A[LOOP:6: B:207:0x0400->B:210:0x0408, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x041d A[ADDED_TO_REGION, LOOP:7: B:215:0x041d->B:217:0x0421, LOOP_START, PHI: r21 r29 r30
  0x041d: PHI (r21v19 int) = (r21v17 int), (r21v21 int) binds: [B:214:0x041b, B:217:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x041d: PHI (r29v16 int) = (r29v9 int), (r29v17 int) binds: [B:214:0x041b, B:217:0x0421] A[DONT_GENERATE, DONT_INLINE]
  0x041d: PHI (r30v10 int) = (r30v6 int), (r30v11 int) binds: [B:214:0x041b, B:217:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x041f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x043a  */
    /* JADX WARN: Code duplicated, block: B:222:0x043d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0447  */
    /* JADX WARN: Code duplicated, block: B:226:0x044a  */
    /* JADX WARN: Code duplicated, block: B:229:0x044f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0455  */
    /* JADX WARN: Code duplicated, block: B:234:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0484 A[ADDED_TO_REGION, LOOP:8: B:239:0x0484->B:242:0x048c, LOOP_START, PHI: r30
  0x0484: PHI (r30v7 int) = (r30v6 int), (r30v8 int) binds: [B:238:0x0482, B:242:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:240:0x0486  */
    /* JADX WARN: Code duplicated, block: B:242:0x048c A[LOOP:8: B:239:0x0484->B:242:0x048c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f9 A[LOOP:14: B:254:0x04f3->B:256:0x04f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0510 A[LOOP:15: B:258:0x050e->B:259:0x0510, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x052f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0543 A[LOOP:17: B:263:0x0541->B:264:0x0543, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x0584  */
    /* JADX WARN: Code duplicated, block: B:297:0x0614  */
    /* JADX WARN: Code duplicated, block: B:299:0x061b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0623  */
    /* JADX WARN: Code duplicated, block: B:304:0x0628 A[LOOP:9: B:302:0x0625->B:304:0x0628, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x065a  */
    /* JADX WARN: Code duplicated, block: B:310:0x065c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0668  */
    /* JADX WARN: Code duplicated, block: B:316:0x0674  */
    /* JADX WARN: Code duplicated, block: B:318:0x069a  */
    /* JADX WARN: Code duplicated, block: B:319:0x069c  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:325:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:326:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:329:0x06be  */
    /* JADX WARN: Code duplicated, block: B:330:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:332:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:333:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:335:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:337:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:338:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:342:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:344:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:346:0x0710  */
    /* JADX WARN: Code duplicated, block: B:347:0x071e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0724  */
    /* JADX WARN: Code duplicated, block: B:352:0x074a  */
    /* JADX WARN: Code duplicated, block: B:357:0x0760  */
    /* JADX WARN: Code duplicated, block: B:362:0x078b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:365:0x0795  */
    /* JADX WARN: Code duplicated, block: B:366:0x0797  */
    /* JADX WARN: Code duplicated, block: B:369:0x079e  */
    /* JADX WARN: Code duplicated, block: B:372:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:407:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:430:0x046f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x06b0 A[EDGE_INSN: B:437:0x06b0->B:323:0x06b0 BREAK  A[LOOP:10: B:312:0x0661->B:322:0x06aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x077e A[EDGE_INSN: B:440:0x077e->B:359:0x077e BREAK  A[LOOP:11: B:340:0x06da->B:358:0x076c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0750 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0218, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:249:0x04a0, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m21142c(long j) throws C8711r {
        C8685b c8685b;
        C8602s c8602sM21131a;
        InterfaceC8588e c8591h;
        boolean z;
        long j2;
        int iM21355m;
        int iM21355m2;
        int iM21355m3;
        C8815n c8815n;
        boolean z2;
        long j3;
        int i;
        long[] jArr;
        int[] iArr;
        int iMo21126b;
        long j4;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        long[] jArr5;
        int i9;
        long j5;
        long j6;
        int i10;
        int i11;
        int i12;
        long[] jArr6;
        C8605v c8605v;
        C8605v c8605v2;
        long[] jArr7;
        long[] jArr8;
        long[] jArr9;
        int[] iArr6;
        int[] iArr7;
        boolean z3;
        int i13;
        int i14;
        int i15;
        boolean z4;
        long[] jArr10;
        C8571m c8571m;
        boolean z5;
        boolean z6;
        long[] jArr11;
        int[] iArr8;
        int[] iArr9;
        long[] jArr12;
        long j7;
        int i16;
        int i17;
        int i18;
        long[] jArr13;
        boolean z7;
        long[] jArr14;
        long[] jArr15;
        int[] iArr10;
        int i19;
        boolean z8;
        boolean z9;
        int[] iArr11;
        long j8;
        long j9;
        long[] jArr16;
        int[] iArr12;
        int[] iArr13;
        long[] jArr17;
        int iM21381a;
        int iM21381a2;
        boolean z10;
        long j10;
        int iM21381a3;
        boolean z11;
        char c;
        int i20;
        long[] jArr18;
        int[] iArr14;
        long[] jArr19;
        int[] iArr15;
        int iM21355m4;
        int iM21355m5;
        int i21;
        C8815n c8815n2;
        int i22;
        int i23;
        int iM21355m6;
        long j11;
        int i24;
        int iM21355m7;
        int iM21340b;
        int i25;
        int i26;
        int iMo21126b2;
        int i27;
        int i28;
        int i29;
        C8571m c8571m2;
        ArrayList arrayList;
        int i30;
        C8685b c8685b2;
        AbstractC8700o abstractC8700o;
        AbstractC8700o abstractC8700oM21141b;
        AbstractC8700o abstractC8700oM21136a;
        int iM21352j;
        String str;
        while (!this.f19729d.isEmpty() && ((C8584a) this.f19729d.peek()).f19524P0 == j) {
            C8584a c8584a = (C8584a) this.f19729d.pop();
            if (c8584a.f19620a == AbstractC8586c.f19532C) {
                ArrayList arrayList2 = new ArrayList();
                C8571m c8571m3 = new C8571m();
                C8585b c8585bM21122c = c8584a.m21122c(AbstractC8586c.f19529A0);
                int i31 = 12;
                boolean z12 = true;
                if (c8585bM21122c != null) {
                    boolean z13 = this.f19740o;
                    int i32 = AbstractC8592i.f19642a;
                    if (z13) {
                        c8685b2 = null;
                        break;
                    }
                    C8815n c8815n3 = c8585bM21122c.f19527P0;
                    char c2 = '\b';
                    c8815n3.m21347e(8);
                    while (true) {
                        int i33 = c8815n3.f20645c;
                        int i34 = c8815n3.f20644b;
                        if (i33 - i34 >= 8) {
                            int iM21340b2 = c8815n3.m21340b();
                            if (c8815n3.m21340b() == AbstractC8586c.f19531B0) {
                                c8815n3.m21347e(i34);
                                int i35 = i34 + iM21340b2;
                                c8815n3.m21347e(c8815n3.f20644b + i31);
                                while (true) {
                                    int i36 = c8815n3.f20644b;
                                    if (i36 < i35) {
                                        int iM21340b3 = c8815n3.m21340b();
                                        char c3 = c2;
                                        if (c8815n3.m21340b() == AbstractC8586c.f19533C0) {
                                            c8815n3.m21347e(i36);
                                            int i37 = i36 + iM21340b3;
                                            c8815n3.m21347e(c8815n3.f20644b + 8);
                                            ArrayList arrayList3 = new ArrayList();
                                            while (true) {
                                                int i38 = c8815n3.f20644b;
                                                if (i38 >= i37) {
                                                    break;
                                                }
                                                int i39 = AbstractC8597n.f19695a;
                                                int iM21340b4 = c8815n3.m21340b() + i38;
                                                int iM21340b5 = c8815n3.m21340b();
                                                int i40 = (iM21340b5 >> 24) & 255;
                                                if (i40 == 169 || i40 == 65533) {
                                                    int i41 = 16777215 & iM21340b5;
                                                    if (i41 == AbstractC8597n.f19697c) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21137a(iM21340b5, c8815n3);
                                                    } else if (i41 == AbstractC8597n.f19695a || i41 == AbstractC8597n.f19696b) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TIT2");
                                                    } else if (i41 == AbstractC8597n.f19702h || i41 == AbstractC8597n.f19703i) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TCOM");
                                                    } else if (i41 == AbstractC8597n.f19698d) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TDRC");
                                                    } else if (i41 == AbstractC8597n.f19699e) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TPE1");
                                                    } else if (i41 == AbstractC8597n.f19700f) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSSE");
                                                    } else if (i41 == AbstractC8597n.f19701g) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TALB");
                                                    } else if (i41 == AbstractC8597n.f19704j) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "USLT");
                                                    } else if (i41 == AbstractC8597n.f19705k) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TCON");
                                                    } else if (i41 == AbstractC8597n.f19708n) {
                                                        abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TIT1");
                                                    } else {
                                                        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC8586c.m21123a(iM21340b5));
                                                        c8815n3.m21347e(iM21340b4);
                                                        abstractC8700o = null;
                                                    }
                                                    abstractC8700oM21136a = abstractC8700oM21141b;
                                                    c8815n3.m21347e(iM21340b4);
                                                    abstractC8700o = abstractC8700oM21136a;
                                                } else {
                                                    try {
                                                        if (iM21340b5 == AbstractC8597n.f19707m) {
                                                            c8815n3.m21347e(c8815n3.f20644b + 4);
                                                            if (c8815n3.m21340b() == AbstractC8586c.f19539F0) {
                                                                c8815n3.m21347e(c8815n3.f20644b + 8);
                                                                iM21352j = c8815n3.m21352j();
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                                iM21352j = -1;
                                                            }
                                                            if (iM21352j > 0) {
                                                                String[] strArr = AbstractC8597n.f19694D;
                                                                if (iM21352j <= strArr.length) {
                                                                    str = strArr[iM21352j - 1];
                                                                } else {
                                                                    str = null;
                                                                }
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (str != null) {
                                                                abstractC8700oM21136a = new C8704s("TCON", null, str);
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                abstractC8700oM21136a = null;
                                                            }
                                                        } else {
                                                            if (iM21340b5 == AbstractC8597n.f19709o) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21139a(iM21340b5, c8815n3, "TPOS");
                                                            } else if (iM21340b5 == AbstractC8597n.f19710p) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21139a(iM21340b5, c8815n3, "TRCK");
                                                            } else if (iM21340b5 == AbstractC8597n.f19711q) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21138a(iM21340b5, "TBPM", c8815n3, true, false);
                                                            } else if (iM21340b5 == AbstractC8597n.f19712r) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21138a(iM21340b5, "TCMP", c8815n3, true, true);
                                                            } else if (iM21340b5 == AbstractC8597n.f19706l) {
                                                                abstractC8700oM21136a = AbstractC8597n.m21136a(c8815n3);
                                                            } else if (iM21340b5 == AbstractC8597n.f19713s) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TPE2");
                                                            } else if (iM21340b5 == AbstractC8597n.f19714t) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSOT");
                                                            } else if (iM21340b5 == AbstractC8597n.f19715u) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSO2");
                                                            } else if (iM21340b5 == AbstractC8597n.f19716v) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSOA");
                                                            } else if (iM21340b5 == AbstractC8597n.f19717w) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSOP");
                                                            } else if (iM21340b5 == AbstractC8597n.f19718x) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TSOC");
                                                            } else if (iM21340b5 == AbstractC8597n.f19719y) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21138a(iM21340b5, "ITUNESADVISORY", c8815n3, false, false);
                                                            } else if (iM21340b5 == AbstractC8597n.f19720z) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21138a(iM21340b5, "ITUNESGAPLESS", c8815n3, false, true);
                                                            } else if (iM21340b5 == AbstractC8597n.f19691A) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TVSHOWSORT");
                                                            } else if (iM21340b5 == AbstractC8597n.f19692B) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21141b(iM21340b5, c8815n3, "TVSHOW");
                                                            } else if (iM21340b5 == AbstractC8597n.f19693C) {
                                                                abstractC8700oM21141b = AbstractC8597n.m21140b(iM21340b4, c8815n3);
                                                            } else {
                                                                Log.d("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC8586c.m21123a(iM21340b5));
                                                                c8815n3.m21347e(iM21340b4);
                                                                abstractC8700o = null;
                                                            }
                                                            abstractC8700oM21136a = abstractC8700oM21141b;
                                                        }
                                                        c8815n3.m21347e(iM21340b4);
                                                        abstractC8700o = abstractC8700oM21136a;
                                                    } catch (Throwable th) {
                                                        c8815n3.m21347e(iM21340b4);
                                                        throw th;
                                                    }
                                                }
                                                if (abstractC8700o != null) {
                                                    arrayList3.add(abstractC8700o);
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                c8685b2 = new C8685b(arrayList3);
                                                break;
                                            }
                                            break;
                                        }
                                        c8815n3.m21347e(c8815n3.f20644b + (iM21340b3 - 8));
                                        c2 = c3;
                                    }
                                }
                            } else {
                                c8815n3.m21347e(c8815n3.f20644b + (iM21340b2 - 8));
                                i31 = 12;
                            }
                        }
                        c8685b2 = null;
                        break;
                    }
                    if (c8685b2 != null) {
                        c8571m3.m21109a(c8685b2);
                    }
                    c8685b = c8685b2;
                } else {
                    c8685b = null;
                }
                long j12 = -9223372036854775807L;
                long j13 = Long.MAX_VALUE;
                int i42 = 0;
                while (i42 < c8584a.f19526R0.size()) {
                    C8584a c8584a2 = (C8584a) c8584a.f19526R0.get(i42);
                    if (c8584a2.f19620a == AbstractC8586c.f19536E && (c8602sM21131a = AbstractC8592i.m21131a(c8584a2, c8584a.m21122c(AbstractC8586c.f19534D), -9223372036854775807L, (C8524d) null, this.f19740o)) != null) {
                        C8584a c8584aM21121b = c8584a2.m21121b(AbstractC8586c.f19538F).m21121b(AbstractC8586c.f19540G).m21121b(AbstractC8586c.f19542H);
                        C8585b c8585bM21122c2 = c8584aM21121b.m21122c(AbstractC8586c.f19601q0);
                        if (c8585bM21122c2 != null) {
                            c8591h = new C8590g(c8585bM21122c2);
                        } else {
                            C8585b c8585bM21122c3 = c8584aM21121b.m21122c(AbstractC8586c.f19603r0);
                            if (c8585bM21122c3 == null) {
                                throw new C8711r("Track has no sample table size information");
                            }
                            c8591h = new C8591h(c8585bM21122c3);
                        }
                        int iMo21125a = c8591h.mo21125a();
                        if (iMo21125a == 0) {
                            c8584a = c8584a;
                            j3 = j12;
                            arrayList2 = arrayList2;
                            c8571m3 = c8571m3;
                            i42 = i42;
                            j2 = j13;
                            c8605v2 = new C8605v(new long[0], new int[0], 0, new long[0], new int[0]);
                        } else {
                            C8585b c8585bM21122c4 = c8584aM21121b.m21122c(AbstractC8586c.f19605s0);
                            if (c8585bM21122c4 == null) {
                                c8585bM21122c4 = c8584aM21121b.m21122c(AbstractC8586c.f19607t0);
                                z = z12;
                            } else {
                                z = false;
                            }
                            C8815n c8815n4 = c8585bM21122c4.f19527P0;
                            boolean z14 = z12;
                            C8815n c8815n5 = c8584aM21121b.m21122c(AbstractC8586c.f19599p0).f19527P0;
                            j2 = j13;
                            C8815n c8815n6 = c8584aM21121b.m21122c(AbstractC8586c.f19593m0).f19527P0;
                            C8585b c8585bM21122c5 = c8584aM21121b.m21122c(AbstractC8586c.f19595n0);
                            C8815n c8815n7 = c8585bM21122c5 != null ? c8585bM21122c5.f19527P0 : null;
                            InterfaceC8588e interfaceC8588e = c8591h;
                            C8585b c8585bM21122c6 = c8584aM21121b.m21122c(AbstractC8586c.f19597o0);
                            C8815n c8815n8 = c8585bM21122c6 != null ? c8585bM21122c6.f19527P0 : null;
                            C8587d c8587d = new C8587d(c8815n5, c8815n4, z);
                            c8815n6.m21347e(12);
                            int iM21355m8 = c8815n6.m21355m() - 1;
                            int iM21355m9 = c8815n6.m21355m();
                            int iM21355m10 = c8815n6.m21355m();
                            if (c8815n8 != null) {
                                c8815n8.m21347e(12);
                                iM21355m = c8815n8.m21355m();
                            } else {
                                iM21355m = 0;
                            }
                            if (c8815n7 != null) {
                                c8815n7.m21347e(12);
                                iM21355m2 = c8815n7.m21355m();
                                if (iM21355m2 > 0) {
                                    iM21355m3 = c8815n7.m21355m() - 1;
                                } else {
                                    c8815n7 = null;
                                }
                                if (interfaceC8588e.mo21127c()) {
                                    c8815n = c8815n8;
                                    if (!"audio/raw".equals(c8602sM21131a.f19747f.f20295f) && iM21355m8 == 0 && iM21355m == 0 && iM21355m2 == 0) {
                                        z2 = z14 ? 1 : 0;
                                    }
                                    if (z2) {
                                        j3 = j12;
                                        i = c8587d.f19621a;
                                        jArr = new long[i];
                                        iArr = new int[i];
                                        while (c8587d.m21124a()) {
                                            int i43 = c8587d.f19622b;
                                            jArr[i43] = c8587d.f19624d;
                                            iArr[i43] = c8587d.f19623c;
                                        }
                                        iMo21126b = interfaceC8588e.mo21126b();
                                        j4 = iM21355m10;
                                        i2 = 8192 / iMo21126b;
                                        i4 = 0;
                                        for (i3 = 0; i3 < i; i3++) {
                                            int i44 = iArr[i3];
                                            int i45 = AbstractC8827z.f20671a;
                                            i4 += ((i44 + i2) - 1) / i2;
                                        }
                                        jArr2 = new long[i4];
                                        iArr2 = new int[i4];
                                        jArr3 = new long[i4];
                                        iArr3 = new int[i4];
                                        i5 = 0;
                                        i6 = 0;
                                        i7 = 0;
                                        i8 = 0;
                                        while (i5 < i) {
                                            int i46 = iArr[i5];
                                            j6 = jArr[i5];
                                            int[] iArr16 = iArr;
                                            i10 = i46;
                                            int i47 = i;
                                            i11 = i6;
                                            int i48 = i5;
                                            i12 = i8;
                                            while (i10 > 0) {
                                                int iMin = Math.min(i2, i10);
                                                jArr2[i7] = j6;
                                                int i49 = i10;
                                                int i50 = iMo21126b * iMin;
                                                iArr2[i7] = i50;
                                                int iMax = Math.max(i12, i50);
                                                jArr3[i7] = ((long) i11) * j4;
                                                iArr3[i7] = z14 ? 1 : 0;
                                                j6 += (long) iArr2[i7];
                                                i11 += iMin;
                                                i10 = i49 - iMin;
                                                i7++;
                                                i12 = iMax;
                                            }
                                            int i51 = i48 + 1;
                                            i6 = i11;
                                            i8 = i12;
                                            i5 = i51;
                                            iArr = iArr16;
                                            i = i47;
                                        }
                                        jArr4 = jArr2;
                                        iArr4 = iArr3;
                                        iArr5 = iArr2;
                                        jArr5 = jArr3;
                                        i9 = i8;
                                        j5 = 0;
                                    } else {
                                        jArr18 = new long[iMo21125a];
                                        iArr14 = new int[iMo21125a];
                                        jArr19 = new long[iMo21125a];
                                        iArr15 = new int[iMo21125a];
                                        iM21355m4 = iM21355m9;
                                        iM21355m5 = iM21355m10;
                                        c8815n2 = c8815n7;
                                        i22 = iM21355m;
                                        i23 = iM21355m2;
                                        iM21355m6 = iM21355m3;
                                        j11 = 0;
                                        j5 = 0;
                                        i24 = 0;
                                        iM21355m7 = 0;
                                        iM21340b = 0;
                                        i25 = 0;
                                        i26 = 0;
                                        while (i25 < iMo21125a) {
                                            while (i26 == 0) {
                                                if (c8587d.m21124a()) {
                                                    throw new IllegalStateException();
                                                }
                                                long j14 = j12;
                                                long j15 = c8587d.f19624d;
                                                i26 = c8587d.f19623c;
                                                j11 = j15;
                                                j12 = j14;
                                            }
                                            long j16 = j12;
                                            if (c8815n != null) {
                                                while (iM21355m7 == 0 && i22 > 0) {
                                                    iM21355m7 = c8815n.m21355m();
                                                    iM21340b = c8815n.m21340b();
                                                    i22--;
                                                }
                                                iM21355m7--;
                                            }
                                            int i52 = iM21340b;
                                            jArr18[i25] = j11;
                                            iMo21126b2 = interfaceC8588e.mo21126b();
                                            iArr14[i25] = iMo21126b2;
                                            if (iMo21126b2 > i24) {
                                                i27 = iMo21126b2;
                                            } else {
                                                i27 = i24;
                                            }
                                            int i53 = i26;
                                            jArr19[i25] = j5 + ((long) i52);
                                            if (c8815n2 == null) {
                                                i28 = z14 ? 1 : 0;
                                            } else {
                                                i28 = 0;
                                            }
                                            iArr15[i25] = i28;
                                            if (i25 == iM21355m6) {
                                                iArr15[i25] = z14 ? 1 : 0;
                                                i23--;
                                                if (i23 > 0) {
                                                    iM21355m6 = c8815n2.m21355m() - 1;
                                                }
                                            }
                                            j5 += (long) iM21355m5;
                                            iM21355m4--;
                                            if (iM21355m4 != 0 && i21 > 0) {
                                                iM21355m4 = c8815n6.m21355m();
                                                i21--;
                                                iM21355m5 = c8815n6.m21355m();
                                            }
                                            j11 += (long) iArr14[i25];
                                            i26 = i53 - 1;
                                            i25++;
                                            i24 = i27;
                                            iM21340b = i52;
                                            j12 = j16;
                                        }
                                        i21 = iM21355m8;
                                        j3 = j12;
                                        if (iM21355m7 == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        while (i22 > 0) {
                                            if (c8815n.m21355m() == 0) {
                                                throw new IllegalArgumentException();
                                            }
                                            c8815n.m21340b();
                                            i22--;
                                        }
                                        if (i23 == 0 || iM21355m4 != 0 || i26 != 0 || i21 != 0) {
                                            Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                        }
                                        i9 = i24;
                                        iArr4 = iArr15;
                                        iArr5 = iArr14;
                                        jArr5 = jArr19;
                                        jArr4 = jArr18;
                                    }
                                    jArr6 = c8602sM21131a.f19750i;
                                    if (jArr6 != null || (c8571m3.f19383a != -1 && c8571m3.f19384b != -1)) {
                                        long[] jArr20 = jArr5;
                                        AbstractC8827z.m21385a(jArr20, c8602sM21131a.f19744c);
                                        c8605v = new C8605v(jArr4, iArr5, i9, jArr20, iArr4);
                                    } else if (jArr6.length == z14 && c8602sM21131a.f19743b == z14 && jArr5.length >= 2) {
                                        long j17 = c8602sM21131a.f19751j[0];
                                        long jM21382a = AbstractC8827z.m21382a(jArr6[0], c8602sM21131a.f19744c, c8602sM21131a.f19745d) + j17;
                                        long j18 = jArr5[0];
                                        if (j18 > j17 || j17 >= jArr5[1] || jArr5[jArr5.length - 1] >= jM21382a || jM21382a > j5) {
                                            jArr7 = jArr5;
                                            jArr8 = c8602sM21131a.f19750i;
                                            if (jArr8.length == 1) {
                                                c = 0;
                                                if (jArr8[0] == 0) {
                                                    i20 = 0;
                                                    while (i20 < jArr7.length) {
                                                        jArr7[i20] = AbstractC8827z.m21382a(jArr7[i20] - c8602sM21131a.f19751j[c], 1000000L, c8602sM21131a.f19744c);
                                                        i20++;
                                                        c = 0;
                                                    }
                                                    c8605v = new C8605v(jArr4, iArr5, i9, jArr7, iArr4);
                                                }
                                            }
                                            jArr9 = jArr4;
                                            iArr6 = iArr5;
                                            iArr7 = iArr4;
                                            if (c8602sM21131a.f19743b == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            i13 = 0;
                                            i14 = 0;
                                            i15 = 0;
                                            z4 = false;
                                            while (true) {
                                                jArr10 = c8602sM21131a.f19750i;
                                                if (i13 >= jArr10.length) {
                                                    break;
                                                    break;
                                                }
                                                z10 = z4;
                                                j10 = c8602sM21131a.f19751j[i13];
                                                if (j10 != -1) {
                                                    long jM21382a2 = AbstractC8827z.m21382a(jArr10[i13], c8602sM21131a.f19744c, c8602sM21131a.f19745d);
                                                    iM21381a3 = AbstractC8827z.m21381a(jArr7, j10, true, true);
                                                    int iM21381a4 = AbstractC8827z.m21381a(jArr7, j10 + jM21382a2, z3, false);
                                                    int i54 = (iM21381a4 - iM21381a3) + i14;
                                                    if (i15 != iM21381a3) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    z4 = z10 | z11;
                                                    i15 = iM21381a4;
                                                    i14 = i54;
                                                } else {
                                                    z4 = z10;
                                                }
                                                i13++;
                                                c8571m3 = c8571m3;
                                                i42 = i42;
                                            }
                                            c8571m = c8571m3;
                                            i42 = i42;
                                            boolean z15 = z4;
                                            if (i14 != iMo21125a) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            z6 = z15 | z5;
                                            if (z6) {
                                                jArr11 = new long[i14];
                                            } else {
                                                jArr11 = jArr9;
                                            }
                                            if (z6) {
                                                iArr8 = new int[i14];
                                            } else {
                                                iArr8 = iArr6;
                                            }
                                            if (z6) {
                                                i9 = 0;
                                            }
                                            if (z6) {
                                                iArr9 = new int[i14];
                                            } else {
                                                iArr9 = iArr7;
                                            }
                                            jArr12 = new long[i14];
                                            j7 = 0;
                                            i16 = i9;
                                            i17 = 0;
                                            i18 = 0;
                                            while (true) {
                                                jArr13 = c8602sM21131a.f19750i;
                                                z7 = z6;
                                                if (i17 >= jArr13.length) {
                                                    break;
                                                    break;
                                                }
                                                iArr11 = iArr7;
                                                j8 = c8602sM21131a.f19751j[i17];
                                                j9 = jArr13[i17];
                                                jArr16 = jArr12;
                                                if (j8 != -1) {
                                                    long jM21382a3 = AbstractC8827z.m21382a(j9, c8602sM21131a.f19744c, c8602sM21131a.f19745d) + j8;
                                                    iM21381a = AbstractC8827z.m21381a(jArr7, j8, true, true);
                                                    iM21381a2 = AbstractC8827z.m21381a(jArr7, jM21382a3, z3, false);
                                                    if (z7) {
                                                        int i55 = iM21381a2 - iM21381a;
                                                        System.arraycopy(jArr9, iM21381a, jArr11, i18, i55);
                                                        System.arraycopy(iArr6, iM21381a, iArr8, i18, i55);
                                                        iArr12 = iArr11;
                                                        System.arraycopy(iArr12, iM21381a, iArr9, i18, i55);
                                                    } else {
                                                        iArr12 = iArr11;
                                                    }
                                                    int i56 = i16;
                                                    while (iM21381a < iM21381a2) {
                                                        long[] jArr21 = jArr11;
                                                        int[] iArr17 = iArr8;
                                                        jArr16[i18] = AbstractC8827z.m21382a(j7, 1000000L, c8602sM21131a.f19745d) + AbstractC8827z.m21382a(jArr7[iM21381a] - j8, 1000000L, c8602sM21131a.f19744c);
                                                        if (!z7) {
                                                        }
                                                        i18++;
                                                        iM21381a++;
                                                        jArr11 = jArr21;
                                                        iArr8 = iArr17;
                                                    }
                                                    i16 = i56;
                                                    jArr17 = jArr11;
                                                    iArr13 = iArr8;
                                                } else {
                                                    iArr12 = iArr11;
                                                    iArr13 = iArr8;
                                                    jArr17 = jArr11;
                                                }
                                                j7 += j9;
                                                iArr7 = iArr12;
                                                jArr11 = jArr17;
                                                iArr8 = iArr13;
                                                jArr12 = jArr16;
                                                c8571m = c8571m;
                                                i17++;
                                                z6 = z7;
                                            }
                                            jArr14 = jArr12;
                                            jArr15 = jArr11;
                                            iArr10 = iArr8;
                                            c8571m3 = c8571m;
                                            z8 = false;
                                            for (int i57 : iArr9) {
                                                if ((i57 & 1) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                z8 |= z9;
                                            }
                                            if (!z8) {
                                                throw new C8711r("The edited sample sequence does not contain a sync sample.");
                                            }
                                            c8605v2 = new C8605v(jArr15, iArr10, i16, jArr14, iArr9);
                                        } else {
                                            long jM21382a4 = AbstractC8827z.m21382a(j17 - j18, c8602sM21131a.f19747f.f20308s, c8602sM21131a.f19744c);
                                            long jM21382a5 = AbstractC8827z.m21382a(j5 - jM21382a, c8602sM21131a.f19747f.f20308s, c8602sM21131a.f19744c);
                                            if (!(jM21382a4 == 0 && jM21382a5 == 0) && jM21382a4 <= 2147483647L && jM21382a5 <= 2147483647L) {
                                                c8571m3.f19383a = (int) jM21382a4;
                                                c8571m3.f19384b = (int) jM21382a5;
                                                AbstractC8827z.m21385a(jArr5, c8602sM21131a.f19744c);
                                                c8605v = new C8605v(jArr4, iArr5, i9, jArr5, iArr4);
                                            } else {
                                                jArr7 = jArr5;
                                                jArr8 = c8602sM21131a.f19750i;
                                                if (jArr8.length == 1) {
                                                    c = 0;
                                                    if (jArr8[0] == 0) {
                                                        i20 = 0;
                                                        while (i20 < jArr7.length) {
                                                            jArr7[i20] = AbstractC8827z.m21382a(jArr7[i20] - c8602sM21131a.f19751j[c], 1000000L, c8602sM21131a.f19744c);
                                                            i20++;
                                                            c = 0;
                                                        }
                                                        c8605v = new C8605v(jArr4, iArr5, i9, jArr7, iArr4);
                                                    }
                                                }
                                                jArr9 = jArr4;
                                                iArr6 = iArr5;
                                                iArr7 = iArr4;
                                                if (c8602sM21131a.f19743b == 1) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                i13 = 0;
                                                i14 = 0;
                                                i15 = 0;
                                                z4 = false;
                                                while (true) {
                                                    jArr10 = c8602sM21131a.f19750i;
                                                    if (i13 >= jArr10.length) {
                                                        break;
                                                        break;
                                                    }
                                                    z10 = z4;
                                                    j10 = c8602sM21131a.f19751j[i13];
                                                    if (j10 != -1) {
                                                        long jM21382a6 = AbstractC8827z.m21382a(jArr10[i13], c8602sM21131a.f19744c, c8602sM21131a.f19745d);
                                                        iM21381a3 = AbstractC8827z.m21381a(jArr7, j10, true, true);
                                                        int iM21381a5 = AbstractC8827z.m21381a(jArr7, j10 + jM21382a6, z3, false);
                                                        int i58 = (iM21381a5 - iM21381a3) + i14;
                                                        if (i15 != iM21381a3) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        z4 = z10 | z11;
                                                        i15 = iM21381a5;
                                                        i14 = i58;
                                                    } else {
                                                        z4 = z10;
                                                    }
                                                    i13++;
                                                    c8571m3 = c8571m3;
                                                    i42 = i42;
                                                }
                                                c8571m = c8571m3;
                                                i42 = i42;
                                                boolean z16 = z4;
                                                if (i14 != iMo21125a) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                z6 = z16 | z5;
                                                if (z6) {
                                                    jArr11 = new long[i14];
                                                } else {
                                                    jArr11 = jArr9;
                                                }
                                                if (z6) {
                                                    iArr8 = new int[i14];
                                                } else {
                                                    iArr8 = iArr6;
                                                }
                                                if (z6) {
                                                    i9 = 0;
                                                }
                                                if (z6) {
                                                    iArr9 = new int[i14];
                                                } else {
                                                    iArr9 = iArr7;
                                                }
                                                jArr12 = new long[i14];
                                                j7 = 0;
                                                i16 = i9;
                                                i17 = 0;
                                                i18 = 0;
                                                while (true) {
                                                    jArr13 = c8602sM21131a.f19750i;
                                                    z7 = z6;
                                                    if (i17 >= jArr13.length) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr11 = iArr7;
                                                    j8 = c8602sM21131a.f19751j[i17];
                                                    j9 = jArr13[i17];
                                                    jArr16 = jArr12;
                                                    if (j8 != -1) {
                                                        long jM21382a7 = AbstractC8827z.m21382a(j9, c8602sM21131a.f19744c, c8602sM21131a.f19745d) + j8;
                                                        iM21381a = AbstractC8827z.m21381a(jArr7, j8, true, true);
                                                        iM21381a2 = AbstractC8827z.m21381a(jArr7, jM21382a7, z3, false);
                                                        if (z7) {
                                                            int i59 = iM21381a2 - iM21381a;
                                                            System.arraycopy(jArr9, iM21381a, jArr11, i18, i59);
                                                            System.arraycopy(iArr6, iM21381a, iArr8, i18, i59);
                                                            iArr12 = iArr11;
                                                            System.arraycopy(iArr12, iM21381a, iArr9, i18, i59);
                                                        } else {
                                                            iArr12 = iArr11;
                                                        }
                                                        int i510 = i16;
                                                        while (iM21381a < iM21381a2) {
                                                            long[] jArr22 = jArr11;
                                                            int[] iArr18 = iArr8;
                                                            jArr16[i18] = AbstractC8827z.m21382a(j7, 1000000L, c8602sM21131a.f19745d) + AbstractC8827z.m21382a(jArr7[iM21381a] - j8, 1000000L, c8602sM21131a.f19744c);
                                                            if (!z7) {
                                                            }
                                                            i18++;
                                                            iM21381a++;
                                                            jArr11 = jArr22;
                                                            iArr8 = iArr18;
                                                        }
                                                        i16 = i510;
                                                        jArr17 = jArr11;
                                                        iArr13 = iArr8;
                                                    } else {
                                                        iArr12 = iArr11;
                                                        iArr13 = iArr8;
                                                        jArr17 = jArr11;
                                                    }
                                                    j7 += j9;
                                                    iArr7 = iArr12;
                                                    jArr11 = jArr17;
                                                    iArr8 = iArr13;
                                                    jArr12 = jArr16;
                                                    c8571m = c8571m;
                                                    i17++;
                                                    z6 = z7;
                                                }
                                                jArr14 = jArr12;
                                                jArr15 = jArr11;
                                                iArr10 = iArr8;
                                                c8571m3 = c8571m;
                                                z8 = false;
                                                while (i19 < iArr9.length) {
                                                    if ((i57 & 1) != 0) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    z8 |= z9;
                                                }
                                                if (!z8) {
                                                    throw new C8711r("The edited sample sequence does not contain a sync sample.");
                                                }
                                                c8605v2 = new C8605v(jArr15, iArr10, i16, jArr14, iArr9);
                                            }
                                        }
                                    } else {
                                        jArr7 = jArr5;
                                        jArr8 = c8602sM21131a.f19750i;
                                        if (jArr8.length == 1) {
                                            c = 0;
                                            if (jArr8[0] == 0) {
                                                i20 = 0;
                                                while (i20 < jArr7.length) {
                                                    jArr7[i20] = AbstractC8827z.m21382a(jArr7[i20] - c8602sM21131a.f19751j[c], 1000000L, c8602sM21131a.f19744c);
                                                    i20++;
                                                    c = 0;
                                                }
                                                c8605v = new C8605v(jArr4, iArr5, i9, jArr7, iArr4);
                                            }
                                        }
                                        jArr9 = jArr4;
                                        iArr6 = iArr5;
                                        iArr7 = iArr4;
                                        if (c8602sM21131a.f19743b == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                        i15 = 0;
                                        z4 = false;
                                        while (true) {
                                            jArr10 = c8602sM21131a.f19750i;
                                            if (i13 >= jArr10.length) {
                                                break;
                                            }
                                            z10 = z4;
                                            j10 = c8602sM21131a.f19751j[i13];
                                            if (j10 != -1) {
                                                long jM21382a8 = AbstractC8827z.m21382a(jArr10[i13], c8602sM21131a.f19744c, c8602sM21131a.f19745d);
                                                iM21381a3 = AbstractC8827z.m21381a(jArr7, j10, true, true);
                                                int iM21381a6 = AbstractC8827z.m21381a(jArr7, j10 + jM21382a8, z3, false);
                                                int i511 = (iM21381a6 - iM21381a3) + i14;
                                                if (i15 != iM21381a3) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                z4 = z10 | z11;
                                                i15 = iM21381a6;
                                                i14 = i511;
                                            } else {
                                                z4 = z10;
                                            }
                                            i13++;
                                            c8571m3 = c8571m3;
                                            i42 = i42;
                                        }
                                        c8571m = c8571m3;
                                        i42 = i42;
                                        boolean z17 = z4;
                                        if (i14 != iMo21125a) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        z6 = z17 | z5;
                                        if (z6) {
                                            jArr11 = new long[i14];
                                        } else {
                                            jArr11 = jArr9;
                                        }
                                        if (z6) {
                                            iArr8 = new int[i14];
                                        } else {
                                            iArr8 = iArr6;
                                        }
                                        if (z6) {
                                            i9 = 0;
                                        }
                                        if (z6) {
                                            iArr9 = new int[i14];
                                        } else {
                                            iArr9 = iArr7;
                                        }
                                        jArr12 = new long[i14];
                                        j7 = 0;
                                        i16 = i9;
                                        i17 = 0;
                                        i18 = 0;
                                        while (true) {
                                            jArr13 = c8602sM21131a.f19750i;
                                            z7 = z6;
                                            if (i17 >= jArr13.length) {
                                                break;
                                            }
                                            iArr11 = iArr7;
                                            j8 = c8602sM21131a.f19751j[i17];
                                            j9 = jArr13[i17];
                                            jArr16 = jArr12;
                                            if (j8 != -1) {
                                                long jM21382a9 = AbstractC8827z.m21382a(j9, c8602sM21131a.f19744c, c8602sM21131a.f19745d) + j8;
                                                iM21381a = AbstractC8827z.m21381a(jArr7, j8, true, true);
                                                iM21381a2 = AbstractC8827z.m21381a(jArr7, jM21382a9, z3, false);
                                                if (z7) {
                                                    int i512 = iM21381a2 - iM21381a;
                                                    System.arraycopy(jArr9, iM21381a, jArr11, i18, i512);
                                                    System.arraycopy(iArr6, iM21381a, iArr8, i18, i512);
                                                    iArr12 = iArr11;
                                                    System.arraycopy(iArr12, iM21381a, iArr9, i18, i512);
                                                } else {
                                                    iArr12 = iArr11;
                                                }
                                                int i513 = i16;
                                                while (iM21381a < iM21381a2) {
                                                    long[] jArr23 = jArr11;
                                                    int[] iArr19 = iArr8;
                                                    jArr16[i18] = AbstractC8827z.m21382a(j7, 1000000L, c8602sM21131a.f19745d) + AbstractC8827z.m21382a(jArr7[iM21381a] - j8, 1000000L, c8602sM21131a.f19744c);
                                                    if (!z7 && iArr19[i18] > i513) {
                                                        i513 = iArr6[iM21381a];
                                                    }
                                                    i18++;
                                                    iM21381a++;
                                                    jArr11 = jArr23;
                                                    iArr8 = iArr19;
                                                }
                                                i16 = i513;
                                                jArr17 = jArr11;
                                                iArr13 = iArr8;
                                            } else {
                                                iArr12 = iArr11;
                                                iArr13 = iArr8;
                                                jArr17 = jArr11;
                                            }
                                            j7 += j9;
                                            iArr7 = iArr12;
                                            jArr11 = jArr17;
                                            iArr8 = iArr13;
                                            jArr12 = jArr16;
                                            c8571m = c8571m;
                                            i17++;
                                            z6 = z7;
                                        }
                                        jArr14 = jArr12;
                                        jArr15 = jArr11;
                                        iArr10 = iArr8;
                                        c8571m3 = c8571m;
                                        z8 = false;
                                        while (i19 < iArr9.length && !z8) {
                                            if ((i57 & 1) != 0) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            z8 |= z9;
                                        }
                                        if (!z8) {
                                            throw new C8711r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        c8605v2 = new C8605v(jArr15, iArr10, i16, jArr14, iArr9);
                                    }
                                    c8605v2 = c8605v;
                                } else {
                                    c8815n = c8815n8;
                                }
                                z2 = false;
                                if (z2) {
                                    jArr18 = new long[iMo21125a];
                                    iArr14 = new int[iMo21125a];
                                    jArr19 = new long[iMo21125a];
                                    iArr15 = new int[iMo21125a];
                                    iM21355m4 = iM21355m9;
                                    iM21355m5 = iM21355m10;
                                    c8815n2 = c8815n7;
                                    i22 = iM21355m;
                                    i23 = iM21355m2;
                                    iM21355m6 = iM21355m3;
                                    j11 = 0;
                                    j5 = 0;
                                    i24 = 0;
                                    iM21355m7 = 0;
                                    iM21340b = 0;
                                    i25 = 0;
                                    i26 = 0;
                                    while (i25 < iMo21125a) {
                                        while (i26 == 0) {
                                            if (c8587d.m21124a()) {
                                                throw new IllegalStateException();
                                            }
                                            long j19 = j12;
                                            long j110 = c8587d.f19624d;
                                            i26 = c8587d.f19623c;
                                            j11 = j110;
                                            j12 = j19;
                                        }
                                        long j111 = j12;
                                        if (c8815n != null) {
                                            while (iM21355m7 == 0) {
                                                iM21355m7 = c8815n.m21355m();
                                                iM21340b = c8815n.m21340b();
                                                i22--;
                                            }
                                            iM21355m7--;
                                        }
                                        int i514 = iM21340b;
                                        jArr18[i25] = j11;
                                        iMo21126b2 = interfaceC8588e.mo21126b();
                                        iArr14[i25] = iMo21126b2;
                                        if (iMo21126b2 > i24) {
                                            i27 = iMo21126b2;
                                        } else {
                                            i27 = i24;
                                        }
                                        int i515 = i26;
                                        jArr19[i25] = j5 + ((long) i514);
                                        if (c8815n2 == null) {
                                            i28 = z14 ? 1 : 0;
                                        } else {
                                            i28 = 0;
                                        }
                                        iArr15[i25] = i28;
                                        if (i25 == iM21355m6) {
                                            iArr15[i25] = z14 ? 1 : 0;
                                            i23--;
                                            if (i23 > 0) {
                                                iM21355m6 = c8815n2.m21355m() - 1;
                                            }
                                        }
                                        j5 += (long) iM21355m5;
                                        iM21355m4--;
                                        if (iM21355m4 != 0) {
                                        }
                                        j11 += (long) iArr14[i25];
                                        i26 = i515 - 1;
                                        i25++;
                                        i24 = i27;
                                        iM21340b = i514;
                                        j12 = j111;
                                    }
                                    i21 = iM21355m8;
                                    j3 = j12;
                                    if (iM21355m7 == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    while (i22 > 0) {
                                        if (c8815n.m21355m() == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        c8815n.m21340b();
                                        i22--;
                                    }
                                    if (i23 == 0) {
                                        Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                    } else {
                                        Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                    }
                                    i9 = i24;
                                    iArr4 = iArr15;
                                    iArr5 = iArr14;
                                    jArr5 = jArr19;
                                    jArr4 = jArr18;
                                } else {
                                    j3 = j12;
                                    i = c8587d.f19621a;
                                    jArr = new long[i];
                                    iArr = new int[i];
                                    while (c8587d.m21124a()) {
                                        int i410 = c8587d.f19622b;
                                        jArr[i410] = c8587d.f19624d;
                                        iArr[i410] = c8587d.f19623c;
                                    }
                                    iMo21126b = interfaceC8588e.mo21126b();
                                    j4 = iM21355m10;
                                    i2 = 8192 / iMo21126b;
                                    i4 = 0;
                                    while (i3 < i) {
                                        int i411 = iArr[i3];
                                        int i412 = AbstractC8827z.f20671a;
                                        i4 += ((i411 + i2) - 1) / i2;
                                    }
                                    jArr2 = new long[i4];
                                    iArr2 = new int[i4];
                                    jArr3 = new long[i4];
                                    iArr3 = new int[i4];
                                    i5 = 0;
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    while (i5 < i) {
                                        int i413 = iArr[i5];
                                        j6 = jArr[i5];
                                        int[] iArr110 = iArr;
                                        i10 = i413;
                                        int i414 = i;
                                        i11 = i6;
                                        int i415 = i5;
                                        i12 = i8;
                                        while (i10 > 0) {
                                            int iMin2 = Math.min(i2, i10);
                                            jArr2[i7] = j6;
                                            int i416 = i10;
                                            int i516 = iMo21126b * iMin2;
                                            iArr2[i7] = i516;
                                            int iMax2 = Math.max(i12, i516);
                                            jArr3[i7] = ((long) i11) * j4;
                                            iArr3[i7] = z14 ? 1 : 0;
                                            j6 += (long) iArr2[i7];
                                            i11 += iMin2;
                                            i10 = i416 - iMin2;
                                            i7++;
                                            i12 = iMax2;
                                        }
                                        int i517 = i415 + 1;
                                        i6 = i11;
                                        i8 = i12;
                                        i5 = i517;
                                        iArr = iArr110;
                                        i = i414;
                                    }
                                    jArr4 = jArr2;
                                    iArr4 = iArr3;
                                    iArr5 = iArr2;
                                    jArr5 = jArr3;
                                    i9 = i8;
                                    j5 = 0;
                                }
                                jArr6 = c8602sM21131a.f19750i;
                                if (jArr6 != null) {
                                    long[] jArr24 = jArr5;
                                    AbstractC8827z.m21385a(jArr24, c8602sM21131a.f19744c);
                                    c8605v = new C8605v(jArr4, iArr5, i9, jArr24, iArr4);
                                    c8605v2 = c8605v;
                                } else {
                                    long[] jArr25 = jArr5;
                                    AbstractC8827z.m21385a(jArr25, c8602sM21131a.f19744c);
                                    c8605v = new C8605v(jArr4, iArr5, i9, jArr25, iArr4);
                                    c8605v2 = c8605v;
                                }
                            } else {
                                iM21355m2 = 0;
                            }
                            iM21355m3 = -1;
                            if (interfaceC8588e.mo21127c()) {
                                c8815n = c8815n8;
                                if (!"audio/raw".equals(c8602sM21131a.f19747f.f20295f)) {
                                }
                                if (z2) {
                                    jArr18 = new long[iMo21125a];
                                    iArr14 = new int[iMo21125a];
                                    jArr19 = new long[iMo21125a];
                                    iArr15 = new int[iMo21125a];
                                    iM21355m4 = iM21355m9;
                                    iM21355m5 = iM21355m10;
                                    c8815n2 = c8815n7;
                                    i22 = iM21355m;
                                    i23 = iM21355m2;
                                    iM21355m6 = iM21355m3;
                                    j11 = 0;
                                    j5 = 0;
                                    i24 = 0;
                                    iM21355m7 = 0;
                                    iM21340b = 0;
                                    i25 = 0;
                                    i26 = 0;
                                    while (i25 < iMo21125a) {
                                        while (i26 == 0) {
                                            if (c8587d.m21124a()) {
                                                throw new IllegalStateException();
                                            }
                                            long j112 = j12;
                                            long j113 = c8587d.f19624d;
                                            i26 = c8587d.f19623c;
                                            j11 = j113;
                                            j12 = j112;
                                        }
                                        long j114 = j12;
                                        if (c8815n != null) {
                                            while (iM21355m7 == 0) {
                                                iM21355m7 = c8815n.m21355m();
                                                iM21340b = c8815n.m21340b();
                                                i22--;
                                            }
                                            iM21355m7--;
                                        }
                                        int i518 = iM21340b;
                                        jArr18[i25] = j11;
                                        iMo21126b2 = interfaceC8588e.mo21126b();
                                        iArr14[i25] = iMo21126b2;
                                        if (iMo21126b2 > i24) {
                                            i27 = iMo21126b2;
                                        } else {
                                            i27 = i24;
                                        }
                                        int i519 = i26;
                                        jArr19[i25] = j5 + ((long) i518);
                                        if (c8815n2 == null) {
                                            i28 = z14 ? 1 : 0;
                                        } else {
                                            i28 = 0;
                                        }
                                        iArr15[i25] = i28;
                                        if (i25 == iM21355m6) {
                                            iArr15[i25] = z14 ? 1 : 0;
                                            i23--;
                                            if (i23 > 0) {
                                                iM21355m6 = c8815n2.m21355m() - 1;
                                            }
                                        }
                                        j5 += (long) iM21355m5;
                                        iM21355m4--;
                                        if (iM21355m4 != 0) {
                                        }
                                        j11 += (long) iArr14[i25];
                                        i26 = i519 - 1;
                                        i25++;
                                        i24 = i27;
                                        iM21340b = i518;
                                        j12 = j114;
                                    }
                                    i21 = iM21355m8;
                                    j3 = j12;
                                    if (iM21355m7 == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    while (i22 > 0) {
                                        if (c8815n.m21355m() == 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        c8815n.m21340b();
                                        i22--;
                                    }
                                    if (i23 == 0) {
                                        Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                    } else {
                                        Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                    }
                                    i9 = i24;
                                    iArr4 = iArr15;
                                    iArr5 = iArr14;
                                    jArr5 = jArr19;
                                    jArr4 = jArr18;
                                } else {
                                    j3 = j12;
                                    i = c8587d.f19621a;
                                    jArr = new long[i];
                                    iArr = new int[i];
                                    while (c8587d.m21124a()) {
                                        int i417 = c8587d.f19622b;
                                        jArr[i417] = c8587d.f19624d;
                                        iArr[i417] = c8587d.f19623c;
                                    }
                                    iMo21126b = interfaceC8588e.mo21126b();
                                    j4 = iM21355m10;
                                    i2 = 8192 / iMo21126b;
                                    i4 = 0;
                                    while (i3 < i) {
                                        int i418 = iArr[i3];
                                        int i419 = AbstractC8827z.f20671a;
                                        i4 += ((i418 + i2) - 1) / i2;
                                    }
                                    jArr2 = new long[i4];
                                    iArr2 = new int[i4];
                                    jArr3 = new long[i4];
                                    iArr3 = new int[i4];
                                    i5 = 0;
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    while (i5 < i) {
                                        int i4110 = iArr[i5];
                                        j6 = jArr[i5];
                                        int[] iArr111 = iArr;
                                        i10 = i4110;
                                        int i4111 = i;
                                        i11 = i6;
                                        int i4112 = i5;
                                        i12 = i8;
                                        while (i10 > 0) {
                                            int iMin3 = Math.min(i2, i10);
                                            jArr2[i7] = j6;
                                            int i4113 = i10;
                                            int i5110 = iMo21126b * iMin3;
                                            iArr2[i7] = i5110;
                                            int iMax3 = Math.max(i12, i5110);
                                            jArr3[i7] = ((long) i11) * j4;
                                            iArr3[i7] = z14 ? 1 : 0;
                                            j6 += (long) iArr2[i7];
                                            i11 += iMin3;
                                            i10 = i4113 - iMin3;
                                            i7++;
                                            i12 = iMax3;
                                        }
                                        int i5111 = i4112 + 1;
                                        i6 = i11;
                                        i8 = i12;
                                        i5 = i5111;
                                        iArr = iArr111;
                                        i = i4111;
                                    }
                                    jArr4 = jArr2;
                                    iArr4 = iArr3;
                                    iArr5 = iArr2;
                                    jArr5 = jArr3;
                                    i9 = i8;
                                    j5 = 0;
                                }
                                jArr6 = c8602sM21131a.f19750i;
                                if (jArr6 != null) {
                                    long[] jArr26 = jArr5;
                                    AbstractC8827z.m21385a(jArr26, c8602sM21131a.f19744c);
                                    c8605v = new C8605v(jArr4, iArr5, i9, jArr26, iArr4);
                                    c8605v2 = c8605v;
                                } else {
                                    long[] jArr27 = jArr5;
                                    AbstractC8827z.m21385a(jArr27, c8602sM21131a.f19744c);
                                    c8605v = new C8605v(jArr4, iArr5, i9, jArr27, iArr4);
                                    c8605v2 = c8605v;
                                }
                            } else {
                                c8815n = c8815n8;
                            }
                            z2 = false;
                            if (z2) {
                                jArr18 = new long[iMo21125a];
                                iArr14 = new int[iMo21125a];
                                jArr19 = new long[iMo21125a];
                                iArr15 = new int[iMo21125a];
                                iM21355m4 = iM21355m9;
                                iM21355m5 = iM21355m10;
                                c8815n2 = c8815n7;
                                i22 = iM21355m;
                                i23 = iM21355m2;
                                iM21355m6 = iM21355m3;
                                j11 = 0;
                                j5 = 0;
                                i24 = 0;
                                iM21355m7 = 0;
                                iM21340b = 0;
                                i25 = 0;
                                i26 = 0;
                                while (i25 < iMo21125a) {
                                    while (i26 == 0) {
                                        if (c8587d.m21124a()) {
                                            throw new IllegalStateException();
                                        }
                                        long j115 = j12;
                                        long j116 = c8587d.f19624d;
                                        i26 = c8587d.f19623c;
                                        j11 = j116;
                                        j12 = j115;
                                    }
                                    long j117 = j12;
                                    if (c8815n != null) {
                                        while (iM21355m7 == 0) {
                                            iM21355m7 = c8815n.m21355m();
                                            iM21340b = c8815n.m21340b();
                                            i22--;
                                        }
                                        iM21355m7--;
                                    }
                                    int i5112 = iM21340b;
                                    jArr18[i25] = j11;
                                    iMo21126b2 = interfaceC8588e.mo21126b();
                                    iArr14[i25] = iMo21126b2;
                                    if (iMo21126b2 > i24) {
                                        i27 = iMo21126b2;
                                    } else {
                                        i27 = i24;
                                    }
                                    int i5113 = i26;
                                    jArr19[i25] = j5 + ((long) i5112);
                                    if (c8815n2 == null) {
                                        i28 = z14 ? 1 : 0;
                                    } else {
                                        i28 = 0;
                                    }
                                    iArr15[i25] = i28;
                                    if (i25 == iM21355m6) {
                                        iArr15[i25] = z14 ? 1 : 0;
                                        i23--;
                                        if (i23 > 0) {
                                            iM21355m6 = c8815n2.m21355m() - 1;
                                        }
                                    }
                                    j5 += (long) iM21355m5;
                                    iM21355m4--;
                                    if (iM21355m4 != 0) {
                                    }
                                    j11 += (long) iArr14[i25];
                                    i26 = i5113 - 1;
                                    i25++;
                                    i24 = i27;
                                    iM21340b = i5112;
                                    j12 = j117;
                                }
                                i21 = iM21355m8;
                                j3 = j12;
                                if (iM21355m7 == 0) {
                                    throw new IllegalArgumentException();
                                }
                                while (i22 > 0) {
                                    if (c8815n.m21355m() == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    c8815n.m21340b();
                                    i22--;
                                }
                                if (i23 == 0) {
                                    Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                } else {
                                    Log.w("AtomParsers", "Inconsistent stbl box for track " + c8602sM21131a.f19742a + ": remainingSynchronizationSamples " + i23 + ", remainingSamplesAtTimestampDelta " + iM21355m4 + ", remainingSamplesInChunk " + i26 + ", remainingTimestampDeltaChanges " + i21);
                                }
                                i9 = i24;
                                iArr4 = iArr15;
                                iArr5 = iArr14;
                                jArr5 = jArr19;
                                jArr4 = jArr18;
                            } else {
                                j3 = j12;
                                i = c8587d.f19621a;
                                jArr = new long[i];
                                iArr = new int[i];
                                while (c8587d.m21124a()) {
                                    int i4114 = c8587d.f19622b;
                                    jArr[i4114] = c8587d.f19624d;
                                    iArr[i4114] = c8587d.f19623c;
                                }
                                iMo21126b = interfaceC8588e.mo21126b();
                                j4 = iM21355m10;
                                i2 = 8192 / iMo21126b;
                                i4 = 0;
                                while (i3 < i) {
                                    int i4115 = iArr[i3];
                                    int i4116 = AbstractC8827z.f20671a;
                                    i4 += ((i4115 + i2) - 1) / i2;
                                }
                                jArr2 = new long[i4];
                                iArr2 = new int[i4];
                                jArr3 = new long[i4];
                                iArr3 = new int[i4];
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                while (i5 < i) {
                                    int i4117 = iArr[i5];
                                    j6 = jArr[i5];
                                    int[] iArr112 = iArr;
                                    i10 = i4117;
                                    int i4118 = i;
                                    i11 = i6;
                                    int i4119 = i5;
                                    i12 = i8;
                                    while (i10 > 0) {
                                        int iMin4 = Math.min(i2, i10);
                                        jArr2[i7] = j6;
                                        int i41110 = i10;
                                        int i5114 = iMo21126b * iMin4;
                                        iArr2[i7] = i5114;
                                        int iMax4 = Math.max(i12, i5114);
                                        jArr3[i7] = ((long) i11) * j4;
                                        iArr3[i7] = z14 ? 1 : 0;
                                        j6 += (long) iArr2[i7];
                                        i11 += iMin4;
                                        i10 = i41110 - iMin4;
                                        i7++;
                                        i12 = iMax4;
                                    }
                                    int i5115 = i4119 + 1;
                                    i6 = i11;
                                    i8 = i12;
                                    i5 = i5115;
                                    iArr = iArr112;
                                    i = i4118;
                                }
                                jArr4 = jArr2;
                                iArr4 = iArr3;
                                iArr5 = iArr2;
                                jArr5 = jArr3;
                                i9 = i8;
                                j5 = 0;
                            }
                            jArr6 = c8602sM21131a.f19750i;
                            if (jArr6 != null) {
                                long[] jArr28 = jArr5;
                                AbstractC8827z.m21385a(jArr28, c8602sM21131a.f19744c);
                                c8605v = new C8605v(jArr4, iArr5, i9, jArr28, iArr4);
                                c8605v2 = c8605v;
                            } else {
                                long[] jArr29 = jArr5;
                                AbstractC8827z.m21385a(jArr29, c8602sM21131a.f19744c);
                                c8605v = new C8605v(jArr4, iArr5, i9, jArr29, iArr4);
                                c8605v2 = c8605v;
                            }
                        }
                        if (c8605v2.f19773a != 0) {
                            int i60 = i42;
                            C8538g c8538gMo21092a = this.f19737l.mo21092a(i60, c8602sM21131a.f19743b);
                            C8598o c8598o = new C8598o(c8602sM21131a, c8605v2, c8538gMo21092a);
                            int i61 = c8605v2.f19776d + 30;
                            C8708o c8708o = c8602sM21131a.f19747f;
                            String str2 = c8708o.f20290a;
                            String str3 = c8708o.f20294e;
                            String str4 = c8708o.f20295f;
                            String str5 = c8708o.f20292c;
                            int i62 = c8708o.f20291b;
                            int i63 = c8708o.f20299j;
                            int i64 = c8708o.f20300k;
                            float f = c8708o.f20301l;
                            int i65 = c8708o.f20302m;
                            i29 = i60;
                            float f2 = c8708o.f20303n;
                            byte[] bArr = c8708o.f20305p;
                            int i66 = c8708o.f20304o;
                            C8831c c8831c = c8708o.f20306q;
                            int i67 = c8708o.f20307r;
                            int i68 = c8708o.f20308s;
                            int i69 = c8708o.f20309t;
                            int i70 = c8708o.f20310u;
                            int i71 = c8708o.f20311v;
                            int i72 = c8708o.f20313x;
                            String str6 = c8708o.f20314y;
                            int i73 = c8708o.f20315z;
                            long j20 = c8708o.f20312w;
                            C8708o c8708o2 = new C8708o(str2, str3, str4, str5, i62, i61, i63, i64, f, i65, f2, bArr, i66, c8831c, i67, i68, i69, i70, i71, i72, str6, i73, j20, c8708o.f20297h, c8708o.f20298i, c8708o.f20293d);
                            c8571m2 = c8571m3;
                            if (c8602sM21131a.f19743b == 1) {
                                int i74 = c8571m2.f19383a;
                                if (i74 != -1 && (i30 = c8571m2.f19384b) != -1) {
                                    c8708o2 = new C8708o(str2, str3, str4, str5, i62, i61, i63, i64, f, i65, f2, bArr, i66, c8831c, i67, i68, i69, i74, i30, i72, str6, i73, j20, c8708o2.f20297h, c8708o2.f20298i, c8708o2.f20293d);
                                }
                                if (c8685b != null) {
                                    c8708o2 = new C8708o(c8708o2.f20290a, c8708o2.f20294e, c8708o2.f20295f, c8708o2.f20292c, c8708o2.f20291b, c8708o2.f20296g, c8708o2.f20299j, c8708o2.f20300k, c8708o2.f20301l, c8708o2.f20302m, c8708o2.f20303n, c8708o2.f20305p, c8708o2.f20304o, c8708o2.f20306q, c8708o2.f20307r, c8708o2.f20308s, c8708o2.f20309t, c8708o2.f20310u, c8708o2.f20311v, c8708o2.f20313x, c8708o2.f20314y, c8708o2.f20315z, c8708o2.f20312w, c8708o2.f20297h, c8708o2.f20298i, c8685b);
                                }
                            }
                            c8538gMo21092a.mo21053a(c8708o2);
                            long jMax = Math.max(j3, c8602sM21131a.f19746e);
                            arrayList = arrayList2;
                            arrayList.add(c8598o);
                            long j21 = c8605v2.f19774b[0];
                            j12 = jMax;
                            j13 = j21 < j2 ? j21 : j2;
                        }
                        i42 = i29 + 1;
                        arrayList2 = arrayList;
                        c8571m3 = c8571m2;
                        c8584a = c8584a;
                        z12 = true;
                    } else {
                        c8584a = c8584a;
                        j3 = j12;
                        arrayList2 = arrayList2;
                        c8571m3 = c8571m3;
                        i42 = i42;
                        j2 = j13;
                    }
                    c8571m2 = c8571m3;
                    j13 = j2;
                    arrayList = arrayList2;
                    j12 = j3;
                    i29 = i42;
                    i42 = i29 + 1;
                    arrayList2 = arrayList;
                    c8571m3 = c8571m2;
                    c8584a = c8584a;
                    z12 = true;
                }
                ArrayList arrayList4 = arrayList2;
                this.f19739n = j12;
                this.f19738m = (C8598o[]) arrayList4.toArray(new C8598o[arrayList4.size()]);
                this.f19737l.mo21096b();
                this.f19737l.mo21093a(this);
                this.f19729d.clear();
                this.f19730e = 2;
            } else if (!this.f19729d.isEmpty()) {
                ((C8584a) this.f19729d.peek()).f19526R0.add(c8584a);
            }
        }
        if (this.f19730e != 2) {
            this.f19730e = 0;
            this.f19733h = 0;
        }
    }
}
