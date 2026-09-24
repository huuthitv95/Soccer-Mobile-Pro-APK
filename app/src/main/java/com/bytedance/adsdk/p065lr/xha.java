package com.bytedance.adsdk.p065lr;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.C2054di;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.bytedance.adsdk.p065lr.p068ik.C2069ka;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2058fi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: aw */
    private float f5364aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co */
    private float f5366co;

    /* JADX INFO: renamed from: di */
    private List<C2054di> f5367di;

    /* JADX INFO: renamed from: fi */
    private Map<String, C2056ik> f5368fi;

    /* JADX INFO: renamed from: ik */
    private Map<String, List<C2058fi>> f5369ik;
    private List<C2058fi> jbs;

    /* JADX INFO: renamed from: ka */
    private Map<String, C2127qt> f5370ka;

    /* JADX INFO: renamed from: mj */
    private LongSparseArray<C2058fi> f5372mj;

    /* JADX INFO: renamed from: nr */
    private C2164ri f5373nr;

    /* JADX INFO: renamed from: qt */
    private Rect f5374qt;

    /* JADX INFO: renamed from: sf */
    private float f5376sf;
    private C2162ik slm;
    private C2163lr tan;
    private SparseArray<C2069ka> xha;

    /* JADX INFO: renamed from: ri */
    private final C2126nr f5375ri = new C2126nr();

    /* JADX INFO: renamed from: lr */
    private final HashSet<String> f5371lr = new HashSet<>();

    /* JADX INFO: renamed from: vr */
    private int f5377vr = 0;

    /* JADX INFO: renamed from: bu */
    private String f5365bu = "";

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.xha$ik */
    public static class C2162ik {

        /* JADX INFO: renamed from: di */
        public String f5378di;

        /* JADX INFO: renamed from: fi */
        public int[] f5379fi;

        /* JADX INFO: renamed from: ik */
        public String f5380ik;

        /* JADX INFO: renamed from: ka */
        public String f5381ka;

        /* JADX INFO: renamed from: lr */
        public String f5382lr;

        /* JADX INFO: renamed from: ri */
        public int f5383ri;
        public JSONArray xha;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.xha$lr */
    public static class C2163lr {

        /* JADX INFO: renamed from: ik */
        public JSONArray f5384ik;

        /* JADX INFO: renamed from: lr */
        public int[][] f5385lr;

        /* JADX INFO: renamed from: ri */
        public String f5386ri;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.xha$ri */
    public static class C2164ri {

        /* JADX INFO: renamed from: di */
        public String f5387di;

        /* JADX INFO: renamed from: fi */
        public int f5388fi;

        /* JADX INFO: renamed from: ik */
        public Map<String, Object> f5389ik;

        /* JADX INFO: renamed from: ka */
        public int f5390ka;

        /* JADX INFO: renamed from: lr */
        public Map<String, Object> f5391lr;

        /* JADX INFO: renamed from: ri */
        public int f5392ri;
        public JSONArray xha;
    }

    /* JADX INFO: renamed from: aw */
    public List<C2058fi> m7180aw() {
        return this.jbs;
    }

    public SparseArray<C2069ka> bgr() {
        return this.xha;
    }

    /* JADX INFO: renamed from: bu */
    public float m7181bu() {
        return this.f5366co - this.f5376sf;
    }

    /* JADX INFO: renamed from: co */
    public float m7182co() {
        return this.f5364aw;
    }

    /* JADX INFO: renamed from: di */
    public float m7183di() {
        return this.f5376sf;
    }

    /* JADX INFO: renamed from: fi */
    public float m7184fi() {
        return (long) ((m7181bu() / this.f5364aw) * 1000.0f);
    }

    /* JADX INFO: renamed from: ik */
    public C2054di m7185ik(String str) {
        int size = this.f5367di.size();
        for (int i = 0; i < size; i++) {
            C2054di c2054di = this.f5367di.get(i);
            if (c2054di.m6700ri(str)) {
                return c2054di;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    public C2126nr m7186ik() {
        return this.f5375ri;
    }

    public String jbs() {
        return this.f5365bu;
    }

    /* JADX INFO: renamed from: ka */
    public Rect m7187ka() {
        return this.f5374qt;
    }

    /* JADX INFO: renamed from: lr */
    public int m7188lr() {
        return this.f5377vr;
    }

    /* JADX INFO: renamed from: lr */
    public List<C2058fi> m7189lr(String str) {
        return this.f5369ik.get(str);
    }

    /* JADX INFO: renamed from: lr */
    public void m7190lr(boolean z) {
        this.f5375ri.m7055ri(z);
    }

    /* JADX INFO: renamed from: mj */
    public C2162ik m7191mj() {
        return this.slm;
    }

    /* JADX INFO: renamed from: qt */
    public C2163lr m7192qt() {
        return this.tan;
    }

    /* JADX INFO: renamed from: ri */
    public float m7193ri(float f) {
        return C2018fi.m6560ri(this.f5376sf, this.f5366co, f);
    }

    /* JADX INFO: renamed from: ri */
    public C2058fi m7194ri(long j) {
        return this.f5372mj.get(j);
    }

    /* JADX INFO: renamed from: ri */
    public void m7195ri(int i) {
        this.f5377vr += i;
    }

    /* JADX INFO: renamed from: ri */
    public void m7196ri(Rect rect, float f, float f2, float f3, List<C2058fi> list, LongSparseArray<C2058fi> longSparseArray, Map<String, List<C2058fi>> map, Map<String, C2127qt> map2, SparseArray<C2069ka> sparseArray, Map<String, C2056ik> map3, List<C2054di> list2, C2162ik c2162ik, String str, C2164ri c2164ri, C2163lr c2163lr) {
        this.f5374qt = rect;
        this.f5376sf = f;
        this.f5366co = f2;
        this.f5364aw = f3;
        this.jbs = list;
        this.f5372mj = longSparseArray;
        this.f5369ik = map;
        this.f5370ka = map2;
        this.xha = sparseArray;
        this.f5368fi = map3;
        this.f5367di = list2;
        this.slm = c2162ik;
        this.f5365bu = str;
        this.f5373nr = c2164ri;
        this.tan = c2163lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m7197ri(String str) {
        this.f5371lr.add(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m7198ri(boolean z) {
        this.bgr = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7199ri() {
        return this.bgr;
    }

    /* JADX INFO: renamed from: sf */
    public C2164ri m7200sf() {
        return this.f5373nr;
    }

    public Map<String, C2127qt> slm() {
        return this.f5370ka;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C2058fi> it = this.jbs.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m6725ri("\t"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: vr */
    public Map<String, C2056ik> m7201vr() {
        return this.f5368fi;
    }

    public float xha() {
        return this.f5366co;
    }
}
