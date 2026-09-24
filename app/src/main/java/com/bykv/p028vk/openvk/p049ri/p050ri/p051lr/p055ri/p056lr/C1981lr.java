package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr;

import android.content.Context;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1976lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2672vr;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1981lr {

    /* JADX INFO: renamed from: fi */
    private File f4567fi;

    /* JADX INFO: renamed from: ka */
    private File f4569ka;

    /* JADX INFO: renamed from: lr */
    private C1996ik f4570lr;

    /* JADX INFO: renamed from: ri */
    private Context f4571ri;

    /* JADX INFO: renamed from: ik */
    private volatile boolean f4568ik = false;

    /* JADX INFO: renamed from: di */
    private final List<InterfaceC1994ri.ri> f4566di = new ArrayList();
    private volatile boolean xha = false;

    public C1981lr(Context context, C1996ik c1996ik) {
        this.f4569ka = null;
        this.f4567fi = null;
        this.f4571ri = context;
        this.f4570lr = c1996ik;
        this.f4569ka = C1976lr.m6204lr(c1996ik.m6307fi(), c1996ik.m6302bu());
        this.f4567fi = C1976lr.m6203ik(c1996ik.m6307fi(), c1996ik.m6302bu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public void m6223fi() {
        try {
            if (this.f4569ka.renameTo(this.f4567fi)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f4569ka + " to " + this.f4567fi + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m6225ik() {
        AbstractC2671sf.ri riVarM10007lr = C1995ik.m6292ik() != null ? C1995ik.m6292ik().m10007lr() : new AbstractC2671sf.ri("v_preload");
        riVarM10007lr.m10010ri(this.f4570lr.tan(), TimeUnit.MILLISECONDS).m10009lr(this.f4570lr.m6299ac(), TimeUnit.MILLISECONDS).m10008ik(this.f4570lr.ihz(), TimeUnit.MILLISECONDS);
        AbstractC2671sf abstractC2671sfM10012ri = riVarM10007lr.m10012ri();
        AbstractC2646co.ri riVar = new AbstractC2646co.ri();
        final long length = this.f4569ka.length();
        int iM6304di = this.f4570lr.m6304di();
        boolean zM6300aw = this.f4570lr.m6300aw();
        int iM6314ka = this.f4570lr.m6314ka();
        if (iM6314ka > 0) {
            if (iM6314ka >= this.f4570lr.m6303co()) {
                zM6300aw = true;
            } else {
                iM6304di = iM6314ka;
            }
        }
        riVar.m9906ri("videoPreload").m9900ri(6);
        if (zM6300aw) {
            riVar.m9907ri("RANGE", "bytes=" + length + "-").m9896lr(this.f4570lr.slm()).m9899ri().m9898lr();
        } else {
            riVar.m9907ri("RANGE", "bytes=" + length + "-" + iM6304di).m9896lr(this.f4570lr.slm()).m9899ri().m9898lr();
        }
        abstractC2671sfM10012ri.mo9987ri(riVar.m9898lr()).mo9925ri(new InterfaceC2649ik() { // from class: com.bykv.vk.openvk.ri.ri.lr.ri.lr.lr.1
            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6243ri(InterfaceC2651lr interfaceC2651lr, bgr bgrVar) throws IOException {
                InputStream inputStreamMo9982ik;
                RandomAccessFile randomAccessFile;
                AbstractC2672vr abstractC2672vrMo9876di;
                long jMo9985ri;
                long j = length;
                AbstractC2672vr abstractC2672vr = null;
                abstractC2672vr = null;
                randomAccessFile = null;
                randomAccessFile = null;
                RandomAccessFile randomAccessFile2 = null;
                try {
                    if (bgrVar != null) {
                        boolean zMo9879ka = bgrVar.mo9879ka();
                        if (!zMo9879ka) {
                            C1981lr c1981lr = C1981lr.this;
                            c1981lr.m6238ri(c1981lr.f4570lr, bgrVar.mo9878ik(), bgrVar.mo9877fi());
                            C1981lr.this.m6239ri((Closeable) null);
                            C1981lr.this.m6239ri((Closeable) null);
                            C1981lr.this.m6239ri(abstractC2672vr);
                        }
                        abstractC2672vrMo9876di = bgrVar.mo9876di();
                        try {
                            abstractC2672vrMo9876di = bgrVar.mo9876di();
                            if (!zMo9879ka || abstractC2672vrMo9876di == null) {
                                inputStreamMo9982ik = null;
                                jMo9985ri = 0;
                            } else {
                                jMo9985ri = length + abstractC2672vrMo9876di.mo9985ri();
                                inputStreamMo9982ik = abstractC2672vrMo9876di.mo9982ik();
                            }
                            try {
                                if (inputStreamMo9982ik == null) {
                                    C1981lr c1981lr2 = C1981lr.this;
                                    c1981lr2.m6238ri(c1981lr2.f4570lr, bgrVar.mo9878ik(), bgrVar.mo9877fi());
                                } else {
                                    randomAccessFile = new RandomAccessFile(C1981lr.this.f4569ka, "rw");
                                    try {
                                        int iXha = C1979ri.xha();
                                        byte[] bArr = new byte[iXha];
                                        int i = 0;
                                        long j2 = 0;
                                        while (true) {
                                            int i2 = inputStreamMo9982ik.read(bArr, i, iXha - i);
                                            if (i2 == -1) {
                                                if (C1981lr.this.f4570lr.m6300aw() && jMo9985ri == C1981lr.this.f4569ka.length()) {
                                                    C1981lr.this.m6223fi();
                                                }
                                                C1981lr c1981lr3 = C1981lr.this;
                                                c1981lr3.m6237ri(c1981lr3.f4570lr, bgrVar.mo9878ik());
                                                randomAccessFile2 = randomAccessFile;
                                            } else if (C1981lr.this.f4568ik) {
                                                C1981lr c1981lr4 = C1981lr.this;
                                                c1981lr4.m6231lr(c1981lr4.f4570lr, bgrVar.mo9878ik());
                                                C1981lr.this.m6239ri(randomAccessFile);
                                            } else {
                                                i += i2;
                                                j2 += (long) i2;
                                                if (j2 % ((long) iXha) == 0 || j2 == jMo9985ri - length) {
                                                    C1976lr.m6206ri(randomAccessFile, bArr, Long.valueOf(j).intValue(), i, C1981lr.this.f4570lr.m6302bu());
                                                    j += (long) i;
                                                    i = 0;
                                                }
                                            }
                                            C1981lr.this.m6239ri(inputStreamMo9982ik);
                                            C1981lr.this.m6239ri(abstractC2672vrMo9876di);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        abstractC2672vr = abstractC2672vrMo9876di;
                                        try {
                                            C1981lr.this.m6227ka();
                                            C1981lr c1981lr5 = C1981lr.this;
                                            c1981lr5.m6238ri(c1981lr5.f4570lr, bgrVar != null ? bgrVar.mo9878ik() : 601, th.getMessage());
                                            C1981lr.this.m6239ri(randomAccessFile);
                                            C1981lr.this.m6239ri(inputStreamMo9982ik);
                                            C1981lr.this.m6239ri(abstractC2672vr);
                                        } finally {
                                            C1981lr.this.m6239ri(randomAccessFile);
                                            C1981lr.this.m6239ri(inputStreamMo9982ik);
                                            C1981lr.this.m6239ri(abstractC2672vr);
                                            C1981lr.this.m6239ri(bgrVar);
                                            C1981lr.this.f4570lr.slm();
                                            Integer.valueOf(C1981lr.this.f4570lr.m6304di());
                                            C1980ik.m6222ri(C1981lr.this.f4570lr);
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                randomAccessFile = randomAccessFile2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamMo9982ik = null;
                            randomAccessFile = null;
                        }
                    } else {
                        C1981lr c1981lr6 = C1981lr.this;
                        c1981lr6.m6238ri(c1981lr6.f4570lr, 601, "Network link failed.");
                        abstractC2672vrMo9876di = null;
                        inputStreamMo9982ik = null;
                    }
                    C1981lr.this.m6239ri(randomAccessFile2);
                    C1981lr.this.m6239ri(inputStreamMo9982ik);
                    C1981lr.this.m6239ri(abstractC2672vrMo9876di);
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamMo9982ik = null;
                    randomAccessFile = null;
                }
            }

            @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2649ik
            /* JADX INFO: renamed from: ri */
            public void mo6244ri(InterfaceC2651lr interfaceC2651lr, IOException iOException) {
                C1981lr c1981lr = C1981lr.this;
                c1981lr.m6238ri(c1981lr.f4570lr, 601, iOException.getMessage());
                C1980ik.m6222ri(C1981lr.this.f4570lr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m6227ka() {
        try {
            this.f4567fi.delete();
            this.f4569ka.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m6231lr(C1996ik c1996ik, int i) {
        synchronized (InterfaceC1994ri.ri.class) {
            for (InterfaceC1994ri.ri riVar : this.f4566di) {
                if (riVar != null) {
                    riVar.mo6288lr(c1996ik, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m6232lr() {
        if (this.f4567fi.exists()) {
            return true;
        }
        if (!this.f4570lr.m6300aw()) {
            if (this.f4569ka.length() >= this.f4570lr.m6304di()) {
                return true;
            }
            if (this.f4570lr.m6314ka() > 0 && this.f4569ka.length() >= this.f4570lr.m6314ka()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6237ri(C1996ik c1996ik, int i) {
        synchronized (InterfaceC1994ri.ri.class) {
            for (InterfaceC1994ri.ri riVar : this.f4566di) {
                if (riVar != null) {
                    riVar.mo6289ri(c1996ik, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6238ri(C1996ik c1996ik, int i, String str) {
        synchronized (InterfaceC1994ri.ri.class) {
            for (InterfaceC1994ri.ri riVar : this.f4566di) {
                if (riVar != null) {
                    riVar.mo6290ri(c1996ik, i, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6239ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public C1996ik m6240ri() {
        return this.f4570lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m6241ri(InterfaceC1994ri.ri riVar) {
        if (this.xha) {
            synchronized (InterfaceC1994ri.ri.class) {
                this.f4566di.add(riVar);
            }
            return;
        }
        this.f4566di.add(riVar);
        if (m6232lr()) {
            this.f4570lr.m6322mj(1);
            m6237ri(this.f4570lr, 200);
            C1980ik.m6222ri(this.f4570lr);
        } else {
            this.xha = true;
            this.f4570lr.m6322mj(0);
            m6225ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6242ri(boolean z) {
        this.f4568ik = z;
    }
}
