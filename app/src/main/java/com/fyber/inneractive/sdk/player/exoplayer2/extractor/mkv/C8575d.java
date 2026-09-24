package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8829a;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8831c;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8832d;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8575d {

    /* JADX INFO: renamed from: L */
    public boolean f19406L;

    /* JADX INFO: renamed from: O */
    public InterfaceC8629r f19409O;

    /* JADX INFO: renamed from: P */
    public int f19410P;

    /* JADX INFO: renamed from: a */
    public String f19411a;

    /* JADX INFO: renamed from: b */
    public int f19412b;

    /* JADX INFO: renamed from: c */
    public int f19413c;

    /* JADX INFO: renamed from: d */
    public int f19414d;

    /* JADX INFO: renamed from: e */
    public boolean f19415e;

    /* JADX INFO: renamed from: f */
    public byte[] f19416f;

    /* JADX INFO: renamed from: g */
    public byte[] f19417g;

    /* JADX INFO: renamed from: h */
    public byte[] f19418h;

    /* JADX INFO: renamed from: i */
    public C8524d f19419i;

    /* JADX INFO: renamed from: j */
    public int f19420j = -1;

    /* JADX INFO: renamed from: k */
    public int f19421k = -1;

    /* JADX INFO: renamed from: l */
    public int f19422l = -1;

    /* JADX INFO: renamed from: m */
    public int f19423m = -1;

    /* JADX INFO: renamed from: n */
    public int f19424n = 0;

    /* JADX INFO: renamed from: o */
    public byte[] f19425o = null;

    /* JADX INFO: renamed from: p */
    public int f19426p = -1;

    /* JADX INFO: renamed from: q */
    public boolean f19427q = false;

    /* JADX INFO: renamed from: r */
    public int f19428r = -1;

    /* JADX INFO: renamed from: s */
    public int f19429s = -1;

    /* JADX INFO: renamed from: t */
    public int f19430t = -1;

    /* JADX INFO: renamed from: u */
    public int f19431u = 1000;

    /* JADX INFO: renamed from: v */
    public int f19432v = 200;

    /* JADX INFO: renamed from: w */
    public float f19433w = -1.0f;

    /* JADX INFO: renamed from: x */
    public float f19434x = -1.0f;

    /* JADX INFO: renamed from: y */
    public float f19435y = -1.0f;

    /* JADX INFO: renamed from: z */
    public float f19436z = -1.0f;

    /* JADX INFO: renamed from: A */
    public float f19395A = -1.0f;

    /* JADX INFO: renamed from: B */
    public float f19396B = -1.0f;

    /* JADX INFO: renamed from: C */
    public float f19397C = -1.0f;

    /* JADX INFO: renamed from: D */
    public float f19398D = -1.0f;

    /* JADX INFO: renamed from: E */
    public float f19399E = -1.0f;

    /* JADX INFO: renamed from: F */
    public float f19400F = -1.0f;

    /* JADX INFO: renamed from: G */
    public int f19401G = 1;

    /* JADX INFO: renamed from: H */
    public int f19402H = -1;

    /* JADX INFO: renamed from: I */
    public int f19403I = 8000;

    /* JADX INFO: renamed from: J */
    public long f19404J = 0;

    /* JADX INFO: renamed from: K */
    public long f19405K = 0;

    /* JADX INFO: renamed from: M */
    public boolean f19407M = true;

    /* JADX INFO: renamed from: N */
    public String f19408N = "eng";

    /* JADX WARN: Code duplicated, block: B:235:0x042d  */
    /* JADX WARN: Code duplicated, block: B:236:0x042f  */
    /* JADX WARN: Code duplicated, block: B:239:0x043e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0463  */
    /* JADX WARN: Code duplicated, block: B:242:0x0474  */
    /* JADX WARN: Code duplicated, block: B:244:0x0478  */
    /* JADX WARN: Code duplicated, block: B:246:0x047c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0484  */
    /* JADX WARN: Code duplicated, block: B:253:0x048e  */
    /* JADX WARN: Code duplicated, block: B:256:0x049e  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:261:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:281:0x0556  */
    /* JADX WARN: Code duplicated, block: B:283:0x0566  */
    /* JADX WARN: Code duplicated, block: B:285:0x058b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0595  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:290:0x05bb  */
    /* JADX INFO: renamed from: a */
    public final void m21110a(InterfaceC8568j interfaceC8568j, int i) {
        byte b;
        List listSingletonList;
        String str;
        int iM21378a;
        int i2;
        String str2;
        List list;
        String str3;
        int i3;
        int i4;
        List list2;
        String str4;
        int i5;
        int i6;
        List list3;
        int i7;
        String str5;
        C8708o c8708o;
        int i8;
        float f;
        C8831c c8831c;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        String str6 = this.f19411a;
        str6.getClass();
        str6.hashCode();
        int i12 = 3;
        switch (str6) {
            case "V_MPEG4/ISO/AP":
                b = 0;
                break;
            case "V_MPEG4/ISO/SP":
                b = 1;
                break;
            case "A_MS/ACM":
                b = 2;
                break;
            case "A_TRUEHD":
                b = 3;
                break;
            case "A_VORBIS":
                b = 4;
                break;
            case "A_MPEG/L2":
                b = 5;
                break;
            case "A_MPEG/L3":
                b = 6;
                break;
            case "V_MS/VFW/FOURCC":
                b = 7;
                break;
            case "S_DVBSUB":
                b = 8;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 9;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 10;
                break;
            case "S_VOBSUB":
                b = Ascii.f22503VT;
                break;
            case "A_DTS/LOSSLESS":
                b = Ascii.f22492FF;
                break;
            case "A_AAC":
                b = Ascii.f22490CR;
                break;
            case "A_AC3":
                b = Ascii.f22500SO;
                break;
            case "A_DTS":
                b = 15;
                break;
            case "V_VP8":
                b = 16;
                break;
            case "V_VP9":
                b = 17;
                break;
            case "S_HDMV/PGS":
                b = 18;
                break;
            case "V_THEORA":
                b = 19;
                break;
            case "A_DTS/EXPRESS":
                b = Ascii.DC4;
                break;
            case "A_PCM/INT/LIT":
                b = Ascii.NAK;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = Ascii.SYN;
                break;
            case "S_TEXT/UTF8":
                b = Ascii.ETB;
                break;
            case "V_MPEG2":
                b = 24;
                break;
            case "A_EAC3":
                b = Ascii.f22491EM;
                break;
            case "A_FLAC":
                b = Ascii.SUB;
                break;
            case "A_OPUS":
                b = Ascii.ESC;
                break;
            default:
                b = -1;
                break;
        }
        String str7 = "audio/x-unknown";
        switch (b) {
            case 0:
            case 1:
            case 9:
                byte[] bArr2 = this.f19418h;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str = "video/mp4v-es";
                str7 = str;
                list2 = listSingletonList;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                } else {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1 || (i9 = this.f19423m) == -1) {
                            f = -1.0f;
                        } else {
                            f = (this.f19421k * i8) / (this.f19420j * i9);
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f || this.f19434x == -1.0f || this.f19435y == -1.0f || this.f19436z == -1.0f || this.f19395A == -1.0f || this.f19396B == -1.0f || this.f19397C == -1.0f || this.f19398D == -1.0f || this.f19399E == -1.0f || this.f19400F == -1.0f) {
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.put((byte) 0);
                                byteBufferWrap.putShort((short) ((this.f19433w * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19434x * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19435y * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19436z * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19395A * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19396B * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19397C * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f19398D * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) (this.f19399E + 0.5f));
                                byteBufferWrap.putShort((short) (this.f19400F + 0.5f));
                                byteBufferWrap.putShort((short) this.f19431u);
                                byteBufferWrap.putShort((short) this.f19432v);
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                                throw new C8711r("Unexpected MIME type.");
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                }
                C8538g c8538gMo21092a = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a;
                c8538gMo21092a.mo21053a(c8708o);
                return;
            case 2:
                C8815n c8815n = new C8815n(this.f19418h);
                try {
                    int iM21348f = c8815n.m21348f();
                    if (iM21348f != 1) {
                        if (iM21348f == 65534) {
                            c8815n.m21347e(24);
                            long jM21349g = c8815n.m21349g();
                            UUID uuid = C8576e.f19439b0;
                            if (jM21349g != uuid.getMostSignificantBits() || c8815n.m21349g() != uuid.getLeastSignificantBits()) {
                            }
                            iM21378a = -1;
                            list2 = null;
                            i4 = iM21378a;
                            list = list2;
                            str2 = str7;
                            i3 = -1;
                            boolean z2 = this.f19407M;
                            if (this.f19406L) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            i6 = (z2 ? 1 : 0) | i5;
                            if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                                list3 = list;
                                i7 = i3;
                                if ("video".equals(AbstractC8810i.m21326b(str2))) {
                                    if (this.f19424n == 0) {
                                        i10 = this.f19422l;
                                        if (i10 == -1) {
                                            i10 = this.f19420j;
                                        }
                                        this.f19422l = i10;
                                        i11 = this.f19423m;
                                        if (i11 == -1) {
                                            i11 = this.f19421k;
                                        }
                                        this.f19423m = i11;
                                    }
                                    i8 = this.f19422l;
                                    if (i8 != -1) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f19427q) {
                                        if (this.f19433w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                                    } else {
                                        c8831c = null;
                                    }
                                    c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                                    i12 = 2;
                                } else {
                                    str5 = str2;
                                    if ("application/x-subrip".equals(str5)) {
                                        c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                                    } else {
                                        if ("application/vobsub".equals(str5)) {
                                        }
                                        c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                                    }
                                }
                                break;
                            } else {
                                c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                                i12 = 1;
                            }
                            C8538g c8538gMo21092a2 = interfaceC8568j.mo21092a(this.f19412b, i12);
                            this.f19409O = c8538gMo21092a2;
                            c8538gMo21092a2.mo21053a(c8708o);
                            return;
                        }
                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        iM21378a = -1;
                        list2 = null;
                        i4 = iM21378a;
                        list = list2;
                        str2 = str7;
                        i3 = -1;
                        boolean z3 = this.f19407M;
                        if (this.f19406L) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        i6 = (z3 ? 1 : 0) | i5;
                        if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                            list3 = list;
                            i7 = i3;
                            if ("video".equals(AbstractC8810i.m21326b(str2))) {
                                if (this.f19424n == 0) {
                                    i10 = this.f19422l;
                                    if (i10 == -1) {
                                        i10 = this.f19420j;
                                    }
                                    this.f19422l = i10;
                                    i11 = this.f19423m;
                                    if (i11 == -1) {
                                        i11 = this.f19421k;
                                    }
                                    this.f19423m = i11;
                                }
                                i8 = this.f19422l;
                                if (i8 != -1) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f19427q) {
                                    if (this.f19433w != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                                } else {
                                    c8831c = null;
                                }
                                c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                                i12 = 2;
                            } else {
                                str5 = str2;
                                if ("application/x-subrip".equals(str5)) {
                                    c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                                } else {
                                    if ("application/vobsub".equals(str5)) {
                                    }
                                    c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                                }
                            }
                            break;
                        } else {
                            c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                            i12 = 1;
                        }
                        C8538g c8538gMo21092a3 = interfaceC8568j.mo21092a(this.f19412b, i12);
                        this.f19409O = c8538gMo21092a3;
                        c8538gMo21092a3.mo21053a(c8708o);
                        return;
                    }
                    iM21378a = AbstractC8827z.m21378a(this.f19402H);
                    if (iM21378a == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f19402H + ". Setting mimeType to audio/x-unknown");
                        iM21378a = -1;
                    } else {
                        str7 = "audio/raw";
                    }
                    list2 = null;
                    i4 = iM21378a;
                    list = list2;
                    str2 = str7;
                    i3 = -1;
                    boolean z4 = this.f19407M;
                    if (this.f19406L) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    i6 = (z4 ? 1 : 0) | i5;
                    if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                        list3 = list;
                        i7 = i3;
                        if ("video".equals(AbstractC8810i.m21326b(str2))) {
                            if (this.f19424n == 0) {
                                i10 = this.f19422l;
                                if (i10 == -1) {
                                    i10 = this.f19420j;
                                }
                                this.f19422l = i10;
                                i11 = this.f19423m;
                                if (i11 == -1) {
                                    i11 = this.f19421k;
                                }
                                this.f19423m = i11;
                            }
                            i8 = this.f19422l;
                            if (i8 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f19427q) {
                                if (this.f19433w != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                            } else {
                                c8831c = null;
                            }
                            c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                            i12 = 2;
                        } else {
                            str5 = str2;
                            if ("application/x-subrip".equals(str5)) {
                                c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                            } else {
                                if ("application/vobsub".equals(str5)) {
                                }
                                c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                            }
                        }
                        break;
                    } else {
                        c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                        i12 = 1;
                    }
                    C8538g c8538gMo21092a4 = interfaceC8568j.mo21092a(this.f19412b, i12);
                    this.f19409O = c8538gMo21092a4;
                    c8538gMo21092a4.mo21053a(c8708o);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new C8711r("Error parsing MS/ACM codec private");
                }
            case 3:
                str7 = "audio/true-hd";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z5 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z5 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a5 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a5;
                c8538gMo21092a5.mo21053a(c8708o);
                return;
            case 4:
                byte[] bArr3 = this.f19418h;
                try {
                    if (bArr3[0] != 2) {
                        throw new C8711r("Error parsing vorbis codec private");
                    }
                    int i13 = 1;
                    int i14 = 0;
                    while (true) {
                        int i15 = bArr3[i13];
                        if (i15 == -1) {
                            i14 += 255;
                            i13++;
                        } else {
                            int i16 = i13 + 1;
                            int i17 = i14 + i15;
                            int i18 = 0;
                            while (true) {
                                int i19 = bArr3[i16];
                                if (i19 != -1) {
                                    int i20 = i16 + 1;
                                    int i21 = i18 + i19;
                                    if (bArr3[i20] != 1) {
                                        throw new C8711r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i17];
                                    System.arraycopy(bArr3, i20, bArr4, 0, i17);
                                    int i22 = i20 + i17;
                                    if (bArr3[i22] != 3) {
                                        throw new C8711r("Error parsing vorbis codec private");
                                    }
                                    int i23 = i22 + i21;
                                    if (bArr3[i23] != 5) {
                                        throw new C8711r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i23];
                                    System.arraycopy(bArr3, i23, bArr5, 0, bArr3.length - i23);
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    i2 = 8192;
                                    str2 = "audio/vorbis";
                                    list = arrayList;
                                    i3 = i2;
                                    i4 = -1;
                                    boolean z6 = this.f19407M;
                                    if (this.f19406L) {
                                        i5 = 2;
                                    } else {
                                        i5 = 0;
                                    }
                                    i6 = (z6 ? 1 : 0) | i5;
                                    if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                                        list3 = list;
                                        i7 = i3;
                                        if ("video".equals(AbstractC8810i.m21326b(str2))) {
                                            if (this.f19424n == 0) {
                                                i10 = this.f19422l;
                                                if (i10 == -1) {
                                                    i10 = this.f19420j;
                                                }
                                                this.f19422l = i10;
                                                i11 = this.f19423m;
                                                if (i11 == -1) {
                                                    i11 = this.f19421k;
                                                }
                                                this.f19423m = i11;
                                            }
                                            i8 = this.f19422l;
                                            if (i8 != -1) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.f19427q) {
                                                if (this.f19433w != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                                            } else {
                                                c8831c = null;
                                            }
                                            c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                                            i12 = 2;
                                        } else {
                                            str5 = str2;
                                            if ("application/x-subrip".equals(str5)) {
                                                c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                                            } else {
                                                if ("application/vobsub".equals(str5)) {
                                                }
                                                c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                                            }
                                        }
                                        break;
                                    } else {
                                        c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                                        i12 = 1;
                                    }
                                    C8538g c8538gMo21092a6 = interfaceC8568j.mo21092a(this.f19412b, i12);
                                    this.f19409O = c8538gMo21092a6;
                                    c8538gMo21092a6.mo21053a(c8708o);
                                    return;
                                }
                                i18 += 255;
                                i16++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw new C8711r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                str3 = "audio/mpeg-L2";
                str2 = str3;
                i3 = 4096;
                i4 = -1;
                list = null;
                boolean z7 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z7 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a7 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a7;
                c8538gMo21092a7.mo21053a(c8708o);
                return;
            case 6:
                str3 = "audio/mpeg";
                str2 = str3;
                i3 = 4096;
                i4 = -1;
                list = null;
                boolean z8 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z8 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a8 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a8;
                c8538gMo21092a8.mo21053a(c8708o);
                return;
            case 7:
                byte[] bArr6 = this.f19418h;
                try {
                    if (16 > bArr6.length) {
                        throw new IllegalArgumentException();
                    }
                    if (((((long) bArr6[16]) & 255) | ((((long) bArr6[17]) & 255) << 8) | ((((long) bArr6[18]) & 255) << 16) | ((((long) bArr6[19]) & 255) << 24)) != 826496599) {
                        listSingletonList = null;
                    } else {
                        int i24 = 40;
                        while (true) {
                            if (i24 >= bArr6.length - 4) {
                                throw new C8711r("Failed to find FourCC VC1 initialization data");
                            }
                            if (bArr6[i24] == 0 && bArr6[i24 + 1] == 0 && bArr6[i24 + 2] == 1 && bArr6[i24 + 3] == 15) {
                                listSingletonList = Collections.singletonList(Arrays.copyOfRange(bArr6, i24, bArr6.length));
                            } else {
                                i24++;
                            }
                        }
                    }
                    if (listSingletonList != null) {
                        str7 = "video/wvc1";
                    } else {
                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                        str7 = "video/x-unknown";
                    }
                    list2 = listSingletonList;
                    iM21378a = -1;
                    i4 = iM21378a;
                    list = list2;
                    str2 = str7;
                    i3 = -1;
                    boolean z9 = this.f19407M;
                    if (this.f19406L) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    i6 = (z9 ? 1 : 0) | i5;
                    if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                        list3 = list;
                        i7 = i3;
                        if ("video".equals(AbstractC8810i.m21326b(str2))) {
                            if (this.f19424n == 0) {
                                i10 = this.f19422l;
                                if (i10 == -1) {
                                    i10 = this.f19420j;
                                }
                                this.f19422l = i10;
                                i11 = this.f19423m;
                                if (i11 == -1) {
                                    i11 = this.f19421k;
                                }
                                this.f19423m = i11;
                            }
                            i8 = this.f19422l;
                            if (i8 != -1) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f19427q) {
                                if (this.f19433w != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                            } else {
                                c8831c = null;
                            }
                            c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                            i12 = 2;
                        } else {
                            str5 = str2;
                            if ("application/x-subrip".equals(str5)) {
                                c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                            } else {
                                if ("application/vobsub".equals(str5)) {
                                }
                                c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                            }
                        }
                        break;
                    } else {
                        c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                        i12 = 1;
                    }
                    C8538g c8538gMo21092a9 = interfaceC8568j.mo21092a(this.f19412b, i12);
                    this.f19409O = c8538gMo21092a9;
                    c8538gMo21092a9.mo21053a(c8708o);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw new C8711r("Error parsing FourCC VC1 codec private");
                }
            case 8:
                byte[] bArr7 = this.f19418h;
                listSingletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                str = "application/dvbsubs";
                str7 = str;
                list2 = listSingletonList;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z10 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z10 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a10 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a10;
                c8538gMo21092a10.mo21053a(c8708o);
                return;
            case 10:
                C8829a c8829aM21392a = C8829a.m21392a(new C8815n(this.f19418h));
                list2 = c8829aM21392a.f20712a;
                this.f19410P = c8829aM21392a.f20713b;
                str4 = "video/avc";
                str7 = str4;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z11 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z11 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a11 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a11;
                c8538gMo21092a11.mo21053a(c8708o);
                return;
            case 11:
                listSingletonList = Collections.singletonList(this.f19418h);
                str = "application/vobsub";
                str7 = str;
                list2 = listSingletonList;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z12 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z12 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a12 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a12;
                c8538gMo21092a12.mo21053a(c8708o);
                return;
            case 12:
                str7 = "audio/vnd.dts.hd";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z13 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z13 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a13 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a13;
                c8538gMo21092a13.mo21053a(c8708o);
                return;
            case 13:
                listSingletonList = Collections.singletonList(this.f19418h);
                str = "audio/mp4a-latm";
                str7 = str;
                list2 = listSingletonList;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z14 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z14 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a14 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a14;
                c8538gMo21092a14.mo21053a(c8708o);
                return;
            case 14:
                str7 = "audio/ac3";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z15 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z15 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a15 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a15;
                c8538gMo21092a15.mo21053a(c8708o);
                return;
            case 15:
            case 20:
                str7 = "audio/vnd.dts";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z16 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z16 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a16 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a16;
                c8538gMo21092a16.mo21053a(c8708o);
                return;
            case 16:
                str7 = "video/x-vnd.on2.vp8";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z17 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z17 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a17 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a17;
                c8538gMo21092a17.mo21053a(c8708o);
                return;
            case 17:
                str7 = "video/x-vnd.on2.vp9";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z18 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z18 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a18 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a18;
                c8538gMo21092a18.mo21053a(c8708o);
                return;
            case 18:
                str7 = "application/pgs";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z19 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z19 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a19 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a19;
                c8538gMo21092a19.mo21053a(c8708o);
                return;
            case 19:
                str7 = "video/x-unknown";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z110 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z110 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a110 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a110;
                c8538gMo21092a110.mo21053a(c8708o);
                return;
            case 21:
                iM21378a = AbstractC8827z.m21378a(this.f19402H);
                if (iM21378a == 0) {
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f19402H + ". Setting mimeType to audio/x-unknown");
                    iM21378a = -1;
                } else {
                    str7 = "audio/raw";
                }
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z111 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z111 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a111 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a111;
                c8538gMo21092a111.mo21053a(c8708o);
                return;
            case 22:
                C8832d c8832dM21393a = C8832d.m21393a(new C8815n(this.f19418h));
                list2 = c8832dM21393a.f20722a;
                this.f19410P = c8832dM21393a.f20723b;
                str4 = "video/hevc";
                str7 = str4;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z112 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z112 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a112 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a112;
                c8538gMo21092a112.mo21053a(c8708o);
                return;
            case 23:
                str7 = "application/x-subrip";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z113 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z113 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a113 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a113;
                c8538gMo21092a113.mo21053a(c8708o);
                return;
            case 24:
                str7 = "video/mpeg2";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z114 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z114 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a114 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a114;
                c8538gMo21092a114.mo21053a(c8708o);
                return;
            case 25:
                str7 = "audio/eac3";
                iM21378a = -1;
                list2 = null;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z115 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z115 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a115 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a115;
                c8538gMo21092a115.mo21053a(c8708o);
                return;
            case 26:
                listSingletonList = Collections.singletonList(this.f19418h);
                str = "audio/flac";
                str7 = str;
                list2 = listSingletonList;
                iM21378a = -1;
                i4 = iM21378a;
                list = list2;
                str2 = str7;
                i3 = -1;
                boolean z116 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z116 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a116 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a116;
                c8538gMo21092a116.mo21053a(c8708o);
                return;
            case 27:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.f19418h);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f19404J).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f19405K).array());
                i2 = 5760;
                list = arrayList2;
                str2 = "audio/opus";
                i3 = i2;
                i4 = -1;
                boolean z117 = this.f19407M;
                if (this.f19406L) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = (z117 ? 1 : 0) | i5;
                if ("audio".equals(AbstractC8810i.m21326b(str2))) {
                    list3 = list;
                    i7 = i3;
                    if ("video".equals(AbstractC8810i.m21326b(str2))) {
                        if (this.f19424n == 0) {
                            i10 = this.f19422l;
                            if (i10 == -1) {
                                i10 = this.f19420j;
                            }
                            this.f19422l = i10;
                            i11 = this.f19423m;
                            if (i11 == -1) {
                                i11 = this.f19421k;
                            }
                            this.f19423m = i11;
                        }
                        i8 = this.f19422l;
                        if (i8 != -1) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f19427q) {
                            if (this.f19433w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            c8831c = new C8831c(this.f19428r, this.f19430t, this.f19429s, bArr);
                        } else {
                            c8831c = null;
                        }
                        c8708o = C8708o.m21264a(Integer.toString(i), str2, i7, this.f19420j, this.f19421k, list3, -1, f, this.f19425o, this.f19426p, c8831c, this.f19419i);
                        i12 = 2;
                    } else {
                        str5 = str2;
                        if ("application/x-subrip".equals(str5)) {
                            c8708o = C8708o.m21265a(Integer.toString(i), str5, i6, this.f19408N, -1, this.f19419i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                        } else {
                            if ("application/vobsub".equals(str5)) {
                            }
                            c8708o = new C8708o(Integer.toString(i), null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f19408N, -1, Long.MAX_VALUE, list3, this.f19419i, null);
                        }
                    }
                    break;
                } else {
                    c8708o = C8708o.m21262a(Integer.toString(i), str2, -1, i3, this.f19401G, this.f19403I, i4, -1, -1, list, this.f19419i, i6, this.f19408N, null);
                    i12 = 1;
                }
                C8538g c8538gMo21092a117 = interfaceC8568j.mo21092a(this.f19412b, i12);
                this.f19409O = c8538gMo21092a117;
                c8538gMo21092a117.mo21053a(c8708o);
                return;
            default:
                throw new C8711r("Unrecognized codec identifier.");
        }
    }
}
