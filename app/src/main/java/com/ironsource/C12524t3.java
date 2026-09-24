package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.t3 */
/* JADX INFO: loaded from: classes6.dex */
public class C12524t3 {

    /* JADX INFO: renamed from: com.ironsource.t3$a */
    class a implements WorkerManager.WorkEndedListener<C12542u3> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f32435a;

        a(b bVar) {
            this.f32435a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C12542u3>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C12542u3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C12542u3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC12435q3) ((WorkerResult.Canceled) workerResult).callable).m33157c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC12435q3 callableC12435q3 = (CallableC12435q3) failed.callable;
                    arrayList2.add(new C12542u3(callableC12435q3.m33158d(), callableC12435q3.m33157c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C12524t3.this.m33733a(arrayList2, arrayList, j);
            this.f32435a.mo27432a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f32435a.onFailure(str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t3$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo27432a(List<C12542u3> list, long j, List<String> list2);

        void onFailure(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m33734a(List<CallableC12435q3> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC12435q3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m33733a(List<C12542u3> list, List<String> list2, long j) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C12542u3 c12542u3 : list) {
            if (c12542u3.m33875a() != null) {
                IronLog.INTERNAL.verbose(c12542u3.m33877c() + " - success (" + c12542u3.m33879e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c12542u3.m33877c() + " - failed (" + c12542u3.m33879e() + " millis) error: " + c12542u3.m33876b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
