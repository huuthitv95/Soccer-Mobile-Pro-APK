package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.tracker.network.toolbox.C13855e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.t */
/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13850t<T> implements Comparable<AbstractC13850t<T>> {

    /* JADX INFO: renamed from: a */
    private InterfaceC13832c f39520a;

    /* JADX INFO: renamed from: b */
    private String f39521b;

    /* JADX INFO: renamed from: c */
    private volatile C13846p f39522c;

    /* JADX INFO: renamed from: d */
    private long f39523d;

    /* JADX INFO: renamed from: e */
    private Map<String, String> f39524e;

    /* JADX INFO: renamed from: f */
    private int f39525f;

    /* JADX INFO: renamed from: g */
    private final String f39526g;

    /* JADX INFO: renamed from: h */
    private final int f39527h;

    /* JADX INFO: renamed from: i */
    private final String f39528i;

    /* JADX INFO: renamed from: j */
    private final int f39529j;

    /* JADX INFO: renamed from: k */
    private final Object f39530k;

    /* JADX INFO: renamed from: l */
    private C13867v.a f39531l;

    /* JADX INFO: renamed from: m */
    private Integer f39532m;

    /* JADX INFO: renamed from: n */
    private C13866u f39533n;

    /* JADX INFO: renamed from: o */
    private boolean f39534o;

    /* JADX INFO: renamed from: p */
    private boolean f39535p;

    /* JADX INFO: renamed from: q */
    private boolean f39536q;

    /* JADX INFO: renamed from: r */
    private boolean f39537r;

    /* JADX INFO: renamed from: s */
    private boolean f39538s;

    /* JADX INFO: renamed from: t */
    private InterfaceC13869x f39539t;

    /* JADX INFO: renamed from: u */
    private InterfaceC13830b.a f39540u;

    /* JADX INFO: renamed from: v */
    private long f39541v;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.t$a */
    /* JADX INFO: compiled from: Request.java */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC13850t(int i, String str) {
        this(i, str, 0);
    }

    public AbstractC13850t(int i, String str, int i2) {
        this(i, str, i2, "un_known");
    }

    public AbstractC13850t(int i, String str, int i2, String str2) {
        this.f39530k = new Object();
        this.f39534o = false;
        this.f39535p = false;
        this.f39536q = false;
        this.f39537r = false;
        this.f39538s = false;
        this.f39540u = null;
        this.f39541v = 0L;
        this.f39525f = i;
        this.f39526g = str;
        this.f39527h = i2;
        this.f39528i = str2;
        m41218a((InterfaceC13869x) new C13835e());
        this.f39529j = m41213b(str);
        this.f39523d = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m41212a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append(C11341A5.f23808U);
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb.append(Typography.amp);
                    }
                }
            }
            if (!map.containsKey("rk") || !map.containsKey("erk") || !"1".equals(map.get("erk"))) {
                return sb.toString().getBytes(str);
            }
            return ("p=" + URLEncoder.encode(C13229v0.m37905b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m41213b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m41214A() {
        return this.f39538s;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m41215B() {
        return this.f39537r;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC13850t<T> abstractC13850t) {
        a aVarMo41241l = mo41241l();
        a aVarMo41241l2 = abstractC13850t.mo41241l();
        return aVarMo41241l == aVarMo41241l2 ? this.f39532m.intValue() - abstractC13850t.f39532m.intValue() : aVarMo41241l2.ordinal() - aVarMo41241l.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public AbstractC13850t<?> m41217a(C13866u c13866u) {
        this.f39533n = c13866u;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public AbstractC13850t<?> m41218a(InterfaceC13869x interfaceC13869x) {
        this.f39539t = interfaceC13869x;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC13850t<?> m41219a(boolean z) {
        this.f39534o = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected abstract C13867v<T> mo41116a(C13847q c13847q);

    /* JADX INFO: renamed from: a */
    void m41220a(int i) {
        C13866u c13866u = this.f39533n;
        if (c13866u != null) {
            c13866u.m41328a(this, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41221a(C13846p c13846p) {
        this.f39522c = c13846p;
    }

    /* JADX INFO: renamed from: a */
    public void m41222a(C13867v.a aVar) {
        this.f39531l = aVar;
    }

    /* JADX INFO: renamed from: a */
    void m41223a(C13867v<?> c13867v) {
        synchronized (this.f39530k) {
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo41118a(T t);

    /* JADX INFO: renamed from: a */
    public void m41224a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m41225a(String str, String str2) {
        if (this.f39524e == null) {
            this.f39524e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f39524e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo41108a() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final AbstractC13850t<?> m41226b(int i) {
        this.f39532m = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final AbstractC13850t<?> m41227b(boolean z) {
        this.f39538s = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m41228b(AbstractC13831b0 abstractC13831b0) {
        C13867v.a aVar;
        synchronized (this.f39530k) {
            aVar = this.f39531l;
        }
        if (aVar != null) {
            aVar.mo41117a(abstractC13831b0);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte[] m41229b() {
        Map<String, String> mapMo41112i = mo41112i();
        if (mapMo41112i == null || mapMo41112i.size() <= 0) {
            this.f39541v = 0L;
            return null;
        }
        byte[] bArrM41212a = m41212a(mapMo41112i, m41239j());
        this.f39541v = bArrM41212a.length;
        return bArrM41212a;
    }

    /* JADX INFO: renamed from: c */
    protected AbstractC13831b0 m41230c(AbstractC13831b0 abstractC13831b0) {
        return abstractC13831b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final AbstractC13850t<?> m41231c(boolean z) {
        this.f39537r = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m41232c() {
        return "application/x-www-form-urlencoded; charset=" + m41239j();
    }

    /* JADX INFO: renamed from: c */
    void m41233c(String str) {
        C13866u c13866u = this.f39533n;
        if (c13866u != null) {
            c13866u.m41331c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC13830b.a m41234d() {
        return this.f39540u;
    }

    /* JADX INFO: renamed from: d */
    public String m41235d(String str) {
        if (this.f39524e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f39524e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public String m41236e() {
        if (!TextUtils.isEmpty(this.f39521b)) {
            return this.f39521b;
        }
        if (this.f39520a == null) {
            this.f39520a = new C13855e();
        }
        String strMo41092a = this.f39520a.mo41092a(this);
        this.f39521b = strMo41092a;
        return strMo41092a;
    }

    /* JADX INFO: renamed from: f */
    public Map<String, String> mo41111f() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: g */
    public int m41237g() {
        return this.f39525f;
    }

    /* JADX INFO: renamed from: h */
    public C13846p m41238h() {
        return this.f39522c;
    }

    /* JADX INFO: renamed from: i */
    protected Map<String, String> mo41112i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    protected String m41239j() {
        return "UTF-8";
    }

    /* JADX INFO: renamed from: k */
    public int m41240k() {
        return this.f39527h;
    }

    /* JADX INFO: renamed from: l */
    public a mo41241l() {
        return a.NORMAL;
    }

    /* JADX INFO: renamed from: m */
    public long m41242m() {
        return this.f39541v;
    }

    /* JADX INFO: renamed from: n */
    public long m41243n() {
        return SystemClock.elapsedRealtime() - this.f39523d;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC13869x mo41113o() {
        return this.f39539t;
    }

    /* JADX INFO: renamed from: p */
    public String m41244p() {
        return this.f39528i;
    }

    /* JADX INFO: renamed from: q */
    public final int m41245q() {
        InterfaceC13869x interfaceC13869xMo41113o = mo41113o();
        if (interfaceC13869xMo41113o == null) {
            return 30000;
        }
        return interfaceC13869xMo41113o.mo41100b();
    }

    /* JADX INFO: renamed from: r */
    public final long m41246r() {
        InterfaceC13869x interfaceC13869xMo41113o = mo41113o();
        if (interfaceC13869xMo41113o == null) {
            return WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        }
        long jMo41098a = interfaceC13869xMo41113o.mo41098a();
        return jMo41098a < 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : jMo41098a;
    }

    /* JADX INFO: renamed from: s */
    public int m41247s() {
        return this.f39529j;
    }

    /* JADX INFO: renamed from: t */
    public String m41248t() {
        return this.f39526g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(m41247s());
        StringBuilder sb = new StringBuilder();
        sb.append(m41250v() ? "[X] " : "[ ] ");
        sb.append(m41248t());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo41241l());
        sb.append(" ");
        sb.append(this.f39532m);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m41249u() {
        boolean z;
        synchronized (this.f39530k) {
            z = this.f39536q;
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    public boolean m41250v() {
        boolean z;
        synchronized (this.f39530k) {
            z = this.f39535p;
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    public void m41251w() {
        synchronized (this.f39530k) {
            this.f39536q = true;
        }
    }

    /* JADX INFO: renamed from: x */
    void m41252x() {
        synchronized (this.f39530k) {
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m41253y() {
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m41254z() {
        return this.f39534o;
    }
}
