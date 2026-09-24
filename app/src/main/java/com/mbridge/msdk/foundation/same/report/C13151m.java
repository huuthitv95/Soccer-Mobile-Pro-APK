package com.mbridge.msdk.foundation.same.report;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.tracker.C13814a;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.toolbox.AbstractC13851a;
import com.mbridge.msdk.tracker.network.toolbox.C13857g;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.m */
/* JADX INFO: compiled from: SocketStack.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13151m extends AbstractC13851a {

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f36127b = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    private final byte f36128a;

    public C13151m(byte b) {
        this.f36128a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // com.mbridge.msdk.tracker.network.toolbox.AbstractC13851a
    /* JADX INFO: renamed from: a */
    public C13857g mo37409a(AbstractC13850t<?> abstractC13850t, Map<String, String> map) throws IOException {
        ?? r0;
        ByteBuffer byteBuffer;
        ByteBuffer byteBufferWrap;
        if (C13814a.f39370a) {
            Log.d("TrackManager_Volley", "SocketStack executeRequest " + abstractC13850t.m41248t() + CertificateUtil.DELIMITER + abstractC13850t.m41240k());
        }
        Socket socket = null;
        try {
            Socket socket2 = new Socket(abstractC13850t.m41248t(), abstractC13850t.m41240k());
            try {
                socket2.setSoTimeout(abstractC13850t.m41245q());
                OutputStream outputStream = socket2.getOutputStream();
                try {
                    if (outputStream == null) {
                        throw new IOException("create outputStream exception");
                    }
                    byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                    try {
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byteBufferWrap.order(byteOrder);
                        byteBufferWrap.put(this.f36128a);
                        byte[] bArrM41229b = abstractC13850t.m41229b();
                        if (bArrM41229b == null || bArrM41229b.length == 0) {
                            byteBufferWrap.put((byte) 1);
                        } else {
                            byteBufferWrap.put((byte) 3);
                        }
                        byteBufferWrap.putShort((short) f36127b.getAndIncrement());
                        if (bArrM41229b == null || bArrM41229b.length == 0) {
                            byteBufferWrap.putInt(0);
                            outputStream.write(byteBufferWrap.array());
                        } else {
                            byte[] bArrM37410a = m37410a(bArrM41229b);
                            byteBufferWrap.putInt(bArrM37410a == null ? 0 : bArrM37410a.length);
                            outputStream.write(byteBufferWrap.array());
                            outputStream.write(bArrM37410a);
                        }
                        outputStream.flush();
                        byte[] bArr = new byte[8];
                        socket2.getInputStream().read(bArr, 0, 8);
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                        try {
                            byteBufferWrap2.order(byteOrder);
                            int i = byteBufferWrap2.getInt(4);
                            boolean z = bArr[1] == 2;
                            byte[] bArr2 = new byte[i];
                            new DataInputStream(socket2.getInputStream()).readFully(bArr2);
                            if (z && i == 0) {
                                C13857g c13857g = new C13857g(204, new ArrayList(), i, null);
                                m37406a(outputStream);
                                m37407a(socket2);
                                m37408a(byteBufferWrap);
                                m37408a(byteBufferWrap2);
                                return c13857g;
                            }
                            if (i < 1) {
                                C13857g c13857g2 = new C13857g(500, new ArrayList(), 0, null);
                                m37406a(outputStream);
                                m37407a(socket2);
                                m37408a(byteBufferWrap);
                                m37408a(byteBufferWrap2);
                                return c13857g2;
                            }
                            if (bArr2[0] == 1) {
                                C13857g c13857g3 = new C13857g(200, new ArrayList(), i, null);
                                m37406a(outputStream);
                                m37407a(socket2);
                                m37408a(byteBufferWrap);
                                m37408a(byteBufferWrap2);
                                return c13857g3;
                            }
                            C13857g c13857g4 = new C13857g(500, new ArrayList(), 0, null);
                            m37406a(outputStream);
                            m37407a(socket2);
                            m37408a(byteBufferWrap);
                            m37408a(byteBufferWrap2);
                            return c13857g4;
                        } catch (Throwable th) {
                            byteBuffer = byteBufferWrap2;
                            th = th;
                            socket = outputStream;
                            r0 = socket;
                            socket = socket2;
                            try {
                                throw new IOException(th);
                            } catch (Throwable th2) {
                                m37406a((OutputStream) r0);
                                m37407a(socket);
                                m37408a(byteBufferWrap);
                                m37408a(byteBuffer);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteBuffer = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    byteBufferWrap = null;
                    socket = outputStream;
                    byteBuffer = null;
                }
            } catch (Throwable th5) {
                th = th5;
                byteBuffer = null;
                byteBufferWrap = null;
            }
        } catch (Throwable th6) {
            th = th6;
            r0 = 0;
            byteBuffer = null;
            byteBufferWrap = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m37410a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    private static void m37406a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m37407a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37408a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
