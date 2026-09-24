package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8523c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8526a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8808g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.firebase.FirebaseError;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8576e implements InterfaceC8567i {

    /* JADX INFO: renamed from: Z */
    public static final byte[] f19437Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: a0 */
    public static final byte[] f19438a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: b0 */
    public static final UUID f19439b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: A */
    public long f19440A;

    /* JADX INFO: renamed from: B */
    public C8808g f19441B;

    /* JADX INFO: renamed from: C */
    public C8808g f19442C;

    /* JADX INFO: renamed from: D */
    public boolean f19443D;

    /* JADX INFO: renamed from: E */
    public int f19444E;

    /* JADX INFO: renamed from: F */
    public long f19445F;

    /* JADX INFO: renamed from: G */
    public long f19446G;

    /* JADX INFO: renamed from: H */
    public int f19447H;

    /* JADX INFO: renamed from: I */
    public int f19448I;

    /* JADX INFO: renamed from: J */
    public int[] f19449J;

    /* JADX INFO: renamed from: K */
    public int f19450K;

    /* JADX INFO: renamed from: L */
    public int f19451L;

    /* JADX INFO: renamed from: M */
    public int f19452M;

    /* JADX INFO: renamed from: N */
    public int f19453N;

    /* JADX INFO: renamed from: O */
    public boolean f19454O;

    /* JADX INFO: renamed from: P */
    public boolean f19455P;

    /* JADX INFO: renamed from: Q */
    public boolean f19456Q;

    /* JADX INFO: renamed from: R */
    public boolean f19457R;

    /* JADX INFO: renamed from: S */
    public byte f19458S;

    /* JADX INFO: renamed from: T */
    public int f19459T;

    /* JADX INFO: renamed from: U */
    public int f19460U;

    /* JADX INFO: renamed from: V */
    public int f19461V;

    /* JADX INFO: renamed from: W */
    public boolean f19462W;

    /* JADX INFO: renamed from: X */
    public boolean f19463X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC8568j f19464Y;

    /* JADX INFO: renamed from: a */
    public final C8573b f19465a;

    /* JADX INFO: renamed from: b */
    public final C8578g f19466b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f19467c;

    /* JADX INFO: renamed from: d */
    public final boolean f19468d;

    /* JADX INFO: renamed from: e */
    public final C8815n f19469e;

    /* JADX INFO: renamed from: f */
    public final C8815n f19470f;

    /* JADX INFO: renamed from: g */
    public final C8815n f19471g;

    /* JADX INFO: renamed from: h */
    public final C8815n f19472h;

    /* JADX INFO: renamed from: i */
    public final C8815n f19473i;

    /* JADX INFO: renamed from: j */
    public final C8815n f19474j;

    /* JADX INFO: renamed from: k */
    public final C8815n f19475k;

    /* JADX INFO: renamed from: l */
    public final C8815n f19476l;

    /* JADX INFO: renamed from: m */
    public final C8815n f19477m;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f19478n;

    /* JADX INFO: renamed from: o */
    public long f19479o;

    /* JADX INFO: renamed from: p */
    public long f19480p;

    /* JADX INFO: renamed from: q */
    public long f19481q;

    /* JADX INFO: renamed from: r */
    public long f19482r;

    /* JADX INFO: renamed from: s */
    public long f19483s;

    /* JADX INFO: renamed from: t */
    public C8575d f19484t;

    /* JADX INFO: renamed from: u */
    public boolean f19485u;

    /* JADX INFO: renamed from: v */
    public int f19486v;

    /* JADX INFO: renamed from: w */
    public long f19487w;

    /* JADX INFO: renamed from: x */
    public boolean f19488x;

    /* JADX INFO: renamed from: y */
    public long f19489y;

    /* JADX INFO: renamed from: z */
    public long f19490z;

    public C8576e() {
        C8573b c8573b = new C8573b();
        this.f19480p = -1L;
        this.f19481q = -9223372036854775807L;
        this.f19482r = -9223372036854775807L;
        this.f19483s = -9223372036854775807L;
        this.f19489y = -1L;
        this.f19490z = -1L;
        this.f19440A = -9223372036854775807L;
        this.f19465a = c8573b;
        c8573b.f19390d = new C8574c(this);
        this.f19468d = true;
        this.f19466b = new C8578g();
        this.f19467c = new SparseArray();
        this.f19471g = new C8815n(4);
        this.f19472h = new C8815n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19473i = new C8815n(4);
        this.f19469e = new C8815n(AbstractC8813l.f20635a);
        this.f19470f = new C8815n(4);
        this.f19474j = new C8815n();
        this.f19475k = new C8815n();
        this.f19476l = new C8815n(8);
        this.f19477m = new C8815n();
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0590  */
    /* JADX WARN: Code duplicated, block: B:301:0x059f  */
    /* JADX WARN: Code duplicated, block: B:303:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:306:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:310:0x05cf A[LOOP:9: B:307:0x05af->B:310:0x05cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x05db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:316:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:318:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:320:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:324:0x0626 A[LOOP:12: B:323:0x0624->B:324:0x0626, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:326:0x063d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0649 A[LOOP:11: B:319:0x05fc->B:328:0x0649, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:347:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:350:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:356:0x06da  */
    /* JADX WARN: Code duplicated, block: B:358:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:359:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:438:0x084e  */
    /* JADX WARN: Code duplicated, block: B:609:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x068a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.b] */
    /* JADX WARN: Type inference failed for: r3v111, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v153, types: [int] */
    /* JADX WARN: Type inference failed for: r3v156 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v183 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        boolean z;
        boolean z2;
        long j;
        int i;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c;
        int i13;
        long j2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        byte b;
        boolean z8;
        int i24;
        int i25;
        long j3;
        boolean z9;
        int i26;
        int iM21116a;
        long j4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        InterfaceC8628q c8627p;
        C8808g c8808g;
        int i27;
        C8808g c8808g2;
        boolean z16;
        boolean z17 = false;
        this.f19462W = false;
        boolean z18 = true;
        while (z18 && !this.f19462W) {
            C8573b c8573b = this.f19465a;
            if (c8573b.f19390d == null) {
                z = z17;
                throw new IllegalStateException();
            }
            while (true) {
                z = z17;
                if (c8573b.f19388b.isEmpty() || c8527b.f19124c < ((C8572a) c8573b.f19388b.peek()).f19386b) {
                    int i28 = 8;
                    if (c8573b.f19391e == 0) {
                        long jM21117a = c8573b.f19389c.m21117a(c8527b, true, z, 4);
                        if (jM21117a == -2) {
                            c8527b.f19126e = z ? 1 : 0;
                            ?? r3 = z;
                            while (true) {
                                c8527b.m21025a(c8573b.f19387a, r3, 4, r3);
                                byte b2 = c8573b.f19387a[r3];
                                i26 = 0;
                                do {
                                    long[] jArr = C8578g.f19493d;
                                    if (i26 < 8) {
                                        j = 0;
                                        j4 = jArr[i26] & ((long) b2);
                                        i26++;
                                    } else {
                                        j = 0;
                                        i26 = -1;
                                    }
                                    if (i26 == -1 && i26 <= 4) {
                                        iM21116a = (int) C8578g.m21116a(c8573b.f19387a, i26, false);
                                        c8573b.f19390d.f19394a.getClass();
                                        if (iM21116a == 357149030 || iM21116a == 524531317 || iM21116a == 475249515 || iM21116a == 374648427) {
                                        }
                                    }
                                    c8527b.m21023a(1);
                                    r3 = 0;
                                } while (j4 == 0);
                                if (i26 == -1) {
                                }
                                c8527b.m21023a(1);
                                r3 = 0;
                            }
                            c8527b.m21023a(i26);
                            j3 = iM21116a;
                        } else {
                            j = 0;
                            j3 = jM21117a;
                        }
                        z2 = true;
                        if (j3 == -1) {
                            z18 = false;
                            z9 = false;
                        } else {
                            c8573b.f19392f = (int) j3;
                            c8573b.f19391e = 1;
                        }
                    } else {
                        z2 = true;
                        j = 0;
                    }
                    if (c8573b.f19391e == z2) {
                        c8573b.f19393g = c8573b.f19389c.m21117a(c8527b, false, z2, 8);
                        c8573b.f19391e = 2;
                    }
                    C8574c c8574c = c8573b.f19390d;
                    int i29 = c8573b.f19392f;
                    c8574c.f19394a.getClass();
                    switch (i29) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 241:
                        case 251:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        c8527b.m21023a((int) c8573b.f19393g);
                        c8573b.f19391e = 0;
                        z = false;
                    } else if (i != 1) {
                        char c2 = 6;
                        byte b3 = 255;
                        if (i == 2) {
                            long j5 = c8573b.f19393g;
                            if (j5 > 8) {
                                throw new C8711r("Invalid integer size: " + c8573b.f19393g);
                            }
                            C8574c c8574c2 = c8573b.f19390d;
                            int i30 = c8573b.f19392f;
                            int i31 = (int) j5;
                            c8527b.m21027b(c8573b.f19387a, 0, i31, false);
                            long j6 = j;
                            for (int i32 = 0; i32 < i31; i32++) {
                                j6 = (j6 << 8) | ((long) (c8573b.f19387a[i32] & 255));
                            }
                            C8576e c8576e = c8574c2.f19394a;
                            c8576e.getClass();
                            if (i30 != 20529) {
                                if (i30 != 20530) {
                                    switch (i30) {
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                            c8576e.f19484t.f19413c = (int) j6;
                                            break;
                                        case 136:
                                            c8576e.f19484t.f19406L = j6 == 1;
                                            break;
                                        case 155:
                                            c8576e.f19446G = c8576e.m21111a(j6);
                                            break;
                                        case 159:
                                            c8576e.f19484t.f19401G = (int) j6;
                                            break;
                                        case 176:
                                            c8576e.f19484t.f19420j = (int) j6;
                                            break;
                                        case 179:
                                            c8576e.f19441B.m21324a(c8576e.m21111a(j6));
                                            break;
                                        case 186:
                                            c8576e.f19484t.f19421k = (int) j6;
                                            break;
                                        case AD_RESPONSE_EMPTY_VALUE:
                                            c8576e.f19484t.f19412b = (int) j6;
                                            break;
                                        case 231:
                                            c8576e.f19440A = c8576e.m21111a(j6);
                                            break;
                                        case 241:
                                            if (!c8576e.f19443D) {
                                                c8576e.f19442C.m21324a(j6);
                                                c8576e.f19443D = true;
                                            }
                                            break;
                                        case 251:
                                            c8576e.f19463X = true;
                                            break;
                                        case 16980:
                                            if (j6 != 3) {
                                                throw new C8711r("ContentCompAlgo " + j6 + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (j6 < 1 || j6 > 2) {
                                                throw new C8711r("DocTypeReadVersion " + j6 + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (j6 != 1) {
                                                throw new C8711r("EBMLReadVersion " + j6 + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (j6 != 5) {
                                                throw new C8711r("ContentEncAlgo " + j6 + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (j6 != 1) {
                                                throw new C8711r("AESSettingsCipherMode " + j6 + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            c8576e.f19487w = j6 + c8576e.f19480p;
                                            break;
                                        case 21432:
                                            int i33 = (int) j6;
                                            if (i33 == 0) {
                                                z4 = false;
                                                c8576e.f19484t.f19426p = 0;
                                            } else if (i33 == 1) {
                                                c8576e.f19484t.f19426p = 2;
                                            } else if (i33 == 3) {
                                                c8576e.f19484t.f19426p = 1;
                                            } else if (i33 == 15) {
                                                c8576e.f19484t.f19426p = 3;
                                            }
                                            c8573b.f19391e = z4 ? 1 : 0;
                                            z5 = z4;
                                            break;
                                        case 21680:
                                            c8576e.f19484t.f19422l = (int) j6;
                                            break;
                                        case 21682:
                                            c8576e.f19484t.f19424n = (int) j6;
                                            break;
                                        case 21690:
                                            c8576e.f19484t.f19423m = (int) j6;
                                            break;
                                        case 21930:
                                            c8576e.f19484t.f19407M = j6 == 1;
                                            break;
                                        case 22186:
                                            c8576e.f19484t.f19404J = j6;
                                            break;
                                        case 22203:
                                            c8576e.f19484t.f19405K = j6;
                                            break;
                                        case 25188:
                                            c8576e.f19484t.f19402H = (int) j6;
                                            break;
                                        case 2352003:
                                            c8576e.f19484t.f19414d = (int) j6;
                                            break;
                                        case 2807729:
                                            c8576e.f19481q = j6;
                                            break;
                                        default:
                                            switch (i30) {
                                                case 21945:
                                                    int i34 = (int) j6;
                                                    if (i34 == 1) {
                                                        c8576e.f19484t.f19430t = 2;
                                                    } else if (i34 == 2) {
                                                        c8576e.f19484t.f19430t = 1;
                                                    }
                                                    break;
                                                case 21946:
                                                    int i35 = (int) j6;
                                                    if (i35 == 1) {
                                                        c8576e.f19484t.f19429s = 3;
                                                    } else if (i35 == 16) {
                                                        c8576e.f19484t.f19429s = 6;
                                                    } else if (i35 == 18) {
                                                        c8576e.f19484t.f19429s = 7;
                                                    } else if (i35 == 6 || i35 == 7) {
                                                        c8576e.f19484t.f19429s = 3;
                                                    }
                                                    break;
                                                case 21947:
                                                    C8575d c8575d = c8576e.f19484t;
                                                    c8575d.f19427q = true;
                                                    int i36 = (int) j6;
                                                    if (i36 == 1) {
                                                        c8575d.f19428r = 1;
                                                    } else if (i36 == 9) {
                                                        c8575d.f19428r = 6;
                                                    } else if (i36 == 4 || i36 == 5 || i36 == 6 || i36 == 7) {
                                                        c8575d.f19428r = 2;
                                                    }
                                                    break;
                                                case 21948:
                                                    c8576e.f19484t.f19431u = (int) j6;
                                                    break;
                                                case 21949:
                                                    c8576e.f19484t.f19432v = (int) j6;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j6 != 1) {
                                    throw new C8711r("ContentEncodingScope " + j6 + " not supported");
                                }
                            } else if (j6 != j) {
                                throw new C8711r("ContentEncodingOrder " + j6 + " not supported");
                            }
                            z4 = false;
                            c8573b.f19391e = z4 ? 1 : 0;
                            z5 = z4;
                        } else if (i == 3) {
                            long j7 = c8573b.f19393g;
                            if (j7 > 2147483647L) {
                                throw new C8711r("String element size: " + c8573b.f19393g);
                            }
                            C8574c c8574c3 = c8573b.f19390d;
                            int i37 = c8573b.f19392f;
                            int i38 = (int) j7;
                            if (i38 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i38];
                                c8527b.m21027b(bArr, 0, i38, false);
                                str = new String(bArr);
                            }
                            C8576e c8576e2 = c8574c3.f19394a;
                            c8576e2.getClass();
                            if (i37 == 134) {
                                c8576e2.f19484t.f19411a = str;
                            } else if (i37 != 17026) {
                                if (i37 == 2274716) {
                                    c8576e2.f19484t.f19408N = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw new C8711r("DocType " + str + " not supported");
                            }
                            z5 = false;
                            c8573b.f19391e = 0;
                        } else if (i == 4) {
                            C8574c c8574c4 = c8573b.f19390d;
                            int i39 = c8573b.f19392f;
                            int i40 = (int) c8573b.f19393g;
                            C8576e c8576e3 = c8574c4.f19394a;
                            if (i39 == 161 || i39 == 163) {
                                z6 = false;
                                if (c8576e3.f19444E == 0) {
                                    c8576e3.f19450K = (int) c8576e3.f19466b.m21117a(c8527b, false, true, 8);
                                    c8576e3.f19451L = c8576e3.f19466b.f19496c;
                                    c8576e3.f19446G = -9223372036854775807L;
                                    c8576e3.f19444E = 1;
                                    C8815n c8815n = c8576e3.f19471g;
                                    c8815n.f20644b = 0;
                                    c8815n.f20645c = 0;
                                }
                                C8575d c8575d2 = (C8575d) c8576e3.f19467c.get(c8576e3.f19450K);
                                if (c8575d2 == null) {
                                    c8527b.m21023a(i40 - c8576e3.f19451L);
                                    c8576e3.f19444E = 0;
                                } else {
                                    if (c8576e3.f19444E == 1) {
                                        c8576e3.m21112a((C8527b) c8527b, 3);
                                        int i41 = (c8576e3.f19471g.f20643a[2] & 6) >> 1;
                                        if (i41 == 0) {
                                            c8576e3.f19448I = 1;
                                            int[] iArr = c8576e3.f19449J;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else if (iArr.length < 1) {
                                                iArr = new int[Math.max(iArr.length * 2, 1)];
                                            }
                                            c8576e3.f19449J = iArr;
                                            iArr[0] = (i40 - c8576e3.f19451L) - 3;
                                        } else {
                                            if (i39 != 163) {
                                                throw new C8711r("Lacing only supported in SimpleBlocks.");
                                            }
                                            c8576e3.m21112a((C8527b) c8527b, 4);
                                            int i42 = (c8576e3.f19471g.f20643a[3] & 255) + 1;
                                            c8576e3.f19448I = i42;
                                            int[] iArr2 = c8576e3.f19449J;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i42];
                                            } else {
                                                if (iArr2.length < i42) {
                                                    i3 = 2;
                                                    iArr2 = new int[Math.max(iArr2.length * 2, i42)];
                                                }
                                                c8576e3.f19449J = iArr2;
                                                if (i41 == i3) {
                                                    int i43 = (i40 - c8576e3.f19451L) - 4;
                                                    int i44 = c8576e3.f19448I;
                                                    Arrays.fill(iArr2, 0, i44, i43 / i44);
                                                } else {
                                                    i4 = 0;
                                                    i5 = 1;
                                                    if (i41 == 1) {
                                                        i17 = 0;
                                                        i18 = 0;
                                                        i19 = 4;
                                                        while (true) {
                                                            i20 = c8576e3.f19448I - i5;
                                                            if (i17 < i20) {
                                                                c8576e3.f19449J[i17] = i4;
                                                                while (true) {
                                                                    i21 = i19 + 1;
                                                                    c8576e3.m21112a((C8527b) c8527b, i21);
                                                                    i22 = c8576e3.f19471g.f20643a[i19] & 255;
                                                                    int[] iArr3 = c8576e3.f19449J;
                                                                    i23 = iArr3[i17] + i22;
                                                                    iArr3[i17] = i23;
                                                                    if (i22 != 255) {
                                                                        break;
                                                                    }
                                                                    i19 = i21;
                                                                }
                                                                i18 += i23;
                                                                i17++;
                                                                i19 = i21;
                                                                i4 = 0;
                                                                i5 = 1;
                                                            } else {
                                                                c8576e3.f19449J[i20] = ((i40 - c8576e3.f19451L) - i19) - i18;
                                                            }
                                                        }
                                                    } else {
                                                        if (i41 == 3) {
                                                            throw new C8711r(AbstractC8673m.m21221a("Unexpected lacing value: ", i41));
                                                        }
                                                        i6 = 0;
                                                        i7 = 0;
                                                        i8 = 4;
                                                        while (true) {
                                                            i9 = c8576e3.f19448I - 1;
                                                            if (i6 < i9) {
                                                                c8576e3.f19449J[i6] = 0;
                                                                i11 = i8 + 1;
                                                                c8576e3.m21112a((C8527b) c8527b, i11);
                                                                if (c8576e3.f19471g.f20643a[i8] != 0) {
                                                                    throw new C8711r("No valid varint length mask found");
                                                                }
                                                                i12 = 0;
                                                                while (true) {
                                                                    if (i12 < i28) {
                                                                        c = c2;
                                                                        i14 = 1 << (7 - i12);
                                                                        if ((c8576e3.f19471g.f20643a[i8] & i14) != 0) {
                                                                            i15 = i11 + i12;
                                                                            c8576e3.m21112a((C8527b) c8527b, i15);
                                                                            i13 = i28;
                                                                            i16 = i12;
                                                                            j2 = (~i14) & c8576e3.f19471g.f20643a[i8] & 255;
                                                                            while (i11 < i15) {
                                                                                j2 = (j2 << i13) | ((long) (c8576e3.f19471g.f20643a[i11] & 255));
                                                                                i11++;
                                                                            }
                                                                            if (i6 > 0) {
                                                                                j2 -= (1 << ((i16 * 7) + 6)) - 1;
                                                                            }
                                                                            i8 = i15;
                                                                        } else {
                                                                            i12++;
                                                                            c2 = c;
                                                                        }
                                                                    } else {
                                                                        c = c2;
                                                                        i13 = i28;
                                                                        i8 = i11;
                                                                        j2 = j;
                                                                    }
                                                                }
                                                                if (j2 >= -2147483648L || j2 > 2147483647L) {
                                                                    throw new C8711r("EBML lacing sample size out of range.");
                                                                }
                                                                int i45 = (int) j2;
                                                                int[] iArr4 = c8576e3.f19449J;
                                                                if (i6 != 0) {
                                                                    i45 += iArr4[i6 - 1];
                                                                }
                                                                iArr4[i6] = i45;
                                                                i7 += i45;
                                                                i6++;
                                                                c2 = c;
                                                                i28 = i13;
                                                            } else {
                                                                i10 = i28;
                                                                c8576e3.f19449J[i9] = ((i40 - c8576e3.f19451L) - i8) - i7;
                                                            }
                                                        }
                                                    }
                                                    byte[] bArr2 = c8576e3.f19471g.f20643a;
                                                    c8576e3.f19445F = c8576e3.m21111a((bArr2[1] & 255) | (bArr2[0] << 8)) + c8576e3.f19440A;
                                                    b = c8576e3.f19471g.f20643a[2];
                                                    if ((b & 8) == i10) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (c8575d2.f19413c != 2 || (i39 == 163 && (b & 128) == 128)) {
                                                        i24 = 1;
                                                    } else {
                                                        i24 = 0;
                                                    }
                                                    if (z8) {
                                                        i25 = Integer.MIN_VALUE;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    c8576e3.f19452M = i24 | i25;
                                                    c8576e3.f19444E = 2;
                                                    c8576e3.f19447H = 0;
                                                    i2 = 163;
                                                }
                                            }
                                            i3 = 2;
                                            c8576e3.f19449J = iArr2;
                                            if (i41 == i3) {
                                                int i46 = (i40 - c8576e3.f19451L) - 4;
                                                int i47 = c8576e3.f19448I;
                                                Arrays.fill(iArr2, 0, i47, i46 / i47);
                                            } else {
                                                i4 = 0;
                                                i5 = 1;
                                                if (i41 == 1) {
                                                    i17 = 0;
                                                    i18 = 0;
                                                    i19 = 4;
                                                    while (true) {
                                                        i20 = c8576e3.f19448I - i5;
                                                        if (i17 < i20) {
                                                            c8576e3.f19449J[i17] = i4;
                                                            while (true) {
                                                                i21 = i19 + 1;
                                                                c8576e3.m21112a((C8527b) c8527b, i21);
                                                                i22 = c8576e3.f19471g.f20643a[i19] & 255;
                                                                int[] iArr5 = c8576e3.f19449J;
                                                                i23 = iArr5[i17] + i22;
                                                                iArr5[i17] = i23;
                                                                if (i22 != 255) {
                                                                    break;
                                                                }
                                                                i19 = i21;
                                                            }
                                                            i18 += i23;
                                                            i17++;
                                                            i19 = i21;
                                                            i4 = 0;
                                                            i5 = 1;
                                                        } else {
                                                            c8576e3.f19449J[i20] = ((i40 - c8576e3.f19451L) - i19) - i18;
                                                        }
                                                    }
                                                } else {
                                                    if (i41 == 3) {
                                                        throw new C8711r(AbstractC8673m.m21221a("Unexpected lacing value: ", i41));
                                                    }
                                                    i6 = 0;
                                                    i7 = 0;
                                                    i8 = 4;
                                                    while (true) {
                                                        i9 = c8576e3.f19448I - 1;
                                                        if (i6 < i9) {
                                                            c8576e3.f19449J[i6] = 0;
                                                            i11 = i8 + 1;
                                                            c8576e3.m21112a((C8527b) c8527b, i11);
                                                            if (c8576e3.f19471g.f20643a[i8] != 0) {
                                                                throw new C8711r("No valid varint length mask found");
                                                            }
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < i28) {
                                                                    c = c2;
                                                                    i14 = 1 << (7 - i12);
                                                                    if ((c8576e3.f19471g.f20643a[i8] & i14) != 0) {
                                                                        i15 = i11 + i12;
                                                                        c8576e3.m21112a((C8527b) c8527b, i15);
                                                                        i13 = i28;
                                                                        i16 = i12;
                                                                        j2 = (~i14) & c8576e3.f19471g.f20643a[i8] & 255;
                                                                        while (i11 < i15) {
                                                                            j2 = (j2 << i13) | ((long) (c8576e3.f19471g.f20643a[i11] & 255));
                                                                            i11++;
                                                                        }
                                                                        if (i6 > 0) {
                                                                            j2 -= (1 << ((i16 * 7) + 6)) - 1;
                                                                        }
                                                                        i8 = i15;
                                                                    } else {
                                                                        i12++;
                                                                        c2 = c;
                                                                    }
                                                                } else {
                                                                    c = c2;
                                                                    i13 = i28;
                                                                    i8 = i11;
                                                                    j2 = j;
                                                                }
                                                            }
                                                            if (j2 >= -2147483648L) {
                                                            }
                                                            throw new C8711r("EBML lacing sample size out of range.");
                                                        }
                                                        i10 = i28;
                                                        c8576e3.f19449J[i9] = ((i40 - c8576e3.f19451L) - i8) - i7;
                                                        iArr4[i6] = i45;
                                                        i7 += i45;
                                                        i6++;
                                                        c2 = c;
                                                        i28 = i13;
                                                    }
                                                }
                                                byte[] bArr3 = c8576e3.f19471g.f20643a;
                                                c8576e3.f19445F = c8576e3.m21111a((bArr3[1] & 255) | (bArr3[0] << 8)) + c8576e3.f19440A;
                                                b = c8576e3.f19471g.f20643a[2];
                                                if ((b & 8) == i10) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (c8575d2.f19413c != 2) {
                                                    i24 = 1;
                                                } else {
                                                    i24 = 1;
                                                }
                                                if (z8) {
                                                    i25 = Integer.MIN_VALUE;
                                                } else {
                                                    i25 = 0;
                                                }
                                                c8576e3.f19452M = i24 | i25;
                                                c8576e3.f19444E = 2;
                                                c8576e3.f19447H = 0;
                                                i2 = 163;
                                            }
                                        }
                                        i10 = 8;
                                        byte[] bArr4 = c8576e3.f19471g.f20643a;
                                        c8576e3.f19445F = c8576e3.m21111a((bArr4[1] & 255) | (bArr4[0] << 8)) + c8576e3.f19440A;
                                        b = c8576e3.f19471g.f20643a[2];
                                        if ((b & 8) == i10) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (c8575d2.f19413c != 2) {
                                            i24 = 1;
                                        } else {
                                            i24 = 1;
                                        }
                                        if (z8) {
                                            i25 = Integer.MIN_VALUE;
                                        } else {
                                            i25 = 0;
                                        }
                                        c8576e3.f19452M = i24 | i25;
                                        c8576e3.f19444E = 2;
                                        c8576e3.f19447H = 0;
                                        i2 = 163;
                                    } else {
                                        i2 = 163;
                                    }
                                    if (i39 == i2) {
                                        while (true) {
                                            int i48 = c8576e3.f19447H;
                                            if (i48 < c8576e3.f19448I) {
                                                c8576e3.m21113a(c8527b, c8575d2, c8576e3.f19449J[i48]);
                                                c8576e3.m21114a(c8575d2, c8576e3.f19445F + ((long) ((c8576e3.f19447H * c8575d2.f19414d) / 1000)));
                                                c8576e3.f19447H++;
                                            } else {
                                                z7 = false;
                                                c8576e3.f19444E = 0;
                                            }
                                        }
                                    } else {
                                        z7 = false;
                                        c8576e3.m21113a(c8527b, c8575d2, c8576e3.f19449J[0]);
                                    }
                                }
                                c8573b.f19391e = z7 ? 1 : 0;
                                z5 = z7;
                            } else if (i39 == 16981) {
                                z6 = false;
                                byte[] bArr5 = new byte[i40];
                                c8576e3.f19484t.f19416f = bArr5;
                                c8527b.m21027b(bArr5, 0, i40, false);
                            } else if (i39 == 18402) {
                                z6 = false;
                                byte[] bArr6 = new byte[i40];
                                c8576e3.f19484t.f19417g = bArr6;
                                c8527b.m21027b(bArr6, 0, i40, false);
                            } else if (i39 == 21419) {
                                z6 = false;
                                Arrays.fill(c8576e3.f19473i.f20643a, (byte) 0);
                                c8527b.m21027b(c8576e3.f19473i.f20643a, 4 - i40, i40, false);
                                c8576e3.f19473i.m21347e(0);
                                c8576e3.f19486v = (int) c8576e3.f19473i.m21353k();
                            } else if (i39 == 25506) {
                                z6 = false;
                                byte[] bArr7 = new byte[i40];
                                c8576e3.f19484t.f19418h = bArr7;
                                c8527b.m21027b(bArr7, 0, i40, false);
                            } else {
                                if (i39 != 30322) {
                                    c8576e3.getClass();
                                    throw new C8711r(AbstractC8673m.m21221a("Unexpected id: ", i39));
                                }
                                byte[] bArr8 = new byte[i40];
                                c8576e3.f19484t.f19425o = bArr8;
                                z6 = false;
                                c8527b.m21027b(bArr8, 0, i40, false);
                            }
                            z7 = z6;
                            c8573b.f19391e = z7 ? 1 : 0;
                            z5 = z7;
                        } else {
                            if (i != 5) {
                                throw new C8711r(AbstractC8673m.m21221a("Invalid element type ", i));
                            }
                            long j8 = c8573b.f19393g;
                            if (j8 != 4 && j8 != 8) {
                                throw new C8711r("Invalid float size: " + c8573b.f19393g);
                            }
                            C8574c c8574c5 = c8573b.f19390d;
                            int i49 = c8573b.f19392f;
                            int i50 = (int) j8;
                            c8527b.m21027b(c8573b.f19387a, 0, i50, false);
                            long j9 = j;
                            int i51 = 0;
                            while (i51 < i50) {
                                j9 = (j9 << 8) | ((long) (c8573b.f19387a[i51] & b3));
                                i51++;
                                b3 = 255;
                            }
                            double dIntBitsToFloat = i50 == 4 ? Float.intBitsToFloat((int) j9) : Double.longBitsToDouble(j9);
                            C8576e c8576e4 = c8574c5.f19394a;
                            if (i49 == 181) {
                                c8576e4.f19484t.f19403I = (int) dIntBitsToFloat;
                            } else if (i49 != 17545) {
                                switch (i49) {
                                    case 21969:
                                        c8576e4.f19484t.f19433w = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        c8576e4.f19484t.f19434x = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        c8576e4.f19484t.f19435y = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        c8576e4.f19484t.f19436z = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        c8576e4.f19484t.f19395A = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        c8576e4.f19484t.f19396B = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        c8576e4.f19484t.f19397C = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        c8576e4.f19484t.f19398D = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        c8576e4.f19484t.f19399E = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        c8576e4.f19484t.f19400F = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        c8576e4.getClass();
                                        break;
                                }
                            } else {
                                c8576e4.f19482r = (long) dIntBitsToFloat;
                            }
                            z5 = false;
                            c8573b.f19391e = 0;
                        }
                    } else {
                        long j10 = c8527b.f19124c;
                        c8573b.f19388b.add(new C8572a(c8573b.f19392f, c8573b.f19393g + j10));
                        C8574c c8574c6 = c8573b.f19390d;
                        int i52 = c8573b.f19392f;
                        long j11 = c8573b.f19393g;
                        C8576e c8576e5 = c8574c6.f19394a;
                        c8576e5.getClass();
                        if (i52 == 160) {
                            z3 = false;
                            c8576e5.f19463X = false;
                        } else if (i52 == 174) {
                            z3 = false;
                            c8576e5.f19484t = new C8575d();
                        } else if (i52 != 187) {
                            if (i52 == 19899) {
                                c8576e5.f19486v = -1;
                                c8576e5.f19487w = -1L;
                            } else if (i52 == 20533) {
                                c8576e5.f19484t.f19415e = true;
                            } else if (i52 == 21968) {
                                c8576e5.f19484t.f19427q = true;
                            } else if (i52 == 408125543) {
                                long j12 = c8576e5.f19480p;
                                if (j12 != -1 && j12 != j10) {
                                    throw new C8711r("Multiple Segment elements not supported");
                                }
                                c8576e5.f19480p = j10;
                                c8576e5.f19479o = j11;
                            } else if (i52 == 475249515) {
                                c8576e5.f19441B = new C8808g();
                                c8576e5.f19442C = new C8808g();
                            } else if (i52 == 524531317 && !c8576e5.f19485u) {
                                if (!c8576e5.f19468d || c8576e5.f19489y == -1) {
                                    c8576e5.f19464Y.mo21093a(new C8627p(c8576e5.f19483s));
                                    c8576e5.f19485u = true;
                                } else {
                                    c8576e5.f19488x = true;
                                }
                            }
                            z3 = false;
                        } else {
                            z3 = false;
                            c8576e5.f19443D = false;
                        }
                        c8573b.f19391e = z3 ? 1 : 0;
                        z5 = z3;
                    }
                } else {
                    C8574c c8574c7 = c8573b.f19390d;
                    int i53 = ((C8572a) c8573b.f19388b.pop()).f19385a;
                    C8576e c8576e6 = c8574c7.f19394a;
                    if (i53 != 160) {
                        if (i53 == 174) {
                            z11 = z ? 1 : 0;
                            String str2 = c8576e6.f19484t.f19411a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                C8575d c8575d3 = c8576e6.f19484t;
                                c8575d3.m21110a(c8576e6.f19464Y, c8575d3.f19412b);
                                SparseArray sparseArray = c8576e6.f19467c;
                                C8575d c8575d4 = c8576e6.f19484t;
                                sparseArray.put(c8575d4.f19412b, c8575d4);
                            }
                            c8576e6.f19484t = null;
                        } else {
                            if (i53 == 19899) {
                                boolean z19 = z ? 1 : 0;
                                int i54 = c8576e6.f19486v;
                                if (i54 != -1) {
                                    long j13 = c8576e6.f19487w;
                                    if (j13 == -1) {
                                        z11 = z19;
                                    } else if (i54 == 475249515) {
                                        c8576e6.f19489y = j13;
                                        z11 = z19;
                                    }
                                }
                                throw new C8711r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i53 == 25152) {
                                z13 = z ? 1 : 0;
                                C8575d c8575d5 = c8576e6.f19484t;
                                if (c8575d5.f19415e) {
                                    byte[] bArr9 = c8575d5.f19417g;
                                    if (bArr9 == null) {
                                        z11 = z13;
                                        throw new C8711r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    z11 = z13;
                                    C8523c[] c8523cArr = new C8523c[1];
                                    c8523cArr[z13 ? 1 : 0] = new C8523c(AbstractC8515b.f19087b, "video/webm", bArr9);
                                    c8575d5.f19419i = new C8524d(true, c8523cArr);
                                    z11 = z13;
                                }
                            } else if (i53 == 28032) {
                                z14 = z ? 1 : 0;
                                C8575d c8575d6 = c8576e6.f19484t;
                                if (c8575d6.f19415e && c8575d6.f19416f != null) {
                                    z11 = z14;
                                    z11 = z14;
                                    throw new C8711r("Combining encryption and compression is not supported");
                                }
                            } else if (i53 == 357149030) {
                                boolean z20 = z ? 1 : 0;
                                if (c8576e6.f19481q == -9223372036854775807L) {
                                    c8576e6.f19481q = 1000000L;
                                }
                                long j14 = c8576e6.f19482r;
                                z11 = z20;
                                if (j14 != -9223372036854775807L) {
                                    c8576e6.f19483s = c8576e6.m21111a(j14);
                                    z11 = z20;
                                }
                            } else if (i53 == 374648427) {
                                z11 = z ? 1 : 0;
                                if (c8576e6.f19467c.size() == 0) {
                                    throw new C8711r("No valid tracks were found");
                                }
                                c8576e6.f19464Y.mo21096b();
                            } else if (i53 != 475249515) {
                                c8576e6.getClass();
                                z12 = z;
                            } else if (!c8576e6.f19485u) {
                                InterfaceC8568j interfaceC8568j = c8576e6.f19464Y;
                                if (c8576e6.f19480p == -1 || c8576e6.f19483s == -9223372036854775807L || (c8808g = c8576e6.f19441B) == null || (i27 = c8808g.f20621a) == 0 || (c8808g2 = c8576e6.f19442C) == null || c8808g2.f20621a != i27) {
                                    z12 = z;
                                    z12 = z;
                                    z12 = z;
                                    z12 = z;
                                    z12 = z;
                                    z12 = z;
                                    z15 = z ? 1 : 0;
                                    c8576e6.f19441B = null;
                                    c8576e6.f19442C = null;
                                    c8627p = new C8627p(c8576e6.f19483s);
                                } else {
                                    int[] iArr6 = new int[i27];
                                    long[] jArr2 = new long[i27];
                                    long[] jArr3 = new long[i27];
                                    long[] jArr4 = new long[i27];
                                    int i55 = z ? 1 : 0;
                                    while (i55 < i27) {
                                        C8808g c8808g3 = c8576e6.f19441B;
                                        if (i55 < 0) {
                                            z12 = z;
                                            z16 = z;
                                            c8808g3.getClass();
                                        } else {
                                            if (i55 < c8808g3.f20621a) {
                                                jArr4[i55] = c8808g3.f20622b[i55];
                                                long j15 = c8576e6.f19480p;
                                                boolean z21 = z16 ? 1 : 0;
                                                C8808g c8808g4 = c8576e6.f19442C;
                                                if (i55 < 0) {
                                                    z12 = z;
                                                    z16 = z;
                                                    c8808g4.getClass();
                                                } else if (i55 < c8808g4.f20621a) {
                                                    z12 = z;
                                                    z16 = z;
                                                    jArr2[i55] = c8808g4.f20622b[i55] + j15;
                                                    i55++;
                                                    z16 = z21 ? 1 : 0;
                                                } else {
                                                    z12 = z;
                                                    z16 = z;
                                                }
                                                StringBuilder sbM21088a = AbstractC8551l.m21088a("Invalid index ", i55, ", size is ");
                                                sbM21088a.append(c8808g4.f20621a);
                                                throw new IndexOutOfBoundsException(sbM21088a.toString());
                                            }
                                            z12 = z;
                                            z16 = z;
                                        }
                                        StringBuilder sbM21088a2 = AbstractC8551l.m21088a("Invalid index ", i55, ", size is ");
                                        sbM21088a2.append(c8808g3.f20621a);
                                        throw new IndexOutOfBoundsException(sbM21088a2.toString());
                                    }
                                    z12 = z;
                                    z16 = z;
                                    z15 = z16 ? 1 : 0;
                                    ?? r4 = z16;
                                    while (true) {
                                        int i56 = i27 - 1;
                                        if (r4 < i56) {
                                            int i57 = r4 + 1;
                                            iArr6[r4] = (int) (jArr2[i57] - jArr2[r4]);
                                            jArr3[r4] = jArr4[i57] - jArr4[r4];
                                            r4 = i57;
                                        } else {
                                            iArr6[i56] = (int) ((c8576e6.f19480p + c8576e6.f19479o) - jArr2[i56]);
                                            jArr3[i56] = c8576e6.f19483s - jArr4[i56];
                                            c8576e6.f19441B = null;
                                            c8576e6.f19442C = null;
                                            c8627p = new C8526a(iArr6, jArr2, jArr3, jArr4);
                                        }
                                    }
                                }
                                interfaceC8568j.mo21093a(c8627p);
                                c8576e6.f19485u = true;
                                z11 = z15;
                            }
                        }
                        z11 = z10;
                        z11 = z13;
                        z11 = z14;
                        z11 = z14;
                        z11 = z14;
                        z12 = z11;
                    } else {
                        z10 = z ? 1 : 0;
                        if (c8576e6.f19444E != 2) {
                            z11 = z10;
                            z11 = z13;
                            z11 = z14;
                            z11 = z14;
                            z11 = z14;
                            z12 = z11;
                        } else {
                            if (!c8576e6.f19463X) {
                                z11 = z10;
                                c8576e6.f19452M |= 1;
                            }
                            z11 = z10;
                            c8576e6.m21114a((C8575d) c8576e6.f19467c.get(c8576e6.f19450K), c8576e6.f19445F);
                            boolean z22 = z10 ? 1 : 0;
                            c8576e6.f19444E = z22 ? 1 : 0;
                            z12 = z22;
                        }
                    }
                    z12 = z;
                    z5 = z12;
                }
                z18 = true;
                z9 = z5;
            }
            if (z18) {
                long j16 = c8527b.f19124c;
                if (this.f19488x) {
                    this.f19490z = j16;
                    c8607o.f19793a = this.f19489y;
                    this.f19488x = z9;
                    return 1;
                }
                if (this.f19485u) {
                    long j17 = this.f19490z;
                    if (j17 != -1) {
                        c8607o.f19793a = j17;
                        this.f19490z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z17 = false;
        }
        boolean z23 = z17 ? 1 : 0;
        if (z18) {
            return z23 ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final long m21111a(long j) throws C8711r {
        long j2 = this.f19481q;
        if (j2 != -9223372036854775807L) {
            return AbstractC8827z.m21382a(j, j2, 1000L);
        }
        throw new C8711r("Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f19440A = -9223372036854775807L;
        this.f19444E = 0;
        C8573b c8573b = this.f19465a;
        c8573b.f19391e = 0;
        c8573b.f19388b.clear();
        C8578g c8578g = c8573b.f19389c;
        c8578g.f19495b = 0;
        c8578g.f19496c = 0;
        C8578g c8578g2 = this.f19466b;
        c8578g2.f19495b = 0;
        c8578g2.f19496c = 0;
        this.f19453N = 0;
        this.f19461V = 0;
        this.f19460U = 0;
        this.f19454O = false;
        this.f19455P = false;
        this.f19457R = false;
        this.f19459T = 0;
        this.f19458S = (byte) 0;
        this.f19456Q = false;
        C8815n c8815n = this.f19474j;
        c8815n.f20644b = 0;
        c8815n.f20645c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m21112a(C8527b c8527b, int i) throws InterruptedException, EOFException {
        C8815n c8815n = this.f19471g;
        if (c8815n.f20645c >= i) {
            return;
        }
        if (c8815n.m21337a() < i) {
            C8815n c8815n2 = this.f19471g;
            byte[] bArr = c8815n2.f20643a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i));
            int i2 = this.f19471g.f20645c;
            c8815n2.f20643a = bArrCopyOf;
            c8815n2.f20645c = i2;
            c8815n2.f20644b = 0;
        }
        C8815n c8815n3 = this.f19471g;
        byte[] bArr2 = c8815n3.f20643a;
        int i3 = c8815n3.f20645c;
        c8527b.m21027b(bArr2, i3, i - i3, false);
        this.f19471g.m21345d(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m21113a(C8527b c8527b, C8575d c8575d, int i) throws InterruptedException, C8711r, EOFException {
        int iMo21046a;
        int iMo21046a2;
        int i2;
        if ("S_TEXT/UTF8".equals(c8575d.f19411a)) {
            byte[] bArr = f19437Z;
            int i3 = i + 32;
            if (this.f19475k.m21337a() < i3) {
                this.f19475k.f20643a = Arrays.copyOf(bArr, i3 + i);
            }
            c8527b.m21027b(this.f19475k.f20643a, 32, i, false);
            this.f19475k.m21347e(0);
            this.f19475k.m21345d(i3);
            return;
        }
        InterfaceC8629r interfaceC8629r = c8575d.f19409O;
        if (!this.f19454O) {
            if (c8575d.f19415e) {
                this.f19452M &= -1073741825;
                if (!this.f19455P) {
                    c8527b.m21027b(this.f19471g.f20643a, 0, 1, false);
                    this.f19453N++;
                    byte b = this.f19471g.f20643a[0];
                    if ((b & 128) == 128) {
                        throw new C8711r("Extension bit is set in signal byte");
                    }
                    this.f19458S = b;
                    this.f19455P = true;
                }
                byte b2 = this.f19458S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.f19452M |= 1073741824;
                    if (!this.f19456Q) {
                        c8527b.m21027b(this.f19476l.f20643a, 0, 8, false);
                        this.f19453N += 8;
                        this.f19456Q = true;
                        C8815n c8815n = this.f19471g;
                        c8815n.f20643a[0] = (byte) ((z ? 128 : 0) | 8);
                        c8815n.m21347e(0);
                        interfaceC8629r.mo21049a(1, this.f19471g);
                        this.f19461V++;
                        this.f19476l.m21347e(0);
                        interfaceC8629r.mo21049a(8, this.f19476l);
                        this.f19461V += 8;
                    }
                    if (z) {
                        if (!this.f19457R) {
                            c8527b.m21027b(this.f19471g.f20643a, 0, 1, false);
                            this.f19453N++;
                            this.f19471g.m21347e(0);
                            this.f19459T = this.f19471g.m21352j();
                            this.f19457R = true;
                        }
                        int i4 = this.f19459T * 4;
                        this.f19471g.m21343c(i4);
                        c8527b.m21027b(this.f19471g.f20643a, 0, i4, false);
                        this.f19453N += i4;
                        short s = (short) ((this.f19459T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f19478n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f19478n = ByteBuffer.allocate(i5);
                        }
                        this.f19478n.position(0);
                        this.f19478n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f19459T;
                            if (i6 >= i2) {
                                break;
                            }
                            int iM21355m = this.f19471g.m21355m();
                            if (i6 % 2 == 0) {
                                this.f19478n.putShort((short) (iM21355m - i7));
                            } else {
                                this.f19478n.putInt(iM21355m - i7);
                            }
                            i6++;
                            i7 = iM21355m;
                        }
                        int i8 = (i - this.f19453N) - i7;
                        if (i2 % 2 == 1) {
                            this.f19478n.putInt(i8);
                        } else {
                            this.f19478n.putShort((short) i8);
                            this.f19478n.putInt(0);
                        }
                        C8815n c8815n2 = this.f19477m;
                        c8815n2.f20643a = this.f19478n.array();
                        c8815n2.f20645c = i5;
                        c8815n2.f20644b = 0;
                        interfaceC8629r.mo21049a(i5, this.f19477m);
                        this.f19461V += i5;
                    }
                }
            } else {
                byte[] bArr2 = c8575d.f19416f;
                if (bArr2 != null) {
                    C8815n c8815n3 = this.f19474j;
                    int length = bArr2.length;
                    c8815n3.f20643a = bArr2;
                    c8815n3.f20645c = length;
                    c8815n3.f20644b = 0;
                }
            }
            this.f19454O = true;
        }
        int i9 = i + this.f19474j.f20645c;
        if (!"V_MPEG4/ISO/AVC".equals(c8575d.f19411a) && !"V_MPEGH/ISO/HEVC".equals(c8575d.f19411a)) {
            while (true) {
                int i10 = this.f19453N;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i9 - i10;
                C8815n c8815n4 = this.f19474j;
                int i12 = c8815n4.f20645c - c8815n4.f20644b;
                if (i12 > 0) {
                    iMo21046a2 = Math.min(i11, i12);
                    interfaceC8629r.mo21049a(iMo21046a2, this.f19474j);
                } else {
                    iMo21046a2 = interfaceC8629r.mo21046a(c8527b, i11, false);
                }
                this.f19453N += iMo21046a2;
                this.f19461V += iMo21046a2;
            }
        } else {
            byte[] bArr3 = this.f19470f.f20643a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = c8575d.f19410P;
            int i14 = 4 - i13;
            while (this.f19453N < i9) {
                int i15 = this.f19460U;
                if (i15 == 0) {
                    C8815n c8815n5 = this.f19474j;
                    int iMin = Math.min(i13, c8815n5.f20645c - c8815n5.f20644b);
                    c8527b.m21027b(bArr3, i14 + iMin, i13 - iMin, false);
                    if (iMin > 0) {
                        this.f19474j.m21339a(bArr3, i14, iMin);
                    }
                    this.f19453N += i13;
                    this.f19470f.m21347e(0);
                    this.f19460U = this.f19470f.m21355m();
                    this.f19469e.m21347e(0);
                    interfaceC8629r.mo21049a(4, this.f19469e);
                    this.f19461V += 4;
                } else {
                    C8815n c8815n6 = this.f19474j;
                    int i16 = c8815n6.f20645c - c8815n6.f20644b;
                    if (i16 > 0) {
                        iMo21046a = Math.min(i15, i16);
                        interfaceC8629r.mo21049a(iMo21046a, this.f19474j);
                    } else {
                        iMo21046a = interfaceC8629r.mo21046a(c8527b, i15, false);
                    }
                    this.f19453N += iMo21046a;
                    this.f19461V += iMo21046a;
                    this.f19460U = i15 - iMo21046a;
                }
            }
        }
        if ("A_VORBIS".equals(c8575d.f19411a)) {
            this.f19472h.m21347e(0);
            interfaceC8629r.mo21049a(4, this.f19472h);
            this.f19461V += 4;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19464Y = interfaceC8568j;
    }

    /* JADX INFO: renamed from: a */
    public final void m21114a(C8575d c8575d, long j) {
        byte[] bArrM21387b;
        if ("S_TEXT/UTF8".equals(c8575d.f19411a)) {
            byte[] bArr = this.f19475k.f20643a;
            long j2 = this.f19446G;
            if (j2 == -9223372036854775807L) {
                bArrM21387b = f19438a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArrM21387b = AbstractC8827z.m21387b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))));
            }
            System.arraycopy(bArrM21387b, 0, bArr, 19, 12);
            InterfaceC8629r interfaceC8629r = c8575d.f19409O;
            C8815n c8815n = this.f19475k;
            interfaceC8629r.mo21049a(c8815n.f20645c, c8815n);
            this.f19461V += this.f19475k.f20645c;
        }
        c8575d.f19409O.mo21051a(j, this.f19452M, this.f19461V, 0, c8575d.f19417g);
        this.f19462W = true;
        this.f19453N = 0;
        this.f19461V = 0;
        this.f19460U = 0;
        this.f19454O = false;
        this.f19455P = false;
        this.f19457R = false;
        this.f19459T = 0;
        this.f19458S = (byte) 0;
        this.f19456Q = false;
        C8815n c8815n2 = this.f19474j;
        c8815n2.f20644b = 0;
        c8815n2.f20645c = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        C8577f c8577f = new C8577f();
        long j = c8527b.f19123b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        c8527b.m21025a(c8577f.f19491a.f20643a, 0, 4, false);
        c8577f.f19492b = 4;
        for (long jM21353k = c8577f.f19491a.m21353k(); jM21353k != 440786851; jM21353k = ((jM21353k << 8) & (-256)) | ((long) (c8577f.f19491a.f20643a[0] & 255))) {
            int i2 = c8577f.f19492b + 1;
            c8577f.f19492b = i2;
            if (i2 == i) {
                return false;
            }
            c8527b.m21025a(c8577f.f19491a.f20643a, 0, 1, false);
        }
        long jM21115a = c8577f.m21115a(c8527b);
        long j3 = c8577f.f19492b;
        if (jM21115a != Long.MIN_VALUE && (j == -1 || j3 + jM21115a < j)) {
            while (true) {
                long j4 = c8577f.f19492b;
                long j5 = j3 + jM21115a;
                if (j4 < j5) {
                    if (c8577f.m21115a(c8527b) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM21115a2 = c8577f.m21115a(c8527b);
                    if (jM21115a2 < 0 || jM21115a2 > 2147483647L) {
                        break;
                    }
                    if (jM21115a2 != 0) {
                        c8527b.m21024a((int) jM21115a2, false);
                        c8577f.f19492b = (int) (((long) c8577f.f19492b) + jM21115a2);
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }
}
