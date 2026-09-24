package com.google.android.gms.internal.ads;

import com.ironsource.C11744X3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzilt implements Iterator, Closeable, zzauj, AutoCloseable {
    private static final zzaui zza = new zzils("eof ");
    protected zzauf zzb;
    protected zzilu zzc;
    zzaui zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzima.zzb(zzilt.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaui zzauiVar = this.zzd;
        if (zzauiVar == zza) {
            return false;
        }
        if (zzauiVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C11744X3.j.f26438d);
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb.append(C11744X3.j.f26440e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaui) list.get(i)).toString());
            i++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzilz(this.zzg, this);
    }

    public final void zzd(zzilu zziluVar, long j, zzauf zzaufVar) throws IOException {
        this.zzc = zziluVar;
        this.zze = zziluVar.zzc();
        zziluVar.zzd(zziluVar.zzc() + j);
        this.zzf = zziluVar.zzc();
        this.zzb = zzaufVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaui next() {
        zzaui zzauiVarZzb;
        zzaui zzauiVar = this.zzd;
        if (zzauiVar != null && zzauiVar != zza) {
            this.zzd = null;
            return zzauiVar;
        }
        zzilu zziluVar = this.zzc;
        if (zziluVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zziluVar) {
                this.zzc.zzd(this.zze);
                zzauiVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzauiVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
