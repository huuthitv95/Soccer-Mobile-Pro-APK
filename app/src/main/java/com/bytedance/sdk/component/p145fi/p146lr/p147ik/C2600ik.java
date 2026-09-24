package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.bgr;
import com.bytedance.sdk.component.p145fi.ihz;
import com.bytedance.sdk.component.p145fi.jbs;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.C2607lr;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.C2615fi;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.C2616ik;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.C2617ka;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.C2618lr;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.C2619ri;
import com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p145fi.tan;
import com.bytedance.sdk.component.p145fi.xha;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2600ik implements jbs {

    /* JADX INFO: renamed from: ac */
    private xha f7271ac;

    /* JADX INFO: renamed from: aw */
    private volatile boolean f7272aw;

    /* JADX INFO: renamed from: ay */
    private int f7273ay;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private int f7274bu;

    /* JADX INFO: renamed from: co */
    private WeakReference<ImageView> f7275co;

    /* JADX INFO: renamed from: di */
    private ImageView.ScaleType f7276di;

    /* JADX INFO: renamed from: dw */
    private byte[] f7277dw;

    /* JADX INFO: renamed from: fi */
    private slm f7278fi;

    /* JADX INFO: renamed from: fr */
    private int f7279fr;
    private boolean igq;
    private int ihz;

    /* JADX INFO: renamed from: ik */
    private String f7280ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private String f7281ka;

    /* JADX INFO: renamed from: lr */
    private String f7282lr;

    /* JADX INFO: renamed from: mj */
    private int f7283mj;

    /* JADX INFO: renamed from: nr */
    private final Handler f7284nr;

    /* JADX INFO: renamed from: qt */
    private InterfaceC2622mj f7285qt;

    /* JADX INFO: renamed from: ri */
    Future<?> f7286ri;

    /* JADX INFO: renamed from: sf */
    private int f7287sf;
    private tan slm;

    /* JADX INFO: renamed from: su */
    private ExecutorService f7288su;
    private boolean tan;

    /* JADX INFO: renamed from: uq */
    private C2598di f7289uq;

    /* JADX INFO: renamed from: vr */
    private boolean f7290vr;
    private InterfaceC2597lr wjv;
    private Bitmap.Config xha;

    /* JADX INFO: renamed from: zf */
    private bgr f7291zf;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ik$lr */
    public static class lr implements InterfaceC2624qt {

        /* JADX INFO: renamed from: ac */
        private ExecutorService f7293ac;

        /* JADX INFO: renamed from: aw */
        private boolean f7294aw;
        private String bgr;

        /* JADX INFO: renamed from: bu */
        private InterfaceC2622mj f7295bu;

        /* JADX INFO: renamed from: co */
        private boolean f7296co;

        /* JADX INFO: renamed from: di */
        private Bitmap.Config f7297di;

        /* JADX INFO: renamed from: fi */
        private ImageView.ScaleType f7298fi;
        private boolean ihz;

        /* JADX INFO: renamed from: ik */
        private String f7299ik;

        /* JADX INFO: renamed from: ka */
        private String f7300ka;

        /* JADX INFO: renamed from: lr */
        private ImageView f7301lr;

        /* JADX INFO: renamed from: mj */
        private int f7302mj;

        /* JADX INFO: renamed from: nr */
        private int f7303nr;

        /* JADX INFO: renamed from: ri */
        private slm f7305ri;

        /* JADX INFO: renamed from: sf */
        private tan f7306sf;
        private C2598di slm;
        private int tan;

        /* JADX INFO: renamed from: uq */
        private bgr f7307uq;

        /* JADX INFO: renamed from: vr */
        private InterfaceC2597lr f7308vr;
        private int xha;
        private int jbs = 1;

        /* JADX INFO: renamed from: qt */
        private int f7304qt = 5;

        public lr(C2598di c2598di) {
            this.slm = c2598di;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: fi */
        public InterfaceC2624qt mo9651fi(int i) {
            this.tan = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ik */
        public InterfaceC2624qt mo9652ik(int i) {
            this.jbs = i;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public InterfaceC2624qt m9653ik(String str) {
            this.f7300ka = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ka */
        public InterfaceC2624qt mo9654ka(int i) {
            this.f7303nr = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: lr */
        public InterfaceC2624qt mo9655lr(int i) {
            this.f7302mj = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: lr */
        public InterfaceC2624qt mo9656lr(String str) {
            this.bgr = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public jbs mo9657ri(ImageView imageView) {
            this.f7301lr = imageView;
            return new C2600ik(this).m9610ac();
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public jbs mo9658ri(slm slmVar) {
            this.f7305ri = slmVar;
            return new C2600ik(this).m9610ac();
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public jbs mo9659ri(slm slmVar, int i) {
            this.f7304qt = i;
            return mo9658ri(slmVar);
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9660ri(int i) {
            this.xha = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9661ri(Bitmap.Config config) {
            this.f7297di = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9662ri(ImageView.ScaleType scaleType) {
            this.f7298fi = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9663ri(InterfaceC2622mj interfaceC2622mj) {
            this.f7295bu = interfaceC2622mj;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9664ri(tan tanVar) {
            this.f7306sf = tanVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9665ri(String str) {
            this.f7299ik = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2624qt
        /* JADX INFO: renamed from: ri */
        public InterfaceC2624qt mo9666ri(boolean z) {
            this.f7294aw = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ik$ri */
    private class ri implements slm {

        /* JADX INFO: renamed from: lr */
        private slm f7309lr;

        public ri(slm slmVar) {
            this.f7309lr = slmVar;
        }

        /* JADX INFO: renamed from: ri */
        private boolean m9668ri(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(C2600ik.this.f7280ik)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(final int i, final String str, final Throwable th) {
            if (C2600ik.this.f7274bu == 5) {
                C2600ik.this.f7284nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ri.this.f7309lr != null) {
                            ri.this.f7309lr.mo8254ri(i, str, th);
                        }
                    }
                });
                return;
            }
            slm slmVar = this.f7309lr;
            if (slmVar != null) {
                slmVar.mo8254ri(i, str, th);
            }
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(final InterfaceC2630sf interfaceC2630sf) {
            final ImageView imageView = (ImageView) C2600ik.this.f7275co.get();
            if (imageView != null && C2600ik.this.f7287sf != 3 && m9668ri(imageView)) {
                Object objMo9673lr = interfaceC2630sf.mo9673lr();
                if (objMo9673lr instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) interfaceC2630sf.mo9673lr();
                    C2600ik.this.f7284nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objMo9673lr instanceof Drawable) {
                    final Drawable drawable = (Drawable) interfaceC2630sf.mo9673lr();
                    C2600ik.this.f7284nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
                                cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (C2600ik.this.f7285qt != null && (interfaceC2630sf.mo9673lr() instanceof Bitmap)) {
                    InterfaceC2622mj interfaceC2622mj = C2600ik.this.f7285qt;
                    Bitmap bitmap2 = (Bitmap) interfaceC2630sf.mo9673lr();
                    Bitmap bitmapMo8253ri = interfaceC2622mj.mo8253ri(bitmap2);
                    if (bitmapMo8253ri != null) {
                        interfaceC2630sf.mo9677ri(bitmapMo8253ri);
                    }
                }
            } catch (Throwable unused) {
            }
            if (C2600ik.this.f7274bu == 5) {
                C2600ik.this.f7284nr.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ri.this.f7309lr != null) {
                            ri.this.f7309lr.mo8255ri(interfaceC2630sf);
                        }
                    }
                });
                return;
            }
            slm slmVar = this.f7309lr;
            if (slmVar != null) {
                slmVar.mo8255ri(interfaceC2630sf);
            }
        }
    }

    private C2600ik(lr lrVar) {
        this.f7284nr = new Handler(Looper.getMainLooper());
        this.tan = true;
        this.f7277dw = null;
        this.f7282lr = lrVar.f7300ka;
        this.f7278fi = new ri(lrVar.f7305ri);
        this.f7275co = new WeakReference<>(lrVar.f7301lr);
        this.f7276di = lrVar.f7298fi;
        this.xha = lrVar.f7297di;
        this.f7283mj = lrVar.xha;
        this.jbs = lrVar.f7302mj;
        this.f7287sf = lrVar.jbs;
        this.f7274bu = lrVar.f7304qt;
        this.slm = lrVar.f7306sf;
        this.wjv = m9617ri(lrVar);
        if (!TextUtils.isEmpty(lrVar.f7299ik)) {
            m9625lr(lrVar.f7299ik);
            m9630ri(lrVar.f7299ik);
        }
        this.bgr = lrVar.f7296co;
        this.f7290vr = lrVar.f7294aw;
        this.f7289uq = lrVar.slm;
        this.f7285qt = lrVar.f7295bu;
        this.f7279fr = lrVar.tan;
        this.f7273ay = lrVar.f7303nr;
        this.f7288su = lrVar.f7293ac;
        this.igq = lrVar.ihz;
        this.f7291zf = lrVar.f7307uq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ac */
    public jbs m9610ac() {
        try {
            if (this.f7289uq == null) {
                slm slmVar = this.f7278fi;
                if (slmVar != null) {
                    slmVar.mo8254ri(1005, "not init !", null);
                    return this;
                }
            } else {
                String strMo9571ri = mo9571ri();
                if (TextUtils.isEmpty(strMo9571ri)) {
                    this.f7278fi.mo8254ri(2000, "url is empty", null);
                    return this;
                }
                ihz ihzVarXha = this.f7289uq.xha();
                if (!strMo9571ri.startsWith("http://") && !strMo9571ri.startsWith(UrlConst.HTTPS) && ihzVarXha != null) {
                    ihzVarXha.mo9567ri(1006, "url is not validate ".concat(String.valueOf(strMo9571ri)));
                }
                ExecutorService executorServiceM9583di = this.f7288su == null ? this.f7289uq.m9583di() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2600ik c2600ik = C2600ik.this;
                        C2605ri c2605ri = new C2605ri(c2600ik, c2600ik.slm);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C2618lr());
                            arrayList.add(new C2615fi());
                            arrayList.add(new C2619ri());
                            arrayList.add(new C2616ik());
                            arrayList.add(new C2617ka());
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (C2600ik.this.f7272aw) {
                                    c2605ri.m9696ri(1003, "canceled", null);
                                    return;
                                }
                                InterfaceC2614di interfaceC2614di = (InterfaceC2614di) arrayList.get(i);
                                if (C2600ik.this.slm != null && interfaceC2614di != null && !"data_intercept".equals(interfaceC2614di.mo9721ri())) {
                                    C2600ik.this.slm.mo9742ri(interfaceC2614di.mo9721ri(), C2600ik.this);
                                }
                                C2600ik c2600ik2 = C2600ik.this;
                                boolean zMo9722ri = interfaceC2614di.mo9722ri(c2600ik2, c2600ik2.slm, c2605ri);
                                if (C2600ik.this.slm != null && !"data_intercept".equals(interfaceC2614di.mo9721ri())) {
                                    C2600ik.this.slm.mo9741lr(interfaceC2614di.mo9721ri(), C2600ik.this);
                                }
                                if (!zMo9722ri) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            c2605ri.m9696ri(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.igq) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.f7288su;
                if (executorService != null) {
                    this.f7286ri = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceM9583di != null) {
                    this.f7286ri = executorServiceM9583di.submit(runnable);
                    return this;
                }
            }
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    private InterfaceC2597lr m9617ri(lr lrVar) {
        if (lrVar.f7308vr != null) {
            return lrVar.f7308vr;
        }
        return !TextUtils.isEmpty(lrVar.bgr) ? C2607lr.m9701ri(new File(lrVar.bgr)) : C2607lr.jbs();
    }

    /* JADX INFO: renamed from: aw */
    public byte[] m9619aw() {
        return this.f7277dw;
    }

    public xha bgr() {
        return this.f7271ac;
    }

    /* JADX INFO: renamed from: bu */
    public InterfaceC2597lr m9620bu() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: co */
    public boolean m9621co() {
        return this.tan;
    }

    /* JADX INFO: renamed from: di */
    public slm m9622di() {
        return this.f7278fi;
    }

    /* JADX INFO: renamed from: fi */
    public int m9623fi() {
        return this.f7279fr;
    }

    @Override // com.bytedance.sdk.component.p145fi.jbs
    /* JADX INFO: renamed from: ik */
    public int mo9569ik() {
        return this.jbs;
    }

    public ImageView.ScaleType jbs() {
        return this.f7276di;
    }

    /* JADX INFO: renamed from: ka */
    public int m9624ka() {
        return this.f7273ay;
    }

    @Override // com.bytedance.sdk.component.p145fi.jbs
    /* JADX INFO: renamed from: lr */
    public int mo9570lr() {
        return this.f7283mj;
    }

    /* JADX INFO: renamed from: lr */
    public void m9625lr(String str) {
        WeakReference<ImageView> weakReference = this.f7275co;
        if (weakReference != null && weakReference.get() != null) {
            this.f7275co.get().setTag(1094453505, str);
        }
        this.f7280ik = str;
    }

    /* JADX INFO: renamed from: mj */
    public String m9626mj() {
        return this.f7280ik;
    }

    /* JADX INFO: renamed from: nr */
    public bgr m9627nr() {
        return this.f7291zf;
    }

    /* JADX INFO: renamed from: qt */
    public Bitmap.Config m9628qt() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.p145fi.jbs
    /* JADX INFO: renamed from: ri */
    public String mo9571ri() {
        return this.f7282lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m9629ri(int i) {
        this.ihz = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m9630ri(String str) {
        this.f7281ka = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m9631ri(boolean z) {
        this.tan = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m9632ri(byte[] bArr) {
        this.f7277dw = bArr;
    }

    /* JADX INFO: renamed from: sf */
    public int m9633sf() {
        return this.f7287sf;
    }

    public C2598di slm() {
        return this.f7289uq;
    }

    public String tan() {
        return m9626mj() + m9633sf();
    }

    /* JADX INFO: renamed from: vr */
    public int m9634vr() {
        return this.ihz;
    }

    public String xha() {
        return this.f7281ka;
    }
}
