package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.C1985lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.InterfaceC1984ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C1983ri extends MediaDataSource implements AutoCloseable {

    /* JADX INFO: renamed from: ri */
    public static final ConcurrentHashMap<String, C1983ri> f4574ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: fi */
    private final C1996ik f4575fi;

    /* JADX INFO: renamed from: ik */
    private long f4576ik = -2147483648L;

    /* JADX INFO: renamed from: ka */
    private final Context f4577ka;

    /* JADX INFO: renamed from: lr */
    private final InterfaceC1984ik f4578lr;

    public C1983ri(Context context, C1996ik c1996ik) {
        this.f4577ka = context;
        this.f4575fi = c1996ik;
        this.f4578lr = new C1985lr(c1996ik);
    }

    /* JADX INFO: renamed from: ri */
    public static C1983ri m6246ri(Context context, C1996ik c1996ik) {
        C1983ri c1983ri = new C1983ri(context, c1996ik);
        f4574ri.put(c1996ik.m6302bu(), c1983ri);
        return c1983ri;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4575fi.slm();
        InterfaceC1984ik interfaceC1984ik = this.f4578lr;
        if (interfaceC1984ik != null) {
            interfaceC1984ik.mo6249lr();
        }
        f4574ri.remove(this.f4575fi.m6302bu());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.f4576ik == -2147483648L) {
            if (this.f4577ka == null || TextUtils.isEmpty(this.f4575fi.slm())) {
                return -1L;
            }
            this.f4576ik = this.f4578lr.mo6248ik();
        }
        return this.f4576ik;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int iMo6250ri = this.f4578lr.mo6250ri(j, bArr, i, i2);
        Long.valueOf(j);
        Integer.valueOf(bArr.length);
        Integer.valueOf(i);
        Integer.valueOf(iMo6250ri);
        return iMo6250ri;
    }

    /* JADX INFO: renamed from: ri */
    public C1996ik m6247ri() {
        return this.f4575fi;
    }
}
