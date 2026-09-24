package com.hbisoft.hbrecorder;

/* JADX INFO: loaded from: classes6.dex */
public interface HBRecorderListener {
    void HBRecorderOnComplete();

    void HBRecorderOnError(int i, String str);

    void HBRecorderOnPause();

    void HBRecorderOnResume();

    void HBRecorderOnStart();
}
