package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.q3 */
/* JADX INFO: loaded from: classes6.dex */
public class CallableC12435q3 implements Callable<C12542u3> {

    /* JADX INFO: renamed from: a */
    private final int f31769a;

    /* JADX INFO: renamed from: b */
    private final String f31770b;

    /* JADX INFO: renamed from: c */
    private final AdData f31771c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12471s3 f31772d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12453r3 f31773e;

    /* JADX INFO: renamed from: f */
    private final NetworkSettings f31774f;

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12189f5 f31775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ BlockingQueue f31776b;

        a(C12189f5 c12189f5, BlockingQueue blockingQueue) {
            this.f31775a = c12189f5;
            this.f31776b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f31776b.add(new C12542u3(CallableC12435q3.this.m33158d(), CallableC12435q3.this.m33157c(), null, C12189f5.m31432a(this.f31775a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f31776b.add(new C12542u3(CallableC12435q3.this.m33158d(), CallableC12435q3.this.m33157c(), map, C12189f5.m31432a(this.f31775a), null));
        }
    }

    public CallableC12435q3(int i, String str, AdData adData, InterfaceC12471s3 interfaceC12471s3, InterfaceC12453r3 interfaceC12453r3, NetworkSettings networkSettings) {
        this.f31769a = i;
        this.f31770b = str;
        this.f31771c = adData;
        this.f31772d = interfaceC12471s3;
        this.f31773e = interfaceC12453r3;
        this.f31774f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C12542u3 call() throws Exception {
        C12189f5 c12189f5 = new C12189f5();
        IronLog.INTERNAL.verbose(m33157c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            m33156b().collectBiddingData(this.f31771c, ContextProvider.getInstance().getActiveContext(), new a(c12189f5, arrayBlockingQueue));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC12453r3 interfaceC12453r3 = this.f31773e;
            if (interfaceC12453r3 != null) {
                interfaceC12453r3.mo27429a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C12317m4.m32153d().m32155a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC12453r3 interfaceC12453r4 = this.f31773e;
            if (interfaceC12453r4 != null) {
                interfaceC12453r4.mo27429a(str2);
            }
        }
        InterfaceC12453r3 interfaceC12453r5 = this.f31773e;
        if (interfaceC12453r5 != null) {
            interfaceC12453r5.mo27428a(this.f31774f);
        }
        return (C12542u3) arrayBlockingQueue.take();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12471s3 m33156b() {
        return this.f31772d;
    }

    /* JADX INFO: renamed from: c */
    public String m33157c() {
        return this.f31770b;
    }

    /* JADX INFO: renamed from: d */
    public int m33158d() {
        return this.f31769a;
    }
}
