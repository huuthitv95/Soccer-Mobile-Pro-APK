package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri;

import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1976lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1985lr implements InterfaceC1984ik {

    /* JADX INFO: renamed from: aw */
    private volatile long f4579aw;

    /* JADX INFO: renamed from: co */
    private final C1996ik f4580co;

    /* JADX INFO: renamed from: di */
    private long f4581di;

    /* JADX INFO: renamed from: fi */
    private File f4582fi;

    /* JADX INFO: renamed from: ka */
    private File f4584ka;

    /* JADX INFO: renamed from: ri */
    private boolean f4588ri;

    /* JADX INFO: renamed from: sf */
    private RandomAccessFile f4589sf;

    /* JADX INFO: renamed from: lr */
    private volatile long f4585lr = -2147483648L;

    /* JADX INFO: renamed from: ik */
    private final Object f4583ik = new Object();
    private volatile long xha = -1;

    /* JADX INFO: renamed from: mj */
    private volatile int f4586mj = -100;
    private volatile boolean jbs = false;

    /* JADX INFO: renamed from: qt */
    private volatile boolean f4587qt = false;

    public C1985lr(C1996ik c1996ik) {
        this.f4581di = 0L;
        this.f4589sf = null;
        this.f4580co = c1996ik;
        try {
            String strM6307fi = c1996ik.m6307fi();
            String strM6302bu = c1996ik.m6302bu();
            this.f4584ka = C1976lr.m6204lr(strM6307fi, strM6302bu);
            this.f4582fi = C1976lr.m6203ik(strM6307fi, strM6302bu);
            if (m6257ka()) {
                this.f4589sf = new RandomAccessFile(this.f4582fi, "r");
            } else {
                this.f4589sf = new RandomAccessFile(this.f4584ka, "rw");
            }
            if (!m6257ka()) {
                this.f4581di = this.f4584ka.length();
                m6266ri();
            }
            this.f4588ri = C1979ri.m6211di() == 2;
        } catch (Throwable unused) {
            c1996ik.slm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m6252di() throws IOException {
        synchronized (this.f4583ik) {
            if (m6257ka()) {
                this.f4580co.slm();
                this.f4580co.m6302bu();
                return;
            }
            try {
                if (!this.f4584ka.renameTo(this.f4582fi)) {
                    throw new IOException("Error renaming file " + this.f4584ka + " to " + this.f4582fi + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.f4589sf;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f4589sf = new RandomAccessFile(this.f4582fi, "rw");
                this.f4580co.m6302bu();
                this.f4580co.slm();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    private long m6253fi() {
        return m6257ka() ? this.f4582fi.length() : this.f4584ka.length();
    }

    /* JADX INFO: renamed from: ka */
    private boolean m6257ka() {
        return this.f4582fi.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6262ri(int i, String str) {
        JSONObject jSONObjectM6310ik;
        this.f4587qt = false;
        this.f4586mj = i;
        this.f4585lr = this.xha;
        C2707ac.m10201lr("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        C1996ik c1996ik = this.f4580co;
        if (c1996ik == null || !c1996ik.m6330ri() || (jSONObjectM6310ik = this.f4580co.m6310ik()) == null) {
            return;
        }
        try {
            jSONObjectM6310ik.put("error_real_code", i);
            jSONObjectM6310ik.put("error_real_msg", str);
        } catch (Throwable th) {
            C2707ac.m10206ri("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.InterfaceC1984ik
    /* JADX INFO: renamed from: ik */
    public long mo6248ik() throws IOException {
        if (m6257ka()) {
            this.f4585lr = this.f4582fi.length();
        } else {
            synchronized (this.f4583ik) {
                int i = 0;
                while (this.f4585lr == -2147483648L && !this.jbs) {
                    try {
                        i += 15;
                        try {
                            this.f4583ik.wait(5L);
                            if (i > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        Long.valueOf(this.f4585lr);
        return this.f4585lr;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.InterfaceC1984ik
    /* JADX INFO: renamed from: lr */
    public void mo6249lr() {
        try {
            if (!this.jbs) {
                this.f4589sf.close();
            }
            File file = this.f4584ka;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f4582fi;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.jbs = true;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.InterfaceC1984ik
    /* JADX INFO: renamed from: ri */
    public int mo6250ri(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.f4585lr) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.jbs) {
                synchronized (this.f4583ik) {
                    long jM6253fi = m6253fi();
                    if (j < jM6253fi) {
                        Long.valueOf(j);
                        this.f4589sf.seek(j);
                        i4 = this.f4589sf.read(bArr, i, i2);
                    } else {
                        Long.valueOf(j);
                        Long.valueOf(jM6253fi);
                        i3 += 33;
                        this.f4579aw = j;
                        this.f4583ik.wait(33L);
                        this.f4579aw = -1L;
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                C1996ik c1996ik = this.f4580co;
                if (c1996ik != null && c1996ik.m6330ri() && this.f4586mj != -100 && (!this.f4587qt || this.f4585lr == this.xha)) {
                    throw new IOException();
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6266ri() {
        AbstractC2671sf.ri riVarM10007lr = C1995ik.m6292ik() != null ? C1995ik.m6292ik().m10007lr() : new AbstractC2671sf.ri("v_cache");
        riVarM10007lr.m10010ri(this.f4580co.tan(), TimeUnit.MILLISECONDS).m10009lr(this.f4580co.m6299ac(), TimeUnit.MILLISECONDS).m10008ik(this.f4580co.ihz(), TimeUnit.MILLISECONDS);
        AbstractC2671sf abstractC2671sfM10012ri = riVarM10007lr.m10012ri();
        Long.valueOf(this.f4581di);
        this.f4580co.m6302bu();
        abstractC2671sfM10012ri.mo9987ri(new AbstractC2646co.ri().m9907ri("RANGE", "bytes=" + this.f4581di + "-").m9896lr(this.f4580co.slm()).m9899ri().m9906ri("videoLoadWhenPlaying").m9900ri(9).m9898lr()).mo9925ri(new InterfaceC2649ik() { // from class: com.bykv.vk.openvk.ri.ri.lr.ri.ri.lr.1
            /* JADX WARN: Code duplicated, block: B:92:0x01f8 A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:90:0x01f3, B:92:0x01f8, B:94:0x01fd, B:95:0x0200, B:97:0x0208, B:99:0x021c), top: B:107:0x01f3 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x01fd A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:90:0x01f3, B:92:0x01f8, B:94:0x01fd, B:95:0x0200, B:97:0x0208, B:99:0x021c), top: B:107:0x01f3 }] */
            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
                AbstractC2672vr abstractC2672vrMo9876di;
                if (bgrVar == null) {
                    C1985lr.this.m6262ri(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamMo9982ik = null;
                try {
                    try {
                        C1985lr.this.f4587qt = bgrVar.mo9879ka();
                        if (C1985lr.this.f4587qt) {
                            abstractC2672vrMo9876di = bgrVar.mo9876di();
                            try {
                                if (C1985lr.this.f4587qt && abstractC2672vrMo9876di != null) {
                                    C1985lr.this.f4585lr = abstractC2672vrMo9876di.mo9985ri() + C1985lr.this.f4581di;
                                    inputStreamMo9982ik = abstractC2672vrMo9876di.mo9982ik();
                                }
                                if (inputStreamMo9982ik == null) {
                                    C1985lr.this.m6262ri(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamMo9982ik != null) {
                                        inputStreamMo9982ik.close();
                                    }
                                    if (abstractC2672vrMo9876di != null) {
                                        abstractC2672vrMo9876di.close();
                                    }
                                    if (bgrVar != null) {
                                        bgrVar.close();
                                    }
                                    if (!C1985lr.this.f4587qt || C1985lr.this.f4584ka.length() != C1985lr.this.f4585lr) {
                                        return;
                                    }
                                } else {
                                    int iXha = C1979ri.xha();
                                    byte[] bArr = new byte[iXha];
                                    long j = C1985lr.this.f4581di;
                                    Long.valueOf(C1985lr.this.f4585lr);
                                    Long.valueOf(C1985lr.this.f4581di);
                                    C1985lr.this.f4580co.slm();
                                    long j2 = 0;
                                    long j3 = 0;
                                    int i = 0;
                                    while (true) {
                                        int i2 = inputStreamMo9982ik.read(bArr, i, iXha - i);
                                        boolean z = true;
                                        if (i2 == -1) {
                                            break;
                                        }
                                        i += i2;
                                        j3 += (long) i2;
                                        if (j3 % ((long) iXha) != j2 && j3 != C1985lr.this.f4585lr - C1985lr.this.f4581di) {
                                            z = false;
                                        }
                                        Boolean.valueOf(z);
                                        Integer.valueOf(i);
                                        Long.valueOf(C1985lr.this.f4585lr);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(j3);
                                        sb.append(", waitingAtPost=");
                                        Long.valueOf(C1985lr.this.f4579aw);
                                        if (z) {
                                            synchronized (C1985lr.this.f4583ik) {
                                                C1976lr.m6206ri(C1985lr.this.f4589sf, bArr, Long.valueOf(j).intValue(), i, C1985lr.this.f4580co.m6302bu());
                                                if (C1985lr.this.f4588ri && C1985lr.this.f4579aw > -1 && C1985lr.this.f4581di + j3 >= C1985lr.this.f4579aw) {
                                                    C1985lr.this.f4583ik.notify();
                                                }
                                            }
                                            j += (long) i;
                                            i = 0;
                                        }
                                        j2 = 0;
                                    }
                                    Long.valueOf(C1985lr.this.f4581di);
                                    Long.valueOf(C1985lr.this.f4585lr);
                                    Long.valueOf(j3);
                                    Boolean.valueOf(j3 == C1985lr.this.f4585lr - C1985lr.this.f4581di);
                                }
                                C1985lr.this.m6252di();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    C1985lr.this.m6262ri(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamMo9982ik != null) {
                                        inputStreamMo9982ik.close();
                                    }
                                    if (abstractC2672vrMo9876di != null) {
                                        abstractC2672vrMo9876di.close();
                                    }
                                    if (bgrVar != null) {
                                        bgrVar.close();
                                    }
                                    if (C1985lr.this.f4587qt && C1985lr.this.f4584ka.length() == C1985lr.this.f4585lr) {
                                        C1985lr.this.m6252di();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    if (inputStreamMo9982ik != null) {
                                        try {
                                            inputStreamMo9982ik.close();
                                            if (abstractC2672vrMo9876di != null) {
                                                abstractC2672vrMo9876di.close();
                                            }
                                            if (bgrVar != null) {
                                                bgrVar.close();
                                            }
                                            if (C1985lr.this.f4587qt && C1985lr.this.f4584ka.length() == C1985lr.this.f4585lr) {
                                                C1985lr.this.m6252di();
                                            }
                                        } catch (Throwable unused) {
                                            throw th2;
                                        }
                                    } else {
                                        if (abstractC2672vrMo9876di != null) {
                                            abstractC2672vrMo9876di.close();
                                        }
                                        if (bgrVar != null) {
                                            bgrVar.close();
                                        }
                                        if (C1985lr.this.f4587qt) {
                                            C1985lr.this.m6252di();
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        C1985lr.this.m6262ri(bgrVar.mo9878ik(), bgrVar.mo9877fi());
                        abstractC2672vrMo9876di = null;
                        if (inputStreamMo9982ik != null) {
                            inputStreamMo9982ik.close();
                        }
                        if (abstractC2672vrMo9876di != null) {
                            abstractC2672vrMo9876di.close();
                        }
                        if (bgrVar != null) {
                            bgrVar.close();
                        }
                        if (!C1985lr.this.f4587qt || C1985lr.this.f4584ka.length() != C1985lr.this.f4585lr) {
                            return;
                        }
                        C1985lr.this.m6252di();
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC2672vrMo9876di = null;
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
                C1985lr.this.m6262ri(30000, iOException.getMessage());
            }
        });
    }
}
