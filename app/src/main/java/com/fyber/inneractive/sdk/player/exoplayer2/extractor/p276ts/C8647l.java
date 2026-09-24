package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8811j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8812k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8816o;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8647l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8629r f19989a;

    /* JADX INFO: renamed from: b */
    public final boolean f19990b;

    /* JADX INFO: renamed from: c */
    public final boolean f19991c;

    /* JADX INFO: renamed from: f */
    public final C8816o f19994f;

    /* JADX INFO: renamed from: g */
    public byte[] f19995g;

    /* JADX INFO: renamed from: h */
    public int f19996h;

    /* JADX INFO: renamed from: i */
    public int f19997i;

    /* JADX INFO: renamed from: j */
    public long f19998j;

    /* JADX INFO: renamed from: l */
    public long f20000l;

    /* JADX INFO: renamed from: p */
    public long f20004p;

    /* JADX INFO: renamed from: q */
    public long f20005q;

    /* JADX INFO: renamed from: r */
    public boolean f20006r;

    /* JADX INFO: renamed from: d */
    public final SparseArray f19992d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f19993e = new SparseArray();

    /* JADX INFO: renamed from: m */
    public C8646k f20001m = new C8646k();

    /* JADX INFO: renamed from: n */
    public C8646k f20002n = new C8646k();

    /* JADX INFO: renamed from: k */
    public boolean f19999k = false;

    /* JADX INFO: renamed from: o */
    public boolean f20003o = false;

    public C8647l(InterfaceC8629r interfaceC8629r, boolean z, boolean z2) {
        this.f19989a = interfaceC8629r;
        this.f19990b = z;
        this.f19991c = z2;
        byte[] bArr = new byte[128];
        this.f19995g = bArr;
        this.f19994f = new C8816o(bArr, 0, 0);
        C8646k c8646k = this.f20002n;
        c8646k.f19974b = false;
        c8646k.f19973a = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX INFO: renamed from: a */
    public final void m21179a(byte[] bArr, int i, int i2) {
        boolean zM21362c;
        boolean zM21362c2;
        boolean z;
        boolean z2;
        int iM21364d;
        int i3;
        int iM21366e;
        int iM21366e2;
        int i4;
        int iM21360b;
        if (this.f19999k) {
            int i5 = i2 - i;
            byte[] bArr2 = this.f19995g;
            int length = bArr2.length;
            int i6 = this.f19996h + i5;
            if (length < i6) {
                this.f19995g = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i, this.f19995g, this.f19996h, i5);
            int i7 = this.f19996h + i5;
            this.f19996h = i7;
            C8816o c8816o = this.f19994f;
            c8816o.f20646a = this.f19995g;
            int i8 = 0;
            c8816o.f20648c = 0;
            c8816o.f20647b = i7;
            c8816o.f20649d = 0;
            c8816o.m21358a();
            if (this.f19994f.m21359a(8)) {
                this.f19994f.m21367f();
                int iM21360b2 = this.f19994f.m21360b(2);
                this.f19994f.m21365d(5);
                if (this.f19994f.m21361b()) {
                    this.f19994f.m21364d();
                    if (this.f19994f.m21361b()) {
                        int iM21364d2 = this.f19994f.m21364d();
                        if (!this.f19991c) {
                            this.f19999k = false;
                            C8646k c8646k = this.f20002n;
                            c8646k.f19977e = iM21364d2;
                            c8646k.f19974b = true;
                            return;
                        }
                        if (this.f19994f.m21361b()) {
                            int iM21364d3 = this.f19994f.m21364d();
                            if (this.f19993e.indexOfKey(iM21364d3) < 0) {
                                this.f19999k = false;
                                return;
                            }
                            C8811j c8811j = (C8811j) this.f19993e.get(iM21364d3);
                            C8812k c8812k = (C8812k) this.f19992d.get(c8811j.f20623a);
                            if (c8812k.f20629e) {
                                if (!this.f19994f.m21359a(2)) {
                                    return;
                                } else {
                                    this.f19994f.m21365d(2);
                                }
                            }
                            if (this.f19994f.m21359a(c8812k.f20631g)) {
                                int iM21360b3 = this.f19994f.m21360b(c8812k.f20631g);
                                if (!c8812k.f20630f) {
                                    if (this.f19994f.m21359a(1)) {
                                        zM21362c = this.f19994f.m21362c();
                                        if (!zM21362c) {
                                            zM21362c2 = false;
                                        } else {
                                            if (!this.f19994f.m21359a(1)) {
                                                return;
                                            }
                                            zM21362c2 = this.f19994f.m21362c();
                                            z = true;
                                        }
                                        if (this.f19997i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM21364d = 0;
                                        } else if (!this.f19994f.m21361b()) {
                                            return;
                                        } else {
                                            iM21364d = this.f19994f.m21364d();
                                        }
                                        i3 = c8812k.f20632h;
                                        if (i3 == 0) {
                                            if (!this.f19994f.m21359a(c8812k.f20633i)) {
                                                return;
                                            }
                                            iM21360b = this.f19994f.m21360b(c8812k.f20633i);
                                            if (c8811j.f20624b || zM21362c) {
                                                iM21366e = 0;
                                                i4 = iM21360b;
                                                iM21366e2 = 0;
                                            } else {
                                                if (!this.f19994f.m21361b()) {
                                                    return;
                                                }
                                                iM21366e = this.f19994f.m21366e();
                                                i4 = iM21360b;
                                                iM21366e2 = 0;
                                            }
                                        } else if (i3 == 1 || c8812k.f20634j) {
                                            iM21366e = 0;
                                            iM21366e2 = 0;
                                            i4 = 0;
                                        } else {
                                            if (!this.f19994f.m21361b()) {
                                                return;
                                            }
                                            int iM21366e3 = this.f19994f.m21366e();
                                            if (!c8811j.f20624b || zM21362c) {
                                                iM21366e = 0;
                                                i4 = 0;
                                                i8 = iM21366e3;
                                                iM21366e2 = 0;
                                            } else {
                                                if (!this.f19994f.m21361b()) {
                                                    return;
                                                }
                                                i4 = 0;
                                                i8 = iM21366e3;
                                                iM21366e2 = this.f19994f.m21366e();
                                                iM21366e = 0;
                                            }
                                        }
                                        C8646k c8646k2 = this.f20002n;
                                        c8646k2.f19975c = c8812k;
                                        c8646k2.f19976d = iM21360b2;
                                        c8646k2.f19977e = iM21364d2;
                                        c8646k2.f19978f = iM21360b3;
                                        c8646k2.f19979g = iM21364d3;
                                        c8646k2.f19980h = zM21362c;
                                        c8646k2.f19981i = z;
                                        c8646k2.f19982j = zM21362c2;
                                        c8646k2.f19983k = z2;
                                        c8646k2.f19984l = iM21364d;
                                        c8646k2.f19985m = i4;
                                        c8646k2.f19986n = iM21366e;
                                        c8646k2.f19987o = i8;
                                        c8646k2.f19988p = iM21366e2;
                                        c8646k2.f19973a = true;
                                        c8646k2.f19974b = true;
                                        this.f19999k = false;
                                    }
                                    return;
                                }
                                zM21362c = false;
                                zM21362c2 = false;
                                z = zM21362c2;
                                if (this.f19997i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM21364d = 0;
                                } else if (!this.f19994f.m21361b()) {
                                    return;
                                } else {
                                    iM21364d = this.f19994f.m21364d();
                                }
                                i3 = c8812k.f20632h;
                                if (i3 == 0) {
                                    if (!this.f19994f.m21359a(c8812k.f20633i)) {
                                        return;
                                    }
                                    iM21360b = this.f19994f.m21360b(c8812k.f20633i);
                                    if (c8811j.f20624b) {
                                        iM21366e = 0;
                                        i4 = iM21360b;
                                        iM21366e2 = 0;
                                    } else {
                                        iM21366e = 0;
                                        i4 = iM21360b;
                                        iM21366e2 = 0;
                                    }
                                } else if (i3 == 1) {
                                    iM21366e = 0;
                                    iM21366e2 = 0;
                                    i4 = 0;
                                } else {
                                    iM21366e = 0;
                                    iM21366e2 = 0;
                                    i4 = 0;
                                }
                                C8646k c8646k3 = this.f20002n;
                                c8646k3.f19975c = c8812k;
                                c8646k3.f19976d = iM21360b2;
                                c8646k3.f19977e = iM21364d2;
                                c8646k3.f19978f = iM21360b3;
                                c8646k3.f19979g = iM21364d3;
                                c8646k3.f19980h = zM21362c;
                                c8646k3.f19981i = z;
                                c8646k3.f19982j = zM21362c2;
                                c8646k3.f19983k = z2;
                                c8646k3.f19984l = iM21364d;
                                c8646k3.f19985m = i4;
                                c8646k3.f19986n = iM21366e;
                                c8646k3.f19987o = i8;
                                c8646k3.f19988p = iM21366e2;
                                c8646k3.f19973a = true;
                                c8646k3.f19974b = true;
                                this.f19999k = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
