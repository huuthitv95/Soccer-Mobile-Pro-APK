package com.mbridge.msdk.foundation.same.task;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a */
/* JADX INFO: compiled from: CommonTask.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC13163a implements Runnable {

    /* JADX INFO: renamed from: id */
    public static long f36189id;
    public a mListener;
    public b mState = b.READY;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a$a */
    /* JADX INFO: compiled from: CommonTask.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo34752a(b bVar);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a$b */
    /* JADX INFO: compiled from: CommonTask.java */
    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public AbstractRunnableC13163a() {
        f36189id++;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        a aVar = this.mListener;
        if (aVar != null) {
            aVar.mo34752a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return f36189id;
    }

    public b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(a aVar) {
        this.mListener = aVar;
    }

    public final void setPause(boolean z) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z) {
            setState(bVar2);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z);
    }
}
