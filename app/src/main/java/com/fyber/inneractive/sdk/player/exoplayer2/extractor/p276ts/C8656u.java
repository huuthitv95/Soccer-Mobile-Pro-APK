package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C8656u implements InterfaceC8567i {

    /* JADX INFO: renamed from: d */
    public boolean f20093d;

    /* JADX INFO: renamed from: e */
    public boolean f20094e;

    /* JADX INFO: renamed from: f */
    public boolean f20095f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8568j f20096g;

    /* JADX INFO: renamed from: a */
    public final C8823v f20090a = new C8823v(0);

    /* JADX INFO: renamed from: c */
    public final C8815n f20092c = new C8815n(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f20091b = new SparseArray();

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, EOFException {
        InterfaceC8643h c8652q;
        if (!c8527b.m21025a(this.f20092c.f20643a, 0, 4, true)) {
            return -1;
        }
        this.f20092c.m21347e(0);
        int iM21340b = this.f20092c.m21340b();
        if (iM21340b == 441) {
            return -1;
        }
        if (iM21340b == 442) {
            c8527b.m21025a(this.f20092c.f20643a, 0, 10, false);
            this.f20092c.m21347e(9);
            c8527b.m21023a((this.f20092c.m21352j() & 7) + 14);
            return 0;
        }
        if (iM21340b == 443) {
            c8527b.m21025a(this.f20092c.f20643a, 0, 2, false);
            this.f20092c.m21347e(0);
            c8527b.m21023a(this.f20092c.m21357o() + 6);
            return 0;
        }
        if (((iM21340b & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            c8527b.m21023a(1);
            return 0;
        }
        int i = iM21340b & 255;
        C8655t c8655t = (C8655t) this.f20091b.get(i);
        if (!this.f20093d) {
            if (c8655t == null) {
                boolean z = this.f20094e;
                InterfaceC8643h c8645j = null;
                if (z || i != 189) {
                    if (!z && (iM21340b & 224) == 192) {
                        c8652q = new C8652q(null);
                        this.f20094e = true;
                    } else if (!this.f20095f && (iM21340b & 240) == 224) {
                        c8645j = new C8645j();
                        this.f20095f = true;
                    }
                    if (c8645j != null) {
                        c8645j.mo21166a(this.f20096g, new C8639e0(Integer.MIN_VALUE, i, 256));
                        C8655t c8655t2 = new C8655t(c8645j, this.f20090a);
                        this.f20091b.put(i, c8655t2);
                        c8655t = c8655t2;
                    }
                } else {
                    c8652q = new C8632b(null);
                    this.f20094e = true;
                }
                c8645j = c8652q;
                if (c8645j != null) {
                    c8645j.mo21166a(this.f20096g, new C8639e0(Integer.MIN_VALUE, i, 256));
                    C8655t c8655t3 = new C8655t(c8645j, this.f20090a);
                    this.f20091b.put(i, c8655t3);
                    c8655t = c8655t3;
                }
            }
            if ((this.f20094e && this.f20095f) || c8527b.f19124c > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                this.f20093d = true;
                this.f20096g.mo21096b();
            }
        }
        c8527b.m21025a(this.f20092c.f20643a, 0, 2, false);
        this.f20092c.m21347e(0);
        int iM21357o = this.f20092c.m21357o() + 6;
        if (c8655t == null) {
            c8527b.m21023a(iM21357o);
        } else {
            this.f20092c.m21343c(iM21357o);
            c8527b.m21027b(this.f20092c.f20643a, 0, iM21357o, false);
            this.f20092c.m21347e(6);
            C8815n c8815n = this.f20092c;
            c8815n.m21339a(c8655t.f20085c.f20639a, 0, 3);
            c8655t.f20085c.m21334b(0);
            c8655t.f20085c.m21336c(8);
            c8655t.f20086d = c8655t.f20085c.m21335b();
            c8655t.f20087e = c8655t.f20085c.m21335b();
            c8655t.f20085c.m21336c(6);
            c8815n.m21339a(c8655t.f20085c.f20639a, 0, c8655t.f20085c.m21332a(8));
            c8655t.f20085c.m21334b(0);
            c8655t.f20089g = 0L;
            if (c8655t.f20086d) {
                c8655t.f20085c.m21336c(4);
                long jM21332a = ((long) c8655t.f20085c.m21332a(3)) << 30;
                c8655t.f20085c.m21336c(1);
                long jM21332a2 = jM21332a | ((long) (c8655t.f20085c.m21332a(15) << 15));
                c8655t.f20085c.m21336c(1);
                long jM21332a3 = jM21332a2 | ((long) c8655t.f20085c.m21332a(15));
                c8655t.f20085c.m21336c(1);
                if (!c8655t.f20088f && c8655t.f20087e) {
                    c8655t.f20085c.m21336c(4);
                    long jM21332a4 = ((long) c8655t.f20085c.m21332a(3)) << 30;
                    c8655t.f20085c.m21336c(1);
                    long jM21332a5 = jM21332a4 | ((long) (c8655t.f20085c.m21332a(15) << 15));
                    c8655t.f20085c.m21336c(1);
                    long jM21332a6 = jM21332a5 | ((long) c8655t.f20085c.m21332a(15));
                    c8655t.f20085c.m21336c(1);
                    c8655t.f20084b.m21371b(jM21332a6);
                    c8655t.f20088f = true;
                }
                c8655t.f20089g = c8655t.f20084b.m21371b(jM21332a3);
            }
            c8655t.f20083a.mo21168a(true, c8655t.f20089g);
            c8655t.f20083a.mo21167a(c8815n);
            c8655t.f20083a.mo21169b();
            C8815n c8815n2 = this.f20092c;
            c8815n2.m21345d(c8815n2.m21337a());
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f20090a.f20669c = -9223372036854775807L;
        for (int i = 0; i < this.f20091b.size(); i++) {
            C8655t c8655t = (C8655t) this.f20091b.valueAt(i);
            c8655t.f20088f = false;
            c8655t.f20083a.mo21165a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f20096g = interfaceC8568j;
        interfaceC8568j.mo21093a(new C8627p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        byte[] bArr = new byte[14];
        c8527b.m21025a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c8527b.m21024a(bArr[13] & 7, false);
        c8527b.m21025a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
