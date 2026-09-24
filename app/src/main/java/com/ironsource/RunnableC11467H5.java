package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.H5 */
/* JADX INFO: loaded from: classes6.dex */
public class RunnableC11467H5 implements Runnable {

    /* JADX INFO: renamed from: e */
    private static final String f24420e = "Content-Type";

    /* JADX INFO: renamed from: f */
    private static final String f24421f = "application/json";

    /* JADX INFO: renamed from: a */
    private InterfaceC11361B7 f24422a;

    /* JADX INFO: renamed from: b */
    String f24423b;

    /* JADX INFO: renamed from: c */
    String f24424c;

    /* JADX INFO: renamed from: d */
    ArrayList<C12580w5> f24425d;

    public RunnableC11467H5(InterfaceC11361B7 interfaceC11361B7, String str, String str2, ArrayList<C12580w5> arrayList) {
        this.f24422a = interfaceC11361B7;
        this.f24423b = str;
        this.f24424c = str2;
        this.f24425d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC11361B7.a aVarM25417a;
        InterfaceC11361B7.a aVar = new InterfaceC11361B7.a(this.f24425d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C11385Cd c11385CdM28122b = C11800a8.m28122b(this.f24424c, this.f24423b, arrayList);
            aVarM25417a = aVar.m25418a(c11385CdM28122b.m25582a()).m25416a(c11385CdM28122b.f24177a);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e.getLocalizedMessage());
            aVarM25417a = aVar.m25418a(e instanceof C11348Ac).m25417a(e);
        }
        InterfaceC11361B7 interfaceC11361B7 = this.f24422a;
        if (interfaceC11361B7 != null) {
            interfaceC11361B7.mo25415a(aVarM25417a);
        }
    }
}
