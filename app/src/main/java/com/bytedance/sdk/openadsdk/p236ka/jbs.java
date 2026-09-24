package com.bytedance.sdk.openadsdk.p236ka;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2638lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: di */
    private int f12360di;

    /* JADX INFO: renamed from: fi */
    private final boolean f12361fi;

    /* JADX INFO: renamed from: mj */
    private final WebView f12365mj;

    /* JADX INFO: renamed from: qt */
    private long f12366qt;

    /* JADX INFO: renamed from: ri */
    private final wjv f12367ri;
    private int xha;
    private String jbs = "landingpage";

    /* JADX INFO: renamed from: lr */
    private final Map<Integer, Long> f12364lr = new HashMap();

    /* JADX INFO: renamed from: ik */
    private final List<Integer> f12362ik = new ArrayList();

    /* JADX INFO: renamed from: ka */
    private final Map<Integer, String> f12363ka = new HashMap();

    public jbs(wjv wjvVar, WebView webView, boolean z) {
        this.f12367ri = wjvVar;
        this.f12365mj = webView;
        this.f12361fi = z;
    }

    /* JADX INFO: renamed from: lr */
    private void m15573lr(boolean z) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.f12365mj.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.f12360di = currentIndex + 1;
                    if (this.f12361fi) {
                        this.f12360di = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.xha = currentIndex2 + 1;
                if (this.f12361fi) {
                    this.xha = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("ArbitrageLandingLog", th.toString());
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m15574ri(boolean z) {
        int i = z ? this.f12360di : this.xha;
        m15573lr(z);
        int i2 = z ? this.f12360di : this.xha;
        return i2 > 0 && i2 != i;
    }

    /* JADX INFO: renamed from: ik */
    public void m15575ik(String str) {
        this.jbs = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m15576lr(String str) {
        String str2 = this.f12363ka.get(Integer.valueOf(this.f12360di));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.f12360di;
        if (i > 0) {
            C3414ik.m15541ri(this.f12367ri, this.jbs, i, str3, str, 1);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15577ri(WebView webView, String str) {
        wjv wjvVar = this.f12367ri;
        if (wjvVar == null || !C2638lr.m9799ri(wjvVar.m14401fr().m14203ik(), str)) {
            return;
        }
        String str2 = this.f12363ka.get(Integer.valueOf(this.f12360di));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C3414ik.m15541ri(this.f12367ri, this.jbs, this.f12360di, str2, str, 2);
    }

    /* JADX INFO: renamed from: ri */
    public void m15578ri(String str) {
        if (m15574ri(false)) {
            C3414ik.m15538ri(this.f12367ri, this.jbs, this.f12360di, str, SystemClock.elapsedRealtime() - this.f12366qt);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15579ri(String str, int i) {
        if (this.f12361fi) {
            i++;
        }
        if (m15574ri(true)) {
            C3414ik.m15539ri(this.f12367ri, this.jbs, this.f12360di, str, i);
            this.f12363ka.put(Integer.valueOf(this.f12360di), str);
            this.f12366qt = SystemClock.elapsedRealtime();
        }
    }
}
