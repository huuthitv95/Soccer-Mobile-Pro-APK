package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8804c {

    /* JADX INFO: renamed from: a */
    public final File f20611a;

    /* JADX INFO: renamed from: b */
    public final File f20612b;

    public C8804c(File file) {
        this.f20611a = file;
        this.f20612b = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m21320a() {
        if (this.f20612b.exists()) {
            this.f20611a.delete();
            this.f20612b.renameTo(this.f20611a);
        }
        return new FileInputStream(this.f20611a);
    }

    /* JADX INFO: renamed from: b */
    public final C8803b m21321b() throws IOException {
        if (this.f20611a.exists()) {
            if (this.f20612b.exists()) {
                this.f20611a.delete();
            } else if (!this.f20611a.renameTo(this.f20612b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f20611a + " to backup file " + this.f20612b);
            }
        }
        try {
            return new C8803b(this.f20611a);
        } catch (FileNotFoundException unused) {
            if (!this.f20611a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f20611a);
            }
            try {
                return new C8803b(this.f20611a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f20611a);
            }
        }
    }
}
