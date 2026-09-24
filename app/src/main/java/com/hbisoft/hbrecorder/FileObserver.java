package com.hbisoft.hbrecorder;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
class FileObserver extends android.os.FileObserver {
    private final int mMask;
    private List<SingleFileObserver> mObservers;
    private final String mPath;

    /* JADX INFO: renamed from: ml */
    private final MyListener f22667ml;

    FileObserver(String str, MyListener myListener) {
        super(str, 4095);
        this.mPath = str;
        this.mMask = 4095;
        this.f22667ml = myListener;
    }

    @Override // android.os.FileObserver
    public void startWatching() {
        if (this.mObservers != null) {
            return;
        }
        this.mObservers = new ArrayList();
        Stack stack = new Stack();
        stack.push(this.mPath);
        while (!stack.isEmpty()) {
            String str = (String) stack.pop();
            this.mObservers.add(new SingleFileObserver(str, this.mMask));
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !file.getName().equals(".") && !file.getName().equals("..")) {
                        stack.push(file.getPath());
                    }
                }
            }
        }
        Iterator<SingleFileObserver> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().startWatching();
        }
    }

    @Override // android.os.FileObserver
    public void stopWatching() {
        List<SingleFileObserver> list = this.mObservers;
        if (list == null) {
            return;
        }
        Iterator<SingleFileObserver> it = list.iterator();
        while (it.hasNext()) {
            it.next().stopWatching();
        }
        this.mObservers.clear();
        this.mObservers = null;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i == 8) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.hbisoft.hbrecorder.FileObserver.1
                @Override // java.lang.Runnable
                public void run() {
                    FileObserver.this.f22667ml.onCompleteCallback();
                }
            });
        }
    }

    class SingleFileObserver extends android.os.FileObserver {
        final String mPath;

        SingleFileObserver(String str, int i) {
            super(str, i);
            this.mPath = str;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            FileObserver.this.onEvent(i, this.mPath + RemoteSettings.FORWARD_SLASH_STRING + str);
        }
    }
}
