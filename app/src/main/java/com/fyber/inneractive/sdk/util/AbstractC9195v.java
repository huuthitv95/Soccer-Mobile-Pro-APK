package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.v */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9195v {
    /* JADX INFO: renamed from: a */
    public static int m22021a(int i, int i2) {
        return Integer.compare(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static int m22022a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static RelativeLayout.LayoutParams m22023a(int i, int i2, int... iArr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        if (iArr.length > 0) {
            for (int i3 : iArr) {
                layoutParams.addRule(i3);
            }
        }
        return layoutParams;
    }

    /* JADX INFO: renamed from: a */
    public static Object m22024a(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: renamed from: a */
    public static String m22025a(Throwable th) {
        String message;
        if (th == null) {
            return null;
        }
        do {
            message = th.getMessage();
            th = th.getCause();
        } while (th != null);
        return message;
    }

    /* JADX INFO: renamed from: a */
    public static String m22026a(JSONObject jSONObject, String str) {
        return (jSONObject == null || jSONObject.isNull(str)) ? "" : jSONObject.optString(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m22027a(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m22028a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m22029a(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException("Unable to copy from or to a null stream.");
        }
        byte[] bArr = new byte[65536];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                IAlog.m21945a("Copied stream content length = %d", Integer.valueOf(i));
                return;
            } else {
                i += i2;
                fileOutputStream.write(bArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22030a(String str) {
        return (TextUtils.isEmpty(str) || str.trim().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m22031a(InputStream inputStream) throws IOException {
        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) C9147f.f21448b.f21449a.poll();
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrArray = (byteBufferAllocateDirect == null || !byteBufferAllocateDirect.hasArray()) ? new byte[8192] : byteBufferAllocateDirect.array();
        while (true) {
            int i = inputStream.read(bArrArray, 0, bArrArray.length);
            if (i == -1) {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m22034b(byteArrayOutputStream);
                C9147f.f21448b.f21449a.offer(byteBufferAllocateDirect);
                return byteArray;
            }
            byteArrayOutputStream.write(bArrArray, 0, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22032b(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    /* JADX INFO: renamed from: b */
    public static StringBuffer m22033b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("stream required");
        }
        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) C9147f.f21448b.f21449a.poll();
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
        }
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArrArray = (byteBufferAllocateDirect == null || !byteBufferAllocateDirect.hasArray()) ? new byte[8192] : byteBufferAllocateDirect.array();
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(bArrArray, 0, i));
            i = inputStream.read(bArrArray);
        }
        C9147f.f21448b.f21449a.offer(byteBufferAllocateDirect);
        return stringBuffer;
    }

    /* JADX INFO: renamed from: b */
    public static void m22034b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
