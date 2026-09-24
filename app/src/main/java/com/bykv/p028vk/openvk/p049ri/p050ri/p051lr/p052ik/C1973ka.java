package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C2002lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2010ri;
import com.bytedance.sdk.component.p165mj.p167ri.C2687ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.ihz;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C1973ka implements InterfaceC1972ik.di, InterfaceC1972ik.fi, InterfaceC1972ik.ik, InterfaceC1972ik.ka, InterfaceC1972ik.lr, InterfaceC1972ik.ri, InterfaceC1972ik.xha, InterfaceC2004ri, igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: ri */
    private static final SparseIntArray f4493ri = new SparseIntArray();

    /* JADX INFO: renamed from: aw */
    private boolean f4495aw;

    /* JADX INFO: renamed from: ay */
    private ArrayList<Runnable> f4496ay;

    /* JADX INFO: renamed from: co */
    private boolean f4498co;

    /* JADX INFO: renamed from: di */
    private SurfaceHolder f4499di;
    private volatile boolean dzy;

    /* JADX INFO: renamed from: fi */
    private SurfaceTexture f4501fi;
    private boolean igq;

    /* JADX INFO: renamed from: jc */
    private boolean f4505jc;

    /* JADX INFO: renamed from: kt */
    private volatile boolean f4507kt;
    private igq slm;
    private boolean wjv;

    /* JADX INFO: renamed from: lr */
    private final boolean f4508lr = false;

    /* JADX INFO: renamed from: ik */
    private final List<WeakReference<InterfaceC2004ri.ri>> f4504ik = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ka */
    private final ri f4506ka = new ri();
    private int xha = 0;

    /* JADX INFO: renamed from: mj */
    private int f4509mj = 3;
    private boolean jbs = false;

    /* JADX INFO: renamed from: qt */
    private volatile InterfaceC1972ik f4514qt = null;

    /* JADX INFO: renamed from: sf */
    private boolean f4515sf = false;
    private volatile int bgr = 201;

    /* JADX INFO: renamed from: vr */
    private long f4518vr = -1;

    /* JADX INFO: renamed from: bu */
    private boolean f4497bu = false;

    /* JADX INFO: renamed from: nr */
    private long f4510nr = 0;
    private long tan = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ac */
    private long f4494ac = 0;
    private long ihz = 0;

    /* JADX INFO: renamed from: uq */
    private long f4517uq = 0;

    /* JADX INFO: renamed from: fr */
    private int f4502fr = 0;

    /* JADX INFO: renamed from: su */
    private String f4516su = "0";

    /* JADX INFO: renamed from: zf */
    private C1996ik f4520zf = null;

    /* JADX INFO: renamed from: dw */
    private boolean f4500dw = false;
    private CountDownLatch ory = new CountDownLatch(1);
    private volatile int hcw = 200;

    /* JADX INFO: renamed from: oh */
    private AtomicBoolean f4511oh = new AtomicBoolean(false);

    /* JADX INFO: renamed from: xd */
    private Surface f4519xd = null;

    /* JADX INFO: renamed from: pv */
    private long f4512pv = 0;

    /* JADX INFO: renamed from: ig */
    private long f4503ig = 0;

    /* JADX INFO: renamed from: qd */
    private boolean f4513qd = false;
    private final Runnable srn = new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.1
        @Override // java.lang.Runnable
        public void run() {
            if (C1973ka.this.f4514qt == null) {
                return;
            }
            long jMo6175nr = C1973ka.this.mo6175nr();
            if (jMo6175nr > 0 && C1973ka.this.mo6167di() && C1973ka.this.tan != Long.MIN_VALUE) {
                try {
                    if (C1973ka.this.tan == jMo6175nr) {
                        if (!C1973ka.this.f4497bu && C1973ka.this.f4494ac >= 400) {
                            C1973ka.this.m6135lr(701, 800);
                            C1973ka.this.f4497bu = true;
                        }
                        C1973ka.this.f4494ac += (long) C1973ka.this.hcw;
                    } else {
                        if (C1973ka.this.f4497bu) {
                            C1973ka.this.f4510nr += C1973ka.this.f4494ac;
                            C1973ka.this.m6135lr(702, 800);
                            Long.valueOf(C1973ka.this.f4510nr);
                            Integer.valueOf(C1973ka.this.xha);
                        }
                        C1973ka.this.f4494ac = 0L;
                        C1973ka.this.f4497bu = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (C1973ka.this.mo6165bu() > 0) {
                if (C1973ka.this.tan != jMo6175nr) {
                    if (C1995ik.m6293ka()) {
                        Long.valueOf(C1973ka.this.tan);
                        Long.valueOf(jMo6175nr);
                    }
                    C1973ka c1973ka = C1973ka.this;
                    c1973ka.m6150ri(jMo6175nr, c1973ka.mo6165bu());
                }
                C1973ka.this.tan = jMo6175nr;
            }
            if (C1973ka.this.mo6173lr()) {
                C1973ka c1973ka2 = C1973ka.this;
                c1973ka2.m6150ri(c1973ka2.mo6165bu(), C1973ka.this.mo6165bu());
            } else if (C1973ka.this.slm != null) {
                C1973ka.this.slm.postDelayed(this, C1973ka.this.hcw);
            }
        }
    };

    /* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ik.ka$ri */
    class ri implements Runnable {

        /* JADX INFO: renamed from: ik */
        private boolean f4541ik;

        /* JADX INFO: renamed from: lr */
        private long f4542lr;

        ri() {
        }

        /* JADX INFO: renamed from: ri */
        public void m6190ri(long j) {
            this.f4542lr = j;
        }

        /* JADX INFO: renamed from: ri */
        public void m6191ri(boolean z) {
            this.f4541ik = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1973ka.this.f4514qt != null) {
                try {
                    if (!this.f4541ik) {
                        long jMo6096qt = C1973ka.this.f4514qt.mo6096qt();
                        C1973ka.this.f4518vr = Math.max(this.f4542lr, jMo6096qt);
                    }
                    long unused = C1973ka.this.f4518vr;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (C1973ka.this.slm != null) {
                C1973ka.this.slm.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public C1973ka() {
        m6156ri("SSMediaPlayerWrapper");
    }

    /* JADX INFO: renamed from: ay */
    private void m6121ay() {
        if (this.f4514qt == null) {
            return;
        }
        try {
            this.f4514qt.mo6088aw();
        } catch (Throwable unused) {
        }
        this.f4514qt.mo6104ri((InterfaceC1972ik.lr) null);
        this.f4514qt.mo6106ri((InterfaceC1972ik.xha) null);
        this.f4514qt.mo6105ri((InterfaceC1972ik.ri) null);
        this.f4514qt.mo6103ri((InterfaceC1972ik.ka) null);
        this.f4514qt.mo6102ri((InterfaceC1972ik.ik) null);
        this.f4514qt.mo6101ri((InterfaceC1972ik.fi) null);
        this.f4514qt.mo6100ri((InterfaceC1972ik.di) null);
        try {
            this.f4514qt.mo6089co();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: dw */
    private void m6123dw() {
        if (this.f4498co) {
            return;
        }
        this.f4498co = true;
        Iterator it = new ArrayList(this.f4496ay).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f4496ay.clear();
        this.f4498co = false;
    }

    /* JADX INFO: renamed from: fr */
    private void m6125fr() {
        igq igqVar = this.slm;
        if (igqVar == null || igqVar.getLooper() == null) {
            return;
        }
        try {
            this.slm.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.6
                @Override // java.lang.Runnable
                public void run() {
                    if (C1973ka.this.slm == null || C1973ka.this.slm.getLooper() == null) {
                        return;
                    }
                    try {
                        C2687ri.m10091ri().m10097ri(C1973ka.this.slm);
                        C1973ka.this.slm = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void hcw() {
        ArrayList<Runnable> arrayList = this.f4496ay;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f4496ay.clear();
    }

    private void igq() {
        this.f4507kt = true;
        this.jbs = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4517uq;
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6431ri(this, jElapsedRealtime);
            }
        }
    }

    private void ihz() {
        this.f4510nr = 0L;
        this.xha = 0;
        this.f4494ac = 0L;
        this.f4497bu = false;
        this.tan = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ik */
    private void m6127ik(C1996ik c1996ik) throws Throwable {
        c1996ik.slm();
        this.f4514qt.mo6107ri(c1996ik);
        c1996ik.slm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m6135lr(int i, int i2) {
        if (i == 701) {
            this.f4512pv = SystemClock.elapsedRealtime();
            this.xha++;
            for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().mo6430ri(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            Integer.valueOf(this.xha);
            return;
        }
        if (i != 702) {
            if (this.f4513qd && i == 3) {
                ory();
                igq();
                m6172lr(this.f4500dw);
                return;
            } else {
                if (i == 805) {
                    this.f4505jc = true;
                    return;
                }
                return;
            }
        }
        if (this.f4512pv > 0) {
            this.f4503ig += SystemClock.elapsedRealtime() - this.f4512pv;
            this.f4512pv = 0L;
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference2 : this.f4504ik) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().mo6428ri((InterfaceC2004ri) this, Integer.MAX_VALUE);
            }
        }
        Integer.valueOf(this.xha);
        Long.valueOf(this.f4503ig);
    }

    /* JADX INFO: renamed from: lr */
    private void m6136lr(long j) {
        this.f4506ka.m6190ri(j);
        if (this.igq) {
            m6138lr(this.f4506ka);
        } else if (m6141lr(this.f4520zf)) {
            m6138lr(this.f4506ka);
        } else {
            m6155ri(this.f4506ka);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m6137lr(C1996ik c1996ik, File file) {
        try {
            String strM6448ri = C2010ri.m6448ri(file);
            if (c1996ik.m6302bu().equals(strM6448ri)) {
                m6154ri(file);
                return;
            }
            JSONObject jSONObjectM6310ik = c1996ik.m6310ik();
            boolean zM6320lr = c1996ik.m6320lr();
            if (jSONObjectM6310ik != null) {
                jSONObjectM6310ik.put("file_hash", c1996ik.m6302bu());
                jSONObjectM6310ik.put("file_real_hash", strM6448ri);
                jSONObjectM6310ik.put("is_change_play_type", zM6320lr ? 1 : 0);
                jSONObjectM6310ik.put("error_real_code", 309);
                jSONObjectM6310ik.put("error_real_msg", "md5_not_match");
            }
            if (zM6320lr) {
                boolean zDelete = file.delete();
                if (jSONObjectM6310ik != null) {
                    jSONObjectM6310ik.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    m6127ik(c1996ik);
                    return;
                }
            }
            m6154ri(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m6138lr(Runnable runnable) {
        if (runnable == null || mo6174mj()) {
            return;
        }
        if (this.f4495aw) {
            m6155ri(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m6139lr(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f4514qt.mo6109ri(fileInputStream.getFD());
        fileInputStream.close();
    }

    /* JADX INFO: renamed from: lr */
    private boolean m6141lr(C1996ik c1996ik) {
        return c1996ik != null && c1996ik.xha();
    }

    private void ory() {
        ArrayList<Runnable> arrayList = this.f4496ay;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        m6123dw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6150ri(long j, long j2) {
        long j3;
        long j4;
        if (!this.f4507kt) {
            igq();
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference == null || weakReference.get() == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                weakReference.get().mo6432ri(this, j3, j4);
            }
            j = j3;
            j2 = j4;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6153ri(C1996ik c1996ik, File file) {
        if (c1996ik.m6330ri()) {
            m6137lr(c1996ik, file);
        } else {
            m6154ri(file);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6154ri(File file) {
        file.getAbsolutePath();
        try {
            if (ihz.m10229ri(C1995ik.m6295ri())) {
                this.f4514qt.mo6110ri(file.getAbsolutePath());
            } else {
                m6139lr(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6155ri(Runnable runnable) {
        try {
            if (this.f4496ay == null) {
                this.f4496ay = new ArrayList<>();
            }
            this.f4496ay.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6156ri(String str) {
        this.f4502fr = 0;
        this.slm = C2687ri.m10091ri().m10095ri(this, "csj_".concat(String.valueOf(str)));
        this.f4513qd = true;
        m6161uq();
    }

    /* JADX INFO: renamed from: ri */
    private boolean m6157ri(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: su */
    private void m6160su() {
        SparseIntArray sparseIntArray = f4493ri;
        int i = sparseIntArray.get(this.f4502fr);
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null) {
            sparseIntArray.put(this.f4502fr, 1);
            return;
        }
        int i2 = this.f4502fr;
        numValueOf.getClass();
        sparseIntArray.put(i2, i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uq */
    public void m6161uq() {
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.10
                @Override // java.lang.Runnable
                public void run() {
                    if (C1973ka.this.f4514qt == null) {
                        try {
                            C1973ka.this.f4514qt = new C1974lr();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (C1973ka.this.f4514qt == null) {
                            return;
                        }
                        InterfaceC1972ik unused = C1973ka.this.f4514qt;
                        C1973ka.this.f4516su = "0";
                        C1973ka.this.f4514qt.mo6101ri((InterfaceC1972ik.fi) C1973ka.this);
                        C1973ka.this.f4514qt.mo6104ri((InterfaceC1972ik.lr) C1973ka.this);
                        C1973ka.this.f4514qt.mo6102ri((InterfaceC1972ik.ik) C1973ka.this);
                        C1973ka.this.f4514qt.mo6105ri((InterfaceC1972ik.ri) C1973ka.this);
                        C1973ka.this.f4514qt.mo6100ri((InterfaceC1972ik.di) C1973ka.this);
                        C1973ka.this.f4514qt.mo6103ri((InterfaceC1972ik.ka) C1973ka.this);
                        C1973ka.this.f4514qt.mo6106ri((InterfaceC1972ik.xha) C1973ka.this);
                        try {
                            C1973ka.this.f4514qt.mo6092ik(false);
                        } catch (Throwable unused2) {
                        }
                        C1973ka.this.f4515sf = false;
                    }
                }
            });
        }
    }

    private void wjv() {
        m6138lr(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.14
            @Override // java.lang.Runnable
            public void run() {
                if (C1973ka.this.slm != null) {
                    C1973ka.this.slm.sendEmptyMessage(104);
                }
            }
        });
    }

    /* JADX INFO: renamed from: zf */
    private void m6162zf() {
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1973ka.this.f4514qt.mo6095mj();
                        C1973ka.this.bgr = 207;
                        C1973ka.this.dzy = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ac */
    public SurfaceTexture m6163ac() {
        return this.f4501fi;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m6164aw() {
        return this.bgr == 205;
    }

    public boolean bgr() {
        return this.f4505jc;
    }

    /* JADX INFO: renamed from: bu */
    public long mo6165bu() {
        long j = this.ihz;
        if (j != 0) {
            return j;
        }
        if (this.bgr == 206 || this.bgr == 207) {
            try {
                this.ihz = this.f4514qt.mo6112sf();
            } catch (Throwable unused) {
            }
        }
        return this.ihz;
    }

    /* JADX INFO: renamed from: co */
    public void m6166co() {
        if (mo6174mj()) {
            return;
        }
        this.f4495aw = true;
        hcw();
        igq igqVar = this.slm;
        if (igqVar != null) {
            try {
                igqVar.removeCallbacksAndMessages(null);
                if (this.f4514qt != null) {
                    this.slm.sendEmptyMessage(103);
                }
                m6125fr();
            } catch (Throwable unused) {
                m6125fr();
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: di */
    public boolean mo6167di() {
        igq igqVar;
        return (this.bgr == 206 || ((igqVar = this.slm) != null && igqVar.hasMessages(100))) && !this.dzy;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: fi */
    public int mo6168fi() {
        if (this.f4514qt == null || mo6174mj()) {
            return 0;
        }
        return this.f4514qt.mo6113vr();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.di
    /* JADX INFO: renamed from: ik */
    public void mo6114ik(InterfaceC1972ik interfaceC1972ik) {
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6434ri((InterfaceC2004ri) this, true);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: ik */
    public boolean mo6169ik() {
        return m6164aw() || mo6167di() || xha();
    }

    public void jbs() {
        if (mo6174mj() || this.f4514qt == null) {
            return;
        }
        this.f4511oh.set(true);
        if (this.bgr != 206) {
            ihz();
            this.dzy = false;
            this.f4506ka.m6191ri(true);
            m6136lr(0L);
            igq igqVar = this.slm;
            if (igqVar != null) {
                igqVar.removeCallbacks(this.srn);
                this.slm.postDelayed(this.srn, this.hcw);
            }
        }
        this.ory.countDown();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: ka */
    public int mo6170ka() {
        if (this.f4514qt == null || mo6174mj()) {
            return 0;
        }
        return this.f4514qt.bgr();
    }

    /* JADX INFO: renamed from: lr */
    public void m6171lr(int i) {
        this.f4509mj = i;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.fi
    /* JADX INFO: renamed from: lr */
    public void mo6115lr(InterfaceC1972ik interfaceC1972ik) {
        if (mo6174mj()) {
            return;
        }
        this.bgr = 205;
        try {
            C1996ik c1996ik = this.f4520zf;
            if (c1996ik != null) {
                float fM6334vr = c1996ik.m6334vr();
                if (fM6334vr > 0.0f) {
                    C2002lr c2002lr = new C2002lr();
                    c2002lr.m6421ri(fM6334vr);
                    this.f4514qt.mo6108ri(c2002lr);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.slm != null) {
            if (this.dzy) {
                m6162zf();
            } else {
                igq igqVar = this.slm;
                igqVar.sendMessage(igqVar.obtainMessage(100, -1, -1));
            }
        }
        f4493ri.delete(this.f4502fr);
        boolean z = this.f4513qd;
        boolean z2 = this.wjv;
        if (!z && !z2) {
            igq();
            this.wjv = true;
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6425lr(this);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m6172lr(final boolean z) {
        igq igqVar;
        if (mo6174mj() || (igqVar = this.slm) == null) {
            return;
        }
        igqVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.8
            @Override // java.lang.Runnable
            public void run() {
                if (C1973ka.this.mo6174mj() || C1973ka.this.f4514qt == null) {
                    return;
                }
                try {
                    C1973ka.this.f4500dw = z;
                    C1973ka.this.f4514qt.mo6093ka(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: lr */
    public boolean mo6173lr() {
        return this.bgr == 209;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.ka
    /* JADX INFO: renamed from: lr */
    public boolean mo6117lr(InterfaceC1972ik interfaceC1972ik, int i, int i2) {
        if (this.f4514qt != interfaceC1972ik) {
            return false;
        }
        if (i2 == -1004) {
            C1998ri c1998ri = new C1998ri(i, i2);
            for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().mo6433ri(this, c1998ri);
                }
            }
        }
        m6135lr(i, i2);
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: mj */
    public boolean mo6174mj() {
        return this.f4495aw;
    }

    /* JADX INFO: renamed from: nr */
    public long mo6175nr() {
        if (mo6174mj()) {
            return 0L;
        }
        if (this.bgr == 206 || this.bgr == 207) {
            try {
                return this.f4514qt.mo6096qt();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: qt */
    public void m6176qt() {
        if (mo6174mj() || this.slm == null) {
            return;
        }
        this.f4511oh.set(true);
        this.slm.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.11
            @Override // java.lang.Runnable
            public void run() {
                if (!C1973ka.this.xha() || C1973ka.this.f4514qt == null) {
                    return;
                }
                try {
                    C1973ka.this.f4514qt.mo6090di();
                    for (WeakReference weakReference : C1973ka.this.f4504ik) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((InterfaceC2004ri.ri) weakReference.get()).mo6422fi(C1973ka.this);
                        }
                    }
                    C1973ka.this.bgr = 206;
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m6177ri(int i) {
        if (mo6174mj()) {
            return;
        }
        this.hcw = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m6178ri(final long j) {
        if (mo6174mj()) {
            return;
        }
        if (this.bgr == 207 || this.bgr == 206 || this.bgr == 209) {
            m6138lr(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C1973ka.this.slm != null) {
                        C1973ka.this.slm.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6179ri(final SurfaceTexture surfaceTexture) {
        if (mo6174mj()) {
            return;
        }
        this.f4501fi = surfaceTexture;
        m6184ri(true);
        m6138lr(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.3
            @Override // java.lang.Runnable
            public void run() {
                C1973ka.this.m6161uq();
                if (C1973ka.this.slm != null) {
                    C1973ka.this.slm.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        int i = this.bgr;
        int i2 = message.what;
        if (this.f4514qt != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.bgr == 205 || this.bgr == 207 || this.bgr == 209) {
                            this.f4514qt.mo6090di();
                            this.f4517uq = SystemClock.elapsedRealtime();
                            this.bgr = 206;
                            long j = this.f4518vr;
                            if (j > 0) {
                                Long.valueOf(j);
                                Integer.valueOf(this.f4509mj);
                                this.f4514qt.mo6097ri(this.f4518vr, this.f4509mj);
                                this.f4518vr = -1L;
                            }
                            if (this.f4520zf != null) {
                                m6172lr(this.f4500dw);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.f4497bu) {
                            this.f4510nr += this.f4494ac;
                        }
                        this.f4497bu = false;
                        this.f4494ac = 0L;
                        this.tan = Long.MIN_VALUE;
                        if (this.bgr == 206 || this.bgr == 207 || this.bgr == 209) {
                            this.f4514qt.mo6095mj();
                            this.bgr = 207;
                            this.dzy = false;
                            for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().mo6424ka(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.f4514qt.mo6088aw();
                        this.bgr = 201;
                        return;
                    case 103:
                        try {
                            m6121ay();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<InterfaceC2004ri.ri> weakReference2 : this.f4504ik) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().mo6423ik(this);
                            }
                        }
                        this.bgr = 203;
                        return;
                    case 104:
                        if (this.bgr == 202 || this.bgr == 208) {
                            this.f4514qt.jbs();
                            return;
                        }
                        break;
                    case 105:
                        if (this.bgr == 205 || this.bgr == 206 || this.bgr == 208 || this.bgr == 207 || this.bgr == 209) {
                            this.f4514qt.xha();
                            this.bgr = Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.bgr == 206 || this.bgr == 207 || this.bgr == 209) {
                            this.f4514qt.mo6097ri(((Long) message.obj).longValue(), this.f4509mj);
                            return;
                        }
                        break;
                    case 107:
                        ihz();
                        if (this.bgr == 201 || this.bgr == 203) {
                            C1996ik c1996ik = (C1996ik) message.obj;
                            if (TextUtils.isEmpty(c1996ik.m6307fi())) {
                                c1996ik.m6327ri(C1995ik.m6294lr());
                            }
                            if (c1996ik.m6309fr()) {
                                this.f4514qt.mo6110ri(c1996ik.slm());
                                c1996ik.slm();
                            } else {
                                File file = new File(c1996ik.m6307fi(), c1996ik.m6302bu());
                                if (file.exists()) {
                                    m6153ri(c1996ik, file);
                                } else {
                                    m6127ik(c1996ik);
                                }
                            }
                            this.bgr = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.f4514qt.mo6099ri((SurfaceHolder) message.obj);
                        this.f4514qt.mo6094lr(true);
                        this.ory.await(1L, TimeUnit.SECONDS);
                        ory();
                        return;
                    case 111:
                        this.f4519xd = new Surface((SurfaceTexture) message.obj);
                        this.f4514qt.mo6098ri(this.f4519xd);
                        this.f4514qt.mo6094lr(true);
                        this.ory.await(1L, TimeUnit.SECONDS);
                        ory();
                        return;
                }
                this.bgr = 200;
                if (this.f4515sf) {
                    return;
                }
                C1998ri c1998ri = new C1998ri(308, i2);
                c1998ri.m6370ri(i + "," + i2);
                for (WeakReference<InterfaceC2004ri.ri> weakReference3 : this.f4504ik) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().mo6433ri(this, c1998ri);
                    }
                }
                this.f4515sf = true;
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6181ri(final SurfaceHolder surfaceHolder) {
        if (mo6174mj()) {
            return;
        }
        this.f4499di = surfaceHolder;
        m6184ri(true);
        m6138lr(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.4
            @Override // java.lang.Runnable
            public void run() {
                C1973ka.this.m6161uq();
                if (C1973ka.this.slm != null) {
                    C1973ka.this.slm.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.lr
    /* JADX INFO: renamed from: ri */
    public void mo6118ri(InterfaceC1972ik interfaceC1972ik) {
        this.bgr = Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        f4493ri.delete(this.f4502fr);
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6427ri(this);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.ri
    /* JADX INFO: renamed from: ri */
    public void mo6119ri(InterfaceC1972ik interfaceC1972ik, int i) {
        if (this.f4514qt != interfaceC1972ik) {
            return;
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6426lr(this, i);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo6120ri(InterfaceC1972ik interfaceC1972ik, int i, int i2, int i3, int i4) {
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6429ri((InterfaceC2004ri) this, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6182ri(final C1996ik c1996ik) {
        if (mo6174mj()) {
            return;
        }
        this.f4520zf = c1996ik;
        if (c1996ik != null) {
            this.f4513qd = this.f4513qd && !c1996ik.xha();
        }
        m6138lr(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.5
            @Override // java.lang.Runnable
            public void run() {
                C1973ka.this.m6161uq();
                if (C1973ka.this.slm != null) {
                    C1973ka.this.slm.obtainMessage(107, c1996ik).sendToTarget();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void mo6183ri(InterfaceC2004ri.ri riVar) {
        if (riVar == null) {
            return;
        }
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() == riVar) {
                return;
            }
        }
        this.f4504ik.add(new WeakReference<>(riVar));
    }

    /* JADX INFO: renamed from: ri */
    public void m6184ri(final boolean z) {
        if (mo6174mj()) {
            return;
        }
        this.igq = z;
        if (this.f4514qt != null) {
            this.f4514qt.mo6111ri(z);
            return;
        }
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.9
                @Override // java.lang.Runnable
                public void run() {
                    if (C1973ka.this.f4514qt != null) {
                        C1973ka.this.f4514qt.mo6111ri(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6185ri(boolean z, long j, boolean z2) {
        if (mo6174mj()) {
            return;
        }
        m6161uq();
        this.f4500dw = z2;
        this.f4511oh.set(true);
        this.dzy = false;
        m6172lr(z2);
        if (z) {
            this.f4518vr = j;
            wjv();
        } else {
            m6136lr(j);
        }
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
            this.slm.postDelayed(this.srn, this.hcw);
        }
        this.ory.countDown();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    /* JADX INFO: renamed from: ri */
    public boolean mo6186ri() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m6187ri(float f) {
        PlaybackParams playbackParamsMo6091fi;
        if (f <= 0.0f) {
            return false;
        }
        try {
            if (this.f4514qt == null || !mo6169ik()) {
                return false;
            }
            try {
                playbackParamsMo6091fi = this.f4514qt.mo6091fi();
            } catch (Throwable th) {
                C2707ac.m10196ik("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParamsMo6091fi = null;
            }
            if ((playbackParamsMo6091fi != null ? playbackParamsMo6091fi.getSpeed() : 0.0f) == f) {
                return true;
            }
            C2002lr c2002lr = new C2002lr();
            c2002lr.m6421ri(f);
            this.f4514qt.mo6108ri(c2002lr);
            return true;
        } catch (Throwable th2) {
            C2707ac.m10206ri("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.InterfaceC1972ik.ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6116ri(InterfaceC1972ik interfaceC1972ik, int i, int i2) {
        m6160su();
        this.bgr = 200;
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
        }
        if (m6157ri(i, i2)) {
            m6125fr();
        }
        if (!this.f4511oh.get()) {
            return true;
        }
        this.f4511oh.set(false);
        C1998ri c1998ri = new C1998ri(i, i2);
        for (WeakReference<InterfaceC2004ri.ri> weakReference : this.f4504ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo6433ri(this, c1998ri);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: sf */
    public void m6188sf() {
        igq igqVar;
        if (mo6174mj() || (igqVar = this.slm) == null) {
            return;
        }
        igqVar.removeMessages(100);
        this.dzy = true;
        if (this.f4513qd) {
            if (!this.jbs && !m6141lr(this.f4520zf)) {
                m6155ri(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C1973ka.this.slm != null) {
                            C1973ka.this.slm.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            igq igqVar2 = this.slm;
            if (igqVar2 != null) {
                igqVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.wjv && !m6141lr(this.f4520zf)) {
            m6155ri(new Runnable() { // from class: com.bykv.vk.openvk.ri.ri.lr.ik.ka.12
                @Override // java.lang.Runnable
                public void run() {
                    if (C1973ka.this.slm != null) {
                        C1973ka.this.slm.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        igq igqVar3 = this.slm;
        if (igqVar3 != null) {
            igqVar3.sendEmptyMessage(101);
        }
    }

    public int slm() {
        return this.xha;
    }

    public SurfaceHolder tan() {
        return this.f4499di;
    }

    /* JADX INFO: renamed from: vr */
    public long m6189vr() {
        if (this.f4497bu) {
            long j = this.f4494ac;
            if (j > 0) {
                return this.f4510nr + j;
            }
        }
        return this.f4510nr;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri
    public boolean xha() {
        igq igqVar;
        return ((this.bgr != 207 && !this.dzy) || (igqVar = this.slm) == null || igqVar.hasMessages(100)) ? false : true;
    }
}
