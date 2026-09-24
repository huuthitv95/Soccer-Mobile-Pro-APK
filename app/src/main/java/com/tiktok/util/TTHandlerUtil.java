package com.tiktok.util;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
public class TTHandlerUtil {
    private static final TTHandlerUtil instance = new TTHandlerUtil();
    private Handler sHandler;

    private TTHandlerUtil() {
        this.sHandler = null;
        try {
            HandlerThread handlerThread = new HandlerThread("tiktok");
            handlerThread.start();
            this.sHandler = new Handler(handlerThread.getLooper());
        } catch (Throwable unused) {
        }
    }

    public static TTHandlerUtil getInstance() {
        return instance;
    }

    public void post(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    public void postDelayed(Runnable runnable, long delayMillis) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.postDelayed(runnable, delayMillis);
            } catch (Throwable unused) {
            }
        }
    }

    public void removeCallbacks(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(runnable);
            } catch (Throwable unused) {
            }
        }
    }
}
