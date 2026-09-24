package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8780e0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8784i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8768e implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final C8775l f20466a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8783h f20467b;

    /* JADX INFO: renamed from: c */
    public final C8780e0 f20468c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8783h f20469d;

    /* JADX INFO: renamed from: e */
    public final boolean f20470e = false;

    /* JADX INFO: renamed from: f */
    public final boolean f20471f = true;

    /* JADX INFO: renamed from: g */
    public final boolean f20472g = false;

    /* JADX INFO: renamed from: h */
    public InterfaceC8783h f20473h;

    /* JADX INFO: renamed from: i */
    public boolean f20474i;

    /* JADX INFO: renamed from: j */
    public Uri f20475j;

    /* JADX INFO: renamed from: k */
    public int f20476k;

    /* JADX INFO: renamed from: l */
    public String f20477l;

    /* JADX INFO: renamed from: m */
    public long f20478m;

    /* JADX INFO: renamed from: n */
    public long f20479n;

    /* JADX INFO: renamed from: o */
    public C8776m f20480o;

    /* JADX INFO: renamed from: p */
    public boolean f20481p;

    /* JADX INFO: renamed from: q */
    public boolean f20482q;

    public C8768e(C8775l c8775l, InterfaceC8783h interfaceC8783h, InterfaceC8783h interfaceC8783h2, C8766c c8766c) {
        this.f20466a = c8775l;
        this.f20467b = interfaceC8783h2;
        this.f20469d = interfaceC8783h;
        if (c8766c != null) {
            this.f20468c = new C8780e0(interfaceC8783h, c8766c);
        } else {
            this.f20468c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws IOException {
        try {
            Uri uri = c8786k.f20545a;
            this.f20475j = uri;
            this.f20476k = c8786k.f20550f;
            String string = c8786k.f20549e;
            if (string == null) {
                string = uri.toString();
            }
            this.f20477l = string;
            this.f20478m = c8786k.f20547c;
            boolean z = (this.f20471f && this.f20481p) || (c8786k.f20548d == -1 && this.f20472g);
            this.f20482q = z;
            long j = c8786k.f20548d;
            if (j != -1 || z) {
                this.f20479n = j;
            } else {
                long jM21300a = this.f20466a.m21300a(string);
                this.f20479n = jM21300a;
                if (jM21300a != -1) {
                    long j2 = jM21300a - c8786k.f20547c;
                    this.f20479n = j2;
                    if (j2 <= 0) {
                        throw new C8784i();
                    }
                }
            }
            m21292a(true);
            return this.f20479n;
        } catch (IOException e) {
            if (this.f20473h == this.f20467b || (e instanceof C8764a)) {
                this.f20481p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        InterfaceC8783h interfaceC8783h = this.f20473h;
        return interfaceC8783h == this.f20469d ? interfaceC8783h.mo20830a() : this.f20475j;
    }

    /* JADX INFO: renamed from: a */
    public final void m21291a(long j) {
        if (this.f20473h == this.f20468c) {
            C8775l c8775l = this.f20466a;
            String str = this.f20477l;
            synchronized (c8775l) {
                C8772i c8772i = c8775l.f20511d;
                C8771h c8771h = (C8771h) c8772i.f20497a.get(str);
                if (c8771h == null) {
                    c8772i.m21295a(str, j);
                } else if (c8771h.f20496d != j) {
                    c8771h.f20496d = j;
                    c8772i.f20502f = true;
                }
                c8775l.f20511d.m21297b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21292a(boolean z) throws IOException {
        C8776m c8776mM21301a;
        C8786k c8786k;
        long jMo20829a;
        IOException iOException = null;
        if (this.f20482q) {
            c8776mM21301a = null;
        } else if (this.f20470e) {
            try {
                C8775l c8775l = this.f20466a;
                String str = this.f20477l;
                long j = this.f20478m;
                synchronized (c8775l) {
                    while (true) {
                        c8776mM21301a = c8775l.m21301a(str, j);
                        if (c8776mM21301a != null) {
                            break;
                        }
                        c8775l.wait();
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            c8776mM21301a = this.f20466a.m21301a(this.f20477l, this.f20478m);
        }
        if (c8776mM21301a == null) {
            this.f20473h = this.f20469d;
            Uri uri = this.f20475j;
            long j2 = this.f20478m;
            c8786k = new C8786k(uri, j2, j2, this.f20479n, this.f20477l, this.f20476k);
        } else if (c8776mM21301a.f20490d) {
            Uri uriFromFile = Uri.fromFile(c8776mM21301a.f20491e);
            long j3 = this.f20478m - c8776mM21301a.f20488b;
            long jMin = c8776mM21301a.f20489c - j3;
            long j4 = this.f20479n;
            if (j4 != -1) {
                jMin = Math.min(jMin, j4);
            }
            C8786k c8786k2 = new C8786k(uriFromFile, this.f20478m, j3, jMin, this.f20477l, this.f20476k);
            this.f20473h = this.f20467b;
            c8786k = c8786k2;
        } else {
            long jMin2 = c8776mM21301a.f20489c;
            if (jMin2 == -1) {
                jMin2 = this.f20479n;
            } else {
                long j5 = this.f20479n;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
            }
            Uri uri2 = this.f20475j;
            long j6 = this.f20478m;
            C8786k c8786k3 = new C8786k(uri2, j6, j6, jMin2, this.f20477l, this.f20476k);
            C8780e0 c8780e0 = this.f20468c;
            if (c8780e0 != null) {
                this.f20473h = c8780e0;
                this.f20480o = c8776mM21301a;
            } else {
                this.f20473h = this.f20469d;
                this.f20466a.m21305b(c8776mM21301a);
            }
            c8786k = c8786k3;
        }
        boolean z2 = true;
        this.f20474i = c8786k.f20548d == -1;
        try {
            jMo20829a = this.f20473h.mo20829a(c8786k);
        } catch (IOException e) {
            if (!z && this.f20474i) {
                Throwable cause = e;
                while (true) {
                    if (cause == null) {
                        iOException = e;
                        break;
                    }
                    if ((cause instanceof C8784i) && ((C8784i) cause).f20538a == 0) {
                        break;
                    }
                    cause = cause.getCause();
                }
            } else {
                iOException = e;
                break;
            }
            if (iOException != null) {
                throw iOException;
            }
            z2 = false;
            jMo20829a = 0;
        }
        if (this.f20474i && jMo20829a != -1) {
            this.f20479n = jMo20829a;
            m21291a(c8786k.f20547c + jMo20829a);
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m21293b() {
        InterfaceC8783h interfaceC8783h = this.f20473h;
        if (interfaceC8783h == null) {
            return;
        }
        try {
            interfaceC8783h.close();
            this.f20473h = null;
            this.f20474i = false;
            C8776m c8776m = this.f20480o;
            if (c8776m != null) {
                C8775l c8775l = this.f20466a;
                synchronized (c8775l) {
                    if (c8776m != c8775l.f20510c.remove(c8776m.f20487a)) {
                        throw new IllegalStateException();
                    }
                    c8775l.notifyAll();
                }
                this.f20480o = null;
            }
        } catch (Throwable th) {
            C8776m c8776m2 = this.f20480o;
            if (c8776m2 != null) {
                this.f20466a.m21305b(c8776m2);
                this.f20480o = null;
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() throws IOException {
        this.f20475j = null;
        try {
            m21293b();
        } catch (IOException e) {
            if (this.f20473h == this.f20467b || (e instanceof C8764a)) {
                this.f20481p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f20479n == 0) {
            return -1;
        }
        try {
            int i3 = this.f20473h.read(bArr, i, i2);
            if (i3 >= 0) {
                long j = i3;
                this.f20478m += j;
                long j2 = this.f20479n;
                if (j2 != -1) {
                    this.f20479n = j2 - j;
                    return i3;
                }
            } else {
                if (this.f20474i) {
                    m21291a(this.f20478m);
                    this.f20479n = 0L;
                }
                m21293b();
                long j3 = this.f20479n;
                if ((j3 > 0 || j3 == -1) && m21292a(false)) {
                    return read(bArr, i, i2);
                }
            }
            return i3;
        } catch (IOException e) {
            if (this.f20473h == this.f20467b || (e instanceof C8764a)) {
                this.f20481p = true;
            }
            throw e;
        }
    }
}
