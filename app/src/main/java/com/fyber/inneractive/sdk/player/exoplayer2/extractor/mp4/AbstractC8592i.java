package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AbstractC8491a;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8802a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8805d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8829a;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8832d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8592i {

    /* JADX INFO: renamed from: a */
    public static final int f19642a = AbstractC8827z.m21379a("vide");

    /* JADX INFO: renamed from: b */
    public static final int f19643b = AbstractC8827z.m21379a("soun");

    /* JADX INFO: renamed from: c */
    public static final int f19644c = AbstractC8827z.m21379a("text");

    /* JADX INFO: renamed from: d */
    public static final int f19645d = AbstractC8827z.m21379a("sbtl");

    /* JADX INFO: renamed from: e */
    public static final int f19646e = AbstractC8827z.m21379a("subt");

    /* JADX INFO: renamed from: f */
    public static final int f19647f = AbstractC8827z.m21379a("clcp");

    /* JADX INFO: renamed from: g */
    public static final int f19648g = AbstractC8827z.m21379a("cenc");

    /* JADX INFO: renamed from: h */
    public static final int f19649h = AbstractC8827z.m21379a(Constants.REFERRER_API_META);

    /* JADX INFO: renamed from: a */
    public static int m21128a(C8815n c8815n) {
        int iM21352j = c8815n.m21352j();
        int i = iM21352j & 127;
        while ((iM21352j & 128) == 128) {
            iM21352j = c8815n.m21352j();
            i = (i << 7) | (iM21352j & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m21129a(C8815n c8815n, int i, int i2, C8589f c8589f, int i3) {
        int i4 = c8815n.f20644b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            c8815n.m21347e(i4);
            int iM21340b = c8815n.m21340b();
            AbstractC8802a.m21319a(iM21340b > 0, "childAtomSize should be positive");
            if (c8815n.m21340b() == AbstractC8586c.f19565W) {
                int i5 = i4 + 8;
                Pair pairCreate = null;
                boolean z = false;
                Integer numValueOf = null;
                C8603t c8603t = null;
                while (i5 - i4 < iM21340b) {
                    c8815n.m21347e(i5);
                    int iM21340b2 = c8815n.m21340b();
                    int iM21340b3 = c8815n.m21340b();
                    if (iM21340b3 == AbstractC8586c.f19573c0) {
                        numValueOf = Integer.valueOf(c8815n.m21340b());
                    } else if (iM21340b3 == AbstractC8586c.f19566X) {
                        c8815n.m21347e(c8815n.f20644b + 4);
                        z = c8815n.m21340b() == f19648g;
                    } else if (iM21340b3 == AbstractC8586c.f19567Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= iM21340b2) {
                                c8603t = null;
                                break;
                            }
                            c8815n.m21347e(i6);
                            int iM21340b4 = c8815n.m21340b();
                            if (c8815n.m21340b() == AbstractC8586c.f19568Z) {
                                c8815n.m21347e(c8815n.f20644b + 6);
                                c8815n.m21352j();
                                int iM21352j = c8815n.m21352j();
                                byte[] bArr = new byte[16];
                                c8815n.m21339a(bArr, 0, 16);
                                c8603t = new C8603t(iM21352j, bArr);
                                break;
                            }
                            i6 += iM21340b4;
                        }
                    }
                    i5 += iM21340b2;
                }
                if (z) {
                    AbstractC8802a.m21319a(numValueOf != null, "frma atom is mandatory");
                    AbstractC8802a.m21319a(c8603t != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, c8603t);
                }
                if (pairCreate != null) {
                    c8589f.f19630a[i3] = (C8603t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i4 += iM21340b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX INFO: renamed from: a */
    public static Pair m21130a(int i, C8815n c8815n) {
        String str;
        c8815n.m21347e(i + 12);
        c8815n.m21347e(c8815n.f20644b + 1);
        m21128a(c8815n);
        c8815n.m21347e(c8815n.f20644b + 2);
        int iM21352j = c8815n.m21352j();
        if ((iM21352j & 128) != 0) {
            c8815n.m21347e(c8815n.f20644b + 2);
        }
        if ((iM21352j & 64) != 0) {
            c8815n.m21347e(c8815n.f20644b + c8815n.m21357o());
        }
        if ((iM21352j & 32) != 0) {
            c8815n.m21347e(c8815n.f20644b + 2);
        }
        c8815n.m21347e(c8815n.f20644b + 1);
        m21128a(c8815n);
        int iM21352j2 = c8815n.m21352j();
        if (iM21352j2 == 32) {
            str = "video/mp4v-es";
        } else if (iM21352j2 == 33) {
            str = "video/avc";
        } else if (iM21352j2 == 35) {
            str = "video/hevc";
        } else if (iM21352j2 != 64) {
            str = null;
            if (iM21352j2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iM21352j2 == 165) {
                str = "audio/ac3";
            } else if (iM21352j2 != 166) {
                switch (iM21352j2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iM21352j2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            } else {
                str = "audio/eac3";
            }
        } else {
            str = "audio/mp4a-latm";
        }
        c8815n.m21347e(c8815n.f20644b + 12);
        c8815n.m21347e(c8815n.f20644b + 1);
        int iM21128a = m21128a(c8815n);
        byte[] bArr = new byte[iM21128a];
        c8815n.m21339a(bArr, 0, iM21128a);
        return Pair.create(str, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:267:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:269:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:272:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:274:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:275:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e4 A[LOOP:3: B:270:0x04c1->B:279:0x04e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:284:0x0505  */
    /* JADX WARN: Code duplicated, block: B:285:0x051d  */
    /* JADX WARN: Code duplicated, block: B:286:0x051e A[PHI: r10 r25 r36 r37 r54
  0x051e: PHI (r10v21 java.lang.String) = (r10v14 java.lang.String), (r10v15 java.lang.String), (r10v27 java.lang.String) binds: [B:281:0x04ed, B:285:0x051d, B:251:0x0423] A[DONT_GENERATE, DONT_INLINE]
  0x051e: PHI (r25v10 byte[]) = (r25v6 byte[]), (r25v8 byte[]), (r25v6 byte[]) binds: [B:281:0x04ed, B:285:0x051d, B:251:0x0423] A[DONT_GENERATE, DONT_INLINE]
  0x051e: PHI (r36v3 int) = (r36v2 int), (r36v2 int), (r36v8 int) binds: [B:281:0x04ed, B:285:0x051d, B:251:0x0423] A[DONT_GENERATE, DONT_INLINE]
  0x051e: PHI (r37v4 int) = (r37v1 int), (r37v1 int), (r37v9 int) binds: [B:281:0x04ed, B:285:0x051d, B:251:0x0423] A[DONT_GENERATE, DONT_INLINE]
  0x051e: PHI (r54v12 int) = (r54v7 int), (r54v7 int), (r4v53 int) binds: [B:281:0x04ed, B:285:0x051d, B:251:0x0423] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x0570  */
    /* JADX WARN: Code duplicated, block: B:303:0x0598  */
    /* JADX WARN: Code duplicated, block: B:307:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:309:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:313:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:314:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:317:0x05d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:320:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:324:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:326:0x05fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:327:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:330:0x0613 A[PHI: r26 r27 r30 r32 r33
  0x0613: PHI (r26v9 java.lang.String) = (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v10 java.lang.String) binds: [B:368:0x06ba, B:370:0x06c7, B:364:0x069f, B:329:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r27v6 int) = (r27v1 int), (r27v1 int), (r27v3 int), (r27v7 int) binds: [B:368:0x06ba, B:370:0x06c7, B:364:0x069f, B:329:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r30v4 java.util.List) = (r30v1 java.util.List), (r30v1 java.util.List), (r30v1 java.util.List), (r30v5 java.util.List) binds: [B:368:0x06ba, B:370:0x06c7, B:364:0x069f, B:329:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r32v4 float) = (r32v1 float), (r32v1 float), (r32v1 float), (r32v5 float) binds: [B:368:0x06ba, B:370:0x06c7, B:364:0x069f, B:329:0x0611] A[DONT_GENERATE, DONT_INLINE]
  0x0613: PHI (r33v5 byte[]) = (r33v1 byte[]), (r33v1 byte[]), (r33v3 byte[]), (r33v1 byte[]) binds: [B:368:0x06ba, B:370:0x06c7, B:364:0x069f, B:329:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:333:0x061e  */
    /* JADX WARN: Code duplicated, block: B:335:0x0622 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:336:0x0624  */
    /* JADX WARN: Code duplicated, block: B:338:0x0628  */
    /* JADX WARN: Code duplicated, block: B:339:0x062c  */
    /* JADX WARN: Code duplicated, block: B:342:0x0636  */
    /* JADX WARN: Code duplicated, block: B:344:0x063a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x063c  */
    /* JADX WARN: Code duplicated, block: B:348:0x0646  */
    /* JADX WARN: Code duplicated, block: B:350:0x064a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:351:0x064c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0665  */
    /* JADX WARN: Code duplicated, block: B:356:0x0669  */
    /* JADX WARN: Code duplicated, block: B:357:0x0682  */
    /* JADX WARN: Code duplicated, block: B:359:0x0686  */
    /* JADX WARN: Code duplicated, block: B:362:0x068c  */
    /* JADX WARN: Code duplicated, block: B:365:0x06a9 A[LOOP:5: B:360:0x0688->B:365:0x06a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:367:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:369:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:371:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:373:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:375:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:377:0x06d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x06da  */
    /* JADX WARN: Code duplicated, block: B:380:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:381:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:382:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:387:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:410:0x079e  */
    /* JADX WARN: Code duplicated, block: B:413:0x07a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:414:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:420:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x065f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x06ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C8602s m21131a(C8584a c8584a, C8585b c8585b, long j, C8524d c8524d, boolean z) throws C8711r {
        int i;
        long jM21353k;
        int i2;
        int i3;
        long j2;
        int iM21340b;
        int i4;
        long jM21382a;
        long j3;
        int iM21340b2;
        int i5;
        int i6;
        Pair pairCreate;
        C8815n c8815n;
        int iM21340b3;
        C8589f c8589f;
        int i7;
        long j4;
        C8584a c8584aM21121b;
        C8602s c8602s;
        Pair pairCreate2;
        C8585b c8585bM21122c;
        int i8;
        int iM21340b4;
        boolean z2;
        int iM21340b5;
        int i9;
        int i10;
        int iM21357o;
        int iM21357o2;
        int i11;
        int i12;
        float fM21355m;
        int i13;
        String str;
        List listSingletonList;
        byte[] bArrCopyOfRange;
        int i14;
        int i15;
        int iM21340b6;
        boolean z3;
        int iM21340b7;
        int i16;
        int iM21352j;
        int iM21352j2;
        int i17;
        int i18;
        int iM21340b8;
        List list;
        C8829a c8829aM21392a;
        int iM21357o3;
        int iM21357o4;
        int iRound;
        String str2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iM21340b9;
        boolean z4;
        int i24;
        String str3;
        String str4;
        long j5;
        List listSingletonList2;
        C8584a c8584aM21121b2 = c8584a.m21121b(AbstractC8586c.f19538F);
        C8815n c8815n2 = c8584aM21121b2.m21122c(AbstractC8586c.f19562T).f19527P0;
        c8815n2.m21347e(16);
        int iM21340b10 = c8815n2.m21340b();
        if (iM21340b10 == f19643b) {
            i = 1;
        } else if (iM21340b10 == f19642a) {
            i = 2;
        } else if (iM21340b10 == f19644c || iM21340b10 == f19645d || iM21340b10 == f19646e || iM21340b10 == f19647f) {
            i = 3;
        } else {
            i = iM21340b10 == f19649h ? 4 : -1;
        }
        if (i == -1) {
            return null;
        }
        C8815n c8815n3 = c8584a.m21122c(AbstractC8586c.f19558P).f19527P0;
        int i25 = 8;
        c8815n3.m21347e(8);
        int iM21340b11 = (c8815n3.m21340b() >> 24) & 255;
        c8815n3.m21347e(c8815n3.f20644b + (iM21340b11 == 0 ? 8 : 16));
        int iM21340b12 = c8815n3.m21340b();
        c8815n3.m21347e(c8815n3.f20644b + 4);
        int i26 = c8815n3.f20644b;
        int i27 = iM21340b11 == 0 ? 4 : 8;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            if (i29 >= i27) {
                c8815n3.m21347e(c8815n3.f20644b + i27);
            } else {
                if (c8815n3.f20643a[i26 + i29] != -1) {
                    jM21353k = iM21340b11 == 0 ? c8815n3.m21353k() : c8815n3.m21356n();
                    if (jM21353k != 0) {
                        break;
                    }
                    break;
                }
                i29++;
            }
            jM21353k = -9223372036854775807L;
            break;
        }
        c8815n3.m21347e(c8815n3.f20644b + 16);
        int iM21340b13 = c8815n3.m21340b();
        int iM21340b14 = c8815n3.m21340b();
        c8815n3.m21347e(c8815n3.f20644b + 4);
        int iM21340b15 = c8815n3.m21340b();
        int iM21340b16 = c8815n3.m21340b();
        int i30 = 3;
        if (iM21340b13 == 0 && iM21340b14 == 65536 && iM21340b15 == -65536 && iM21340b16 == 0) {
            i3 = 90;
        } else {
            if (iM21340b13 != 0 || iM21340b14 != -65536 || iM21340b15 != 65536 || iM21340b16 != 0) {
                if (iM21340b13 == -65536 && iM21340b14 == 0 && iM21340b15 == 0 && iM21340b16 == -65536) {
                    i3 = 180;
                } else {
                    i2 = 0;
                }
                if (j == -9223372036854775807L) {
                    j2 = jM21353k;
                } else {
                    j2 = j;
                }
                C8815n c8815n4 = c8585b.f19527P0;
                c8815n4.m21347e(8);
                iM21340b = c8815n4.m21340b();
                int i31 = AbstractC8586c.f19570b;
                if (((iM21340b >> 24) & 255) == 0) {
                    i4 = 8;
                } else {
                    i4 = 16;
                }
                c8815n4.m21347e(c8815n4.f20644b + i4);
                long jM21353k2 = c8815n4.m21353k();
                jM21382a = j2 != -9223372036854775807L ? AbstractC8827z.m21382a(j2, 1000000L, jM21353k2) : -9223372036854775807L;
                j3 = jM21353k2;
                C8584a c8584aM21121b3 = c8584aM21121b2.m21121b(AbstractC8586c.f19540G).m21121b(AbstractC8586c.f19542H);
                C8815n c8815n5 = c8584aM21121b2.m21122c(AbstractC8586c.f19561S).f19527P0;
                c8815n5.m21347e(8);
                iM21340b2 = (c8815n5.m21340b() >> 24) & 255;
                if (iM21340b2 == 0) {
                    i5 = 8;
                } else {
                    i5 = 16;
                }
                c8815n5.m21347e(c8815n5.f20644b + i5);
                long jM21353k3 = c8815n5.m21353k();
                if (iM21340b2 == 0) {
                    i6 = 4;
                } else {
                    i6 = 8;
                }
                c8815n5.m21347e(c8815n5.f20644b + i6);
                int iM21357o5 = c8815n5.m21357o();
                pairCreate = Pair.create(Long.valueOf(jM21353k3), "" + ((char) (((iM21357o5 >> 10) & 31) + 96)) + ((char) (((iM21357o5 >> 5) & 31) + 96)) + ((char) ((iM21357o5 & 31) + 96)));
                c8815n = c8584aM21121b3.m21122c(AbstractC8586c.f19563U).f19527P0;
                String str5 = (String) pairCreate.second;
                c8815n.m21347e(12);
                iM21340b3 = c8815n.m21340b();
                c8589f = new C8589f(iM21340b3);
                i7 = 0;
                while (i7 < iM21340b3) {
                    i8 = c8815n.f20644b;
                    iM21340b4 = c8815n.m21340b();
                    int i32 = i25;
                    if (iM21340b4 > 0) {
                        z2 = 1;
                    } else {
                        z2 = i28;
                    }
                    AbstractC8802a.m21319a(z2, "childAtomSize should be positive");
                    iM21340b5 = c8815n.m21340b();
                    if (iM21340b5 != AbstractC8586c.f19572c || iM21340b5 == AbstractC8586c.f19574d || iM21340b5 == AbstractC8586c.f19569a0 || iM21340b5 == AbstractC8586c.f19591l0 || iM21340b5 == AbstractC8586c.f19576e || iM21340b5 == AbstractC8586c.f19578f || iM21340b5 == AbstractC8586c.f19580g || iM21340b5 == AbstractC8586c.f19549K0 || iM21340b5 == AbstractC8586c.f19551L0) {
                        i9 = i28;
                        j3 = j3;
                        i10 = iM21340b3;
                        c8815n.m21347e(i8 + 16);
                        c8815n.m21347e(c8815n.f20644b + 16);
                        iM21357o = c8815n.m21357o();
                        iM21357o2 = c8815n.m21357o();
                        c8815n.m21347e(c8815n.f20644b + 50);
                        i11 = c8815n.f20644b;
                        if (iM21340b5 == AbstractC8586c.f19569a0) {
                            iM21340b5 = m21129a(c8815n, i8, iM21340b4, c8589f, i7);
                            c8815n.m21347e(i11);
                        }
                        i12 = -1;
                        fM21355m = 1.0f;
                        i13 = i9;
                        str = null;
                        listSingletonList = null;
                        bArrCopyOfRange = null;
                        while (i11 - i8 < iM21340b4) {
                            c8815n.m21347e(i11);
                            i15 = c8815n.f20644b;
                            iM21340b6 = c8815n.m21340b();
                            if (iM21340b6 != 0 && c8815n.f20644b - i8 == iM21340b4) {
                                break;
                            }
                            if (iM21340b6 > 0) {
                                z3 = 1;
                            } else {
                                z3 = i9;
                            }
                            AbstractC8802a.m21319a(z3, "childAtomSize should be positive");
                            iM21340b7 = c8815n.m21340b();
                            int i33 = i11;
                            if (iM21340b7 != AbstractC8586c.f19544I) {
                                if (iM21340b7 != AbstractC8586c.f19546J) {
                                    if (iM21340b7 == AbstractC8586c.f19553M0) {
                                        if (str != null) {
                                            throw new IllegalStateException();
                                        }
                                        if (iM21340b5 == AbstractC8586c.f19549K0) {
                                            str = "video/x-vnd.on2.vp8";
                                        } else {
                                            str = "video/x-vnd.on2.vp9";
                                        }
                                    } else if (iM21340b7 == AbstractC8586c.f19582h) {
                                        if (str != null) {
                                            throw new IllegalStateException();
                                        }
                                        str = "video/3gpp";
                                    } else if (iM21340b7 == AbstractC8586c.f19548K) {
                                        if (str != null) {
                                            throw new IllegalStateException();
                                        }
                                        Pair pairM21130a = m21130a(i15, c8815n);
                                        str = (String) pairM21130a.first;
                                        listSingletonList = Collections.singletonList((byte[]) pairM21130a.second);
                                    } else if (iM21340b7 == AbstractC8586c.f19587j0) {
                                        c8815n.m21347e(i15 + 8);
                                        fM21355m = c8815n.m21355m() / c8815n.m21355m();
                                        i17 = i30;
                                        i16 = 1;
                                    } else if (iM21340b7 != AbstractC8586c.f19545I0) {
                                        i16 = i13;
                                        if (iM21340b7 != AbstractC8586c.f19543H0) {
                                            i17 = i30;
                                            break;
                                            break;
                                        }
                                        iM21352j = c8815n.m21352j();
                                        c8815n.m21347e(c8815n.f20644b + 3);
                                        if (iM21352j != 0) {
                                            i17 = i30;
                                            break;
                                            break;
                                        }
                                        iM21352j2 = c8815n.m21352j();
                                        if (iM21352j2 == 0) {
                                            i17 = i30;
                                            i12 = i9;
                                        } else if (iM21352j2 != 1) {
                                            i17 = i30;
                                            if (iM21352j2 == 2) {
                                                i12 = 2;
                                            } else if (iM21352j2 == i17) {
                                                i12 = i17;
                                            }
                                        } else {
                                            i17 = i30;
                                            i12 = 1;
                                        }
                                    } else {
                                        i18 = i15 + 8;
                                        while (true) {
                                            if (i18 - i15 >= iM21340b6) {
                                                i16 = i13;
                                                i17 = i30;
                                                bArrCopyOfRange = null;
                                                break;
                                            }
                                            c8815n.m21347e(i18);
                                            iM21340b8 = c8815n.m21340b();
                                            i16 = i13;
                                            if (c8815n.m21340b() == AbstractC8586c.f19547J0) {
                                                bArrCopyOfRange = Arrays.copyOfRange(c8815n.f20643a, i18, i18 + iM21340b8);
                                                i17 = i30;
                                                break;
                                            }
                                            i18 += iM21340b8;
                                            i13 = i16;
                                        }
                                    }
                                    i16 = i13;
                                    i17 = i30;
                                    break;
                                    break;
                                }
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                c8815n.m21347e(i15 + 8);
                                C8832d c8832dM21393a = C8832d.m21393a(c8815n);
                                list = c8832dM21393a.f20722a;
                                c8589f.f19632c = c8832dM21393a.f20723b;
                                str = "video/hevc";
                                i11 = i33 + iM21340b6;
                                i30 = i17;
                                i13 = i16;
                            } else {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                c8815n.m21347e(i15 + 8);
                                c8829aM21392a = C8829a.m21392a(c8815n);
                                list = c8829aM21392a.f20712a;
                                c8589f.f19632c = c8829aM21392a.f20713b;
                                if (i13 == 0) {
                                    fM21355m = c8829aM21392a.f20716e;
                                }
                                str = "video/avc";
                            }
                            listSingletonList = list;
                            i16 = i13;
                            i17 = i30;
                            break;
                            i11 = i33 + iM21340b6;
                            i30 = i17;
                            i13 = i16;
                        }
                        i14 = i30;
                        if (str != null) {
                            c8589f.f19631b = C8708o.m21264a(Integer.toString(iM21340b12), str, -1, iM21357o, iM21357o2, listSingletonList, i2, fM21355m, bArrCopyOfRange, i12, null, c8524d);
                        }
                    } else {
                        if (iM21340b5 == AbstractC8586c.f19586j || iM21340b5 == AbstractC8586c.f19571b0 || iM21340b5 == AbstractC8586c.f19596o || iM21340b5 == AbstractC8586c.f19600q || iM21340b5 == AbstractC8586c.f19604s || iM21340b5 == AbstractC8586c.f19610v || iM21340b5 == AbstractC8586c.f19606t || iM21340b5 == AbstractC8586c.f19608u || iM21340b5 == AbstractC8586c.f19617y0 || iM21340b5 == AbstractC8586c.f19619z0 || iM21340b5 == AbstractC8586c.f19592m || iM21340b5 == AbstractC8586c.f19594n || iM21340b5 == AbstractC8586c.f19588k || iM21340b5 == AbstractC8586c.f19557O0) {
                            c8815n.m21347e(i8 + 16);
                            if (z) {
                                iM21357o3 = c8815n.m21357o();
                                c8815n.m21347e(c8815n.f20644b + 6);
                            } else {
                                c8815n.m21347e(c8815n.f20644b + 8);
                                iM21357o3 = 0;
                            }
                            if (iM21357o3 == 0 || iM21357o3 == 1) {
                                iM21357o4 = c8815n.m21357o();
                                c8815n.m21347e(c8815n.f20644b + 6);
                                byte[] bArr = c8815n.f20643a;
                                int i34 = c8815n.f20644b;
                                int i35 = i34 + 1;
                                c8815n.f20644b = i35;
                                int i36 = (bArr[i34] & 255) << 8;
                                c8815n.f20644b = i34 + 2;
                                int i37 = i36 | (bArr[i35] & 255);
                                c8815n.f20644b = i34 + 4;
                                if (iM21357o3 == 1) {
                                    c8815n.m21347e(i34 + 20);
                                }
                                iRound = i37;
                            } else if (iM21357o3 == 2) {
                                c8815n.m21347e(c8815n.f20644b + 16);
                                iRound = (int) Math.round(Double.longBitsToDouble(c8815n.m21349g()));
                                iM21357o4 = c8815n.m21355m();
                                c8815n.m21347e(c8815n.f20644b + 20);
                            } else {
                                j3 = j3;
                                i10 = iM21340b3;
                                i14 = i30;
                                i9 = 0;
                            }
                            int i38 = c8815n.f20644b;
                            if (iM21340b5 == AbstractC8586c.f19571b0) {
                                iM21340b5 = m21129a(c8815n, i8, iM21340b4, c8589f, i7);
                                c8815n.m21347e(i38);
                            }
                            int i39 = iRound;
                            if (iM21340b5 == AbstractC8586c.f19596o) {
                                str2 = "audio/ac3";
                            } else if (iM21340b5 == AbstractC8586c.f19600q) {
                                str2 = "audio/eac3";
                            } else if (iM21340b5 == AbstractC8586c.f19604s) {
                                str2 = "audio/vnd.dts";
                            } else if (iM21340b5 == AbstractC8586c.f19606t || iM21340b5 == AbstractC8586c.f19608u) {
                                str2 = "audio/vnd.dts.hd";
                            } else if (iM21340b5 == AbstractC8586c.f19610v) {
                                str2 = "audio/vnd.dts.hd;profile=lbr";
                            } else if (iM21340b5 == AbstractC8586c.f19617y0) {
                                str2 = "audio/3gpp";
                            } else if (iM21340b5 == AbstractC8586c.f19619z0) {
                                str2 = "audio/amr-wb";
                            } else if (iM21340b5 == AbstractC8586c.f19592m || iM21340b5 == AbstractC8586c.f19594n) {
                                str2 = "audio/raw";
                            } else if (iM21340b5 == AbstractC8586c.f19588k) {
                                str2 = "audio/mpeg";
                            } else {
                                str2 = iM21340b5 == AbstractC8586c.f19557O0 ? "audio/alac" : null;
                            }
                            String str6 = str2;
                            byte[] bArr2 = null;
                            int i40 = i38;
                            int iIntValue = iM21357o4;
                            while (i40 - i8 < iM21340b4) {
                                c8815n.m21347e(i40);
                                int iM21340b17 = c8815n.m21340b();
                                int i41 = iIntValue;
                                AbstractC8802a.m21319a(iM21340b17 > 0, "childAtomSize should be positive");
                                int iM21340b18 = c8815n.m21340b();
                                int i42 = iM21340b3;
                                int i43 = AbstractC8586c.f19548K;
                                if (iM21340b18 != i43) {
                                    String str7 = str6;
                                    if (z && iM21340b18 == AbstractC8586c.f19590l) {
                                        str6 = str7;
                                        i19 = i39;
                                        i20 = i41;
                                        if (iM21340b18 == i43) {
                                            iM21340b17 = iM21340b17;
                                            i23 = i40;
                                        } else {
                                            i21 = c8815n.f20644b;
                                            while (true) {
                                                if (i21 - i40 < iM21340b17) {
                                                    iM21340b17 = iM21340b17;
                                                    i22 = -1;
                                                    i23 = -1;
                                                    break;
                                                }
                                                c8815n.m21347e(i21);
                                                iM21340b9 = c8815n.m21340b();
                                                iM21340b17 = iM21340b17;
                                                if (iM21340b9 > 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                AbstractC8802a.m21319a(z4, "childAtomSize should be positive");
                                                i24 = i21;
                                                if (c8815n.m21340b() == AbstractC8586c.f19548K) {
                                                    i23 = i24;
                                                } else {
                                                    i21 = i24 + iM21340b9;
                                                    iM21340b17 = iM21340b17;
                                                }
                                            }
                                            if (i23 != i22) {
                                                Pair pairM21130a2 = m21130a(i23, c8815n);
                                                str3 = (String) pairM21130a2.first;
                                                bArr2 = (byte[]) pairM21130a2.second;
                                                if ("audio/mp4a-latm".equals(str3)) {
                                                    Pair pairM21322a = AbstractC8805d.m21322a(bArr2);
                                                    int iIntValue2 = ((Integer) pairM21322a.first).intValue();
                                                    iIntValue = ((Integer) pairM21322a.second).intValue();
                                                    i19 = iIntValue2;
                                                    str6 = str3;
                                                } else {
                                                    str6 = str3;
                                                    iIntValue = i20;
                                                }
                                            } else {
                                                iIntValue = i20;
                                            }
                                        }
                                        i22 = -1;
                                        if (i23 != i22) {
                                            Pair pairM21130a3 = m21130a(i23, c8815n);
                                            str3 = (String) pairM21130a3.first;
                                            bArr2 = (byte[]) pairM21130a3.second;
                                            if ("audio/mp4a-latm".equals(str3)) {
                                                Pair pairM21322a2 = AbstractC8805d.m21322a(bArr2);
                                                int iIntValue3 = ((Integer) pairM21322a2.first).intValue();
                                                iIntValue = ((Integer) pairM21322a2.second).intValue();
                                                i19 = iIntValue3;
                                                str6 = str3;
                                            } else {
                                                str6 = str3;
                                                iIntValue = i20;
                                            }
                                        } else {
                                            iIntValue = i20;
                                        }
                                    } else {
                                        if (iM21340b18 == AbstractC8586c.f19598p) {
                                            c8815n.m21347e(i40 + 8);
                                            String string = Integer.toString(iM21340b12);
                                            int i44 = AbstractC8491a.f18938b[(c8815n.m21352j() & 192) >> 6];
                                            int iM21352j3 = c8815n.m21352j();
                                            int i45 = AbstractC8491a.f18940d[(iM21352j3 & 56) >> 3];
                                            if ((iM21352j3 & 4) != 0) {
                                                i45++;
                                            }
                                            c8589f.f19631b = C8708o.m21263a(string, "audio/ac3", -1, -1, i45, i44, null, c8524d, str5);
                                        } else if (iM21340b18 == AbstractC8586c.f19602r) {
                                            c8815n.m21347e(i40 + 8);
                                            String string2 = Integer.toString(iM21340b12);
                                            c8815n.m21347e(c8815n.f20644b + 2);
                                            int i46 = AbstractC8491a.f18938b[(c8815n.m21352j() & 192) >> 6];
                                            int iM21352j4 = c8815n.m21352j();
                                            int i47 = AbstractC8491a.f18940d[(iM21352j4 & 14) >> 1];
                                            if ((iM21352j4 & 1) != 0) {
                                                i47++;
                                            }
                                            c8589f.f19631b = C8708o.m21263a(string2, "audio/eac3", -1, -1, i47, i46, null, c8524d, str5);
                                        } else {
                                            if (iM21340b18 == AbstractC8586c.f19612w) {
                                                i19 = i39;
                                                i20 = i41;
                                                str6 = str7;
                                                c8589f.f19631b = C8708o.m21263a(Integer.toString(iM21340b12), str7, -1, -1, i20, i19, null, c8524d, str5);
                                            } else {
                                                i19 = i39;
                                                i20 = i41;
                                                str6 = str7;
                                                if (iM21340b18 == AbstractC8586c.f19557O0) {
                                                    byte[] bArr3 = new byte[iM21340b17];
                                                    c8815n.m21347e(i40);
                                                    c8815n.m21339a(bArr3, 0, iM21340b17);
                                                    iM21340b17 = iM21340b17;
                                                    bArr2 = bArr3;
                                                    iIntValue = i20;
                                                }
                                            }
                                            iIntValue = i20;
                                        }
                                        i19 = i39;
                                        i20 = i41;
                                        str6 = str7;
                                        iIntValue = i20;
                                    }
                                } else {
                                    i19 = i39;
                                    i20 = i41;
                                    if (iM21340b18 == i43) {
                                        iM21340b17 = iM21340b17;
                                        i23 = i40;
                                    } else {
                                        i21 = c8815n.f20644b;
                                        while (true) {
                                            if (i21 - i40 < iM21340b17) {
                                                iM21340b17 = iM21340b17;
                                                i22 = -1;
                                                i23 = -1;
                                                break;
                                            }
                                            c8815n.m21347e(i21);
                                            iM21340b9 = c8815n.m21340b();
                                            iM21340b17 = iM21340b17;
                                            if (iM21340b9 > 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            AbstractC8802a.m21319a(z4, "childAtomSize should be positive");
                                            i24 = i21;
                                            if (c8815n.m21340b() == AbstractC8586c.f19548K) {
                                                i23 = i24;
                                            } else {
                                                i21 = i24 + iM21340b9;
                                                iM21340b17 = iM21340b17;
                                            }
                                        }
                                        if (i23 != i22) {
                                            Pair pairM21130a4 = m21130a(i23, c8815n);
                                            str3 = (String) pairM21130a4.first;
                                            bArr2 = (byte[]) pairM21130a4.second;
                                            if ("audio/mp4a-latm".equals(str3)) {
                                                Pair pairM21322a3 = AbstractC8805d.m21322a(bArr2);
                                                int iIntValue4 = ((Integer) pairM21322a3.first).intValue();
                                                iIntValue = ((Integer) pairM21322a3.second).intValue();
                                                i19 = iIntValue4;
                                                str6 = str3;
                                            } else {
                                                str6 = str3;
                                                iIntValue = i20;
                                            }
                                        } else {
                                            iIntValue = i20;
                                        }
                                    }
                                    i22 = -1;
                                    if (i23 != i22) {
                                        Pair pairM21130a5 = m21130a(i23, c8815n);
                                        str3 = (String) pairM21130a5.first;
                                        bArr2 = (byte[]) pairM21130a5.second;
                                        if ("audio/mp4a-latm".equals(str3)) {
                                            Pair pairM21322a4 = AbstractC8805d.m21322a(bArr2);
                                            int iIntValue5 = ((Integer) pairM21322a4.first).intValue();
                                            iIntValue = ((Integer) pairM21322a4.second).intValue();
                                            i19 = iIntValue5;
                                            str6 = str3;
                                        } else {
                                            str6 = str3;
                                            iIntValue = i20;
                                        }
                                    } else {
                                        iIntValue = i20;
                                    }
                                }
                                i40 += iM21340b17;
                                i39 = i19;
                                iM21340b3 = i42;
                            }
                            int i48 = i39;
                            int i49 = iIntValue;
                            i10 = iM21340b3;
                            i9 = 0;
                            if (c8589f.f19631b == null && str6 != null) {
                                String str8 = str5;
                                str5 = str8;
                                c8589f.f19631b = C8708o.m21262a(Integer.toString(iM21340b12), str6, -1, -1, i49, i48, "audio/raw".equals(str6) ? 2 : -1, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), c8524d, 0, str8, null);
                            }
                        } else {
                            int i50 = AbstractC8586c.f19589k0;
                            if (iM21340b5 == i50 || iM21340b5 == AbstractC8586c.f19609u0 || iM21340b5 == AbstractC8586c.f19611v0 || iM21340b5 == AbstractC8586c.f19613w0 || iM21340b5 == AbstractC8586c.f19615x0) {
                                c8815n.m21347e(i8 + 16);
                                String str9 = "application/ttml+xml";
                                if (iM21340b5 == i50) {
                                    str4 = str9;
                                    j5 = Long.MAX_VALUE;
                                    listSingletonList2 = null;
                                } else if (iM21340b5 == AbstractC8586c.f19609u0) {
                                    int i51 = iM21340b4 - 16;
                                    byte[] bArr4 = new byte[i51];
                                    c8815n.m21339a(bArr4, i28, i51);
                                    listSingletonList2 = Collections.singletonList(bArr4);
                                    str4 = "application/x-quicktime-tx3g";
                                    j5 = Long.MAX_VALUE;
                                } else {
                                    if (iM21340b5 == AbstractC8586c.f19611v0) {
                                        str9 = "application/x-mp4-vtt";
                                    } else {
                                        if (iM21340b5 == AbstractC8586c.f19613w0) {
                                            str4 = "application/ttml+xml";
                                            j5 = 0;
                                        } else {
                                            if (iM21340b5 != AbstractC8586c.f19615x0) {
                                                throw new IllegalStateException();
                                            }
                                            c8589f.f19633d = 1;
                                            str9 = "application/x-mp4-cea-608";
                                        }
                                        listSingletonList2 = null;
                                    }
                                    str4 = str9;
                                    j5 = Long.MAX_VALUE;
                                    listSingletonList2 = null;
                                }
                                String str10 = str5;
                                str5 = str10;
                                c8589f.f19631b = C8708o.m21265a(Integer.toString(iM21340b12), str4, 0, str10, -1, c8524d, j5, listSingletonList2);
                            } else if (iM21340b5 == AbstractC8586c.f19555N0) {
                                c8589f.f19631b = C8708o.m21266a(Integer.toString(iM21340b12), "application/x-camera-motion", c8524d);
                            }
                            i9 = i28;
                            j3 = j3;
                            i10 = iM21340b3;
                        }
                        i14 = i30;
                    }
                    c8815n.m21347e(i8 + iM21340b4);
                    i7++;
                    i30 = i14;
                    i25 = i32;
                    i28 = i9;
                    iM21340b3 = i10;
                    j3 = j3;
                }
                int i52 = i28;
                j4 = j3;
                int i53 = i25;
                c8584aM21121b = c8584a.m21121b(AbstractC8586c.f19559Q);
                if (c8584aM21121b != null || (c8585bM21122c = c8584aM21121b.m21122c(AbstractC8586c.f19560R)) == null) {
                    c8602s = null;
                    pairCreate2 = Pair.create(null, null);
                } else {
                    C8815n c8815n6 = c8585bM21122c.f19527P0;
                    c8815n6.m21347e(i53);
                    int iM21340b19 = (c8815n6.m21340b() >> 24) & 255;
                    int iM21355m = c8815n6.m21355m();
                    long[] jArr = new long[iM21355m];
                    long[] jArr2 = new long[iM21355m];
                    for (int i54 = i52; i54 < iM21355m; i54++) {
                        jArr[i54] = iM21340b19 == 1 ? c8815n6.m21356n() : c8815n6.m21353k();
                        jArr2[i54] = iM21340b19 == 1 ? c8815n6.m21349g() : c8815n6.m21340b();
                        byte[] bArr5 = c8815n6.f20643a;
                        int i55 = c8815n6.f20644b;
                        int i56 = i55 + 1;
                        c8815n6.f20644b = i56;
                        int i57 = (bArr5[i55] & 255) << 8;
                        c8815n6.f20644b = i55 + 2;
                        if (((short) ((bArr5[i56] & 255) | i57)) != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        c8815n6.m21347e(i55 + 4);
                    }
                    pairCreate2 = Pair.create(jArr, jArr2);
                    c8602s = null;
                }
                if (c8589f.f19631b == null) {
                    return c8602s;
                }
                return new C8602s(iM21340b12, i, ((Long) pairCreate.first).longValue(), j4, jM21382a, c8589f.f19631b, c8589f.f19633d, c8589f.f19630a, c8589f.f19632c, (long[]) pairCreate2.first, (long[]) pairCreate2.second);
            }
            i3 = 270;
        }
        i2 = i3;
        if (j == -9223372036854775807L) {
            j2 = jM21353k;
        } else {
            j2 = j;
        }
        C8815n c8815n7 = c8585b.f19527P0;
        c8815n7.m21347e(8);
        iM21340b = c8815n7.m21340b();
        int i310 = AbstractC8586c.f19570b;
        if (((iM21340b >> 24) & 255) == 0) {
            i4 = 8;
        } else {
            i4 = 16;
        }
        c8815n7.m21347e(c8815n7.f20644b + i4);
        long jM21353k4 = c8815n7.m21353k();
        if (j2 != -9223372036854775807L) {
        }
        j3 = jM21353k4;
        C8584a c8584aM21121b4 = c8584aM21121b2.m21121b(AbstractC8586c.f19540G).m21121b(AbstractC8586c.f19542H);
        C8815n c8815n8 = c8584aM21121b2.m21122c(AbstractC8586c.f19561S).f19527P0;
        c8815n8.m21347e(8);
        iM21340b2 = (c8815n8.m21340b() >> 24) & 255;
        if (iM21340b2 == 0) {
            i5 = 8;
        } else {
            i5 = 16;
        }
        c8815n8.m21347e(c8815n8.f20644b + i5);
        long jM21353k5 = c8815n8.m21353k();
        if (iM21340b2 == 0) {
            i6 = 4;
        } else {
            i6 = 8;
        }
        c8815n8.m21347e(c8815n8.f20644b + i6);
        int iM21357o6 = c8815n8.m21357o();
        pairCreate = Pair.create(Long.valueOf(jM21353k5), "" + ((char) (((iM21357o6 >> 10) & 31) + 96)) + ((char) (((iM21357o6 >> 5) & 31) + 96)) + ((char) ((iM21357o6 & 31) + 96)));
        c8815n = c8584aM21121b4.m21122c(AbstractC8586c.f19563U).f19527P0;
        String str11 = (String) pairCreate.second;
        c8815n.m21347e(12);
        iM21340b3 = c8815n.m21340b();
        c8589f = new C8589f(iM21340b3);
        i7 = 0;
        while (i7 < iM21340b3) {
            i8 = c8815n.f20644b;
            iM21340b4 = c8815n.m21340b();
            int i311 = i25;
            if (iM21340b4 > 0) {
                z2 = 1;
            } else {
                z2 = i28;
            }
            AbstractC8802a.m21319a(z2, "childAtomSize should be positive");
            iM21340b5 = c8815n.m21340b();
            if (iM21340b5 != AbstractC8586c.f19572c) {
                i9 = i28;
                j3 = j3;
                i10 = iM21340b3;
                c8815n.m21347e(i8 + 16);
                c8815n.m21347e(c8815n.f20644b + 16);
                iM21357o = c8815n.m21357o();
                iM21357o2 = c8815n.m21357o();
                c8815n.m21347e(c8815n.f20644b + 50);
                i11 = c8815n.f20644b;
                if (iM21340b5 == AbstractC8586c.f19569a0) {
                    iM21340b5 = m21129a(c8815n, i8, iM21340b4, c8589f, i7);
                    c8815n.m21347e(i11);
                }
                i12 = -1;
                fM21355m = 1.0f;
                i13 = i9;
                str = null;
                listSingletonList = null;
                bArrCopyOfRange = null;
                while (i11 - i8 < iM21340b4) {
                    c8815n.m21347e(i11);
                    i15 = c8815n.f20644b;
                    iM21340b6 = c8815n.m21340b();
                    if (iM21340b6 != 0) {
                    }
                    if (iM21340b6 > 0) {
                        z3 = 1;
                    } else {
                        z3 = i9;
                    }
                    AbstractC8802a.m21319a(z3, "childAtomSize should be positive");
                    iM21340b7 = c8815n.m21340b();
                    int i312 = i11;
                    if (iM21340b7 != AbstractC8586c.f19544I) {
                        if (iM21340b7 != AbstractC8586c.f19546J) {
                            if (iM21340b7 == AbstractC8586c.f19553M0) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                if (iM21340b5 == AbstractC8586c.f19549K0) {
                                    str = "video/x-vnd.on2.vp8";
                                } else {
                                    str = "video/x-vnd.on2.vp9";
                                }
                            } else if (iM21340b7 == AbstractC8586c.f19582h) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                str = "video/3gpp";
                            } else if (iM21340b7 == AbstractC8586c.f19548K) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                Pair pairM21130a6 = m21130a(i15, c8815n);
                                str = (String) pairM21130a6.first;
                                listSingletonList = Collections.singletonList((byte[]) pairM21130a6.second);
                            } else if (iM21340b7 == AbstractC8586c.f19587j0) {
                                c8815n.m21347e(i15 + 8);
                                fM21355m = c8815n.m21355m() / c8815n.m21355m();
                                i17 = i30;
                                i16 = 1;
                            } else if (iM21340b7 != AbstractC8586c.f19545I0) {
                                i16 = i13;
                                if (iM21340b7 != AbstractC8586c.f19543H0) {
                                    i17 = i30;
                                    break;
                                    break;
                                }
                                iM21352j = c8815n.m21352j();
                                c8815n.m21347e(c8815n.f20644b + 3);
                                if (iM21352j != 0) {
                                    i17 = i30;
                                    break;
                                    break;
                                }
                                iM21352j2 = c8815n.m21352j();
                                if (iM21352j2 == 0) {
                                    i17 = i30;
                                    i12 = i9;
                                } else if (iM21352j2 != 1) {
                                    i17 = i30;
                                    if (iM21352j2 == 2) {
                                        i12 = 2;
                                    } else if (iM21352j2 == i17) {
                                        i12 = i17;
                                    }
                                } else {
                                    i17 = i30;
                                    i12 = 1;
                                }
                            } else {
                                i18 = i15 + 8;
                                while (true) {
                                    if (i18 - i15 >= iM21340b6) {
                                        i16 = i13;
                                        i17 = i30;
                                        bArrCopyOfRange = null;
                                        break;
                                        break;
                                    }
                                    c8815n.m21347e(i18);
                                    iM21340b8 = c8815n.m21340b();
                                    i16 = i13;
                                    if (c8815n.m21340b() == AbstractC8586c.f19547J0) {
                                        bArrCopyOfRange = Arrays.copyOfRange(c8815n.f20643a, i18, i18 + iM21340b8);
                                        i17 = i30;
                                        break;
                                        break;
                                    }
                                    i18 += iM21340b8;
                                    i13 = i16;
                                }
                            }
                            i16 = i13;
                            i17 = i30;
                            break;
                            break;
                        }
                        if (str != null) {
                            throw new IllegalStateException();
                        }
                        c8815n.m21347e(i15 + 8);
                        C8832d c8832dM21393a2 = C8832d.m21393a(c8815n);
                        list = c8832dM21393a2.f20722a;
                        c8589f.f19632c = c8832dM21393a2.f20723b;
                        str = "video/hevc";
                        i11 = i312 + iM21340b6;
                        i30 = i17;
                        i13 = i16;
                    } else {
                        if (str != null) {
                            throw new IllegalStateException();
                        }
                        c8815n.m21347e(i15 + 8);
                        c8829aM21392a = C8829a.m21392a(c8815n);
                        list = c8829aM21392a.f20712a;
                        c8589f.f19632c = c8829aM21392a.f20713b;
                        if (i13 == 0) {
                            fM21355m = c8829aM21392a.f20716e;
                        }
                        str = "video/avc";
                    }
                    listSingletonList = list;
                    i16 = i13;
                    i17 = i30;
                    break;
                    i11 = i312 + iM21340b6;
                    i30 = i17;
                    i13 = i16;
                }
                i14 = i30;
                if (str != null) {
                    c8589f.f19631b = C8708o.m21264a(Integer.toString(iM21340b12), str, -1, iM21357o, iM21357o2, listSingletonList, i2, fM21355m, bArrCopyOfRange, i12, null, c8524d);
                }
            } else {
                i9 = i28;
                j3 = j3;
                i10 = iM21340b3;
                c8815n.m21347e(i8 + 16);
                c8815n.m21347e(c8815n.f20644b + 16);
                iM21357o = c8815n.m21357o();
                iM21357o2 = c8815n.m21357o();
                c8815n.m21347e(c8815n.f20644b + 50);
                i11 = c8815n.f20644b;
                if (iM21340b5 == AbstractC8586c.f19569a0) {
                    iM21340b5 = m21129a(c8815n, i8, iM21340b4, c8589f, i7);
                    c8815n.m21347e(i11);
                }
                i12 = -1;
                fM21355m = 1.0f;
                i13 = i9;
                str = null;
                listSingletonList = null;
                bArrCopyOfRange = null;
                while (i11 - i8 < iM21340b4) {
                    c8815n.m21347e(i11);
                    i15 = c8815n.f20644b;
                    iM21340b6 = c8815n.m21340b();
                    if (iM21340b6 != 0) {
                    }
                    if (iM21340b6 > 0) {
                        z3 = 1;
                    } else {
                        z3 = i9;
                    }
                    AbstractC8802a.m21319a(z3, "childAtomSize should be positive");
                    iM21340b7 = c8815n.m21340b();
                    int i313 = i11;
                    if (iM21340b7 != AbstractC8586c.f19544I) {
                        if (iM21340b7 != AbstractC8586c.f19546J) {
                            if (iM21340b7 == AbstractC8586c.f19553M0) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                if (iM21340b5 == AbstractC8586c.f19549K0) {
                                    str = "video/x-vnd.on2.vp8";
                                } else {
                                    str = "video/x-vnd.on2.vp9";
                                }
                            } else if (iM21340b7 == AbstractC8586c.f19582h) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                str = "video/3gpp";
                            } else if (iM21340b7 == AbstractC8586c.f19548K) {
                                if (str != null) {
                                    throw new IllegalStateException();
                                }
                                Pair pairM21130a7 = m21130a(i15, c8815n);
                                str = (String) pairM21130a7.first;
                                listSingletonList = Collections.singletonList((byte[]) pairM21130a7.second);
                            } else if (iM21340b7 == AbstractC8586c.f19587j0) {
                                c8815n.m21347e(i15 + 8);
                                fM21355m = c8815n.m21355m() / c8815n.m21355m();
                                i17 = i30;
                                i16 = 1;
                            } else if (iM21340b7 != AbstractC8586c.f19545I0) {
                                i16 = i13;
                                if (iM21340b7 != AbstractC8586c.f19543H0) {
                                    i17 = i30;
                                    break;
                                    break;
                                }
                                iM21352j = c8815n.m21352j();
                                c8815n.m21347e(c8815n.f20644b + 3);
                                if (iM21352j != 0) {
                                    i17 = i30;
                                    break;
                                    break;
                                }
                                iM21352j2 = c8815n.m21352j();
                                if (iM21352j2 == 0) {
                                    i17 = i30;
                                    i12 = i9;
                                } else if (iM21352j2 != 1) {
                                    i17 = i30;
                                    if (iM21352j2 == 2) {
                                        i12 = 2;
                                    } else if (iM21352j2 == i17) {
                                        i12 = i17;
                                    }
                                } else {
                                    i17 = i30;
                                    i12 = 1;
                                }
                            } else {
                                i18 = i15 + 8;
                                while (true) {
                                    if (i18 - i15 >= iM21340b6) {
                                        i16 = i13;
                                        i17 = i30;
                                        bArrCopyOfRange = null;
                                        break;
                                        break;
                                    }
                                    c8815n.m21347e(i18);
                                    iM21340b8 = c8815n.m21340b();
                                    i16 = i13;
                                    if (c8815n.m21340b() == AbstractC8586c.f19547J0) {
                                        bArrCopyOfRange = Arrays.copyOfRange(c8815n.f20643a, i18, i18 + iM21340b8);
                                        i17 = i30;
                                        break;
                                        break;
                                    }
                                    i18 += iM21340b8;
                                    i13 = i16;
                                }
                            }
                            i16 = i13;
                            i17 = i30;
                            break;
                            break;
                        }
                        if (str != null) {
                            throw new IllegalStateException();
                        }
                        c8815n.m21347e(i15 + 8);
                        C8832d c8832dM21393a3 = C8832d.m21393a(c8815n);
                        list = c8832dM21393a3.f20722a;
                        c8589f.f19632c = c8832dM21393a3.f20723b;
                        str = "video/hevc";
                        i11 = i313 + iM21340b6;
                        i30 = i17;
                        i13 = i16;
                    } else {
                        if (str != null) {
                            throw new IllegalStateException();
                        }
                        c8815n.m21347e(i15 + 8);
                        c8829aM21392a = C8829a.m21392a(c8815n);
                        list = c8829aM21392a.f20712a;
                        c8589f.f19632c = c8829aM21392a.f20713b;
                        if (i13 == 0) {
                            fM21355m = c8829aM21392a.f20716e;
                        }
                        str = "video/avc";
                    }
                    listSingletonList = list;
                    i16 = i13;
                    i17 = i30;
                    break;
                    i11 = i313 + iM21340b6;
                    i30 = i17;
                    i13 = i16;
                }
                i14 = i30;
                if (str != null) {
                    c8589f.f19631b = C8708o.m21264a(Integer.toString(iM21340b12), str, -1, iM21357o, iM21357o2, listSingletonList, i2, fM21355m, bArrCopyOfRange, i12, null, c8524d);
                }
            }
            c8815n.m21347e(i8 + iM21340b4);
            i7++;
            i30 = i14;
            i25 = i311;
            i28 = i9;
            iM21340b3 = i10;
            j3 = j3;
        }
        int i58 = i28;
        j4 = j3;
        int i59 = i25;
        c8584aM21121b = c8584a.m21121b(AbstractC8586c.f19559Q);
        if (c8584aM21121b != null) {
            c8602s = null;
            pairCreate2 = Pair.create(null, null);
        } else {
            c8602s = null;
            pairCreate2 = Pair.create(null, null);
        }
        if (c8589f.f19631b == null) {
            return c8602s;
        }
        return new C8602s(iM21340b12, i, ((Long) pairCreate.first).longValue(), j4, jM21382a, c8589f.f19631b, c8589f.f19633d, c8589f.f19630a, c8589f.f19632c, (long[]) pairCreate2.first, (long[]) pairCreate2.second);
    }
}
