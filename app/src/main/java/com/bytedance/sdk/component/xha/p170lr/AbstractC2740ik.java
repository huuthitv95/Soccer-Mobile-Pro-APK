package com.bytedance.sdk.component.xha.p170lr;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import com.bytedance.sdk.component.xha.C2744ri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2740ik {

    /* JADX INFO: renamed from: di */
    int f7824di;

    /* JADX INFO: renamed from: fi */
    String f7825fi;

    /* JADX INFO: renamed from: ik */
    protected AbstractC2671sf f7826ik;

    /* JADX INFO: renamed from: lr */
    private List<String> f7828lr;

    /* JADX INFO: renamed from: ka */
    protected String f7827ka = null;
    protected final Map<String, String> xha = new HashMap();

    /* JADX INFO: renamed from: mj */
    protected String f7829mj = null;

    /* JADX INFO: renamed from: ri */
    private String f7831ri = null;

    /* JADX INFO: renamed from: qt */
    private long f7830qt = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    protected boolean jbs = false;

    public AbstractC2740ik(AbstractC2671sf abstractC2671sf) {
        this.f7826ik = abstractC2671sf;
        try {
            m10367ka(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: fi */
    public String m10363fi() {
        return this.f7829mj;
    }

    /* JADX INFO: renamed from: ik */
    public String m10364ik() {
        return this.f7831ri;
    }

    /* JADX INFO: renamed from: ik */
    public void m10365ik(String str) {
        this.f7829mj = str;
    }

    /* JADX INFO: renamed from: ka */
    public String m10366ka() {
        return this.f7827ka;
    }

    /* JADX INFO: renamed from: ka */
    public void m10367ka(String str) {
        this.f7827ka = str;
    }

    /* JADX INFO: renamed from: ka */
    public void m10368ka(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.xha.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void mo10369lr() {
        AbstractC2671sf abstractC2671sf;
        if (this.f7827ka == null || (abstractC2671sf = this.f7826ik) == null) {
            return;
        }
        AbstractC2650ka abstractC2650kaMo9986ri = abstractC2671sf.mo9986ri();
        synchronized (abstractC2650kaMo9986ri) {
            for (InterfaceC2651lr interfaceC2651lr : abstractC2650kaMo9986ri.mo9917ik()) {
                if (this.f7827ka.equals(interfaceC2651lr.mo9924ri().mo9885ik())) {
                    interfaceC2651lr.mo9922ik();
                }
            }
            for (InterfaceC2651lr interfaceC2651lr2 : abstractC2650kaMo9986ri.mo9918ka()) {
                if (this.f7827ka.equals(interfaceC2651lr2.mo9924ri().mo9885ik())) {
                    interfaceC2651lr2.mo9922ik();
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    protected void m10370lr(AbstractC2646co.ri riVar) {
        if (riVar != null && this.xha.size() > 0) {
            for (Map.Entry<String, String> entry : this.xha.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    riVar.m9897lr(key, value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m10371lr(String str) {
        this.f7825fi = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m10372lr(String str, String str2) {
        this.xha.put(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m10373ri(int i) {
        this.f7824di = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m10374ri(long j, TimeUnit timeUnit) {
        this.f7830qt = timeUnit.toMillis(j);
    }

    /* JADX INFO: renamed from: ri */
    protected void m10375ri(AbstractC2646co.ri riVar) {
        if (C2744ri.m10405di()) {
            List<String> list = this.f7828lr;
            if (list != null && !list.isEmpty()) {
                riVar.m9908ri(this.f7828lr);
            }
            riVar.m9901ri(this.f7830qt);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m10376ri(String str) {
        this.f7831ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m10377ri(List<String> list) {
        this.f7828lr = list;
    }
}
