package com.bytedance.sdk.openadsdk.p244lr;

import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3473ri {

    /* JADX INFO: renamed from: ri */
    protected boolean f12547ri = false;

    /* JADX INFO: renamed from: lr */
    private final ExecutorService f12546lr = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.lr.ri$ri */
    private class ri implements Callable<Void> {

        /* JADX INFO: renamed from: lr */
        private final File f12548lr;

        private ri(File file) {
            this.f12548lr = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            AbstractC3473ri.this.m15730lr(this.f12548lr);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m15730lr(File file) throws IOException {
        if (!this.f12547ri) {
            try {
                xha.m10329lr(file);
            } catch (Throwable unused) {
            }
            mo12657ri(xha.m10334ri(file.getParentFile()));
        } else {
            List<File> listM10334ri = xha.m10334ri(file);
            listM10334ri.toString();
            mo12657ri(listM10334ri);
        }
    }

    /* JADX INFO: renamed from: lr */
    long m15732lr(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    /* JADX INFO: renamed from: ri */
    public void m15733ri(File file) throws IOException {
        this.f12546lr.submit(new ri(file));
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo12657ri(List<File> list);

    /* JADX INFO: renamed from: ri */
    protected abstract boolean mo15728ri(long j, int i);

    /* JADX INFO: renamed from: ri */
    protected abstract boolean mo15729ri(File file, long j, int i);
}
