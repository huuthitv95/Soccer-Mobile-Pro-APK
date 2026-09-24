package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8817p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c */
/* JADX INFO: loaded from: classes9.dex */
public final class C8766c {

    /* JADX INFO: renamed from: a */
    public final C8775l f20455a;

    /* JADX INFO: renamed from: b */
    public final long f20456b = 10485760;

    /* JADX INFO: renamed from: c */
    public final int f20457c = 20480;

    /* JADX INFO: renamed from: d */
    public C8786k f20458d;

    /* JADX INFO: renamed from: e */
    public File f20459e;

    /* JADX INFO: renamed from: f */
    public OutputStream f20460f;

    /* JADX INFO: renamed from: g */
    public FileOutputStream f20461g;

    /* JADX INFO: renamed from: h */
    public long f20462h;

    /* JADX INFO: renamed from: i */
    public long f20463i;

    /* JADX INFO: renamed from: j */
    public C8817p f20464j;

    public C8766c(C8775l c8775l) {
        this.f20455a = c8775l;
    }

    /* JADX INFO: renamed from: a */
    public final void m21289a() {
        OutputStream outputStream = this.f20460f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f20461g.getFD().sync();
            AbstractC8827z.m21384a(this.f20460f);
            this.f20460f = null;
            File file = this.f20459e;
            this.f20459e = null;
            C8775l c8775l = this.f20455a;
            synchronized (c8775l) {
                C8776m c8776mM21306a = C8776m.m21306a(file, c8775l.f20511d);
                if (c8776mM21306a == null) {
                    throw new IllegalStateException();
                }
                if (!c8775l.f20510c.containsKey(c8776mM21306a.f20487a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jM21300a = c8775l.m21300a(c8776mM21306a.f20487a);
                    if (jM21300a != -1 && c8776mM21306a.f20488b + c8776mM21306a.f20489c > jM21300a) {
                        throw new IllegalStateException();
                    }
                    c8775l.m21304a(c8776mM21306a);
                    c8775l.f20511d.m21297b();
                    c8775l.notifyAll();
                }
            }
        } catch (Throwable th) {
            AbstractC8827z.m21384a(this.f20460f);
            this.f20460f = null;
            File file2 = this.f20459e;
            this.f20459e = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21290b() {
        File file;
        long j = this.f20458d.f20548d;
        long jMin = j == -1 ? this.f20456b : Math.min(j - this.f20463i, this.f20456b);
        C8775l c8775l = this.f20455a;
        C8786k c8786k = this.f20458d;
        String str = c8786k.f20549e;
        long j2 = c8786k.f20546b + this.f20463i;
        synchronized (c8775l) {
            if (!c8775l.f20510c.containsKey(str)) {
                throw new IllegalStateException();
            }
            if (!c8775l.f20508a.exists()) {
                c8775l.m21302a();
                c8775l.f20508a.mkdirs();
            }
            c8775l.f20509b.m21298a(c8775l, jMin);
            File file2 = c8775l.f20508a;
            C8772i c8772i = c8775l.f20511d;
            C8771h c8771hM21295a = (C8771h) c8772i.f20497a.get(str);
            if (c8771hM21295a == null) {
                c8771hM21295a = c8772i.m21295a(str, -1L);
            }
            int i = c8771hM21295a.f20493a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Pattern pattern = C8776m.f20514g;
            file = new File(file2, i + "." + j2 + "." + jCurrentTimeMillis + ".v3.exo");
        }
        this.f20459e = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f20459e);
        this.f20461g = fileOutputStream;
        if (this.f20457c > 0) {
            C8817p c8817p = this.f20464j;
            if (c8817p == null) {
                this.f20464j = new C8817p(this.f20461g, this.f20457c);
            } else {
                c8817p.m21368a(fileOutputStream);
            }
            this.f20460f = this.f20464j;
        } else {
            this.f20460f = fileOutputStream;
        }
        this.f20462h = 0L;
    }
}
