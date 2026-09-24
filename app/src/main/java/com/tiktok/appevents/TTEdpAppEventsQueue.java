package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
class TTEdpAppEventsQueue {
    private static final String TAG = "TTEdpAppEventsQueue";
    private static List<TTAppEvent> memory = new CopyOnWriteArrayList();

    private TTEdpAppEventsQueue() {
    }

    public static synchronized void addEvent(TTAppEvent event) {
        TTUtil.checkThread(TAG);
        memory.add(event);
        notifyChange();
    }

    public static synchronized void clearAll() {
        try {
            TTUtil.checkThread(TAG);
            memory = new CopyOnWriteArrayList();
            notifyChange();
        } catch (Throwable unused) {
        }
    }

    public static synchronized List<TTAppEvent> exportAllEvents() {
        List<TTAppEvent> list;
        list = memory;
        memory = new CopyOnWriteArrayList();
        notifyChange();
        return list;
    }

    private static void notifyChange() {
        if (TikTokBusinessSdk.memoryListener != null) {
            TikTokBusinessSdk.memoryListener.onMemoryChange(memory.size());
        }
        if (TikTokBusinessSdk.nextTimeFlushListener != null) {
            TikTokBusinessSdk.nextTimeFlushListener.thresholdLeft(100, Math.max(100 - size(), 0));
        }
    }

    public static synchronized int size() {
        return memory.size();
    }
}
