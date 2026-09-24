package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8546g;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8739x;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8733r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8735t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8736u;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8755i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8750d;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8756j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8787l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8824w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8822u;
import com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.l */
/* JADX INFO: loaded from: classes9.dex */
public final class C8672l implements Handler.Callback, InterfaceC8733r, InterfaceC8735t {

    /* JADX INFO: renamed from: A */
    public C8668h f20174A;

    /* JADX INFO: renamed from: B */
    public C8668h f20175B;

    /* JADX INFO: renamed from: C */
    public AbstractC8845x f20176C;

    /* JADX INFO: renamed from: a */
    public final AbstractC8490a[] f20177a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8490a[] f20178b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8755i f20179c;

    /* JADX INFO: renamed from: d */
    public final C8516c f20180d;

    /* JADX INFO: renamed from: e */
    public final C8822u f20181e;

    /* JADX INFO: renamed from: f */
    public final Handler f20182f;

    /* JADX INFO: renamed from: g */
    public final HandlerThread f20183g;

    /* JADX INFO: renamed from: h */
    public final Handler f20184h;

    /* JADX INFO: renamed from: i */
    public final C8844w f20185i;

    /* JADX INFO: renamed from: j */
    public final C8828v f20186j;

    /* JADX INFO: renamed from: k */
    public C8669i f20187k;

    /* JADX INFO: renamed from: l */
    public C8712s f20188l;

    /* JADX INFO: renamed from: m */
    public AbstractC8490a f20189m;

    /* JADX INFO: renamed from: n */
    public InterfaceC8809h f20190n;

    /* JADX INFO: renamed from: o */
    public InterfaceC8736u f20191o;

    /* JADX INFO: renamed from: p */
    public AbstractC8490a[] f20192p;

    /* JADX INFO: renamed from: q */
    public boolean f20193q;

    /* JADX INFO: renamed from: r */
    public boolean f20194r;

    /* JADX INFO: renamed from: s */
    public boolean f20195s;

    /* JADX INFO: renamed from: t */
    public boolean f20196t;

    /* JADX INFO: renamed from: u */
    public int f20197u = 1;

    /* JADX INFO: renamed from: v */
    public long f20198v;

    /* JADX INFO: renamed from: w */
    public int f20199w;

    /* JADX INFO: renamed from: x */
    public C8670j f20200x;

    /* JADX INFO: renamed from: y */
    public long f20201y;

    /* JADX INFO: renamed from: z */
    public C8668h f20202z;

    public C8672l(AbstractC8490a[] abstractC8490aArr, C8750d c8750d, C8516c c8516c, boolean z, HandlerC8666f handlerC8666f, C8669i c8669i, C8667g c8667g) {
        this.f20177a = abstractC8490aArr;
        this.f20179c = c8750d;
        this.f20180d = c8516c;
        this.f20194r = z;
        this.f20184h = handlerC8666f;
        this.f20187k = c8669i;
        this.f20178b = new AbstractC8490a[abstractC8490aArr.length];
        for (int i = 0; i < abstractC8490aArr.length; i++) {
            AbstractC8490a abstractC8490a = abstractC8490aArr[i];
            abstractC8490a.getClass();
            this.f20178b[i] = abstractC8490a;
        }
        this.f20181e = new C8822u();
        this.f20192p = new AbstractC8490a[0];
        this.f20185i = new C8844w();
        this.f20186j = new C8828v();
        this.f20188l = C8712s.f20317d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f20183g = handlerThread;
        handlerThread.start();
        this.f20182f = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public static void m21194a(AbstractC8490a abstractC8490a) {
        int i = abstractC8490a.f18925c;
        if (i == 2) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            abstractC8490a.f18925c = 1;
            abstractC8490a.mo20963j();
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m21195a(int i, long j) throws C8517d {
        C8668h c8668h;
        m21219g();
        this.f20195s = false;
        m21199a(2);
        C8668h c8668h2 = this.f20175B;
        if (c8668h2 == null) {
            C8668h c8668h3 = this.f20202z;
            if (c8668h3 != null) {
                c8668h3.m21193a();
            }
            c8668h = null;
        } else {
            c8668h = null;
            while (c8668h2 != null) {
                if (c8668h2.f20150f == i && c8668h2.f20153i) {
                    c8668h = c8668h2;
                } else {
                    c8668h2.m21193a();
                }
                c8668h2 = c8668h2.f20155k;
            }
        }
        C8668h c8668h4 = this.f20175B;
        if (c8668h4 != c8668h || c8668h4 != this.f20174A) {
            for (AbstractC8490a abstractC8490a : this.f20192p) {
                abstractC8490a.m20956c();
            }
            this.f20192p = new AbstractC8490a[0];
            this.f20190n = null;
            this.f20189m = null;
            this.f20175B = null;
        }
        if (c8668h != null) {
            c8668h.f20155k = null;
            this.f20202z = c8668h;
            this.f20174A = c8668h;
            m21203a(c8668h);
            C8668h c8668h5 = this.f20175B;
            if (c8668h5.f20154j) {
                j = c8668h5.f20145a.mo21071a(j);
            }
            m21200a(j);
            m21211b();
        } else {
            this.f20202z = null;
            this.f20174A = null;
            this.f20175B = null;
            m21200a(j);
        }
        this.f20182f.sendEmptyMessage(2);
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m21196a(C8670j c8670j) {
        AbstractC8845x abstractC8845x = c8670j.f20167a;
        if (abstractC8845x.m21395c()) {
            abstractC8845x = this.f20176C;
        }
        AbstractC8845x abstractC8845x2 = abstractC8845x;
        try {
            Pair pairM21197a = m21197a(abstractC8845x2, c8670j.f20168b, c8670j.f20169c, 0L);
            AbstractC8845x abstractC8845x3 = this.f20176C;
            if (abstractC8845x3 == abstractC8845x2) {
                return pairM21197a;
            }
            int iMo21275a = abstractC8845x3.mo21275a(abstractC8845x2.mo21276a(((Integer) pairM21197a.first).intValue(), this.f20186j, true).f20680b);
            if (iMo21275a != -1) {
                return Pair.create(Integer.valueOf(iMo21275a), (Long) pairM21197a.second);
            }
            int iIntValue = ((Integer) pairM21197a.first).intValue();
            AbstractC8845x abstractC8845x4 = this.f20176C;
            int iMo21275a2 = -1;
            while (iMo21275a2 == -1 && iIntValue < abstractC8845x2.mo21274a() - 1) {
                iIntValue++;
                iMo21275a2 = abstractC8845x4.mo21275a(abstractC8845x2.mo21276a(iIntValue, this.f20186j, true).f20680b);
            }
            if (iMo21275a2 == -1) {
                return null;
            }
            int i = this.f20176C.mo21276a(iMo21275a2, this.f20186j, false).f20681c;
            return m21197a(this.f20176C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C8710q();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair m21197a(AbstractC8845x abstractC8845x, int i, long j, long j2) {
        int iMo21278b = abstractC8845x.mo21278b();
        if (i < 0 || i >= iMo21278b) {
            throw new IndexOutOfBoundsException();
        }
        abstractC8845x.mo21277a(i, this.f20185i, j2);
        if (j == -9223372036854775807L) {
            j = this.f20185i.f20768e;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        C8844w c8844w = this.f20185i;
        int i2 = c8844w.f20766c;
        long j3 = c8844w.f20770g + j;
        long j4 = abstractC8845x.mo21276a(i2, this.f20186j, false).f20682d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f20185i.f20767d) {
            j3 -= j4;
            i2++;
            j4 = abstractC8845x.mo21276a(i2, this.f20186j, false).f20682d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0219  */
    /* JADX WARN: Code duplicated, block: B:108:0x021b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0222  */
    /* JADX WARN: Code duplicated, block: B:114:0x022c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:212:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ef A[LOOP:2: B:215:0x03e7->B:218:0x03ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x0435  */
    /* JADX WARN: Code duplicated, block: B:244:0x043a A[LOOP:1: B:243:0x0438->B:244:0x043a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x0448  */
    /* JADX WARN: Code duplicated, block: B:249:0x044c  */
    /* JADX WARN: Code duplicated, block: B:254:0x045c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0462  */
    /* JADX WARN: Code duplicated, block: B:263:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x001c A[EDGE_INSN: B:266:0x001c->B:5:0x001c BREAK  A[LOOP:4: B:81:0x01c7->B:90:0x01e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x001c A[EDGE_INSN: B:276:0x001c->B:5:0x001c BREAK  A[LOOP:5: B:92:0x01e4->B:100:0x01fc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:52:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[LOOP:3: B:73:0x018b->B:77:0x019b, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:242:0x0435, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m21198a() throws C8517d {
        C8668h c8668h;
        int i;
        boolean z;
        C8668h c8668h2;
        C8668h c8668h3;
        C8668h c8668h4;
        int i2;
        AbstractC8490a[] abstractC8490aArr;
        C8668h c8668h5;
        C8668h c8668h6;
        C8756j c8756j;
        C8756j c8756j2;
        Object[] objArr;
        int i3;
        AbstractC8490a[] abstractC8490aArr2;
        AbstractC8490a abstractC8490a;
        AbstractC8748b abstractC8748b;
        long j;
        long j2;
        AbstractC8490a abstractC8490a2;
        InterfaceC8737v interfaceC8737v;
        int i4;
        AbstractC8490a[] abstractC8490aArr3;
        InterfaceC8737v interfaceC8737v2;
        long j3;
        C8668h c8668h7;
        long j4;
        boolean z2;
        C8668h c8668h8;
        C8668h c8668h9;
        C8668h c8668h10;
        int i5;
        C8668h c8668h11;
        C8822u c8822u;
        int i6;
        int i7;
        C8516c c8516c;
        long j5;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = Long.MIN_VALUE;
        long j7 = 0;
        long j8 = -9223372036854775807L;
        if (this.f20176C == null) {
            this.f20191o.mo21081a();
            j6 = Long.MIN_VALUE;
        } else {
            C8668h c8668h12 = this.f20202z;
            if (c8668h12 != null) {
                int i8 = c8668h12.f20150f;
                if (c8668h12.f20152h || !c8668h12.f20153i || ((c8668h12.f20154j && c8668h12.f20145a.mo21076c() != Long.MIN_VALUE) || this.f20176C.mo21276a(i8, this.f20186j, false).f20682d == -9223372036854775807L || ((c8668h = this.f20175B) != null && i8 - c8668h.f20150f == 100))) {
                    j6 = Long.MIN_VALUE;
                    z = true;
                } else {
                    i = this.f20202z.f20150f + 1;
                }
                c8668h2 = this.f20202z;
                if (c8668h2 != null || (c8668h2.f20153i && (!c8668h2.f20154j || c8668h2.f20145a.mo21076c() == j6))) {
                    m21213b(false);
                } else {
                    C8668h c8668h13 = this.f20202z;
                    if (c8668h13 != null && c8668h13.f20156l) {
                        m21211b();
                    }
                }
                if (this.f20175B != null) {
                    while (true) {
                        c8668h3 = this.f20175B;
                        c8668h4 = this.f20174A;
                        if (c8668h3 == c8668h4 || this.f20201y < c8668h3.f20155k.f20149e) {
                            break;
                        }
                        c8668h3.m21193a();
                        m21203a(this.f20175B.f20155k);
                        C8668h c8668h14 = this.f20175B;
                        this.f20187k = new C8669i(c8668h14.f20150f, c8668h14.f20151g);
                        m21220h();
                        this.f20184h.obtainMessage(5, this.f20187k).sendToTarget();
                    }
                    if (!c8668h4.f20152h) {
                        i2 = 0;
                        while (true) {
                            abstractC8490aArr = this.f20177a;
                            if (i2 >= abstractC8490aArr.length) {
                                c8668h5 = this.f20174A;
                                c8668h6 = c8668h5.f20155k;
                                if (c8668h6 != null || !c8668h6.f20153i) {
                                    break;
                                    break;
                                }
                                c8756j = c8668h5.f20157m;
                                this.f20174A = c8668h6;
                                c8756j2 = c8668h6.f20157m;
                                if (c8668h6.f20145a.mo21079g() != -9223372036854775807L) {
                                    objArr = z ? 1 : 0;
                                } else {
                                    objArr = null;
                                }
                                i3 = 0;
                                while (true) {
                                    abstractC8490aArr2 = this.f20177a;
                                    if (i3 < abstractC8490aArr2.length) {
                                        break;
                                    }
                                    abstractC8490a = abstractC8490aArr2[i3];
                                    if (c8756j.f20447b.f20444b[i3] != null) {
                                        if (objArr != null) {
                                            abstractC8490a.f18929g = z;
                                        } else if (!abstractC8490a.f18929g) {
                                            abstractC8748b = c8756j2.f20447b.f20444b[i3];
                                            C8742t c8742t = c8756j.f20449d[i3];
                                            j = j7;
                                            C8742t c8742t2 = c8756j2.f20449d[i3];
                                            if (abstractC8748b == null && c8742t2.equals(c8742t)) {
                                                int length = abstractC8748b.f20436c.length;
                                                C8708o[] c8708oArr = new C8708o[length];
                                                int i9 = 0;
                                                while (i9 < length) {
                                                    c8708oArr[i9] = abstractC8748b.f20437d[i9];
                                                    i9++;
                                                    j8 = j8;
                                                }
                                                j2 = j8;
                                                C8668h c8668h15 = this.f20174A;
                                                InterfaceC8737v interfaceC8737v3 = c8668h15.f20147c[i3];
                                                long j9 = c8668h15.f20149e - c8668h15.f20151g;
                                                if (abstractC8490a.f18929g) {
                                                    throw new IllegalStateException();
                                                }
                                                abstractC8490a.f18926d = interfaceC8737v3;
                                                abstractC8490a.f18928f = false;
                                                abstractC8490a.f18927e = j9;
                                                abstractC8490a.mo20955a(c8708oArr);
                                            } else {
                                                j2 = j8;
                                                abstractC8490a.f18929g = z;
                                            }
                                        }
                                        j = j7;
                                        j2 = j8;
                                    } else {
                                        j = j7;
                                        j2 = j8;
                                    }
                                    i3++;
                                    j7 = j;
                                    j8 = j2;
                                    z = true;
                                }
                            } else {
                                abstractC8490a2 = abstractC8490aArr[i2];
                                interfaceC8737v = this.f20174A.f20147c[i2];
                                if (abstractC8490a2.f18926d != interfaceC8737v || (interfaceC8737v != null && !abstractC8490a2.f18928f)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        i4 = 0;
                        while (true) {
                            abstractC8490aArr3 = this.f20177a;
                            if (i4 < abstractC8490aArr3.length) {
                                break;
                            }
                            AbstractC8490a abstractC8490a3 = abstractC8490aArr3[i4];
                            interfaceC8737v2 = this.f20174A.f20147c[i4];
                            if (interfaceC8737v2 == null && abstractC8490a3.f18926d == interfaceC8737v2 && abstractC8490a3.f18928f) {
                                abstractC8490a3.f18929g = z;
                            }
                            i4++;
                        }
                    }
                }
            } else {
                i = this.f20187k.f20164a;
            }
            if (i >= this.f20176C.mo21274a()) {
                this.f20191o.mo21081a();
                j6 = Long.MIN_VALUE;
                z = true;
            } else {
                if (this.f20202z == null) {
                    j3 = this.f20187k.f20166c;
                } else {
                    int i10 = this.f20176C.mo21276a(i, this.f20186j, false).f20681c;
                    if (i != this.f20176C.mo21277a(i10, this.f20185i, 0L).f20766c) {
                        j3 = 0;
                    } else {
                        C8668h c8668h16 = this.f20202z;
                        j6 = Long.MIN_VALUE;
                        z = true;
                        Pair pairM21197a = m21197a(this.f20176C, i10, -9223372036854775807L, Math.max(0L, ((c8668h16.f20149e - c8668h16.f20151g) + this.f20176C.mo21276a(c8668h16.f20150f, this.f20186j, false).f20682d) - this.f20201y));
                        if (pairM21197a != null) {
                            int iIntValue = ((Integer) pairM21197a.first).intValue();
                            long jLongValue = ((Long) pairM21197a.second).longValue();
                            i = iIntValue;
                            j3 = jLongValue;
                            c8668h7 = this.f20202z;
                            if (c8668h7 == null) {
                                j4 = j3 + 60000000;
                            } else {
                                j4 = (c8668h7.f20149e - c8668h7.f20151g) + this.f20176C.mo21276a(c8668h7.f20150f, this.f20186j, false).f20682d;
                            }
                            this.f20176C.mo21276a(i, this.f20186j, z);
                            if (i == this.f20176C.mo21274a() - (z ? 1 : 0) || this.f20176C.mo21277a(this.f20186j.f20681c, this.f20185i, 0L).f20765b) {
                                z2 = false;
                            } else {
                                z2 = z ? 1 : 0;
                            }
                            c8668h8 = new C8668h(this.f20177a, this.f20178b, j4, this.f20179c, this.f20180d, this.f20191o, this.f20186j.f20680b, i, z2, j3);
                            c8668h9 = this.f20202z;
                            if (c8668h9 != null) {
                                c8668h9.f20155k = c8668h8;
                            }
                            this.f20202z = c8668h8;
                            c8668h8.f20145a.mo21074a(this);
                            m21213b(z);
                        }
                    }
                }
                z = true;
                c8668h7 = this.f20202z;
                if (c8668h7 == null) {
                    j4 = j3 + 60000000;
                } else {
                    j4 = (c8668h7.f20149e - c8668h7.f20151g) + this.f20176C.mo21276a(c8668h7.f20150f, this.f20186j, false).f20682d;
                }
                this.f20176C.mo21276a(i, this.f20186j, z);
                if (i == this.f20176C.mo21274a() - (z ? 1 : 0)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                c8668h8 = new C8668h(this.f20177a, this.f20178b, j4, this.f20179c, this.f20180d, this.f20191o, this.f20186j.f20680b, i, z2, j3);
                c8668h9 = this.f20202z;
                if (c8668h9 != null) {
                    c8668h9.f20155k = c8668h8;
                }
                this.f20202z = c8668h8;
                c8668h8.f20145a.mo21074a(this);
                m21213b(z);
            }
            c8668h2 = this.f20202z;
            if (c8668h2 != null) {
                m21213b(false);
            } else {
                m21213b(false);
            }
            if (this.f20175B != null) {
                while (true) {
                    c8668h3 = this.f20175B;
                    c8668h4 = this.f20174A;
                    if (c8668h3 == c8668h4) {
                        break;
                    }
                    break;
                    break;
                    c8668h3.m21193a();
                    m21203a(this.f20175B.f20155k);
                    C8668h c8668h17 = this.f20175B;
                    this.f20187k = new C8669i(c8668h17.f20150f, c8668h17.f20151g);
                    m21220h();
                    this.f20184h.obtainMessage(5, this.f20187k).sendToTarget();
                }
                if (!c8668h4.f20152h) {
                    i4 = 0;
                    while (true) {
                        abstractC8490aArr3 = this.f20177a;
                        if (i4 < abstractC8490aArr3.length) {
                            break;
                            break;
                        }
                        AbstractC8490a abstractC8490a4 = abstractC8490aArr3[i4];
                        interfaceC8737v2 = this.f20174A.f20147c[i4];
                        if (interfaceC8737v2 == null) {
                        }
                        i4++;
                    }
                } else {
                    i2 = 0;
                    while (true) {
                        abstractC8490aArr = this.f20177a;
                        if (i2 >= abstractC8490aArr.length) {
                            abstractC8490a2 = abstractC8490aArr[i2];
                            interfaceC8737v = this.f20174A.f20147c[i2];
                            if (abstractC8490a2.f18926d != interfaceC8737v) {
                                break;
                            }
                            break;
                            break;
                        }
                        c8668h5 = this.f20174A;
                        c8668h6 = c8668h5.f20155k;
                        if (c8668h6 != null) {
                            break;
                        }
                        c8756j = c8668h5.f20157m;
                        this.f20174A = c8668h6;
                        c8756j2 = c8668h6.f20157m;
                        if (c8668h6.f20145a.mo21079g() != -9223372036854775807L) {
                            objArr = z ? 1 : 0;
                        } else {
                            objArr = null;
                        }
                        i3 = 0;
                        while (true) {
                            abstractC8490aArr2 = this.f20177a;
                            if (i3 < abstractC8490aArr2.length) {
                                break;
                                break;
                            }
                            abstractC8490a = abstractC8490aArr2[i3];
                            if (c8756j.f20447b.f20444b[i3] != null) {
                                if (objArr != null) {
                                    abstractC8490a.f18929g = z;
                                } else if (!abstractC8490a.f18929g) {
                                    abstractC8748b = c8756j2.f20447b.f20444b[i3];
                                    C8742t c8742t3 = c8756j.f20449d[i3];
                                    j = j7;
                                    C8742t c8742t4 = c8756j2.f20449d[i3];
                                    if (abstractC8748b == null) {
                                        j2 = j8;
                                        abstractC8490a.f18929g = z;
                                    } else {
                                        j2 = j8;
                                        abstractC8490a.f18929g = z;
                                    }
                                }
                                j = j7;
                                j2 = j8;
                            } else {
                                j = j7;
                                j2 = j8;
                            }
                            i3++;
                            j7 = j;
                            j8 = j2;
                            z = true;
                        }
                        i2++;
                    }
                }
            }
        }
        long j10 = j7;
        long j11 = j8;
        if (this.f20175B == null) {
            m21214c();
            m21201a(jElapsedRealtime, 10L);
            return;
        }
        AbstractC8824w.m21374a("doSomeWork");
        m21220h();
        InterfaceC8734s interfaceC8734s = this.f20175B.f20145a;
        long j12 = this.f20187k.f20166c;
        interfaceC8734s.getClass();
        boolean z3 = true;
        boolean z4 = true;
        for (AbstractC8490a abstractC8490a5 : this.f20192p) {
            abstractC8490a5.mo20953a(this.f20201y, this.f20198v);
            z4 = z4 && abstractC8490a5.mo20958e();
            boolean z5 = abstractC8490a5.mo20959f() || abstractC8490a5.mo20958e();
            if (!z5) {
                abstractC8490a5.f18926d.mo21086a();
            }
            z3 = z3 && z5;
        }
        if (!z3) {
            m21214c();
        }
        InterfaceC8809h interfaceC8809h = this.f20190n;
        if (interfaceC8809h != null) {
            C8712s c8712sMo20965a = interfaceC8809h.mo20965a();
            if (!c8712sMo20965a.equals(this.f20188l)) {
                this.f20188l = c8712sMo20965a;
                C8822u c8822u2 = this.f20181e;
                InterfaceC8809h interfaceC8809h2 = this.f20190n;
                c8822u2.getClass();
                c8822u2.m21369a(interfaceC8809h2.mo20973b());
                c8822u2.f20666d = interfaceC8809h2.mo20965a();
                this.f20184h.obtainMessage(7, c8712sMo20965a).sendToTarget();
            }
        }
        long j13 = this.f20176C.mo21276a(this.f20175B.f20150f, this.f20186j, false).f20682d;
        if (!z4 || ((j13 != j11 && j13 > this.f20187k.f20166c) || !this.f20175B.f20152h)) {
            int i11 = this.f20197u;
            if (i11 != 2) {
                if (i11 == 3) {
                    if (!(this.f20192p.length > 0 ? z3 : j13 == j11 || this.f20187k.f20166c < j13 || ((c8668h10 = this.f20175B.f20155k) != null && c8668h10.f20153i))) {
                        this.f20195s = this.f20194r;
                        i5 = 2;
                        m21199a(2);
                        m21219g();
                    }
                }
                if (this.f20197u == i5) {
                    for (AbstractC8490a abstractC8490a6 : this.f20192p) {
                        abstractC8490a6.f18926d.mo21086a();
                    }
                }
                if (!this.f20194r) {
                    if (this.f20192p.length != 0) {
                        m21201a(jElapsedRealtime, 1000L);
                    } else {
                        this.f20182f.removeMessages(2);
                    }
                } else if (this.f20192p.length != 0) {
                    m21201a(jElapsedRealtime, 1000L);
                } else {
                    this.f20182f.removeMessages(2);
                }
                AbstractC8824w.m21373a();
            }
            if (this.f20192p.length > 0) {
                if (z3) {
                    boolean z6 = this.f20195s;
                    C8668h c8668h18 = this.f20202z;
                    long jMo21076c = !c8668h18.f20153i ? c8668h18.f20151g : c8668h18.f20145a.mo21076c();
                    if (jMo21076c == j6) {
                        C8668h c8668h19 = this.f20202z;
                        if (c8668h19.f20152h) {
                            m21199a(3);
                            if (this.f20194r) {
                                this.f20195s = false;
                                c8822u = this.f20181e;
                                if (c8822u.f20663a) {
                                    i6 = 1;
                                } else {
                                    c8822u.f20665c = SystemClock.elapsedRealtime();
                                    i6 = 1;
                                    c8822u.f20663a = true;
                                }
                                for (AbstractC8490a abstractC8490a7 : this.f20192p) {
                                    if (abstractC8490a7.f18925c != i6) {
                                        throw new IllegalStateException();
                                    }
                                    abstractC8490a7.f18925c = 2;
                                    abstractC8490a7.mo20962i();
                                }
                            }
                        } else {
                            jMo21076c = this.f20176C.mo21276a(c8668h19.f20150f, this.f20186j, false).f20682d;
                            c8516c = this.f20180d;
                            C8668h c8668h20 = this.f20202z;
                            long jAbs = jMo21076c - Math.abs(this.f20201y - (c8668h20.f20149e - c8668h20.f20151g));
                            if (z6) {
                                j5 = c8516c.f19092e;
                            } else {
                                j5 = c8516c.f19091d;
                            }
                            if (j5 > j10 || jAbs >= j5) {
                                m21199a(3);
                                if (this.f20194r) {
                                    this.f20195s = false;
                                    c8822u = this.f20181e;
                                    if (c8822u.f20663a) {
                                        c8822u.f20665c = SystemClock.elapsedRealtime();
                                        i6 = 1;
                                        c8822u.f20663a = true;
                                    } else {
                                        i6 = 1;
                                    }
                                    while (i7 < r2) {
                                        if (abstractC8490a7.f18925c != i6) {
                                            throw new IllegalStateException();
                                        }
                                        abstractC8490a7.f18925c = 2;
                                        abstractC8490a7.mo20962i();
                                    }
                                }
                            }
                        }
                    } else {
                        c8516c = this.f20180d;
                        C8668h c8668h21 = this.f20202z;
                        long jAbs2 = jMo21076c - Math.abs(this.f20201y - (c8668h21.f20149e - c8668h21.f20151g));
                        if (z6) {
                            j5 = c8516c.f19092e;
                        } else {
                            j5 = c8516c.f19091d;
                        }
                        if (j5 > j10) {
                            m21199a(3);
                            if (this.f20194r) {
                                this.f20195s = false;
                                c8822u = this.f20181e;
                                if (c8822u.f20663a) {
                                    c8822u.f20665c = SystemClock.elapsedRealtime();
                                    i6 = 1;
                                    c8822u.f20663a = true;
                                } else {
                                    i6 = 1;
                                }
                                while (i7 < r2) {
                                    if (abstractC8490a7.f18925c != i6) {
                                        throw new IllegalStateException();
                                    }
                                    abstractC8490a7.f18925c = 2;
                                    abstractC8490a7.mo20962i();
                                }
                            }
                        } else {
                            m21199a(3);
                            if (this.f20194r) {
                                this.f20195s = false;
                                c8822u = this.f20181e;
                                if (c8822u.f20663a) {
                                    c8822u.f20665c = SystemClock.elapsedRealtime();
                                    i6 = 1;
                                    c8822u.f20663a = true;
                                } else {
                                    i6 = 1;
                                }
                                while (i7 < r2) {
                                    if (abstractC8490a7.f18925c != i6) {
                                        throw new IllegalStateException();
                                    }
                                    abstractC8490a7.f18925c = 2;
                                    abstractC8490a7.mo20962i();
                                }
                            }
                        }
                    }
                }
                if (this.f20197u == i5) {
                    while (i < r2) {
                        abstractC8490a6.f18926d.mo21086a();
                    }
                }
                if ((!this.f20194r && this.f20197u == 3) || this.f20197u == 2) {
                    m21201a(jElapsedRealtime, 10L);
                } else if (this.f20192p.length != 0) {
                    m21201a(jElapsedRealtime, 1000L);
                } else {
                    this.f20182f.removeMessages(2);
                }
                AbstractC8824w.m21373a();
            }
            if (j13 == j11 || this.f20187k.f20166c < j13 || ((c8668h11 = this.f20175B.f20155k) != null && c8668h11.f20153i)) {
                m21199a(3);
                if (this.f20194r) {
                    this.f20195s = false;
                    c8822u = this.f20181e;
                    if (c8822u.f20663a) {
                        c8822u.f20665c = SystemClock.elapsedRealtime();
                        i6 = 1;
                        c8822u.f20663a = true;
                    } else {
                        i6 = 1;
                    }
                    while (i7 < r2) {
                        if (abstractC8490a7.f18925c != i6) {
                            throw new IllegalStateException();
                        }
                        abstractC8490a7.f18925c = 2;
                        abstractC8490a7.mo20962i();
                    }
                }
            }
            i5 = 2;
            if (this.f20197u == i5) {
                while (i < r2) {
                    abstractC8490a6.f18926d.mo21086a();
                }
            }
            if (!this.f20194r) {
                if (this.f20192p.length != 0) {
                    m21201a(jElapsedRealtime, 1000L);
                } else {
                    this.f20182f.removeMessages(2);
                }
            } else if (this.f20192p.length != 0) {
                m21201a(jElapsedRealtime, 1000L);
            } else {
                this.f20182f.removeMessages(2);
            }
            AbstractC8824w.m21373a();
        }
        m21199a(4);
        m21219g();
        i5 = 2;
        if (this.f20197u == i5) {
            while (i < r2) {
                abstractC8490a6.f18926d.mo21086a();
            }
        }
        if (!this.f20194r) {
            if (this.f20192p.length != 0) {
                m21201a(jElapsedRealtime, 1000L);
            } else {
                this.f20182f.removeMessages(2);
            }
        } else if (this.f20192p.length != 0) {
            m21201a(jElapsedRealtime, 1000L);
        } else {
            this.f20182f.removeMessages(2);
        }
        AbstractC8824w.m21373a();
    }

    /* JADX INFO: renamed from: a */
    public final void m21199a(int i) {
        if (this.f20197u != i) {
            this.f20197u = i;
            this.f20184h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21200a(long j) {
        C8668h c8668h = this.f20175B;
        long j2 = c8668h == null ? j + 60000000 : j + (c8668h.f20149e - c8668h.f20151g);
        this.f20201y = j2;
        this.f20181e.m21369a(j2);
        for (AbstractC8490a abstractC8490a : this.f20192p) {
            long j3 = this.f20201y;
            abstractC8490a.f18929g = false;
            abstractC8490a.f18928f = false;
            abstractC8490a.mo20954a(false, j3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21201a(long j, long j2) {
        this.f20182f.removeMessages(2);
        long jElapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f20182f.sendEmptyMessage(2);
        } else {
            this.f20182f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.l] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m21202a(Pair pair) {
        boolean z;
        int i;
        ?? r9;
        AbstractC8845x abstractC8845x = this.f20176C;
        AbstractC8845x abstractC8845x2 = (AbstractC8845x) pair.first;
        this.f20176C = abstractC8845x2;
        Object obj = pair.second;
        if (abstractC8845x != null) {
            z = false;
            i = z ? 1 : 0;
            r9 = z;
        } else if (this.f20199w > 0) {
            Pair pairM21196a = m21196a(this.f20200x);
            int i2 = this.f20199w;
            this.f20199w = 0;
            this.f20200x = null;
            if (pairM21196a == null) {
                C8669i c8669i = new C8669i(0, 0L);
                this.f20187k = c8669i;
                this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, c8669i, i2)).sendToTarget();
                this.f20187k = new C8669i(0, -9223372036854775807L);
                m21199a(4);
                m21208a(false);
                return;
            }
            this.f20187k = new C8669i(((Integer) pairM21196a.first).intValue(), ((Long) pairM21196a.second).longValue());
            r9 = 0;
            i = i2;
        } else {
            if (this.f20187k.f20165b != -9223372036854775807L) {
                z = false;
            } else {
                if (abstractC8845x2.m21395c()) {
                    C8669i c8669i2 = new C8669i(0, 0L);
                    this.f20187k = c8669i2;
                    this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, c8669i2, 0)).sendToTarget();
                    this.f20187k = new C8669i(0, -9223372036854775807L);
                    m21199a(4);
                    m21208a(false);
                    return;
                }
                z = false;
                Pair pairM21197a = m21197a(this.f20176C, 0, -9223372036854775807L, 0L);
                this.f20187k = new C8669i(((Integer) pairM21197a.first).intValue(), ((Long) pairM21197a.second).longValue());
            }
            i = z ? 1 : 0;
            r9 = z;
        }
        C8668h c8668h = this.f20175B;
        if (c8668h == null) {
            c8668h = this.f20202z;
        }
        if (c8668h == null) {
            this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, this.f20187k, i)).sendToTarget();
            return;
        }
        int iMo21275a = this.f20176C.mo21275a(c8668h.f20146b);
        if (iMo21275a != -1) {
            C8668h c8668h2 = c8668h;
            this.f20176C.mo21276a(iMo21275a, this.f20186j, r9);
            ?? r1 = (iMo21275a != this.f20176C.mo21274a() - 1 || this.f20176C.mo21277a(this.f20186j.f20681c, this.f20185i, 0L).f20765b) ? r9 : 1;
            c8668h2.f20150f = iMo21275a;
            c8668h2.f20152h = r1;
            ?? r2 = c8668h2 == this.f20174A ? 1 : r9;
            C8669i c8669i3 = this.f20187k;
            if (iMo21275a != c8669i3.f20164a) {
                C8669i c8669i4 = new C8669i(iMo21275a, c8669i3.f20165b);
                c8669i4.f20166c = c8669i3.f20166c;
                this.f20187k = c8669i4;
            }
            int i3 = iMo21275a;
            ?? r3 = r2;
            C8668h c8668h3 = c8668h2;
            while (true) {
                C8668h c8668h4 = c8668h3.f20155k;
                if (c8668h4 == null) {
                    break;
                }
                i3++;
                this.f20176C.mo21276a(i3, this.f20186j, true);
                ?? r5 = (i3 != this.f20176C.mo21274a() - 1 || this.f20176C.mo21277a(this.f20186j.f20681c, this.f20185i, 0L).f20765b) ? r9 : 1;
                if (!c8668h4.f20146b.equals(this.f20186j.f20680b)) {
                    if (r3 != 0) {
                        this.f20202z = c8668h3;
                        c8668h3.f20155k = null;
                        while (c8668h4 != null) {
                            c8668h4.m21193a();
                            c8668h4 = c8668h4.f20155k;
                        }
                        break;
                    }
                    int i4 = this.f20175B.f20150f;
                    this.f20187k = new C8669i(i4, m21195a(i4, this.f20187k.f20166c));
                    break;
                }
                c8668h4.f20150f = i3;
                c8668h4.f20152h = r5;
                c8668h3 = c8668h4;
                r3 |= c8668h4 == this.f20174A ? 1 : r9;
            }
            this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, this.f20187k, i)).sendToTarget();
            return;
        }
        int i5 = c8668h.f20150f;
        AbstractC8845x abstractC8845x3 = this.f20176C;
        int iMo21275a2 = -1;
        while (iMo21275a2 == -1 && i5 < abstractC8845x.mo21274a() - 1) {
            i5++;
            iMo21275a2 = abstractC8845x3.mo21275a(abstractC8845x.mo21276a(i5, this.f20186j, true).f20680b);
        }
        if (iMo21275a2 == -1) {
            C8669i c8669i5 = new C8669i(r9, 0L);
            this.f20187k = c8669i5;
            this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, c8669i5, i)).sendToTarget();
            this.f20187k = new C8669i(r9, -9223372036854775807L);
            m21199a(4);
            m21208a(r9);
            return;
        }
        int i6 = this.f20176C.mo21276a(iMo21275a2, this.f20186j, r9).f20681c;
        C8668h c8668h5 = c8668h;
        Pair pairM21197a2 = m21197a(this.f20176C, 0, -9223372036854775807L, 0L);
        int iIntValue = ((Integer) pairM21197a2.first).intValue();
        long jLongValue = ((Long) pairM21197a2.second).longValue();
        this.f20176C.mo21276a(iIntValue, this.f20186j, true);
        Object obj2 = this.f20186j.f20680b;
        c8668h5.f20150f = -1;
        while (true) {
            c8668h5 = c8668h5.f20155k;
            if (c8668h5 == null) {
                C8669i c8669i6 = new C8669i(iIntValue, m21195a(iIntValue, jLongValue));
                this.f20187k = c8669i6;
                this.f20184h.obtainMessage(6, new C8671k(this.f20176C, obj, c8669i6, i)).sendToTarget();
                return;
            }
            c8668h5.f20150f = c8668h5.f20146b.equals(obj2) ? iIntValue : -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21203a(C8668h c8668h) throws C8517d {
        if (this.f20175B == c8668h) {
            return;
        }
        boolean[] zArr = new boolean[this.f20177a.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            AbstractC8490a[] abstractC8490aArr = this.f20177a;
            if (i >= abstractC8490aArr.length) {
                this.f20175B = c8668h;
                this.f20184h.obtainMessage(3, c8668h.f20157m).sendToTarget();
                m21210a(zArr, i2);
                return;
            }
            AbstractC8490a abstractC8490a = abstractC8490aArr[i];
            boolean z = abstractC8490a.f18925c != 0;
            zArr[i] = z;
            AbstractC8748b abstractC8748b = c8668h.f20157m.f20447b.f20444b[i];
            if (abstractC8748b != null) {
                i2++;
            }
            if (z && (abstractC8748b == null || (abstractC8490a.f18929g && abstractC8490a.f18926d == this.f20175B.f20147c[i]))) {
                if (abstractC8490a == this.f20189m) {
                    C8822u c8822u = this.f20181e;
                    InterfaceC8809h interfaceC8809h = this.f20190n;
                    c8822u.getClass();
                    c8822u.m21369a(interfaceC8809h.mo20973b());
                    c8822u.f20666d = interfaceC8809h.mo20965a();
                    this.f20190n = null;
                    this.f20189m = null;
                }
                m21194a(abstractC8490a);
                abstractC8490a.m20956c();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21204a(C8712s c8712s) {
        InterfaceC8809h interfaceC8809h = this.f20190n;
        C8712s c8712sMo20966a = interfaceC8809h != null ? interfaceC8809h.mo20966a(c8712s) : this.f20181e.mo20966a(c8712s);
        this.f20188l = c8712sMo20966a;
        this.f20184h.obtainMessage(7, c8712sMo20966a).sendToTarget();
    }

    /* JADX INFO: renamed from: a */
    public final void m21205a(InterfaceC8734s interfaceC8734s) throws C8517d {
        InterfaceC8734s interfaceC8734s2;
        C8668h c8668h = this.f20202z;
        if (c8668h == null || (interfaceC8734s2 = c8668h.f20145a) != interfaceC8734s) {
            return;
        }
        c8668h.f20153i = true;
        C8756j c8756jMo21284a = c8668h.f20160p.mo21284a(c8668h.f20159o, interfaceC8734s2.mo21073a());
        C8756j c8756j = c8668h.f20163s;
        if (c8756j == null) {
            c8668h.f20157m = c8756jMo21284a;
            break;
        }
        for (int i = 0; i < c8756jMo21284a.f20447b.f20443a; i++) {
            if (!c8756jMo21284a.m21285a(c8756j, i)) {
                c8668h.f20157m = c8756jMo21284a;
                break;
            }
        }
        c8668h.f20151g = c8668h.m21192a(c8668h.f20151g, false, new boolean[c8668h.f20158n.length]);
        if (this.f20175B == null) {
            C8668h c8668h2 = this.f20202z;
            this.f20174A = c8668h2;
            m21200a(c8668h2.f20151g);
            m21203a(this.f20174A);
        }
        m21211b();
    }

    /* JADX INFO: renamed from: a */
    public final void m21206a(InterfaceC8736u interfaceC8736u, boolean z) {
        this.f20184h.sendEmptyMessage(0);
        m21208a(true);
        this.f20180d.m21013a(false);
        if (z) {
            this.f20187k = new C8669i(0, -9223372036854775807L);
        }
        this.f20191o = interfaceC8736u;
        interfaceC8736u.mo21083a(this);
        m21199a(2);
        this.f20182f.sendEmptyMessage(2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8735t
    /* JADX INFO: renamed from: a */
    public final void mo21207a(C8739x c8739x, C8546g c8546g) {
        this.f20182f.obtainMessage(7, Pair.create(c8739x, c8546g)).sendToTarget();
    }

    /* JADX INFO: renamed from: a */
    public final void m21208a(boolean z) {
        this.f20182f.removeMessages(2);
        this.f20195s = false;
        C8822u c8822u = this.f20181e;
        if (c8822u.f20663a) {
            c8822u.m21369a(c8822u.mo20973b());
            c8822u.f20663a = false;
        }
        this.f20190n = null;
        this.f20189m = null;
        this.f20201y = 60000000L;
        for (AbstractC8490a abstractC8490a : this.f20192p) {
            try {
                m21194a(abstractC8490a);
                abstractC8490a.m20956c();
            } catch (C8517d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f20192p = new AbstractC8490a[0];
        C8668h c8668h = this.f20175B;
        if (c8668h == null) {
            c8668h = this.f20202z;
        }
        while (c8668h != null) {
            c8668h.m21193a();
            c8668h = c8668h.f20155k;
        }
        this.f20202z = null;
        this.f20174A = null;
        this.f20175B = null;
        m21213b(false);
        if (z) {
            InterfaceC8736u interfaceC8736u = this.f20191o;
            if (interfaceC8736u != null) {
                interfaceC8736u.mo21084b();
                this.f20191o = null;
            }
            this.f20176C = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21209a(C8525e[] c8525eArr) {
        try {
            for (C8525e c8525e : c8525eArr) {
                c8525e.f19115a.mo20952a(c8525e.f19116b, c8525e.f19117c);
            }
            if (this.f20191o != null) {
                this.f20182f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21210a(boolean[] zArr, int i) throws C8517d {
        int i2;
        this.f20192p = new AbstractC8490a[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            AbstractC8490a[] abstractC8490aArr = this.f20177a;
            if (i3 >= abstractC8490aArr.length) {
                return;
            }
            AbstractC8490a abstractC8490a = abstractC8490aArr[i3];
            C8756j c8756j = this.f20175B.f20157m;
            AbstractC8748b abstractC8748b = c8756j.f20447b.f20444b[i3];
            if (abstractC8748b != null) {
                int i5 = i4 + 1;
                this.f20192p[i4] = abstractC8490a;
                if (abstractC8490a.f18925c == 0) {
                    C8742t c8742t = c8756j.f20449d[i3];
                    boolean z = this.f20194r && this.f20197u == 3;
                    boolean z2 = !zArr[i3] && z;
                    int length = abstractC8748b.f20436c.length;
                    C8708o[] c8708oArr = new C8708o[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        c8708oArr[i6] = abstractC8748b.f20437d[i6];
                    }
                    C8668h c8668h = this.f20175B;
                    InterfaceC8737v interfaceC8737v = c8668h.f20147c[i3];
                    long j = this.f20201y;
                    i2 = i3;
                    long j2 = c8668h.f20149e - c8668h.f20151g;
                    if (abstractC8490a.f18925c != 0) {
                        throw new IllegalStateException();
                    }
                    abstractC8490a.f18924b = c8742t;
                    abstractC8490a.f18925c = 1;
                    abstractC8490a.mo20961h();
                    if (abstractC8490a.f18929g) {
                        throw new IllegalStateException();
                    }
                    abstractC8490a.f18926d = interfaceC8737v;
                    abstractC8490a.f18928f = false;
                    abstractC8490a.f18927e = j2;
                    abstractC8490a.mo20955a(c8708oArr);
                    abstractC8490a.mo20954a(z2, j);
                    InterfaceC8809h interfaceC8809hMo20957d = abstractC8490a.mo20957d();
                    if (interfaceC8809hMo20957d != null) {
                        if (this.f20190n != null) {
                            throw new C8517d(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.f20190n = interfaceC8809hMo20957d;
                        this.f20189m = abstractC8490a;
                        ((MediaCodecAudioRenderer) interfaceC8809hMo20957d).f18931Q.m20992a(this.f20188l);
                    }
                    if (z) {
                        if (abstractC8490a.f18925c != 1) {
                            throw new IllegalStateException();
                        }
                        abstractC8490a.f18925c = 2;
                        abstractC8490a.mo20962i();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21211b() {
        char c;
        int i;
        C8668h c8668h = this.f20202z;
        long jMo21078f = !c8668h.f20153i ? 0L : c8668h.f20145a.mo21078f();
        if (jMo21078f == Long.MIN_VALUE) {
            m21213b(false);
            return;
        }
        C8668h c8668h2 = this.f20202z;
        long jAbs = Math.abs(this.f20201y - (c8668h2.f20149e - c8668h2.f20151g));
        long j = jMo21078f - jAbs;
        C8516c c8516c = this.f20180d;
        if (j > c8516c.f19090c) {
            c = 0;
        } else {
            c = j < c8516c.f19089b ? (char) 2 : (char) 1;
        }
        C8787l c8787l = c8516c.f19088a;
        synchronized (c8787l) {
            i = c8787l.f20553c * 65536;
        }
        boolean z = c == 2 || (c == 1 && c8516c.f19094g && !(i >= c8516c.f19093f));
        c8516c.f19094g = z;
        m21213b(z);
        if (!z) {
            this.f20202z.f20156l = true;
            return;
        }
        C8668h c8668h3 = this.f20202z;
        c8668h3.f20156l = false;
        c8668h3.f20145a.mo21075b(jAbs);
    }

    /* JADX INFO: renamed from: b */
    public final void m21212b(C8670j c8670j) {
        if (this.f20176C == null) {
            this.f20199w++;
            this.f20200x = c8670j;
            return;
        }
        Pair pairM21196a = m21196a(c8670j);
        if (pairM21196a == null) {
            C8669i c8669i = new C8669i(0, 0L);
            this.f20187k = c8669i;
            this.f20184h.obtainMessage(4, 1, 0, c8669i).sendToTarget();
            this.f20187k = new C8669i(0, -9223372036854775807L);
            m21199a(4);
            m21208a(false);
            return;
        }
        int i = c8670j.f20169c == -9223372036854775807L ? 1 : 0;
        int iIntValue = ((Integer) pairM21196a.first).intValue();
        long jLongValue = ((Long) pairM21196a.second).longValue();
        try {
            C8669i c8669i2 = this.f20187k;
            if (iIntValue == c8669i2.f20164a && jLongValue / 1000 == c8669i2.f20166c / 1000) {
                C8669i c8669i3 = new C8669i(iIntValue, jLongValue);
                this.f20187k = c8669i3;
                this.f20184h.obtainMessage(4, i, 0, c8669i3).sendToTarget();
            } else {
                long jM21195a = m21195a(iIntValue, jLongValue);
                int i2 = i | (jLongValue == jM21195a ? 0 : 1);
                C8669i c8669i4 = new C8669i(iIntValue, jM21195a);
                this.f20187k = c8669i4;
                this.f20184h.obtainMessage(4, i2, 0, c8669i4).sendToTarget();
            }
        } catch (Throwable th) {
            C8669i c8669i5 = new C8669i(iIntValue, jLongValue);
            this.f20187k = c8669i5;
            this.f20184h.obtainMessage(4, i, 0, c8669i5).sendToTarget();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21213b(boolean z) {
        if (this.f20196t != z) {
            this.f20196t = z;
            this.f20184h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21214c() {
        C8668h c8668h = this.f20202z;
        if (c8668h == null || c8668h.f20153i) {
            return;
        }
        C8668h c8668h2 = this.f20174A;
        if (c8668h2 == null || c8668h2.f20155k == c8668h) {
            for (AbstractC8490a abstractC8490a : this.f20192p) {
                if (!abstractC8490a.f18928f) {
                    return;
                }
            }
            this.f20202z.f20145a.mo21077d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21215c(boolean z) {
        this.f20195s = false;
        this.f20194r = z;
        if (!z) {
            m21219g();
            m21220h();
            m21208a(false);
            return;
        }
        int i = this.f20197u;
        if (i != 3) {
            if (i == 2) {
                this.f20182f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f20195s = false;
        C8822u c8822u = this.f20181e;
        if (!c8822u.f20663a) {
            c8822u.f20665c = SystemClock.elapsedRealtime();
            c8822u.f20663a = true;
        }
        for (AbstractC8490a abstractC8490a : this.f20192p) {
            if (abstractC8490a.f18925c != 1) {
                throw new IllegalStateException();
            }
            abstractC8490a.f18925c = 2;
            abstractC8490a.mo20962i();
        }
        this.f20182f.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m21216d() {
        if (this.f20193q) {
            return;
        }
        this.f20182f.sendEmptyMessage(6);
        while (!this.f20193q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f20183g.quit();
    }

    /* JADX INFO: renamed from: e */
    public final void m21217e() {
        m21208a(true);
        this.f20180d.m21013a(true);
        m21199a(1);
        synchronized (this) {
            this.f20193q = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m21218f() throws C8517d {
        C8668h c8668h = this.f20175B;
        if (c8668h == null) {
            return;
        }
        boolean z = true;
        while (c8668h != null && c8668h.f20153i) {
            C8756j c8756jMo21284a = c8668h.f20160p.mo21284a(c8668h.f20159o, c8668h.f20145a.mo21073a());
            C8756j c8756j = c8668h.f20163s;
            if (c8756j != null) {
                int i = 0;
                while (true) {
                    if (i >= c8756jMo21284a.f20447b.f20443a) {
                        if (c8668h == this.f20174A) {
                            z = false;
                        }
                        c8668h = c8668h.f20155k;
                    } else if (c8756jMo21284a.m21285a(c8756j, i)) {
                        i++;
                    }
                }
            }
            c8668h.f20157m = c8756jMo21284a;
            if (z) {
                C8668h c8668h2 = this.f20174A;
                C8668h c8668h3 = this.f20175B;
                boolean z2 = c8668h2 != c8668h3;
                for (C8668h c8668h4 = c8668h3.f20155k; c8668h4 != null; c8668h4 = c8668h4.f20155k) {
                    c8668h4.m21193a();
                }
                C8668h c8668h5 = this.f20175B;
                c8668h5.f20155k = null;
                this.f20202z = c8668h5;
                this.f20174A = c8668h5;
                boolean[] zArr = new boolean[this.f20177a.length];
                long jM21192a = c8668h5.m21192a(this.f20187k.f20166c, z2, zArr);
                if (jM21192a != this.f20187k.f20166c) {
                    this.f20187k.f20166c = jM21192a;
                    m21200a(jM21192a);
                }
                boolean[] zArr2 = new boolean[this.f20177a.length];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    AbstractC8490a[] abstractC8490aArr = this.f20177a;
                    if (i2 >= abstractC8490aArr.length) {
                        break;
                    }
                    AbstractC8490a abstractC8490a = abstractC8490aArr[i2];
                    boolean z3 = abstractC8490a.f18925c != 0;
                    zArr2[i2] = z3;
                    InterfaceC8737v interfaceC8737v = this.f20175B.f20147c[i2];
                    if (interfaceC8737v != null) {
                        i3++;
                    }
                    if (z3) {
                        if (interfaceC8737v != abstractC8490a.f18926d) {
                            if (abstractC8490a == this.f20189m) {
                                if (interfaceC8737v == null) {
                                    C8822u c8822u = this.f20181e;
                                    InterfaceC8809h interfaceC8809h = this.f20190n;
                                    c8822u.getClass();
                                    c8822u.m21369a(interfaceC8809h.mo20973b());
                                    c8822u.f20666d = interfaceC8809h.mo20965a();
                                }
                                this.f20190n = null;
                                this.f20189m = null;
                            }
                            m21194a(abstractC8490a);
                            abstractC8490a.m20956c();
                        } else if (zArr[i2]) {
                            long j = this.f20201y;
                            abstractC8490a.f18929g = false;
                            abstractC8490a.f18928f = false;
                            abstractC8490a.mo20954a(false, j);
                        }
                    }
                    i2++;
                }
                this.f20184h.obtainMessage(3, c8668h.f20157m).sendToTarget();
                m21210a(zArr2, i3);
            } else {
                this.f20202z = c8668h;
                for (C8668h c8668h6 = c8668h.f20155k; c8668h6 != null; c8668h6 = c8668h6.f20155k) {
                    c8668h6.m21193a();
                }
                C8668h c8668h7 = this.f20202z;
                c8668h7.f20155k = null;
                if (c8668h7.f20153i) {
                    long j2 = c8668h7.f20151g;
                    long jMax = Math.max(j2, Math.abs(this.f20201y - (c8668h7.f20149e - j2)));
                    C8668h c8668h8 = this.f20202z;
                    c8668h8.m21192a(jMax, false, new boolean[c8668h8.f20158n.length]);
                }
            }
            m21211b();
            m21220h();
            this.f20182f.sendEmptyMessage(2);
            return;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21219g() {
        C8822u c8822u = this.f20181e;
        if (c8822u.f20663a) {
            c8822u.m21369a(c8822u.mo20973b());
            c8822u.f20663a = false;
        }
        for (AbstractC8490a abstractC8490a : this.f20192p) {
            m21194a(abstractC8490a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m21220h() {
        C8668h c8668h = this.f20175B;
        if (c8668h == null) {
            return;
        }
        long jMo21079g = c8668h.f20145a.mo21079g();
        if (jMo21079g != -9223372036854775807L) {
            m21200a(jMo21079g);
        } else {
            AbstractC8490a abstractC8490a = this.f20189m;
            if (abstractC8490a == null || abstractC8490a.mo20958e()) {
                this.f20201y = this.f20181e.mo20973b();
            } else {
                long jMo20973b = this.f20190n.mo20973b();
                this.f20201y = jMo20973b;
                this.f20181e.m21369a(jMo20973b);
            }
            C8668h c8668h2 = this.f20175B;
            jMo21079g = Math.abs(this.f20201y - (c8668h2.f20149e - c8668h2.f20151g));
        }
        this.f20187k.f20166c = jMo21079g;
        this.f20198v = SystemClock.elapsedRealtime() * 1000;
        long jMo21076c = this.f20192p.length == 0 ? Long.MIN_VALUE : this.f20175B.f20145a.mo21076c();
        C8669i c8669i = this.f20187k;
        if (jMo21076c == Long.MIN_VALUE) {
            long j = this.f20176C.mo21276a(this.f20175B.f20150f, this.f20186j, false).f20682d;
        }
        c8669i.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    m21206a((InterfaceC8736u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    m21215c(message.arg1 != 0);
                    return true;
                case 2:
                    m21198a();
                    return true;
                case 3:
                    m21212b((C8670j) message.obj);
                    return true;
                case 4:
                    m21204a((C8712s) message.obj);
                    return true;
                case 5:
                    m21208a(true);
                    this.f20180d.m21013a(true);
                    m21199a(1);
                    return true;
                case 6:
                    m21217e();
                    return true;
                case 7:
                    m21202a((Pair) message.obj);
                    return true;
                case 8:
                    m21205a((InterfaceC8734s) message.obj);
                    return true;
                case 9:
                    InterfaceC8734s interfaceC8734s = (InterfaceC8734s) message.obj;
                    C8668h c8668h = this.f20202z;
                    if (c8668h != null && c8668h.f20145a == interfaceC8734s) {
                        m21211b();
                    }
                    return true;
                case 10:
                    m21218f();
                    return true;
                case 11:
                    m21209a((C8525e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (C8517d e) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.f20184h.obtainMessage(8, e).sendToTarget();
            m21208a(true);
            this.f20180d.m21013a(true);
            m21199a(1);
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.f20184h.obtainMessage(8, new C8517d(e2)).sendToTarget();
            m21208a(true);
            this.f20180d.m21013a(true);
            m21199a(1);
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.f20184h.obtainMessage(8, new C8517d(e3)).sendToTarget();
            m21208a(true);
            this.f20180d.m21013a(true);
            m21199a(1);
            return true;
        }
    }
}
