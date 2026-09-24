package com.mbridge.msdk.foundation.download.download;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.same.task.C13164b;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadTask {
    private C13164b mLoader;

    private static class DownloadTaskHolder {
        public static DownloadTask instance = new DownloadTask();

        private DownloadTaskHolder() {
        }
    }

    public static DownloadTask getInstance() {
        return DownloadTaskHolder.instance;
    }

    private void init() {
        if (C13008c.m36588n().m36542d() != null) {
            this.mLoader = new C13164b(C13008c.m36588n().m36542d());
        }
    }

    public void runTask(AbstractRunnableC13163a abstractRunnableC13163a) {
        C13164b c13164b = this.mLoader;
        if (c13164b != null) {
            c13164b.m37535a(abstractRunnableC13163a);
        }
    }

    private DownloadTask() {
        init();
    }
}
