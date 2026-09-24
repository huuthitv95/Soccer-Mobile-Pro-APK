package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.e1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1537e1 extends AbstractViewOnClickListenerC1784u2 {

    /* JADX INFO: renamed from: e */
    private C1748l f1400e;

    /* JADX INFO: renamed from: f */
    private List f1401f;

    /* JADX INFO: renamed from: g */
    private final AtomicBoolean f1402g;

    /* JADX INFO: renamed from: h */
    private List f1403h;

    /* JADX INFO: renamed from: com.applovin.impl.e1$a */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public C1537e1(Context context) {
        super(context);
        this.f1402g = new AtomicBoolean();
        this.f1403h = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private List m2454a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1695q1((C1705r1) it.next(), this.f3399a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m2455a(List list, C1748l c1748l) {
        Activity activityM4861w0;
        this.f1400e = c1748l;
        this.f1401f = list;
        if (!(this.f3399a instanceof Activity) && (activityM4861w0 = c1748l.m4861w0()) != null) {
            this.f3399a = activityM4861w0;
        }
        if (list != null && this.f1402g.compareAndSet(false, true)) {
            this.f1403h = m2454a(this.f1401f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: b */
    protected int mo2125b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: c */
    protected List mo2126c(int i) {
        return this.f1403h;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: d */
    protected int mo2127d(int i) {
        return this.f1403h.size();
    }

    /* JADX INFO: renamed from: d */
    public List m2456d() {
        return this.f1401f;
    }

    /* JADX INFO: renamed from: e */
    public C1748l m2457e() {
        return this.f1400e;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: e */
    protected C1775t2 mo2128e(int i) {
        return new C1813x4("RECENT ADS");
    }

    /* JADX INFO: renamed from: f */
    public boolean m2458f() {
        return this.f1403h.size() == 0;
    }

    /* JADX INFO: renamed from: g */
    public void m2459g() {
        this.f1402g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f1402g.get() + "}";
    }
}
