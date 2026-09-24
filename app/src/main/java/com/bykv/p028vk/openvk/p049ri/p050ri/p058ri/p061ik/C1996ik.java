package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C1996ik implements Serializable {

    /* JADX INFO: renamed from: ac */
    private boolean f4610ac;
    private String bgr;

    /* JADX INFO: renamed from: bu */
    private String f4613bu;

    /* JADX INFO: renamed from: di */
    private C1997lr f4615di;
    private int igq;
    private int ihz;

    /* JADX INFO: renamed from: ik */
    public int f4618ik;
    private boolean jbs;

    /* JADX INFO: renamed from: lr */
    public String f4620lr;

    /* JADX INFO: renamed from: mj */
    private String f4621mj;

    /* JADX INFO: renamed from: nr */
    private long f4622nr;

    /* JADX INFO: renamed from: qt */
    private boolean f4623qt;
    private int slm;
    private boolean tan;

    /* JADX INFO: renamed from: uq */
    private int f4627uq;

    /* JADX INFO: renamed from: vr */
    private int f4628vr;
    private C1997lr xha;

    /* JADX INFO: renamed from: sf */
    private int f4625sf = 204800;

    /* JADX INFO: renamed from: co */
    private int f4614co = 0;

    /* JADX INFO: renamed from: aw */
    private int f4611aw = 0;

    /* JADX INFO: renamed from: ri */
    protected float f4624ri = -1.0f;

    /* JADX INFO: renamed from: ka */
    public final HashMap<String, Object> f4619ka = new HashMap<>();
    private int wjv = 10000;

    /* JADX INFO: renamed from: ay */
    private int f4612ay = 10000;

    /* JADX INFO: renamed from: fr */
    private int f4617fr = 10000;

    /* JADX INFO: renamed from: su */
    private int f4626su = 0;

    /* JADX INFO: renamed from: fi */
    public int f4616fi = 1;

    /* JADX INFO: renamed from: zf */
    private JSONObject f4629zf = new JSONObject();

    public C1996ik(String str, C1997lr c1997lr, C1997lr c1997lr2, int i, int i2) {
        this.ihz = 0;
        this.f4627uq = 0;
        this.f4621mj = str;
        this.f4615di = c1997lr;
        this.xha = c1997lr2;
        this.ihz = i;
        this.f4627uq = i2;
    }

    /* JADX INFO: renamed from: ac */
    public int m6299ac() {
        return this.f4612ay;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m6300aw() {
        if (bgr()) {
            return this.xha.ihz();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.ihz();
        }
        return true;
    }

    /* JADX INFO: renamed from: ay */
    public C1997lr m6301ay() {
        return this.xha;
    }

    public boolean bgr() {
        C1997lr c1997lr;
        if (this.f4627uq != 1 || (c1997lr = this.xha) == null || TextUtils.isEmpty(c1997lr.m6364sf())) {
            return false;
        }
        if (C1995ik.m6291fi() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.ihz == 1;
    }

    /* JADX INFO: renamed from: bu */
    public String m6302bu() {
        if (bgr()) {
            return this.xha.bgr();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.bgr();
        }
        return null;
    }

    /* JADX INFO: renamed from: co */
    public long m6303co() {
        if (bgr()) {
            return this.xha.m6342fi();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.m6342fi();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: di */
    public int m6304di() {
        if (bgr()) {
            return this.xha.m6366vr();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.m6366vr();
        }
        return 0;
    }

    /* JADX INFO: renamed from: di */
    public void m6305di(int i) {
        this.f4612ay = i;
    }

    /* JADX INFO: renamed from: fi */
    public synchronized Object m6306fi(String str) {
        return this.f4619ka.get(str);
    }

    /* JADX INFO: renamed from: fi */
    public String m6307fi() {
        return this.f4621mj;
    }

    /* JADX INFO: renamed from: fi */
    public void m6308fi(int i) {
        this.wjv = i;
    }

    /* JADX INFO: renamed from: fr */
    public boolean m6309fr() {
        return this.jbs;
    }

    public int ihz() {
        return this.f4617fr;
    }

    /* JADX INFO: renamed from: ik */
    public JSONObject m6310ik() {
        return this.f4629zf;
    }

    /* JADX INFO: renamed from: ik */
    public void m6311ik(int i) {
        this.slm = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m6312ik(String str) {
        this.f4613bu = str;
    }

    /* JADX INFO: renamed from: ik */
    public void m6313ik(boolean z) {
        this.f4623qt = z;
    }

    public int jbs() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ka */
    public int m6314ka() {
        return this.f4629zf.optInt("pitaya_cache_size", 0);
    }

    /* JADX INFO: renamed from: ka */
    public void m6315ka(int i) {
        this.f4618ik = i;
    }

    /* JADX INFO: renamed from: ka */
    public void m6316ka(String str) {
        this.f4620lr = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m6317lr(int i) {
        this.f4628vr = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m6318lr(String str) {
        this.bgr = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m6319lr(boolean z) {
        this.jbs = z;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m6320lr() {
        return this.igq == 2;
    }

    /* JADX INFO: renamed from: mj */
    public int m6321mj() {
        return this.f4628vr;
    }

    /* JADX INFO: renamed from: mj */
    public void m6322mj(int i) {
        this.f4626su = i;
    }

    /* JADX INFO: renamed from: nr */
    public int m6323nr() {
        return this.ihz;
    }

    /* JADX INFO: renamed from: qt */
    public long m6324qt() {
        return this.f4622nr;
    }

    /* JADX INFO: renamed from: ri */
    public void m6325ri(int i) {
        this.igq = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m6326ri(long j) {
        this.f4622nr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m6327ri(String str) {
        this.f4621mj = str;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m6328ri(String str, Object obj) {
        this.f4619ka.put(str, obj);
    }

    /* JADX INFO: renamed from: ri */
    public void m6329ri(boolean z) {
        this.tan = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m6330ri() {
        int i = this.igq;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m6331sf() {
        return this.tan;
    }

    public String slm() {
        if (bgr()) {
            return this.xha.m6364sf();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.m6364sf();
        }
        return null;
    }

    /* JADX INFO: renamed from: su */
    public boolean m6332su() {
        return this.f4623qt;
    }

    public int tan() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: uq */
    public int m6333uq() {
        return this.f4626su;
    }

    /* JADX INFO: renamed from: vr */
    public float m6334vr() {
        float f = this.f4624ri;
        if (f != -1.0f) {
            return f;
        }
        if (bgr()) {
            return this.xha.m6354mj();
        }
        C1997lr c1997lr = this.f4615di;
        if (c1997lr != null) {
            return c1997lr.m6354mj();
        }
        return -1.0f;
    }

    public C1997lr wjv() {
        return this.f4615di;
    }

    public void xha(int i) {
        this.f4617fr = i;
    }

    public boolean xha() {
        return this.f4610ac;
    }
}
