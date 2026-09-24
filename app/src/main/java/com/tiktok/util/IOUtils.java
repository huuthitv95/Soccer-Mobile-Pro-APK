package com.tiktok.util;

import android.os.Parcel;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public final class IOUtils {
    public static void close(Parcel... parcels) {
        if (parcels != null) {
            try {
                for (Parcel parcel : parcels) {
                    try {
                        parcel.recycle();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void close(Closeable... closeables) {
        if (closeables != null) {
            try {
                for (Closeable closeable : closeables) {
                    try {
                        closeable.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void close(HttpURLConnection... conns) {
        if (conns != null) {
            try {
                for (HttpURLConnection httpURLConnection : conns) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
