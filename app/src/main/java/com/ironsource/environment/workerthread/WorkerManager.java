package com.ironsource.environment.workerthread;

import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a */
    List<Callable<T>> f30354a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final ExecutorService f30355b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public WorkerManager(ExecutorService executorService) {
        this.f30355b = executorService;
    }

    public void addCallable(Callable<T> callable) {
        this.f30354a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j, TimeUnit timeUnit) {
        if (this.f30355b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f30354a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f30355b.invokeAll(this.f30354a, j, timeUnit);
            for (int i = 0; i < listInvokeAll.size(); i++) {
                Future<T> future = listInvokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f30354a.get(i)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        C12317m4.m32153d().m32155a(e);
                        arrayList.add(new WorkerResult.Failed(this.f30354a.get(i), e));
                    } catch (CancellationException e2) {
                        C12317m4.m32153d().m32155a(e2);
                        arrayList.add(new WorkerResult.Canceled(this.f30354a.get(i)));
                    } catch (ExecutionException e3) {
                        e = e3;
                        C12317m4.m32153d().m32155a(e);
                        arrayList.add(new WorkerResult.Failed(this.f30354a.get(i), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f30355b.shutdownNow();
        } catch (Exception e4) {
            C12317m4.m32153d().m32155a(e4);
            IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.f30355b.shutdownNow();
        }
    }
}
