package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8672l;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8545f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8546g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8548i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8549j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C8553n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8739x;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8735t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8715b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8716c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8719d;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8761b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8778d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8797v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.HandlerC8800y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8825x;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8563h implements InterfaceC8799x, Runnable {

    /* JADX INFO: renamed from: a */
    public final C8556a f19358a;

    /* JADX INFO: renamed from: b */
    public final C8761b0 f19359b = new C8761b0("HlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c */
    public final C8778d0 f19360c;

    /* JADX INFO: renamed from: d */
    public C8559d f19361d;

    /* JADX INFO: renamed from: e */
    public long f19362e;

    /* JADX INFO: renamed from: f */
    public long f19363f;

    /* JADX INFO: renamed from: g */
    public long f19364g;

    /* JADX INFO: renamed from: h */
    public long f19365h;

    /* JADX INFO: renamed from: i */
    public boolean f19366i;

    /* JADX INFO: renamed from: j */
    public IOException f19367j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C8566k f19368k;

    public RunnableC8563h(C8566k c8566k, C8556a c8556a, long j) {
        this.f19368k = c8566k;
        this.f19358a = c8556a;
        this.f19364g = j;
        this.f19360c = new C8778d0(c8566k.f19369a.f19194a.mo20831a(), AbstractC8825x.m21375a(c8566k.f19378j.f19332a, c8556a.f19302a), c8566k.f19370b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final int mo21091a(InterfaceC8801z interfaceC8801z, long j, long j2, IOException iOException) {
        int i;
        IOException iOException2 = iOException;
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        boolean z = iOException2 instanceof C8711r;
        C8721f c8721f = this.f19368k.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            iOException2 = iOException;
            c8721f.f20350a.post(new RunnableC8719d(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z));
        }
        if (z) {
            return 3;
        }
        if ((iOException2 instanceof C8797v) && ((i = ((C8797v) iOException2).f20597a) == 404 || i == 410)) {
            m21105a();
            C8566k c8566k = this.f19368k;
            if (c8566k.f19379k != this.f19358a) {
                return 2;
            }
            List list = c8566k.f19378j.f19304b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i2 = 0; i2 < size; i2++) {
                RunnableC8563h runnableC8563h = (RunnableC8563h) c8566k.f19372d.get(list.get(i2));
                if (jElapsedRealtime > runnableC8563h.f19365h) {
                    c8566k.f19379k = runnableC8563h.f19358a;
                    runnableC8563h.m21107b();
                    return 2;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m21105a() {
        this.f19365h = SystemClock.elapsedRealtime() + 60000;
        C8566k c8566k = this.f19368k;
        C8556a c8556a = this.f19358a;
        int size = c8566k.f19375g.size();
        for (int i = 0; i < size; i++) {
            C8548i c8548i = (C8548i) c8566k.f19375g.get(i);
            for (C8553n c8553n : c8548i.f19257n) {
                C8545f c8545f = c8553n.f19270c;
                int iM21279a = c8545f.f19209f.m21279a(c8556a.f19303b);
                if (iM21279a != -1) {
                    AbstractC8748b abstractC8748b = c8545f.f19219p;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= abstractC8748b.f20435b) {
                            i2 = -1;
                            break;
                        } else if (abstractC8748b.f20436c[i2] == iM21279a) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        c8545f.f19219p.m21282a(i2);
                    }
                }
            }
            if (c8548i.f19256m != null) {
                C8672l c8672l = (C8672l) c8548i.f19253j;
                c8672l.getClass();
                c8672l.f20182f.obtainMessage(9, c8548i).sendToTarget();
            } else {
                for (C8553n c8553n2 : c8548i.f19257n) {
                    if (!c8553n2.f19282o) {
                        c8553n2.mo21075b(c8553n2.f19290w);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:108:0x0217  */
    /* JADX WARN: Code duplicated, block: B:110:0x021b  */
    /* JADX WARN: Code duplicated, block: B:112:0x022d  */
    /* JADX WARN: Code duplicated, block: B:113:0x023c  */
    /* JADX WARN: Code duplicated, block: B:115:0x024b  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0263  */
    /* JADX WARN: Code duplicated, block: B:126:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX INFO: renamed from: a */
    public final void m21106a(C8559d c8559d) {
        long j;
        long j2;
        long j3;
        int i;
        C8559d c8559d2;
        long j4;
        C8566k c8566k;
        C8556a c8556a;
        int i2;
        int size;
        int i3;
        C8548i c8548i;
        C8553n[] c8553nArr;
        int length;
        int i4;
        C8553n c8553n;
        C8549j c8549j;
        long j5;
        long j6;
        C8739x c8739x;
        long j7;
        List list;
        long j8;
        int size2;
        int size3;
        C8559d c8559d3 = this.f19361d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f19362e = jElapsedRealtime;
        C8566k c8566k2 = this.f19368k;
        c8566k2.getClass();
        if (c8559d3 != null) {
            int i5 = c8559d.f19323g;
            int i6 = c8559d3.f19323g;
            if (i5 <= i6 && (i5 < i6 || ((size2 = c8559d.f19329m.size()) <= (size3 = c8559d3.f19329m.size()) && (size2 != size3 || !c8559d.f19326j || c8559d3.f19326j)))) {
                c8559d2 = (!c8559d.f19326j || c8559d3.f19326j) ? c8559d3 : new C8559d(c8559d3.f19318b, c8559d3.f19332a, c8559d3.f19319c, c8559d3.f19320d, c8559d3.f19321e, c8559d3.f19322f, c8559d3.f19323g, c8559d3.f19324h, c8559d3.f19325i, true, c8559d3.f19327k, c8559d3.f19328l, c8559d3.f19329m, c8559d3.f19330n);
            }
            this.f19361d = c8559d2;
            if (c8559d2 != c8559d3) {
                this.f19367j = null;
                this.f19363f = jElapsedRealtime;
                c8566k = this.f19368k;
                c8556a = this.f19358a;
                if (c8556a == c8566k.f19379k) {
                    if (c8566k.f19380l == null) {
                        c8566k.f19381m = !c8559d2.f19326j;
                    }
                    c8566k.f19380l = c8559d2;
                    c8549j = c8566k.f19374f;
                    c8549j.getClass();
                    j5 = c8559d2.f19319c;
                    if (c8549j.f19263d.f19381m) {
                        if (c8559d2.f19326j) {
                            j7 = c8559d2.f19320d + c8559d2.f19331o;
                        } else {
                            j7 = -9223372036854775807L;
                        }
                        list = c8559d2.f19329m;
                        if (j5 == -9223372036854775807L) {
                            if (list.isEmpty()) {
                                i2 = 0;
                                j8 = 0;
                            } else {
                                i2 = 0;
                                j5 = ((C8558c) list.get(Math.max(0, list.size() - 3))).f19312d;
                            }
                            c8739x = new C8739x(j7, c8559d2.f19331o, c8559d2.f19320d, j8, true, !c8559d2.f19326j);
                        } else {
                            i2 = 0;
                        }
                        j8 = j5;
                        c8739x = new C8739x(j7, c8559d2.f19331o, c8559d2.f19320d, j8, true, !c8559d2.f19326j);
                    } else {
                        i2 = 0;
                        if (j5 == -9223372036854775807L) {
                            j6 = 0;
                        } else {
                            j6 = j5;
                        }
                        long j9 = c8559d2.f19320d;
                        long j10 = c8559d2.f19331o;
                        c8739x = new C8739x(j9 + j10, j10, j9, j6, true, false);
                    }
                    InterfaceC8735t interfaceC8735t = c8549j.f19264e;
                    C8557b c8557b = c8549j.f19263d.f19378j;
                    interfaceC8735t.mo21207a(c8739x, new C8546g());
                } else {
                    i2 = 0;
                }
                size = c8566k.f19375g.size();
                for (i3 = i2; i3 < size; i3++) {
                    c8548i = (C8548i) c8566k.f19375g.get(i3);
                    if (c8548i.f19256m != null) {
                        C8672l c8672l = (C8672l) c8548i.f19253j;
                        c8672l.getClass();
                        c8672l.f20182f.obtainMessage(9, c8548i).sendToTarget();
                    } else {
                        c8553nArr = c8548i.f19257n;
                        length = c8553nArr.length;
                        for (i4 = i2; i4 < length; i4++) {
                            c8553n = c8553nArr[i4];
                            if (!c8553n.f19282o) {
                                c8553n.mo21075b(c8553n.f19290w);
                            }
                        }
                    }
                }
                if (c8556a == c8566k.f19379k || c8559d2.f19326j) {
                    j4 = -9223372036854775807L;
                } else {
                    j4 = this.f19361d.f19325i;
                }
            } else if (c8559d2.f19326j) {
                j4 = -9223372036854775807L;
            } else {
                if (jElapsedRealtime - this.f19363f > AbstractC8515b.m21012a(c8559d2.f19325i) * 3.5d) {
                    String str = this.f19358a.f19302a;
                    this.f19367j = new C8565j();
                    m21105a();
                } else if (c8559d.f19329m.size() + c8559d.f19323g < this.f19361d.f19323g) {
                    String str2 = this.f19358a.f19302a;
                    this.f19367j = new C8564i();
                }
                j4 = this.f19361d.f19325i / 2;
            }
            if (j4 != -9223372036854775807L) {
                this.f19366i = this.f19368k.f19373e.postDelayed(this, AbstractC8515b.m21012a(j4));
            }
        }
        c8559d.getClass();
        if (c8559d.f19327k) {
            j = c8559d.f19320d;
        } else {
            C8559d c8559d4 = c8566k2.f19380l;
            j = c8559d4 != null ? c8559d4.f19320d : 0L;
            if (c8559d3 != null) {
                int size4 = c8559d3.f19329m.size();
                int i7 = c8559d.f19323g - c8559d3.f19323g;
                List list2 = c8559d3.f19329m;
                C8558c c8558c = i7 < list2.size() ? (C8558c) list2.get(i7) : null;
                if (c8558c != null) {
                    j2 = c8559d3.f19320d;
                    j3 = c8558c.f19312d;
                } else if (size4 == c8559d.f19323g - c8559d3.f19323g) {
                    j2 = c8559d3.f19320d;
                    j3 = c8559d3.f19331o;
                }
                j = j2 + j3;
            }
        }
        long j11 = j;
        if (c8559d.f19321e) {
            i = c8559d.f19322f;
        } else {
            C8559d c8559d5 = c8566k2.f19380l;
            i = c8559d5 != null ? c8559d5.f19322f : 0;
            if (c8559d3 != null) {
                int i8 = c8559d.f19323g - c8559d3.f19323g;
                List list3 = c8559d3.f19329m;
                C8558c c8558c2 = i8 < list3.size() ? (C8558c) list3.get(i8) : null;
                if (c8558c2 != null) {
                    i = (c8559d3.f19322f + c8558c2.f19311c) - ((C8558c) c8559d.f19329m.get(0)).f19311c;
                }
            }
        }
        c8559d2 = new C8559d(c8559d.f19318b, c8559d.f19332a, c8559d.f19319c, j11, true, i, c8559d.f19323g, c8559d.f19324h, c8559d.f19325i, c8559d.f19326j, c8559d.f19327k, c8559d.f19328l, c8559d.f19329m, c8559d.f19330n);
        this.f19361d = c8559d2;
        if (c8559d2 != c8559d3) {
            this.f19367j = null;
            this.f19363f = jElapsedRealtime;
            c8566k = this.f19368k;
            c8556a = this.f19358a;
            if (c8556a == c8566k.f19379k) {
                if (c8566k.f19380l == null) {
                    c8566k.f19381m = !c8559d2.f19326j;
                }
                c8566k.f19380l = c8559d2;
                c8549j = c8566k.f19374f;
                c8549j.getClass();
                j5 = c8559d2.f19319c;
                if (c8549j.f19263d.f19381m) {
                    if (c8559d2.f19326j) {
                        j7 = c8559d2.f19320d + c8559d2.f19331o;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    list = c8559d2.f19329m;
                    if (j5 == -9223372036854775807L) {
                        if (list.isEmpty()) {
                            i2 = 0;
                            j8 = 0;
                        } else {
                            i2 = 0;
                            j5 = ((C8558c) list.get(Math.max(0, list.size() - 3))).f19312d;
                        }
                        c8739x = new C8739x(j7, c8559d2.f19331o, c8559d2.f19320d, j8, true, !c8559d2.f19326j);
                    } else {
                        i2 = 0;
                    }
                    j8 = j5;
                    c8739x = new C8739x(j7, c8559d2.f19331o, c8559d2.f19320d, j8, true, !c8559d2.f19326j);
                } else {
                    i2 = 0;
                    if (j5 == -9223372036854775807L) {
                        j6 = 0;
                    } else {
                        j6 = j5;
                    }
                    long j12 = c8559d2.f19320d;
                    long j13 = c8559d2.f19331o;
                    c8739x = new C8739x(j12 + j13, j13, j12, j6, true, false);
                }
                InterfaceC8735t interfaceC8735t2 = c8549j.f19264e;
                C8557b c8557b2 = c8549j.f19263d.f19378j;
                interfaceC8735t2.mo21207a(c8739x, new C8546g());
            } else {
                i2 = 0;
            }
            size = c8566k.f19375g.size();
            while (i3 < size) {
                c8548i = (C8548i) c8566k.f19375g.get(i3);
                if (c8548i.f19256m != null) {
                    C8672l c8672l2 = (C8672l) c8548i.f19253j;
                    c8672l2.getClass();
                    c8672l2.f20182f.obtainMessage(9, c8548i).sendToTarget();
                } else {
                    c8553nArr = c8548i.f19257n;
                    length = c8553nArr.length;
                    while (i4 < length) {
                        c8553n = c8553nArr[i4];
                        if (!c8553n.f19282o) {
                            c8553n.mo21075b(c8553n.f19290w);
                        }
                    }
                }
            }
            if (c8556a == c8566k.f19379k) {
                j4 = -9223372036854775807L;
            } else {
                j4 = -9223372036854775807L;
            }
        } else if (c8559d2.f19326j) {
            if (jElapsedRealtime - this.f19363f > AbstractC8515b.m21012a(c8559d2.f19325i) * 3.5d) {
                String str3 = this.f19358a.f19302a;
                this.f19367j = new C8565j();
                m21105a();
            } else if (c8559d.f19329m.size() + c8559d.f19323g < this.f19361d.f19323g) {
                String str4 = this.f19358a.f19302a;
                this.f19367j = new C8564i();
            }
            j4 = this.f19361d.f19325i / 2;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            this.f19366i = this.f19368k.f19373e.postDelayed(this, AbstractC8515b.m21012a(j4));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21094a(InterfaceC8801z interfaceC8801z, long j, long j2) {
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        AbstractC8560e abstractC8560e = c8778d0.f20526d;
        if (!(abstractC8560e instanceof C8559d)) {
            this.f19367j = new C8711r("Loaded playlist has unexpected type.");
            return;
        }
        m21106a((C8559d) abstractC8560e);
        C8721f c8721f = this.f19368k.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8715b(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21095a(InterfaceC8801z interfaceC8801z, long j, long j2, boolean z) {
        C8778d0 c8778d0 = (C8778d0) interfaceC8801z;
        C8721f c8721f = this.f19368k.f19377i;
        C8786k c8786k = c8778d0.f20523a;
        long j3 = c8778d0.f20528f;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8716c(c8721f, c8786k, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21107b() {
        this.f19365h = 0L;
        if (this.f19366i || this.f19359b.m21287a()) {
            return;
        }
        C8761b0 c8761b0 = this.f19359b;
        C8778d0 c8778d0 = this.f19360c;
        int i = this.f19368k.f19371c;
        c8761b0.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        HandlerC8800y handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, c8778d0, this, i, SystemClock.elapsedRealtime());
        if (c8761b0.f20453b != null) {
            throw new IllegalStateException();
        }
        c8761b0.f20453b = handlerC8800y;
        handlerC8800y.f20604e = null;
        c8761b0.f20452a.execute(handlerC8800y);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19366i = false;
        m21107b();
    }
}
