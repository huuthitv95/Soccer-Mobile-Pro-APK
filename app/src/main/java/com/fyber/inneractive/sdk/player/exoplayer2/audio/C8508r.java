package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8712s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.C11744X3;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8508r {

    /* JADX INFO: renamed from: A */
    public long f18978A;

    /* JADX INFO: renamed from: B */
    public boolean f18979B;

    /* JADX INFO: renamed from: C */
    public long f18980C;

    /* JADX INFO: renamed from: D */
    public Method f18981D;

    /* JADX INFO: renamed from: E */
    public int f18982E;

    /* JADX INFO: renamed from: F */
    public long f18983F;

    /* JADX INFO: renamed from: G */
    public long f18984G;

    /* JADX INFO: renamed from: H */
    public int f18985H;

    /* JADX INFO: renamed from: I */
    public long f18986I;

    /* JADX INFO: renamed from: J */
    public long f18987J;

    /* JADX INFO: renamed from: K */
    public int f18988K;

    /* JADX INFO: renamed from: L */
    public int f18989L;

    /* JADX INFO: renamed from: M */
    public long f18990M;

    /* JADX INFO: renamed from: N */
    public long f18991N;

    /* JADX INFO: renamed from: O */
    public long f18992O;

    /* JADX INFO: renamed from: P */
    public float f18993P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC8493c[] f18994Q;

    /* JADX INFO: renamed from: R */
    public ByteBuffer[] f18995R;

    /* JADX INFO: renamed from: S */
    public ByteBuffer f18996S;

    /* JADX INFO: renamed from: T */
    public ByteBuffer f18997T;

    /* JADX INFO: renamed from: U */
    public byte[] f18998U;

    /* JADX INFO: renamed from: V */
    public int f18999V;

    /* JADX INFO: renamed from: W */
    public int f19000W;

    /* JADX INFO: renamed from: X */
    public boolean f19001X;

    /* JADX INFO: renamed from: Y */
    public boolean f19002Y;

    /* JADX INFO: renamed from: Z */
    public int f19003Z;

    /* JADX INFO: renamed from: a */
    public final C8509s f19004a;

    /* JADX INFO: renamed from: a0 */
    public boolean f19005a0;

    /* JADX INFO: renamed from: b */
    public final C8514x f19006b;

    /* JADX INFO: renamed from: b0 */
    public boolean f19007b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8493c[] f19008c;

    /* JADX INFO: renamed from: c0 */
    public long f19009c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8505o f19010d;

    /* JADX INFO: renamed from: e */
    public final ConditionVariable f19011e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f */
    public final long[] f19012f;

    /* JADX INFO: renamed from: g */
    public final C8501k f19013g;

    /* JADX INFO: renamed from: h */
    public final LinkedList f19014h;

    /* JADX INFO: renamed from: i */
    public AudioTrack f19015i;

    /* JADX INFO: renamed from: j */
    public int f19016j;

    /* JADX INFO: renamed from: k */
    public int f19017k;

    /* JADX INFO: renamed from: l */
    public int f19018l;

    /* JADX INFO: renamed from: m */
    public int f19019m;

    /* JADX INFO: renamed from: n */
    public int f19020n;

    /* JADX INFO: renamed from: o */
    public boolean f19021o;

    /* JADX INFO: renamed from: p */
    public int f19022p;

    /* JADX INFO: renamed from: q */
    public long f19023q;

    /* JADX INFO: renamed from: r */
    public C8712s f19024r;

    /* JADX INFO: renamed from: s */
    public C8712s f19025s;

    /* JADX INFO: renamed from: t */
    public long f19026t;

    /* JADX INFO: renamed from: u */
    public long f19027u;

    /* JADX INFO: renamed from: v */
    public ByteBuffer f19028v;

    /* JADX INFO: renamed from: w */
    public int f19029w;

    /* JADX INFO: renamed from: x */
    public int f19030x;

    /* JADX INFO: renamed from: y */
    public int f19031y;

    /* JADX INFO: renamed from: z */
    public long f19032z;

    public C8508r(InterfaceC8493c[] interfaceC8493cArr, C8511u c8511u) {
        this.f19010d = c8511u;
        if (AbstractC8827z.f20671a >= 18) {
            try {
                this.f18981D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (AbstractC8827z.f20671a >= 19) {
            this.f19013g = new C8502l();
        } else {
            this.f19013g = new C8501k();
        }
        C8509s c8509s = new C8509s();
        this.f19004a = c8509s;
        C8514x c8514x = new C8514x();
        this.f19006b = c8514x;
        InterfaceC8493c[] interfaceC8493cArr2 = new InterfaceC8493c[interfaceC8493cArr.length + 3];
        this.f19008c = interfaceC8493cArr2;
        interfaceC8493cArr2[0] = new C8512v();
        interfaceC8493cArr2[1] = c8509s;
        System.arraycopy(interfaceC8493cArr, 0, interfaceC8493cArr2, 2, interfaceC8493cArr.length);
        interfaceC8493cArr2[interfaceC8493cArr.length + 2] = c8514x;
        this.f19012f = new long[10];
        this.f18993P = 1.0f;
        this.f18989L = 0;
        this.f19020n = 3;
        this.f19003Z = 0;
        this.f19025s = C8712s.f20317d;
        this.f19000W = -1;
        this.f18994Q = new InterfaceC8493c[0];
        this.f18995R = new ByteBuffer[0];
        this.f19014h = new LinkedList();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x024c  */
    /* JADX INFO: renamed from: a */
    public final long m20991a(boolean z) {
        long j;
        long j2;
        long jM20984a;
        long jM21382a;
        long j3;
        if (!m21000d() || this.f18989L == 0) {
            return Long.MIN_VALUE;
        }
        long j4 = 1000000;
        if (this.f19015i.getPlayState() == 3) {
            C8501k c8501k = this.f19013g;
            long jM20984a2 = (c8501k.m20984a() * 1000000) / ((long) c8501k.f18964c);
            if (jM20984a2 == 0) {
                j = 1000000;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f18978A >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = this.f19012f;
                    int i = this.f19030x;
                    jArr[i] = jM20984a2 - jNanoTime;
                    this.f19030x = (i + 1) % 10;
                    int i2 = this.f19031y;
                    if (i2 < 10) {
                        this.f19031y = i2 + 1;
                    }
                    this.f18978A = jNanoTime;
                    this.f19032z = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f19031y;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f19032z = (this.f19012f[i3] / ((long) i4)) + this.f19032z;
                        i3++;
                        j4 = j4;
                    }
                }
                j = j4;
                if (!m21001e() && jNanoTime - this.f18980C >= 500000) {
                    boolean zMo20990e = this.f19013g.mo20990e();
                    this.f18979B = zMo20990e;
                    if (zMo20990e) {
                        j2 = 1000;
                        long jMo20988c = this.f19013g.mo20988c() / 1000;
                        j3 = 5000000;
                        long jMo20987b = this.f19013g.mo20987b();
                        if (jMo20988c < this.f18991N) {
                            this.f18979B = false;
                        } else if (Math.abs(jMo20988c - jNanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jMo20987b);
                            sb.append(", ");
                            sb.append(jMo20988c);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jM20984a2);
                            sb.append(", ");
                            sb.append(this.f19021o ? this.f18984G : this.f18983F / ((long) this.f18982E));
                            sb.append(", ");
                            sb.append(m20997b());
                            Log.w("AudioTrack", sb.toString());
                            this.f18979B = false;
                        } else if (Math.abs(((jMo20987b * j) / ((long) this.f19016j)) - jM20984a2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jMo20987b);
                            sb2.append(", ");
                            sb2.append(jMo20988c);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jM20984a2);
                            sb2.append(", ");
                            sb2.append(this.f19021o ? this.f18984G : this.f18983F / ((long) this.f18982E));
                            sb2.append(", ");
                            sb2.append(m20997b());
                            Log.w("AudioTrack", sb2.toString());
                            this.f18979B = false;
                        }
                    } else {
                        j2 = 1000;
                        j3 = 5000000;
                    }
                    Method method = this.f18981D;
                    if (method != null && !this.f19021o) {
                        try {
                            long jIntValue = (((long) ((Integer) method.invoke(this.f19015i, null)).intValue()) * j2) - this.f19023q;
                            this.f18992O = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f18992O = jMax;
                            if (jMax > j3) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f18992O);
                                this.f18992O = 0L;
                            }
                        } catch (Exception unused) {
                            this.f18981D = null;
                        }
                    }
                    this.f18980C = jNanoTime;
                }
            }
            j2 = 1000;
        } else {
            j = 1000000;
            j2 = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j2;
        if (this.f18979B) {
            jM20984a = ((this.f19013g.mo20987b() + (((jNanoTime2 - (this.f19013g.mo20988c() / j2)) * ((long) this.f19016j)) / j)) * j) / ((long) this.f19016j);
        } else {
            if (this.f19031y == 0) {
                C8501k c8501k2 = this.f19013g;
                jM20984a = (c8501k2.m20984a() * j) / ((long) c8501k2.f18964c);
            } else {
                jM20984a = jNanoTime2 + this.f19032z;
            }
            if (!z) {
                jM20984a -= this.f18992O;
            }
        }
        long j5 = this.f18990M;
        while (!this.f19014h.isEmpty() && jM20984a >= ((C8506p) this.f19014h.getFirst()).f18977c) {
            C8506p c8506p = (C8506p) this.f19014h.remove();
            this.f19025s = c8506p.f18975a;
            this.f19027u = c8506p.f18977c;
            this.f19026t = c8506p.f18976b - this.f18990M;
        }
        if (this.f19025s.f20318a == 1.0f) {
            jM21382a = (jM20984a + this.f19026t) - this.f19027u;
        } else if (this.f19014h.isEmpty()) {
            C8514x c8514x = this.f19006b;
            long j6 = c8514x.f19084k;
            if (j6 >= 1024) {
                jM21382a = AbstractC8827z.m21382a(jM20984a - this.f19027u, c8514x.f19083j, j6) + this.f19026t;
            } else {
                jM21382a = ((long) (((double) this.f19025s.f20318a) * (jM20984a - this.f19027u))) + this.f19026t;
            }
        } else {
            jM21382a = ((long) (((double) this.f19025s.f20318a) * (jM20984a - this.f19027u))) + this.f19026t;
        }
        return j5 + jM21382a;
    }

    /* JADX INFO: renamed from: a */
    public final C8712s m20992a(C8712s c8712s) {
        if (this.f19021o) {
            C8712s c8712s2 = C8712s.f20317d;
            this.f19025s = c8712s2;
            return c8712s2;
        }
        C8514x c8514x = this.f19006b;
        float f = c8712s.f20318a;
        c8514x.getClass();
        int i = AbstractC8827z.f20671a;
        float fMax = Math.max(0.1f, Math.min(f, 8.0f));
        c8514x.f19078e = fMax;
        C8514x c8514x2 = this.f19006b;
        float f2 = c8712s.f20319b;
        c8514x2.getClass();
        c8514x2.f19079f = Math.max(0.1f, Math.min(f2, 8.0f));
        C8712s c8712s3 = new C8712s(fMax, f2);
        C8712s c8712s4 = this.f19024r;
        if (c8712s4 == null) {
            c8712s4 = !this.f19014h.isEmpty() ? ((C8506p) this.f19014h.getLast()).f18975a : this.f19025s;
        }
        if (!c8712s3.equals(c8712s4)) {
            if (m21000d()) {
                this.f19024r = c8712s3;
            } else {
                this.f19025s = c8712s3;
            }
        }
        return this.f19025s;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX INFO: renamed from: a */
    public final void m20993a(int i, int i2, int i3, int[] iArr) throws C8503m {
        int i4;
        int i5;
        int i6 = AbstractC8827z.f20671a;
        if (i3 == Integer.MIN_VALUE) {
            i4 = i * 3;
        } else if (i3 == 1073741824) {
            i4 = i * 4;
        } else if (i3 == 2) {
            i4 = i * 2;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException();
            }
            i4 = i;
        }
        this.f18982E = i4;
        this.f19004a.f19035d = iArr;
        boolean zMo20978a = false;
        for (InterfaceC8493c interfaceC8493c : this.f19008c) {
            try {
                zMo20978a |= interfaceC8493c.mo20978a(i2, i, i3);
                if (interfaceC8493c.mo20981d()) {
                    i = interfaceC8493c.mo20982e();
                    i3 = 2;
                }
            } catch (C8492b e) {
                throw new C8503m(e);
            }
        }
        if (zMo20978a) {
            m21004h();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = AbstractC8515b.f19086a;
                break;
            default:
                throw new C8503m(AbstractC8673m.m21221a("Unsupported channel count: ", i));
        }
        int i8 = AbstractC8827z.f20671a;
        if (i8 > 23 || !"foster".equals(AbstractC8827z.f20672b) || !"NVIDIA".equals(AbstractC8827z.f20673c)) {
            i7 = i5;
        } else if (i != 3 && i != 5) {
            if (i != 7) {
                i7 = i5;
            } else {
                i7 = AbstractC8515b.f19086a;
            }
        }
        if (i8 <= 25) {
            "fugu".equals(AbstractC8827z.f20672b);
        }
        if (!zMo20978a && m21000d() && this.f19018l == i3 && this.f19016j == i2 && this.f19017k == i7) {
            return;
        }
        m21003g();
        this.f19018l = i3;
        this.f19021o = false;
        this.f19016j = i2;
        this.f19017k = i7;
        this.f19019m = 2;
        this.f18985H = i * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i7, 2);
        if (minBufferSize == -2) {
            throw new IllegalStateException();
        }
        int i9 = minBufferSize * 4;
        long j = this.f19016j;
        int i10 = this.f18985H;
        int i11 = ((int) ((250000 * j) / 1000000)) * i10;
        int iMax = (int) Math.max(minBufferSize, ((j * 750000) / 1000000) * ((long) i10));
        if (i9 < i11) {
            i9 = i11;
        } else if (i9 > iMax) {
            i9 = iMax;
        }
        this.f19022p = i9;
        this.f19023q = (((long) (i9 / this.f18985H)) * 1000000) / ((long) this.f19016j);
        m20992a(this.f19025s);
    }

    /* JADX INFO: renamed from: a */
    public final void m20994a(long j) throws C8507q {
        ByteBuffer byteBuffer;
        int length = this.f18994Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f18995R[i - 1];
            } else {
                byteBuffer = this.f18996S;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC8493c.f18943a;
                }
            }
            if (i == length) {
                m20998b(byteBuffer, j);
            } else {
                InterfaceC8493c interfaceC8493c = this.f18994Q[i];
                interfaceC8493c.mo20977a(byteBuffer);
                ByteBuffer byteBufferMo20976a = interfaceC8493c.mo20976a();
                this.f18995R[i] = byteBufferMo20976a;
                if (byteBufferMo20976a.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m20995a() {
        /*
            r9 = this;
            int r0 = r9.f19000W
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f19021o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.f18994Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.f19000W = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.f19000W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.f18994Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.mo20979b()
        L28:
            r9.m20994a(r7)
            boolean r0 = r4.mo20980c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.f19000W
            int r0 = r0 + r1
            r9.f19000W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.f18997T
            if (r0 == 0) goto L44
            r9.m20998b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f18997T
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.f19000W = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C8508r.m20995a():boolean");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20996a(ByteBuffer byteBuffer, long j) throws C8507q, C8504n {
        int i;
        ByteBuffer byteBuffer2 = this.f18996S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!m21000d()) {
            this.f19011e.block();
            if (this.f19005a0) {
                this.f19015i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f19017k).setEncoding(this.f19019m).setSampleRate(this.f19016j).build(), this.f19022p, 1, this.f19003Z);
            } else if (this.f19003Z == 0) {
                this.f19015i = new AudioTrack(this.f19020n, this.f19016j, this.f19017k, this.f19019m, this.f19022p, 1);
            } else {
                this.f19015i = new AudioTrack(this.f19020n, this.f19016j, this.f19017k, this.f19019m, this.f19022p, 1, this.f19003Z);
            }
            int state = this.f19015i.getState();
            if (state != 1) {
                try {
                    this.f19015i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f19015i = null;
                    throw th;
                }
                this.f19015i = null;
                throw new C8504n(state, this.f19016j, this.f19017k, this.f19022p);
            }
            int audioSessionId = this.f19015i.getAudioSessionId();
            if (this.f19003Z != audioSessionId) {
                this.f19003Z = audioSessionId;
                C8511u c8511u = (C8511u) this.f19010d;
                c8511u.f19044a.f18930P.audioSessionId(audioSessionId);
                c8511u.f19044a.getClass();
            }
            this.f19013g.mo20986a(this.f19015i, m21001e());
            m21005i();
            this.f19007b0 = false;
            if (this.f19002Y) {
                m21002f();
            }
        }
        if (m21001e()) {
            if (this.f19015i.getPlayState() == 2) {
                this.f19007b0 = false;
                return false;
            }
            if (this.f19015i.getPlayState() == 1 && this.f19013g.m20984a() != 0) {
                return false;
            }
        }
        boolean z = this.f19007b0;
        boolean zM20999c = m20999c();
        this.f19007b0 = zM20999c;
        if (z && !zM20999c && this.f19015i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f19009c0;
            C8511u c8511u2 = (C8511u) this.f19010d;
            c8511u2.f19044a.f18930P.audioTrackUnderrun(this.f19022p, AbstractC8515b.m21012a(this.f19023q), jElapsedRealtime);
            c8511u2.f19044a.getClass();
        }
        if (this.f18996S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f19021o && this.f18988K == 0) {
                int i2 = this.f19019m;
                if (i2 == 7 || i2 == 8) {
                    int iPosition = byteBuffer.position();
                    i = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i2 == 5) {
                    i = 1536;
                } else {
                    if (i2 != 6) {
                        throw new IllegalStateException(AbstractC8673m.m21221a("Unexpected audio encoding: ", i2));
                    }
                    i = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? AbstractC8491a.f18937a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                }
                this.f18988K = i;
            }
            if (this.f19024r != null) {
                if (!m20995a()) {
                    return false;
                }
                this.f19014h.add(new C8506p(this.f19024r, Math.max(0L, j), (m20997b() * 1000000) / ((long) this.f19016j)));
                this.f19024r = null;
                m21004h();
            }
            int i3 = this.f18989L;
            if (i3 == 0) {
                this.f18990M = Math.max(0L, j);
                this.f18989L = 1;
            } else {
                long j2 = (((this.f19021o ? this.f18984G : this.f18983F / ((long) this.f18982E)) * 1000000) / ((long) this.f19016j)) + this.f18990M;
                if (i3 == 1 && Math.abs(j2 - j) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j2 + ", got " + j + C11744X3.j.f26440e);
                    this.f18989L = 2;
                }
                if (this.f18989L == 2) {
                    this.f18990M = (j - j2) + this.f18990M;
                    this.f18989L = 1;
                    C8511u c8511u3 = (C8511u) this.f19010d;
                    c8511u3.f19044a.getClass();
                    c8511u3.f19044a.f18936V = true;
                }
            }
            if (this.f19021o) {
                this.f18984G += (long) this.f18988K;
            } else {
                this.f18983F += (long) byteBuffer.remaining();
            }
            this.f18996S = byteBuffer;
        }
        if (this.f19021o) {
            m20998b(this.f18996S, j);
        } else {
            m20994a(j);
        }
        if (this.f18996S.hasRemaining()) {
            return false;
        }
        this.f18996S = null;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m20997b() {
        return this.f19021o ? this.f18987J : this.f18986I / ((long) this.f18985H);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX INFO: renamed from: b */
    public final void m20998b(ByteBuffer byteBuffer, long j) throws C8507q {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f18997T;
            int iWrite2 = 0;
            if (byteBuffer2 == null) {
                this.f18997T = byteBuffer;
                if (AbstractC8827z.f20671a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f18998U;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f18998U = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f18998U, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f18999V = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int iRemaining2 = byteBuffer.remaining();
            if (AbstractC8827z.f20671a < 21) {
                int iM20984a = this.f19022p - ((int) (this.f18986I - (this.f19013g.m20984a() * ((long) this.f18985H))));
                if (iM20984a > 0) {
                    iWrite2 = this.f19015i.write(this.f18998U, this.f18999V, Math.min(iRemaining2, iM20984a));
                    if (iWrite2 > 0) {
                        this.f18999V += iWrite2;
                        byteBuffer.position(byteBuffer.position() + iWrite2);
                    }
                }
            } else if (!this.f19005a0) {
                iWrite2 = this.f19015i.write(byteBuffer, iRemaining2, 1);
            } else {
                if (j == -9223372036854775807L) {
                    throw new IllegalStateException();
                }
                AudioTrack audioTrack = this.f19015i;
                if (this.f19028v == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f19028v = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f19028v.putInt(1431633921);
                }
                if (this.f19029w == 0) {
                    this.f19028v.putInt(4, iRemaining2);
                    this.f19028v.putLong(8, j * 1000);
                    this.f19028v.position(0);
                    this.f19029w = iRemaining2;
                }
                int iRemaining3 = this.f19028v.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.f19029w = 0;
                    } else {
                        this.f19029w -= iWrite;
                    }
                    iWrite2 = iWrite;
                } else {
                    int iWrite3 = audioTrack.write(this.f19028v, iRemaining3, 1);
                    if (iWrite3 < 0) {
                        this.f19029w = 0;
                        iWrite2 = iWrite3;
                    } else if (iWrite3 >= iRemaining3) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f19029w = 0;
                        } else {
                            this.f19029w -= iWrite;
                        }
                        iWrite2 = iWrite;
                    }
                }
            }
            this.f19009c0 = SystemClock.elapsedRealtime();
            if (iWrite2 < 0) {
                throw new C8507q(iWrite2);
            }
            boolean z = this.f19021o;
            if (!z) {
                this.f18986I += (long) iWrite2;
            }
            if (iWrite2 == iRemaining2) {
                if (z) {
                    this.f18987J += (long) this.f18988K;
                }
                this.f18997T = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20999c() {
        if (!m21000d()) {
            return false;
        }
        if (m20997b() <= this.f19013g.m20984a()) {
            return m21001e() && this.f19015i.getPlayState() == 2 && this.f19015i.getPlaybackHeadPosition() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21000d() {
        return this.f19015i != null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21001e() {
        if (AbstractC8827z.f20671a >= 23) {
            return false;
        }
        int i = this.f19019m;
        return i == 5 || i == 6;
    }

    /* JADX INFO: renamed from: f */
    public final void m21002f() {
        this.f19002Y = true;
        if (m21000d()) {
            this.f18991N = System.nanoTime() / 1000;
            this.f19015i.play();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21003g() {
        if (m21000d()) {
            this.f18983F = 0L;
            this.f18984G = 0L;
            this.f18986I = 0L;
            this.f18987J = 0L;
            this.f18988K = 0;
            C8712s c8712s = this.f19024r;
            if (c8712s != null) {
                this.f19025s = c8712s;
                this.f19024r = null;
            } else if (!this.f19014h.isEmpty()) {
                this.f19025s = ((C8506p) this.f19014h.getLast()).f18975a;
            }
            this.f19014h.clear();
            this.f19026t = 0L;
            this.f19027u = 0L;
            this.f18996S = null;
            this.f18997T = null;
            int i = 0;
            while (true) {
                InterfaceC8493c[] interfaceC8493cArr = this.f18994Q;
                if (i >= interfaceC8493cArr.length) {
                    break;
                }
                InterfaceC8493c interfaceC8493c = interfaceC8493cArr[i];
                interfaceC8493c.flush();
                this.f18995R[i] = interfaceC8493c.mo20976a();
                i++;
            }
            this.f19001X = false;
            this.f19000W = -1;
            this.f19028v = null;
            this.f19029w = 0;
            this.f18989L = 0;
            this.f18992O = 0L;
            this.f19032z = 0L;
            this.f19031y = 0;
            this.f19030x = 0;
            this.f18978A = 0L;
            this.f18979B = false;
            this.f18980C = 0L;
            if (this.f19015i.getPlayState() == 3) {
                this.f19015i.pause();
            }
            AudioTrack audioTrack = this.f19015i;
            this.f19015i = null;
            this.f19013g.mo20986a(null, false);
            this.f19011e.close();
            new C8500j(this, audioTrack).start();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m21004h() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8493c interfaceC8493c : this.f19008c) {
            if (interfaceC8493c.mo20981d()) {
                arrayList.add(interfaceC8493c);
            } else {
                interfaceC8493c.flush();
            }
        }
        int size = arrayList.size();
        this.f18994Q = (InterfaceC8493c[]) arrayList.toArray(new InterfaceC8493c[size]);
        this.f18995R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            InterfaceC8493c interfaceC8493c2 = this.f18994Q[i];
            interfaceC8493c2.flush();
            this.f18995R[i] = interfaceC8493c2.mo20976a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m21005i() {
        if (m21000d()) {
            if (AbstractC8827z.f20671a >= 21) {
                this.f19015i.setVolume(this.f18993P);
                return;
            }
            AudioTrack audioTrack = this.f19015i;
            float f = this.f18993P;
            audioTrack.setStereoVolume(f, f);
        }
    }
}
