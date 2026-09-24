package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8442d {

    /* JADX INFO: renamed from: a */
    public final C8443e f18776a;

    /* JADX INFO: renamed from: b */
    public final boolean[] f18777b;

    /* JADX INFO: renamed from: c */
    public boolean f18778c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8445g f18779d;

    public C8442d(C8445g c8445g, C8443e c8443e) {
        this.f18779d = c8445g;
        this.f18776a = c8443e;
        this.f18777b = c8443e.f18782c ? null : new boolean[c8445g.f18793g];
    }

    /* JADX INFO: renamed from: a */
    public final void m20815a() {
        if (!this.f18778c) {
            C8445g.m20820a(this.f18779d, this, true);
        } else {
            C8445g.m20820a(this.f18779d, this, false);
            this.f18779d.m20827c(this.f18776a.f18780a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20816a(byte[] bArr) {
        OutputStream c8441c;
        FileOutputStream fileOutputStream;
        C8445g c8445g = this.f18779d;
        if (c8445g.f18793g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f18779d.f18793g);
        }
        synchronized (c8445g) {
            C8443e c8443e = this.f18776a;
            if (c8443e.f18783d != this) {
                throw new IllegalStateException();
            }
            if (!c8443e.f18782c) {
                this.f18777b[0] = true;
            }
            File fileM20818b = c8443e.m20818b(0);
            try {
                fileOutputStream = new FileOutputStream(fileM20818b);
            } catch (FileNotFoundException unused) {
                this.f18779d.f18787a.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(fileM20818b);
                } catch (FileNotFoundException unused2) {
                    c8441c = C8445g.f18786q;
                }
            }
            c8441c = new C8441c(this, fileOutputStream);
        }
        try {
            c8441c.write(bArr);
            Charset charset = AbstractC8450l.f18809a;
            try {
                c8441c.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            Charset charset2 = AbstractC8450l.f18809a;
            if (c8441c != null) {
                try {
                    c8441c.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }
}
